package X;

import kotlin.jvm.internal.KtLambdaShape18S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape27S0201000_I2;

/* renamed from: X.6wO  reason: invalid class name and case insensitive filesystem */
public final class C116086wO {
    public static final void A00(C147188nY r8, C145108jq r9, C123917Zx r10, AnonymousClass0YP r11, int i) {
        C145108jq r6 = r9;
        C123917Zx r7 = r10;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        AnonymousClass0YP r5 = r11;
        C04220Ms.A0B(r11, 2);
        r8.Cvd(-1579360880);
        AnonymousClass7DS[] r2 = {AnonymousClass7DS.A00(AnonymousClass7CD.A00, r10, A1Z), AnonymousClass7DS.A00(AnonymousClass7DA.A03, r10, A1Z), AnonymousClass7DS.A00(AnonymousClass7DA.A04, r10, A1Z)};
        int i2 = i;
        AnonymousClass7JR.A05(r8, new KtLambdaShape27S0201000_I2(i, 26, r9, r11), r2, -52928304);
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape18S0301000_I2(i2, 11, r5, r6, r7));
        }
    }

    public static final void A01(C147188nY r7, C145108jq r8, AnonymousClass0YP r9, int i) {
        C147188nY r2 = r7;
        r7.Cvd(1211832233);
        AnonymousClass06C A00 = AnonymousClass7CD.A00(r7);
        if (A00 != null) {
            C62793ak A002 = C98396Fj.A00(r2, (C147138nS) null, A00, C86104wH.A0J(A00), C881957c.class, (String) null);
            AnonymousClass7W3.A0z(r2, false);
            C881957c r1 = (C881957c) A002;
            r1.A00 = C86144wL.A0w(r8);
            r8.A4s(r2, r1.A01, r9, (i & 112) | 520);
            C147178nW AKE = r2.AKE();
            if (AKE != null) {
                C147178nW.A04(AKE, r8, r9, i, 27);
                return;
            }
            return;
        }
        throw C18180wK.A0a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }
}
