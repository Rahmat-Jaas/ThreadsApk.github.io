package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.3Dh  reason: invalid class name and case insensitive filesystem */
public final class C57973Dh {
    public final Fragment A00(Context context, UserSession userSession, Integer num) {
        String str;
        AnonymousClass0wJ.A1N(context, userSession);
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A06;
        boolean z = false;
        if ((C63803iN.A0E(r3, userSession, 36319068088701837L) || C63803iN.A0E(r3, userSession, 36317977168777287L)) && (!C35392Ng.A00(userSession) || (C35392Ng.A00(userSession) && C35422Nj.A00(userSession)))) {
            z = true;
        }
        C58303Ew r5 = (C58303Ew) userSession.A01(C58303Ew.class, C75804cq.A00);
        HashMap A0y = AnonymousClass0wJ.A0y();
        switch (num.intValue()) {
            case 1:
                str = "settings";
                break;
            case 2:
                str = "hidden_requests_folder";
                break;
            case 3:
                str = "safety_check";
                break;
            case 4:
                str = "comment_tools_upsell";
                break;
            case 5:
                str = "hidden_words_nux";
                break;
            case 6:
                str = "spam_scam_reconsent";
                break;
            default:
                str = "evergreen_safety_check_snackbar";
                break;
        }
        A0y.put("entry_point", str);
        String str2 = "True";
        String str3 = "False";
        if (z) {
            str3 = str2;
        }
        A0y.put("is_spam_filter_enabled", str3);
        if (AnonymousClass3WI.A02(userSession) && C35402Nh.A00(userSession).booleanValue()) {
            String str4 = "False";
            if (r5.A00(2)) {
                str4 = str2;
            }
            A0y.put("is_predefined_list_enabled", str4);
        }
        if (AnonymousClass3WI.A02(userSession) && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321426025945876L)) {
            if (!r5.A00(3)) {
                str2 = "False";
            }
            A0y.put("is_custom_list_enabled", str2);
        }
        C63743iE A02 = C63743iE.A02("com.instagram.mwb.si.content_filter.settings", A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18210wN.A0s(context, A0N, 2131831620);
        return C62853b1.A02(A0N, A02);
    }
}
