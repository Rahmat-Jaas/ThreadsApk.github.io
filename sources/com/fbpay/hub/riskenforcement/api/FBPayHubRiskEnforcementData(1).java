package com.fbpay.hub.riskenforcement.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3ZT;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C86114wI;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public class FBPayHubRiskEnforcementData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(9);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayHubRiskEnforcementData) {
                FBPayHubRiskEnforcementData fBPayHubRiskEnforcementData = (FBPayHubRiskEnforcementData) obj;
                if (this.A00 != fBPayHubRiskEnforcementData.A00 || this.A01 != fBPayHubRiskEnforcementData.A01 || !AnonymousClass3ZT.A03(this.A02, fBPayHubRiskEnforcementData.A02) || !AnonymousClass3ZT.A03(this.A03, fBPayHubRiskEnforcementData.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int intValue;
        Integer num = this.A00;
        int i = -1;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i2 = intValue + 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            i = num2.intValue();
        }
        return (((((i2 * 31) + i) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18180wK.A0y(parcel, this.A00, 0, 1);
        C18180wK.A0y(parcel, this.A01, 0, 1);
        C18190wL.A16(parcel, this.A02, 0, 1);
        C18190wL.A16(parcel, this.A03, 0, 1);
    }

    public FBPayHubRiskEnforcementData(Parcel parcel) {
        String str = null;
        if (C86114wI.A08(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = C18210wN.A0U(parcel, 5);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = C18210wN.A0U(parcel, 7);
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = C86114wI.A0l(parcel);
    }
}
