package X;

import android.view.View;
import com.facebook.forker.Process;

/* renamed from: X.7cn  reason: invalid class name and case insensitive filesystem */
public final class C125257cn implements C81874oX {
    public static final C125257cn A00 = new C125257cn();

    public final C41822MeD BaU(C112976qV r19, M5L m5l, C127397h3 r21, C127397h3 r22, int i, int i2) {
        AnonymousClass7J7 r2;
        int i3;
        AnonymousClass7Di r0;
        C127397h3 A05;
        int i4 = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), Process.WAIT_RESULT_TIMEOUT);
        C127397h3 A0K = r22.A0K(36);
        AnonymousClass7Di r5 = null;
        C112976qV r12 = r19;
        int i5 = i;
        if (A0K == null || (A05 = C127397h3.A05(A0K)) == null) {
            r2 = null;
        } else {
            r2 = AnonymousClass7J7.A02(r12, A05.ABY(r12, i5, makeMeasureSpec), A05, (Object) null, i5, makeMeasureSpec);
        }
        int size = View.MeasureSpec.getSize(i4);
        if (r2 == null || (r0 = r2.A02) == null) {
            i3 = 0;
        } else {
            i3 = AnonymousClass7Di.A00(r0);
        }
        C41822MeD ABY = r21.ABY(r12, i5, View.MeasureSpec.makeMeasureSpec(size - i3, Process.WAIT_RESULT_TIMEOUT));
        int size2 = View.MeasureSpec.getSize(i5);
        int height = ABY.getHeight() + i3;
        if (r2 != null) {
            r5 = r2.A02;
        }
        return new C127367h0(ABY, m5l, r5, size2, height, i5, i4, 0, i3);
    }
}
