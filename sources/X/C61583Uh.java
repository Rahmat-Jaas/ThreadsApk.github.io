package X;

import com.facebook.react.modules.intent.IntentModule;
import org.json.JSONObject;

/* renamed from: X.3Uh  reason: invalid class name and case insensitive filesystem */
public class C61583Uh {
    public String A00;
    public String A01;
    public Integer A02;

    public C61583Uh() {
        this("", AnonymousClass006.A0N, "");
    }

    public final JSONObject A00() {
        String str;
        JSONObject A0y = C18230wP.A0y();
        switch (this.A02.intValue()) {
            case 0:
                str = "email";
                break;
            case 1:
                str = "phone";
                break;
            case 2:
                str = "omnistring";
                break;
            default:
                str = "unknown";
                break;
        }
        A0y.put("type", str);
        A0y.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, this.A01);
        A0y.put("source", this.A00);
        return A0y;
    }

    public C61583Uh(String str, Integer num, String str2) {
        AnonymousClass0wJ.A1P(str, str2);
        this.A01 = str;
        this.A02 = num;
        this.A00 = str2;
    }
}
