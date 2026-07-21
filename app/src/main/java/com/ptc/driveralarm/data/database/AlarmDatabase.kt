package com.ptc.driveralarm.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ptc.driveralarm.data.dao.AlarmDao
import com.ptc.driveralarm.data.dao.DriverDao
import com.ptc.driveralarm.data.dao.ScheduleDao
import com.ptc.driveralarm.data.entity.Alarm
import com.ptc.driveralarm.data.entity.Driver
import com.ptc.driveralarm.data.entity.Schedule

@Database(
    entities = [Driver::class, Schedule::class, Alarm::class],
    version = 1,
    exportSchema = false
)
abstract class AlarmDatabase : RoomDatabase() {
    
    abstract fun driverDao(): DriverDao
    abstract fun scheduleDao(): ScheduleDao
    abstract fun alarmDao(): AlarmDao
    
    companion object {
        @Volatile
        private var INSTANCE: AlarmDatabase? = null
        
        fun getInstance(context: Context): AlarmDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AlarmDatabase::class.java,
                    "alarm_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
