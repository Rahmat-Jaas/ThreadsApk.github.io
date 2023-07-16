package com.instagram.feed.media;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import X.C18190wL;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;

public final class FanClub extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(52);
    public final long A00;
    public final String A01;

    public FanClub(long j, String str) {
        C04220Ms.A0B(str, 2);
        this.A00 = j;
        this.A01 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FanClub) {
                FanClub fanClub = (FanClub) obj;
                if (this.A00 != fanClub.A00 || !C04220Ms.A0I(this.A01, fanClub.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, C18190wL.A02(this.A00) * 31);
    }
}
