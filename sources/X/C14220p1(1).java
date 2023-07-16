package X;

import android.content.Context;
import android.os.Build;
import com.facebook.systrace.TraceDirect;
import java.util.List;

/* renamed from: X.0p1  reason: invalid class name and case insensitive filesystem */
public final class C14220p1 {
    public static AnonymousClass0v5 A00;
    public static final C14120oq A01 = new C14120oq();
    public static volatile long A02;

    static {
        if (Build.VERSION.SDK_INT < 30) {
            A00(3);
            C14240p3 r2 = new C14240p3();
            if (C02640Cf.A05) {
                C02640Cf.A00(C02640Cf.A00, r2);
            }
        }
    }

    public static void A00(int i) {
        long j;
        boolean z;
        String str;
        Number number;
        long j2 = A02;
        boolean A002 = C14320pC.A00();
        long j3 = 0;
        if (C02640Cf.A05 && (number = (Number) C02640Cf.A00(C02640Cf.A01, "debug.fbsystrace.tags", 0L)) != null) {
            j3 = number.longValue();
        }
        if (!A002 || j3 == 0) {
            j = 0;
        } else {
            j = j3 | 1;
        }
        boolean z2 = false;
        if ((A02 != 0 || j == 0) && (j != 0 || A02 == 0)) {
            z = false;
        } else {
            z = true;
        }
        A02 = j;
        if (i == 1) {
            str = "sysprop";
        } else if (i == 2) {
            str = "broadcast";
        } else if (i == 3) {
            str = "init check";
        } else if (i != 4) {
            str = "force enable";
        } else {
            str = "section polling";
        }
        String.format("Systrace trace config update - source:%s, changed:%b, enabledTags:0x%x->0x%x", new Object[]{str, Boolean.valueOf(z), Long.valueOf(j2), Long.valueOf(A02)});
        if (z) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeSetEnabledTags(j);
            }
            if (i == 1 || i == 2) {
                z2 = true;
            }
            int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            C14120oq r4 = A01;
            if (i2 <= 0) {
                synchronized (r4.A01) {
                    r4.A00 = false;
                    int i3 = 0;
                    while (true) {
                        List list = r4.A02;
                        if (i3 < list.size()) {
                            ((C14140os) list.get(i3)).CPu();
                            i3++;
                        }
                    }
                }
            } else if (!z2) {
                r4.A00();
            } else {
                synchronized (r4.A01) {
                    C14120oq.A03.lastModified();
                    Thread thread = new Thread(new C14130or(r4), "fbsystrace notification thread");
                    thread.setPriority(10);
                    thread.start();
                }
            }
        }
    }

    public static void A01(Context context) {
        if (Build.VERSION.SDK_INT >= 30 && A00 == null) {
            A00 = new AnonymousClass0v5(context);
        }
    }

    public static void A02(C14140os r3) {
        C14120oq r2 = A01;
        synchronized (r2.A01) {
            r2.A02.add(r3);
            if (r2.A00) {
                r3.CPs();
            }
        }
    }
}
