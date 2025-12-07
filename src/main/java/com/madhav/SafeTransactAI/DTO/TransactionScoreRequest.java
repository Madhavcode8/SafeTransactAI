package com.madhav.SafeTransactAI.DTO;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class TransactionScoreRequest {

    private String transactionId;
    private String userId;
    private String merchantId;
    private Double amount;
    private String currency;
    private String paymentMethod;
    private String bank;
    private String channel;
    private LocalDateTime timestamp;
    private Integer attemptNumber;
}
