package com.instagram.settings.privacy.messages;

import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass1Z6;
import X.AnonymousClass1fC;
import X.AnonymousClass266;
import X.AnonymousClass282;
import X.AnonymousClass36C;
import X.AnonymousClass36D;
import X.AnonymousClass3TL;
import X.AnonymousClass3US;
import X.AnonymousClass3W8;
import X.AnonymousClass3WS;
import X.AnonymousClass3X2;
import X.AnonymousClass3Zw;
import X.AnonymousClass49K;
import X.AnonymousClass4MC;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C04620Ok;
import X.C06810aP;
import X.C10300i6;
import X.C14030oh;
import X.C170039uK;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18230wP;
import X.C18250wR;
import X.C23411dm;
import X.C24471ir;
import X.C25771Drk;
import X.C25786Drz;
import X.C28161tl;
import X.C29401xz;
import X.C35004Ikn;
import X.C35692Ol;
import X.C49142qu;
import X.C49152qv;
import X.C49162qw;
import X.C565337o;
import X.C57853Cs;
import X.C59473Ky;
import X.C60213Od;
import X.C60233Of;
import X.C61203Sh;
import X.C62133Xg;
import X.C62153Xk;
import X.C63083bT;
import X.C63273h9;
import X.C63293hC;
import X.C63473hX;
import X.C63613hu;
import X.C63803iN;
import X.C67363zQ;
import X.C80644m9;
import X.C81734oH;
import X.C82034oy;
import X.C83784rz;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxCListenerShape15S0110000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.emptystaterow.EmptyStateView;
import java.util.ArrayList;

public final class DirectMessagesOptionsFragment extends C23411dm implements C82034oy, C83784rz, CallerContextable, C81734oH {
    public static final CallerContext A05 = CallerContext.A00(DirectMessagesOptionsFragment.class);
    public C565337o A00;
    public C24471ir A01;
    public boolean A02;
    public boolean A03;
    public final C04530Oa A04 = C80644m9.A00(this);
    public EmptyStateView emptyStateView;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, getString(2131830465));
    }

    public final String getModuleName() {
        return "direct_messages_options";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mEmptyView;
        C04220Ms.A0C(view2, "null cannot be cast to non-null type com.instagram.ui.emptystaterow.EmptyStateView");
        EmptyStateView emptyStateView2 = (EmptyStateView) view2;
        C04220Ms.A0B(emptyStateView2, 0);
        this.emptyStateView = emptyStateView2;
        emptyStateView2.A0N(C170039uK.LOADING);
        C24471ir r3 = this.A01;
        if (r3 != null) {
            AnonymousClass49K r2 = r3.A0C;
            synchronized (r2) {
                r2.A09.add(r3);
            }
            AnonymousClass36C r1 = r3.A0A;
            synchronized (r2) {
                C04220Ms.A0B(r1, 0);
                r2.A08.add(r1);
            }
            synchronized (r2) {
                r2.A04 = r3;
            }
        }
        AnonymousClass1fC r0 = (AnonymousClass1fC) getScrollingViewProxy().APJ();
        if (r0 != null) {
            r0.mSwitchItemViewPointDelegate = this;
        }
        C565337o r02 = this.A00;
        if (r02 != null) {
            C35004Ikn A002 = C35004Ikn.A00(this);
            r02.A00.A04(C18200wM.A0H(this), A002);
            return;
        }
        C04220Ms.A0E("messageAccessToggleViewPointHelper");
        throw null;
    }

    public static final void A0B(DirectMessagesOptionsFragment directMessagesOptionsFragment) {
        boolean A052 = C35692Ol.A00(AnonymousClass0wJ.A0X(directMessagesOptionsFragment.A04)).A05(A05, "ig_direct_to_fb");
        directMessagesOptionsFragment.A02 = A052;
        C24471ir r0 = directMessagesOptionsFragment.A01;
        if (r0 != null) {
            r0.A03 = A052;
            r0.A01();
        }
    }

    public final void Bh5(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, Integer num, String str, DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr, int i, boolean z) {
        UserSession A0X = AnonymousClass0wJ.A0X(this.A04);
        C60233Of.A00(this.mArguments, requireActivity(), A0X, directMessagesInteropOptionsViewModel, num, str, directMessageInteropReachabilityOptionsArr, i, z);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final void A0C() {
        Boolean bool;
        int ordinal;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions2;
        DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions3;
        Object r9;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C24471ir r2 = this.A01;
        if (r2 != null) {
            C61203Sh r13 = r2.A0B;
            UserSession userSession = r2.A08;
            DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel = r2.A00;
            if (r2.A04) {
                bool = Boolean.valueOf(C18190wL.A1X(r2.A07.A00, "direct_linked_page_ig_dm_access"));
            } else {
                bool = null;
            }
            boolean z = r2.A0F;
            boolean z2 = r2.A03;
            boolean z3 = r2.A02;
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            AnonymousClass266 r92 = r13.A01;
            int i = 2131830467;
            if (r92 == AnonymousClass266.A06) {
                i = 2131830466;
            }
            AnonymousClass3TL r11 = new AnonymousClass3TL(i);
            Context context = r13.A00;
            Resources resources = context.getResources();
            r11.A06 = new C57853Cs(0, resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), 0, C18250wR.A00(resources), resources.getDimensionPixelSize(R.dimen.abc_floating_window_z), resources.getDimensionPixelSize(R.dimen.abc_floating_window_z));
            r11.A03 = R.style.DirectMessagesOptionsText;
            r11.A02 = 2;
            A0v2.add(r11);
            if (C63473hX.A01(userSession).A09()) {
                C63613hu.A01(context.getString(2131830485), A0v2);
            }
            if (directMessagesInteropOptionsViewModel != null) {
                C24471ir r18 = r2;
                C61203Sh r19 = r13;
                A0v2.add(C61203Sh.A00(directMessagesInteropOptionsViewModel.A05, r18, r19, "ig_followers", 2131830487, z3));
                if (C63473hX.A01(userSession).A09()) {
                    if (r92 == null) {
                        ordinal = -1;
                    } else {
                        ordinal = r92.ordinal();
                    }
                    boolean z4 = true;
                    if (ordinal != 2) {
                        if (!z3 || !z2) {
                            z4 = false;
                        }
                        if (z2) {
                            directMessageInteropReachabilityOptions = directMessagesInteropOptionsViewModel.A00;
                        } else {
                            directMessageInteropReachabilityOptions = null;
                        }
                        A0v2.add(C61203Sh.A00(directMessageInteropReachabilityOptions, r18, r19, "fb_friends", 2131830471, z4));
                        if (z2) {
                            directMessageInteropReachabilityOptions2 = directMessagesInteropOptionsViewModel.A01;
                        } else {
                            directMessageInteropReachabilityOptions2 = null;
                        }
                        A0v2.add(C61203Sh.A00(directMessageInteropReachabilityOptions2, r18, r19, "fb_friends_of_friends", 2131830472, z4));
                        if (z2) {
                            directMessageInteropReachabilityOptions3 = directMessagesInteropOptionsViewModel.A09;
                        } else {
                            directMessageInteropReachabilityOptions3 = null;
                        }
                        A0v2.add(C61203Sh.A00(directMessageInteropReachabilityOptions3, r18, r19, "people_with_your_phone_number", 2131830488, z4));
                        if (!z2) {
                            C62133Xg.A00(context, new C62133Xg((View.OnClickListener) C18210wN.A0H(r2, 280), 2131830440), A0v2, R.color.igds_primary_button);
                            r9 = new C63293hC(2131830441);
                        }
                    } else if (z) {
                        boolean z5 = z3;
                        A0v2.add(C61203Sh.A00(directMessagesInteropOptionsViewModel.A03, r18, r19, "fb_messaged_your_page", 2131830479, z5));
                        r9 = C61203Sh.A00(directMessagesInteropOptionsViewModel.A02, r18, r19, "fb_liked_or_followed_your_page", 2131830480, z5);
                    }
                    A0v2.add(r9);
                }
            }
            if (C63473hX.A01(userSession).A09()) {
                C63273h9.A02(A0v2);
                C63613hu.A01(context.getString(2131830486), A0v2);
            }
            if (directMessagesInteropOptionsViewModel != null) {
                if (C63473hX.A01(userSession).A09()) {
                    int i2 = 2131830478;
                    if (z2) {
                        i2 = 2131830476;
                    }
                    A0v2.add(C61203Sh.A00(directMessagesInteropOptionsViewModel.A07, r2, r13, "others_on_fb", i2, z3));
                }
                C24471ir r182 = r2;
                C61203Sh r192 = r13;
                boolean z6 = z3;
                A0v2.add(C61203Sh.A00(directMessagesInteropOptionsViewModel.A08, r182, r192, "others_on_ig", 2131830477, z6));
                if (C25771Drk.A03(userSession) && (C59473Ky.A01(userSession) || C59473Ky.A00(userSession))) {
                    A0v2.add(C61203Sh.A00((DirectMessageInteropReachabilityOptions) null, r182, r192, "eligible_for_bc_partnership", 2131830470, z6));
                }
                if (directMessagesInteropOptionsViewModel.A06 != null && C63803iN.A0E(AnonymousClass0TJ.A06, userSession, 36321679428885474L)) {
                    C63273h9.A02(A0v2);
                    C63613hu.A02(context.getString(2131830489), A0v2);
                    A0v2.add(C61203Sh.A00(directMessagesInteropOptionsViewModel.A06, r182, r192, "ig_verified", 2131830463, z6));
                }
            }
            C63273h9.A02(A0v2);
            C63613hu.A02(context.getString(2131830490), A0v2);
            C62153Xk r4 = new C62153Xk((View.OnClickListener) C18210wN.A0H(r2, 278), 2131830460);
            r4.A07 = !z3;
            A0v2.add(r4);
            String A0k = AnonymousClass0wJ.A0k(context, 2131830494);
            SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0l(context, A0k, 2131830453));
            String A012 = AnonymousClass3W8.A01(context, "https://help.instagram.com/585369912141614");
            C04220Ms.A06(A012);
            AnonymousClass3Zw.A01(A0E, new C29401xz(context, userSession, (AnonymousClass36D) null, A012, context.getColor(R.color.igds_link)), A0k);
            C23411dm.A01(A0E, A0v2);
            if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36321537694899082L) && AnonymousClass3X2.A00(userSession, true)) {
                C63273h9.A02(A0v2);
                C63613hu.A02(context.getString(2131830436), A0v2);
                A0v2.add(new C62153Xk((CharSequence) context.getString(2131831921), (View.OnClickListener) C18210wN.A0H(r2, 279)));
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C63273h9.A03(A0v2);
                C63613hu.A04(A0v2, 2131830456);
                AnonymousClass4MC A032 = AnonymousClass4MC.A03(new IDxCListenerShape15S0110000_1_I2(1, r2, z3), 2131830457, booleanValue);
                if (!z3) {
                    A032.A0E = true;
                    A032.A0C = false;
                }
                A0v2.add(A032);
                AnonymousClass36D r6 = new AnonymousClass36D(r2);
                String A0k2 = AnonymousClass0wJ.A0k(context, 2131830454);
                SpannableStringBuilder A0E2 = C18200wM.A0E(AnonymousClass0wJ.A0l(context, A0k2, 2131830455));
                String A013 = AnonymousClass3W8.A01(context, "https://www.facebook.com/help/instagram/791161338412168?ref=igapp");
                C04220Ms.A06(A013);
                AnonymousClass3Zw.A01(A0E2, new C29401xz(context, userSession, r6, A013, context.getColor(R.color.igds_link)), A0k2);
                A0v2.add(new C63293hC(A0E2));
            }
            A0v.addAll(A0v2);
        }
        EmptyStateView emptyStateView2 = this.emptyStateView;
        if (emptyStateView2 != null) {
            emptyStateView2.A0N(C170039uK.GONE);
            setItems(A0v);
            if (this.A03) {
                getScrollingViewProxy().CuM(A0v.size() - 1);
                this.A03 = false;
                return;
            }
            return;
        }
        C04220Ms.A0E("emptyStateView");
        throw null;
    }

    public final void Bgw() {
        C25786Drz A0Q = AnonymousClass0wJ.A0Q(requireActivity(), AnonymousClass0wJ.A0U(this.A04));
        C18190wL.A10();
        A0Q.A03 = new AnonymousClass1Z6();
        A0Q.A05();
    }

    public final void onCreate(Bundle bundle) {
        boolean A0E;
        boolean A0E2;
        int A022 = C14030oh.A02(867926910);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C04530Oa r14 = this.A04;
        boolean z = false;
        if (C63803iN.A0E(AnonymousClass0TJ.A06, AnonymousClass0wJ.A0U(r14), 36312896220693720L) && requireArguments.getBoolean("scroll_to_message_access_toggle", false)) {
            z = true;
        }
        this.A03 = z;
        C04620Ok r7 = C06810aP.A01;
        AnonymousClass266 A0b = C18200wM.A0b(AnonymousClass0wJ.A0X(r14), r7);
        C49162qw r27 = new C49162qw();
        C61203Sh r11 = new C61203Sh(requireContext(), new C49142qu(), A0b);
        AnonymousClass49K A002 = C49152qv.A00(AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(r14)), AnonymousClass0wJ.A0X(r14), new C49162qw());
        C60213Od r22 = new C60213Od();
        String string = requireArguments.getString("entry_point");
        AnonymousClass3US r3 = new AnonymousClass3US(this, AnonymousClass0wJ.A0X(r14), string);
        this.A02 = C35692Ol.A00(AnonymousClass0wJ.A0X(r14)).A05(A05, "ig_direct_to_fb");
        Context requireContext = requireContext();
        UserSession A0X = AnonymousClass0wJ.A0X(r14);
        C28161tl A012 = AnonymousClass3WS.A01(AnonymousClass0wJ.A0X(r14));
        UserSession A0X2 = AnonymousClass0wJ.A0X(r14);
        C04220Ms.A0B(A0X2, 0);
        C63083bT r10 = new C63083bT(this, A0X2, string);
        boolean z2 = this.A02;
        boolean A0H = C67363zQ.A0H(AnonymousClass0wJ.A0X(r14));
        UserSession A0X3 = AnonymousClass0wJ.A0X(r14);
        C04220Ms.A0B(A0X3, 0);
        if (!r7.A01(A0X3).A3a()) {
            A0E = false;
        } else {
            A0E = C63803iN.A0E(AnonymousClass0TJ.A05, A0X3, 36313007889843459L);
        }
        UserSession A0X4 = AnonymousClass0wJ.A0X(r14);
        C04220Ms.A0B(A0X4, 0);
        if (!r7.A01(A0X4).A3a()) {
            A0E2 = false;
        } else {
            A0E2 = C63803iN.A0E(AnonymousClass0TJ.A05, A0X4, 36313007889908996L);
        }
        this.A01 = new C24471ir(requireContext, (AnonymousClass282) requireArguments.getSerializable("reachability_settings_upsell"), r3, A012, A0X, r10, r22, r11, A002, this, this, r27, A0b, z2, A0H, A0E, A0E2);
        USLEBaseShape0S0000000 A0K = USLEBaseShape0S0000000.A0K(r3.A00);
        A0K.A0T("event", "start_step");
        A0K.A0T("entry_point", r3.A01);
        C18190wL.A1I(A0K, "ig_message_settings");
        C18230wP.A1E(A0K);
        this.A00 = new C565337o(r3);
        C14030oh.A09(-940810256, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1961963747);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.layout_listview_with_empty_state, false);
        C14030oh.A09(1478894261, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1901321221);
        super.onDestroyView();
        C24471ir r0 = this.A01;
        if (r0 != null) {
            AnonymousClass49K r1 = r0.A0C;
            synchronized (r1) {
                r1.A04 = null;
            }
        }
        C14030oh.A09(1798571806, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-456181634);
        super.onResume();
        C24471ir r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
        C14030oh.A09(1846816093, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(-1082417889);
        super.onStop();
        C24471ir r1 = this.A01;
        if (r1 != null) {
            AnonymousClass49K r2 = r1.A0C;
            synchronized (r2) {
                r2.A09.remove(r1);
            }
            AnonymousClass36C r12 = r1.A0A;
            synchronized (r2) {
                C04220Ms.A0B(r12, 0);
                r2.A08.remove(r12);
            }
        }
        C14030oh.A09(-1910617716, A022);
    }
}
