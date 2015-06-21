package ematrix;

import org.junit.Test;

public class TaskTest {

    @Test
    public void shouldHaveAnImportanceAndUrgency() throws Exception {
        new Task(Importance.HIGH, Urgency.HIGH);
    }

    @Test(expected = NullPointerException.class)
    public void shouldNotAcceptNullImportance() throws Exception {
        new Task(null, Urgency.HIGH);
    }

    @Test(expected = NullPointerException.class)
    public void shouldNotAcceptNullUrgency() throws Exception {
        new Task(Importance.HIGH, null);
    }
}