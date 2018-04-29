package com.company.skeeno.repository.model

data class Session(
        val id : String,
        var name : String,
        var date : Long,
        var workouts: List<Workout>
)
