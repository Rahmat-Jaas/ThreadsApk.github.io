package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;

public abstract class Id3Frame implements Metadata.Entry {
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ byte[] BMK() {
        return null;
    }

    public final /* synthetic */ Format BML() {
        return null;
    }

    public String toString() {
        return this.A00;
    }

    public Id3Frame(String str) {
        this.A00 = str;
    }
}
