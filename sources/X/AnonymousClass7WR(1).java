package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.7WR  reason: invalid class name */
public final class AnonymousClass7WR implements C142848fh {
    public static final AnonymousClass7WR A00 = new AnonymousClass7WR();

    public final String toString() {
        return "StructuralEqualityPolicy";
    }

    public static ParcelableSnapshotMutableState A00(AnonymousClass7W3 r2, Object obj) {
        AnonymousClass7WR r1 = A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(r1, obj);
        r2.A14(parcelableSnapshotMutableState);
        return parcelableSnapshotMutableState;
    }

    public final boolean AKU(Object obj, Object obj2) {
        return C04220Ms.A0I(obj, obj2);
    }
}
