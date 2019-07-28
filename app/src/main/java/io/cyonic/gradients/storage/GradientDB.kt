package io.cyonic.gradients.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import io.cyonic.gradients.models.Entry
import io.cyonic.gradients.models.Journal

@Database(entities = [Entry::class, Journal::class], version = 1)
abstract class GradientDB : RoomDatabase() {

    abstract fun entryDAO() : EntryDAO
    abstract fun journalDAO() : JournalDAO
    abstract fun behaviorJournalDAO() : BehaviorJournalDAO
}