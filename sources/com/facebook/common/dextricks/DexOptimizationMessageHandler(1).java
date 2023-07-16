package com.facebook.common.dextricks;

import X.C03790Kt;
import X.C13820oM;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import java.util.List;

public final class DexOptimizationMessageHandler extends Handler {
    public static final int DEFAULT_RESTART_IMPORTANCE_THRESHOLD = 300;
    public static final int MSG_OPT_DONE = 2;
    public static final int MSG_OPT_RESTART_CHECK = 3;
    public static final int MSG_OPT_START = 1;
    public static final int OPT_RESULT_ERROR = 1;
    public static final int OPT_RESULT_SHUTDOWN = 2;
    public static final int OPT_RESULT_SUCCESS = 0;
    public static final int RESTART_CHECK_INTERVAL_MS = 1000;
    public static final int UNKNOWN_IMPORTANCE = -1;
    public final Context mContext;
    public final boolean mDisableProcessRestart;
    public final PowerManager mPowerManager;
    public final int mRestartImportanceThreshold;
    public final boolean mRestartOnlyIfScreenOff;

    public class Api16PlusUtil {
        public static int getMyImportance() {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance;
        }
    }

    private int getMyImportance() {
        try {
            return Api16PlusUtil.getMyImportance();
        } catch (NullPointerException e) {
            Mlog.w(e, "getMyMemoryState failed due to NPE: falling back to legacy process list API", new Object[0]);
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.mContext.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return -1;
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    return next.importance;
                }
            }
            return -1;
        } catch (RuntimeException e2) {
            Mlog.w(e2, "getMyMemoryState failed due to internal error: exit gracefully", new Object[0]);
            return -1;
        }
    }

    public static void send(Messenger messenger, int i, int i2) {
        if (messenger != null) {
            try {
                messenger.send(Message.obtain((Handler) null, i, i2, 0));
            } catch (RemoteException e) {
                Mlog.w(e, "cannot send status, receiver is dead", new Object[0]);
            }
        } else {
            Mlog.w("cannot send status, receiver is null", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r3 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean checkIfShouldRestartProcess(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.mDisableProcessRestart
            r5 = 0
            if (r0 != 0) goto L_0x002d
            int r0 = r6.mRestartImportanceThreshold
            if (r7 < r0) goto L_0x002d
            boolean r0 = r6.mRestartOnlyIfScreenOff
            r4 = 1
            if (r0 == 0) goto L_0x0031
            android.os.PowerManager r0 = r6.mPowerManager
            boolean r3 = r0.isInteractive()
            if (r3 == 0) goto L_0x002e
            java.lang.String r2 = "on"
        L_0x0018:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            int r0 = r6.mRestartImportanceThreshold
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "[c] checking if screen is off (screen is %s) with importance %d [threshold: %d]"
            com.facebook.common.dextricks.Mlog.safeFmt(r0, r1)
            if (r3 == 0) goto L_0x0031
        L_0x002d:
            return r5
        L_0x002e:
            java.lang.String r2 = "off"
            goto L_0x0018
        L_0x0031:
            boolean r0 = X.AnonymousClass0MI.A08()
            if (r0 != 0) goto L_0x002d
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexOptimizationMessageHandler.checkIfShouldRestartProcess(int):boolean");
    }

    private boolean isScreenOn() {
        return this.mPowerManager.isInteractive();
    }

    public static Looper makeLooper() {
        HandlerThread handlerThread = new HandlerThread("DexOptimizationMessageHandlerThread");
        C13820oM.A00(handlerThread);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    private boolean scheduleRestartChecks() {
        return !this.mDisableProcessRestart;
    }

    public void handleMessage(Message message) {
        String str;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                int i2 = message.arg1;
                if (i2 == 0) {
                    str = "success";
                } else if (i2 == 1) {
                    str = "failed";
                } else if (i2 != 2) {
                    str = "unknown";
                } else {
                    str = "interrupted due to service shutdown";
                }
                boolean z = !this.mDisableProcessRestart;
                Mlog.safeFmt("[c] received optimization-done message (result: %s schedule checks: %s)", str, Boolean.valueOf(z));
                if (message.arg1 != 0 || !z) {
                    return;
                }
            } else if (i != 3) {
                super.handleMessage(message);
                return;
            } else {
                int myImportance = getMyImportance();
                Integer valueOf = Integer.valueOf(myImportance);
                Mlog.safeFmt("[c] current importance: %s threshold: %s", valueOf, Integer.valueOf(this.mRestartImportanceThreshold));
                if (checkIfShouldRestartProcess(myImportance)) {
                    Mlog.w("[c] low importance: %s: restarting ourselves", valueOf);
                    C03790Kt.A01("dextricks:MSG_OPT_RESTART_CHECK");
                }
                if (myImportance == -1) {
                    Mlog.w("[c] importance unknown: not scheduling further checks", new Object[0]);
                    return;
                } else if (!(!this.mDisableProcessRestart)) {
                    Mlog.safeFmt("[c] Do not schedule any further restart checks", new Object[0]);
                    return;
                } else {
                    Mlog.safeFmt("[c] scheduling another importance check in %sms", 1000);
                }
            }
            sendMessageDelayed(obtainMessage(3), 1000);
            return;
        }
        Mlog.safeFmt("[c] received opt start message, canceling any restart checks", new Object[0]);
        removeMessages(3);
    }

    public DexOptimizationMessageHandler(Context context, boolean z, int i, boolean z2) {
        super(makeLooper());
        this.mContext = context.getApplicationContext();
        this.mPowerManager = (PowerManager) context.getSystemService("power");
        this.mDisableProcessRestart = z;
        this.mRestartImportanceThreshold = i <= 0 ? 300 : i;
        this.mRestartOnlyIfScreenOff = z2;
    }
}
