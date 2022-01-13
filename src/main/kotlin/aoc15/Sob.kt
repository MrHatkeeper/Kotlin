package aoc15

class Sob {
    lateinit var name: String
    var speed: Int = 0
    var moveTime: Int = 0
    var restTime: Int = 0
    var finalDistance: Int = 0

    fun speedPerTime(seconds: Int): Int {
        var output = 0
        var resting = false
        var restedTime = 0
        var elapsedTime = moveTime
        for (i in 0 until seconds) {
            if (!resting) {
                output += speed
                elapsedTime--
                if (elapsedTime == 0) {
                    resting = true
                }
            }
            if (resting) {
                if (restedTime == restTime) {
                    elapsedTime = moveTime
                    resting = false
                    restedTime = 0
                }
                restedTime++
            }
        }
        return output
    }
}