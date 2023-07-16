package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7EJ  reason: invalid class name */
public final class AnonymousClass7EJ {
    public static final C141738cs A05 = AnonymousClass6EM.A00(AnonymousClass8LM.A00, AnonymousClass8WB.A00);
    public long A00;
    public AnonymousClass7F6 A01;
    public final C147368pE A02;
    public final C147368pE A03;
    public final C147368pE A04;

    public AnonymousClass7EJ(C967266l r5, float f) {
        C04220Ms.A0B(r5, 1);
        Float valueOf = Float.valueOf(f);
        AnonymousClass7WR r3 = AnonymousClass7WR.A00;
        this.A03 = C86104wH.A0I(r3, valueOf, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = C86104wH.A0I(r3, C86124wJ.A0g(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A01 = AnonymousClass7F6.A04;
        this.A00 = C121767Ia.A01;
        this.A04 = C86104wH.A0I(r3, r5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public final void A00(C967266l r9, AnonymousClass7F6 r10, int i, int i2) {
        float f;
        float f2;
        C04220Ms.A0B(r9, 0);
        float f3 = (float) (i2 - i);
        C147368pE.A02(this.A02, f3);
        float f4 = r10.A01;
        AnonymousClass7F6 r2 = this.A01;
        if (!(f4 == r2.A01 && r10.A03 == r2.A03)) {
            if (r9 == C967266l.Vertical) {
                f4 = r10.A03;
                f = r10.A00;
            } else {
                f = r10.A02;
            }
            C147368pE r3 = this.A03;
            float A002 = C18240wQ.A00(r3.getValue());
            float f5 = (float) i;
            float f6 = A002 + f5;
            if (f > f6 || (f4 < A002 && f - f4 > f5)) {
                f2 = f - f6;
            } else if (f4 >= A002 || f - f4 > f5) {
                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                f2 = f4 - A002;
            }
            C147368pE.A02(r3, C18240wQ.A00(r3.getValue()) + f2);
            this.A01 = r10;
        }
        C147368pE r22 = this.A03;
        C147368pE.A02(r22, AnonymousClass8bI.A01(C18240wQ.A00(r22.getValue()), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f3));
    }

    public AnonymousClass7EJ() {
        this(C967266l.Vertical, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }
}
