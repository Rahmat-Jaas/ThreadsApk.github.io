package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.service.session.UserSession;

/* renamed from: X.4Hm  reason: invalid class name and case insensitive filesystem */
public final class C71094Hm implements C82924qU {
    public UserSession A00;
    public final Fragment A01;

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        KK1 A002 = KK1.A00(this.A00);
        synchronized (A002) {
            A002.A05 = null;
        }
        A002.A06();
        String queryParameter = uri.getQueryParameter("purpose");
        String str2 = "enable_status";
        String str3 = str2;
        if (!str2.equals(queryParameter)) {
            str2 = "auto_response";
            if (!str2.equals(queryParameter)) {
                str2 = "import";
                if (!str2.equals(queryParameter)) {
                    str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                }
            }
        }
        switch (str2.hashCode()) {
            case -1184795739:
                if (str2.equals("import")) {
                    str = "inbox_qp_import";
                    break;
                } else {
                    return;
                }
            case 946560209:
                if (str2.equals("auto_response")) {
                    str = "inbox_qp_auto_response";
                    break;
                } else {
                    return;
                }
            case 1270808110:
                if (str2.equals(str3)) {
                    str = "inbox_qp_enable_status_flow";
                    break;
                } else {
                    return;
                }
            case 1544803905:
                if (str2.equals(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
                    String A003 = I17.A00(687);
                    Bundle A06 = C18180wK.A06();
                    C18210wN.A0x(A06, A003);
                    Fragment fragment = this.A01;
                    C63863iT A02 = C63863iT.A02(fragment.requireActivity(), A06, this.A00, ModalActivity.class, "direct_icebreaker_settings_fragment");
                    A02.A0F();
                    A02.A0J(fragment, 14167);
                    return;
                }
                return;
            default:
                return;
        }
        Bundle A062 = C18180wK.A06();
        C18210wN.A0x(A062, str);
        Fragment fragment2 = this.A01;
        C63863iT A022 = C63863iT.A02(fragment2.requireActivity(), A062, this.A00, ModalActivity.class, "direct_icebreaker_settings_fragment");
        A022.A0F();
        A022.A0I(fragment2.requireActivity());
    }

    public C71094Hm(Fragment fragment, UserSession userSession) {
        this.A01 = fragment;
        this.A00 = userSession;
    }
}
