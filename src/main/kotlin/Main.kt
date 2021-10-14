fun printPlayerInfo(auraColor:String,isBlessed:Boolean,name:String,healthStatus:String){
    println("The name of the player is:$name  \n The health Status:$healthStatus " +
            " \n Aura:$auraColor, " + "Blessed:${if (isBlessed) "YES" else "NO"}")

}

fun main(args: Array<String>) {
    val name = "karma"
    var healthPoints = 100
    val isBlessed = true
    val isImmortal = false

    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "The Color is not determined"
    }

    val healthStatus: String = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "Damaged and recovering faster"
        } else {
            "Affected"
        }
        in 15..74 -> "High damage"
        else -> "Bad condition"
    }
    printPlayerInfo(auraColor,isBlessed,name,healthStatus)
}
