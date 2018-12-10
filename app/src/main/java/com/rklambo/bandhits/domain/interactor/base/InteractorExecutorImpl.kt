package com.rklambo.bandhits.domain.interactor.base

import com.birbit.android.jobqueue.JobManager

class InteractorExecutorImpl(private val jobManager: JobManager, val bus: Bus) :
    InteractorExecutor {

    override fun execute(interactor: Interactor, priority: InteractorPriority) {
        jobManager.addJobInBackground(InteractorWrapper(interactor, priority, bus))
    }
}