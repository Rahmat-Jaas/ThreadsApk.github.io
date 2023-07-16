package com.google.android.gms.location;

import X.C122167Ky;
import X.C18180wK;
import X.C18190wL;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final List A01 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(13);
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            List<Location> list = ((LocationResult) obj).A00;
            int size = list.size();
            List list2 = this.A00;
            if (size == list2.size()) {
                Iterator it = list2.iterator();
                for (Location time : list) {
                    if (((Location) it.next()).getTime() != time.getTime()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.A00) {
            i = (i * 31) + C18190wL.A02(time.getTime());
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 27);
        A0s.append("LocationResult[locations: ");
        A0s.append(valueOf);
        return C18180wK.A0i("]", A0s);
    }

    public LocationResult(List list) {
        this.A00 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C122167Ky.A0J(parcel, this.A00, 1, C122167Ky.A00(parcel));
    }
}
