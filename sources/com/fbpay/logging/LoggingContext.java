package com.fbpay.logging;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18170wI;
import X.C18180wK;
import X.C18190wL;
import X.C86104wH;
import X.C86124wJ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

public final class LoggingContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = C86124wJ.A0Y(13);
    public final long A00;
    public final LoggingPolicy A01;
    public final String A02;
    public final Set A03;
    public final Set A04;
    public final boolean A05;

    public LoggingContext(LoggingPolicy loggingPolicy, String str, Set set, Set set2, long j, boolean z) {
        C04220Ms.A0B(str, 1);
        this.A02 = str;
        this.A00 = j;
        this.A01 = loggingPolicy;
        this.A03 = set;
        this.A04 = set2;
        this.A05 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggingContext) {
                LoggingContext loggingContext = (LoggingContext) obj;
                if (!C04220Ms.A0I(this.A02, loggingContext.A02) || this.A00 != loggingContext.A00 || !C04220Ms.A0I(this.A01, loggingContext.A01) || !C04220Ms.A0I(this.A03, loggingContext.A03) || !C04220Ms.A0I(this.A04, loggingContext.A04) || this.A05 != loggingContext.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        LoggingPolicy loggingPolicy = this.A01;
        if (loggingPolicy == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loggingPolicy.writeToParcel(parcel, i);
        }
        Iterator A11 = C86124wJ.A11(parcel, this.A03);
        while (A11.hasNext()) {
            parcel.writeString(C18180wK.A0k(A11));
        }
        Iterator A112 = C86124wJ.A11(parcel, this.A04);
        while (A112.hasNext()) {
            parcel.writeString(C18180wK.A0k(A112));
        }
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public final int hashCode() {
        int A052 = AnonymousClass0wJ.A05(this.A04, AnonymousClass0wJ.A05(this.A03, (C86104wH.A06(C18180wK.A03(this.A02), this.A00) + AnonymousClass0wJ.A03(this.A01)) * 31));
        boolean z = this.A05;
        if (z) {
            z = true;
        }
        return A052 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LoggingContext(sessionId=");
        A0s.append(this.A02);
        A0s.append(C18170wI.A00(241));
        A0s.append(this.A00);
        A0s.append(", loggingPolicy=");
        A0s.append(this.A01);
        A0s.append(", eventSuppressionPolicy=");
        A0s.append(this.A03);
        A0s.append(", payloadFieldSuppressionPolicy=");
        A0s.append(this.A04);
        A0s.append(", disableLogging=");
        A0s.append(this.A05);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
