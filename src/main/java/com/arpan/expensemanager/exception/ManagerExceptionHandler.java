package com.arpan.expensemanager.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class ManagerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex, WebRequest request)
            throws Exception {
        log.error(ex.getMessage());
        return new ResponseEntity<>(new ErrorResponse(null,HttpStatus.INTERNAL_SERVER_ERROR.toString(),
                "Error processing Request", LocalDateTime.now()),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
