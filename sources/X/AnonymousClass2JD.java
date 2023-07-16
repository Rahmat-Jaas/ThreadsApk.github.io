package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2JD  reason: invalid class name */
public final class AnonymousClass2JD {
    public static final Object A00(AnonymousClass601 r11, C63893iY r12) {
        List A04;
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        List list = r12.A00;
        String A0q = C18190wL.A0q(list, 0);
        String A0q2 = C18190wL.A0q(list, A1Z ? 1 : 0);
        C109326jp A0R = C18190wL.A0R(list, 2);
        C10300i6 A0F = C63913ic.A0F(r11);
        FragmentActivity A05 = C63913ic.A05(r11);
        Context A08 = C18230wP.A08();
        if (A0R == null) {
            return null;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (A0q != null) {
            int hashCode = A0q.hashCode();
            if (hashCode != 69888) {
                if (hashCode != 561774310) {
                    if (hashCode == 2032871314 && A0q.equals("Instagram")) {
                        A04 = C63843iR.A0B(A0F, A0q2);
                        A0v.addAll(A04);
                        C61043Rr.A00(r11, C63893iY.A04(AnonymousClass3VO.A00(), A0v, 0), A0R);
                        return null;
                    }
                } else if (A0q.equals("Facebook")) {
                    A0v.addAll(C63843iR.A01(A08, A05, A0F, A0q2));
                    C04220Ms.A0B(A0F, 0);
                    C04220Ms.A0B(A05, 2);
                    if (A0q2 == null) {
                        A0q2 = "";
                    }
                    C04220Ms.A0I(A0q2, "active_account");
                    A04 = C63843iR.A03(A08, A0F, "ig_android_access_library_fx_fetch_active_msgr_token");
                    A0v.addAll(A04);
                    C61043Rr.A00(r11, C63893iY.A04(AnonymousClass3VO.A00(), A0v, 0), A0R);
                    return null;
                }
            } else if (A0q.equals("FRL")) {
                C04220Ms.A0B(A0F, 0);
                C04220Ms.A0B(A05, 2);
                if (A0q2 == null) {
                    A0q2 = "";
                }
                C04220Ms.A0I(A0q2, "active_account");
                A04 = C63843iR.A04(A08, A0F, "ig_android_access_library_fx_fetch_active_twilight_token");
                A0v.addAll(A04);
                C61043Rr.A00(r11, C63893iY.A04(AnonymousClass3VO.A00(), A0v, 0), A0R);
                return null;
            }
        }
        A0v.addAll(C63843iR.A0B(A0F, A0q2));
        A0v.addAll(C63843iR.A01(A08, A05, A0F, A0q2));
        String str = A0q2;
        C04220Ms.A0B(A0F, 0);
        C04220Ms.A0B(A05, 2);
        if (A0q2 == null) {
            str = "";
        }
        C04220Ms.A0I(str, "active_account");
        A0v.addAll(C63843iR.A03(A08, A0F, "ig_android_access_library_fx_fetch_active_msgr_token"));
        if (A0q2 == null) {
            A0q2 = "";
        }
        C04220Ms.A0I(A0q2, "active_account");
        A04 = C63843iR.A04(A08, A0F, "ig_android_access_library_fx_fetch_active_twilight_token");
        A0v.addAll(A04);
        C61043Rr.A00(r11, C63893iY.A04(AnonymousClass3VO.A00(), A0v, 0), A0R);
        return null;
    }
}
