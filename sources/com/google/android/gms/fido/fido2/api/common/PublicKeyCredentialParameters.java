package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import X.C97556Bv;
import X.C97576Bx;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(40);
    public final COSEAlgorithmIdentifier A00;
    public final PublicKeyCredentialType A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        if (!this.A01.equals(publicKeyCredentialParameters.A01) || !this.A00.equals(publicKeyCredentialParameters.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A01, this.A00);
    }

    public PublicKeyCredentialParameters(String str, int i) {
        C13320nQ.A01(str);
        try {
            this.A01 = PublicKeyCredentialType.A00(str);
            C13320nQ.A01(Integer.valueOf(i));
            try {
                this.A00 = COSEAlgorithmIdentifier.A00(i);
            } catch (C97556Bv e) {
                throw new IllegalArgumentException(e);
            }
        } catch (C97576Bx e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0H(parcel, this.A01.toString(), 2, false);
        int AQ5 = this.A00.A00.AQ5();
        if (Integer.valueOf(AQ5) != null) {
            parcel.writeInt(262147);
            parcel.writeInt(AQ5);
        }
        C122167Ky.A05(parcel, A002);
    }
}
