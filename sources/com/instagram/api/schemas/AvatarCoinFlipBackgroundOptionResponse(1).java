package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18210wN;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;

public final class AvatarCoinFlipBackgroundOptionResponse extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(98);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarCoinFlipBackgroundOptionResponse) {
                AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = (AvatarCoinFlipBackgroundOptionResponse) obj;
                if (!C04220Ms.A0I(this.A00, avatarCoinFlipBackgroundOptionResponse.A00) || !C04220Ms.A0I(this.A01, avatarCoinFlipBackgroundOptionResponse.A01) || !C04220Ms.A0I(this.A02, avatarCoinFlipBackgroundOptionResponse.A02) || !C04220Ms.A0I(this.A03, avatarCoinFlipBackgroundOptionResponse.A03)) {
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
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A03, AnonymousClass0wJ.A07(this.A02, AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A06(this.A00) * 31)));
    }

    public AvatarCoinFlipBackgroundOptionResponse(String str, String str2, String str3, String str4) {
        AnonymousClass0wJ.A1Q(str2, str3);
        C04220Ms.A0B(str4, 4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
