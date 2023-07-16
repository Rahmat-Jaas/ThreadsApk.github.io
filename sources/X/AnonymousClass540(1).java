package X;

import kotlin.jvm.internal.KtLambdaShape48S0200000_I2;

/* renamed from: X.540  reason: invalid class name */
public final class AnonymousClass540 extends C115286uo {
    public float A00 = 1.0f;
    public C146068la A01;
    public C104136bI A02;
    public final C147368pE A03;
    public final C147368pE A04;
    public final C147368pE A05;
    public final AnonymousClass547 A06;

    public final void A04(C147188nY r11, String str, AnonymousClass0YC r13, float f, float f2, int i) {
        String str2 = str;
        C04220Ms.A0B(str, 0);
        r11.Cvd(1264894527);
        AnonymousClass547 r1 = this.A06;
        AnonymousClass548 r2 = r1.A06;
        r2.A09 = str;
        r2.A02();
        float f3 = f;
        if (r1.A01 != f) {
            r1.A01 = f;
            r1.A03 = true;
            r1.A02.invoke();
        }
        float f4 = f2;
        if (r1.A00 != f2) {
            r1.A00 = f2;
            r1.A03 = true;
            r1.A02.invoke();
        }
        C115506vH A002 = AnonymousClass6EH.A00(r11);
        C146068la r3 = this.A01;
        if (r3 == null || r3.BSt()) {
            r3 = new AnonymousClass7W5(new C874852y(r2), A002);
        }
        this.A01 = r3;
        AnonymousClass0YC r6 = r13;
        r3.CjK(AnonymousClass7WY.A01(new KtLambdaShape48S0200000_I2(7, r13, this), -1916507005, true));
        AnonymousClass7K5.A04(r11, r3, C86154wM.A10(r3, 26));
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AnonymousClass7WO.A00(AKE, new AnonymousClass8RV(this, str2, r6, f3, f4, i));
        }
    }

    public AnonymousClass540() {
        AnonymousClass7JK r0 = new AnonymousClass7JK(AnonymousClass7JK.A02);
        AnonymousClass7WR r3 = AnonymousClass7WR.A00;
        this.A05 = C86104wH.A0I(r3, r0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = C86104wH.A0I(r3, C18180wK.A0X(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        AnonymousClass547 r1 = new AnonymousClass547();
        r1.A02 = C86154wM.A13(this, 16);
        this.A06 = r1;
        this.A04 = C86104wH.A0I(r3, C18180wK.A0Y(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }
}
