package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;

/* renamed from: X.192  reason: invalid class name */
public final class AnonymousClass192 extends AnonymousClass0Sf implements C41882MfV {
    public final KtCSuperShape0S0110000_I2 A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass192) {
                AnonymousClass192 r5 = (AnonymousClass192) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        String name = ((C21743BzU) this.A00.A00).getName();
        if (name == null) {
            return "";
        }
        return name;
    }

    public final int hashCode() {
        int A04 = C18210wN.A04(this.A00);
        boolean z = this.A01;
        if (z) {
            z = true;
        }
        return A04 + (z ? 1 : 0);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C21743BzU bzU;
        AnonymousClass192 r5 = (AnonymousClass192) obj;
        KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2 = this.A00;
        String name = ((C21743BzU) ktCSuperShape0S0110000_I2.A00).getName();
        if (r5 == null || (bzU = (C21743BzU) r5.A00.A00) == null) {
            str = null;
        } else {
            str = bzU.getName();
        }
        if (!C04220Ms.A0I(name, str) || r5 == null) {
            return false;
        }
        if (ktCSuperShape0S0110000_I2.A01 == r5.A00.A01 && this.A01 == r5.A01) {
            return true;
        }
        return false;
    }

    public AnonymousClass192(KtCSuperShape0S0110000_I2 ktCSuperShape0S0110000_I2, boolean z) {
        this.A00 = ktCSuperShape0S0110000_I2;
        this.A01 = z;
    }
}
