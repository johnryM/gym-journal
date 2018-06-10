package com.company.skeeno.repository.roomrepository

import com.company.skeeno.repository.model.Workout
import com.company.skeeno.repository.repositorycontract.Repository
import com.company.skeeno.repository.repositorycontract.Specification

class RoomRepository: Repository<Workout> {
    override fun add(item: Workout) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun add(items: List<Workout>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(item: Workout) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(specification: Specification) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(item: Workout) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun query(specification: Specification): List<Workout> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}