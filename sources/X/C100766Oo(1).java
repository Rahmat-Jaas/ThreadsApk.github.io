package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.fbpay.logging.FBPayLoggerData;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Oo  reason: invalid class name and case insensitive filesystem */
public final class C100766Oo {
    public static Object A00(AnonymousClass601 r23, C63893iY r24) {
        M5J A02;
        C63893iY r2 = r24;
        String A00 = AnonymousClass70K.A00(C63893iY.A07(r2));
        String A002 = AnonymousClass70K.A00(C63893iY.A08(r2));
        List list = r2.A00;
        String A0q = C18190wL.A0q(list, 2);
        String A0q2 = C18190wL.A0q(list, 3);
        Map map = (Map) list.get(4);
        C109326jp A06 = C63893iY.A06(r2, 5);
        C109326jp A062 = C63893iY.A06(r2, 6);
        AnonymousClass601 r5 = r23;
        C04220Ms.A0B(r5, 0);
        FragmentActivity A05 = C63913ic.A05(r5);
        if (map == null) {
            map = AnonymousClass0wJ.A0y();
        }
        C115256ul r6 = new C115256ul(A0q2, A002, A00, A0q, map);
        C04220Ms.A0B(A05, 0);
        Bundle A063 = C18180wK.A06();
        String str = r6.A03;
        if (!(str == null || str.length() == 0)) {
            A063.putString("PAYMENT_ACCOUNT_ID", str);
        }
        String str2 = r6.A00;
        if (str2 != null) {
            A063.putString("AUTH_METHOD_TYPE", str2);
        }
        String str3 = r6.A01;
        A063.putString("PAYMENT_TYPE", str3);
        HashSet A0u = C18200wM.A0u();
        C86154wM.A1E(A063, new FBPayLoggerData((String) null, str3, (String) null, (String) null, r6.A02, (String) null, C86104wH.A13(A0u, A0u)));
        Map map2 = r6.A04;
        Object obj = map2.get(C18170wI.A00(882));
        C04220Ms.A0C(obj, C18170wI.A00(9));
        C86154wM.A1D(A063, (List) obj);
        if ("PAYPAL_ACCESS_TOKEN".equals(str2)) {
            A063.putBoolean("AUTH_FLOW_UTIL_SHOULD_OPEN_PAYPAL_LOGIN_DIRECTLY", true);
            Object obj2 = map2.get("secret_value");
            C04220Ms.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = map2.get("credential_id");
            C04220Ms.A0C(obj3, "null cannot be cast to non-null type kotlin.String");
            String str4 = (String) obj2;
            C107266gT A003 = AnonymousClass7BN.A00(A063, new C115406v0((AnonymousClass79S) null, str4, (String) obj3, (String) null, (String) null, (String) null, str2, (String) null, (String) null, (String) null), "CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION");
            AnonymousClass7Ic A01 = AnonymousClass7Kz.A07().A01(A05);
            Object obj4 = map2.get("target_operation");
            C04220Ms.A0C(obj4, "null cannot be cast to non-null type kotlin.String");
            String str5 = (String) obj4;
            Object obj5 = map2.get("ptt_payload");
            if (obj5 == null) {
                obj5 = AnonymousClass4WJ.A0A();
            }
            A02 = A01.A04(A003, obj5, str5);
        } else {
            AnonymousClass7Hq.A03(A063, "VERIFY_PIN_TO_PAY");
            AnonymousClass7Hq.A04(A063, "VERIFY_PIN");
            C880756q A012 = C880756q.A01();
            if ("FB_ACCESS_TOKEN".equals(str2) || "IG_ACCESS_TOKEN".equals(str2)) {
                AnonymousClass57R r11 = (AnonymousClass57R) C1203379t.A00().create(AnonymousClass57R.class);
                r11.A00 = A063;
                A012.A0K(r11.A04, new IDxObserverShape211S0100000_2_I2(A012, 18));
                C880856r r9 = r11.A05;
                Map A004 = C121257Ff.A00(r11.A00);
                Bundle bundle = r11.A00;
                bundle.getClass();
                C18190wL.A0j(bundle, "AUTH_METHOD_TYPE");
                r9.A0H(new C104946cd(A004));
            } else if ("PIN".equals(str2)) {
                AnonymousClass58D r92 = (AnonymousClass58D) C1203379t.A00().create(AnonymousClass58D.class);
                A012.A0K(r92.A06, new IDxObserverShape211S0100000_2_I2(A012, 19));
                A012.A0K(r92.A07, new IDxObserverShape211S0100000_2_I2(A012, 20));
                r92.A02(A063, (C120967Dk) null);
                Object obj6 = map2.get("secret_value");
                C04220Ms.A0C(obj6, "null cannot be cast to non-null type kotlin.String");
                r92.A03((String) obj6);
            } else if ("CSC".equals(str2) || "PAYPAL_ACCESS_TOKEN".equals(str2)) {
                AnonymousClass584 r93 = (AnonymousClass584) C1203379t.A00().create(AnonymousClass584.class);
                A012.A0K(r93.A05, new IDxObserverShape211S0100000_2_I2(A012, 21));
                C880756q r7 = r93.A06;
                A012.A0K(r7, new IDxObserverShape211S0100000_2_I2(A012, 22));
                Object obj7 = map2.get("credential_id");
                C04220Ms.A0C(obj7, "null cannot be cast to non-null type kotlin.String");
                A063.putString("CREDENTIAL_ID", (String) obj7);
                r93.A02(A063);
                Object obj8 = map2.get("secret_value");
                C04220Ms.A0C(obj8, "null cannot be cast to non-null type kotlin.String");
                r93.A02 = (String) obj8;
                r7.A0G((Object) null);
                r93.A01();
            } else {
                AnonymousClass7Kx.A0I(A012, (Object) null);
            }
            A02 = C30821GXg.A02(A012, C86164wN.A11(r6, A063, 45));
        }
        A02.A0C(A05, new IDxObserverShape55S0300000_2_I2(r5, A06, A062, 29));
        return null;
    }
}
