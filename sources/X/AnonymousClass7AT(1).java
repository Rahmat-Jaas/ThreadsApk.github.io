package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4001000_I2;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* renamed from: X.7AT  reason: invalid class name */
public final class AnonymousClass7AT {
    public static final Map A03 = AnonymousClass4WJ.A0G(C18180wK.A0p("partially_enter_viewport", 1), C18180wK.A0p("fully_enter_viewport", 1));
    public final KtCSuperShape0S4001000_I2 A00;
    public final QuickPerformanceLogger A01;
    public final ExecutorService A02;

    public final void A03(String str) {
        C04220Ms.A0B(str, 0);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("error", str);
        A06("layout_parsing_fail", C18190wL.A0n(new JSONObject(A0y)));
    }

    public final void A04(String str) {
        C04220Ms.A0B(str, 0);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("error", str);
        A06("prepare_render_fail", C18190wL.A0n(new JSONObject(A0y)));
    }

    public final void A05(String str) {
        C04220Ms.A0B(str, 0);
        this.A02.execute(new AnonymousClass82K(this, str, this.A01.currentMonotonicTimestampNanos()));
    }

    public final void A06(String str, String str2) {
        this.A02.execute(new C1363982o(this, str, str2, this.A01.currentMonotonicTimestampNanos()));
    }

    public final void A07(String str, Map map) {
        C04220Ms.A0B(str, 0);
        this.A02.execute(new C1364082p(this, str, map, this.A01.currentMonotonicTimestampNanos()));
    }

    public final void A00() {
        this.A02.execute(new C1358580k(this, this.A01.currentMonotonicTimestampNanos()));
    }

    public final void A01() {
        this.A02.execute(new C1358680l(this, this.A01.currentMonotonicTimestampNanos()));
    }

    public final void A02() {
        this.A02.execute(new C1358780m(this, this.A01.currentMonotonicTimestampNanos()));
    }

    public AnonymousClass7AT(KtCSuperShape0S4001000_I2 ktCSuperShape0S4001000_I2, QuickPerformanceLogger quickPerformanceLogger) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C04220Ms.A06(newSingleThreadExecutor);
        this.A01 = quickPerformanceLogger;
        this.A00 = ktCSuperShape0S4001000_I2;
        this.A02 = newSingleThreadExecutor;
    }

    public final void A08(boolean z) {
        String str;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        A0y.put(AnonymousClass000.A00(805), str);
        A06("layout_parsing_success", C18190wL.A0n(new JSONObject(A0y)));
    }
}
