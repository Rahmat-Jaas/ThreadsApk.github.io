package X;

import java.util.Map;

/* renamed from: X.52x  reason: invalid class name */
public final class AnonymousClass52x extends AnonymousClass7UC implements C145728kz {
    public int A00 = -1;
    public long A01 = AnonymousClass7JK.A02;
    public final AnonymousClass50i A02;
    public final C147368pE A03;
    public final C147368pE A04;
    public final C81784oM A05;
    public final C81784oM A06;
    public final AnonymousClass0ZU A07 = C86154wM.A13(this, 8);
    public final boolean A08;
    public final float A09;

    public final void CFR() {
    }

    private final void A00() {
        AnonymousClass50i r4 = this.A02;
        this.A04.CrC((Object) null);
        C106776fb r0 = r4.A02;
        Map map = r0.A01;
        AnonymousClass50c r2 = (AnonymousClass50c) map.get(this);
        if (r2 != null) {
            r2.A00();
            Object obj = map.get(this);
            if (obj != null) {
                r0.A00.remove(obj);
            }
            map.remove(this);
            r4.A04.add(r2);
        }
    }

    public AnonymousClass52x(AnonymousClass50i r4, C81784oM r5, C81784oM r6, float f, boolean z) {
        super(r6, z);
        this.A08 = z;
        this.A09 = f;
        this.A05 = r5;
        this.A06 = r6;
        this.A02 = r4;
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A04 = C86104wH.A0I(r2, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = C86104wH.A0I(r2, C18180wK.A0Y(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public final void AIz(C147558pX r11) {
        int CfL;
        long BCH = r11.BCH();
        this.A01 = BCH;
        float f = this.A09;
        if (Float.isNaN(f)) {
            CfL = AnonymousClass8bA.A02(AnonymousClass72X.A00(r11, BCH, this.A08));
        } else {
            CfL = r11.CfL(f);
        }
        this.A00 = CfL;
        long A0A = C86114wI.A0A(this.A05);
        float f2 = ((C115076uT) this.A06.getValue()).A03;
        r11.AIq();
        A01(r11, f, A0A);
        C146678mg A012 = C147848q1.A01(r11);
        this.A03.getValue();
        AnonymousClass50c r3 = (AnonymousClass50c) this.A04.getValue();
        if (r3 != null) {
            r3.A02(f2, this.A00, r11.BCH(), A0A);
            r3.draw(((C123447Wy) A012).A00);
        }
    }

    public final void Biz() {
        A00();
    }

    public final void Bzv() {
        A00();
    }
}
