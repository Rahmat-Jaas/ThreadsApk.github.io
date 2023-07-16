package X;

import androidx.compose.ui.Modifier;
import com.facebook.redex.IDxDObserverShape16S0110000_2_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;
import kotlin.jvm.internal.KtLambdaShape1S0211000_I2;

/* renamed from: X.6vu  reason: invalid class name and case insensitive filesystem */
public final class C115786vu {
    public static final boolean A01(C121827Ii r3, boolean z) {
        C146508mM r0;
        C04220Ms.A0B(r3, 0);
        C113196qu r02 = r3.A02;
        if (r02 == null || (r0 = r02.A01) == null) {
            return false;
        }
        return AnonymousClass7FK.A03(AnonymousClass7FK.A02(r0), r3.A03(z));
    }

    public static final void A00(C121827Ii r16, C147188nY r17, C967466n r18, int i, boolean z) {
        C121827Ii r3 = r16;
        C967466n r9 = r18;
        AnonymousClass0wJ.A1O(r9, r3);
        C147188nY r7 = r17;
        r7.Cvd(-1344558920);
        boolean z2 = z;
        boolean A10 = C147188nY.A10(r7, Boolean.valueOf(z2), r3, 511388516);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r7;
        Object A13 = r1.A13();
        if (A10 || A13 == AnonymousClass7GN.A00) {
            A13 = new IDxDObserverShape16S0110000_2_I2(1, r3, z2);
            r1.A14(A13);
        }
        AnonymousClass7W3.A0w(r1, false);
        long A03 = r3.A03(z2);
        long A00 = AnonymousClass7HD.A00(r3.A0H);
        int i2 = i;
        AnonymousClass7FJ.A03(r7, AnonymousClass7CA.A01(Modifier.A00, A13, new KtSLambdaShape14S0201000_I2(A13, (C146958n9) null, 22, 42)), r9, (AnonymousClass0YP) null, C86154wM.A02(i << 3, 196608), A03, z2, C86134wK.A1X(C86104wH.A07(A00), C86104wH.A08(A00)));
        C147178nW AKE = r7.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape1S0211000_I2(r9, r3, i2, 0, z));
        }
    }
}
