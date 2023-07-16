package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.4D0  reason: invalid class name */
public final class AnonymousClass4D0 implements C33670HsH {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C31084GfL A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ HGA A03;
    public final /* synthetic */ boolean A04;

    public final void onDismiss() {
    }

    public AnonymousClass4D0(FragmentActivity fragmentActivity, C31084GfL gfL, UserSession userSession, HGA hga, boolean z) {
        this.A03 = hga;
        this.A04 = z;
        this.A01 = gfL;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
    }

    public final void Bp6(Context context) {
        double d;
        double d2;
        double d3;
        double d4;
        Fragment r5;
        try {
            if (this.A04) {
                r5 = new C23351dd();
            } else {
                C31084GfL gfL = this.A01;
                String str = gfL.A0V;
                String str2 = gfL.A0a;
                String str3 = gfL.A0X;
                String str4 = gfL.A0Z;
                String str5 = gfL.A0b;
                String str6 = gfL.A0W;
                if (str6 != null) {
                    d3 = Double.parseDouble(str6);
                } else {
                    d3 = 0.0d;
                }
                String str7 = gfL.A0Y;
                if (str7 != null) {
                    d4 = Double.parseDouble(str7);
                } else {
                    d4 = 0.0d;
                }
                String str8 = "";
                String str9 = str8;
                if (str != null) {
                    str9 = str;
                }
                String str10 = str8;
                if (str2 != null) {
                    str10 = str2;
                }
                String str11 = str8;
                if (str3 != null) {
                    str11 = str3;
                }
                String str12 = str8;
                if (str4 != null) {
                    str12 = str4;
                }
                if (str5 != null) {
                    str8 = str5;
                }
                r5 = new AnonymousClass1aX();
                Bundle A06 = C18180wK.A06();
                A06.putDouble("ARG_LOCATION_LATITUDE", d3);
                A06.putDouble("ARG_LOCATION_LONGITUDE", d4);
                A06.putString("ARG_DEVICE_NAME", str9);
                A06.putString("ARG_TIMESTAMP", str10);
                A06.putString("ARG_LOCATION_NAME", str11);
                A06.putString("ARG_REQUEST_DEVICE_ID", str12);
                A06.putInt("ARG_USER_ACTION", 0);
                A06.putString("ARG_TWO_FAC_IDENTIFIER", str8);
                r5.setArguments(A06);
            }
            AnonymousClass0wJ.A19(r5, this.A00, this.A02);
        } catch (IllegalArgumentException unused) {
            if (!this.A04) {
                UserSession userSession = this.A02;
                Class<ModalActivity> cls = ModalActivity.class;
                HGA hga = this.A03;
                C31084GfL gfL2 = this.A01;
                String str13 = gfL2.A0V;
                String str14 = gfL2.A0a;
                String str15 = gfL2.A0X;
                String str16 = gfL2.A0Z;
                String str17 = gfL2.A0b;
                Bundle A062 = C18180wK.A06();
                String str18 = gfL2.A0W;
                if (str18 != null) {
                    d = Double.parseDouble(str18);
                } else {
                    d = 0.0d;
                }
                A062.putDouble("ARG_LOCATION_LATITUDE", d);
                String str19 = gfL2.A0Y;
                if (str19 != null) {
                    d2 = Double.parseDouble(str19);
                } else {
                    d2 = 0.0d;
                }
                A062.putDouble("ARG_LOCATION_LONGITUDE", d2);
                if (str13 == null) {
                    str13 = "";
                }
                A062.putString("ARG_DEVICE_NAME", str13);
                if (str14 == null) {
                    str14 = "";
                }
                A062.putString("ARG_TIMESTAMP", str14);
                if (str15 == null) {
                    str15 = "";
                }
                A062.putString("ARG_LOCATION_NAME", str15);
                if (str16 == null) {
                    str16 = "";
                }
                A062.putString("ARG_REQUEST_DEVICE_ID", str16);
                A062.putInt("ARG_USER_ACTION", 0);
                if (str17 == null) {
                    str17 = "";
                }
                A062.putString("ARG_TWO_FAC_IDENTIFIER", str17);
                C63863iT A022 = C63863iT.A02(this.A00, A062, userSession, cls, "login_notification");
                A022.A0F();
                A022.A0I(hga.A00);
            }
        }
    }
}
