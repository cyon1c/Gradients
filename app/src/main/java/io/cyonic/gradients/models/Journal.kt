package io.cyonic.gradients.models

import androidx.room.Entity

@Entity
open class Journal(
    val name: String,
    val journalEntries: ArrayList<Entry<*>>){

    fun addEntry (newEntry: Entry<*>) : Boolean {
        return journalEntries.add(newEntry)
    }
}