package com.facebook.pando;

public class Summary {
    public final long cacheAge;
    public final long cacheEndTime;
    public final long cacheStartTime;
    public final boolean isFinal;
    public final String source;

    public Summary(String str, boolean z, long j, long j2, long j3) {
        this.source = str;
        this.isFinal = z;
        this.cacheAge = j;
        this.cacheStartTime = j2;
        this.cacheEndTime = j3;
    }
}
