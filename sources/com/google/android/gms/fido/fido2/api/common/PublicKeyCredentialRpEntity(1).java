package com.google.android.gms.fido.fido2.api.common;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(42);
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        if (!C117046y2.A01(this.A00, publicKeyCredentialRpEntity.A00) || !C117046y2.A01(this.A01, publicKeyCredentialRpEntity.A01)) {
            return false;
        }
        return C117046y2.A00(this.A02, publicKeyCredentialRpEntity.A02);
    }

    public final int hashCode() {
        return C86124wJ.A0I(this.A00, this.A01, this.A02);
    }

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        C13320nQ.A01(str);
        this.A00 = str;
        C13320nQ.A01(str2);
        this.A01 = str2;
        this.A02 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0S = C122167Ky.A0S(parcel, this.A00);
        C122167Ky.A0H(parcel, this.A01, 3, A0S);
        C122167Ky.A0G(parcel, this.A02, A002, A0S);
    }
}
