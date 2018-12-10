package com.rklambo.bandhits.domain.interactor.base

interface Interactor {

    operator fun invoke(): Event
}