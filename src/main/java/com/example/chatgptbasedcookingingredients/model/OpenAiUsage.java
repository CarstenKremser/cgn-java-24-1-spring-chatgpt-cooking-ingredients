package com.example.chatgptbasedcookingingredients.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public record OpenAiUsage(
        @JsonProperty("prompt_tokens")
        int promptTokens,
        @JsonProperty("completion_tokens")
        int completionTokens,
        @JsonProperty("total_tokens")
        int totalTokens
) {
}