package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2;

/* renamed from: X.6Dx  reason: invalid class name and case insensitive filesystem */
public final class C98036Dx {
    public static final C81784oM A00(C147188nY r14, AnonymousClass0ZU r15, AnonymousClass0ZU r16, AnonymousClass0ZU r17) {
        Snapshot A05;
        AnonymousClass0ZU r9 = r15;
        C04220Ms.A0B(r15, 0);
        r14.Cvb(429733345);
        AnonymousClass0ZU r8 = r16;
        AnonymousClass0ZU r11 = r17;
        boolean A12 = C147188nY.A12(r14, r11, C147188nY.A10(r14, r15, r8, 1618982084));
        AnonymousClass7W3 r4 = (AnonymousClass7W3) r14;
        Object A13 = r4.A13();
        if (A12 || A13 == AnonymousClass7GN.A00) {
            Snapshot A02 = C121637Hc.A02();
            try {
                A05 = A02.A05();
                int A04 = AnonymousClass0wJ.A04(r15.invoke());
                int A042 = AnonymousClass0wJ.A04(r8.invoke());
                int A043 = AnonymousClass0wJ.A04(r11.invoke());
                int i = (A04 / A042) * A042;
                A13 = C86104wH.A0I(AnonymousClass7WR.A00, AnonymousClass8bI.A0C(Math.max(i - A043, 0), i + A042 + A043), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
                C86144wL.A1N(A05);
                A02.A0A();
                r4.A14(A13);
            } catch (Throwable th) {
                A02.A0A();
                throw th;
            }
        }
        AnonymousClass7W3.A0w(r4, false);
        C81784oM r10 = (C81784oM) A13;
        int i2 = 0;
        Object[] A132 = C147188nY.A13(r14, r15, r8, r11, r10);
        boolean z = false;
        do {
            z = C147188nY.A12(r14, A132[i2], z);
            i2++;
        } while (i2 < 4);
        Object A133 = r4.A13();
        if (z || A133 == AnonymousClass7GN.A00) {
            A133 = new KtSLambdaShape4S0401000_I2(r8, r9, r10, r11, (C146958n9) null, 4);
            r4.A14(A133);
        }
        AnonymousClass7W3.A0b(r14, r4, A133, r10, false);
        AnonymousClass7W3.A0w(r4, false);
        return r10;
    }
}
