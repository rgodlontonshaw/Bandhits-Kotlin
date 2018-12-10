package com.rklambo.bandhits.domain.interactor.base

interface InteractorExecutor {
    fun execute(interactor: Interactor, priority: InteractorPriority = InteractorPriority.LOW)
}