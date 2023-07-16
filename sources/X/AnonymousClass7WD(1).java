package X;

import android.view.Choreographer;
import kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1;

/* renamed from: X.7WD  reason: invalid class name */
public final class AnonymousClass7WD implements C148808sD {
    public final Choreographer A00;

    public final /* synthetic */ C142578fF Aqq() {
        return C148808sD.A00;
    }

    public AnonymousClass7WD(Choreographer choreographer) {
        this.A00 = choreographer;
    }

    public final Object ANL(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C148848sH AOA(C142578fF r2) {
        return C86144wL.A13(this, r2);
    }

    public final C27952Ew2 BgS(C142578fF r2) {
        return C86144wL.A14(this, r2);
    }

    public final C27952Ew2 CWl(C27952Ew2 ew2) {
        return C86144wL.A15(this, ew2);
    }

    public final Object DBB(C146958n9 r8, AnonymousClass0YY r9) {
        AnonymousClass8bZ r6;
        KtLambdaShape40S0200000_I2_1 ktLambdaShape40S0200000_I2_1;
        C148848sH AOA = r8.getContext().AOA(C148798sC.A00);
        if (AOA instanceof AnonymousClass8bZ) {
            r6 = (AnonymousClass8bZ) AOA;
        } else {
            r6 = null;
        }
        C27420EnC enC = new C27420EnC(1, C25598DoY.A02(r8));
        enC.A0D();
        AnonymousClass7QS r3 = new AnonymousClass7QS(this, r9, enC);
        if (r6 != null) {
            Choreographer choreographer = r6.A05;
            if (C04220Ms.A0I(choreographer, this.A00)) {
                synchronized (r6.A08) {
                    r6.A01.add(r3);
                    if (!r6.A02) {
                        r6.A02 = true;
                        choreographer.postFrameCallback(r6.A07);
                    }
                }
                ktLambdaShape40S0200000_I2_1 = C86164wN.A11(r6, r3, 14);
                enC.BQt(ktLambdaShape40S0200000_I2_1);
                return enC.A0B();
            }
        }
        this.A00.postFrameCallback(r3);
        ktLambdaShape40S0200000_I2_1 = C86164wN.A11(this, r3, 15);
        enC.BQt(ktLambdaShape40S0200000_I2_1);
        return enC.A0B();
    }
}
