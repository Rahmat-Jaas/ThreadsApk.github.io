package X;

import com.facebook.errorreporting.lacrima.common.IDxLProviderShape84S0100000_I2;
import com.facebook.errorreporting.nightwatch.Nightwatch$NightwatchNative;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0Yj  reason: invalid class name and case insensitive filesystem */
public final class C06240Yj implements AnonymousClass0OE {
    public final AnonymousClass01P A00;

    public C06240Yj(AnonymousClass01P r1) {
        this.A00 = r1;
    }

    public final Integer BM7() {
        return AnonymousClass006.A0C;
    }

    public final void BPo(AnonymousClass0OK r23) {
        boolean z;
        C14890qL r0;
        C07960cV.A05(AnonymousClass0e5.A00(36313892654089950L));
        AnonymousClass0LU.A0O("NightwatchConfig", "saveExitStatus %b, useMmap %b, monitorResources %b, tickInfo %d, detectLmkd %b, needNightWatch %b", Boolean.valueOf(C07960cV.A05(AnonymousClass0e5.A00(36313892654089950L))), true, 1, 0, false, 1);
        C13810oL.A01("Nightwatch.startWatcher", 2091068101);
        AnonymousClass0OK r3 = r23;
        try {
            if ("".equals((String) r3.A0W.get())) {
                File file = r3.A03().A04;
                C002801h.A02(file, "Did you call SessionManager.init()?");
                File file2 = new File(file, "nightwatch.txt");
                boolean A05 = C07960cV.A05(AnonymousClass0e5.A00(36313892654089950L));
                int A002 = (int) C07960cV.A00(AnonymousClass0e5.A00(36595741291972661L));
                C04560Oe r1 = r3.A08;
                if (r1 == null) {
                    r1 = new IDxLProviderShape84S0100000_I2(r3, 3);
                    r3.A08 = r1;
                }
                AnonymousClass0QI r4 = (AnonymousClass0QI) r1.get();
                AnonymousClass0QA.A00 = file2;
                Object obj = AnonymousClass0QA.A02;
                synchronized (obj) {
                    try {
                        z = AnonymousClass0QA.A01;
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                        }
                        throw th;
                    }
                }
                if (!z) {
                    Nightwatch$NightwatchNative.loadNightWatchLib();
                    String canonicalPath = file2.getCanonicalPath();
                    synchronized (AnonymousClass0qM.class) {
                        try {
                            r0 = AnonymousClass0qM.A00;
                            if (r0 == null) {
                                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    String Art = r0.Art("libwatcher_binary.so");
                    if (Art == null) {
                        AnonymousClass0LU.A0B("Nightwatch", "Could not find watcher binary");
                    } else {
                        boolean z2 = false;
                        if (Nightwatch$NightwatchNative.CAN_USE_CRITICAL_NATIVE_METHODS) {
                            z2 = true;
                        }
                        Nightwatch$NightwatchNative.start(Art, canonicalPath, A05, true, false, true, true, 500, 0, 0, false, A002, true, z2, false, false);
                        synchronized (obj) {
                            try {
                                AnonymousClass0QA.A01 = true;
                            } catch (Throwable th3) {
                                while (true) {
                                    th = th3;
                                    break;
                                }
                            }
                        }
                        if (r4 != null) {
                            r4.A04.add(new C07470bZ());
                        }
                        Nightwatch$NightwatchNative.sHasLinkedFastMethodsError = false;
                        Nightwatch$NightwatchNative.sHasLinkedFastMethods = true;
                    }
                }
            }
        } catch (IOException | UnsatisfiedLinkError e) {
            AnonymousClass0LU.A0E("Nightwatch", "Error starting watcher", e);
        } catch (Throwable th4) {
            C13810oL.A00(1118364450);
            throw th4;
        }
        C13810oL.A00(851862913);
    }
}
