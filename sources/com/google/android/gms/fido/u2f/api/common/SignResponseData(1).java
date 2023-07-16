package com.google.android.gms.fido.u2f.api.common;

import X.C113686ry;
import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C18210wN;
import X.C41165Ly3;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(84);
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        if (!Arrays.equals(this.A01, signResponseData.A01) || !C117046y2.A01(this.A00, signResponseData.A00) || !Arrays.equals(this.A02, signResponseData.A02) || !Arrays.equals(this.A03, signResponseData.A03)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C86124wJ.A0i(this.A01), this.A00, C86124wJ.A0i(this.A02), C86124wJ.A0i(this.A03)});
    }

    public SignResponseData(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C13320nQ.A01(bArr);
        this.A01 = bArr;
        C13320nQ.A01(str);
        this.A00 = str;
        C13320nQ.A01(bArr2);
        this.A02 = bArr2;
        C13320nQ.A01(bArr3);
        this.A03 = bArr3;
    }

    public final String toString() {
        C113686ry r2 = new C113686ry(C18210wN.A0e(this));
        C41165Ly3 ly3 = C41165Ly3.A00;
        byte[] bArr = this.A01;
        r2.A00(ly3.A00(bArr, bArr.length), "keyHandle");
        r2.A00(this.A00, "clientDataString");
        byte[] bArr2 = this.A02;
        r2.A00(ly3.A00(bArr2, bArr2.length), "signatureData");
        byte[] bArr3 = this.A03;
        r2.A00(ly3.A00(bArr3, bArr3.length), "application");
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0T = C122167Ky.A0T(parcel, this.A01);
        C122167Ky.A0H(parcel, this.A00, 3, A0T);
        C122167Ky.A0L(parcel, this.A02, 4, A0T);
        C122167Ky.A0L(parcel, this.A03, 5, A0T);
        C122167Ky.A05(parcel, A002);
    }
}
