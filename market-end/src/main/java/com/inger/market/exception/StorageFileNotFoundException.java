package com.inger.market.exception;


public class StorageFileNotFoundException extends StorageException {
    public StorageFileNotFoundException(Integer status, String message) {
        super(status, message);
    }

    public StorageFileNotFoundException(Integer status, String message, Throwable cause) {
        super(status, message, cause);
    }
}
