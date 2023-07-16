package X;

import android.app.Activity;
import android.app.Application;
import ch.boye.httpclientandroidlib.HttpStatus;

/* renamed from: X.3Y4  reason: invalid class name */
public final class AnonymousClass3Y4 {
    public final Activity A00;
    public final C10300i6 A01;

    public AnonymousClass3Y4(Activity activity, C10300i6 r3) {
        C04220Ms.A0B(r3, 2);
        this.A00 = activity;
        this.A01 = r3;
        Application application = activity.getApplication();
        C04220Ms.A06(application);
        AnonymousClass3R8.A00(application);
    }

    private final String A00() {
        if (C63173fJ.A05(AnonymousClass0TJ.A06, 18313349708458135L)) {
            return "";
        }
        AnonymousClass4C3 r3 = AnonymousClass4C3.A00;
        return (String) C62073Xa.A00(this.A01, (C62073Xa) AnonymousClass4C3.A01.BKJ(r3, AnonymousClass4C3.A02[0]));
    }

    public static final String A01() {
        String str = AnonymousClass3YK.A00(C60913Rb.A00(AnonymousClass4C6.A00)).A01;
        if (C04220Ms.A0I(str, "test_1")) {
            return "caa_login_home_caching_ig4a_test";
        }
        if (C04220Ms.A0I(str, "control")) {
            return "caa_login_home_caching_ig4a_control";
        }
        return "";
    }

    public final String A02() {
        String str;
        Activity activity = this.A00;
        boolean A08 = C09650fs.A08(activity, "com.facebook.katana", HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE);
        boolean A082 = C09650fs.A08(activity, "com.facebook.orca", HttpStatus.SC_REQUEST_TOO_LONG);
        if (A08) {
            if (!A082) {
                return A00();
            }
            if (C63173fJ.A05(AnonymousClass0TJ.A06, 18313349708523672L)) {
                str = "";
            } else {
                AnonymousClass4C2 r3 = AnonymousClass4C2.A00;
                str = (String) C62073Xa.A00(this.A01, (C62073Xa) AnonymousClass4C2.A01.BKJ(r3, AnonymousClass4C2.A02[0]));
            }
            if (!C04220Ms.A0I(str, "")) {
                return str;
            }
            String A002 = A00();
            if (!C04220Ms.A0I(A002, "")) {
                return A002;
            }
        } else if (!A082) {
            return "";
        }
        if (C63173fJ.A05(AnonymousClass0TJ.A06, 18313349708589209L)) {
            return "";
        }
        AnonymousClass4C4 r32 = AnonymousClass4C4.A00;
        return (String) C62073Xa.A00(this.A01, (C62073Xa) AnonymousClass4C4.A01.BKJ(r32, AnonymousClass4C4.A02[0]));
    }
}
