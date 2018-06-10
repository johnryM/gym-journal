package com.company.skeeno.repository.model

data class Exercise(
        val id : String,
        var name : String,
        var date : Long?,
        var description : String?,
        var duration : Long?,
        var type : List<String>?,
        var muscleType : List<String>?,
        var sets : List<ExerciseSet>
)
