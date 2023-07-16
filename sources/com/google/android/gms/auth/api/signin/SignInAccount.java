package com.google.android.gms.auth.api.signin;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(88);
    public String A00;
    public String A01;
    public GoogleSignInAccount A02;

    public SignInAccount(GoogleSignInAccount googleSignInAccount, String str, String str2) {
        this.A02 = googleSignInAccount;
        C13320nQ.A05(str, "8.3 and 8.4 SDKs require non-null email");
        this.A00 = str;
        C13320nQ.A05(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.A01 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0H(parcel, this.A00, 4, false);
        C122167Ky.A0D(parcel, this.A02, 7, i, false);
        C122167Ky.A0H(parcel, this.A01, 8, false);
        C122167Ky.A05(parcel, A002);
    }
}
