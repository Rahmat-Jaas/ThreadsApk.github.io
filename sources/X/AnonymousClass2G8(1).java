package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2G8  reason: invalid class name */
public final class AnonymousClass2G8 {
    public static Object A00(AnonymousClass601 r10, C63893iY r11) {
        Object A0B = C63893iY.A0B(r11, 0);
        A0B.getClass();
        Object A0B2 = C63893iY.A0B(r11, 1);
        A0B2.getClass();
        Map map = (Map) A0B2;
        C04220Ms.A0B(r10, 0);
        FragmentActivity A05 = C63913ic.A05(r10);
        C04220Ms.A0B(A05, 0);
        C18180wK.A1P(r10, 1, map);
        HashMap A0N = C63913ic.A0N(map);
        String A00 = AnonymousClass2JQ.A00(AnonymousClass006.A01);
        C130667qT A08 = C63913ic.A08(r10);
        Integer A002 = AnonymousClass2JP.A00(A00);
        C62343Yl r1 = new C62343Yl(C63913ic.A0F(r10));
        IgBloksScreenConfig igBloksScreenConfig = r1.A00;
        igBloksScreenConfig.A08 = null;
        igBloksScreenConfig.A0h = false;
        igBloksScreenConfig.A0b = false;
        igBloksScreenConfig.A0d = false;
        igBloksScreenConfig.A0c = false;
        igBloksScreenConfig.A0Y = A08.A00;
        igBloksScreenConfig.A0O = A002;
        igBloksScreenConfig.A0Q = null;
        r1.A03((String) null);
        C63743iE A02 = C63743iE.A02((String) A0B, A0N);
        A02.A00 = 719983200;
        A02.A0C(A05, igBloksScreenConfig);
        return null;
    }
}
