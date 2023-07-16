package com.google.android.gms.fido.u2f.api.common;

import X.AnonymousClass6C2;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public enum ProtocolVersion implements Parcelable {
    UNKNOWN("UNKNOWN");
    
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = C86124wJ.A0Z(78);
    }

    public static ProtocolVersion A00(String str) {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.A00)) {
                return protocolVersion;
            }
        }
        throw new AnonymousClass6C2(str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    /* access modifiers changed from: public */
    ProtocolVersion(String str) {
        this.A00 = str;
    }
}
