package com.madhav.SafeTransactAI.DTO;

import lombok.Data;

@Data
public class TransactionScoreResponse {

    private String transactionId;
    private double riskScore;
    private double failureProbability;
    private double expectedRefundTimeHours;
    private String RecommendedAction;

}
