package aoc15

class Sob (
    var name: String,
    var speed: Int,
    var moveTime: Int,
    var restTime: Int,
        ){

    var finalDistance: Int = 0

    fun running(seconds: Int): Int {
        var output = 0
        var runningTime = moveTime
        var restingTime = restTime


        for(i in 0 until seconds) {
            if(runningTime > 0){
                output += speed
                runningTime--
            }
            if(runningTime == 0){
                restingTime--
                if(restingTime == 0){
                    runningTime = moveTime
                    restingTime = restTime
                }
            }
        }
        return output
    }
}