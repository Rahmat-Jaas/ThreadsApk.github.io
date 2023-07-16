package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape0S1202000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1201000_I2;

/* renamed from: X.6Nb  reason: invalid class name and case insensitive filesystem */
public final class C100376Nb {
    public static final void A00(C147188nY r17, Modifier modifier, String str, AnonymousClass0YY r20, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str2 = str;
        AnonymousClass0YY r5 = r20;
        int A02 = C18200wM.A02(0, str2, r5);
        C147188nY r2 = r17;
        r2.Cvd(1212431536);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C147188nY.A0F(r2, str2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= C147188nY.A0G(r2, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= C147188nY.A0B(r2, r5);
        }
        if ((i3 & 731) != 146 || !r2.BCM()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            C147188nY r8 = r2;
            C97886Di.A00(r8, (Alignment) null, modifier2, AnonymousClass7JR.A00(r2, new KtLambdaShape4S1201000_I2(r5, AnonymousClass7J9.A02(r2).A01(new C121807If((C134817yQ) null, (C121117Ee) null, 262142, AnonymousClass7KB.A02(r2), 0, 0)), str2, i3, 1), 286443398), ((i3 >> 3) & 14) | 3072, 6, false);
        } else {
            r2.CuJ();
        }
        C147178nW AKE = r2.AKE();
        if (AKE != null) {
            ((AnonymousClass7WO) AKE).A06 = new KtLambdaShape0S1202000_I2(modifier2, r5, str2, i4, i5, A02);
        }
    }
}
