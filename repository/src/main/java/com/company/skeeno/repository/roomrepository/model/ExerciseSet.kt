package com.company.skeeno.repository.roomrepository.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ExerciseSet(
        @PrimaryKey(autoGenerate = true)var id: Long,
        @ColumnInfo(name = "set_number") var number: Int,
        @ColumnInfo(name = "set_repAmount") var repAmount: Int?,
        @ColumnInfo(name = "set_weight") var weight: Float?,
        @ColumnInfo(name = "set_distance") var distance: Float?,
        @ColumnInfo(name = "set_height") var height: Float?
)