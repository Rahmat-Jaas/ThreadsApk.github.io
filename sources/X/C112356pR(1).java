package X;

import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2;

/* renamed from: X.6pR  reason: invalid class name and case insensitive filesystem */
public abstract class C112356pR {
    public C104236bS A00;
    public C104236bS A01;
    public C104236bS A02;

    public final void A00(C104236bS r10, AnonymousClass67E r11) {
        AnonymousClass67E r5 = r11;
        C04220Ms.A0B(r11, 0);
        int ordinal = r11.ordinal();
        C104236bS r6 = r10;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!C04220Ms.A0I(this.A00, r10)) {
                        this.A00 = r10;
                    } else {
                        return;
                    }
                }
            } else if (!C04220Ms.A0I(this.A02, r10)) {
                this.A02 = r10;
            } else {
                return;
            }
        } else if (!C04220Ms.A0I(this.A01, r10)) {
            this.A01 = r10;
        } else {
            return;
        }
        if (this instanceof AnonymousClass59U) {
            AnonymousClass89E r4 = (AnonymousClass89E) ((AnonymousClass59U) this).A00.A01;
            C25237DiI.A00((Integer) null, r4.A06, new KtSLambdaShape1S0300000_I2(r4, r5, r6, (C146958n9) null, 3), r4.A07, 2);
            return;
        }
        for (AnonymousClass0YP invoke : ((AnonymousClass59T) this).A00.A08) {
            invoke.invoke(r11, r10);
        }
    }

    public C112356pR() {
        AnonymousClass59K r0 = AnonymousClass59K.A01;
        this.A01 = r0;
        this.A02 = r0;
        this.A00 = r0;
    }
}
