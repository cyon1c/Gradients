package io.cyonic.gradients.models

sealed class Behavior(
    var behaviorName: String = "unknown",
    var min: Int = -1,
    var max: Int = 1)


object Mood : Behavior("Mood", -15,15)
object Medication : Behavior("Medication", 0,1)
object SleepTime : Behavior("Sleep Time", 0,15)
object SleepQuality : Behavior("Sleep Quality", -15,15)