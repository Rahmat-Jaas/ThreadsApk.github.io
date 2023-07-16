package X;

import com.instagram.accountlinking.model.AccountFamily;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4A2  reason: invalid class name */
public final class AnonymousClass4A2 implements C33841Hva {
    public final /* synthetic */ AnonymousClass49X A00;

    public final String getName() {
        return "Account Linking Data Parsing Fetch";
    }

    public final int getRunnableId() {
        return 244;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public AnonymousClass4A2(AnonymousClass49X r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass49X r4 = this.A00;
        String A0W = C18250wR.A0W(C18200wM.A0C(), "account_linking_family_map_data");
        C04220Ms.A0A(A0W);
        try {
            JSONObject A0j = C18250wR.A0j(A0W);
            Iterator<String> keys = A0j.keys();
            while (keys.hasNext()) {
                String A0k = C18180wK.A0k(keys);
                if (C18210wN.A0i(r4.A05).contains(A0k)) {
                    r4.A06.put(A0k, (AccountFamily) AnonymousClass0wJ.A0f(C18180wK.A0L((String) A0j.get(A0k)), 3));
                }
            }
        } catch (IOException | JSONException unused) {
            C10450iM.A03("AccountLinkingDataFetcher", "Error parsing saved family map from the preference");
        }
        C62813an r0 = r4.A02;
        ConcurrentHashMap concurrentHashMap = r4.A06;
        Map map = r0.A02;
        map.clear();
        map.putAll(concurrentHashMap);
    }
}
