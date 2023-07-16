package com.google.android.gms.internal.vision;

import X.C122167Ky;
import X.C86134wK;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(2);
    public final Rect A00;

    public zzaj(Rect rect) {
        this.A00 = rect;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0C(parcel, this.A00, 2, i, C122167Ky.A00(parcel));
    }

    public zzaj() {
        this.A00 = C86134wK.A0D();
    }
}
