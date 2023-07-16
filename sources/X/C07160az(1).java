package X;

import android.app.Activity;
import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.0az  reason: invalid class name and case insensitive filesystem */
public final class C07160az implements AnonymousClass0NA {
    public final /* synthetic */ C07220b8 A00;

    public C07160az(C07220b8 r1) {
        this.A00 = r1;
    }

    public final void CAR(AnonymousClass0QT r8) {
        Integer num;
        C07220b8 r3 = this.A00;
        C06150Xw r6 = r3.A0D;
        if (r6 != null && r8.A03()) {
            Activity activity = r8.A00;
            boolean z = r8.A03;
            int A02 = r3.A08.A02();
            synchronized (r6) {
                if (z) {
                    num = AnonymousClass006.A05;
                } else {
                    num = AnonymousClass006.A06;
                }
                char c = ' ';
                C019809f r1 = r6.A0B;
                if (!(r1 == null || activity == null)) {
                    c = r1.A00(C019409a.A01(activity));
                }
                if (A02 > 127) {
                    A02 = StringTreeSet.MAX_SYMBOL_COUNT;
                }
                C06150Xw.A02(r6, num, (byte) c, (byte) A02);
            }
        }
    }

    public final void CAS(AnonymousClass0QT r8) {
        Integer num;
        C07220b8 r3 = this.A00;
        C06150Xw r6 = r3.A0D;
        if (r6 != null && r8.A03()) {
            Activity activity = r8.A00;
            boolean z = r8.A03;
            int A02 = r3.A08.A02();
            synchronized (r6) {
                if (z) {
                    num = AnonymousClass006.A03;
                } else {
                    num = AnonymousClass006.A04;
                }
                char c = ' ';
                C019809f r1 = r6.A0B;
                if (!(r1 == null || activity == null)) {
                    c = r1.A00(C019409a.A01(activity));
                }
                if (A02 > 127) {
                    A02 = StringTreeSet.MAX_SYMBOL_COUNT;
                }
                C06150Xw.A02(r6, num, (byte) c, (byte) A02);
            }
        }
    }
}
