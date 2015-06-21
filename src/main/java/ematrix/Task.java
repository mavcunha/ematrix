package ematrix;

import java.util.Optional;

public class Task {

    private final Importance importance;
    private final Urgency urgency;

    public Task(Importance importance, Urgency urgency) {
        this.importance = Optional.of(importance).get();
        this.urgency = Optional.of(urgency).get();
    }
}
