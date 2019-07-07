package io.cyonic.gradients.models

class Mood : Behavior<Int>("Mood", Array(31){i -> i -15})
class Medication : Behavior<Boolean>("Medication", arrayOf(false, true))
class SleepTime : Behavior<Int>("Sleep Time", Array(15){i -> i})
class SleepQuality : Behavior<Int>("Sleep Quality", Array(31){i -> i - 15})