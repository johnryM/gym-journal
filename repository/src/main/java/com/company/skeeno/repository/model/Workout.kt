package com.company.skeeno.repository.model

data class Workout(
        val id : String,
        var name : String,
        var description : String?,
        var type : List<String>,
        var duration : Long?,
        var exercise : List<Exercise>
)
