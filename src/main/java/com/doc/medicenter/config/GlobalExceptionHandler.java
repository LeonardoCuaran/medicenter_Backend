package com.doc.medicenter.config;

import com.doc.medicenter.exceptions.DuplicateEntryException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    @ResponseBody
    public DuplicateEntryException handleSQLIntegrityConstraintViolationException(
            SQLIntegrityConstraintViolationException ex
    ) {
        return new DuplicateEntryException(
                SQLIntegrityConstraintViolationException.class.getName(),
                ex.getMessage(),
                HttpStatus.CONFLICT.value()
        );
    }
}
