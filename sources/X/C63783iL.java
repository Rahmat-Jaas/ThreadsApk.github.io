package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape15S0400000_1_I2;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0111000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2;

/* renamed from: X.3iL  reason: invalid class name and case insensitive filesystem */
public final class C63783iL {
    public static final C63783iL A00 = new C63783iL();

    public static final void A06(Fragment fragment, UserSession userSession, AnonymousClass3TG r13) {
        AnonymousClass3TG r8 = r13;
        boolean A1Z = C18200wM.A1Z(r13);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            UserSession userSession2 = userSession;
            C310524a A01 = A01(userSession);
            if (A01 != C310524a.XAR_UPSELL_VARIANT_V1) {
                IDxCListenerShape41S0300000_1_I2 iDxCListenerShape41S0300000_1_I2 = new IDxCListenerShape41S0300000_1_I2(15, (Object) fragment, (Object) r13, (Object) userSession);
                IDxCListenerShape41S0300000_1_I2 iDxCListenerShape41S0300000_1_I22 = new IDxCListenerShape41S0300000_1_I2(16, (Object) fragment, (Object) r13, (Object) userSession);
                Bundle A06 = C18180wK.A06();
                AnonymousClass3TG.A00(A06, r13);
                A06.putString("ARG_WATERFALL_ID", (String) null);
                A06.putString("ARG_MODULE_NAME", r13.A05);
                A06.putString("ARG_DESIGN_VARIANT", r13.A04);
                AnonymousClass1YY r1 = new AnonymousClass1YY();
                r1.A00 = iDxCListenerShape41S0300000_1_I2;
                r1.A01 = iDxCListenerShape41S0300000_1_I22;
                r1.setArguments(A06);
                C37032Jj9 A0L = C18210wN.A0L(userSession);
                A0L.A0d = A1Z;
                C18250wR.A1B(A0L, false);
                C18200wM.A16(activity, r1, A0L);
            } else {
                AnonymousClass3Z9 A02 = A02(fragment.requireContext(), A01, userSession, r13);
                A02.A01 = new IDxCListenerShape15S0400000_1_I2(3, r8, userSession2, A02, fragment);
                A02.A02 = new IDxCListenerShape15S0400000_1_I2(4, r8, userSession2, A02, fragment);
                A02.A03(fragment.requireContext());
            }
            A0B((C11630kW) fragment, userSession, r13);
            A09(activity, userSession, false);
            C63423hS.A01(AnonymousClass2AC.A0G, AnonymousClass2AD.A0F, userSession);
        }
    }

    public static final void A08(FragmentActivity fragmentActivity, C11630kW r6, UserSession userSession, boolean z) {
        C04220Ms.A0B(r6, 2);
        LifecycleCoroutineScopeImpl A002 = AnonymousClass067.A00(fragmentActivity);
        AnonymousClass3Zu.A03(userSession).A05(z);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0311000_I2(r6, fragmentActivity, userSession, (C146958n9) null, 10, z), A002, 3);
    }

    public static final void A09(FragmentActivity fragmentActivity, UserSession userSession, boolean z) {
        AnonymousClass3Zu.A03(userSession).A06(false);
        AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
        AnonymousClass0wJ.A12(AnonymousClass3ZL.A00(A03), "PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS", System.currentTimeMillis());
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0111000_I2((Object) userSession, (C146958n9) null, 15, z), AnonymousClass067.A00(fragmentActivity), 3);
    }

    public static final void A0B(C11630kW r6, UserSession userSession, AnonymousClass3TG r8) {
        AnonymousClass0wJ.A1O(r6, r8);
        if (r8.A01 != AnonymousClass2AC.A0J) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r6, userSession), "ig_camera_clips_share_to_facebook_primer_impression"), 892);
            String str = C25567Do3.A02(userSession).A0K;
            if (str == null) {
                str = "";
            }
            boolean A03 = C67343zO.A03(userSession);
            Long A0e = C18220wO.A0e(AnonymousClass0wJ.A0Y(userSession).A0n());
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0Q("is_crosspost", A03(A0I, r6, r8, str, false));
                C18190wL.A1L(A0I);
                A0I.A0Q("do_not_use_is_fb_connected", Boolean.valueOf(A03));
                A0I.A0S("follower_count", A0e);
                String str2 = r8.A04;
                if (str2 == null) {
                    str2 = C310524a.XAR_UPSELL_VARIANT_V1.A00;
                }
                A0I.A0T(ClientCookie.VERSION_ATTR, str2);
                A0I.Bb4();
            }
        }
        A0A(AnonymousClass29W.VIEW, userSession, r8);
    }

    public static final void A0C(C11630kW r5, UserSession userSession, AnonymousClass3TG r7, boolean z) {
        AnonymousClass29W r0;
        AnonymousClass0wJ.A1P(r5, r7);
        boolean A1Z = C18180wK.A1Z(r7.A01, AnonymousClass2AC.A0J);
        if (!A1Z) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r5, userSession), "ig_camera_clips_share_to_facebook_primer_selection"), 893);
            String str = C25567Do3.A02(userSession).A0K;
            if (str == null) {
                str = "";
            }
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0Q("is_crosspost", C18210wN.A0R(A0I, A03(A0I, r5, r7, str, z), "allow_selection", false));
                C18190wL.A1L(A0I);
                String str2 = r7.A04;
                if (str2 == null) {
                    str2 = C310524a.XAR_UPSELL_VARIANT_V1.A00;
                }
                A0I.A0T(ClientCookie.VERSION_ATTR, str2);
                A0I.Bb4();
            }
        }
        if (z) {
            r0 = AnonymousClass29W.ACCEPT;
        } else if (A1Z) {
            r0 = AnonymousClass29W.OTHER;
        } else {
            r0 = AnonymousClass29W.DECLINE;
        }
        A0A(r0, userSession, r7);
    }

    public static final C310524a A01(UserSession userSession) {
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        boolean A0E = C63803iN.A0E(r2, userSession, 36323835502469227L);
        boolean A0E2 = C63803iN.A0E(r2, userSession, 36323835502600301L);
        boolean A0E3 = C63803iN.A0E(r2, userSession, 36323835502665838L);
        C310524a A002 = A00(userSession);
        C310524a r1 = C310524a.XAR_UPSELL_VARIANT_V1;
        boolean A1Y = C18240wQ.A1Y(A002, r1);
        if (A0E) {
            return C310524a.XAR_UPSELL_VARIANT_V2;
        }
        if (A0E2) {
            return C310524a.XAR_UPSELL_VARIANT_BUTTON_TEST;
        }
        if (A0E3) {
            return C310524a.XAR_UPSELL_VARIANT_SIZE_TEST;
        }
        if (A1Y) {
            return A00(userSession);
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a7, code lost:
        if (X.C63803iN.A0E(r6, r5, 36315155373492645L) != false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass3Z9 A02(android.content.Context r17, X.C310524a r18, com.instagram.service.session.UserSession r19, X.AnonymousClass3TG r20) {
        /*
            r16 = 0
            r4 = 1
            r7 = 2
            r6 = r20
            X.C04220Ms.A0B(r6, r7)
            r3 = r17
            r5 = r19
            if (r18 == 0) goto L_0x013d
            int r0 = r18.ordinal()
            if (r0 == r7) goto L_0x00ec
            if (r0 != r4) goto L_0x013d
            r0 = 2131823692(0x7f110c4c, float:1.928019E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r3, r0)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r0 = X.C18230wP.A0b()
            r8 = 0
            java.lang.Integer r10 = X.C18230wP.A0e()
            com.instagram.ui.primer.InfoItem r9 = new com.instagram.ui.primer.InfoItem
            r9.<init>(r0, r10, r1, r8)
            r1 = 2131823693(0x7f110c4d, float:1.9280193E38)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r5)
            java.lang.String r0 = r0.BK7()
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r3, r0, r1)
            X.C04220Ms.A06(r1)
            r0 = 2131233118(0x7f08095e, float:1.8082364E38)
            com.instagram.ui.primer.InfoItem r2 = X.C18190wL.A0Y(r10, r1, r0)
            r0 = 2131823694(0x7f110c4e, float:1.9280195E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r3, r0)
            r0 = 2131232921(0x7f080899, float:1.8081965E38)
            com.instagram.ui.primer.InfoItem r0 = X.C18190wL.A0Y(r10, r1, r0)
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.of(r9, r2, r0)
        L_0x0057:
            r0 = 2131232008(0x7f080508, float:1.8080113E38)
            com.instagram.ui.primer.TitleIcon r9 = new com.instagram.ui.primer.TitleIcon
            r9.<init>(r8, r0)
            X.24a r0 = A00(r5)
            int r0 = r0.ordinal()
            if (r0 == r7) goto L_0x00e8
            r14 = 2131838140(0x7f1144bc, float:1.9309495E38)
            if (r0 == r4) goto L_0x0071
            r14 = 2131823696(0x7f110c50, float:1.9280199E38)
        L_0x0071:
            X.C04220Ms.A09(r13)
            X.2AC r4 = r6.A01
            X.2AC r2 = X.AnonymousClass2AC.A0J
            r0 = 2131823686(0x7f110c46, float:1.9280179E38)
            if (r4 != r2) goto L_0x0080
            r0 = 2131823688(0x7f110c48, float:1.9280183E38)
        L_0x0080:
            java.lang.String r11 = X.AnonymousClass0wJ.A0k(r3, r0)
            r0 = 2131823690(0x7f110c4a, float:1.9280187E38)
            if (r4 != r2) goto L_0x008c
            r0 = 2131823687(0x7f110c47, float:1.928018E38)
        L_0x008c:
            java.lang.String r12 = X.AnonymousClass0wJ.A0k(r3, r0)
            X.0TJ r6 = X.AnonymousClass0TJ.A05
            r0 = 36312578393179243(0x8102190001046b, double:3.027559022638832E-306)
            boolean r0 = X.C63803iN.A0E(r6, r5, r0)
            if (r0 != 0) goto L_0x00a9
            r0 = 36315155373492645(0x810471000009a5, double:3.0291887153656945E-306)
            boolean r0 = X.C63803iN.A0E(r6, r5, r0)
            r15 = 0
            if (r0 == 0) goto L_0x00aa
        L_0x00a9:
            r15 = 1
        L_0x00aa:
            java.lang.String r10 = "recommend_on_facebook_primer"
            com.instagram.ui.primer.PrimerBottomSheetConfig r8 = new com.instagram.ui.primer.PrimerBottomSheetConfig
            r17 = r16
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 2131823695(0x7f110c4f, float:1.9280197E38)
            java.lang.String r6 = X.AnonymousClass0wJ.A0k(r3, r0)
            r0 = 2131823689(0x7f110c49, float:1.9280185E38)
            java.lang.String r3 = X.AnonymousClass0wJ.A0l(r3, r6, r0)
            X.C04220Ms.A06(r3)
            java.lang.String r0 = "https://help.instagram.com/1549313575265878"
            android.net.Uri r0 = X.C15430rJ.A01(r0)
            X.0xb r1 = new X.0xb
            r1.<init>(r0)
            android.text.SpannableStringBuilder r0 = X.C18200wM.A0E(r3)
            X.AnonymousClass3Zw.A01(r0, r1, r6)
            boolean r7 = X.C18180wK.A1Z(r4, r2)
            r6 = 284(0x11c, float:3.98E-43)
            X.3Z9 r2 = new X.3Z9
            r3 = r5
            r4 = r8
            r5 = r0
            r8 = r7
            r9 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x00e8:
            r14 = 2131838141(0x7f1144bd, float:1.9309497E38)
            goto L_0x0071
        L_0x00ec:
            r1 = 2131838136(0x7f1144b8, float:1.9309487E38)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r5)
            java.lang.String r0 = r0.BK7()
            java.lang.String r2 = X.AnonymousClass0wJ.A0l(r3, r0, r1)
            X.C04220Ms.A06(r2)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r1 = X.C18230wP.A0b()
            r0 = 0
            r8 = 0
            java.lang.Integer r11 = X.C18230wP.A0e()
            com.instagram.ui.primer.InfoItem r10 = new com.instagram.ui.primer.InfoItem
            r10.<init>(r1, r11, r2, r0)
            r0 = 2131838137(0x7f1144b9, float:1.9309489E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r3, r0)
            r0 = 2131233118(0x7f08095e, float:1.8082364E38)
            com.instagram.ui.primer.InfoItem r9 = X.C18190wL.A0Y(r11, r1, r0)
            r0 = 2131838138(0x7f1144ba, float:1.930949E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r3, r0)
            r0 = 2131232912(0x7f080890, float:1.8081947E38)
            com.instagram.ui.primer.InfoItem r2 = X.C18190wL.A0Y(r11, r1, r0)
            r0 = 2131838139(0x7f1144bb, float:1.9309493E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r3, r0)
            r0 = 2131232241(0x7f0805f1, float:1.8080586E38)
            com.instagram.ui.primer.InfoItem r0 = X.C18190wL.A0Y(r11, r1, r0)
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.of(r10, r9, r2, r0)
            goto L_0x0057
        L_0x013d:
            r0 = 2131823691(0x7f110c4b, float:1.9280189E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r3, r0)
            com.instagram.ui.primer.IconConfig$SimpleIconConfig r0 = X.C18230wP.A0b()
            r8 = 0
            java.lang.Integer r10 = X.C18230wP.A0e()
            com.instagram.ui.primer.InfoItem r9 = new com.instagram.ui.primer.InfoItem
            r9.<init>(r0, r10, r1, r8)
            r1 = 2131823693(0x7f110c4d, float:1.9280193E38)
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r5)
            java.lang.String r0 = r0.BK7()
            java.lang.String r1 = X.AnonymousClass0wJ.A0l(r3, r0, r1)
            X.C04220Ms.A06(r1)
            r0 = 2131233118(0x7f08095e, float:1.8082364E38)
            com.instagram.ui.primer.InfoItem r2 = X.C18190wL.A0Y(r10, r1, r0)
            r0 = 2131823694(0x7f110c4e, float:1.9280195E38)
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r3, r0)
            r0 = 2131232453(0x7f0806c5, float:1.8081016E38)
            com.instagram.ui.primer.InfoItem r0 = X.C18190wL.A0Y(r10, r1, r0)
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.of(r9, r2, r0)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63783iL.A02(android.content.Context, X.24a, com.instagram.service.session.UserSession, X.3TG):X.3Z9");
    }

    public static Boolean A03(AnonymousClass0A3 r2, C11630kW r3, AnonymousClass3TG r4, String str, boolean z) {
        r2.A0O(C171799zz.A16, "entry_point");
        r2.A0O(AnonymousClass6BO.ACTION, "event_type");
        r2.A0O(D3Q.POST_CAPTURE, "surface");
        r2.A0O(D36.VIDEO, "media_type");
        r2.A0O(r4.A03, "media_source");
        r2.A0O(D3K.CLIPS, "capture_type");
        r2.A0T("camera_session_id", str);
        r2.A0T(IgFragmentActivity.MODULE_KEY, r3.getModuleName());
        return Boolean.valueOf(z);
    }

    public static final void A04(Fragment fragment, UserSession userSession, AnonymousClass3TG r6) {
        C04220Ms.A0C(fragment, "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule");
        C11630kW r1 = (C11630kW) fragment;
        A0C(r1, userSession, r6, false);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            A09(activity, userSession, false);
            A08(activity, r1, userSession, false);
        }
        AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
        A03.A04(false);
        A03.A05(false);
        C38039KHq A002 = AnonymousClass3LY.A00(userSession);
        Integer num = AnonymousClass006.A00;
        A002.A04(new E6U(num, num, false, false));
    }

    public static final void A05(Fragment fragment, UserSession userSession, AnonymousClass3TG r7) {
        C04220Ms.A0C(fragment, "null cannot be cast to non-null type com.instagram.common.analytics.intf.AnalyticsModule");
        C11630kW r1 = (C11630kW) fragment;
        A0C(r1, userSession, r7, true);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            A09(activity, userSession, true);
            A08(activity, r1, userSession, true);
        }
        AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
        A03.A04(false);
        A03.A05(true);
        C38039KHq A002 = AnonymousClass3LY.A00(userSession);
        Integer num = AnonymousClass006.A00;
        A002.A04(new E6U(num, num, true, false));
    }

    public static final void A0A(AnonymousClass29W r7, UserSession userSession, AnonymousClass3TG r9) {
        AnonymousClass2AD r6 = r9.A02;
        long j = 0;
        if (r6.ordinal() == 25 && !AnonymousClass3Zu.A03(userSession).A07()) {
            j = 1;
        }
        AnonymousClass2AC r5 = r9.A01;
        AnonymousClass14U A002 = AnonymousClass14U.A00();
        A002.A0A("waterfall_id", r9.A06);
        C67343zO.A00(A002, userSession);
        C18210wN.A1D(A002, j);
        C49322rC.A00(r5, r7, r6, A002, userSession);
    }

    public static final C310524a A00(UserSession userSession) {
        C310524a r0;
        String valueOf = String.valueOf(C63803iN.A03(C18180wK.A0J(userSession), userSession, 36605310479438240L));
        if (valueOf == null || (r0 = (C310524a) C310524a.A01.get(valueOf)) == null) {
            return C310524a.XAR_UPSELL_VARIANT_V1;
        }
        return r0;
    }

    public static final void A07(FragmentActivity fragmentActivity, C11630kW r5, UserSession userSession, AnonymousClass3TG r7, AnonymousClass3Z9 r8, String str, int i, boolean z) {
        AnonymousClass29W r0;
        C171789zy r02;
        r8.A02();
        AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
        AnonymousClass0wJ.A13(AnonymousClass3ZL.A00(A03), "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_SHOULD_SHOW_CONSUMPTION_UPSELL", false);
        AnonymousClass3ZL.A01(A03, A03.A07);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0111000_I2((Object) userSession, (C146958n9) null, 14, z), AnonymousClass067.A00(fragmentActivity), 3);
        A08(fragmentActivity, r5, userSession, z);
        C04220Ms.A0B(r7, 5);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r5, userSession), "instagram_clips_share_to_facebook_primer_selection"), 1749);
        if (AnonymousClass0wJ.A1U(A0I)) {
            if (z) {
                r02 = C171789zy.A0y;
            } else {
                r02 = C171789zy.A0z;
            }
            C18220wO.A1E(r02, A0I);
            A0I.A0O(A02.A0P, "action_source");
            C18240wQ.A14(A0I, r5);
            A0I.A0T("media_compound_key", str);
            A0I.A0S("media_index", C18230wP.A0f(i));
            A0I.A0T("viewer_session_id", "");
            A0I.Bb4();
        }
        if (z) {
            r0 = AnonymousClass29W.ACCEPT;
        } else {
            r0 = AnonymousClass29W.DECLINE;
        }
        A0A(r0, userSession, r7);
    }
}
