package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxDListenerShape320S0100000_1_I2;
import com.instagram.service.session.UserSession;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.KtLambdaShape96S0100000_I2_76;
import kotlin.jvm.internal.KtLambdaShape97S0100000_I2_77;

/* renamed from: X.3aY  reason: invalid class name and case insensitive filesystem */
public final class C62703aY {
    public boolean A00;
    public boolean A01;
    public final DialogInterface.OnDismissListener A02;
    public final C83744rv A03;
    public final C82944qX A04;
    public final C3T A05;
    public final UserSession A06;
    public final C84504tF A07;
    public final WeakReference A08;
    public final C04530Oa A09;
    public final C04530Oa A0A;
    public final DialogInterface.OnDismissListener A0B;
    public final AnonymousClass06E A0C;
    public final C11630kW A0D;
    public final C82954qY A0E;

    public C62703aY(C11630kW r3, C3T c3t, UserSession userSession, WeakReference weakReference) {
        C04220Ms.A0B(userSession, 1);
        this.A06 = userSession;
        this.A08 = weakReference;
        this.A0D = r3;
        this.A05 = c3t;
        Object obj = weakReference.get();
        if (obj != null) {
            this.A0C = AnonymousClass06E.A00((AnonymousClass066) obj);
            this.A09 = AnonymousClass0OY.A02(new KtLambdaShape96S0100000_I2_76(this, 49));
            this.A0A = AnonymousClass0OY.A02(new KtLambdaShape97S0100000_I2_77(this, 0));
            this.A07 = new C71924Kz(this);
            this.A0E = new C71624Jn(this);
            this.A02 = new IDxDListenerShape320S0100000_1_I2(this, 7);
            this.A0B = new IDxDListenerShape320S0100000_1_I2(this, 8);
            this.A04 = new C71534Je(this);
            this.A03 = new C71524Jd(this);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A00(BKH bkh, C62703aY r14) {
        FragmentActivity activity;
        FragmentActivity activity2;
        Context context;
        WeakReference weakReference = r14.A08;
        Fragment fragment = (Fragment) weakReference.get();
        BKU bku = bkh.A0M;
        if (bku == null || (!bku.A4E() && bku.A1l() != 19)) {
            C34640IcN icN = (C34640IcN) weakReference.get();
            if (icN != null && (activity = icN.getActivity()) != null) {
                r14.A01 = true;
                r14.A05.CeE("dialog");
                C62173Xp r0 = C696049g.A06;
                UserSession userSession = r14.A06;
                if (r0.A02(userSession, true)) {
                    Fragment fragment2 = (Fragment) weakReference.get();
                    C62173Xp.A00(userSession).A03 = new C71804Kh(bkh, r14);
                    Bundle A062 = C18180wK.A06();
                    A062.putString("trigger_location", "self_story_viewer");
                    AnonymousClass1aT r3 = new AnonymousClass1aT();
                    r3.setArguments(A062);
                    if (fragment2 == null || (activity2 = fragment2.getActivity()) == null) {
                        throw AnonymousClass0wJ.A0b();
                    }
                    C37032Jj9 A0L = C18210wN.A0L(userSession);
                    A0L.A0M = C18180wK.A0X();
                    A0L.A08 = ViewConfiguration.get(activity2).getScaledPagingTouchSlop();
                    C18200wM.A16(activity2, r3, A0L);
                } else if (!r14.A00) {
                    C58063Ds r1 = AnonymousClass31Q.A00;
                    AnonymousClass2AC r10 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK;
                    C04220Ms.A0B(r10, 2);
                    r1.A00(new AnonymousClass3CX(activity, (Context) null, r10, userSession, (C83004qd) null), new AnonymousClass4LR(activity, icN, bkh, r14));
                } else {
                    AnonymousClass2AC r5 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON;
                    Context context2 = icN.getContext();
                    AnonymousClass4LB r7 = new AnonymousClass4LB(icN, bkh, r14);
                    C04220Ms.A0B(r5, 2);
                    if (!AnonymousClass1v3.A06.A03(activity, context2, r5, userSession, r7, true)) {
                        A01(bkh, r14);
                    }
                }
            }
        } else {
            C11630kW r4 = r14.A0D;
            UserSession userSession2 = r14.A06;
            C15730rn A002 = C62943bB.A00(r4, userSession2, (Integer) null, "", (String) null, "one_tap_share");
            A002.A0D("event", "fb_ig_client_already_shared_one_tap_share");
            C18180wK.A1K(A002, userSession2);
            if (fragment != null) {
                context = fragment.getContext();
            } else {
                context = null;
            }
            C63813iO.A03(context, (String) null, 2131832762, 0);
            r14.A05.CeG();
        }
    }

    public static final void A01(BKH bkh, C62703aY r11) {
        FragmentActivity activity;
        AnonymousClass2AC r4;
        AnonymousClass2AC r5;
        String str;
        UserSession userSession = r11.A06;
        int i = C28161tl.A04(userSession).getInt("self_story_sharing_option_dialog_show_times", 0);
        BKH bkh2 = bkh;
        if (!C61453Tm.A00(userSession)) {
            AnonymousClass0wJ.A11(C28161tl.A03(userSession), "self_story_sharing_option_dialog_show_times", i + 1);
            ((C67273zH) r11.A0A.getValue()).A06(bkh);
            if (r11.A00) {
                r5 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON;
            } else {
                r5 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK;
            }
            AnonymousClass2AD r42 = AnonymousClass2AD.A0J;
            AnonymousClass29W r3 = AnonymousClass29W.VIEW;
            AnonymousClass14U A002 = AnonymousClass14U.A00();
            BKU bku = bkh.A0M;
            if (bku != null) {
                str = bku.A0f.A4Y;
            } else {
                str = null;
            }
            A002.A0A("ig_media_id", str);
            C49322rC.A00(r5, r3, r42, A002, userSession);
            return;
        }
        Fragment fragment = (Fragment) r11.A08.get();
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            if (r11.A00) {
                r4 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON;
            } else {
                r4 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK;
            }
            C19772B9s.A04(activity, r11.A0B, r4, AnonymousClass2AD.A02, bkh2, r11.A03, r11.A04, userSession);
        }
    }

    public static final void A02(BKH bkh, C62703aY r9, String str) {
        Context context;
        UserSession userSession = r9.A06;
        if (!C67373zR.A06(userSession)) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) null, userSession), "ig_business_story_to_fb_page"), 832);
            A0I.A0T("logging_event_name", "story_cross_posted_from_biz_to_fb_without_page_linked");
            A0I.Bb4();
        }
        AnonymousClass24M r1 = AnonymousClass24M.SHARING;
        BKH bkh2 = bkh;
        BKU bku = bkh.A0M;
        if (bku != null) {
            bku.A3g(r1);
            r9.A05.AAW(false);
            Fragment fragment = (Fragment) r9.A08.get();
            if (fragment != null && (context = fragment.getContext()) != null) {
                C31155GhB.A01(context, r9.A0C, AnonymousClass3z2.A00(context, r9.A0D, bkh2, r9.A0E, userSession, C18240wQ.A0X(r9.A00), AnonymousClass006.A0C, str));
                return;
            }
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final void A03(BKH bkh) {
        AnonymousClass2AC r6;
        BKU bku = bkh.A0M;
        if (bku != null) {
            UserSession userSession = this.A06;
            C28161tl A012 = AnonymousClass3WS.A01(userSession);
            AnonymousClass0wJ.A12(C28161tl.A02(A012), "self_story_fb_button_last_action_time_stamp", System.currentTimeMillis());
            if (!C67373zR.A08(userSession)) {
                if (this.A00) {
                    r6 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON;
                } else {
                    r6 = AnonymousClass2AC.IG_SELF_STORY_VIEW_FB_BUTTON_POST_ACCOUNT_LINK;
                }
                AnonymousClass2AD r5 = AnonymousClass2AD.A0J;
                AnonymousClass29W r3 = AnonymousClass29W.ACCEPT;
                AnonymousClass14U A002 = AnonymousClass14U.A00();
                A002.A0A("ig_media_id", bku.A0f.A4Y);
                C49322rC.A00(r6, r3, r5, A002, userSession);
                Fragment fragment = (Fragment) this.A08.get();
                this.A05.CeE("dialog");
                AnonymousClass4NY r1 = new AnonymousClass4NY(bkh, this);
                AnonymousClass2AI r2 = AnonymousClass2AI.A04;
                C04220Ms.A0C(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                r2.A03(fragment, C35762Os.A00().A00(fragment, userSession, r1), userSession, AnonymousClass264.A0Y);
                return;
            }
            A00(bkh, this);
        }
    }
}
