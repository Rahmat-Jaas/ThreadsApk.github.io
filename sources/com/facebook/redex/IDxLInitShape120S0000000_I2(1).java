package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0OE;

public class IDxLInitShape120S0000000_I2 implements AnonymousClass0OE {
    public final int A00;

    public IDxLInitShape120S0000000_I2(int i) {
        this.A00 = i;
    }

    public final Integer BM7() {
        if (9 - this.A00 != 0) {
            return AnonymousClass006.A0C;
        }
        return AnonymousClass006.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.AnonymousClass0LU.A0G("lacrima", "Unable to install abort hooks", r1);
        X.C04790Pd.A00();
        r0 = -1212103041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f4, code lost:
        r0 = -985673631;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BPo(X.AnonymousClass0OK r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x001e;
                case 2: goto L_0x0066;
                case 3: goto L_0x0080;
                case 4: goto L_0x009a;
                case 5: goto L_0x00f9;
                case 6: goto L_0x0127;
                case 7: goto L_0x012b;
                case 8: goto L_0x014b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0Xz r0 = X.C04520Nz.A00
            if (r0 != 0) goto L_0x001d
            X.0Q4 r0 = r9.A03()
            java.io.File r1 = r0.A04
            java.lang.String r0 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r1, r0)
            X.0Xz r0 = X.AnonymousClass0P0.A00(r1)
            if (r0 == 0) goto L_0x001d
            X.C04520Nz.A01(r0)
        L_0x001d:
            return
        L_0x001e:
            com.facebook.errorreporting.lacrima.detector.broadcast.SecureShutdownBootBroadcastReceiver r5 = new com.facebook.errorreporting.lacrima.detector.broadcast.SecureShutdownBootBroadcastReceiver
            r5.<init>()
            android.app.Application r4 = r9.A0L
            X.0Q4 r7 = r9.A03()
            java.lang.String r3 = "lacrima"
            X.0Y1 r6 = X.AnonymousClass0Y1.A00(r4)     // Catch:{ all -> 0x016a }
            java.lang.String r2 = "last_device_shutdown_s"
            r0 = 0
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x016a }
            r6.A01(r2, r0)     // Catch:{ all -> 0x016a }
            java.io.File r1 = r7.A04     // Catch:{ all -> 0x016a }
            java.lang.String r0 = "Did you call SessionManager.init()?"
            X.C002801h.A02(r1, r0)     // Catch:{ all -> 0x016a }
            com.facebook.errorreporting.lacrima.detector.broadcast.SecureShutdownBootBroadcastReceiver.A00 = r1     // Catch:{ all -> 0x016a }
            X.0t2 r0 = X.C16420t2.A00()     // Catch:{ all -> 0x016a }
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "SecureContextHelper is null"
            X.AnonymousClass0LU.A0C(r3, r0)     // Catch:{ all -> 0x016a }
            goto L_0x0169
        L_0x0050:
            java.util.ArrayList r0 = r5.A00     // Catch:{ all -> 0x016a }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x016a }
        L_0x0056:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x016a }
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x016a }
            android.content.IntentFilter r0 = (android.content.IntentFilter) r0     // Catch:{ all -> 0x016a }
            r4.registerReceiver(r5, r0)     // Catch:{ all -> 0x016a }
            goto L_0x0056
        L_0x0066:
            X.0Oe r0 = r9.A0W
            java.lang.Object r1 = r0.get()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.String r1 = "SecureBroadcastReceiver.start"
            r0 = -1525674695(0xffffffffa5100d39, float:-1.2494489E-16)
            X.C13810oL.A01(r1, r0)
            goto L_0x0174
        L_0x0080:
            X.0Oe r0 = r9.A0W
            java.lang.Object r1 = r0.get()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = -1234298290(0xffffffffb66e1a4e, float:-3.5480075E-6)
            java.lang.String r0 = "SystemBinderDiedDetector.start"
            X.C13810oL.A01(r0, r1)
            goto L_0x01fd
        L_0x009a:
            X.0Oe r0 = r9.A0W
            java.lang.Object r1 = r0.get()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            r1 = -61665159(0xfffffffffc531079, float:-4.383635E36)
            java.lang.String r0 = "ContentProviderDiedDetector.start"
            X.C13810oL.A01(r0, r1)
            goto L_0x0224
        L_0x00b4:
            java.lang.String r2 = "lacrima"
            java.lang.String r1 = "AbortHooks.init"
            r0 = 1977171003(0x75d93c3b, float:5.5075685E32)
            X.C13810oL.A01(r1, r0)
            boolean r0 = com.facebook.aborthooks.AbortHooks.sInstalled     // Catch:{ all -> 0x00e5 }
            if (r0 != 0) goto L_0x00e0
            java.lang.Class<com.facebook.aborthooks.AbortHooks> r1 = com.facebook.aborthooks.AbortHooks.class
            monitor-enter(r1)     // Catch:{ all -> 0x00e5 }
            boolean r0 = com.facebook.aborthooks.AbortHooks.sInstalled     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x00db
            r0 = 1
            com.facebook.aborthooks.AbortHooks.sInstalled = r0     // Catch:{ all -> 0x00dd }
            com.facebook.aborthooks.AbortHooks.install()     // Catch:{ all -> 0x00dd }
            com.facebook.aborthooks.AbortHooks.hookAbort()     // Catch:{ all -> 0x00dd }
            com.facebook.aborthooks.AbortHooks.hookAndroidLogAssert()     // Catch:{ all -> 0x00dd }
            com.facebook.aborthooks.AbortHooks.setGlogFatalHandler()     // Catch:{ all -> 0x00dd }
            com.facebook.aborthooks.AbortHooks.hookAndroidSetAbortMessage()     // Catch:{ all -> 0x00dd }
        L_0x00db:
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            goto L_0x00e0
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00e0:
            r0 = 1336127813(0x4fa3b145, float:5.4926075E9)
            goto L_0x024b
        L_0x00e5:
            r1 = move-exception
            java.lang.String r0 = "Unable to install abort hooks"
            X.AnonymousClass0LU.A0G(r2, r0, r1)     // Catch:{ all -> 0x00f3 }
            X.C04790Pd.A00()     // Catch:{ all -> 0x00f3 }
            r0 = -1212103041(0xffffffffb7c0c67f, float:-2.2980616E-5)
            goto L_0x024b
        L_0x00f3:
            r1 = move-exception
            r0 = -985673631(0xffffffffc53fd061, float:-3069.0237)
            goto L_0x0258
        L_0x00f9:
            java.lang.String r1 = "ApplicationThreadDataConfig.start"
            r0 = 1624018974(0x60cc901e, float:1.1792252E20)
            X.C13810oL.A01(r1, r0)
            X.0Mg r1 = r9.A02()
            java.lang.Class<X.0b8> r0 = X.C07220b8.class
            java.lang.Object r2 = r1.A03(r0)
            X.0b8 r2 = (X.C07220b8) r2
            X.0Q4 r1 = r9.A03()     // Catch:{ all -> 0x0121 }
            X.0aT r0 = X.C06850aT.A03     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x011c
            X.0aT r0 = new X.0aT     // Catch:{ all -> 0x0121 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0121 }
            X.C06850aT.A03 = r0     // Catch:{ all -> 0x0121 }
        L_0x011c:
            r0 = 753670059(0x2cec17ab, float:6.710151E-12)
            goto L_0x024b
        L_0x0121:
            r1 = move-exception
            r0 = 1882017464(0x702d4eb8, float:2.1454429E29)
            goto L_0x0258
        L_0x0127:
            X.AnonymousClass0IR.A00()
            return
        L_0x012b:
            java.lang.String r1 = "UnwindstackStreamManager.register"
            r0 = 1218832210(0x48a5e752, float:339770.56)
            X.C13810oL.A01(r1, r0)
            com.facebook.breakpad.UnwindstackStreamManager.register()     // Catch:{ all -> 0x0145 }
            long r2 = com.facebook.breakpad.BreakpadManager.getMinidumpFlags()     // Catch:{ all -> 0x0145 }
            r0 = 2048(0x800, double:1.0118E-320)
            long r2 = r2 | r0
            com.facebook.breakpad.BreakpadManager.setMinidumpFlags(r2)     // Catch:{ all -> 0x0145 }
            r0 = -2031520395(0xffffffff86e97575, float:-8.7817446E-35)
            goto L_0x024b
        L_0x0145:
            r1 = move-exception
            r0 = 2139534134(0x7f86b336, float:NaN)
            goto L_0x0258
        L_0x014b:
            java.lang.String r1 = "NativeJvmStreamConfig.jvmStreamEnabled"
            r0 = 41172878(0x2743f8e, float:1.7944528E-37)
            X.C13810oL.A01(r1, r0)
            r0 = 1
            com.facebook.breakpad.BreakpadManager.setJvmStreamEnabled(r0)     // Catch:{ Exception | UnsatisfiedLinkError -> 0x0159 }
            goto L_0x0248
        L_0x0159:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Error enabling jvm stream"
            X.AnonymousClass0LU.A0G(r1, r0, r2)     // Catch:{ all -> 0x0254 }
            X.C04790Pd.A00()     // Catch:{ all -> 0x0254 }
            r0 = 251195631(0xef8f0ef, float:6.136873E-30)
            goto L_0x024b
        L_0x0169:
            return
        L_0x016a:
            r1 = move-exception
            X.C04790Pd.A00()
            java.lang.String r0 = "SecureShutdownBootBroadcastReceiver failed"
            X.AnonymousClass0LU.A0I(r3, r0, r1)
            return
        L_0x0174:
            java.lang.String r1 = "LacrimaBroadcastReceiver"
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch:{ all -> 0x01f8 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f8 }
            X.C13820oM.A00(r0)     // Catch:{ all -> 0x01f8 }
            r0.start()     // Catch:{ all -> 0x01f8 }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x01f8 }
            if (r0 == 0) goto L_0x01f4
            android.os.Handler r6 = new android.os.Handler     // Catch:{ all -> 0x01f8 }
            r6.<init>(r0)     // Catch:{ all -> 0x01f8 }
            X.0Ol r0 = new X.0Ol     // Catch:{ all -> 0x01f8 }
            r0.<init>(r8)     // Catch:{ all -> 0x01f8 }
            r6.post(r0)     // Catch:{ all -> 0x01f8 }
            com.facebook.errorreporting.lacrima.detector.broadcast.LockScreenBroadcastReceiver r7 = new com.facebook.errorreporting.lacrima.detector.broadcast.LockScreenBroadcastReceiver     // Catch:{ all -> 0x01f8 }
            r7.<init>(r6)     // Catch:{ all -> 0x01f8 }
            android.app.Application r5 = r9.A0L     // Catch:{ all -> 0x01f8 }
            X.0Mg r0 = r9.A02()     // Catch:{ all -> 0x01f8 }
            java.lang.String r3 = "lacrima"
            r4 = 0
            com.facebook.errorreporting.lacrima.detector.broadcast.LockScreenBroadcastReceiver.A01 = r0     // Catch:{ all -> 0x01bb }
            java.lang.String r1 = "android.intent.action.SCREEN_ON"
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x01bb }
            r0.<init>(r1)     // Catch:{ all -> 0x01bb }
            android.os.Handler r2 = r7.A00     // Catch:{ all -> 0x01bb }
            r5.registerReceiver(r7, r0, r4, r2)     // Catch:{ all -> 0x01bb }
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch:{ all -> 0x01bb }
            r0.<init>(r1)     // Catch:{ all -> 0x01bb }
            r5.registerReceiver(r7, r0, r4, r2)     // Catch:{ all -> 0x01bb }
            goto L_0x01c4
        L_0x01bb:
            r1 = move-exception
            java.lang.String r0 = "LockScreenBroadcastReceiver failed"
            X.AnonymousClass0LU.A0I(r3, r0, r1)     // Catch:{ all -> 0x01f8 }
            X.C04790Pd.A00()     // Catch:{ all -> 0x01f8 }
        L_0x01c4:
            java.lang.Class<X.0Om> r1 = X.C04640Om.class
            monitor-enter(r1)     // Catch:{ all -> 0x01f8 }
            X.0af r0 = new X.0af     // Catch:{ all -> 0x01f1 }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x01f1 }
            X.C04640Om.A01 = r0     // Catch:{ all -> 0x01f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x01f1 }
            X.07w r2 = new X.07w     // Catch:{ all -> 0x01f8 }
            r2.<init>(r6)     // Catch:{ all -> 0x01f8 }
            X.0Mg r0 = r9.A02()     // Catch:{ all -> 0x01f8 }
            X.C016607w.A01 = r0     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x01e7 }
            r1.<init>(r0)     // Catch:{ all -> 0x01e7 }
            android.os.Handler r0 = r2.A00     // Catch:{ all -> 0x01e7 }
            r5.registerReceiver(r2, r1, r4, r0)     // Catch:{ all -> 0x01e7 }
            goto L_0x01f4
        L_0x01e7:
            r1 = move-exception
            X.C04790Pd.A00()     // Catch:{ all -> 0x01f8 }
            java.lang.String r0 = "BatteryChangedBroadcastReceiver failed"
            X.AnonymousClass0LU.A0I(r3, r0, r1)     // Catch:{ all -> 0x01f8 }
            goto L_0x01f4
        L_0x01f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01f1 }
            throw r0     // Catch:{ all -> 0x01f8 }
        L_0x01f4:
            r0 = 630328466(0x25920c92, float:2.533548E-16)
            goto L_0x024b
        L_0x01f8:
            r1 = move-exception
            r0 = -660938243(0xffffffffd89ae1fd, float:-1.36236322E15)
            goto L_0x0258
        L_0x01fd:
            X.0Q4 r1 = r9.A03()     // Catch:{ all -> 0x0210 }
            X.0PJ r0 = X.AnonymousClass0PJ.A01     // Catch:{ all -> 0x0210 }
            if (r0 != 0) goto L_0x020c
            X.0PJ r0 = new X.0PJ     // Catch:{ all -> 0x0210 }
            r0.<init>(r1)     // Catch:{ all -> 0x0210 }
            X.AnonymousClass0PJ.A01 = r0     // Catch:{ all -> 0x0210 }
        L_0x020c:
            r0 = -890202028(0xffffffffcaf09854, float:-7883818.0)
            goto L_0x024b
        L_0x0210:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Unable to install system binder died detector"
            X.AnonymousClass0LU.A0H(r1, r0, r2)     // Catch:{ all -> 0x021f }
            X.C04790Pd.A00()     // Catch:{ all -> 0x021f }
            r0 = -1564860395(0xffffffffa2ba2015, float:-5.044937E-18)
            goto L_0x024b
        L_0x021f:
            r1 = move-exception
            r0 = 2037560976(0x7972b690, float:7.8764915E34)
            goto L_0x0258
        L_0x0224:
            android.app.Application r2 = r9.A0L     // Catch:{ all -> 0x0239 }
            X.0Q4 r1 = r9.A03()     // Catch:{ all -> 0x0239 }
            X.0PI r0 = X.AnonymousClass0PI.A04     // Catch:{ all -> 0x0239 }
            if (r0 != 0) goto L_0x0235
            X.0PI r0 = new X.0PI     // Catch:{ all -> 0x0239 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0239 }
            X.AnonymousClass0PI.A04 = r0     // Catch:{ all -> 0x0239 }
        L_0x0235:
            r0 = 76220347(0x48b07bb, float:3.2685842E-36)
            goto L_0x024b
        L_0x0239:
            r2 = move-exception
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Unable to install content provider died detector"
            X.AnonymousClass0LU.A0H(r1, r0, r2)     // Catch:{ all -> 0x024f }
            X.C04790Pd.A00()     // Catch:{ all -> 0x024f }
            r0 = 1126381980(0x4323399c, float:163.22504)
            goto L_0x024b
        L_0x0248:
            r0 = 145825200(0x8b11db0, float:1.06597795E-33)
        L_0x024b:
            X.C13810oL.A00(r0)
            return
        L_0x024f:
            r1 = move-exception
            r0 = 1839861800(0x6daa1028, float:6.578998E27)
            goto L_0x0258
        L_0x0254:
            r1 = move-exception
            r0 = 1254664743(0x4ac8aa27, float:6575379.5)
        L_0x0258:
            X.C13810oL.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxLInitShape120S0000000_I2.BPo(X.0OK):void");
    }
}
