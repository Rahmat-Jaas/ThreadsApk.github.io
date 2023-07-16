package com.instagram.feed.media;

import X.AnonymousClass0Sf;
import X.AnonymousClass8j3;
import X.C04220Ms;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;

public final class ImageURIDict extends AnonymousClass0Sf implements Parcelable, AnonymousClass8j3 {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(55);
    public final String A00;

    public ImageURIDict(String str) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
    }

    public final ImageURIDict D4C() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImageURIDict) && C04220Ms.A0I(this.A00, ((ImageURIDict) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
