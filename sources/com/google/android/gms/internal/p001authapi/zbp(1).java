package com.google.android.gms.internal.p001authapi;

import X.C122167Ky;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* renamed from: com.google.android.gms.internal.auth-api.zbp  reason: invalid package */
public final class zbp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(85);
    public final Credential A00;

    public zbp(Credential credential) {
        this.A00 = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0C(parcel, this.A00, 1, i, C122167Ky.A00(parcel));
    }
}
