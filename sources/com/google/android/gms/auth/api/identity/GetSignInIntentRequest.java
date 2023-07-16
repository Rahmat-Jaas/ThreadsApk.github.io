package com.google.android.gms.auth.api.identity;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import X.C86154wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(72);
    public String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final int A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        if (!C117046y2.A01(this.A01, getSignInIntentRequest.A01) || !C117046y2.A01(this.A03, getSignInIntentRequest.A03) || !C117046y2.A01(this.A02, getSignInIntentRequest.A02) || !C117046y2.A01(Boolean.valueOf(this.A04), Boolean.valueOf(getSignInIntentRequest.A04)) || this.A05 != getSignInIntentRequest.A05) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86154wM.A05(this.A01, this.A02, this.A03, Boolean.valueOf(this.A04), Integer.valueOf(this.A05));
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, int i, boolean z) {
        C13320nQ.A01(str);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = str4;
        this.A04 = z;
        this.A05 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0R = C122167Ky.A0R(parcel, this.A01);
        C122167Ky.A0H(parcel, this.A02, 2, A0R);
        C122167Ky.A0H(parcel, this.A00, 3, A0R);
        C122167Ky.A0H(parcel, this.A03, 4, A0R);
        C122167Ky.A0B(parcel, 5, this.A04);
        C122167Ky.A08(parcel, 6, this.A05);
        C122167Ky.A05(parcel, A002);
    }
}
