package com.fbpay.logging;

import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

public final class LoggingPolicy implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(14);
    public final String A00;
    public final ArrayList A01;

    public LoggingPolicy(String str, ArrayList arrayList) {
        C04220Ms.A0B(str, 1);
        this.A00 = str;
        this.A01 = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggingPolicy) {
                LoggingPolicy loggingPolicy = (LoggingPolicy) obj;
                if (!C04220Ms.A0I(this.A00, loggingPolicy.A00) || !C04220Ms.A0I(this.A01, loggingPolicy.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A10 = C86124wJ.A10(parcel, this.A01);
        while (A10.hasNext()) {
            ((ClientSuppressionPolicy) A10.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18180wK.A03(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LoggingPolicy(loggingPolicyProduct=");
        A0s.append(this.A00);
        A0s.append(", clientSuppressionPolicy=");
        return C86104wH.A0y(this.A01, A0s);
    }
}
