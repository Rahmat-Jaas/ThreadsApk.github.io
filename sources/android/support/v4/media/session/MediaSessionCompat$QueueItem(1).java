package android.support.v4.media.session;

import X.C18180wK;
import X.C18190wL;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0W(4);
    public final long A00;
    public final MediaDescriptionCompat A01;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("MediaSession.QueueItem {Description=");
        A0s.append(this.A01);
        A0s.append(", Id=");
        A0s.append(this.A00);
        return C18180wK.A0i(" }", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        parcel.writeLong(this.A00);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.A01 = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readLong();
    }
}
