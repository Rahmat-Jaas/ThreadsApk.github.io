package X;

import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2;

/* renamed from: X.6pq  reason: invalid class name and case insensitive filesystem */
public final class C112576pq {
    public long A00;
    public final C147368pE A01;
    public final C147368pE A02;
    public final AnonymousClass84X A03 = AnonymousClass84X.A01(new AnonymousClass7WT[16]);

    public C112576pq(String str) {
        C04220Ms.A0B(str, 1);
        AnonymousClass7WR r3 = AnonymousClass7WR.A00;
        this.A02 = C86104wH.A0I(r3, false, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A00 = Long.MIN_VALUE;
        this.A01 = C86104wH.A0I(r3, true, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public final void A00(C147188nY r6, int i) {
        r6.Cvd(-318043801);
        AnonymousClass7W3 A0Y = C147188nY.A0Y(r6);
        Object A13 = A0Y.A13();
        if (A13 == AnonymousClass7GN.A00) {
            A13 = AnonymousClass7WR.A00(A0Y, (Object) null);
        }
        AnonymousClass7W3.A0w(A0Y, false);
        C147368pE r3 = (C147368pE) A13;
        if (C86104wH.A1X(this.A01) || C86104wH.A1X(this.A02)) {
            AnonymousClass7K5.A05(r6, this, new KtSLambdaShape4S0401000_I2(this, r3, (C146958n9) null));
        }
        C147178nW AKE = r6.AKE();
        if (AKE != null) {
            C147178nW.A02(AKE, this, i, 0);
        }
    }
}
