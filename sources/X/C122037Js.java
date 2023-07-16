package X;

import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.fbpay.logging.FBPayLoggerData;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7Js  reason: invalid class name and case insensitive filesystem */
public final class C122037Js {
    public static String A02(Map map) {
        if (map.containsKey("logger_data")) {
            String str = ((FBPayLoggerData) C86104wH.A0h("logger_data", map)).A00;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return C18210wN.A0g("external_session_id", map);
    }

    public static String A03(Map map) {
        if (map.containsKey("logger_data")) {
            String A00 = ((FBPayLoggerData) C86104wH.A0h("logger_data", map)).A00();
            if (!TextUtils.isEmpty(A00)) {
                return A00;
            }
        }
        return (String) C86104wH.A0h(AnonymousClass7C5.A00(21, 10, 59), map);
    }

    public static String A04(Map map) {
        if (map.containsKey("logger_data")) {
            String str = ((FBPayLoggerData) C86104wH.A0h("logger_data", map)).A04;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return C18210wN.A0g("source", map);
    }

    public static String A00() {
        String A01 = A01();
        C04220Ms.A06(A01);
        return A01;
    }

    public static String A01() {
        return StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", String.valueOf(System.currentTimeMillis()), C18230wP.A0h());
    }

    public static Map A05(FBPayLoggerData fBPayLoggerData) {
        Map A06 = A06(fBPayLoggerData);
        A06.put("credential_type", "shop_pay");
        return A06;
    }

    public static Map A06(FBPayLoggerData fBPayLoggerData) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("logger_data", fBPayLoggerData);
        A0y.put(AnonymousClass7C5.A00(21, 10, 59), fBPayLoggerData.A00());
        return A0y;
    }

    public static void A07(GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000, String str, String str2, Map map) {
        gQLCallInputCInputShape1S0000000.A0D(str, str2);
        gQLCallInputCInputShape1S0000000.A0D(A03(map), "logging_id");
    }
}
