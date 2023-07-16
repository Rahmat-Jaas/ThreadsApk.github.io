package com.google.android.exoplayer2.metadata.scte35;

import X.C37395Jr3;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(49);
    public final long A00;
    public final long A01;

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public static long A00(C37395Jr3 jr3, long j) {
        long A04 = (long) jr3.A04();
        if ((128 & A04) != 0) {
            return 8589934591L & ((((A04 & 1) << 32) | jr3.A09()) + j);
        }
        return -9223372036854775807L;
    }
}
