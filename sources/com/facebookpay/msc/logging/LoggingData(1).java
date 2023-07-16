package com.facebookpay.msc.logging;

import X.AnonymousClass00U;
import X.C04220Ms;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;

public final class LoggingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0X(83);
    public final String A00;

    public LoggingData(String str) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LoggingData) && C04220Ms.A0I(this.A00, ((LoggingData) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0M("LoggingData(sessionId=", this.A00, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }
}
