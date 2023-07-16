package androidx.compose.foundation.lazy.layout;

import X.C04220Ms;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;

public final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(13);
    public final int A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DefaultLazyKey) && this.A00 == ((DefaultLazyKey) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A00);
    }

    public final String toString() {
        return C86134wK.A0r("DefaultLazyKey(index=", this.A00);
    }

    public DefaultLazyKey(int i) {
        this.A00 = i;
    }
}
