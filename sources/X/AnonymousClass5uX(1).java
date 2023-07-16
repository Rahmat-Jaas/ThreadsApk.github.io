package X;

import android.content.Context;
import com.facebook.smartcapture.logging.SCEventNames;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.KtLambdaShape29S0201000_I2;

/* renamed from: X.5uX  reason: invalid class name */
public final class AnonymousClass5uX extends AnonymousClass4TI {
    public final C22261Ud A00;
    public final C07440bW A01;
    public final Context A02;

    public AnonymousClass5uX(Context context, C22261Ud r3, C07440bW r4) {
        C04220Ms.A0B(context, 1);
        this.A02 = context;
        this.A00 = r3;
        this.A01 = r4;
    }

    public final void A03() {
        String str;
        AnonymousClass0LU.A0C("proxy_service", "Initialize proxy service.");
        if (!C08230d1.A01()) {
            AnonymousClass0LU.A0C("proxy_service", "User not in allowed region.");
            return;
        }
        AnonymousClass01V r3 = AnonymousClass01V.A0p;
        C04220Ms.A06(r3);
        r3.markerStart(79499422);
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (!C63173fJ.A05(r2, 2324147326605988564L)) {
            AnonymousClass0LU.A0C("proxy_service", "Proxy service disabled by init killswitch.");
            str = "init_killswitch";
        } else {
            if (C63173fJ.A05(r2, 2324147326606381784L)) {
                AnonymousClass0LU.A0C("proxy_service", "Initialize MetaConnectivityProber.");
                C110796mI r11 = new C110796mI(this.A02, r3);
                HGV hgv = new HGV(r3);
                AnonymousClass0LU.A0C("connectivity_prober", "Begin connectivity probe.");
                AnonymousClass01V r8 = r11.A04;
                r8.markerStart(79501264);
                r8.markerAnnotate(79501264, "has_vpn", AnonymousClass0Vx.A00(r11.A03));
                AnonymousClass0g9.A00().A01(new AnonymousClass615(new KtLambdaShape29S0201000_I2(0, 12, r11, new C133847wY(hgv, r11))), 0);
            }
            Pair A002 = C08230d1.A00();
            boolean A1X = AnonymousClass0wJ.A1X(A002.A00);
            str = (String) A002.A01;
            if (!A1X) {
                AnonymousClass0LU.A0C("proxy_service", "Proxy service disabled.");
            } else {
                AnonymousClass0LU.A0C("proxy_service", "Downloading ProxyService via Voltron.");
                r3.markerPoint(79499422, "download_service");
                r3.markerAnnotate(79499422, "init_reason", str);
                C32318HFt hFt = new C32318HFt(r3, this);
                ArrayList A0v = AnonymousClass0wJ.A0v();
                C18240wQ.A1Q(A0v, new C28979FfK[]{C28979FfK.PROXY_SERVICE});
                C36813Jf5 jf5 = new C36813Jf5((C12560m7) null, hFt, AnonymousClass006.A00, A0v);
                C10300i6 r1 = this.A00.A00;
                C04220Ms.A06(r1);
                C37200JmN.A00().A02(r1, jf5);
                return;
            }
        }
        r3.markerAnnotate(79499422, SCEventNames.Params.SESSION_END_REASON, str);
        r3.markerEnd(79499422, 4);
    }
}
