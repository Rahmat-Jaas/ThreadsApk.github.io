package com.google.android.gms.location;

import X.C122167Ky;
import X.C18190wL;
import X.C86114wI;
import X.C86134wK;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(12);
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public boolean A04;
    public float A05;
    public int A06;
    public long A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationRequest) {
                LocationRequest locationRequest = (LocationRequest) obj;
                if (this.A00 == locationRequest.A00) {
                    long j = this.A01;
                    long j2 = locationRequest.A01;
                    if (j == j2 && this.A02 == locationRequest.A02 && this.A04 == locationRequest.A04 && this.A07 == locationRequest.A07 && this.A06 == locationRequest.A06 && this.A05 == locationRequest.A05) {
                        long j3 = this.A03;
                        if (j3 < j) {
                            j3 = j;
                        }
                        long j4 = locationRequest.A03;
                        if (j4 < j2) {
                            j4 = j2;
                        }
                        if (j3 == j4) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A01), Float.valueOf(this.A05), Long.valueOf(this.A03)});
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("Request[");
        int i = this.A00;
        if (i == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i == 104) {
            str = "PRIORITY_LOW_POWER";
        } else if (i != 105) {
            str = "???";
        } else {
            str = "PRIORITY_NO_POWER";
        }
        A0s.append(str);
        if (i != 105) {
            A0s.append(" requested=");
            A0s.append(this.A01);
            A0s.append("ms");
        }
        A0s.append(" fastest=");
        A0s.append(this.A02);
        A0s.append("ms");
        long j = this.A03;
        if (j > this.A01) {
            A0s.append(" maxWait=");
            A0s.append(j);
            A0s.append("ms");
        }
        float f = this.A05;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            A0s.append(" smallestDisplacement=");
            A0s.append(f);
            A0s.append("m");
        }
        long j2 = this.A07;
        if (j2 != Long.MAX_VALUE) {
            A0s.append(" expireIn=");
            A0s.append(j2 - SystemClock.elapsedRealtime());
            A0s.append("ms");
        }
        int i2 = this.A06;
        if (i2 != Integer.MAX_VALUE) {
            A0s.append(" num=");
            A0s.append(i2);
        }
        return C86114wI.A0q(A0s, ']');
    }

    public LocationRequest(float f, int i, int i2, long j, long j2, long j3, long j4, boolean z) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
        this.A04 = z;
        this.A07 = j3;
        this.A06 = i2;
        this.A05 = f;
        this.A03 = j4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A08(parcel, 1, this.A00);
        C122167Ky.A09(parcel, 2, this.A01);
        C122167Ky.A09(parcel, 3, this.A02);
        C122167Ky.A0B(parcel, 4, this.A04);
        C122167Ky.A09(parcel, 5, this.A07);
        C122167Ky.A08(parcel, 6, this.A06);
        C122167Ky.A04(parcel, this.A05, 7);
        C122167Ky.A09(parcel, 8, this.A03);
        C122167Ky.A05(parcel, A002);
    }

    public LocationRequest() {
        this.A00 = HttpStatus.SC_PROCESSING;
        this.A01 = 3600000;
        this.A02 = 600000;
        this.A04 = false;
        this.A07 = Long.MAX_VALUE;
        this.A06 = Integer.MAX_VALUE;
        this.A05 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A03 = 0;
    }
}
