package com.facebook.fblibraries.fblogin;

import X.AnonymousClass0wJ;
import X.C18180wK;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;
import java.util.HashMap;
import java.util.Map;

public class FirstPartySsoSessionInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(72);
    public final SsoSource A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Map A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeMap(this.A06);
    }

    public FirstPartySsoSessionInfo(Parcel parcel) {
        this.A00 = (SsoSource) C18180wK.A0A(parcel, SsoSource.class);
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        HashMap A0y = AnonymousClass0wJ.A0y();
        this.A06 = A0y;
        parcel.readMap(A0y, Map.class.getClassLoader());
    }
}
