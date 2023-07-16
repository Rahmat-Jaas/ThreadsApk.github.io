package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.bloks.util.IDxACallbackShape0S1310000_1_I2;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Wy  reason: invalid class name and case insensitive filesystem */
public final class C62053Wy {
    public static final Handler A00 = AnonymousClass0wJ.A0F();

    public static Object A01(AnonymousClass601 r10, C63893iY r11) {
        String str;
        Object A0B = C63893iY.A0B(r11, 0);
        A0B.getClass();
        String str2 = (String) A0B;
        List list = r11.A00;
        Map map = (Map) list.get(1);
        C109326jp A0R = C18190wL.A0R(list, 2);
        C109326jp A0R2 = C18190wL.A0R(list, 3);
        String str3 = "current-screen";
        if (list.size() > 4) {
            str = C18190wL.A0q(list, 4);
        } else {
            str = str3;
        }
        AnonymousClass601 r5 = r10;
        C63913ic.A0C(r10);
        C04220Ms.A0B(r10, 0);
        boolean A1X = AnonymousClass0wJ.A1X(C63913ic.A0D(r10).A00(R.id.bloks_ig_precompile_async_actions));
        if (str != null) {
            str3 = str;
        }
        C145538kf A002 = A00(C63913ic.A03(r5), C63913ic.A0H(r5), str3, str2);
        if (A002 != null) {
            AnonymousClass4A9 A003 = C63263h8.A00(C63913ic.A0F(r5), str2, C63913ic.A0N(map));
            A003.A00 = new IDxACallbackShape0S1310000_1_I2(r5, A0R, A0R2, str2, 0, A1X, A1X);
            A002.schedule(A003);
        }
        return null;
    }

    public static C145538kf A00(Fragment fragment, C145538kf r2, String str, String str2) {
        if (str.equals("long-live")) {
            return new AnonymousClass4A1();
        }
        if (fragment == null || fragment.isAdded()) {
            return r2;
        }
        C10450iM.A03("bloks_stale_async_action", AnonymousClass00U.A0V("Async action tried to schedule app ID ", str2, " but host is already detached."));
        return null;
    }
}
