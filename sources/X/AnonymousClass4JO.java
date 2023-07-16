package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4JO  reason: invalid class name */
public final class AnonymousClass4JO implements C82924qU {
    public final C11630kW A00;
    public final UserSession A01;
    public final Context A02;
    public final Fragment A03;

    public AnonymousClass4JO(Context context, Fragment fragment, C11630kW r3, UserSession userSession) {
        this.A03 = fragment;
        this.A01 = userSession;
        this.A00 = r3;
        this.A02 = context;
    }

    public final void BN1(Uri uri, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        Set<String> queryParameterNames;
        LinkedHashMap A0y = C18220wO.A0y();
        AnonymousClass5xX r2 = new AnonymousClass5xX();
        Bundle A06 = C18180wK.A06();
        UserSession userSession = this.A01;
        AnonymousClass3W9.A02(A06, userSession);
        if (!(uri == null || (queryParameterNames = uri.getQueryParameterNames()) == null)) {
            Iterator<T> it = queryParameterNames.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                String queryParameter = uri.getQueryParameter(A0k);
                if (queryParameter != null) {
                    C04220Ms.A04(A0k);
                    A0y.put(A0k, queryParameter);
                    A06.putString(A0k, queryParameter);
                }
            }
        }
        if (A0y.containsKey("content_variant") || A0y.containsKey("component_type")) {
            if (C04220Ms.A0I(A0y.get("component_type"), "toast")) {
                Iterator A0u = C18190wL.A0u(A0y);
                while (A0u.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0u);
                    if (C04220Ms.A0I(A0o.getKey(), "content_variant")) {
                        Integer[] A002 = AnonymousClass006.A00(5);
                        int length = A002.length;
                        int i = 0;
                        while (i < length) {
                            switch (A002[i].intValue()) {
                                case 1:
                                    str4 = "consent_debut_reconsider";
                                    break;
                                case 2:
                                    str4 = "consent_debut_reconsider_2";
                                    break;
                                case 3:
                                    str4 = "ig_acv_evergreen_confirmation";
                                    break;
                                case 4:
                                    str4 = "ig_acv_evergreen_confirmation_v2";
                                    break;
                                default:
                                    str4 = "consent_debut_confirmation";
                                    break;
                            }
                            if (!C04220Ms.A0I(str4, A0o.getValue())) {
                                i++;
                            }
                        }
                    }
                }
            } else if (C04220Ms.A0I(A0y.get("component_type"), "bottomsheet")) {
                Iterator A0u2 = C18190wL.A0u(A0y);
                while (A0u2.hasNext()) {
                    Map.Entry A0o2 = C18180wK.A0o(A0u2);
                    String A0p = C18200wM.A0p(A0o2);
                    int hashCode = A0p.hashCode();
                    if (hashCode != -608081141) {
                        if (hashCode != -362962279) {
                            if (hashCode == 659055295 && A0p.equals("content_variant")) {
                                Integer[] A003 = AnonymousClass006.A00(7);
                                int length2 = A003.length;
                                int i2 = 0;
                                while (i2 < length2) {
                                    switch (A003[i2].intValue()) {
                                        case 1:
                                            str3 = "3pd_trial_inline_opt_in";
                                            break;
                                        case 2:
                                            str3 = "3pd_trial_go_to_settings";
                                            break;
                                        case 3:
                                            str3 = "3pd_trial_decide";
                                            break;
                                        case 4:
                                            str3 = "fewer_ads_test_group_content";
                                            break;
                                        case 5:
                                            str3 = "fewer_ads_control_group_content";
                                            break;
                                        case 6:
                                            str3 = "activity_feed_notification_3PD_content";
                                            break;
                                        default:
                                            str3 = "3pd_trial_control";
                                            break;
                                    }
                                    if (!C04220Ms.A0I(str3, A0o2.getValue())) {
                                        i2++;
                                    }
                                }
                            }
                        } else if (A0p.equals("primary_cta_variant")) {
                            Integer[] A004 = AnonymousClass006.A00(6);
                            int length3 = A004.length;
                            int i3 = 0;
                            while (i3 < length3) {
                                switch (A004[i3].intValue()) {
                                    case 1:
                                        str2 = "3pd_trial_inline_opt_in";
                                        break;
                                    case 2:
                                        str2 = "3pd_trial_inline_opt_out";
                                        break;
                                    case 3:
                                        str2 = "fewer_ads_test_group_cta";
                                        break;
                                    case 4:
                                        str2 = "fewer_ads_control_group_cta";
                                        break;
                                    case 5:
                                        str2 = "activity_feed_notification_3PD_inline_opt_in";
                                        break;
                                    default:
                                        str2 = "3pd_trial_open_setting_screen";
                                        break;
                                }
                                if (!C04220Ms.A0I(str2, A0o2.getValue())) {
                                    i3++;
                                }
                            }
                        } else {
                            continue;
                        }
                    } else if (A0p.equals("secondary_cta_variant")) {
                        Integer[] A1Z = C18240wQ.A1Z();
                        int length4 = A1Z.length;
                        int i4 = 0;
                        while (i4 < length4) {
                            switch (A1Z[i4].intValue()) {
                                case 1:
                                    str = "3pd_trial_cancel";
                                    break;
                                case 2:
                                    str = "activity_feed_notification_not_now";
                                    break;
                                default:
                                    str = "3pd_trial_not_now";
                                    break;
                            }
                            if (!C04220Ms.A0I(str, A0o2.getValue())) {
                                i4++;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            r2.setArguments(A06);
            if (C04220Ms.A0I(A0y.get("component_type"), "bottomsheet")) {
                C37032Jj9 A0L = C18210wN.A0L(userSession);
                A0L.A0V = true;
                A0L.A0T = true;
                A0L.A0I = r2;
                A0L.A0J = r2;
                C37383Jqm.A00(this.A03.requireActivity(), r2, A0L.A00());
                return;
            }
            return;
        }
        new AnonymousClass3ED(this.A00, userSession).A00("unknown_params_received", A0y);
    }
}
