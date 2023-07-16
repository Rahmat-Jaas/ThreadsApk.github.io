package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(69);
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzw) || this.A00 != ((zzw) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0F(Boolean.valueOf(this.A00));
    }

    public zzw(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        C13320nQ.A01(valueOf);
        this.A00 = valueOf.booleanValue();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0A(parcel, C122167Ky.A00(parcel), this.A00);
    }
}
