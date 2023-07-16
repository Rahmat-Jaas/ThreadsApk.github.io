package com.facebook.location.platform.api;

import X.C18190wL;
import X.C18210wN;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;

public class LocationRequest extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86144wL.A0P(LocationRequest.class);

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            z = false;
            if (obj != null && getClass() == obj.getClass()) {
                throw C18210wN.A0W("equals");
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LocationRequest{mDesiredAccuracy=");
        A0s.append(2);
        A0s.append(", mMaxPowerUse=");
        A0s.append(1);
        A0s.append(", mProvider='");
        A0s.append((String) null);
        A0s.append('\'');
        A0s.append(", mIsOpportunistic=");
        A0s.append(false);
        A0s.append(", mDesiredIntervalSec=");
        A0s.append(0);
        A0s.append(", mDesiredSmallestDistanceMeters=");
        A0s.append(0);
        A0s.append(", mMaxDurationSec=");
        A0s.append(0);
        A0s.append(", mNumLocations=");
        A0s.append(0);
        A0s.append(", mBatchDurationSec=");
        A0s.append(0);
        A0s.append(", mMaxIntervalSec=");
        A0s.append(-1);
        A0s.append(", mExtraParams=");
        A0s.append((Object) null);
        return C18190wL.A0o(A0s);
    }

    public final int hashCode() {
        return ((C86104wH.A06(1801257929, 0) * 31) - 1) * 31;
    }
}
