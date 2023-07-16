package com.google.android.gms.location;

import X.C122167Ky;
import X.C18210wN;
import X.C86114wI;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(21);
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityTransition) {
                ActivityTransition activityTransition = (ActivityTransition) obj;
                if (!(this.A00 == activityTransition.A00 && this.A01 == activityTransition.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(C18210wN.A1Y(Integer.valueOf(this.A00), this.A01));
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        StringBuilder A0s = C86114wI.A0s(75);
        A0s.append("ActivityTransition [mActivityType=");
        A0s.append(i);
        A0s.append(", mTransitionType=");
        A0s.append(i2);
        return C86114wI.A0q(A0s, ']');
    }

    public ActivityTransition(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A08(parcel, 2, this.A01);
        C122167Ky.A05(parcel, A002);
    }
}
