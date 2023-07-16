package com.facebook.login;

import X.AnonymousClass0wJ;
import X.AnonymousClass22w;
import X.C18180wK;
import X.C18200wM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LoginClient$Request implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(99);
    public AnonymousClass22w A00;
    public String A01;
    public boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Set A06;
    public final boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(C18200wM.A0s(this.A06));
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A00.name());
    }

    public LoginClient$Request(Parcel parcel) {
        AnonymousClass22w r0;
        this.A01 = null;
        boolean z = false;
        this.A02 = false;
        this.A00 = null;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        parcel.readStringList(A0v);
        this.A06 = new HashSet(A0v);
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A07 = C18180wK.A1V(parcel.readByte());
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readInt() == 1 ? true : z;
        String readString = parcel.readString();
        if (readString != null) {
            r0 = AnonymousClass22w.valueOf(readString);
        } else {
            r0 = AnonymousClass22w.UNKNOWN;
        }
        this.A00 = r0;
    }

    public LoginClient$Request(String str, String str2, String str3, Set set, boolean z) {
        this.A01 = null;
        this.A02 = false;
        this.A00 = null;
        this.A06 = set == null ? C18200wM.A0u() : set;
        this.A03 = str;
        this.A04 = str2;
        this.A07 = z;
        this.A05 = str3;
    }
}
