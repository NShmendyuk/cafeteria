package ru.sevenseven.cafeteria.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class OrderDto implements Serializable {
    private Timestamp timeon;
}
