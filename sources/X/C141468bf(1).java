package X;

import android.os.Handler;

/* renamed from: X.8bf  reason: invalid class name and case insensitive filesystem */
public abstract class C141468bf extends C141478bg implements C145648kq {
    public final Et5 BQx(Runnable runnable, C27952Ew2 ew2, long j) {
        C141458be r4 = (C141458be) this;
        Handler handler = r4.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new C1371786k(runnable, r4);
        }
        C141458be.A02(runnable, ew2, r4);
        return C1371986m.A00;
    }
}
