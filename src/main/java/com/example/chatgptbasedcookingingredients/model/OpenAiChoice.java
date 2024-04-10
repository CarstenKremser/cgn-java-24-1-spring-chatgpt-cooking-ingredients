package com.example.chatgptbasedcookingingredients.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public record OpenAiChoice(
        OpenAiMessage message,
        @JsonProperty("finish_reason")
        String finishReason
) {
}
