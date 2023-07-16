package com.facebook.wearable.common.comms.rtc.model2.gen;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.C18200wM;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape2S0000000_I2_2;

public class ThreadInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape2S0000000_I2_2(56);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ThreadInfo) {
            ThreadInfo threadInfo = (ThreadInfo) obj;
            String str = this.A00;
            String str2 = threadInfo.A00;
            if (str != null ? str.equals(str2) : str2 == null) {
                String str3 = this.A01;
                String str4 = threadInfo.A01;
                if (str3 == null) {
                    if (str4 != null) {
                        return false;
                    }
                    return true;
                } else if (str3.equals(str4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return C18210wN.A00(AnonymousClass0wJ.A06(this.A00)) + C18200wM.A09(this.A01);
    }

    public final String toString() {
        return AnonymousClass00U.A0h("ThreadInfo{name=", this.A00, ",threadImageUrl=", this.A01, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A00;
        if (str != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(str);
        } else {
            parcel.writeByte((byte) 0);
        }
        String str2 = this.A01;
        if (str2 != null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(str2);
            return;
        }
        parcel.writeByte((byte) 0);
    }

    public ThreadInfo(Parcel parcel) {
        if (parcel.readByte() != 0) {
            this.A00 = parcel.readString();
        }
        if (parcel.readByte() != 0) {
            this.A01 = parcel.readString();
        }
    }
}
