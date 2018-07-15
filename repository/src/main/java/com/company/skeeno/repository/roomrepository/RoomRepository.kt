package com.company.skeeno.repository.roomrepository

import com.company.skeeno.repository.model.Workout
import com.company.skeeno.repository.repositorycontract.Repository
import com.company.skeeno.repository.repositorycontract.Specification
import java.util.Collections.emptyList

class RoomRepository: Repository<Workout> {
    override fun add(item: Workout) {
    }

    override fun add(items: List<Workout>) {
    }

    override fun update(item: Workout) {
    }

    override fun delete(specification: Specification) {
    }

    override fun delete(item: Workout) {
    }

    override fun query(specification: Specification): List<Workout> {
        return emptyList()
    }
}