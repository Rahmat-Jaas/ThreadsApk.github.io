package com.fbpay.hub.paymentmethods.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C107376ge;
import X.C18190wL;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class FbPayNewPayPalOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(4);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayNewPayPalOption) {
                FbPayNewPayPalOption fbPayNewPayPalOption = (FbPayNewPayPalOption) obj;
                if (!AnonymousClass3ZT.A03(this.A00, fbPayNewPayPalOption.A00) || !AnonymousClass3ZT.A03(this.A01, fbPayNewPayPalOption.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C86124wJ.A0E(this.A00) * 31) + AnonymousClass0wJ.A03(this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18190wL.A16(parcel, this.A00, 0, 1);
        C18190wL.A16(parcel, this.A01, 0, 1);
    }

    public FbPayNewPayPalOption(Parcel parcel) {
        this.A00 = C86114wI.A08(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C86114wI.A0l(parcel);
    }

    public FbPayNewPayPalOption(C107376ge r2) {
        this.A00 = r2.A00;
        this.A01 = r2.A01;
    }
}
