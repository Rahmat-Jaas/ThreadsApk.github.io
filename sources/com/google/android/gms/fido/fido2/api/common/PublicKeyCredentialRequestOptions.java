package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass6C0;
import X.C117046y2;
import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(41);
    public final AuthenticationExtensions A00;
    public final TokenBinding A01;
    public final Double A02;
    public final Integer A03;
    public final String A04;
    public final List A05;
    public final byte[] A06;
    public final zzat A07;
    public final Long A08;

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialRequestOptions) {
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
            if (Arrays.equals(this.A06, publicKeyCredentialRequestOptions.A06) && C117046y2.A01(this.A02, publicKeyCredentialRequestOptions.A02) && C117046y2.A01(this.A04, publicKeyCredentialRequestOptions.A04)) {
                List list = this.A05;
                List list2 = publicKeyCredentialRequestOptions.A05;
                if (list != null ? !(list2 == null || !list.containsAll(list2) || !list2.containsAll(list)) : list2 == null) {
                    if (C117046y2.A01(this.A03, publicKeyCredentialRequestOptions.A03) && C117046y2.A01(this.A01, publicKeyCredentialRequestOptions.A01) && C117046y2.A01(this.A07, publicKeyCredentialRequestOptions.A07) && C117046y2.A01(this.A00, publicKeyCredentialRequestOptions.A00)) {
                        return C117046y2.A00(this.A08, publicKeyCredentialRequestOptions.A08);
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C86124wJ.A0i(this.A06), this.A02, this.A04, this.A05, this.A03, this.A01, this.A07, this.A00, this.A08});
    }

    public PublicKeyCredentialRequestOptions(AuthenticationExtensions authenticationExtensions, TokenBinding tokenBinding, Double d, Integer num, Long l, String str, String str2, List list, byte[] bArr) {
        C13320nQ.A01(bArr);
        this.A06 = bArr;
        this.A02 = d;
        C13320nQ.A01(str);
        this.A04 = str;
        this.A05 = list;
        this.A03 = num;
        this.A01 = tokenBinding;
        this.A08 = l;
        if (str2 != null) {
            try {
                this.A07 = zzat.A00(str2);
            } catch (AnonymousClass6C0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A00 = authenticationExtensions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        int A002 = C122167Ky.A00(parcel);
        boolean A0T = C122167Ky.A0T(parcel, this.A06);
        Double d = this.A02;
        if (d != null) {
            parcel.writeInt(524291);
            parcel.writeDouble(d.doubleValue());
        }
        C122167Ky.A0H(parcel, this.A04, 4, A0T);
        C122167Ky.A0K(parcel, this.A05, 5, A0T);
        Integer num = this.A03;
        if (num != null) {
            parcel.writeInt(262150);
            parcel.writeInt(num.intValue());
        }
        C122167Ky.A0D(parcel, this.A01, 7, i, A0T);
        zzat zzat = this.A07;
        if (zzat == null) {
            obj = null;
        } else {
            obj = zzat.toString();
        }
        C122167Ky.A0H(parcel, obj, 8, A0T);
        C122167Ky.A0D(parcel, this.A00, 9, i, A0T);
        Long l = this.A08;
        if (l != null) {
            C86134wK.A18(parcel, l, 524298);
        }
        C122167Ky.A05(parcel, A002);
    }
}
