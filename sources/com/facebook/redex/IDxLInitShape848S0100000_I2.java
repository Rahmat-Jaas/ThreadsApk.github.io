package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass0IR;
import X.AnonymousClass0LU;
import X.AnonymousClass0MI;
import X.AnonymousClass0MU;
import X.AnonymousClass0NS;
import X.AnonymousClass0OE;
import X.AnonymousClass0OK;
import X.AnonymousClass0ON;
import X.AnonymousClass0Q4;
import X.AnonymousClass0Z0;
import X.C002801h;
import X.C03790Kt;
import X.C04520Nz;
import X.C04680Or;
import X.C06050Xl;
import X.C13810oL;
import X.C15020qa;
import android.app.Application;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.errorreporting.lacrima.common.asl.aslnative.AppStateLoggerNative;
import java.io.File;

public class IDxLInitShape848S0100000_I2 implements AnonymousClass0OE {
    public Object A00;
    public final int A01;

    public IDxLInitShape848S0100000_I2(Application application, int i) {
        this.A01 = i;
        this.A00 = application;
    }

    public final void BPo(AnonymousClass0OK r10) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        if (this.A01 != 0) {
            C13810oL.A01("BreakpadManager.start", 1212468995);
            try {
                String str = (String) r10.A0V.get();
                BreakpadManager.start((Application) this.A00, 0, 1536000, str);
                BreakpadManager.setCustomData(AnonymousClass0MU.A4A.A00, str, new Object[0]);
                BreakpadManager.getMinidumpFlags();
                i2 = -886888904;
            } catch (Throwable th) {
                th = th;
                i = -1114995470;
            }
        } else {
            if (BreakpadManager.mCrashDirectory == null) {
                AnonymousClass0LU.A0C("lacrima", "Breakpad was not active when NativeAslConfig.libInit called.");
            }
            C13810oL.A01("AppStateLoggerNative.initializeNativeCrashReporting", 1803144814);
            try {
                AnonymousClass0Q4 A03 = r10.A03();
                synchronized (C04680Or.class) {
                    File file = A03.A04;
                    C002801h.A02(file, "Did you call SessionManager.init()?");
                    if (C04680Or.A00) {
                        z = C04680Or.A01;
                    } else {
                        z = false;
                    }
                    boolean z2 = false;
                    if (r10.A04()) {
                        z2 = true;
                    }
                    if (!AppStateLoggerNative.sAppStateLoggerNativeInited) {
                        String path = new File(file, "native_state.txt").getPath();
                        String path2 = new File(file, "anr_state.txt").getPath();
                        String path3 = new File(file, "dump_state.txt").getPath();
                        C15020qa.A0A("appstatelogger2");
                        C13810oL.A01("registerWithNativeCrashHandler", -958330662);
                        try {
                            AppStateLoggerNative.registerWithNativeCrashHandler(path, path2, path3, false);
                            C13810oL.A00(-739890201);
                            C13810oL.A01("registerStreamWithBreakpad", 929952257);
                            try {
                                AppStateLoggerNative.registerStreamWithBreakpad();
                                C13810oL.A00(1480399358);
                                C13810oL.A01("registerOomHandler", 2028854437);
                                try {
                                    AppStateLoggerNative.registerOomHandler();
                                    C13810oL.A00(-715478191);
                                    if (z2) {
                                        C13810oL.A01("registerSelfSigkill", 860294370);
                                        try {
                                            AppStateLoggerNative.sSelfSignalFunctionsSuccessfullyHooked = AppStateLoggerNative.registerSelfSigkillHandlers();
                                            if (AnonymousClass0IR.A01() != null) {
                                                AnonymousClass0NS r0 = new AnonymousClass0NS();
                                                AnonymousClass0IR.A04 = r0;
                                                synchronized (C03790Kt.class) {
                                                    try {
                                                        C03790Kt.A00 = r0;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        throw th;
                                                    }
                                                }
                                                AnonymousClass0IR.A03(new C06050Xl(), 100);
                                            }
                                            if (AnonymousClass0MI.A04 != null) {
                                                AnonymousClass0ON r2 = AnonymousClass0MU.A8R;
                                                synchronized (AppStateLoggerNative.class) {
                                                    i4 = AppStateLoggerNative.sSelfSignalFunctionsSuccessfullyHooked;
                                                }
                                                C04520Nz.A00(new AnonymousClass0Z0(r2, Integer.toString(i4)));
                                            }
                                            C13810oL.A00(-2082928203);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            i3 = 220365789;
                                            C13810oL.A00(i3);
                                            throw th;
                                        }
                                    }
                                    synchronized (AppStateLoggerNative.class) {
                                        try {
                                            AppStateLoggerNative.appInForeground(z, z);
                                            AppStateLoggerNative.sAppStateLoggerNativeInited = true;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    i3 = -1703036953;
                                    C13810oL.A00(i3);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                i3 = 617609633;
                                C13810oL.A00(i3);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            i3 = -561495287;
                            C13810oL.A00(i3);
                            throw th;
                        }
                    }
                }
                i2 = 1552781847;
            } catch (Throwable th8) {
                th = th8;
                i = -1055772912;
            }
        }
        C13810oL.A00(i2);
        return;
        C13810oL.A00(i);
        throw th;
    }

    public final Integer BM7() {
        return AnonymousClass006.A01;
    }
}
