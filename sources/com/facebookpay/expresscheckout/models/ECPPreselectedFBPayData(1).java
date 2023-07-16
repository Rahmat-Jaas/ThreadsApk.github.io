package com.facebookpay.expresscheckout.models;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ECPPreselectedFBPayData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(24);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ECPPreselectedFBPayData) {
                ECPPreselectedFBPayData eCPPreselectedFBPayData = (ECPPreselectedFBPayData) obj;
                if (!C04220Ms.A0I(this.A00, eCPPreselectedFBPayData.A00) || !C04220Ms.A0I(this.A03, eCPPreselectedFBPayData.A03) || !C04220Ms.A0I(this.A01, eCPPreselectedFBPayData.A01) || !C04220Ms.A0I(this.A02, eCPPreselectedFBPayData.A02)) {
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A00) * 31) + AnonymousClass0wJ.A06(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + C18200wM.A09(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ECPPreselectedFBPayData(selectedCredentialId=");
        A0s.append(this.A00);
        A0s.append(", selectedShippingAddressId=");
        A0s.append(this.A03);
        A0s.append(", selectedEmailId=");
        A0s.append(this.A01);
        A0s.append(", selectedPhoneId=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public ECPPreselectedFBPayData(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public ECPPreselectedFBPayData() {
        this((String) null, (String) null, (String) null, (String) null);
    }
}
