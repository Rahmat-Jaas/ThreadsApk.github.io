package X;

import android.content.Context;
import com.facebook.redex.IDxAObserverShape137S0300000_2_I2;
import com.facebook.redex.IDxAObserverShape4S2200000_2_I2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Ij  reason: invalid class name and case insensitive filesystem */
public final class C99166Ij {
    public static final Object A00(AnonymousClass601 r22, C63893iY r23) {
        String str;
        AnonymousClass601 r13 = r22;
        C63893iY r14 = r23;
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, r13);
        AnonymousClass3HX r15 = r13.A00;
        Object A0B = C63893iY.A0B(r14, A1Z ? 1 : 0);
        A0B.getClass();
        String A0h = C86164wN.A0h(A0B);
        String str2 = (String) A0B;
        String str3 = (String) C63893iY.A0C(r14, A0h, 2);
        String str4 = (String) C63893iY.A0C(r14, A0h, 3);
        Object A0B2 = C63893iY.A0B(r14, 4);
        A0B2.getClass();
        String A00 = C18170wI.A00(9);
        List list = (List) A0B2;
        Object A0B3 = C63893iY.A0B(r14, 5);
        A0B3.getClass();
        Map map = (Map) A0B3;
        List list2 = (List) C63893iY.A0C(r14, A00, 6);
        String str5 = (String) C63893iY.A0C(r14, A0h, 7);
        C109326jp A06 = C63893iY.A06(r14, 8);
        C109326jp A062 = C63893iY.A06(r14, 9);
        Object A0B4 = C63893iY.A0B(r14, 10);
        A0B4.getClass();
        Boolean bool = (Boolean) A0B4;
        if (str4 == null || !str4.equals("VERIFY_FACTOR") || (!str2.equals("SMS_OTP") && !str2.equals("MFT_SMS_OTP") && !str2.equals("MFT_RECOVERY_CODE"))) {
            C04220Ms.A0A(r15);
            List list3 = list;
            String str6 = str5;
            String str7 = str3;
            String str8 = str4;
            String str9 = str2;
            Boolean bool2 = bool;
            AnonymousClass7BP.A02(r15.A00, new IDxAObserverShape137S0300000_2_I2(r13, A06, A062, A1Z), bool2, str9, str8, str7, str6, list3, list2, map);
            return null;
        }
        C04220Ms.A0A(r15);
        Context context = r15.A00;
        IDxAObserverShape137S0300000_2_I2 iDxAObserverShape137S0300000_2_I2 = new IDxAObserverShape137S0300000_2_I2(r13, A06, A062, 0);
        String A0r = C18220wO.A0r("need_register_trusted_device_key", map);
        if (A0r == null || A0r.equalsIgnoreCase("false")) {
            AnonymousClass7BP.A02(context, iDxAObserverShape137S0300000_2_I2, false, str2, "VERIFY_FACTOR", str3, str5, list, list2, map);
            return null;
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        String str10 = str3;
        String str11 = str5;
        C128737kG r11 = new C128737kG(context, iDxAObserverShape137S0300000_2_I2, str10, str11, list, list2, map);
        if (A0y.get("target_account_id") != null) {
            str = String.valueOf(A0y.get("target_account_id"));
        } else {
            str = null;
        }
        C120967Dk A002 = AnonymousClass7BP.A00("MFT_TRUSTED_DEVICE", AnonymousClass0wJ.A0v());
        A0y.put("public_key", A002.A07);
        A0y.put(C62443a0.A00(0, 9, 107), C1198677j.A00());
        A0y.put("app_id", context.getPackageName());
        A0y.put("auth_ticket_type", A002.A03);
        HashSet A0u = C18200wM.A0u();
        A0u.add(A002);
        C120977Dl A01 = AnonymousClass7BP.A01("CREATE_AUTH_TICKET_BASED_FACTOR", "MFT_TRUSTED_DEVICE", str10, str11, str, A0u, AnonymousClass0wJ.A0v(), A0y);
        AnonymousClass7Kx.A0H(C92975kL.A00(A01), C86114wI.A0Q(new IDxAObserverShape4S2200000_2_I2(r11, A01, str3, str5, 0), 215));
        return null;
    }
}
