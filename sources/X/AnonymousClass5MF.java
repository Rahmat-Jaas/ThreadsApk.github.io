package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;

/* renamed from: X.5MF  reason: invalid class name */
public final class AnonymousClass5MF extends AnonymousClass0Sf implements C41882MfV {
    public final KtCSuperShape0S0200000_I2 A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MF) {
                AnonymousClass5MF r5 = (AnonymousClass5MF) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18180wK.A03(this.A01));
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2;
        AnonymousClass5MF r3 = (AnonymousClass5MF) obj;
        KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I22 = this.A00;
        if (r3 != null) {
            ktCSuperShape0S0200000_I2 = r3.A00;
        } else {
            ktCSuperShape0S0200000_I2 = null;
        }
        return C04220Ms.A0I(ktCSuperShape0S0200000_I22, ktCSuperShape0S0200000_I2);
    }

    public AnonymousClass5MF(KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2, String str) {
        this.A01 = str;
        this.A00 = ktCSuperShape0S0200000_I2;
    }
}
