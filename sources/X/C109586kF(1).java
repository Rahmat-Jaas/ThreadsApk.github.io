package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6kF  reason: invalid class name and case insensitive filesystem */
public final class C109586kF {
    public AnonymousClass8cT A00;
    public final C1203679w A01;
    public final C1203779x A02;
    public final C147368pE A03;

    public /* synthetic */ C109586kF(C1203679w r5, C1203779x r6, float f, int i) {
        C122647Th r3 = null;
        f = (i & 4) != 0 ? BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER : f;
        r3 = (i & 8) != 0 ? new C122647Th(AnonymousClass8Vn.A00) : r3;
        AnonymousClass0wJ.A1O(r5, r6);
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = C86104wH.A0I(AnonymousClass7WR.A00, Float.valueOf(f), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A00 = r3;
    }
}
