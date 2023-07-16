package X;

import android.content.DialogInterface;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.586  reason: invalid class name */
public final class AnonymousClass586 extends C62793ak {
    public int A00 = 0;
    public int A01 = 0;
    public DialogInterface.OnClickListener A02;
    public C108486iR A03;
    public AnonymousClass6DS A04;
    public C121597Gy A05;
    public C109576kE A06;
    public C108496iS A07;
    public C880856r A08;
    public C880856r A09;
    public C880856r A0A;
    public C880856r A0B;
    public C880856r A0C;
    public C880856r A0D;
    public C880856r A0E;
    public C880856r A0F;
    public CharSequence A0G;
    public Executor A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;

    public final int A01() {
        C109576kE r0 = this.A06;
        if (r0 == null) {
            return 0;
        }
        C121597Gy r1 = this.A05;
        int i = r0.A00;
        if (i != 0) {
            return i;
        }
        if (r1 != null) {
            return 15;
        }
        return 255;
    }

    public final void A02(int i) {
        C880856r r1 = this.A0C;
        if (r1 == null) {
            r1 = C880856r.A03();
            this.A0C = r1;
        }
        A00(r1, Integer.valueOf(i));
    }

    public final void A03(CharSequence charSequence) {
        C880856r r0 = this.A0B;
        if (r0 == null) {
            r0 = C880856r.A03();
            this.A0B = r0;
        }
        A00(r0, charSequence);
    }

    public final void A04(boolean z) {
        C880856r r1 = this.A0F;
        if (r1 == null) {
            r1 = C880856r.A03();
            this.A0F = r1;
        }
        A00(r1, Boolean.valueOf(z));
    }

    public static void A00(C880856r r2, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            r2.A0H(obj);
        } else {
            r2.A0G(obj);
        }
    }
}
