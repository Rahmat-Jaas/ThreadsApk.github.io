package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;

/* renamed from: X.5MG  reason: invalid class name */
public final class AnonymousClass5MG extends AnonymousClass0Sf implements C41882MfV {
    public final KtCSuperShape0S0100000_I2 A00;
    public final C1193674v A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MG) {
                AnonymousClass5MG r5 = (AnonymousClass5MG) obj;
                if (!"footer".equals("footer") || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "footer";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I2;
        AnonymousClass5MG r3 = (AnonymousClass5MG) obj;
        KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I22 = this.A00;
        if (r3 != null) {
            ktCSuperShape0S0100000_I2 = r3.A00;
        } else {
            ktCSuperShape0S0100000_I2 = null;
        }
        return C04220Ms.A0I(ktCSuperShape0S0100000_I22, ktCSuperShape0S0100000_I2);
    }

    public AnonymousClass5MG(KtCSuperShape0S0100000_I2 ktCSuperShape0S0100000_I2, C1193674v r2) {
        this.A00 = ktCSuperShape0S0100000_I2;
        this.A01 = r2;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A05(this.A00, -680002107));
    }
}
