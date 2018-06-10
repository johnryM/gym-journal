package com.company.skeeno.repository.repositorycontract

interface Repository<T> {
    fun add(item: T)

    fun add(items: List<T>)

    fun update(item: T)

    fun delete(specification: Specification)

    fun delete(item: T)

    fun query(specification: Specification): List<T>
}