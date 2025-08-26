package com.example.aiChat.aiservice;

import dev.langchain4j.model.output.Response;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;
import reactor.core.publisher.Flux;

@AiService(
    wiringMode = AiServiceWiringMode.EXPLICIT,
        chatModel = "chatLanguageModel",
        streamingChatModel = "streamingChatLanguageModel"
)
public interface ConsultantService {

    @SystemMessage("You are a weather expert assistant.  Ask user their location, city or zip code to provide weather details")
    String chat(String message);
    Flux<String> chatStream(String message);
}
