package X;

import android.os.BaseBundle;
import java.util.Locale;

/* renamed from: X.267  reason: invalid class name */
public enum AnonymousClass267 {
    A0A(0),
    A05(1),
    A03(2),
    A06(3),
    A02(6),
    A04(7),
    A08(8),
    A07(9),
    A09(10);
    
    public final Class A00;

    public static void A00(BaseBundle baseBundle) {
        baseBundle.putString(A09.A03(), "FACEBOOK".toLowerCase(Locale.US));
    }

    public static void A02(BaseBundle baseBundle, AnonymousClass1c9 r3) {
        baseBundle.putBoolean(A06.A03(), r3.A0I.equals(AnonymousClass1c9.A02(r3).trim()));
    }

    /* access modifiers changed from: public */
    AnonymousClass267(int i) {
        this.A00 = r1;
    }

    public static void A01(BaseBundle baseBundle, AnonymousClass267 r3, Integer num) {
        String str;
        String A032 = r3.A03();
        switch (num.intValue()) {
            case 1:
                str = "Phone";
                break;
            case 2:
                str = "Username";
                break;
            default:
                str = "Email";
                break;
        }
        baseBundle.putString(A032, str);
    }

    public final String A03() {
        return C18240wQ.A0g(name());
    }
}
