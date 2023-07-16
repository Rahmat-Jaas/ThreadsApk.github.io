package com.facebook.wellbeing.timeinapp.jnibindings;

import X.AnonymousClass22G;
import X.C15020qa;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ScheduledExecutorService;

public class TimeInAppControllerWrapper {
    public final HybridData mHybridData = initHybrid();

    private native void dispatchHybrid(int i);

    private native void initControllerHybrid(ScheduledExecutorService scheduledExecutorService, SQLiteDatabase sQLiteDatabase, XAnalyticsHolder xAnalyticsHolder, int i, int i2);

    public static native HybridData initHybrid();

    private native void queryIntervalsHybrid(long j, long j2, TimeInAppIntervalList timeInAppIntervalList);

    private native void queryIntervalsWithEventHybrid(long j, long j2, TimeInAppIntervalWithEventList timeInAppIntervalWithEventList);

    public native String getCurrentState();

    public native int[] getDailyTimeInApp(long j);

    public native int[] getDailyTimeInAppUtc(long j, long j2);

    public native long getTimeInApp(long j, long j2);

    public native void setReminder(TimeInAppReminder timeInAppReminder, int i);

    static {
        C15020qa.A0A("timeinapp-jni");
    }

    public void initController(ScheduledExecutorService scheduledExecutorService, String str, XAnalyticsHolder xAnalyticsHolder, int i, int i2) {
        try {
            initControllerHybrid(scheduledExecutorService, SQLiteDatabase.openOrCreateDatabase(str, (SQLiteDatabase.CursorFactory) null), xAnalyticsHolder, 8, i2);
        } catch (SQLiteException unused) {
        }
    }

    public ImmutableList queryIntervalsWithEvent(long j, long j2) {
        TimeInAppIntervalWithEventList timeInAppIntervalWithEventList = new TimeInAppIntervalWithEventList();
        queryIntervalsWithEventHybrid(Long.MIN_VALUE, Long.MAX_VALUE, timeInAppIntervalWithEventList);
        return timeInAppIntervalWithEventList.intervals.build();
    }

    public void dispatch(AnonymousClass22G r2) {
        dispatchHybrid(r2.ordinal());
    }
}
