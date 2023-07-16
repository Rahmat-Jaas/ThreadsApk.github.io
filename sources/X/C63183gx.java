package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3gx  reason: invalid class name and case insensitive filesystem */
public final class C63183gx {
    public static C25828Dsm A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, List list, boolean z) {
        AnonymousClass7Ko.A0B(C18180wK.A1W(list.isEmpty() ? 1 : 0));
        User user = (User) list.get(0);
        if (z) {
            C25828Dsm A0W = C18190wL.A0W(context);
            A0W.A0L(2131830396);
            A0W.A0p(AnonymousClass0wJ.A0l(context, user.BK7(), 2131830392));
            C18230wP.A1M(A0W, fragmentActivity, userSession, 79, 2131835552);
            return A0W;
        }
        String A0l = AnonymousClass0wJ.A0l(context, user.BK7(), 2131830395);
        C25828Dsm A0W2 = C18190wL.A0W(context);
        A0W2.A0L(2131830396);
        A0W2.A0p(A0l);
        return A0W2;
    }

    public static void A01(Activity activity, Context context, UserSession userSession, User user, C84414t6 r14, String str) {
        C25828Dsm A0W;
        C13330nS A01;
        String str2;
        String str3;
        UserSession userSession2 = userSession;
        C28161tl A012 = AnonymousClass3WS.A01(userSession);
        User user2 = user;
        if (r14 == null || !user.BRq() || !r14.Cs6()) {
            SharedPreferences sharedPreferences = A012.A00;
            if (sharedPreferences.getInt("cannot_mention_error_nux_shown_count", 0) < 1) {
                String A0l = AnonymousClass0wJ.A0l(context, user.BK7(), 2131830394);
                C25828Dsm A0W2 = C18190wL.A0W(context);
                A0W2.A0L(2131830396);
                A0W2.A0p(A0l);
                A0W2.A0P((DialogInterface.OnClickListener) null, 2131831976);
                if (r14 != null && r14.Cs7()) {
                    A0W2.A0N(C18220wO.A0O(r14, 190), 2131835553);
                }
                AnonymousClass0wJ.A1K(A0W2);
                AnonymousClass0wJ.A14(sharedPreferences, "cannot_mention_error_nux_shown_count", 0);
                A01 = C13330nS.A01((C11630kW) null, userSession);
                str2 = "impression";
                str3 = "cant_mention_alert_nux";
            } else if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36326412482782765L)) {
                C38040KHr kHr = C38040KHr.A01;
                C63733iD A013 = C63733iD.A01();
                A013.A0A = AnonymousClass0wJ.A0l(context, user.BK7(), 2131830395);
                A013.A0C();
                A013.A02 = context.getResources().getDimensionPixelOffset(R.dimen.canvas_colour_wheel_offset_y);
                A013.A0M = true;
                C63733iD.A09(kHr, A013);
                return;
            } else {
                if (activity != null) {
                    A0W = C18190wL.A0W(activity);
                } else {
                    A0W = C18190wL.A0W(context);
                }
                A0W.A02 = AnonymousClass0wJ.A0l(context, user.BK7(), 2131830397);
                A0W.A0P((DialogInterface.OnClickListener) null, 2131831976);
                AnonymousClass0wJ.A1K(A0W);
                A01 = C13330nS.A01((C11630kW) null, userSession);
                str2 = "impression";
                str3 = "cant_mention_alert";
            }
        } else {
            C25828Dsm A0W3 = C18190wL.A0W(context);
            A0W3.A0L(2131830396);
            A0W3.A0p(AnonymousClass0wJ.A0l(context, user.BK7(), 2131830392));
            A0W3.A0N(C18220wO.A0O(r14, 191), 2131835552);
            A0W3.A0P((DialogInterface.OnClickListener) null, 2131831976);
            AnonymousClass0wJ.A1K(A0W3);
            A01 = C13330nS.A01((C11630kW) null, userSession);
            str2 = "impression";
            str3 = "cant_mention_alert_blocked";
        }
        C54502zY.A00(A01, userSession2, user2, str, str2, str3);
    }

    public static void A02(Context context, UserSession userSession, User user, C84414t6 r4, String str) {
        A01((Activity) null, context, userSession, user, r4, str);
    }

    public static void A03(FragmentActivity fragmentActivity, UserSession userSession) {
        C63743iE.A09(fragmentActivity, C18190wL.A0N(userSession), C63743iE.A02("com.instagram.bullying.privacy.mentions_options", AnonymousClass0wJ.A0y()), 2131830391);
    }

    public static void A04(FragmentActivity fragmentActivity, UserSession userSession) {
        C54502zY.A00(C13330nS.A01((C11630kW) null, userSession), userSession, (User) null, "comments", "click", "cant_mention_alert_manage_blocked_accounts");
        Fragment BhZ = C50452t1.A00().A00.BhZ(userSession);
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(fragmentActivity, userSession);
        A0Q.A03 = BhZ;
        A0Q.A05();
    }

    public static void A05(FragmentActivity fragmentActivity, UserSession userSession) {
        C63743iE A02 = C63743iE.A02("com.instagram.bullying.privacy.mentions_options", AnonymousClass0wJ.A0y());
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18210wN.A0s(fragmentActivity, A0N, 2131830391);
        A0N.A0e = true;
        C63863iT.A09(fragmentActivity, C62853b1.A00(A0N, A02), userSession, ModalActivity.class, "bloks");
    }
}
