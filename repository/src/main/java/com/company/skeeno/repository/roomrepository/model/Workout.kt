package com.company.skeeno.repository.roomrepository.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Workout(
        @PrimaryKey(autoGenerate = true) var id: Long,
        @ColumnInfo(name = "workout_name") var name: String,
        @ColumnInfo(name = "workout_date") var date : Long,
        @ColumnInfo(name = "workout_description") var description: String?,
        @ColumnInfo(name = "workout_type") var type: String?
        //TODO add list of Exercises - 1 workout to many exercises
)