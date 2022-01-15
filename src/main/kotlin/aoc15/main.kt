package aoc15

fun main() {
    
    val sobs = mutableListOf<Sob>()

    sobs.add(Sob(name = "Rudolph", speed = 22, moveTime = 8, restTime = 165))
    sobs.add(Sob(name = "Cupid ", speed = 8 , moveTime = 17 , restTime = 114))
    sobs.add(Sob(name = "Prancer ", speed = 18 , moveTime = 6, restTime = 103))
    sobs.add(Sob(name = "Donner", speed = 25, moveTime = 6, restTime = 145))
    sobs.add(Sob(name = "Dasher", speed = 11, moveTime = 12, restTime = 125))
    sobs.add(Sob(name = "Comet", speed = 21, moveTime = 6, restTime = 121))
    sobs.add(Sob(name = "Blitzen", speed = 18, moveTime = 3, restTime = 50))
    sobs.add(Sob(name = "Vixen", speed = 20, moveTime = 4, restTime = 75))
    sobs.add(Sob(name = "Dancer", speed = 7, moveTime = 20, restTime = 119))

    sobs.forEach { it.finalDistance = it.running(2503) }
    sobs.forEach { println(it.finalDistance)}
    println(sobs.maxOf { it.finalDistance })
}