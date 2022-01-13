package aoc15

fun main() {

    val sobs = mutableListOf<Sob>()

    val sob1 = Sob()
    sob1.name = "Rudolph"
    sob1.speed = 22
    sob1.moveTime = 8
    sob1.restTime = 165

    val sob2 = Sob()
    sob2.name = "Cupid"
    sob2.speed = 8
    sob2.moveTime = 17
    sob2.restTime = 114

    val sob3 = Sob()
    sob3.name = "Cupid"
    sob3.speed = 18
    sob3.moveTime = 6
    sob3.restTime = 103

    val sob4 = Sob()
    sob4.name = "Cupid"
    sob4.speed = 25
    sob4.moveTime = 6
    sob4.restTime = 145

    val sob5 = Sob()
    sob5.name = "Dasher"
    sob5.speed = 11
    sob5.moveTime = 12
    sob5.restTime = 125

    val sob6 = Sob()
    sob6.name = "Comet"
    sob6.speed = 21
    sob6.moveTime = 6
    sob6.restTime = 121

    val sob7 = Sob()
    sob7.name = "Blitzen"
    sob7.speed = 18
    sob7.moveTime = 3
    sob7.restTime = 50

    val sob8 = Sob()
    sob8.name = "Vixen"
    sob8.speed = 20
    sob8.moveTime = 4
    sob8.restTime = 75

    val sob9 = Sob()
    sob9.name = "Dancer"
    sob9.speed = 7
    sob9.moveTime = 20
    sob9.restTime = 119

    sobs.add(sob1)
    sobs.add(sob2)
    sobs.add(sob3)
    sobs.add(sob4)
    sobs.add(sob5)
    sobs.add(sob6)
    sobs.add(sob7)
    sobs.add(sob8)
    sobs.add(sob9)

    println(sob2.speedPerTime(2503))
    sobs.forEach { it.finalDistance = it.speedPerTime(2503) }
    println(sobs.maxOf { it.finalDistance })
}