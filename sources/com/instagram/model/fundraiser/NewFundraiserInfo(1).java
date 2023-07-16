package com.instagram.model.fundraiser;

import X.AnonymousClass0Sf;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape13S0000000_I2_13;
import java.util.List;

public final class NewFundraiserInfo extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape13S0000000_I2_13(75);
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NewFundraiserInfo) {
                NewFundraiserInfo newFundraiserInfo = (NewFundraiserInfo) obj;
                if (!C04220Ms.A0I(this.A02, newFundraiserInfo.A02) || this.A00 != newFundraiserInfo.A00 || !C04220Ms.A0I(this.A05, newFundraiserInfo.A05) || !C04220Ms.A0I(this.A07, newFundraiserInfo.A07) || this.A09 != newFundraiserInfo.A09 || !C04220Ms.A0I(this.A03, newFundraiserInfo.A03) || !C04220Ms.A0I(this.A06, newFundraiserInfo.A06) || !C04220Ms.A0I(this.A01, newFundraiserInfo.A01) || !C04220Ms.A0I(this.A08, newFundraiserInfo.A08) || !C04220Ms.A0I(this.A04, newFundraiserInfo.A04)) {
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
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A08);
        parcel.writeString(this.A04);
    }

    public final int hashCode() {
        int A062 = ((((((AnonymousClass0wJ.A06(this.A02) * 31) + this.A00) * 31) + AnonymousClass0wJ.A06(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A07)) * 31;
        boolean z = this.A09;
        if (z) {
            z = true;
        }
        return ((((((((((A062 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A08)) * 31) + C18200wM.A09(this.A04);
    }

    public NewFundraiserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, boolean z) {
        this.A02 = str;
        this.A00 = i;
        this.A05 = str2;
        this.A07 = str3;
        this.A09 = z;
        this.A03 = str4;
        this.A06 = str5;
        this.A01 = str6;
        this.A08 = list;
        this.A04 = str7;
    }

    public NewFundraiserInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AnonymousClass0ZV.A00, -1, false);
    }
}
