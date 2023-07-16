package X;

import com.instagram.barcelona.R;
import com.instagram.bloks.util.IDxACallbackShape0S1310000_1_I2;
import java.util.List;
import java.util.Map;

/* renamed from: X.2G1  reason: invalid class name */
public final class AnonymousClass2G1 {
    public static Object A00(AnonymousClass601 r10, C63893iY r11) {
        String str;
        List list = r11.A00;
        String A0q = C18190wL.A0q(list, 0);
        Map map = (Map) list.get(1);
        C109326jp r6 = ((C105916eC) list.get(2)).A00;
        C109326jp r7 = ((C105916eC) list.get(3)).A00;
        if (list.size() > 4) {
            Object A0B = C63893iY.A0B(r11, 4);
            A0B.getClass();
            str = (String) A0B;
        } else {
            str = "current-screen";
        }
        AnonymousClass601 r5 = r10;
        C63913ic.A0C(r10);
        C04220Ms.A0B(r10, 0);
        boolean A1X = AnonymousClass0wJ.A1X(C63913ic.A0D(r10).A00(R.id.bloks_ig_precompile_async_actions));
        C145538kf A00 = C62053Wy.A00(C63913ic.A03(r5), C63913ic.A0H(r5), str, A0q);
        if (A00 != null) {
            AnonymousClass4A9 A002 = C63263h8.A00(C63913ic.A0F(r5), A0q, C63913ic.A0N(map));
            A002.A00 = new IDxACallbackShape0S1310000_1_I2(r5, r6, r7, A0q, 1, A1X, A1X);
            A00.schedule(A002);
        }
        return null;
    }
}
