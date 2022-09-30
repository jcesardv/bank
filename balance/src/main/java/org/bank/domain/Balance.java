package org.bank.domain;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Balance {
    private String balanceId;
    private String userId;
    private Double quantiy;
    private LocalDateTime updatedAt;
}
