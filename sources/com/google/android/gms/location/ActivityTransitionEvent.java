package com.google.android.gms.location;

import X.AnonymousClass00U;
import X.C122167Ky;
import X.C13320nQ;
import X.C18180wK;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import X.C86154wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(22);
    public final int A00;
    public final int A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityTransitionEvent) {
                ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
                if (!(this.A00 == activityTransitionEvent.A00 && this.A01 == activityTransitionEvent.A01 && this.A02 == activityTransitionEvent.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86124wJ.A0I(Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A02));
    }

    public final String toString() {
        String A10 = C86104wH.A10("ActivityType ", C86114wI.A0s(24), this.A00);
        String A102 = C86104wH.A10("TransitionType ", C86114wI.A0s(26), this.A01);
        long j = this.A02;
        StringBuilder A0s = C86114wI.A0s(41);
        A0s.append("ElapsedRealTimeNanos ");
        return AnonymousClass00U.A0h(A10, " ", A102, " ", C86154wM.A0n(A0s, j));
    }

    public ActivityTransitionEvent(int i, int i2, long j) {
        boolean z = true;
        z = (i2 < 0 || i2 > 1) ? false : z;
        StringBuilder A0s = C86114wI.A0s(41);
        A0s.append("Transition type ");
        A0s.append(i2);
        C13320nQ.A06(z, C18180wK.A0i(" is not valid.", A0s));
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A08(parcel, 2, this.A01);
        C122167Ky.A09(parcel, 3, this.A02);
        C122167Ky.A05(parcel, A002);
    }
}
