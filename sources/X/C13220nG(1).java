package X;

import android.os.Handler;

/* renamed from: X.0nG  reason: invalid class name and case insensitive filesystem */
public final class C13220nG extends AnonymousClass0hW {
    public final boolean A01(Object obj) {
        Handler handler = this.A04;
        Runnable runnable = this.A06;
        handler.removeCallbacks(runnable);
        this.A01 = obj;
        long j = this.A03;
        if (j == 0) {
            handler.post(runnable);
        } else {
            handler.postDelayed(runnable, j);
        }
        this.A02 = true;
        return true;
    }

    public C13220nG(Handler handler, C09990hX r2, long j) {
        super(handler, r2, j);
    }
}
