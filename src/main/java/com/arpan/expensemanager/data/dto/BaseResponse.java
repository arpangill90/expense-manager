package com.arpan.expensemanager.data.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Builder
public class BaseResponse<T> {
    private List<T> data;
    private String status;
    private String message;
    private LocalDateTime timeStamp;
    private int itemCount;


    public BaseResponse(List<T> data, String status, String message) {
        if (Objects.isNull(data)) {
            data = new ArrayList<T>();
        }
        this.data = data;
        this.itemCount = data.size();
        this.timeStamp = LocalDateTime.now();
        this.status = status;
        this.message = message;
    }

    public BaseResponse(T data, String status, String message) {
        this.data = Collections.singletonList(data);
        this.itemCount = 1;
        this.timeStamp = LocalDateTime.now();
        this.status = status;
        this.message = message;
    }
}
