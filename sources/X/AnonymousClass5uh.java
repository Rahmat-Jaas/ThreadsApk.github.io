package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2;

/* renamed from: X.5uh  reason: invalid class name */
public final class AnonymousClass5uh extends AnonymousClass6LM {
    public final KtCSuperShape0S1110000_I2 A00;
    public final AnonymousClass5HR A01;

    public AnonymousClass5uh(KtCSuperShape0S1110000_I2 ktCSuperShape0S1110000_I2, AnonymousClass5HR r3) {
        C04220Ms.A0B(ktCSuperShape0S1110000_I2, 2);
        this.A01 = r3;
        this.A00 = ktCSuperShape0S1110000_I2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5uh) {
                AnonymousClass5uh r5 = (AnonymousClass5uh) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18210wN.A04(this.A01));
    }
}
