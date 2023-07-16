package com.google.android.gms.auth.api.identity;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(81);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        if (C117046y2.A01(this.A00, signInPassword.A00)) {
            return C117046y2.A00(this.A01, signInPassword.A01);
        }
        return false;
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A00, this.A01);
    }

    public SignInPassword(String str, String str2) {
        C13320nQ.A02(str, "Account identifier cannot be null");
        String trim = str.trim();
        C13320nQ.A05(trim, "Account identifier cannot be empty");
        this.A00 = trim;
        C13320nQ.A03(str2);
        this.A01 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0H(parcel, this.A01, 2, C122167Ky.A0R(parcel, this.A00));
        C122167Ky.A05(parcel, A002);
    }
}
