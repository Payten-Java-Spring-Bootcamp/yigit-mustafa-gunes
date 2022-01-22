package com.mycompany.cinemaproject.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T>{

    public ErrorDataResult(T data,String message) {
        super(data, true, message);
    }

    public ErrorDataResult(T data, boolean success) {
        super(data, success);
    }
    public ErrorDataResult(String message) {
        super(null,true, message);
    }
    public ErrorDataResult() {
        super(null,true);
    }
}
