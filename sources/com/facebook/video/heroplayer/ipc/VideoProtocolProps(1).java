package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass0wJ;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape2S0000000_I2_2;

public final class VideoProtocolProps implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape2S0000000_I2_2(49);
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("subscriptionUrl: '");
        A0s.append(this.A00);
        A0s.append("', broadcasterForcedPlayback: ");
        A0s.append(this.A01);
        A0s.append(", isVideoEligible: ");
        A0s.append(this.A02);
        return A0s.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public VideoProtocolProps(Parcel parcel) {
        this.A00 = parcel.readString();
        boolean z = false;
        this.A01 = AnonymousClass0wJ.A1T(parcel.readInt(), 1);
        this.A02 = parcel.readInt() == 1 ? true : z;
    }

    public VideoProtocolProps() {
        this.A00 = "";
        this.A01 = false;
        this.A02 = false;
    }
}
