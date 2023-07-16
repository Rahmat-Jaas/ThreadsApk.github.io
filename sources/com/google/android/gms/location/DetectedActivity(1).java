package com.google.android.gms.location;

import X.C122167Ky;
import X.C18180wK;
import X.C18210wN;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(25);
    public int A00;
    public int A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof DetectedActivity)) {
            return false;
        }
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        if (this.A00 == detectedActivity.A00 && this.A01 == detectedActivity.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(C18210wN.A1Y(Integer.valueOf(this.A00), this.A01));
    }

    public final String toString() {
        String str;
        int i = this.A00;
        if (i <= 22 && i >= 0) {
            if (i == 0) {
                str = "IN_VEHICLE";
            } else if (i == 1) {
                str = "ON_BICYCLE";
            } else if (i == 2) {
                str = "ON_FOOT";
            } else if (i == 3) {
                str = "STILL";
            } else if (i != 4) {
                if (i == 5) {
                    str = "TILTING";
                } else if (i == 7) {
                    str = "WALKING";
                } else if (i == 8) {
                    str = "RUNNING";
                } else if (i == 16) {
                    str = "IN_ROAD_VEHICLE";
                } else if (i != 17) {
                    str = Integer.toString(i);
                } else {
                    str = "IN_RAIL_VEHICLE";
                }
            }
            int i2 = this.A01;
            StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(str) + 48);
            A0s.append("DetectedActivity [type=");
            A0s.append(str);
            A0s.append(", confidence=");
            A0s.append(i2);
            return C18180wK.A0i("]", A0s);
        }
        str = "UNKNOWN";
        int i22 = this.A01;
        StringBuilder A0s2 = C86114wI.A0s(C86104wH.A0A(str) + 48);
        A0s2.append("DetectedActivity [type=");
        A0s2.append(str);
        A0s2.append(", confidence=");
        A0s2.append(i22);
        return C18180wK.A0i("]", A0s2);
    }

    public DetectedActivity(int i, int i2) {
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
