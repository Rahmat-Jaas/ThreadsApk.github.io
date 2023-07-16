package com.instagram.appreciation.analytics;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape9S0000000_I2_9;

public final class LoggingFanData extends AnonymousClass0Sf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape9S0000000_I2_9(78);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggingFanData) {
                LoggingFanData loggingFanData = (LoggingFanData) obj;
                if (!C04220Ms.A0I(this.A03, loggingFanData.A03) || !C04220Ms.A0I(this.A02, loggingFanData.A02) || !C04220Ms.A0I(this.A00, loggingFanData.A00) || !C04220Ms.A0I(this.A01, loggingFanData.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01, AnonymousClass0wJ.A07(this.A00, AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A03))));
    }

    public LoggingFanData(String str, String str2, String str3, String str4) {
        AnonymousClass0wJ.A1O(str, str2);
        AnonymousClass0wJ.A1R(str3, str4);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A01 = str4;
    }
}
