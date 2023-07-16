package com.instagram.discovery.mediamap.model;

import X.C04220Ms;
import X.C19527Axo;
import X.C61093Rw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorCreatorShape12S0000000_I2_12;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.user.model.User;
import java.io.IOException;

public final class LocationPageInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorCreatorShape12S0000000_I2_12(28);
    public C61093Rw A00;
    public LocationPageInfoPageOperationHourResponse A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public LocationPageInformation() {
        this((C61093Rw) null, (LocationPageInfoPageOperationHourResponse) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3;
        User user;
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A06);
        Integer num = this.A03;
        int i4 = -1;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        Integer num2 = this.A04;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = -1;
        }
        parcel.writeInt(i3);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        C61093Rw r1 = this.A00;
        String str = null;
        if (!(r1 == null || (user = r1.A00) == null)) {
            try {
                str = C19527Axo.A04(user);
            } catch (IOException unused) {
            }
        }
        parcel.writeString(str);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        Integer num3 = this.A02;
        if (num3 != null) {
            i4 = num3.intValue();
        }
        parcel.writeInt(i4);
    }

    public final User A00() {
        C61093Rw r0 = this.A00;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public LocationPageInformation(C61093Rw r1, LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.A08 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A06 = str4;
        this.A03 = num;
        this.A05 = str5;
        this.A07 = str6;
        this.A04 = num2;
        this.A0B = str7;
        this.A01 = locationPageInfoPageOperationHourResponse;
        this.A00 = r1;
        this.A0C = z;
        this.A02 = num3;
    }
}
