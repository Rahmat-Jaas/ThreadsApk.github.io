package com.google.android.gms.fido.fido2.api.common;

import X.C117046y2;
import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(38);
    public final AuthenticationExtensionsClientOutputs A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final byte[] A04;
    public final AuthenticatorAssertionResponse A05;
    public final AuthenticatorAttestationResponse A06;
    public final AuthenticatorErrorResponse A07;

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        if (!C117046y2.A01(this.A01, publicKeyCredential.A01) || !C117046y2.A01(this.A02, publicKeyCredential.A02) || !Arrays.equals(this.A04, publicKeyCredential.A04) || !C117046y2.A01(this.A06, publicKeyCredential.A06) || !C117046y2.A01(this.A05, publicKeyCredential.A05) || !C117046y2.A01(this.A07, publicKeyCredential.A07) || !C117046y2.A01(this.A00, publicKeyCredential.A00)) {
            return false;
        }
        return C117046y2.A00(this.A03, publicKeyCredential.A03);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A04, this.A05, this.A06, this.A07, this.A00, this.A03});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3 == null) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r5 != null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r5 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r1.A01 = r6;
        r1.A02 = r7;
        r1.A04 = r9;
        r1.A06 = r4;
        r1.A05 = r3;
        r1.A07 = r5;
        r1.A00 = r2;
        r1.A03 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PublicKeyCredential(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r2, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r3, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r4, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, byte[] r9) {
        /*
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L_0x000f
            if (r3 != 0) goto L_0x0009
        L_0x0007:
            if (r5 == 0) goto L_0x0013
        L_0x0009:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x000f:
            if (r3 != 0) goto L_0x0007
            if (r5 == 0) goto L_0x0009
        L_0x0013:
            r1.A01 = r6
            r1.A02 = r7
            r1.A04 = r9
            r1.A06 = r4
            r1.A05 = r3
            r1.A07 = r5
            r1.A00 = r2
            r1.A03 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.<init>(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse, java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0R = C122167Ky.A0R(parcel, this.A01);
        C122167Ky.A0H(parcel, this.A02, 2, A0R);
        C122167Ky.A0L(parcel, this.A04, 3, A0R);
        C122167Ky.A0D(parcel, this.A06, 4, i, A0R);
        C122167Ky.A0D(parcel, this.A05, 5, i, A0R);
        C122167Ky.A0D(parcel, this.A07, 6, i, A0R);
        C122167Ky.A0D(parcel, this.A00, 7, i, A0R);
        C122167Ky.A0H(parcel, this.A03, 8, A0R);
        C122167Ky.A05(parcel, A002);
    }
}
