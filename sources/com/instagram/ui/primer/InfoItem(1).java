package com.instagram.ui.primer;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18230wP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public final class InfoItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(46);
    public final IconConfig A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeInt(C18230wP.A02(parcel, this.A01));
    }

    public InfoItem(IconConfig iconConfig, Integer num, String str, String str2) {
        AnonymousClass0wJ.A1O(str, iconConfig);
        this.A02 = str;
        this.A00 = iconConfig;
        this.A03 = str2;
        this.A01 = num;
    }
}
