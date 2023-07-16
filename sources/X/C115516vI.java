package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.proxygen.TraceFieldType;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.service.session.UserSession;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.6vI  reason: invalid class name and case insensitive filesystem */
public final class C115516vI {
    public final Fragment A02(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        C22711Zd r1 = new C22711Zd();
        Bundle A06 = C18180wK.A06();
        C05050Qq.A00(A06, userSession);
        r1.setArguments(A06);
        return r1;
    }

    public final Fragment A03(LbR lbR) {
        C04220Ms.A0B(lbR, 0);
        Bundle A06 = C18180wK.A06();
        A06.putSerializable(C18170wI.A00(490), lbR);
        AnonymousClass9NY r0 = new AnonymousClass9NY();
        r0.setArguments(A06);
        return r0;
    }

    public final Fragment A00(Bundle bundle) {
        String A01;
        Bundle bundle2 = bundle;
        String string = bundle2.getString("page");
        if (bundle2.getParcelable("logger_data") == null) {
            HashSet A0u = C18200wM.A0u();
            String A00 = AnonymousClass3QG.A00(0, 10, 107);
            if (bundle2.getString(A00) != null) {
                A01 = bundle2.getString(A00);
            } else {
                A01 = C122037Js.A01();
            }
            bundle2.putParcelable("logger_data", new FBPayLoggerData((String) null, "fbpay_hub", (String) null, (String) null, A01, (String) null, C86104wH.A13(A0u, A0u)));
        }
        Map A06 = C122037Js.A06((FBPayLoggerData) C18240wQ.A0D(bundle2, "logger_data"));
        A06.put("referrer", bundle2.getString("referrer"));
        C121817Ig.A02("view_name", "fbpay_hub", A06).Bb8("client_load_fbpayhub_init", A06);
        if (string != null) {
            switch (string.hashCode()) {
                case -1847017863:
                    if (string.equals("payment_methods")) {
                        return AnonymousClass7Kz.A0K().A04(bundle2, "payment_methods");
                    }
                    break;
                case -105689780:
                    if (string.equals("welcome_page")) {
                        bundle2.putBoolean("show_branding_page", true);
                        break;
                    }
                    break;
                case 3198785:
                    if (string.equals("help")) {
                        bundle2.putInt("title_res", 2131827299);
                        bundle2.putString("web_fragment_load_url", "https://help.instagram.com/357872324807367");
                        return AnonymousClass7Kz.A0K().A04(bundle2, "web_view");
                    }
                    break;
                case 949122880:
                    if (string.equals("security")) {
                        return AnonymousClass7Kz.A07().A06.A00(bundle2, "PIN_BIO_SETTINGS");
                    }
                    break;
                case 1082290744:
                    if (string.equals("receipt")) {
                        return AnonymousClass7Kz.A0K().A04(bundle2, "receipt");
                    }
                    break;
                case 1434631203:
                    if (string.equals("settings")) {
                        if (!C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass7HK.A00(), 36321958601694318L)) {
                            return AnonymousClass7Kz.A0K().A04(bundle2, "settings");
                        }
                    }
                    break;
            }
        }
        return AnonymousClass7Kz.A0K().A04(bundle2, "home");
    }

    public final Fragment A01(Bundle bundle, String str) {
        C34654Icg icg = new C34654Icg();
        bundle.putSerializable(I17.A00(615), C35392Iu0.BLENDED);
        bundle.putString(I17.A00(498), str);
        icg.setArguments(bundle);
        return icg;
    }

    public final Fragment A04(String str, String str2, String str3) {
        C29261xe r2 = new C29261xe();
        Bundle A06 = C18180wK.A06();
        A06.putString(C18170wI.A00(452), str3);
        A06.putString(TraceFieldType.ContentType, str2);
        A06.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        r2.setArguments(A06);
        return r2;
    }
}
