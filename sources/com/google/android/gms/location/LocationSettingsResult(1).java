package com.google.android.gms.location;

import X.C122167Ky;
import X.C82014ow;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LocationSettingsResult extends AbstractSafeParcelable implements C82014ow {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(16);
    public final Status A00;
    public final LocationSettingsStates A01;

    public final Status BDf() {
        return this.A00;
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.A00 = status;
        this.A01 = locationSettingsStates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0D(parcel, this.A01, 2, i, C122167Ky.A0P(parcel, this.A00, i));
        C122167Ky.A05(parcel, A002);
    }
}
