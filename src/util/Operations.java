package util;

public enum Operations {
    PLUS("+"),
    MINUS("-"),
    MULTI("*"),
    DIVIDE("/");
    private final String operation;

    Operations(String operation) {
        this.operation = operation;
    }
    public String operation(){return operation;}
}
