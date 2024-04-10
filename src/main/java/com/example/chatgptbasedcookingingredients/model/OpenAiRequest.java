package com.example.chatgptbasedcookingingredients.model;

import lombok.Data;

import java.util.List;

@Data
public record OpenAiRequest(
        String model,
        List<OpenAiMessage> messages
        //double temperature
) {
}
