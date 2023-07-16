package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.facebookpay.paypal.model.LinkableTextParams;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import com.fbpay.logging.LoggingPolicy;
import java.util.Map;

/* renamed from: X.6OM  reason: invalid class name */
public final class AnonymousClass6OM {
    public static final Object A00(AnonymousClass601 r31, C63893iY r32) {
        C63893iY r5 = r32;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r31);
        AnonymousClass3HX A0D = C63913ic.A0D(r31);
        Object A0B = C63893iY.A0B(r5, A1Z ? 1 : 0);
        A0B.getClass();
        String A0h = C86164wN.A0h(A0B);
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r5, A0h, 2);
        String str3 = (String) C63893iY.A0C(r5, A0h, 3);
        String str4 = (String) C63893iY.A0C(r5, A0h, 4);
        String str5 = (String) C63893iY.A0C(r5, A0h, 5);
        String str6 = (String) C63893iY.A0C(r5, A0h, 6);
        String str7 = (String) C63893iY.A0C(r5, A0h, 7);
        Object A0B2 = C63893iY.A0B(r5, 8);
        A0B2.getClass();
        String A00 = C18170wI.A00(442);
        Map map = (Map) A0B2;
        String str8 = (String) C63893iY.A0C(r5, A0h, 9);
        String str9 = (String) C63893iY.A0C(r5, A0h, 10);
        C109326jp A06 = C63893iY.A06(r5, 11);
        C109326jp A062 = C63893iY.A06(r5, 12);
        FragmentActivity A04 = C63913ic.A04(A0D);
        C04220Ms.A0B(map, 0);
        Object obj = map.get("ranges");
        C04220Ms.A0C(obj, A00);
        Map map2 = (Map) obj;
        Object obj2 = map.get("text");
        C04220Ms.A0C(obj2, A0h);
        Object obj3 = map2.get("length");
        C04220Ms.A0C(obj3, "null cannot be cast to non-null type kotlin.Int");
        int A042 = AnonymousClass0wJ.A04(obj3);
        Object obj4 = map2.get("offset");
        C04220Ms.A0C(obj4, "null cannot be cast to non-null type kotlin.Int");
        int A043 = AnonymousClass0wJ.A04(obj4);
        Object obj5 = map2.get("url");
        C04220Ms.A0C(obj5, A0h);
        LinkableTextParams linkableTextParams = new LinkableTextParams((String) obj2, A042, A043, (String) obj5);
        AnonymousClass7Kz.A05();
        if (A04 != null) {
            LinkableTextParams linkableTextParams2 = linkableTextParams;
            AnonymousClass7Kx.A0H(C99086Ib.A00(A04.getSupportFragmentManager(), new PaypalConsentLaunchParams(linkableTextParams2, (LoggingPolicy) null, str, str2, str3, str7, str5, str6, str4, str8, str9, false)), new IDxObserverShape55S0300000_2_I2(r31, A06, A062, 28));
            return null;
        }
        throw C18190wL.A0a("Input fragment or fragmentActivity cannot be null");
    }
}
