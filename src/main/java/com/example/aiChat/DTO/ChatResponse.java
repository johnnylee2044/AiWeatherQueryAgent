package com.example.aiChat.DTO;


import lombok.Data;

@Data
public class ChatResponse {
    private String responseId;
    private String context;

    private TokenUsage tokenUsage;
}
