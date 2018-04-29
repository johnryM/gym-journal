package com.company.skeeno.repository

import io.reactivex.Single

interface Repository<T> {
    fun fetch() : Single<T>
}