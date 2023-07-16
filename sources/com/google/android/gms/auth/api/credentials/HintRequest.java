package com.google.android.gms.auth.api.credentials;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(67);
    public final int A00;
    public final CredentialPickerConfig A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final String[] A06;
    public final boolean A07;

    public HintRequest(CredentialPickerConfig credentialPickerConfig, String str, String str2, String[] strArr, int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        C13320nQ.A01(credentialPickerConfig);
        this.A01 = credentialPickerConfig;
        this.A04 = z;
        this.A07 = z2;
        C13320nQ.A01(strArr);
        this.A06 = strArr;
        if (i < 2) {
            this.A05 = true;
            return;
        }
        this.A05 = z3;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0P = C122167Ky.A0P(parcel, this.A01, i);
        C122167Ky.A0B(parcel, 2, this.A04);
        C122167Ky.A0B(parcel, 3, this.A07);
        C122167Ky.A0N(parcel, this.A06, 4);
        C122167Ky.A0B(parcel, 5, this.A05);
        C122167Ky.A0H(parcel, this.A02, 6, A0P);
        C122167Ky.A0H(parcel, this.A03, 7, A0P);
        C122167Ky.A07(parcel, this.A00, A002);
    }
}
