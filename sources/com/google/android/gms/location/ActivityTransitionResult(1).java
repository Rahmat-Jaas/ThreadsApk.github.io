package com.google.android.gms.location;

import X.C122167Ky;
import X.C13320nQ;
import X.C86134wK;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(24);
    public Bundle A00 = null;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((ActivityTransitionResult) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public ActivityTransitionResult(Bundle bundle, List list) {
        C13320nQ.A02(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            int i = 1;
            while (i < list.size()) {
                if (((ActivityTransitionEvent) list.get(i)).A02 >= ((ActivityTransitionEvent) list.get(i - 1)).A02) {
                    i++;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0K(parcel, this.A01, 1, false);
        C122167Ky.A02(this.A00, parcel, 2);
        C122167Ky.A05(parcel, A002);
    }
}
