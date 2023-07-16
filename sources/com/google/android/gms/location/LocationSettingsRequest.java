package com.google.android.gms.location;

import X.C122167Ky;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(15);
    public zzay A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public LocationSettingsRequest(zzay zzay, List list, boolean z, boolean z2) {
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = zzay;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0K(parcel, Collections.unmodifiableList(this.A01), 1, false);
        C122167Ky.A0B(parcel, 2, this.A02);
        C122167Ky.A0B(parcel, 3, this.A03);
        C122167Ky.A0D(parcel, this.A00, 5, i, false);
        C122167Ky.A05(parcel, A002);
    }
}
