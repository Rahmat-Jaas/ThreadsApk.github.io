package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5001000_I2;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.7E4  reason: invalid class name */
public final class AnonymousClass7E4 {
    public final Map A00 = AnonymousClass0wJ.A0y();

    public static void A00(KtCSuperShape0S5001000_I2 ktCSuperShape0S5001000_I2, Map map) {
        map.put(AnonymousClass3Q6.A00(9, 10, 56), ktCSuperShape0S5001000_I2.A04);
        map.put("client_name", ktCSuperShape0S5001000_I2.A01);
        map.put("placement", ktCSuperShape0S5001000_I2.A03);
        map.put("template_name", ktCSuperShape0S5001000_I2.A05);
        map.put("logging_info", ktCSuperShape0S5001000_I2.A02);
        map.put(TraceFieldType.ContentLength, String.valueOf(ktCSuperShape0S5001000_I2.A00));
    }

    public final String A02() {
        Map map = this.A00;
        C04220Ms.A0C(map, C18170wI.A00(100));
        return C18190wL.A0n(new JSONObject(map));
    }

    public static void A01(C110596lx r3, Map map) {
        String str;
        HashMap A0y = AnonymousClass0wJ.A0y();
        Boolean bool = r3.A00;
        if (bool != null) {
            if (bool.booleanValue()) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            A0y.put(I17.A00(56), str);
        }
        Integer num = r3.A01;
        if (num != null) {
            A0y.put(I17.A00(191), num.toString());
        }
        Integer num2 = r3.A02;
        if (num2 != null) {
            A0y.put(AnonymousClass000.A00(1277), num2.toString());
        }
        Integer num3 = r3.A03;
        if (num3 != null) {
            A0y.put(AnonymousClass000.A00(1313), num3.toString());
        }
        Integer num4 = r3.A04;
        if (num4 != null) {
            A0y.put("opt_in_index", num4.toString());
        }
        String str2 = r3.A05;
        if (str2 != null) {
            A0y.put(IgFragmentActivity.MODULE_KEY, str2);
        }
        map.put("custom_logging_info", C18190wL.A0n(new JSONObject(A0y)));
    }
}
