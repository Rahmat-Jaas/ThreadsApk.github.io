package X;

import android.os.Parcel;
import android.os.Parcelable;
import libraries.video.src.main.java.com.instagram.common.clips.model.VideoCropParams;

/* renamed from: X.7Mi  reason: invalid class name and case insensitive filesystem */
public final class C122307Mi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new VideoCropParams(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), C86104wH.A09(parcel));
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VideoCropParams[i];
    }
}
