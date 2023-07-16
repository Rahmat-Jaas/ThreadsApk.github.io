package com.facebook.privacy.zone.policy;

import X.AnonymousClass006;
import X.AnonymousClass68Q;
import X.AnonymousClass6XL;
import X.C04220Ms;
import X.C86104wH;
import X.C86144wL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2;

public final class ZonePolicy implements Parcelable {
    public static final ZonePolicy A02;
    public static final ZonePolicy A03;
    public static final ZonePolicy A04;
    public static final ZonePolicy A05;
    public static final Parcelable.Creator CREATOR = C86144wL.A0Q(6);
    public final Integer A00;
    public final AnonymousClass68Q A01;

    static {
        AnonymousClass68Q r1 = AnonymousClass68Q.ALLOW;
        Integer num = AnonymousClass006.A01;
        A02 = new ZonePolicy(r1, num);
        A03 = new ZonePolicy(AnonymousClass68Q.DEFAULT_PURPOSES_OPERATIONAL, num);
        A04 = new ZonePolicy(AnonymousClass68Q.MOBILE_MESSAGING_CONTENT_E2EE, num);
        A05 = new ZonePolicy(AnonymousClass68Q.MOBILE_MESSAGING_CONTENT_OPEN, num);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C04220Ms.A0B(parcel, 0);
        C86104wH.A1B(parcel, this.A01);
        if (this.A00.intValue() != 0) {
            str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        } else {
            str = "FULL_THROW";
        }
        parcel.writeString(str);
    }

    public final String A00() {
        String str;
        KtCSuperShape0S1001000_I2 ktCSuperShape0S1001000_I2 = (KtCSuperShape0S1001000_I2) AnonymousClass6XL.A00.get(this.A01);
        if (ktCSuperShape0S1001000_I2 == null || (str = ktCSuperShape0S1001000_I2.A01) == null) {
            return "";
        }
        return str;
    }

    public final String A01() {
        Integer num;
        KtCSuperShape0S1001000_I2 ktCSuperShape0S1001000_I2 = (KtCSuperShape0S1001000_I2) AnonymousClass6XL.A00.get(this.A01);
        if (ktCSuperShape0S1001000_I2 != null) {
            num = Integer.valueOf(ktCSuperShape0S1001000_I2.A00);
        } else {
            num = null;
        }
        return String.valueOf(num);
    }

    public ZonePolicy(AnonymousClass68Q r1, Integer num) {
        this.A01 = r1;
        this.A00 = num;
    }
}
