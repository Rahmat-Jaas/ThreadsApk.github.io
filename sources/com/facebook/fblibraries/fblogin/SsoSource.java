package com.facebook.fblibraries.fblogin;

import X.AnonymousClass00U;
import X.C18190wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape1S0000000_I2_1;

public class SsoSource implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape1S0000000_I2_1(74);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A0s = C18190wL.A0s("SsoSource{sourceType=");
        if (this.A01 == 0) {
            str = "ContentProvider";
        } else {
            str = "AccountManager";
        }
        A0s.append(str);
        A0s.append(", sourceString='");
        A0s.append(this.A03);
        A0s.append('\'');
        String str3 = this.A02;
        if (str3 != null) {
            str2 = AnonymousClass00U.A0V(", providerNameOverride='", str3, "'");
        } else {
            str2 = "";
        }
        A0s.append(str2);
        return C18190wL.A0o(A0s);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }

    public SsoSource(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
    }
}
