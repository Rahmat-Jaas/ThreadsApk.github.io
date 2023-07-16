package X;

import android.content.Context;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.tigon.iface.TigonRequest;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Nh  reason: invalid class name and case insensitive filesystem */
public final class C60013Nh {
    public static C32165H8c A00(Context context, C10300i6 r5, C313625r r6, Integer num, Integer num2, Collection collection, boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        UserSession A03;
        H1T A0N = AnonymousClass0wJ.A0N(r5);
        A0N.A0J("dynamic_onboarding/get_steps/");
        A0N.A0G(AnonymousClass006.A0Y);
        A0N.A0R("is_ci", z);
        A0N.A0R("fb_connected", z2);
        A0N.A0O("android_id", C18220wO.A0g(context, A0N, "guid", C18230wP.A0i(context)));
        AnonymousClass0fT A032 = AnonymousClass0fS.A03(AnonymousClass0fS.A01(context));
        A0N.A0O(TraceFieldType.NetworkType, AnonymousClass00U.A0N(AnonymousClass0fV.A00(A032.A01), C09450fW.A00(A032.A00), Rfc3492Idn.delimiter));
        A0N.A0R("fb_installed", z3);
        A0N.A0R("tos_accepted", z4);
        switch (num.intValue()) {
            case 0:
                str = TigonRequest.PREFETCH;
                break;
            case 1:
                str = "start";
                break;
            default:
                str = "finish";
                break;
        }
        AnonymousClass269.A0A(A0N, "progress_state", str);
        boolean z5 = false;
        if (r5 != null && (!(r5 instanceof UserSession) ? C05030Qo.A00(r5).A00.A0B() > 0 : !((A03 = C05030Qo.A03(r5)) == null || C18210wN.A0i(A03.multipleAccountHelper).size() <= 1))) {
            z5 = true;
        }
        A0N.A0R("is_secondary_account_creation", z5);
        A0N.A0O("timezone_offset", Long.toString(C19591Ayr.A00().longValue()));
        A0N.A0P("phone_id", C18190wL.A0l(r5));
        A0N.A0P("seen_steps", A01(collection));
        C31103Gfm.A02();
        A0N.A0P("locale", C31103Gfm.A02().toString());
        String str2 = null;
        if (C313625r.SAC != r6) {
            if (r6 != null) {
                str2 = r6.A00;
            }
        } else if (num2 != null) {
            str2 = num2 == AnonymousClass006.A0C ? "account_linking" : num2 == AnonymousClass006.A00 ? "email" : "phone";
        }
        A0N.A0P("reg_flow_taken", str2);
        return C18180wK.A0T(A0N, AnonymousClass1T8.class, C60033Nj.class);
    }

    public static String A01(Collection collection) {
        JSONArray A0i = C18250wR.A0i();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3V7 r4 = (AnonymousClass3V7) it.next();
            JSONObject A0y = C18230wP.A0y();
            try {
                A0y.put("step_name", r4.A01).put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r4.A00.intValue());
                A0i.put(A0y);
            } catch (JSONException unused) {
            }
        }
        return A0i.toString();
    }
}
