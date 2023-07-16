package com.instagram.direct.rooms.model;

import X.AnonymousClass00U;
import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;

public final class RoomsHashtag extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(3);
    public final String A00;
    public final String A01;

    public RoomsHashtag(String str, String str2) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RoomsHashtag) {
                RoomsHashtag roomsHashtag = (RoomsHashtag) obj;
                if (!C04220Ms.A0I(this.A00, roomsHashtag.A00) || !C04220Ms.A0I(this.A01, roomsHashtag.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0e("RoomsHashtag(id=", this.A00, ", name=", this.A01, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return C18180wK.A03(this.A00) + AnonymousClass0wJ.A06(this.A01);
    }
}
