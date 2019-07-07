package io.cyonic.gradients.models

open class Entry<T>(val timeStamp: Number, val entryType: Behavior<T>, val value: T? = null)