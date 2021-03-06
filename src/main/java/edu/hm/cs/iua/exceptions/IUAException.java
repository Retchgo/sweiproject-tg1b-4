package edu.hm.cs.iua.exceptions;

public abstract class IUAException extends Exception {

    public IUAException() {
        super();
    }

    public IUAException(String message) {
        super(message);
    }

    public IUAException(String message, Throwable cause) {
        super(message, cause);
    }

}