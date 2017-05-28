package com.wipro.test.exception;

/**
 * DuplicateRecordException thrown when a duplicate record occurred
 *
 * @author Abstract Factory
 * @version 1.0
 * @Copyright (c) SunilOS
 */
public class DuplicateRecordException extends Exception {

    /**
     * @param msg
     *            error message
     */
    public DuplicateRecordException(String msg) {
        super(msg);
    }

}