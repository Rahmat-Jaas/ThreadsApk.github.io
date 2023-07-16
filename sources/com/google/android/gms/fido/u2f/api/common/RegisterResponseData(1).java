package com.google.android.gms.fido.u2f.api.common;

import X.AnonymousClass6C2;
import X.C113686ry;
import X.C117046y2;
import X.C122167Ky;
import X.C18210wN;
import X.C41165Ly3;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(81);
    public final String A00;
    public final byte[] A01;
    public final ProtocolVersion A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        if (!C117046y2.A01(this.A02, registerResponseData.A02) || !Arrays.equals(this.A01, registerResponseData.A01)) {
            return false;
        }
        return C117046y2.A00(this.A00, registerResponseData.A00);
    }

    public final int hashCode() {
        return C86124wJ.A0I(this.A02, C86124wJ.A0i(this.A01), this.A00);
    }

    public RegisterResponseData(String str, String str2, byte[] bArr) {
        this.A01 = bArr;
        try {
            this.A02 = ProtocolVersion.A00(str);
            this.A00 = str2;
        } catch (AnonymousClass6C2 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final String toString() {
        C113686ry r3 = new C113686ry(C18210wN.A0e(this));
        r3.A00(this.A02, "protocolVersion");
        C41165Ly3 ly3 = C41165Ly3.A00;
        byte[] bArr = this.A01;
        r3.A00(ly3.A00(bArr, bArr.length), "registerData");
        String str = this.A00;
        if (str != null) {
            r3.A00(str, "clientDataString");
        }
        return r3.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0T = C122167Ky.A0T(parcel, this.A01);
        C122167Ky.A0H(parcel, this.A02.toString(), 3, A0T);
        C122167Ky.A0G(parcel, this.A00, A002, A0T);
    }
}
