package com.google.android.gms.vision.face.internal.client;

import X.C122167Ky;
import X.C86134wK;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(53);
    public final int A00;
    public final PointF[] A01;

    public zza(PointF[] pointFArr, int i) {
        this.A01 = pointFArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0M(parcel, this.A01, 2, i);
        C122167Ky.A06(parcel, this.A00, A002);
    }
}
