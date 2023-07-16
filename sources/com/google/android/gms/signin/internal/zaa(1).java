package com.google.android.gms.signin.internal;

import X.C122167Ky;
import X.C82014ow;
import X.C86134wK;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zaa extends AbstractSafeParcelable implements C82014ow {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(36);
    public int A00;
    public Intent A01;
    public final int A02;

    public final Status BDf() {
        if (this.A00 == 0) {
            return Status.A09;
        }
        return Status.A05;
    }

    public zaa(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A02);
        C122167Ky.A08(parcel, 2, this.A00);
        C122167Ky.A0C(parcel, this.A01, 3, i, A002);
    }

    public zaa() {
        this(2, 0, (Intent) null);
    }
}
