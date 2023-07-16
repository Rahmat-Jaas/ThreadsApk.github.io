package com.google.android.gms.internal.location;

import X.C122167Ky;
import X.C82014ow;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzac extends AbstractSafeParcelable implements C82014ow {
    public static final zzac A01 = new zzac(Status.A09);
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(94);
    public final Status A00;

    public final Status BDf() {
        return this.A00;
    }

    public zzac(Status status) {
        this.A00 = status;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0C(parcel, this.A00, 1, i, C122167Ky.A00(parcel));
    }
}
