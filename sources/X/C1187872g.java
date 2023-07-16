package X;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* renamed from: X.72g  reason: invalid class name and case insensitive filesystem */
public final class C1187872g {
    public static final Class[] A00 = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r2 == r1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.lang.Object r6) {
        /*
            boolean r0 = r6 instanceof X.C147328pA
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0033
            X.8pA r6 = (X.C147328pA) r6
            r0 = r6
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = (androidx.compose.runtime.ParcelableSnapshotMutableState) r0
            X.8fh r2 = r0.A01
            X.7WP r1 = X.AnonymousClass7WP.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>"
            X.C04220Ms.A0C(r1, r0)
            if (r2 == r1) goto L_0x0028
            X.7WR r1 = X.AnonymousClass7WR.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.C04220Ms.A0C(r1, r0)
            if (r2 == r1) goto L_0x0028
            X.7WQ r1 = X.AnonymousClass7WQ.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>"
            X.C04220Ms.A0C(r1, r0)
            if (r2 != r1) goto L_0x003b
        L_0x0028:
            java.lang.Object r0 = r6.getValue()
            if (r0 == 0) goto L_0x0032
            boolean r5 = A00(r0)
        L_0x0032:
            return r5
        L_0x0033:
            boolean r0 = r6 instanceof kotlin.Function
            if (r0 == 0) goto L_0x003c
            boolean r0 = r6 instanceof java.io.Serializable
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            return r4
        L_0x003c:
            java.lang.Class[] r3 = A00
            int r2 = r3.length
            r1 = 0
        L_0x0040:
            if (r1 >= r2) goto L_0x003b
            r0 = r3[r1]
            boolean r0 = r0.isInstance(r6)
            if (r0 != 0) goto L_0x0032
            int r1 = r1 + 1
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1187872g.A00(java.lang.Object):boolean");
    }
}
