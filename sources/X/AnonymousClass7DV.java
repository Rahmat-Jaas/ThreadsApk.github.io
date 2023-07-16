package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7DV  reason: invalid class name */
public final class AnonymousClass7DV {
    public Object A00;
    public boolean A01;
    public final C147368pE A02;
    public final C147368pE A03;

    public static final void A00(AnonymousClass7DV r2, int i, int i2) {
        if (((float) i) >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            C147368pE r1 = r2.A02;
            if (i != ((C114086sf) r1.getValue()).A00) {
                r1.CrC(new C114086sf(i));
            }
            C147368pE r12 = r2.A03;
            if (i2 != AnonymousClass0wJ.A04(r12.getValue())) {
                C147368pE.A03(r12, i2);
                return;
            }
            return;
        }
        throw C18190wL.A0a(C86134wK.A0r("Index should be non-negative (", i));
    }

    public AnonymousClass7DV(int i, int i2) {
        C114086sf r0 = new C114086sf(i);
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A02 = C86104wH.A0I(r2, r0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = C86104wH.A0I(r2, Integer.valueOf(i2), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public AnonymousClass7DV() {
        this(0, 0);
    }
}
