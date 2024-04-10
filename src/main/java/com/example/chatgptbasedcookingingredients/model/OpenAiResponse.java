package com.example.chatgptbasedcookingingredients.model;

import lombok.Data;

@Data
public record OpenAiResponse(
        String id,
        OpenAiUsage usage,
        List<OpenAiChoice> choices
) {
}
