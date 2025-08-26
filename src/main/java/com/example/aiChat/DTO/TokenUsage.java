package com.example.aiChat.DTO;

import lombok.Data;

@Data
public class TokenUsage {
    private int inputTokenCount;
    private int outputTokenCount;
    private int totalTokenCount;
}
