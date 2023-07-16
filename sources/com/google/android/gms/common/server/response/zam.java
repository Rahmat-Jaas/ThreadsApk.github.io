package com.google.android.gms.common.server.response;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(21);
    public final int A00;
    public final FastJsonResponse$Field A01;
    public final String A02;

    public zam(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = fastJsonResponse$Field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A0D(parcel, this.A01, 3, i, C122167Ky.A0S(parcel, this.A02));
        C122167Ky.A05(parcel, A002);
    }

    public zam(FastJsonResponse$Field fastJsonResponse$Field, String str) {
        this.A00 = 1;
        this.A02 = str;
        this.A01 = fastJsonResponse$Field;
    }
}
