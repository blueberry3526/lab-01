package com.example.petshop

class Sad (emotion: String): Mood(emotion) {
    override fun petMood(): String {
        return "sad"
    }

}