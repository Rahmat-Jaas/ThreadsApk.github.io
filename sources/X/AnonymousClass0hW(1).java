package X;

import android.os.Handler;

/* renamed from: X.0hW  reason: invalid class name */
public class AnonymousClass0hW {
    public C10000hZ A00;
    public Object A01;
    public boolean A02;
    public final long A03;
    public final Handler A04;
    public final C09990hX A05;
    public final Runnable A06 = new C10010ha(this);

    public final void A00() {
        this.A04.removeCallbacks(this.A06);
        this.A02 = false;
        C10000hZ r0 = this.A00;
        if (r0 != null) {
            r0.onCancel();
        }
    }

    public boolean A01(Object obj) {
        if (C32572Cj.A00(obj, this.A01)) {
            return false;
        }
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

    public AnonymousClass0hW(Handler handler, C09990hX r3, long j) {
        this.A04 = handler;
        this.A05 = r3;
        this.A03 = j;
    }
}
