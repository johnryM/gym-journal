package com.company.skeeno.repository.roomrepository.model

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity
data class Exercise(
        val id: String,
        @ColumnInfo(name = "exercise_name") var name: String,
        @ColumnInfo(name = "exercise_description") var description: String?,
        @ColumnInfo(name = "exercise_duration") var duration: Long?,
        @ColumnInfo(name = "exercise_type") var type: String?,
        @ColumnInfo(name = "exercise_muscleType")var muscleType: String?
        //TODO add list of ExerciseSets - 1 exercise to many exercisesSets
)
