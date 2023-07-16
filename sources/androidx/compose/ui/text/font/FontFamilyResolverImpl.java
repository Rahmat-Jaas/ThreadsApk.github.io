package androidx.compose.ui.text.font;

import X.AnonymousClass0YY;
import X.AnonymousClass6FY;
import X.AnonymousClass6ZU;
import X.AnonymousClass7DQ;
import X.AnonymousClass8d8;
import X.C04220Ms;
import X.C106876fm;
import X.C115206ug;
import X.C115496vG;
import X.C1188372l;
import X.C123747Yk;
import X.C134817yQ;
import X.C143078g4;
import X.C146748mn;
import X.C147348pC;
import X.C81784oM;
import X.C86154wM;
import X.C86164wN;
import kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1;

public final class FontFamilyResolverImpl implements C143078g4 {
    public final AnonymousClass7DQ A00;
    public final AnonymousClass8d8 A01;
    public final C146748mn A02;
    public final C106876fm A03;
    public final AnonymousClass0YY A04 = C86154wM.A10(this, 47);

    public final C81784oM Cen(C1188372l r9, C134817yQ r10, int i, int i2) {
        C134817yQ r4 = r10;
        C04220Ms.A0B(r10, 1);
        int i3 = ((C123747Yk) this.A02).A00;
        if (!(i3 == 0 || i3 == Integer.MAX_VALUE)) {
            int i4 = r10.A00 + i3;
            if (i4 < 1) {
                i4 = 1;
            } else if (i4 > 1000) {
                i4 = 1000;
            }
            r4 = new C134817yQ(i4);
        }
        return A00(this, new C115206ug(r9, r4, (Object) null, i, i2));
    }

    public /* synthetic */ FontFamilyResolverImpl(AnonymousClass8d8 r5, C146748mn r6) {
        C106876fm r3 = AnonymousClass6ZU.A01;
        AnonymousClass7DQ r0 = new AnonymousClass7DQ(AnonymousClass6ZU.A00, 2);
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r3;
        this.A00 = r0;
    }

    public static final C81784oM A00(FontFamilyResolverImpl fontFamilyResolverImpl, C115206ug r7) {
        C115496vG r2;
        C147348pC r1;
        C106876fm r5 = fontFamilyResolverImpl.A03;
        KtLambdaShape40S0200000_I2_1 A11 = C86164wN.A11(fontFamilyResolverImpl, r7, 17);
        AnonymousClass6FY r3 = r5.A01;
        synchronized (r3) {
            r2 = r5.A00;
            r1 = (C147348pC) r2.A01(r7);
        }
        if (r1 != null) {
            return r1;
        }
        try {
            C147348pC r12 = (C147348pC) A11.invoke(C86164wN.A11(r5, r7, 18));
            synchronized (r3) {
                if (r2.A01(r7) == null) {
                    r2.A02(r7, r12);
                }
            }
            return r12;
        } catch (Exception e) {
            throw new IllegalStateException("Could not load font", e);
        }
    }
}
