package X;

import android.text.TextUtils;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.user.model.User;

/* renamed from: X.1U8  reason: invalid class name */
public final class AnonymousClass1U8 extends AnonymousClass1j3 {
    public AnonymousClass38H A00;
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

    public static boolean A00(AnonymousClass1U8 r1) {
        if (C18210wN.A1U(r1.A09) || C18210wN.A1U(r1.A0A)) {
            return false;
        }
        Integer num = r1.A03;
        if (num != null && num.intValue() > 0) {
            return false;
        }
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = r1.A01;
        if (locationPageInfoPageOperationHourResponse != null && !TextUtils.isEmpty(locationPageInfoPageOperationHourResponse.A01)) {
            return false;
        }
        AnonymousClass38H r0 = r1.A00;
        if (r0 == null || r0.A01 == null) {
            return true;
        }
        return false;
    }

    public final String getCategory() {
        return this.A06;
    }

    public AnonymousClass1U8() {
    }

    public AnonymousClass1U8(LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse, User user, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.A08 = str;
        this.A09 = str2;
        this.A0A = str3;
        this.A06 = str4;
        this.A05 = str5;
        this.A07 = str6;
        this.A04 = num;
        this.A0B = str7;
        AnonymousClass38H r0 = new AnonymousClass38H();
        this.A00 = r0;
        r0.A01 = user;
        this.A01 = locationPageInfoPageOperationHourResponse;
        this.A0C = z;
        this.A02 = num2;
    }
}
