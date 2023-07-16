package X;

import com.facebook.endtoend.EndToEnd;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.service.session.UserSession;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: X.2Cs  reason: invalid class name and case insensitive filesystem */
public final class C32662Cs {
    public static final String A00(C10300i6 r9) {
        StringBuilder A0r;
        String group;
        UserSession A03;
        String str = C11750kk.A00;
        String str2 = str;
        if (r9 == null || (A03 = C05030Qo.A03(r9)) == null || !C63803iN.A0E(AnonymousClass0TJ.A05, A03, 36320528377583654L) || C19573AyZ.A03(A03)) {
            C37200JmN.A00();
            C11610kU r1 = C11610kU.A01;
            if (r1 == null) {
                r1 = new C11610kU(C10600ic.A00);
                C11610kU.A01 = r1;
            }
            String A0W = C18250wR.A0W(r1.A00, "logging_host");
            C04220Ms.A06(A0W);
            if (A0W.length() != 0) {
                str = C11750kk.A00(A0W);
            }
        }
        if (EndToEnd.isRunningEndToEndTest() && C04220Ms.A0I(str, str2) && EndToEnd.isRunningEndToEndTest()) {
            String str3 = "prod";
            String str4 = str3;
            if (EndToEnd.isRunningEndToEndTest()) {
                Map A01 = EndToEnd.A01();
                if (A01.containsKey("/settings/sandbox/web/sandbox")) {
                    String optString = ((JSONObject) A01.get("/settings/sandbox/web/sandbox")).optString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str3);
                    if (optString.contains(".facebook")) {
                        str3 = optString.split(".facebook")[0];
                    }
                }
            }
            if (!C04220Ms.A0I(str3, str4)) {
                C04220Ms.A06(str3);
                if (str3.length() != 0) {
                    Matcher matcher = Pattern.compile("([0-9]+[.]od)").matcher(str3);
                    boolean find = matcher.find();
                    Matcher matcher2 = Pattern.compile("(sandcastle[0-9]+[.]\\w+[0-9]+)").matcher(str3);
                    boolean find2 = matcher2.find();
                    Matcher matcher3 = Pattern.compile("(twshared[0-9]+[.]\\w+[0-9]+[.]\\w+[0-9])").matcher(str3);
                    boolean find3 = matcher3.find();
                    String A00 = I17.A00(32);
                    if (find) {
                        A0r = C18190wL.A0s("graph.svcscm.");
                        group = matcher.group(1);
                    } else if (find2) {
                        A0r = C18200wM.A0r();
                        A0r.append("graph.instance-hg.");
                        group = matcher2.group(1);
                    } else if (find3) {
                        A0r = C18200wM.A0r();
                        A0r.append("graph.instance-hg.");
                        group = matcher3.group(1);
                    }
                    A0r.append(group);
                    String A0i = C18180wK.A0i(A00, A0r);
                    if (A0i != null) {
                        str = C11750kk.A00(A0i);
                    }
                }
            }
        }
        C04220Ms.A09(str);
        return str;
    }
}
