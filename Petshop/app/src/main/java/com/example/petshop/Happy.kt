package com.example.petshop

class Happy (emotion: String): Mood(emotion){
    override fun petMood(): String {
        return "happy"
    }
}