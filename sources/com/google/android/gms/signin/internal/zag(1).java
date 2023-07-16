package com.google.android.gms.signin.internal;

import X.C122167Ky;
import X.C82014ow;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class zag extends AbstractSafeParcelable implements C82014ow {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(37);
    public final String A00;
    public final List A01;

    public final Status BDf() {
        if (this.A00 != null) {
            return Status.A09;
        }
        return Status.A05;
    }

    public zag(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0I(parcel, this.A01, 1);
        C122167Ky.A0H(parcel, this.A00, 2, false);
        C122167Ky.A05(parcel, A002);
    }
}
