package com.google.android.gms.fido.fido2.api.common;

import X.C113686ry;
import X.C122167Ky;
import X.C13320nQ;
import X.C18210wN;
import X.C41165Ly3;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(57);
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final String[] A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        if (!Arrays.equals(this.A00, authenticatorAttestationResponse.A00) || !Arrays.equals(this.A01, authenticatorAttestationResponse.A01) || !Arrays.equals(this.A02, authenticatorAttestationResponse.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0I(C86124wJ.A0i(this.A00), C86124wJ.A0i(this.A01), C86124wJ.A0i(this.A02));
    }

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        C13320nQ.A01(bArr);
        this.A00 = bArr;
        C13320nQ.A01(bArr2);
        this.A01 = bArr2;
        C13320nQ.A01(bArr3);
        this.A02 = bArr3;
        C13320nQ.A01(strArr);
        this.A03 = strArr;
    }

    public final String toString() {
        C113686ry r2 = new C113686ry(C18210wN.A0e(this));
        C41165Ly3 ly3 = C41165Ly3.A00;
        byte[] bArr = this.A00;
        r2.A00(ly3.A00(bArr, bArr.length), "keyHandle");
        byte[] bArr2 = this.A01;
        r2.A00(ly3.A00(bArr2, bArr2.length), "clientDataJSON");
        byte[] bArr3 = this.A02;
        r2.A00(ly3.A00(bArr3, bArr3.length), "attestationObject");
        r2.A00(Arrays.toString(this.A03), "transports");
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0T = C122167Ky.A0T(parcel, this.A00);
        C122167Ky.A0L(parcel, this.A01, 3, A0T);
        C122167Ky.A0L(parcel, this.A02, 4, A0T);
        C122167Ky.A0N(parcel, this.A03, 5);
        C122167Ky.A05(parcel, A002);
    }
}
