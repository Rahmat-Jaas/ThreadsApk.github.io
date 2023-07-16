package com.instagram.model.direct;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;

public final class DirectRoomsXma extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(55);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public DirectRoomsXma(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A06 = z;
        this.A01 = str5;
        this.A05 = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectRoomsXma) {
                DirectRoomsXma directRoomsXma = (DirectRoomsXma) obj;
                if (!C04220Ms.A0I(this.A00, directRoomsXma.A00) || !C04220Ms.A0I(this.A04, directRoomsXma.A04) || !C04220Ms.A0I(this.A03, directRoomsXma.A03) || !C04220Ms.A0I(this.A02, directRoomsXma.A02) || this.A06 != directRoomsXma.A06 || !C04220Ms.A0I(this.A01, directRoomsXma.A01) || !C04220Ms.A0I(this.A05, directRoomsXma.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        int A032 = (((((C18180wK.A03(this.A00) + AnonymousClass0wJ.A06(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31;
        boolean z = this.A06;
        if (z) {
            z = true;
        }
        return ((((A032 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A09(this.A05);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DirectRoomsXma(roomsLink=");
        A0s.append(this.A00);
        A0s.append(", roomsTitle=");
        A0s.append(this.A04);
        A0s.append(", roomsSubtitle=");
        A0s.append(this.A03);
        A0s.append(", roomsName=");
        A0s.append(this.A02);
        A0s.append(", isAudioOnly=");
        A0s.append(this.A06);
        A0s.append(", roomsLinkHash=");
        A0s.append(this.A01);
        A0s.append(", roomsXmaType=");
        A0s.append(this.A05);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
