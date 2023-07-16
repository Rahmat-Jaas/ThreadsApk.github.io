package X;

import com.facebook.redex.IDxFunctionShape17S1200000_2_I2;
import com.facebook.redex.IDxFunctionShape3S2200000_2_I2;
import com.facebook.redex.IDxObserverShape99S0200000_2_I2;
import com.fbpay.util.pttatresource.IDxBResourceShape34S0000000_2_I2;

/* renamed from: X.7Ek  reason: invalid class name and case insensitive filesystem */
public final class C121157Ek {
    public final AnonymousClass76O A00;
    public final C104996ci A01;
    public final C108226i1 A02;

    public final M5J A04(C120977Dl r10, String str, String str2) {
        C104996ci r6 = this.A01;
        IDxFunctionShape3S2200000_2_I2 iDxFunctionShape3S2200000_2_I2 = new IDxFunctionShape3S2200000_2_I2(this, r10, str, str2, 1);
        AnonymousClass76O r5 = this.A00;
        M5J A03 = new IDxBResourceShape34S0000000_2_I2(iDxFunctionShape3S2200000_2_I2, r5, r6, r10, 0).A03();
        A01(A03, r5);
        return A03;
    }

    public static M5J A00(C121157Ek r2, C104996ci r3, C120977Dl r4, String str, int i) {
        IDxFunctionShape17S1200000_2_I2 iDxFunctionShape17S1200000_2_I2 = new IDxFunctionShape17S1200000_2_I2(r2, r4, str, i);
        AnonymousClass76O r22 = r2.A00;
        M5J A03 = new IDxBResourceShape34S0000000_2_I2(iDxFunctionShape17S1200000_2_I2, r22, r3, r4, 0).A03();
        A01(A03, r22);
        return A03;
    }

    public static void A01(M5J m5j, AnonymousClass76O r4) {
        m5j.A0E(new IDxObserverShape99S0200000_2_I2(m5j, (C143158gC) C86114wI.A0Q(r4, 208), 27));
    }

    public final M5J A02() {
        AnonymousClass7HL r2 = this.A00.A01;
        return C86114wI.A0H(C86114wI.A0H(r2.A01.A03(), r2, 28), this, 11);
    }

    public final M5J A03(C120977Dl r8, String str) {
        IDxFunctionShape17S1200000_2_I2 iDxFunctionShape17S1200000_2_I2 = new IDxFunctionShape17S1200000_2_I2(this, r8, str, 10);
        AnonymousClass76O r2 = this.A00;
        M5J A03 = new C92955kJ(iDxFunctionShape17S1200000_2_I2, r2, r2, this.A01, r8, r8).A03();
        A03.A0E(new IDxObserverShape99S0200000_2_I2(A03, (C143158gC) C86114wI.A0Q(r2, 209), 29));
        return A03;
    }

    public C121157Ek(AnonymousClass76O r1, C104996ci r2, C108226i1 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
