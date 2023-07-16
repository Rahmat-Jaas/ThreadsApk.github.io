package com.google.android.gms.location;

import X.C122167Ky;
import X.C18190wL;
import X.C86114wI;
import X.C86134wK;
import X.C86154wM;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.facebook.react.uimanager.BaseViewManager;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C86134wK.A0R(26);
    public float A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzo) {
                zzo zzo = (zzo) obj;
                if (!(this.A04 == zzo.A04 && this.A02 == zzo.A02 && Float.compare(this.A00, zzo.A00) == 0 && this.A03 == zzo.A03 && this.A01 == zzo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86154wM.A05(Boolean.valueOf(this.A04), Long.valueOf(this.A02), Float.valueOf(this.A00), Long.valueOf(this.A03), Integer.valueOf(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DeviceOrientationRequest[mShouldUseMag=");
        A0s.append(this.A04);
        A0s.append(" mMinimumSamplingPeriodMs=");
        A0s.append(this.A02);
        A0s.append(" mSmallestAngleChangeRadians=");
        A0s.append(this.A00);
        long j = this.A03;
        if (j != Long.MAX_VALUE) {
            A0s.append(" expireIn=");
            A0s.append(j - SystemClock.elapsedRealtime());
            A0s.append("ms");
        }
        int i = this.A01;
        if (i != Integer.MAX_VALUE) {
            A0s.append(" num=");
            A0s.append(i);
        }
        return C86114wI.A0q(A0s, ']');
    }

    public zzo(float f, int i, long j, long j2, boolean z) {
        this.A04 = z;
        this.A02 = j;
        this.A00 = f;
        this.A03 = j2;
        this.A01 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C122167Ky.A00(parcel);
        C122167Ky.A0B(parcel, 1, this.A04);
        C122167Ky.A09(parcel, 2, this.A02);
        C122167Ky.A04(parcel, this.A00, 3);
        C122167Ky.A09(parcel, 4, this.A03);
        C122167Ky.A08(parcel, 5, this.A01);
        C122167Ky.A05(parcel, A002);
    }

    public zzo() {
        this(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Integer.MAX_VALUE, 50, Long.MAX_VALUE, true);
    }
}
