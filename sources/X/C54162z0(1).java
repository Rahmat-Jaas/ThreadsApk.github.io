package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2z0  reason: invalid class name and case insensitive filesystem */
public final class C54162z0 {
    public static final void A00(C10300i6 r9, String str, String str2, Map map) {
        String str3;
        String str4;
        String str5;
        C04220Ms.A0B(r9, 0);
        String str6 = null;
        if (map != null) {
            Iterator A0x = C18220wO.A0x(map);
            String str7 = null;
            str3 = null;
            str4 = null;
            while (A0x.hasNext()) {
                String A0k = C18180wK.A0k(A0x);
                if (A0k != null) {
                    String A0r = C18220wO.A0r(A0k, map);
                    switch (A0k.hashCode()) {
                        case -1539894552:
                            if (!A0k.equals("utm_content")) {
                                break;
                            } else {
                                str6 = A0r;
                                break;
                            }
                        case -64687999:
                            if (!A0k.equals("utm_campaign")) {
                                break;
                            } else {
                                str7 = A0r;
                                break;
                            }
                        case 1889642278:
                            if (!A0k.equals("utm_medium")) {
                                break;
                            } else {
                                str4 = A0r;
                                break;
                            }
                        case 2071166924:
                            if (!A0k.equals("utm_source")) {
                                break;
                            } else {
                                str3 = A0r;
                                break;
                            }
                    }
                } else {
                    return;
                }
            }
            str5 = str6;
            str6 = str7;
        } else {
            str5 = null;
            str3 = null;
            str4 = null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r9), "instagram_android_install_with_referrer"), 1689);
        if (str6 != null) {
            A0I.A0T("utm_campaign", str6);
        }
        if (str5 != null) {
            A0I.A0T("utm_content", str5);
        }
        if (str3 != null) {
            A0I.A0T("utm_source", str3);
        }
        if (str4 != null) {
            A0I.A0T("utm_medium", str4);
        }
        if (str2 != null) {
            A0I.A0T("error", str2);
        }
        AnonymousClass269.A05(A0I);
        A0I.A0T("containermodule", "install_referrer");
        A0I.A0T("referrer", str);
        A0I.Bb4();
    }
}
