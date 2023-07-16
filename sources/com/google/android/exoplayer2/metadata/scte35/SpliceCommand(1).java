package com.google.android.exoplayer2.metadata.scte35;

import X.AnonymousClass00U;
import X.C18210wN;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;

public abstract class SpliceCommand implements Metadata.Entry {
    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ byte[] BMK() {
        return null;
    }

    public final /* synthetic */ Format BML() {
        return null;
    }

    public final String toString() {
        return AnonymousClass00U.A0L("SCTE-35 splice command: type=", C18210wN.A0e(this));
    }
}
