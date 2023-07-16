package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C21683ByU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape8S0000000_I2_8;
import java.util.List;

public final class ProfileTheme extends AnonymousClass0Sf implements Parcelable, C21683ByU {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape8S0000000_I2_8(94);
    public final ProfileThemeType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final ProfileTheme D08() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileTheme) {
                ProfileTheme profileTheme = (ProfileTheme) obj;
                if (!C04220Ms.A0I(this.A01, profileTheme.A01) || !C04220Ms.A0I(this.A02, profileTheme.A02) || !C04220Ms.A0I(this.A03, profileTheme.A03) || !C04220Ms.A0I(this.A06, profileTheme.A06) || !C04220Ms.A0I(this.A04, profileTheme.A04) || this.A00 != profileTheme.A00 || !C04220Ms.A0I(this.A05, profileTheme.A05)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A06);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
    }

    public final List Akv() {
        return this.A06;
    }

    public final ProfileThemeType BGH() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A05(this.A06, ((((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31))) + C18200wM.A09(this.A05);
    }

    public ProfileTheme(ProfileThemeType profileThemeType, String str, String str2, String str3, String str4, String str5, List list) {
        C18180wK.A1R(list, str4);
        C04220Ms.A0B(profileThemeType, 6);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A06 = list;
        this.A04 = str4;
        this.A00 = profileThemeType;
        this.A05 = str5;
    }
}
