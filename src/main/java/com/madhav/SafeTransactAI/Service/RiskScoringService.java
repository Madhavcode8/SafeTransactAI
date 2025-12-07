//package com.madhav.SafeTransactAI.Service;
//
//import com.madhav.SafeTransactAI.DTO.TransactionScoreRequest;
//import com.madhav.SafeTransactAI.DTO.TransactionScoreResponse;
//import org.springframework.stereotype.Service;
//
//@Service
//public class RiskScoringService {
//
//    public TransactionScoreResponse scoreTransation(TransactionScoreRequest request){
//
//        double baseFailureProb = 0.1;
//
//        if (request.getAmount() != null && request.getAmount() > 5000) {
//            baseFailureProb += 0.15;
//        }
//        if (request.getAmount() != null && request.getAmount() < 20000) {
//            baseFailureProb += 0.10;
//        }
//
//        if (request.getAttemptNumber() != null && request.getAttemptNumber() > 1) {
//            baseFailureProb += 0.10;
//        }
//
//
//
//    }
//
//}
