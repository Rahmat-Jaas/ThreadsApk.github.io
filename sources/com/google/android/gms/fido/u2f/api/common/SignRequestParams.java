package com.google.android.gms.fido.u2f.api.common;

import X.C117046y2;
import X.C122167Ky;
import X.C86124wJ;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(83);
    public final Uri A00;
    public final ChannelIdValue A01;
    public final Double A02;
    public final Integer A03;
    public final String A04;
    public final List A05;
    public final byte[] A06;
    public final Set A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignRequestParams) {
                SignRequestParams signRequestParams = (SignRequestParams) obj;
                if (C117046y2.A01(this.A03, signRequestParams.A03) && C117046y2.A01(this.A02, signRequestParams.A02) && C117046y2.A01(this.A00, signRequestParams.A00) && Arrays.equals(this.A06, signRequestParams.A06)) {
                    List list = this.A05;
                    List list2 = signRequestParams.A05;
                    if (!list.containsAll(list2) || !list2.containsAll(list) || !C117046y2.A01(this.A01, signRequestParams.A01) || !C117046y2.A01(this.A04, signRequestParams.A04)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A00, this.A02, this.A05, this.A01, this.A04, C86124wJ.A0i(this.A06)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r7 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r12.isEmpty() != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SignRequestParams(android.net.Uri r7, com.google.android.gms.fido.u2f.api.common.ChannelIdValue r8, java.lang.Double r9, java.lang.Integer r10, java.lang.String r11, java.util.List r12, byte[] r13) {
        /*
            r6 = this;
            r6.<init>()
            r6.A03 = r10
            r6.A02 = r9
            r6.A00 = r7
            r6.A06 = r13
            r4 = 0
            if (r12 == 0) goto L_0x0015
            boolean r0 = r12.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            java.lang.String r0 = "registeredKeys must not be null or empty"
            X.C13320nQ.A06(r1, r0)
            r6.A05 = r12
            r6.A01 = r8
            java.util.HashSet r5 = X.C18200wM.A0u()
            if (r7 == 0) goto L_0x0028
            r5.add(r7)
        L_0x0028:
            java.util.Iterator r3 = r12.iterator()
        L_0x002c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004f
            java.lang.Object r0 = r3.next()
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r0 = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) r0
            java.lang.String r2 = r0.A02
            if (r2 != 0) goto L_0x003f
            r1 = 0
            if (r7 == 0) goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            java.lang.String r0 = "registered key has null appId and no request appId is provided"
            X.C13320nQ.A06(r1, r0)
            if (r2 == 0) goto L_0x002c
            android.net.Uri r0 = android.net.Uri.parse(r2)
            r5.add(r0)
            goto L_0x002c
        L_0x004f:
            r6.A07 = r5
            if (r11 == 0) goto L_0x005b
            int r1 = r11.length()
            r0 = 80
            if (r1 > r0) goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            java.lang.String r0 = "Display Hint cannot be longer than 80 characters"
            X.C13320nQ.A06(r4, r0)
            r6.A04 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.SignRequestParams.<init>(android.net.Uri, com.google.android.gms.fido.u2f.api.common.ChannelIdValue, java.lang.Double, java.lang.Integer, java.lang.String, java.util.List, byte[]):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        Integer num = this.A03;
        if (num != null) {
            parcel.writeInt(262146);
            parcel.writeInt(num.intValue());
        }
        Double d = this.A02;
        if (d != null) {
            parcel.writeInt(524291);
            parcel.writeDouble(d.doubleValue());
        }
        C122167Ky.A0D(parcel, this.A00, 4, i, false);
        C122167Ky.A0L(parcel, this.A06, 5, false);
        C122167Ky.A0K(parcel, this.A05, 6, false);
        C122167Ky.A0D(parcel, this.A01, 7, i, false);
        C122167Ky.A0H(parcel, this.A04, 8, false);
        C122167Ky.A05(parcel, A002);
    }
}
