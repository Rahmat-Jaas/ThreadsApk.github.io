package com.instagram.accountlinking.model;

import X.AnonymousClass0wJ;
import X.AnonymousClass22H;
import X.C72144Mm;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape6S0000000_I2_6;
import com.instagram.user.model.MicroUserDict;
import java.util.List;

public class AccountFamily implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape6S0000000_I2_6(74);
    public AnonymousClass22H A00;
    public MicroUserDict A01;
    public String A02;
    public List A03;
    public List A04;

    public final int describeContents() {
        return 0;
    }

    public final C72144Mm A00() {
        MicroUserDict microUserDict = this.A01;
        if (microUserDict != null) {
            return new C72144Mm(microUserDict);
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeSerializable(this.A00);
        parcel.writeTypedList(this.A04);
        parcel.writeTypedList(this.A03);
    }

    public AccountFamily(String str) {
        this.A02 = str;
        this.A04 = AnonymousClass0wJ.A0v();
        this.A03 = AnonymousClass0wJ.A0v();
        this.A00 = AnonymousClass22H.UNKNOWN;
    }

    public AccountFamily() {
    }
}
