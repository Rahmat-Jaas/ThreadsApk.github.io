package com.instagram.model.mediasize;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C41798MdO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;

public final class ProfilePicUrlInfo extends AnonymousClass0Sf implements Parcelable, C41798MdO {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(85);
    public final int A00;
    public final int A01;
    public final String A02;

    public ProfilePicUrlInfo(int i, String str, int i2) {
        C04220Ms.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public final ProfilePicUrlInfo D4t() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfilePicUrlInfo) {
                ProfilePicUrlInfo profilePicUrlInfo = (ProfilePicUrlInfo) obj;
                if (!(this.A00 == profilePicUrlInfo.A00 && C04220Ms.A0I(this.A02, profilePicUrlInfo.A02) && this.A01 == profilePicUrlInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
    }

    public final int getHeight() {
        return this.A00;
    }

    public final String getUrl() {
        return this.A02;
    }

    public final int getWidth() {
        return this.A01;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A07(this.A02, this.A00 * 31) + this.A01;
    }
}
