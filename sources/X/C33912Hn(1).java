package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.challenge.activity.ChallengeActivity;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2Hn  reason: invalid class name and case insensitive filesystem */
public final class C33912Hn {
    public static Object A00(AnonymousClass601 r19, C63893iY r20) {
        Object obj;
        HashMap A0y = AnonymousClass0wJ.A0y();
        Object A0B = C63893iY.A0B(r20, 0);
        A0B.getClass();
        Map map = (Map) A0B;
        Iterator A0x = C18220wO.A0x(map);
        while (A0x.hasNext()) {
            Object next = A0x.next();
            String str = (String) next;
            if (str.equals("step_data")) {
                Object obj2 = map.get(next);
                obj2.getClass();
                obj = C63913ic.A0N((Map) obj2);
            } else {
                boolean equals = str.equals("flow_render_type");
                obj = map.get(next);
                if (equals) {
                    obj.getClass();
                    obj = obj.toString();
                }
            }
            A0y.put(str, obj);
        }
        AnonymousClass601 r0 = r19;
        C04220Ms.A0B(r0, 0);
        C10300i6 A0F = C63913ic.A0F(r0);
        FragmentActivity A05 = C63913ic.A05(r0);
        C697449w A00 = AnonymousClass3GW.A00.A00(A0F);
        String A0f = C18240wQ.A0f("flow_render_type", A0y);
        String A0f2 = C18240wQ.A0f("step_name", A0y);
        Object obj3 = A0y.get("step_data");
        obj3.getClass();
        HashMap hashMap = (HashMap) obj3;
        String A0f3 = C18240wQ.A0f("challenge_context", A0y);
        if (A0f == null || A00 == null) {
            return null;
        }
        if (A0f.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
            A00.A04(C18230wP.A08(), C34642Ki.A00(A0f2), A0f3, hashMap);
            return null;
        } else if (!A0f.equals("4") && !A0f.equals("5") && !A0f.equals("6")) {
            return null;
        } else {
            String A0f4 = C18240wQ.A0f("url", A0y);
            if (A05 instanceof ChallengeActivity) {
                C10450iM.A00().CYW("challenges_finish_source", "e");
                A05.finish();
            }
            SimpleWebViewActivity.A00(A05, A0F, new SimpleWebViewConfig(A0f4, (String) null, (String) null, (String) null, false, false, false, false, false, true, false, true, true, false, false));
            return null;
        }
    }
}
