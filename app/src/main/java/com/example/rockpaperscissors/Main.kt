package com.example.rockpaperscissors

fun main() {

    var computerChoice = ""
    println("Enter your choice: Rock, Paper or Scissors")
    var userChoice = readln()

    while (
        userChoice != "Rock" &&
        userChoice != "Paper" &&
        userChoice != "Scissors"
    ) {
        println("Incorrect choice. Please enter Rock, Paper or Scissors")
        userChoice = readln()
    }

//    val randomNumber = (1..3).random()

    when((1..3).random()) {
        1 -> {
            computerChoice == "Rock"
        }
        2 -> {
            computerChoice == "Paper"
        }
        3 -> {
            computerChoice == "Scissors"
        }
    }
    println(computerChoice)

}