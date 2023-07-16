package com.facebook.wearable.common.comms.rtc.model2.gen;

import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape2S0000000_I2_2;
import java.util.ArrayList;
import java.util.HashSet;

public class CallIntent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape2S0000000_I2_2(53);
    public final String A00;
    public final String A01;
    public final HashSet A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CallIntent)) {
            return false;
        }
        CallIntent callIntent = (CallIntent) obj;
        if (!this.A00.equals(callIntent.A00) || !this.A02.equals(callIntent.A02) || this.A04 != callIntent.A04 || this.A05 != callIntent.A05 || this.A03 != callIntent.A03 || !this.A01.equals(callIntent.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A002 = C18210wN.A00(this.A00.hashCode());
        return C18210wN.A05(this.A01, (((((AnonymousClass0wJ.A05(this.A02, A002) + (this.A04 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CallIntent{selfId=");
        A0s.append(this.A00);
        A0s.append(",participants=");
        A0s.append(this.A02);
        A0s.append(",startWithVideo=");
        A0s.append(this.A04);
        A0s.append(",useEncryption=");
        A0s.append(this.A05);
        A0s.append(",isGroup=");
        A0s.append(this.A03);
        A0s.append(",trigger=");
        A0s.append(this.A01);
        return C18180wK.A0i("}", A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeList(C18200wM.A0s(this.A02));
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeString(this.A01);
    }

    public CallIntent(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        parcel.readList(A0v, getClass().getClassLoader());
        this.A02 = new HashSet(A0v);
        boolean z = true;
        this.A04 = C18180wK.A1V(parcel.readByte());
        this.A05 = C18180wK.A1Y(parcel);
        this.A03 = parcel.readByte() == 0 ? false : z;
        this.A01 = parcel.readString();
    }
}
