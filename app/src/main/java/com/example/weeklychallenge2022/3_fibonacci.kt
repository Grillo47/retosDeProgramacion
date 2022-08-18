package com.example.weeklychallenge2022

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

fun main(){

    var a : Long = 0
    var b : Long = 1
    var c: Long

    (1..50).forEach(){

       println(a)
       c = a + b
       a = b
       b = c
    }

}
