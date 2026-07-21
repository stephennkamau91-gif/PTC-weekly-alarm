package com.ptc.driveralarm.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.ptc.driveralarm.data.database.AlarmDatabase
import kotlinx.coroutines.*

class AlarmService : Service() {
    
    private val job = Job()
    private val scope = CoroutineScope(Dispatchers.Main + job)
    
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_STICKY
    }
    
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
    
    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }
}
