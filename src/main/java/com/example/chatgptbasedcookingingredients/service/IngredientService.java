package com.example.chatgptbasedcookingingredients.service;

import com.example.chatgptbasedcookingingredients.model.OpenAiMessage;
import com.example.chatgptbasedcookingingredients.model.OpenAiRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class IngredientService {

    private final RestClient openAiClient;

    String getIngredientInfo(String ingredientName) {
        OpenAiRequest request = new OpenAiRequest(
                "gpt-3.5-turbo",
                List.of(new OpenAiMessage(
                        "user",
                        createQuestion(ingredientName)))
        );
        return null;
    }

    private String createQuestion(String ingredientName) {
        return "";
    }
}
