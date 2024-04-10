package com.example.chatgptbasedcookingingredients.model;

import lombok.Data;

@Data
public record OpenAiMessage(
        String role,
        String content
) {
}
