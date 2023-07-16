package X;

import com.facebook.redex.IDxCBackShape137S0200000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.2Iz  reason: invalid class name and case insensitive filesystem */
public final class C34292Iz {
    public static Object A00(AnonymousClass601 r9, C63893iY r10) {
        String str;
        String str2;
        C127397h3 A02 = C63893iY.A02(r10, 0);
        if (A02 == null) {
            str = "bk.action.io.ShowSnackbar";
            str2 = "Received null snackbar model while attempting to show snackbar";
        } else {
            C127397h3 A0K = A02.A0K(35);
            if (A0K == null) {
                str = "SnackbarUtils";
                str2 = "Received null snackbar button model while attempting to show snackbar";
            } else {
                C63733iD A01 = C63733iD.A01();
                A01.A0A = A02.A0O(36, "");
                A01.A0F(C306022c.DEFAULT);
                C109326jp A0L = A0K.A0L(35);
                A01.A0I = true;
                String A0O = A0K.A0O(36, "");
                C04220Ms.A0B(A0O, 0);
                A01.A0D = A0O;
                A01.A07 = new IDxCBackShape137S0200000_1_I2(r9, A0L, 1);
                AnonymousClass3TR A0B = A01.A0B();
                C04220Ms.A0B(r9, 0);
                ((BaseFragmentActivity) C63913ic.A05(r9)).BCa().A07(A0B);
                return null;
            }
        }
        C30967GcS.A02(str, str2);
        return null;
    }
}
