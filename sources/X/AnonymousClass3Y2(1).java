package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.3Y2  reason: invalid class name */
public final class AnonymousClass3Y2 {
    public final C021209x A00;

    public final void A02(String str, String str2, List list) {
        C04220Ms.A0B(str2, 1);
        A01(AnonymousClass28H.INFO, A00(str, str2, (Throwable) null, list), this);
    }

    public static final void A01(AnonymousClass28H r2, String str, AnonymousClass3Y2 r4) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) r4.A00, "attribution_sdk_debug"), 47);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(r2, "log_level");
            A0I.A0T(DialogModule.KEY_MESSAGE, str);
            A0I.Bb4();
        }
    }

    public AnonymousClass3Y2(C021209x r1) {
        this.A00 = r1;
    }

    public static final String A00(String str, String str2, Throwable th, List list) {
        JSONObject A0y = C18230wP.A0y();
        A0y.put("event_name", str);
        if (str2 != null) {
            A0y.put(DialogModule.KEY_MESSAGE, str2);
        }
        if (list != null) {
            A0y.put("event_types", list);
        }
        if (th != null) {
            A0y.put("exception", th.toString());
        }
        return C18190wL.A0n(A0y);
    }
}
