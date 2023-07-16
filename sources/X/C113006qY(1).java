package X;

import android.os.Handler;
import kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7;

/* renamed from: X.6qY  reason: invalid class name and case insensitive filesystem */
public final class C113006qY {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final C04530Oa A04 = AnonymousClass0OY.A02(C74404aO.A00);
    public final C04530Oa A05 = AnonymousClass0OY.A02(new KtLambdaShape27S0100000_I2_7(this, 31));
    public final boolean A06;

    public final void A00() {
        if (this.A06 && !this.A00) {
            ((Handler) this.A04.getValue()).post((Runnable) this.A05.getValue());
        }
    }

    public C113006qY(int i, int i2, boolean z, long j) {
        this.A06 = z;
        this.A02 = i;
        this.A03 = j;
        this.A01 = i2;
    }
}
