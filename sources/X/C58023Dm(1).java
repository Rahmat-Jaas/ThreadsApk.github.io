package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import com.instagram.user.model.User;

/* renamed from: X.3Dm  reason: invalid class name and case insensitive filesystem */
public abstract class C58023Dm {
    public final void A00(C22091Ti r20) {
        boolean z;
        C29371xr r2;
        UserSession userSession;
        String str;
        if (this instanceof C27491sb) {
            C27491sb r0 = (C27491sb) this;
            C63873iU r1 = r0.A00;
            if (r1 != null) {
                r1.onSuccess(r0.A01);
                return;
            }
            return;
        }
        C22091Ti r12 = r20;
        if (this instanceof C27511sd) {
            C27511sd r4 = (C27511sd) this;
            if (r12.A00.A0e() == C169839tz.PrivacyStatusPrivate) {
                z = true;
                r2 = r4.A00;
                userSession = r2.A04;
                C62423Zt.A02(userSession);
                String str2 = r2.A06;
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A03, "privacy_setting_changed"), 2502);
                A0I.A0T("change_privacy_option_to", "private");
                A0I.A0T("qpid", str2);
                C18210wN.A1C(A0I, "privacy_updater");
                if (C29371xr.A02(r2)) {
                    AnonymousClass49K A00 = C49152qv.A00(AnonymousClass3WS.A01(userSession), userSession, new C49162qw());
                    DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions = DirectMessageInteropReachabilityOptions.A09;
                    A00.A01(new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, directMessageInteropReachabilityOptions, DirectMessageInteropReachabilityOptions.A0D, directMessageInteropReachabilityOptions), "ig_followers");
                }
            } else {
                z = false;
                r2 = r4.A00;
                userSession = r2.A04;
                C62423Zt.A02(userSession);
                String str3 = r2.A06;
                USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A03, "privacy_setting_changed"), 2502);
                A0I2.A0T("change_privacy_option_to", "public");
                A0I2.A0T("qpid", str3);
                C18210wN.A1C(A0I2, "privacy_updater");
            }
            C62693aX r13 = r2.A05.A00;
            C18210wN.A1G(r13.A04);
            AnonymousClass369 r02 = r13.A01;
            if (r02 != null) {
                AnonymousClass1wV r3 = r02.A00;
                r3.A01.A00(C63873iU.A06(r3, 142));
            }
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36316503993224345L) || C29371xr.A02(r2)) {
                if (z) {
                    C62423Zt.A02(userSession);
                    try {
                        if (C29371xr.A02(r2)) {
                            str = "com.instagram.privacy.setting_defaults.predicted_teen_set_to_private";
                        } else {
                            str = "com.instagram.privacy.setting_defaults.set_to_private";
                        }
                    } catch (Exception unused) {
                        C10450iM.A03("account_privacy_options", AnonymousClass00U.A0o("navigation failed to review settings screen:", true));
                        return;
                    }
                } else {
                    C62423Zt.A02(userSession);
                    str = "com.instagram.privacy.setting_defaults.set_to_public";
                }
                C63743iE A02 = C63743iE.A02(str, AnonymousClass0wJ.A0y());
                C22302CTd cTd = r2.A02;
                FragmentActivity requireActivity = cTd.requireActivity();
                IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
                C18230wP.A1A(cTd, A0N, 2131826907);
                C63743iE.A07(requireActivity, A0N, A02);
            } else if (z && r4.A02) {
                if (r2.A01 == null) {
                    User user = r4.A01;
                    C25828Dsm A0V = AnonymousClass0wJ.A0V(r2.A02);
                    A0V.A0L(2131823229);
                    A0V.A0K(2131823227);
                    A0V.A0I(R.drawable.instagram_users_outline_96);
                    C18190wL.A1R(A0V, r2, user, 54, 2131823228);
                    C18180wK.A1N(A0V, r2, 150, 2131823054);
                    C18240wQ.A1C(A0V, r2, 9);
                    r2.A01 = A0V.A0G();
                }
                C18180wK.A0I(AnonymousClass0wJ.A0M(r2.A03, "remove_self_followers_dialog_impression"), 2635).Bb4();
                C13950oZ.A00(r2.A01);
            }
        } else {
            C27501sc r32 = (C27501sc) this;
            C169839tz A0e = r12.A00.A0e();
            C169839tz r14 = C169839tz.PrivacyStatusPrivate;
            AnonymousClass1x0 r42 = r32.A00;
            UserSession userSession2 = r42.A06;
            if (A0e == r14) {
                C62423Zt.A02(userSession2);
                if (r32.A02) {
                    if (r42.A03 == null) {
                        User user2 = r32.A01;
                        C25828Dsm A0V2 = AnonymousClass0wJ.A0V(r42);
                        A0V2.A0L(2131823229);
                        A0V2.A0K(2131823227);
                        A0V2.A0I(R.drawable.instagram_users_outline_96);
                        C18190wL.A1R(A0V2, r42, user2, 51, 2131823228);
                        C18180wK.A1N(A0V2, r42, 147, 2131823054);
                        C18240wQ.A1C(A0V2, r42, 6);
                        r42.A03 = A0V2.A0G();
                    }
                    C18180wK.A0I(AnonymousClass0wJ.A0M(r42.A04, "remove_self_followers_dialog_impression"), 2635).Bb4();
                    C13950oZ.A00(r42.A03);
                }
                if (r42.A0A) {
                    UserSession userSession3 = r42.A06;
                    if (C63803iN.A0E(C18180wK.A0J(userSession3), userSession3, 36326837684610837L)) {
                        UserSession userSession4 = r42.A06;
                        AnonymousClass49K A002 = C49152qv.A00(AnonymousClass3WS.A01(userSession4), userSession4, new C49162qw());
                        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2 = DirectMessageInteropReachabilityOptions.A09;
                        A002.A01(new DirectMessagesInteropOptionsViewModel(directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, directMessageInteropReachabilityOptions2, DirectMessageInteropReachabilityOptions.A0D, directMessageInteropReachabilityOptions2), "ig_followers");
                        try {
                            C63743iE A022 = C63743iE.A02("com.instagram.privacy.setting_defaults.predicted_teen_set_to_private", AnonymousClass0wJ.A0y());
                            FragmentActivity requireActivity2 = r42.requireActivity();
                            IgBloksScreenConfig A0N2 = C18190wL.A0N(r42.A06);
                            C18230wP.A1A(r42, A0N2, 2131826907);
                            C63743iE.A07(requireActivity2, A0N2, A022);
                        } catch (Exception unused2) {
                            C10450iM.A03("account_privacy_options", "navigation failed to review settings screen:private");
                        }
                    }
                }
            } else {
                C62423Zt.A02(userSession2);
            }
        }
    }
}
