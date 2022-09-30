package org.bank.dto;

import lombok.Data;

@Data
public class BalanceRequestDto {
    private String userId;
    private Double quantiy;
}
