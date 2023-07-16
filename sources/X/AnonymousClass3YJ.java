package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3YJ  reason: invalid class name */
public final class AnonymousClass3YJ {
    public static final AnonymousClass3YJ A08 = new AnonymousClass3YJ();
    public String A00;
    public String A01;
    public C04560Oe A02;
    public C04560Oe A03;
    public final Object A04 = new Object();
    public final List A05 = AnonymousClass0wJ.A0v();
    public final AtomicBoolean A06 = new AtomicBoolean();
    public final AtomicBoolean A07 = C18230wP.A0w();

    public static void A00(AnonymousClass3YJ r3, String str, String str2) {
        C04560Oe r0 = r3.A03;
        if (r0 != null) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M((C13330nS) ((C021209x) r0.get()), "mobile_config_general_cases"), 2413);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0T("mc_event_name", "mobile_config_api2_consistency");
                A0I.A0V("str_data", new AnonymousClass4Vm(r3, str, str2));
                A0I.Bb4();
            }
        }
    }

    public final /* synthetic */ void A01(String str, String str2) {
        C13780oI.A01("MobileConfigApi2GeneralLoggerImpl_scheduleLog", 1616975295);
        try {
            A00(this, str, str2);
        } finally {
            C13780oI.A00(-1988461039);
        }
    }
}
