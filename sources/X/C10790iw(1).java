package X;

import android.os.Handler;

/* renamed from: X.0iw  reason: invalid class name and case insensitive filesystem */
public final class C10790iw implements C08750eE {
    public C08760eF A00;
    public final int A01 = 500;
    public final Handler A02;
    public final Runnable A03 = new C09010ef(this);

    public C10790iw(Handler handler) {
        this.A02 = handler;
    }

    public final void ANQ() {
        C08760eF r0 = this.A00;
        if (r0 != null) {
            r0.CVM();
        }
    }

    public final void Ce3() {
        Handler handler = this.A02;
        Runnable runnable = this.A03;
        handler.removeCallbacks(runnable);
        if (this.A00 != null) {
            handler.postDelayed(runnable, (long) this.A01);
        }
    }

    public final void CqN(C08760eF r1) {
        this.A00 = r1;
    }
}
