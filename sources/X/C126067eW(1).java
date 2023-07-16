package X;

import android.os.Handler;
import android.view.Window;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7eW  reason: invalid class name and case insensitive filesystem */
public final class C126067eW implements C39642KxK {
    public static final long A09;
    public static final long A0A;
    public double A00;
    public double A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public final C145808l7 A06;
    public final Handler A07;
    public final C03880Le A08;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A09 = timeUnit.toMillis(30);
        A0A = timeUnit.toMillis(30);
    }

    public final void AJS() {
        this.A05 = 0;
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A04 = System.nanoTime();
        this.A08.AJS();
        this.A06.BwA();
    }

    public C126067eW(Window window, C145808l7 r5) {
        this.A06 = r5;
        Handler A0F = AnonymousClass0wJ.A0F();
        this.A07 = A0F;
        this.A08 = new C126117eb(A0F, new C122407Rw(this), window);
    }

    public final void AHx() {
        this.A03 = System.nanoTime();
        this.A08.AHx();
        this.A07.post(new C135267z9(this));
    }
}
