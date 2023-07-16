package com.instagram.user.recommended;

import X.AnonymousClass3PT;
import X.C04220Ms;
import X.C23937D1z;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape17S0000000_I2_17;

public final class FollowListData implements Parcelable {
    public static final AnonymousClass3PT A05 = new AnonymousClass3PT();
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape17S0000000_I2_17(69);
    public final C23937D1z A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public static final FollowListData A00(C23937D1z d1z, String str) {
        C04220Ms.A0B(d1z, 0);
        return AnonymousClass3PT.A00(d1z, str, 12, false);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A00.name());
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A01);
    }

    public FollowListData(C23937D1z d1z, String str, String str2, String str3, boolean z) {
        this.A00 = d1z;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
        this.A01 = str3;
    }
}
