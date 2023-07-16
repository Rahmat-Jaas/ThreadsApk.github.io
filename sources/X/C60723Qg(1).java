package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.Constants;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3Qg  reason: invalid class name and case insensitive filesystem */
public final class C60723Qg {
    public static final HashSet A00 = AnonymousClass4WM.A04("com.facebook.wakizashi", "com.facebook.katana", "com.facebook.orca", "com.oculus.twilight", "com.instagram.android", "com.instagram.barcelona");

    public static final Object A00(AnonymousClass601 r30, C63893iY r31) {
        boolean equals;
        Long l;
        Long l2;
        String str;
        ApplicationInfo applicationInfo;
        String str2;
        AnonymousClass601 r9 = r30;
        C63893iY r2 = r31;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r9);
        List list = r2.A00;
        String A0q = C18190wL.A0q(list, 0);
        String A0q2 = C18190wL.A0q(list, A1Z ? 1 : 0);
        String A0q3 = C18190wL.A0q(list, 3);
        Object A0B = C63893iY.A0B(r2, 4);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) A0B;
        String str4 = (String) C63893iY.A0C(r2, "null cannot be cast to non-null type kotlin.String", 5);
        AnonymousClass3HX r10 = r9.A00;
        if (r10 != null) {
            C10300i6 A0F = C63913ic.A0F(r9);
            C18200wM.A1R(A0F);
            UserSession userSession = (UserSession) A0F;
            long currentTimeMillis = System.currentTimeMillis();
            if (A0q3 == null) {
                equals = false;
            } else {
                equals = A0q3.equals("company_identity_switcher");
            }
            if (equals) {
                StringBuilder A0r = C18200wM.A0r();
                if (A0q != null) {
                    str2 = AnonymousClass00U.A0L(A0q, "&initiator_app=");
                } else {
                    str2 = null;
                }
                A0r.append(str2);
                A0r.append("IG_ANDROID&start_time=");
                A0r.append(currentTimeMillis);
                A0r.append("&inter_app_identity_switch=");
                A0r.append(str3);
                A0r.append("&xapp_session_id=");
                A0q = C18180wK.A0i(str4, A0r);
            }
            FragmentActivity A05 = C63913ic.A05(r9);
            Intent intent = new Intent("android.intent.action.VIEW", C15430rJ.A01(A0q));
            List<ResolveInfo> queryIntentActivities = A05.getPackageManager().queryIntentActivities(intent, Constants.LOAD_RESULT_PGO_ATTEMPTED);
            C04220Ms.A06(queryIntentActivities);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (ResolveInfo next : queryIntentActivities) {
                ActivityInfo activityInfo = next.activityInfo;
                HashSet hashSet = A00;
                if (activityInfo == null || (applicationInfo = activityInfo.applicationInfo) == null) {
                    str = null;
                } else {
                    str = applicationInfo.packageName;
                }
                if (hashSet.contains(str)) {
                    A0v.add(next);
                }
            }
            boolean A1K = C18250wR.A1K(A0v);
            String userId = userSession.getUserId();
            if (userId != null) {
                l = AnonymousClass0wJ.A0d(userId);
            } else {
                l = null;
            }
            Boolean valueOf = Boolean.valueOf(A1K);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "horizontal_switch_initiated"), 724);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0Q("target_app_installation_status", valueOf);
                A0I.A0S("initiator_identity_id", l);
                A0I.A0T("event_session_id", str4);
                A0I.Bb4();
            }
            if (A1K) {
                C16420t2.A00().A06().A09(r10.A00, intent);
            } else if (!(A0q2 == null || A0q2.length() == 0)) {
                C10650ih.A01(r10.A00, new Intent("android.intent.action.VIEW", C15430rJ.A01(A0q2)));
                A0q.getClass();
                String queryParameter = C18210wN.A0A(A0q).getQueryParameter("account_id");
                if (queryParameter != null) {
                    l2 = AnonymousClass0wJ.A0d(queryParameter);
                } else {
                    l2 = null;
                }
                if (equals) {
                    C63453hV.A01(AnonymousClass28R.INTER_APP, userSession, l2, l2, "", str3, "IG_ANDROID", "app_store", str4, (double) currentTimeMillis, false, A1Z, A1Z);
                    return null;
                }
            }
            return null;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
