package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxDListenerShape156S0200000_1_I2;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.3hN  reason: invalid class name and case insensitive filesystem */
public final class C63373hN {
    public static void A05(Context context, UserSession userSession, String str) {
        String str2 = str;
        if (str != null) {
            TextUtils.isEmpty((CharSequence) null);
            SimpleWebViewActivity.A00(context, userSession, new SimpleWebViewConfig(str2, (String) null, (String) null, (String) null, false, false, false, false, false, true, false, true, false, false, false));
        }
    }

    public static boolean A06(DirectShareTarget directShareTarget, UserSession userSession, User user, boolean z) {
        if ((directShareTarget == null || !directShareTarget.A08()) && (user == null || 1 != user.Apb())) {
            return z && !C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36310314945347597L);
        }
        return true;
    }

    public static void A01(Activity activity) {
        if (activity != null) {
            C18200wM.A12(activity, C25745DrH.A00);
        }
    }

    public static void A02(Activity activity, UserSession userSession, C27950Ew0 ew0, User user, String str, String str2, JSONObject jSONObject, boolean z) {
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        C27950Ew0 ew02 = ew0;
        User user2 = user;
        String str3 = str;
        String str4 = str2;
        JSONObject jSONObject2 = jSONObject;
        C64103jc r20 = new C64103jc(activity, userSession, ew0, user, str, str2, jSONObject, z);
        if (user2.A0e() == C169839tz.PrivacyStatusPublic) {
            AnonymousClass0wJ.A1N(activity2, userSession2);
            C25791Ds4.A04(activity2, (C15680ri) null, (C63873iU) null, (BKU) null, (C20066BMj) null, (SearchContext) null, userSession2, ew02, user2, (Integer) null, str3, str4, (String) null, jSONObject2);
            int i = 2131837225;
            if (user2.Aj4() == C23894D0g.FollowStatusFollowing) {
                i = 2131827591;
            }
            C63813iO.A01(activity2, activity2.getString(i));
            if (!z) {
                A01(activity2);
                return;
            }
            return;
        }
        ew02.Bzl(user2);
        C25828Dsm A0W = C18190wL.A0W(activity2);
        A0W.A02 = AnonymousClass0wJ.A0l(activity2, user2.BK7(), 2131837232);
        C18220wO.A14(activity2, A0W, 2131837226);
        A0W.A0P(r20, 2131837223);
        A0W.A0O((DialogInterface.OnClickListener) null, 2131823054);
        A0W.A0e(new IDxDListenerShape156S0200000_1_I2(1, ew02, user2));
        A0W.A0q(true);
        A0W.A0r(true);
        AnonymousClass0wJ.A1K(A0W);
    }

    public static void A03(Context context, AnonymousClass601 r13, C109326jp r14, C109326jp r15, C37383Jqm jqm, UserSession userSession, User user, C307722x r19, String str) {
        String str2 = str;
        UserSession userSession2 = userSession;
        C13330nS A01 = C13330nS.A01(new C684143r(str2), userSession2);
        C36480JXd.A02.A00();
        C37383Jqm jqm2 = jqm;
        AnonymousClass4NM r8 = new AnonymousClass4NM(r13, r14, jqm2);
        AnonymousClass4NJ r6 = new AnonymousClass4NJ(r13, r15, r14);
        C37032Jj9 A0L = C18210wN.A0L(userSession2);
        C18250wR.A1B(A0L, true);
        A0L.A0Z = true;
        A0L.A0e = true;
        A0L.A00 = 0.7f;
        C61913Wi.A00(context, A01, jqm2, A0L, userSession2, user, r6, r19, r8, str2, (JSONObject) null, true);
    }

    public static C34640IcN A00(UserSession userSession, User user, C50532t9 r4, String str) {
        Bundle A0E = AnonymousClass0wJ.A0E(userSession);
        A0E.putString("MuteSettingsFragment.ARG_DISPLAYED_USER_ID", user.getId());
        A0E.putString("MuteSettingsFragment.ARG_SELECTED_FROM", str);
        C22521Yk r0 = new C22521Yk();
        r0.setArguments(A0E);
        r0.A02 = r4;
        return r0;
    }

    public static void A04(Context context, C37383Jqm jqm, UserSession userSession, User user, C50532t9 r8, String str) {
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        A0L.A0O = AnonymousClass0wJ.A0l(context, user.BK7(), 2131835450);
        if (jqm == null) {
            C37383Jqm.A00(context, A00(userSession, user, r8, str), A0L.A00());
            return;
        }
        C18250wR.A1B(A0L, true);
        A0L.A0Z = true;
        A0L.A00 = 0.7f;
        jqm.A09(A00(userSession, user, r8, str), A0L);
    }
}
