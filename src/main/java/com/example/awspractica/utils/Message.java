package com.example.awspractica.utils;

import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Message {
    private String message;
    private boolean error;
    private Object data;
}
