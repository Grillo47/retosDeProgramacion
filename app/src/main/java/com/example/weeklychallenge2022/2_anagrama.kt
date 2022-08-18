package com.example.weeklychallenge2022

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

fun main(){

    println(isAnagram(wordOne = "Roma", wordTwo = "Amor"))
    println(isAnagram(wordOne = "Roma", wordTwo = "Roma"))
    println(isAnagram(wordOne = "Roma", wordTwo = "Mora"))
    println(isAnagram(wordOne = "Roma", wordTwo = "Remo"))

}

fun isAnagram (wordOne: String, wordTwo:String) :Boolean {

    if (wordOne.lowercase() == wordTwo.toLowerCase()){
        return false
    }
    return wordOne.toLowerCase().toCharArray().sortedArray().contentEquals(
        wordTwo.toLowerCase().toCharArray().sortedArray())
}