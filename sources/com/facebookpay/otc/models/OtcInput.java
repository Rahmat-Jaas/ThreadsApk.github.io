package com.facebookpay.otc.models;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18200wM;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class OtcInput implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(84);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OtcInput) {
                OtcInput otcInput = (OtcInput) obj;
                if (!C04220Ms.A0I(this.A00, otcInput.A00) || !C04220Ms.A0I(this.A01, otcInput.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass00U.A0e("OtcInput(otcSessionId=", this.A00, ", otcType=", this.A01, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A06(this.A00) * 31) + C18200wM.A09(this.A01);
    }

    public OtcInput(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
