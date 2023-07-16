package com.instagram.direct.rooms.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;
import com.instagram.common.typedurl.ImageUrl;

public final class RoomsUser extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(5);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public RoomsUser(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5) {
        C04220Ms.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
        this.A05 = str4;
        this.A04 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RoomsUser) {
                RoomsUser roomsUser = (RoomsUser) obj;
                if (!C04220Ms.A0I(this.A02, roomsUser.A02) || !C04220Ms.A0I(this.A01, roomsUser.A01) || !C04220Ms.A0I(this.A03, roomsUser.A03) || !C04220Ms.A0I(this.A00, roomsUser.A00) || !C04220Ms.A0I(this.A05, roomsUser.A05) || !C04220Ms.A0I(this.A04, roomsUser.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        return ((((((((C18180wK.A03(this.A02) + AnonymousClass0wJ.A06(this.A01)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + C18200wM.A09(this.A04);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("RoomsUser(id=");
        A0s.append(this.A02);
        A0s.append(", eimuId=");
        A0s.append(this.A01);
        A0s.append(", name=");
        A0s.append(this.A03);
        A0s.append(", profilePicture=");
        A0s.append(this.A00);
        A0s.append(", userName=");
        A0s.append(this.A05);
        A0s.append(", shortName=");
        A0s.append(this.A04);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
