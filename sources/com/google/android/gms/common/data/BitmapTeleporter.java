package com.google.android.gms.common.data;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(2);
    public ParcelFileDescriptor A00;
    public final int A01;
    public final int A02;

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            C13320nQ.A01((Object) null);
            throw null;
        }
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A01);
        C122167Ky.A0D(parcel, this.A00, 2, i | 1, false);
        C122167Ky.A08(parcel, 3, this.A02);
        C122167Ky.A05(parcel, A002);
        this.A00 = null;
    }

    public BitmapTeleporter(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        this.A01 = i;
        this.A00 = parcelFileDescriptor;
        this.A02 = i2;
    }
}
