package com.damo.ai
import org.springframework.ai.chat.client.ChatClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

data class Question(val question: String)
data class Answer(val answer: String)

@RestController
class PromptController(chatClientBuilder: ChatClient.Builder) {
    private val chatClient = chatClientBuilder.build()

    @PostMapping("/ask")
    fun ask(@RequestBody question: Question) = Answer (
        chatClient
            .prompt()
            .user(question.question)
            .call()
            .content()
    )
}
