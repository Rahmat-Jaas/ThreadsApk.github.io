package com.instagram.api.schemas;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import X.C84034sR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape7S0000000_I2_7;

public final class FanClubFanConsiderationPageFeatureEligibilityResponse extends AnonymousClass0Sf implements Parcelable, C84034sR {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape7S0000000_I2_7(78);
    public final boolean A00;
    public final boolean A01;

    public final FanClubFanConsiderationPageFeatureEligibilityResponse Cyc() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FanClubFanConsiderationPageFeatureEligibilityResponse) {
                FanClubFanConsiderationPageFeatureEligibilityResponse fanClubFanConsiderationPageFeatureEligibilityResponse = (FanClubFanConsiderationPageFeatureEligibilityResponse) obj;
                if (!(this.A00 == fanClubFanConsiderationPageFeatureEligibilityResponse.A00 && this.A01 == fanClubFanConsiderationPageFeatureEligibilityResponse.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final boolean BBN() {
        return this.A00;
    }

    public final boolean BBW() {
        return this.A01;
    }

    public final int hashCode() {
        boolean z = this.A00;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        if (!this.A01) {
            i = 0;
        }
        return i2 + i;
    }

    public FanClubFanConsiderationPageFeatureEligibilityResponse(boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
    }
}
