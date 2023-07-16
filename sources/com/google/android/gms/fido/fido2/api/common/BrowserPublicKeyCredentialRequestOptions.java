package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass0wJ;
import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(61);
    public final Uri A00;
    public final PublicKeyCredentialRequestOptions A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        if (C117046y2.A01(this.A01, browserPublicKeyCredentialRequestOptions.A01)) {
            return C117046y2.A00(this.A00, browserPublicKeyCredentialRequestOptions.A00);
        }
        return false;
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A01, this.A00);
    }

    public BrowserPublicKeyCredentialRequestOptions(Uri uri, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, byte[] bArr) {
        C13320nQ.A01(publicKeyCredentialRequestOptions);
        this.A01 = publicKeyCredentialRequestOptions;
        C13320nQ.A01(uri);
        boolean z = true;
        C13320nQ.A06(AnonymousClass0wJ.A1W(uri.getScheme()), "origin scheme must be non-empty");
        C13320nQ.A06(uri.getAuthority() == null ? false : z, "origin authority must be non-empty");
        this.A00 = uri;
        boolean z2 = true;
        if (!(bArr == null || bArr.length == 32)) {
            z2 = false;
        }
        C13320nQ.A06(z2, "clientDataHash must be 32 bytes long");
        this.A02 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0Q = C122167Ky.A0Q(parcel, this.A01, i);
        C122167Ky.A0D(parcel, this.A00, 3, i, A0Q);
        C122167Ky.A0L(parcel, this.A02, 4, A0Q);
        C122167Ky.A05(parcel, A002);
    }
}
