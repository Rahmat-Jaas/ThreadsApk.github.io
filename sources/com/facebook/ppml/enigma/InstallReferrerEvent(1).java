package com.facebook.ppml.enigma;

public final class InstallReferrerEvent {
    public final int activityType;
    public final String assetID;
    public final int assetType = 1;
    public final String installReferrer;
    public final long timestamp;

    public InstallReferrerEvent(String str, int i, int i2, String str2, long j) {
        this.assetID = str;
        this.activityType = i2;
        this.installReferrer = str2;
        this.timestamp = j;
    }
}
