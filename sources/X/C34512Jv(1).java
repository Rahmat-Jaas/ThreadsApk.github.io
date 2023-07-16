package X;

import android.os.Build;

/* renamed from: X.2Jv  reason: invalid class name and case insensitive filesystem */
public final class C34512Jv {
    public static final C15730rn A00(Integer num) {
        String str;
        AnonymousClass1o2 A01 = AnonymousClass1o2.A01("business_signup_flow");
        switch (num.intValue()) {
            case 0:
                str = "business_signup_cancel";
                break;
            case 1:
                str = "business_signup_submit";
                break;
            case 2:
                str = "business_signup_submit_error";
                break;
            case 3:
                str = "business_signup_tap_component";
                break;
            case 4:
                str = "business_signup_fetch_data";
                break;
            default:
                str = "business_signup_fetch_data_error";
                break;
        }
        C15730rn A03 = A01.A03(str);
        A03.A08(Integer.valueOf(Build.VERSION.SDK_INT), "api_level");
        return A03;
    }
}
