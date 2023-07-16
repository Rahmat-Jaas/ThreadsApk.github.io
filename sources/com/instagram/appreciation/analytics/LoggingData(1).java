package com.instagram.appreciation.analytics;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;

public final class LoggingData extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(77);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggingData) {
                LoggingData loggingData = (LoggingData) obj;
                if (!C04220Ms.A0I(this.A01, loggingData.A01) || !C04220Ms.A0I(this.A00, loggingData.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A00, C18180wK.A03(this.A01));
    }

    public LoggingData(String str, String str2) {
        AnonymousClass0wJ.A1O(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
