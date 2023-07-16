package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.registration.model.RegFlowExtras;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3WW  reason: invalid class name */
public final class AnonymousClass3WW {
    public static void A01(RegFlowExtras regFlowExtras, RegFlowExtras regFlowExtras2) {
        regFlowExtras2.A0s = regFlowExtras.A0s;
        regFlowExtras2.A0x = regFlowExtras.A0x;
        regFlowExtras2.A0G = regFlowExtras.A0G;
        regFlowExtras2.A0H = regFlowExtras.A0H;
    }

    public static void A00(C34640IcN icN, RegFlowExtras regFlowExtras, C07530bf r5, String str) {
        FragmentActivity activity = icN.getActivity();
        if (activity != null) {
            C25828Dsm A0W = C18190wL.A0W(activity);
            A0W.A0p(str);
            A0W.A0O(C18250wR.A0E(icN, r5, regFlowExtras, 39), 2131831976);
            AnonymousClass0wJ.A1K(A0W);
        }
    }

    public static boolean A02(C10300i6 r4) {
        if (C18250wR.A01(r4) == 0) {
            return false;
        }
        C62813an A01 = C62813an.A01(r4);
        Iterator it = C18210wN.A0i(A01.A01).iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            Map map = A01.A02;
            if (map.get(A0k) != null) {
                if (!A01.A06(A0k)) {
                    return true;
                }
                if (A01.A08(A0k) && C50492t5.A00(((AccountFamily) map.get(A0k)).A03).size() < 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
