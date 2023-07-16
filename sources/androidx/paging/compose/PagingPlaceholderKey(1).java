package androidx.paging.compose;

import X.C04220Ms;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;

public final class PagingPlaceholderKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(50);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof PagingPlaceholderKey) && this.A00 == ((PagingPlaceholderKey) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public final String toString() {
        return C86134wK.A0r("PagingPlaceholderKey(index=", this.A00);
    }

    public PagingPlaceholderKey(int i) {
        this.A00 = i;
    }
}
