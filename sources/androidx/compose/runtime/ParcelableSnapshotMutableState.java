package androidx.compose.runtime;

import X.AnonymousClass0wJ;
import X.AnonymousClass53R;
import X.AnonymousClass7WP;
import X.AnonymousClass7WQ;
import X.AnonymousClass7WR;
import X.C04220Ms;
import X.C113516rY;
import X.C122127Kl;
import X.C122287Mf;
import X.C142848fh;
import X.C145738l0;
import X.C147328pA;
import X.C18180wK;
import X.C18190wL;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.Snapshot;

public final class ParcelableSnapshotMutableState implements Parcelable, C145738l0, C147328pA {
    public static final Parcelable.Creator CREATOR = new C122287Mf();
    public AnonymousClass53R A00;
    public final C142848fh A01;

    public final C113516rY Bg8(C113516rY r4, C113516rY r5, C113516rY r6) {
        C04220Ms.A0B(r4, 0);
        if (!this.A01.AKU(((AnonymousClass53R) r5).A00, ((AnonymousClass53R) r6).A00)) {
            return null;
        }
        return r5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C04220Ms.A0B(parcel, 0);
        parcel.writeValue(getValue());
        C142848fh r2 = this.A01;
        AnonymousClass7WP r1 = AnonymousClass7WP.A00;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        if (C04220Ms.A0I(r2, r1)) {
            i2 = 0;
        } else {
            AnonymousClass7WR r12 = AnonymousClass7WR.A00;
            C04220Ms.A0C(r12, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            if (C04220Ms.A0I(r2, r12)) {
                i2 = 1;
            } else {
                AnonymousClass7WQ r13 = AnonymousClass7WQ.A00;
                C04220Ms.A0C(r13, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
                if (C04220Ms.A0I(r2, r13)) {
                    i2 = 2;
                } else {
                    throw C18180wK.A0a("Only known types of MutableState's SnapshotMutationPolicy are supported");
                }
            }
        }
        parcel.writeInt(i2);
    }

    public final C113516rY Ail() {
        return this.A00;
    }

    public final void CXd(C113516rY r1) {
        this.A00 = (AnonymousClass53R) r1;
    }

    public final void CrC(Object obj) {
        Snapshot A002;
        AnonymousClass53R r5 = (AnonymousClass53R) C122127Kl.A06(this.A00);
        if (!this.A01.AKU(r5.A00, obj)) {
            AnonymousClass53R r4 = this.A00;
            synchronized (C122127Kl.A04) {
                A002 = C122127Kl.A00();
                AnonymousClass0wJ.A1M(r4, 0, A002);
                if (A002.A0J()) {
                    A002.A0I(this);
                }
                int A04 = A002.A04();
                int i = r5.A00;
                C113516rY r52 = r5;
                if (i != A04) {
                    C113516rY A042 = C122127Kl.A04(this, r4);
                    A042.A00 = A04;
                    A002.A0I(this);
                    r52 = A042;
                }
                ((AnonymousClass53R) r52).A00 = obj;
            }
            C122127Kl.A0C(A002, this);
        }
    }

    public final Object getValue() {
        return ((AnonymousClass53R) C122127Kl.A05(this, this.A00)).A00;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("MutableState(value=");
        A0s.append(((AnonymousClass53R) C122127Kl.A06(this.A00)).A00);
        A0s.append(")@");
        return C86144wL.A0v(A0s, hashCode());
    }

    public ParcelableSnapshotMutableState(C142848fh r2, Object obj) {
        this.A01 = r2;
        this.A00 = new AnonymousClass53R(obj);
    }
}
