package io.cyonic.gradients.models

open class Journal(val name: String, val journalEntries: ArrayList<Entry<*>>){

    fun addEntry (newEntry: Entry<*>) : Boolean {
        return journalEntries.add(newEntry)
    }
}