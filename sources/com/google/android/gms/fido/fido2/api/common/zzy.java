package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(70);
    public final long A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzy) || this.A00 != ((zzy) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0F(Long.valueOf(this.A00));
    }

    public zzy(long j) {
        Long valueOf = Long.valueOf(j);
        C13320nQ.A01(valueOf);
        this.A00 = valueOf.longValue();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A09(parcel, 1, this.A00);
        C122167Ky.A05(parcel, A002);
    }
}
