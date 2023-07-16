package X;

import com.facebook.redex.IDxEHandlerShape300S0200000_I2;
import com.facebook.redex.IDxEHandlerShape806S0100000_I2;

/* renamed from: X.0ay  reason: invalid class name and case insensitive filesystem */
public final class C07150ay implements AnonymousClass0PC {
    public static C07150ay A07;
    public int A00 = 1;
    public final C04100Mg A01;
    public final C06110Xs A02;
    public final AnonymousClass0O9 A03;
    public final C06440Zj A04;
    public final AnonymousClass0Q4 A05;
    public final Object A06 = new Object();

    public final void start() {
        A07 = this;
        if (AnonymousClass0IR.A01() != null) {
            AnonymousClass0IR.A03(new IDxEHandlerShape806S0100000_I2(this, 2), 100);
        } else {
            Thread.setDefaultUncaughtExceptionHandler(new IDxEHandlerShape300S0200000_I2(1, this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public C07150ay(C04100Mg r2, C06110Xs r3, AnonymousClass0O9 r4, C06440Zj r5, AnonymousClass0Q4 r6) {
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.JAVASCRIPT;
    }
}
