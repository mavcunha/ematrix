package ematrix;

import java.util.Collections;
import java.util.List;

public class Worker {

    private final List<Worker> workers;

    public Worker(List<Worker> workers) {
        this.workers = workers;
    }

    public Worker() {
        this.workers = Collections.emptyList();
    }

    public List<Worker> subordinates() {
        return this.workers;
    }
}
