package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.AnonymousClass01G;
import X.C03670Kf;
import X.C14030oh;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.DeadObjectException;
import android.os.Messenger;
import com.facebook.common.dextricks.OptimizationConfiguration;
import com.facebook.endtoend.EndToEnd;
import java.io.Closeable;
import java.io.File;

public final class DexOptimization {
    public static final String ACTION_OPTIMIZE = "com.facebook.dexopt";
    public static final int JOB_ID = -87105851;
    public static final String OPT_KEY_CLIENT = "client";
    public static final String OPT_KEY_DEX_STORE_ROOT = "dexStoreRoot";
    public static final String PROCESS_NAME = "optsvc";

    public final class Client {
        public static volatile Messenger sOptListener;

        public static Messenger getMessenger(Context context, DexStore dexStore) {
            if (sOptListener == null) {
                synchronized (Client.class) {
                    if (sOptListener == null) {
                        sOptListener = constructClientMessenger(context, dexStore);
                    }
                }
            }
            return sOptListener;
        }

        public static boolean getShouldDisableRestartProcessAfterDexOpt(Context context, DexStore dexStore, C03670Kf r4) {
            if ((!r4.A1C || !dexStore.isReoptimization(context)) && !EndToEnd.isRunningEndToEndTest()) {
                return false;
            }
            return true;
        }

        public static void startBackgroundOptimization(Context context, DexStore dexStore) {
            try {
                Mlog.safeFmt("starting background optimization", new Object[0]);
                AnonymousClass01G.enqueueWork(context, Service.class, (int) DexOptimization.JOB_ID, new Intent(DexOptimization.ACTION_OPTIMIZE).putExtra(DexOptimization.OPT_KEY_DEX_STORE_ROOT, dexStore.root.getAbsolutePath()).putExtra(DexOptimization.OPT_KEY_CLIENT, getMessenger(context, dexStore)));
            } catch (SecurityException e) {
                Mlog.w("Failure to start DexOptimization.Service", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    Mlog.w("Failure to start DexOptimization.Service", e2);
                    return;
                }
                throw e2;
            }
        }

        public static Messenger constructClientMessenger(Context context, DexStore dexStore) {
            C03670Kf A00 = C03670Kf.A00(context);
            return new Messenger(new DexOptimizationMessageHandler(context, getShouldDisableRestartProcessAfterDexOpt(context, dexStore, A00), A00.A0r, A00.A2f));
        }
    }

    public final class Service extends AnonymousClass01G {
        public boolean isScreenOn;
        public OptSvcBroadcastReceiver mReceiver;
        public long unpauseTime;

        public final class OptSvcBroadcastReceiver extends BroadcastReceiver {
            public OptSvcBroadcastReceiver() {
            }

            public void onReceive(Context context, Intent intent) {
                int i;
                Object[] objArr;
                String str;
                int A01 = C14030oh.A01(-1965829126);
                if (intent != null) {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        Service.this.isScreenOn = true;
                        objArr = new Object[0];
                        str = "[optsvc] noticed screen on";
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        Service.this.isScreenOn = false;
                        objArr = new Object[0];
                        str = "[optsvc] noticed screen off";
                    } else if (DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE.equals(action)) {
                        long longExtra = intent.getLongExtra(DexOptimizationConstants.OPTIMIZE_UNPAUSE_TIME, -1);
                        if (longExtra < 0) {
                            Mlog.w("bogus pause broadcast received", new Object[0]);
                            i = -1976892630;
                            C14030oh.A0E(i, A01, intent);
                        }
                        Service service = Service.this;
                        long max = Math.max(service.unpauseTime, longExtra);
                        service.unpauseTime = max;
                        objArr = new Object[]{Long.valueOf(max), Long.valueOf((System.nanoTime() - max) / 1000000)};
                        str = "pause broadcast received: will unpause at time %s (%s ms from now)";
                    }
                    Mlog.safeFmt(str, objArr);
                }
                i = -1358566438;
                C14030oh.A0E(i, A01, intent);
            }
        }

        public final class OptSvcOptimizationConfigurationProvider extends OptimizationConfiguration.Provider {
            public OptimizationConfiguration mPausedConfig;
            public OptimizationConfiguration mScreenOffConfig;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public OptSvcOptimizationConfigurationProvider() {
                /*
                    r3 = this;
                    com.facebook.common.dextricks.DexOptimization.Service.this = r4
                    com.facebook.common.dextricks.OptimizationConfiguration$Builder r1 = new com.facebook.common.dextricks.OptimizationConfiguration$Builder
                    r1.<init>()
                    com.facebook.common.dextricks.Prio r0 = com.facebook.common.dextricks.Prio.lowest()
                    r1.mPrio = r0
                    r0 = 1
                    r1.setInBackground(r0)
                    r0 = 300(0x12c, float:4.2E-43)
                    r1.mOptTimeSliceMs = r0
                    r0 = 1000(0x3e8, float:1.401E-42)
                    r1.mYieldTimeSliceMs = r0
                    com.facebook.common.dextricks.OptimizationConfiguration r0 = r1.build()
                    r3.<init>(r0)
                    com.facebook.common.dextricks.OptimizationConfiguration r2 = r3.baseline
                    com.facebook.common.dextricks.OptimizationConfiguration$Builder r1 = new com.facebook.common.dextricks.OptimizationConfiguration$Builder
                    r1.<init>(r2)
                    r0 = 900(0x384, float:1.261E-42)
                    r1.mOptTimeSliceMs = r0
                    r0 = 300(0x12c, float:4.2E-43)
                    r1.mYieldTimeSliceMs = r0
                    com.facebook.common.dextricks.OptimizationConfiguration r0 = r1.build()
                    r3.mScreenOffConfig = r0
                    com.facebook.common.dextricks.OptimizationConfiguration$Builder r1 = new com.facebook.common.dextricks.OptimizationConfiguration$Builder
                    r1.<init>(r2)
                    r0 = 0
                    r1.mOptTimeSliceMs = r0
                    r0 = 100
                    r1.mYieldTimeSliceMs = r0
                    com.facebook.common.dextricks.OptimizationConfiguration r0 = r1.build()
                    r3.mPausedConfig = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexOptimization.Service.OptSvcOptimizationConfigurationProvider.<init>(com.facebook.common.dextricks.DexOptimization$Service):void");
            }

            public OptimizationConfiguration getInstantaneous() {
                long nanoTime = System.nanoTime();
                Service service = Service.this;
                if (nanoTime < service.unpauseTime) {
                    return this.mPausedConfig;
                }
                if (service.isScreenOn) {
                    return this.baseline;
                }
                return this.mScreenOffConfig;
            }
        }

        public void onHandleWork(Intent intent) {
            SocketLock socketLock;
            if (DexOptimization.ACTION_OPTIMIZE.equals(intent.getAction())) {
                Mlog.safeFmt("optsvc received opt intent", new Object[0]);
                String stringExtra = intent.getStringExtra(DexOptimization.OPT_KEY_DEX_STORE_ROOT);
                Messenger messenger = (Messenger) intent.getParcelableExtra(DexOptimization.OPT_KEY_CLIENT);
                DexOptimizationMessageHandler.send(messenger, 1, 0);
                try {
                    socketLock = new SocketLock("com.facebook.dexopt.lock");
                    while (!socketLock.tryAcquire()) {
                        try {
                            Mlog.safeFmt("another application is optimizing; waiting", new Object[0]);
                            Thread.sleep(1000);
                        } catch (InterruptedException unused) {
                            Mlog.safeFmt("optimization canceled for dex store %s", stringExtra);
                            DexOptimizationMessageHandler.send(messenger, 2, 2);
                            Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                            Fs.safeClose((Closeable) socketLock);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                Mlog.w(th, "optimization failed for dex store %s", stringExtra);
                                DexOptimizationMessageHandler.send(messenger, 2, 1);
                                Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                                Fs.safeClose((Closeable) socketLock);
                            } catch (Throwable th2) {
                                Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                                Fs.safeClose((Closeable) socketLock);
                                throw th2;
                            }
                        }
                    }
                    Mlog.safeFmt("acquired xappLock", new Object[0]);
                    DexStore findOpened = DexStore.findOpened(new File(stringExtra));
                    if (findOpened != null) {
                        findOpened.optimize(getApplicationContext(), new OptSvcOptimizationConfigurationProvider());
                        DexOptimizationMessageHandler.send(messenger, 2, 0);
                        Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                        Fs.safeClose((Closeable) socketLock);
                    }
                    throw new IllegalArgumentException(AnonymousClass00U.A0L("no such opened dex store: ", stringExtra));
                } catch (InterruptedException unused2) {
                    socketLock = null;
                    Mlog.safeFmt("optimization canceled for dex store %s", stringExtra);
                    DexOptimizationMessageHandler.send(messenger, 2, 2);
                    Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                    Fs.safeClose((Closeable) socketLock);
                } catch (Throwable th3) {
                    th = th3;
                    socketLock = null;
                    Mlog.w(th, "optimization failed for dex store %s", stringExtra);
                    DexOptimizationMessageHandler.send(messenger, 2, 1);
                    Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                    Fs.safeClose((Closeable) socketLock);
                }
            } else {
                Mlog.w("optsvc received intent with unknown action: %s", intent.getAction());
            }
        }

        public void onCreate() {
            int A04 = C14030oh.A04(954401035);
            super.onCreate();
            Mlog.safeFmt("optsvc created", new Object[0]);
            this.isScreenOn = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction(DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE);
            OptSvcBroadcastReceiver optSvcBroadcastReceiver = new OptSvcBroadcastReceiver();
            this.mReceiver = optSvcBroadcastReceiver;
            registerReceiver(optSvcBroadcastReceiver, intentFilter);
            this.mInterruptIfStopped = true;
            C14030oh.A0B(1529376969, A04);
        }

        public void onDestroy() {
            int A04 = C14030oh.A04(1172643408);
            Mlog.safeFmt("optsvc being shut down", new Object[0]);
            OptSvcBroadcastReceiver optSvcBroadcastReceiver = this.mReceiver;
            if (optSvcBroadcastReceiver != null) {
                unregisterReceiver(optSvcBroadcastReceiver);
                this.mReceiver = null;
            }
            super.onDestroy();
            C14030oh.A0B(1823019804, A04);
        }
    }
}
