package com.google.android.gms.fido.fido2.api.common;

import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(44);
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        if (!Arrays.equals(this.A03, publicKeyCredentialUserEntity.A03) || !C117046y2.A01(this.A00, publicKeyCredentialUserEntity.A00) || !C117046y2.A01(this.A01, publicKeyCredentialUserEntity.A01)) {
            return false;
        }
        return C117046y2.A00(this.A02, publicKeyCredentialUserEntity.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A00, this.A01, this.A02});
    }

    public PublicKeyCredentialUserEntity(String str, byte[] bArr, String str2, String str3) {
        C13320nQ.A01(bArr);
        this.A03 = bArr;
        C13320nQ.A01(str);
        this.A00 = str;
        this.A01 = str2;
        C13320nQ.A01(str3);
        this.A02 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0T = C122167Ky.A0T(parcel, this.A03);
        C122167Ky.A0H(parcel, this.A00, 3, A0T);
        C122167Ky.A0H(parcel, this.A01, 4, A0T);
        C122167Ky.A0H(parcel, this.A02, 5, A0T);
        C122167Ky.A05(parcel, A002);
    }
}
