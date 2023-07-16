package com.instagram.model.mediasize;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C0K;
import X.C18180wK;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;

public final class VideoVersion extends AnonymousClass0Sf implements Parcelable, C0K {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(89);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final VideoVersion D4w() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VideoVersion) {
                VideoVersion videoVersion = (VideoVersion) obj;
                if (!C04220Ms.A0I(this.A00, videoVersion.A00) || !C04220Ms.A0I(this.A03, videoVersion.A03) || !C04220Ms.A0I(this.A01, videoVersion.A01) || !C04220Ms.A0I(this.A04, videoVersion.A04) || !C04220Ms.A0I(this.A02, videoVersion.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C18180wK.A0y(parcel, this.A00, 0, 1);
        parcel.writeString(this.A03);
        C18180wK.A0y(parcel, this.A01, 0, 1);
        parcel.writeString(this.A04);
        C18180wK.A0y(parcel, this.A02, 0, 1);
    }

    public final Integer Ami() {
        return this.A00;
    }

    public final Integer BIt() {
        return this.A01;
    }

    public final Integer BMA() {
        return this.A02;
    }

    public final String getId() {
        return this.A03;
    }

    public final String getUrl() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass0wJ.A03(this.A00) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + C18200wM.A07(this.A02);
    }

    public VideoVersion(Integer num, Integer num2, Integer num3, String str, String str2) {
        this.A00 = num;
        this.A03 = str;
        this.A01 = num2;
        this.A04 = str2;
        this.A02 = num3;
    }
}
