package com.google.android.gms.auth.api.identity;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(78);
    public final SignInPassword A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!C117046y2.A01(this.A00, savePasswordRequest.A00) || !C117046y2.A01(this.A02, savePasswordRequest.A02) || this.A01 != savePasswordRequest.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A00, this.A02);
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        C13320nQ.A01(signInPassword);
        this.A00 = signInPassword;
        this.A02 = str;
        this.A01 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0H(parcel, this.A02, 2, C122167Ky.A0P(parcel, this.A00, i));
        C122167Ky.A06(parcel, this.A01, A002);
    }
}
