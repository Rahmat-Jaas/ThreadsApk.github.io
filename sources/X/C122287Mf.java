package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.7Mf  reason: invalid class name and case insensitive filesystem */
public final class C122287Mf implements Parcelable.ClassLoaderCreator {
    /* renamed from: A00 */
    public final ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        C142848fh r1;
        String str;
        C04220Ms.A0B(parcel, 0);
        if (classLoader == null) {
            classLoader = C86114wI.A0Z(this);
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            r1 = AnonymousClass7WP.A00;
            str = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>";
        } else if (readInt == 1) {
            r1 = AnonymousClass7WR.A00;
            str = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>";
        } else if (readInt == 2) {
            r1 = AnonymousClass7WQ.A00;
            str = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>";
        } else {
            throw C18180wK.A0a(AnonymousClass00U.A0S("Unsupported MutableState policy ", " was restored", readInt));
        }
        return C86104wH.A0I(r1, readValue, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C04220Ms.A0B(parcel, 0);
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
