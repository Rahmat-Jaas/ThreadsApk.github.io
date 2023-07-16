package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.Random;

/* renamed from: X.1to  reason: invalid class name and case insensitive filesystem */
public final class C28181to extends C61823Vx {
    public static final Random A04 = new Random();
    public final Context A00;
    public final Object A01 = new Object();
    public volatile AnonymousClass3Ie A02;
    public volatile AnonymousClass3Ie A03;

    public static void A00(UserSession userSession, String str, long j, boolean z) {
        try {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(new C10680ik(userSession).A00(), "mobile_config_sampled_access"), 2414);
            A0I.A0S("internal_sampling_rate", 50000L);
            A0I.A0Q("is_default_fallback", Boolean.valueOf(z));
            A0I.A0T("param_specifier", String.valueOf(j));
            A0I.A0T("client_value", str);
            A0I.A0S("config_id", C18230wP.A0f(C05450Tu.A00(j)));
            A0I.A0S("param_id", C18230wP.A0f(C05360Tg.A00(j)));
            A0I.Bb4();
        } catch (AnonymousClass0Tc e) {
            AnonymousClass0LU.A0L("QuickExperimentManagerFactoryImpl", "Failed to get config key with specifier:%d", e, C18240wQ.A1b(j));
        }
    }

    public C28181to(Context context) {
        this.A00 = context.getApplicationContext();
    }
}
