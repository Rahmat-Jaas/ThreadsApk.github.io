package X;

import com.facebook.redex.IDxCTaskShape10S1300000_2_I2;

/* renamed from: X.6rG  reason: invalid class name and case insensitive filesystem */
public final class C113356rG {
    public final AnonymousClass7II A00;

    public final C114936uA A00(C145268kD r8, String str) {
        AnonymousClass0wJ.A1N(str, r8);
        new C114936uA();
        AnonymousClass7II r4 = this.A00;
        C114936uA r2 = new C114936uA();
        AnonymousClass7II.A01(r4, r8.ASm(), str).A01(new IDxCTaskShape10S1300000_2_I2(r2, r8, r4, str, 0));
        return r2;
    }

    public final C114936uA A01(C145268kD r10, String str) {
        C145268kD r5 = r10;
        String str2 = str;
        boolean A1Z = AnonymousClass0wJ.A1Z(str, r10);
        new C114936uA();
        AnonymousClass7II r6 = this.A00;
        C114936uA r4 = new C114936uA();
        Integer ASm = r10.ASm();
        String str3 = str;
        int intValue = ASm.intValue();
        if (intValue == A1Z) {
            str3 = "DEVICE_SCOPE_KEY_0";
        } else if (intValue != 0) {
            throw AnonymousClass4VZ.A00();
        }
        AnonymousClass7II.A01(r6, ASm, str3).A01(new IDxCTaskShape10S1300000_2_I2(r4, r5, r6, str2, A1Z ? 1 : 0));
        return r4;
    }

    public C113356rG(AnonymousClass7II r1) {
        this.A00 = r1;
    }
}
