package X;

import android.content.Context;
import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7eX  reason: invalid class name and case insensitive filesystem */
public class C126077eX implements C39642KxK {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public boolean A03 = false;
    public final double A04;
    public final C145808l7 A05;
    public final C03880Le A06;

    public final C112676q0 A00() {
        return new C112676q0(TimeUnit.NANOSECONDS.toMillis(Math.min(this.A02, A07)), Math.min(this.A01, 3600.0d), Math.min(this.A00, 1000.0d), "frame_based");
    }

    public void AHx() {
        if (this.A03) {
            this.A03 = false;
            this.A06.AHx();
            C145808l7 r1 = this.A05;
            r1.CG7(A00());
            r1.Btu();
            this.A01 = 0.0d;
            this.A00 = 0.0d;
            this.A02 = 0;
        }
    }

    public final void AJS() {
        if (!this.A03) {
            this.A03 = true;
            this.A06.AJS();
            this.A05.BwA();
        }
    }

    public C126077eX(Context context, C145808l7 r6) {
        this.A05 = r6;
        this.A06 = new C126127ec(Choreographer.getInstance(), new C126057eV(this));
        C03900Lg r0 = C03900Lg.A01;
        if (r0 == null) {
            r0 = new C03900Lg();
            C03900Lg.A01 = r0;
        }
        this.A04 = (double) r0.A00(context);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
    }
}
