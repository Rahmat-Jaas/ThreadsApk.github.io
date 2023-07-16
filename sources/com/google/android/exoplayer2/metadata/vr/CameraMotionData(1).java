package com.google.android.exoplayer2.metadata.vr;

import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

public class CameraMotionData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(50);
    public int A00;
    public final long A01;
    public final float[] A02;

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ byte[] BMK() {
        return null;
    }

    public final /* synthetic */ Format BML() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((CameraMotionData) obj).A02);
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A06 = C86104wH.A06(527, this.A01) + Arrays.hashCode(this.A02);
        this.A00 = A06;
        return A06;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.A02);
    }

    public CameraMotionData(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A02 = parcel.createFloatArray();
    }
}
