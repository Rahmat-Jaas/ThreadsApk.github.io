package android.support.v4.media;

import X.C18190wL;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(0);
    public final int A00;
    public final MediaDescriptionCompat A01;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("MediaItem{");
        A0s.append("mFlags=");
        A0s.append(this.A00);
        A0s.append(", mDescription=");
        A0s.append(this.A01);
        return C18190wL.A0o(A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        this.A01.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
