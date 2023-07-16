package com.google.android.gms.fido.fido2.api.common;

import X.C117046y2;
import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(68);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final byte[] A04;
    public final byte[] A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        if (!C117046y2.A01(this.A00, fidoCredentialDetails.A00) || !C117046y2.A01(this.A01, fidoCredentialDetails.A01) || !Arrays.equals(this.A04, fidoCredentialDetails.A04) || !Arrays.equals(this.A05, fidoCredentialDetails.A05) || this.A02 != fidoCredentialDetails.A02 || this.A03 != fidoCredentialDetails.A03) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, this.A04, this.A05, Boolean.valueOf(this.A02), Boolean.valueOf(this.A03)});
    }

    public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = str2;
        this.A04 = bArr;
        this.A05 = bArr2;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0R = C122167Ky.A0R(parcel, this.A00);
        C122167Ky.A0H(parcel, this.A01, 2, A0R);
        C122167Ky.A0L(parcel, this.A04, 3, A0R);
        C122167Ky.A0L(parcel, this.A05, 4, A0R);
        C122167Ky.A0B(parcel, 5, this.A02);
        C122167Ky.A0B(parcel, 6, this.A03);
        C122167Ky.A05(parcel, A002);
    }
}
