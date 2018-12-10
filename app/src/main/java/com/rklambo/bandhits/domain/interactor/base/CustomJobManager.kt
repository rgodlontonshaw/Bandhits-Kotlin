package com.rklambo.bandhits.domain.interactor.base

import android.content.Context
import com.birbit.android.jobqueue.JobManager
import com.birbit.android.jobqueue.config.Configuration

class CustomJobManager(context: Context) : JobManager(CustomJobManager.getJobManagerConfiguration(context)) {

    companion object {

        private fun getJobManagerConfiguration(context: Context): Configuration {

            return Configuration.Builder(context)
                    .minConsumerCount(1)    // always keep at least one consumer alive
                    .maxConsumerCount(3)    // up to 3 consumers at NextOnEditorActionListener time
                    .loadFactor(3)          // 3 jobs per consumer
                    .consumerKeepAlive(120) // wait 2 minutes
                    .build()

        }
    }
}