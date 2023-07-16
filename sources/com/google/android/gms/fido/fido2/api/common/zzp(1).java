package com.google.android.gms.fido.fido2.api.common;

import X.C122167Ky;
import X.C13320nQ;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;

public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Z(64);
    public final List A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzp)) {
            return false;
        }
        List list = this.A00;
        List list2 = ((zzp) obj).A00;
        if (!list.containsAll(list2) || !list2.containsAll(list)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0F(new HashSet(this.A00));
    }

    public zzp(List list) {
        C13320nQ.A01(list);
        this.A00 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0J(parcel, this.A00, 1, C122167Ky.A00(parcel));
    }
}
