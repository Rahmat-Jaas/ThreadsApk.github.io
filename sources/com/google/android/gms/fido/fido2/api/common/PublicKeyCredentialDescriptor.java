package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass5qB;
import X.C122167Ky;
import X.C13320nQ;
import X.C550331k;
import X.C86124wJ;
import X.C97576Bx;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static AnonymousClass5qB A03 = AnonymousClass5qB.A01(new Object[]{C550331k.A00, C550331k.A01}, 2);
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(39);
    public final PublicKeyCredentialType A00;
    public final List A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialDescriptor) {
            PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
            if (this.A00.equals(publicKeyCredentialDescriptor.A00) && Arrays.equals(this.A02, publicKeyCredentialDescriptor.A02)) {
                List list = this.A01;
                List list2 = publicKeyCredentialDescriptor.A01;
                if (list != null ? list2 == null || !list.containsAll(list2) || !list2.containsAll(list) : list2 != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C86124wJ.A0I(this.A00, C86124wJ.A0i(this.A02), this.A01);
    }

    public PublicKeyCredentialDescriptor(String str, List list, byte[] bArr) {
        C13320nQ.A01(str);
        try {
            this.A00 = PublicKeyCredentialType.A00(str);
            C13320nQ.A01(bArr);
            this.A02 = bArr;
            this.A01 = list;
        } catch (C97576Bx e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0S = C122167Ky.A0S(parcel, this.A00.toString());
        C122167Ky.A0L(parcel, this.A02, 3, A0S);
        C122167Ky.A0K(parcel, this.A01, 4, A0S);
        C122167Ky.A05(parcel, A002);
    }
}
