package com.example.aiChat.controller;

import dev.langchain4j.model.chat.request.ChatRequest;
import dev.langchain4j.model.output.Response;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import com.example.aiChat.aiservice.ConsultantService;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ChatController{
    @Autowired
    private ConsultantService consultantService;

    @RequestMapping("/chat")
    public String chat(@RequestParam  String message)
    {

        String result=consultantService.chat(message);
        System.out.println("this is response from llm"+result.toString());
        return result;
    }
    @RequestMapping("/chatStream")
    public Flux<String> chatStream(@RequestParam String message)
    {

        Flux<String> result=consultantService.chatStream(message);
        return result;
    }


    //   @RequestMapping("/chat")
    // public String chat(String message)
    // {
    //     String result=consultantService.chat(message);
    //     return result;
    // }
}