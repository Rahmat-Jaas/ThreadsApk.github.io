package com.google.android.gms.common.server.converter;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(17);
    public final int A00;
    public final StringToIntConverter A01;

    public zaa(StringToIntConverter stringToIntConverter, int i) {
        this.A00 = i;
        this.A01 = stringToIntConverter;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A0C(parcel, this.A01, 2, i, A002);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.A00 = 1;
        this.A01 = stringToIntConverter;
    }
}
