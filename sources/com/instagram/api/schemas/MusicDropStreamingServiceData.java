package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;

public final class MusicDropStreamingServiceData extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape8S0000000_I2_8(60);
    public final MusicDropStreamingServiceEnum A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicDropStreamingServiceData) {
                MusicDropStreamingServiceData musicDropStreamingServiceData = (MusicDropStreamingServiceData) obj;
                if (!C04220Ms.A0I(this.A01, musicDropStreamingServiceData.A01) || this.A00 != musicDropStreamingServiceData.A00 || !C04220Ms.A0I(this.A02, musicDropStreamingServiceData.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A02, AnonymousClass0wJ.A05(this.A00, C18180wK.A03(this.A01)));
    }

    public MusicDropStreamingServiceData(MusicDropStreamingServiceEnum musicDropStreamingServiceEnum, String str, String str2) {
        AnonymousClass0wJ.A1O(str, musicDropStreamingServiceEnum);
        C04220Ms.A0B(str2, 3);
        this.A01 = str;
        this.A00 = musicDropStreamingServiceEnum;
        this.A02 = str2;
    }
}
