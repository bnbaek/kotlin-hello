package net.openu

/**
 * Created by iopenu@gmail.com on 2020/03/31
 * Github : https://github.com/bnbaek
 */
fun main(args: Array<String>) {
  //함수
  println(double(10));
  println(double1(10));
  printlnDouble(10)

  //변수
  val one: Int = 1
  val one1 = 1
//  one = 100; 컴파일 에러
  var two = 2
  two = 100

  //String Interpolation
  val hello = "hello"
  println("${hello} world")
  println("$hello world")

  val a = 10
  val b = 10

  println("a*b = ${a * b}")


  //Elvis Operator
  println(message("hello world kotlin"))
  println(message("hello world"))
  println(message(null))

  //자동 캐스팅
  println(getStringLength("100"))
  println(getStringLength(100))

  //for 문
  val numbers = listOf(1, 2, 3, 4, 5, 6)

  for (number in numbers) {
    print("$number ")
  }
  println()

  for (i in numbers.indices) {
    print("${numbers[i]} ")
  }

  println()


  val mutableList = mutableListOf(0, 1, 2, 3, 4, 5)
  mutableList
    .filter { number -> number > 3 }
    .map { number -> number * 2 }
    .forEach { number -> print("$number ") }

  mutableList
    .filter { it > 3 }
    .map { it * 2 }
    .forEach { print("$it ") }
}


fun getStringLength(obj: Any): Int {
  if (obj is String) {
    return obj.length
  }
  return 0
}

fun message(message: String?): String? {
  if (message != null && message.length < 15) {
    return message
  }
  return null
}

fun whenCase(obj: Any) {
  when (obj) {
    1 -> println("One")
    "2" -> println("Two")
    is Long -> println("is long type")
    else -> println("Unknown")
  }
}


//
//fun message(message: String?): String? {
//  if(message.length<15){
//    return message
//  }
//  return null //컴파일 에
//}


fun printlnDouble(number: Int): Unit {
  println(number * 2)
}

fun double(number: Int): Int {
  return number * 2
}

fun double1(number: Int) = number * 2
