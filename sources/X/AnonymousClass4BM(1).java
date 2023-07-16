package X;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4BM  reason: invalid class name */
public final class AnonymousClass4BM implements C83514rX {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C58943Ip A01;
    public final /* synthetic */ Integer A02;

    public final void Bsb(String str) {
        SharedPreferences.Editor A022;
        String str2;
        C04220Ms.A0B(str, 0);
        if (this.A02 != null) {
            UserSession userSession = this.A01.A04;
            if (userSession != null) {
                AnonymousClass20y r6 = AnonymousClass20y.Social;
                C04220Ms.A0B(r6, 1);
                C28161tl A012 = AnonymousClass3WS.A01(userSession);
                SharedPreferences A013 = AnonymousClass3Zs.A03(userSession).A01(D2R.A0q);
                if (A013.getBoolean(AnonymousClass3MD.A00(r6), false)) {
                    A022 = A013.edit();
                    str2 = "SUBSCRIBER_SOCIAL_CHANNEL_CREATION_KEY";
                } else {
                    AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
                    if (C63803iN.A01(r2, userSession, 36601483667967688L) != 0 || C63803iN.A0E(r2, userSession, 36320008692307579L)) {
                        A022 = C28161tl.A02(A012);
                        str2 = "channel_creator_nux_variant";
                    } else {
                        A022 = A013.edit();
                        str2 = AnonymousClass3MD.A00(r6);
                    }
                }
                AnonymousClass0wJ.A13(A022, str2, true);
            }
            C04220Ms.A0E("userSession");
            throw null;
        }
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            if (this.A01.A04 != null) {
                C04220Ms.A0C(fragment, "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule");
                AnonymousClass7Ko.A0E(false, "Must call setInstanceSupplier first");
                throw null;
            }
            C04220Ms.A0E("userSession");
            throw null;
        }
    }

    public AnonymousClass4BM(Fragment fragment, C58943Ip r2, Integer num) {
        this.A02 = num;
        this.A01 = r2;
        this.A00 = fragment;
    }

    public final void Bsa(Throwable th) {
        String str;
        C58943Ip r4 = this.A01;
        AnonymousClass49J r9 = (AnonymousClass49J) r4.A0A.getValue();
        if (th == null || (str = th.toString()) == null) {
            str = "";
        }
        C319829s r8 = C319829s.CREATE_SUBSCRIBER_CHAT;
        AnonymousClass49J.A00(AnonymousClass28X.VIEW, C319929t.THREAD_CREATE_ERROR, C320029u.CHAT_VIEW, r8, r9, AnonymousClass4WK.A0O(C18180wK.A0p("error_message", str)));
        Context context = r4.A00;
        if (context == null) {
            C04220Ms.A0E("context");
            throw null;
        }
        C63813iO.A03(context, (String) null, 2131826051, 0);
        C84474tC r0 = r4.A01;
        if (r0 == null) {
            C04220Ms.A0E("delegate");
            throw null;
        } else {
            r0.BoZ();
        }
    }
}
