package com.google.android.gms.auth.api.credentials;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(66);
    public final int A00;
    public final CredentialPickerConfig A01;
    public final CredentialPickerConfig A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final String[] A07;
    public final boolean A08;

    public CredentialRequest(CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, String str, String str2, String[] strArr, int i, boolean z, boolean z2, boolean z3) {
        CredentialPickerConfig credentialPickerConfig3 = credentialPickerConfig2;
        CredentialPickerConfig credentialPickerConfig4 = credentialPickerConfig;
        int i2 = i;
        this.A00 = i2;
        this.A05 = z;
        String[] strArr2 = strArr;
        C13320nQ.A01(strArr2);
        this.A07 = strArr2;
        this.A01 = credentialPickerConfig == null ? new CredentialPickerConfig(2, 1, false, true, false) : credentialPickerConfig4;
        this.A02 = credentialPickerConfig2 == null ? new CredentialPickerConfig(2, 1, false, true, false) : credentialPickerConfig3;
        if (i2 < 3) {
            this.A06 = true;
        } else {
            this.A06 = z2;
            this.A03 = str;
            this.A04 = str2;
        }
        this.A08 = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0B(parcel, 1, this.A05);
        C122167Ky.A0N(parcel, this.A07, 2);
        C122167Ky.A0D(parcel, this.A01, 3, i, false);
        C122167Ky.A0D(parcel, this.A02, 4, i, false);
        C122167Ky.A0B(parcel, 5, this.A06);
        C122167Ky.A0H(parcel, this.A03, 6, false);
        C122167Ky.A0H(parcel, this.A04, 7, false);
        C122167Ky.A0B(parcel, 8, this.A08);
        C122167Ky.A07(parcel, this.A00, A002);
    }
}
