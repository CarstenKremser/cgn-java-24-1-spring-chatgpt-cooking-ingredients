package com.example.chatgptbasedcookingingredients.model;

import java.util.List;

public record OpenAiResponse(
        String id,
        OpenAiUsage usage,
        List<OpenAiChoice> choices
) {
}
