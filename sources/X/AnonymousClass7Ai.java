package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape48S0200000_I2;

/* renamed from: X.7Ai  reason: invalid class name */
public final class AnonymousClass7Ai {
    public static final void A02(C147188nY r11, AnonymousClass0YP r12, AnonymousClass7DS[] r13, int i) {
        AnonymousClass8s3 AB2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        r11.Cvd(-1390796515);
        AnonymousClass7W3 r4 = (AnonymousClass7W3) r11;
        AnonymousClass8s3 A05 = AnonymousClass7W3.A05(r4);
        AnonymousClass7W3.A0s(r4, AnonymousClass7J4.A02, (Object) null, HttpStatus.SC_CREATED, 0);
        AnonymousClass7W3.A0s(r4, AnonymousClass7J4.A04, (Object) null, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 0);
        KtLambdaShape48S0200000_I2 ktLambdaShape48S0200000_I2 = new KtLambdaShape48S0200000_I2(6, A05, r13);
        C03940Lk.A03(ktLambdaShape48S0200000_I2, 2);
        Map map = (Map) C86164wN.A0a(r4, ktLambdaShape48S0200000_I2, A1Z ? 1 : 0);
        AnonymousClass7W3.A0w(r4, false);
        boolean z = false;
        if (r4.A0P) {
            C41627MVz mVz = new C41627MVz((C41622MVu) A05);
            mVz.putAll(map);
            AB2 = mVz.AB2();
            AnonymousClass7W3.A0s(r4, AnonymousClass7J4.A03, (Object) null, HttpStatus.SC_NO_CONTENT, 0);
            r4.ACY(AB2);
            r4.ACY(map);
            AnonymousClass7W3.A0w(r4, false);
            r4.A0V = A1Z;
        } else {
            AnonymousClass7AV r1 = r4.A0D;
            Object A06 = r1.A06(r1.A01, 0);
            C04220Ms.A0C(A06, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            AnonymousClass8s3 r2 = (AnonymousClass8s3) A06;
            AnonymousClass7AV r14 = r4.A0D;
            Object A062 = r14.A06(r14.A01, A1Z);
            C04220Ms.A0C(A062, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            if (!r4.BCM() || !C04220Ms.A0I(A062, map)) {
                C41627MVz mVz2 = new C41627MVz((C41622MVu) A05);
                mVz2.putAll(map);
                AB2 = mVz2.AB2();
                AnonymousClass7W3.A0s(r4, AnonymousClass7J4.A03, (Object) null, HttpStatus.SC_NO_CONTENT, 0);
                r4.ACY(AB2);
                r4.ACY(map);
                AnonymousClass7W3.A0w(r4, false);
                z = C86144wL.A1X(AB2, r2);
                if (z && !r4.A0P) {
                    r4.A0k.A00.put(r4.A0D.A01, AB2);
                }
            } else {
                r4.A03 += r4.A0D.A01();
                AB2 = r2;
            }
        }
        AnonymousClass77Y r22 = r4.A0e;
        r22.A01(r4.A0S ? 1 : 0);
        r4.A0S = z;
        r4.A0I = AB2;
        AnonymousClass7W3.A0s(r4, AnonymousClass7J4.A00, AB2, HttpStatus.SC_ACCEPTED, 0);
        C86104wH.A1S(r11, r12, i >> 3);
        AnonymousClass7W3.A0w(r4, false);
        AnonymousClass7W3.A0w(r4, false);
        r4.A0S = C18180wK.A1V(AnonymousClass77Y.A00(r22));
        r4.A0I = null;
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, r13, r12, i, 22);
        }
    }

    public static /* synthetic */ AnonymousClass534 A00(AnonymousClass0ZU r2) {
        AnonymousClass7WR r1 = AnonymousClass7WR.A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return new AnonymousClass532(r1, r2);
    }

    public static void A01(C147188nY r1, AnonymousClass0YP r2, AnonymousClass7DS[] r3, int i) {
        A02(r1, r2, r3, (i & 112) | 8);
    }
}
