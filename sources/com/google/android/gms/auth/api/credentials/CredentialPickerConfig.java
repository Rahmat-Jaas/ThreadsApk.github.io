package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass0wJ;
import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(65);
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public CredentialPickerConfig(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        if (i < 2) {
            this.A01 = true == z3 ? 3 : 1;
        } else {
            this.A01 = i2;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0B(parcel, 1, this.A02);
        C122167Ky.A0B(parcel, 2, this.A03);
        int i2 = this.A01;
        C122167Ky.A0B(parcel, 3, AnonymousClass0wJ.A1T(i2, 3));
        C122167Ky.A08(parcel, 4, i2);
        C122167Ky.A07(parcel, this.A00, A002);
    }
}
