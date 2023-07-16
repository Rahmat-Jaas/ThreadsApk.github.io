package com.google.android.gms.location;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(14);
    public final String A00;
    public final String A01;
    public final String A02;

    public zzay(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        boolean A0R = C122167Ky.A0R(parcel, this.A00);
        C122167Ky.A0H(parcel, this.A01, 2, A0R);
        C122167Ky.A0H(parcel, this.A02, 5, A0R);
        C122167Ky.A05(parcel, A002);
    }
}
