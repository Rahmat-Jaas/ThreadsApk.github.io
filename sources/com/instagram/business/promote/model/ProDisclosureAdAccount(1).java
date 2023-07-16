package com.instagram.business.promote.model;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape10S0000000_I2_10;

public final class ProDisclosureAdAccount extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape10S0000000_I2_10(26);
    public final String A00;
    public final String A01;
    public final String A02;

    public ProDisclosureAdAccount() {
        this((String) null, (String) null, (String) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProDisclosureAdAccount) {
                ProDisclosureAdAccount proDisclosureAdAccount = (ProDisclosureAdAccount) obj;
                if (!C04220Ms.A0I(this.A01, proDisclosureAdAccount.A01) || !C04220Ms.A0I(this.A02, proDisclosureAdAccount.A02) || !C04220Ms.A0I(this.A00, proDisclosureAdAccount.A00)) {
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
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A06(this.A01) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A09(this.A00);
    }

    public ProDisclosureAdAccount(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
