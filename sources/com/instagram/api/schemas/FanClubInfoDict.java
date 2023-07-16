package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.AnonymousClass1UM;
import X.AnonymousClass3D6;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C84034sR;
import X.C84624tY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;

public final class FanClubInfoDict extends AnonymousClass0Sf implements C84624tY, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape7S0000000_I2_7(79);
    public final FanClubFanConsiderationPageFeatureEligibilityResponse A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;

    public final FanClubInfoDict Cyd() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FanClubInfoDict) {
                FanClubInfoDict fanClubInfoDict = (FanClubInfoDict) obj;
                if (!C04220Ms.A0I(this.A01, fanClubInfoDict.A01) || !C04220Ms.A0I(this.A04, fanClubInfoDict.A04) || !C04220Ms.A0I(this.A06, fanClubInfoDict.A06) || !C04220Ms.A0I(this.A07, fanClubInfoDict.A07) || !C04220Ms.A0I(this.A00, fanClubInfoDict.A00) || !C04220Ms.A0I(this.A02, fanClubInfoDict.A02) || !C04220Ms.A0I(this.A03, fanClubInfoDict.A03) || !C04220Ms.A0I(this.A05, fanClubInfoDict.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        C18190wL.A14(parcel, this.A01);
        C18180wK.A0y(parcel, this.A04, 0, 1);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A00, i);
        C18190wL.A14(parcel, this.A02);
        C18190wL.A14(parcel, this.A03);
        C18180wK.A0y(parcel, this.A05, 0, 1);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3D6 AEd() {
        return new AnonymousClass1UM(this);
    }

    public final Boolean ASP() {
        return this.A01;
    }

    public final Integer AZ6() {
        return this.A04;
    }

    public final String AhE() {
        return this.A06;
    }

    public final String AhG() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ C84034sR AhI() {
        return this.A00;
    }

    public final Integer BEi() {
        return this.A05;
    }

    public final Boolean BTp() {
        return this.A02;
    }

    public final Boolean BTr() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((((((((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A07(this.A05);
    }

    public FanClubInfoDict(FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2) {
        this.A01 = bool;
        this.A04 = num;
        this.A06 = str;
        this.A07 = str2;
        this.A00 = fanClubFanConsiderationPageFeatureEligibilityResponse;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A05 = num2;
    }
}
