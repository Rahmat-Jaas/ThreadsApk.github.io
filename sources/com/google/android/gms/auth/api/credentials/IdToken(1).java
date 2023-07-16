package com.google.android.gms.auth.api.credentials;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(68);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdToken) {
                IdToken idToken = (IdToken) obj;
                if (!C117046y2.A01(this.A00, idToken.A00) || !C117046y2.A01(this.A01, idToken.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public IdToken(String str, String str2) {
        C13320nQ.A06(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C13320nQ.A06(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.A00 = str;
        this.A01 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0H(parcel, this.A01, 2, C122167Ky.A0R(parcel, this.A00));
        C122167Ky.A05(parcel, A002);
    }
}
