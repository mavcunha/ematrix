package ematrix;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.junit.Test;

public class WorkerTest {

    @Test
    public void workerCanHaveOneOrMoreWorkers() throws Exception {
        new Worker(Collections.singletonList(new Worker()));
    }

    @Test
    public void workerExposesItsWorkers() throws Exception {
        Worker worker = new Worker(Collections.singletonList(new Worker()));
        assertThat(worker.subordinates()).hasSize(1);
    }

    @Test
    public void workerWithNoWorkersHasEmptySubordinates() throws Exception {
        assertThat(new Worker().subordinates()).isEmpty();
    }
}