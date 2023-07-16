package X;

import com.google.gson.Gson;
import java.util.HashMap;

/* renamed from: X.6Hc  reason: invalid class name and case insensitive filesystem */
public final class C98836Hc {
    public static final void A00(String str, String str2, HashMap hashMap) {
        C14100oo ABJ = C10770iu.A00().ABJ("InstagramConsentFlowBugFixHelperProvider:DEBUG_LOGGING", 817896479);
        ABJ.A8U("promptId", str);
        ABJ.A8U("displayParameters", new Gson().A08(hashMap.keySet()));
        ABJ.A8U("source", str2);
        ABJ.report();
    }
}
