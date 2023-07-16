package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.2HC  reason: invalid class name */
public final class AnonymousClass2HC {
    public static void A00(AnonymousClass601 r19, String str, String str2, String str3) {
        AnonymousClass601 r3 = r19;
        C04220Ms.A0B(r3, 0);
        FragmentActivity A05 = C63913ic.A05(r3);
        C10300i6 A0F = C63913ic.A0F(r3);
        C11630kW A0A = C63913ic.A0A(r3);
        String moduleName = A0A.getModuleName();
        Bundle A06 = C18180wK.A06();
        String str4 = str;
        A06.putString("original_url", str4);
        A06.putBoolean("com.instagram.url.extra.IS_ON_CREATE", true);
        A06.putString("com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME", moduleName);
        C18180wK.A0w(A06, A0F);
        Object obj = C62513aA.A00(A05, A06, str4).A00;
        if (obj == null || !AnonymousClass0wJ.A1X(obj)) {
            Uri A01 = C15430rJ.A01(str4);
            if (!A01.isOpaque() || !A01.isAbsolute()) {
                Intent flags = new Intent("android.intent.action.VIEW", A01).putExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", true).setFlags(Constants.LOAD_RESULT_PGO_ATTEMPTED);
                if (C09650fs.A00(A05, flags) == 4) {
                    if (!C10650ih.A0A(A05, flags)) {
                        C30967GcS.A02("BKBloksActionNavigationOpenUrlImpl", AnonymousClass00U.A0V("Opening FOA URL ", str4, " was unsuccessful."));
                    } else {
                        return;
                    }
                }
                AnonymousClass3RZ.A00();
                C63913ic.A0F(r3);
                if (C63913ic.A0F(r3) instanceof UserSession) {
                    C37350Jpy A0Y = C18230wP.A0Y(C63913ic.A05(r3), C63913ic.A0J(r3), C171209wF.A0H, str4);
                    A0Y.A07(A0A.getModuleName());
                    String str5 = str2;
                    if (str2 != null) {
                        Bundle bundle = A0Y.A0T.A00;
                        bundle.putString(I17.A00(184), str5);
                        bundle.putString(I17.A00(183), str3);
                    }
                    A0Y.A04();
                    return;
                }
                SimpleWebViewActivity.A00(C63913ic.A05(r3), C63913ic.A0F(r3), new SimpleWebViewConfig(str4, (String) null, (String) null, (String) null, false, false, false, false, false, true, false, true, true, false, false));
                return;
            }
            Intent A09 = C18210wN.A09("android.intent.action.VIEW");
            A09.setData(A01);
            C10650ih.A0B(A05, A09);
        }
    }
}
