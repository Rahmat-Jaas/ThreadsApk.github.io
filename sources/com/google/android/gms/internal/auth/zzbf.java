package com.google.android.gms.internal.auth;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(91);
    public final PendingIntent A00;
    public final String A01;

    public zzbf(PendingIntent pendingIntent, String str) {
        C13320nQ.A01(str);
        this.A01 = str;
        C13320nQ.A01(pendingIntent);
        this.A00 = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, 1);
        C122167Ky.A0D(parcel, this.A00, 3, i, C122167Ky.A0S(parcel, this.A01));
        C122167Ky.A05(parcel, A002);
    }
}
