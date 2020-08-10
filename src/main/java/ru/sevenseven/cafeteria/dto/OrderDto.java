package ru.sevenseven.cafeteria.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class OrderDto implements Serializable {
    private LocalDateTime timeOn;
}
