package org.bank.mapper;

import java.time.LocalDateTime;
import org.bank.domain.Balance;
import org.bank.dto.BalanceRequestDto;
import org.bank.common.Util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BalanceMapper {
    public static Balance toModel(BalanceRequestDto dto) {
        return Balance.builder()
                    .balanceId(Util.createTracking())
                    .userId(Util.createTracking())
                    .quantiy(dto.getQuantiy())
                    .updatedAt(LocalDateTime.now())
                    .build();
    }
}
