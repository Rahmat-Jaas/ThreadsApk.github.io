package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape345S0100000_1_I2;
import com.facebook.redex.IDxObjectShape277S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.User;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1dk  reason: invalid class name and case insensitive filesystem */
public final class C23401dk extends I5x implements C82424pb, C83874s8, C82034oy, AbsListView.OnScrollListener, C28164EzZ {
    public static final String __redex_internal_original_name = "FollowAccountsYouKnowFragment";
    public View A00;
    public View A01;
    public View A02;
    public AnonymousClass4u2 A03;
    public BusinessFlowAnalyticsLogger A04;
    public C18860y1 A05;
    public UserSession A06;
    public String A07;
    public String A08 = "";
    public List A09;
    public Map A0A;
    public Set A0B;
    public View A0C;
    public C24671jo A0D;
    public TypeaheadHeader A0E;
    public String A0F;
    public boolean A0G;
    public final Set A0H = C18200wM.A0u();
    public final AtomicInteger A0I = new AtomicInteger(0);
    public final C82394pY A0J = new IDxObjectShape277S0100000_1_I2(this, 2);
    public final IgI A0K = new IgI();

    public final void Bpk(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void Bzk(User user) {
    }

    public final void Bzl(User user) {
    }

    public final void Bzm(C23917D1f d1f, User user) {
    }

    public final void C7j(User user) {
    }

    public final void CFY(User user) {
    }

    public final void registerTextViewLogging(TextView textView) {
    }

    private void A01() {
        int i;
        if (this.A03 != null) {
            C18210wN.A0z(this.A00);
            boolean z = this.A0G;
            boolean isEmpty = this.A0H.isEmpty();
            AnonymousClass4u2 r2 = this.A03;
            C25764Drc A0K2 = C18240wQ.A0K();
            if (z) {
                if (isEmpty) {
                    A0K2.A0F = getString(2131835995);
                    i = 2;
                } else {
                    A0K2.A0F = getString(2131826219);
                    i = 3;
                }
            } else if (isEmpty) {
                A0K2.A0F = getString(2131835995);
                i = 4;
            } else {
                A0K2.A0F = getString(2131826219);
                i = 5;
            }
            this.A00 = r2.A7Q(C18190wL.A0L(A0K2, this, i));
        }
    }

    public static void A02(C23401dk r2) {
        String str = r2.A08;
        if (!str.isEmpty()) {
            r2.A0E.A00.setText(str);
            SearchEditText searchEditText = r2.A0E.A00;
            searchEditText.setSelection(searchEditText.getText().length());
        }
    }

    public static void A03(C23401dk r4, User user, String str, boolean z) {
        C32165H8c A022 = AnonymousClass3Zx.A02(r4.A06, String.format((Locale) null, "friendships/%s/following/", new Object[]{user.getId()}), (String) null, "nux_follow_from_logged_in_accounts", str);
        A022.A00 = new C24261hm(r4, user, z);
        r4.schedule(A022);
    }

    public final C10300i6 A0I() {
        return this.A06;
    }

    public final void BpS(User user) {
        C61763Vg A022;
        String id;
        String str;
        C14020og.A00(this.A05, 456487749);
        C23894D0g Aj4 = user.Aj4();
        if (Aj4 == C23894D0g.FollowStatusFollowing || Aj4 == C23894D0g.FollowStatusRequested) {
            this.A0H.add(user);
            A022 = C63313hF.A02(this.A06, (C313625r) null, AnonymousClass265.A1H, "follow_from_logged_in_accounts_follow_button_tapped");
            A022.A03("actor_id", this.A06.getUserId());
            id = user.getId();
            str = "following_user_id";
        } else {
            this.A0H.remove(user);
            A022 = C63313hF.A02(this.A06, (C313625r) null, AnonymousClass265.A1H, "follow_from_logged_in_accounts_unfollow_button_tapped");
            A022.A03("actor_id", this.A06.getUserId());
            id = user.getId();
            str = "unfollowing_user_id";
        }
        A022.A03(str, id);
        A022.A01();
        A01();
    }

    public final void configureActionBar(AnonymousClass4u2 r4) {
        this.A03 = r4;
        A01();
        Context context = getContext();
        if (context != null) {
            AnonymousClass4u2 r2 = this.A03;
            ((E2V) r2).A0K.setBackground(new ColorDrawable(C121907Is.A00(context, R.attr.backgroundColorPrimary)));
        }
        if (this.A0G) {
            this.A03.Crl(C18190wL.A0L(C18190wL.A0K(), this, 1));
        }
    }

    public final String getModuleName() {
        if (!TextUtils.isEmpty(this.A0F)) {
            return this.A0F;
        }
        return "follow_accounts_you_know_sac_nux";
    }

    public final boolean onBackPressed() {
        C09860go.A0I(this.A02);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
        if (businessFlowAnalyticsLogger == null) {
            return false;
        }
        businessFlowAnalyticsLogger.BbZ(new C37408JrQ("invite_followers_via_suma_followings", this.A07, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void searchTextChanged(String str) {
        if (!this.A08.equals(str)) {
            this.A0B.clear();
            this.A08 = str;
            this.A05.A01.clear();
            A02(this);
            if (!TextUtils.isEmpty(this.A08)) {
                View view = this.A01;
                if (view != null) {
                    view.setVisibility(0);
                }
                C18860y1 r1 = this.A05;
                r1.A02 = true;
                r1.A03 = false;
                C14020og.A00(r1, 1772264809);
                C24671jo r2 = this.A0D;
                String str2 = this.A08;
                Deque deque = r2.A05;
                synchronized (deque) {
                    if (!r2.A06.containsKey(str2) && !deque.contains(str2)) {
                        deque.add(str2);
                        Handler handler = r2.A03;
                        if (!handler.hasMessages(1)) {
                            handler.sendEmptyMessageDelayed(1, 300);
                        }
                    }
                }
                return;
            }
            C18860y1 r12 = this.A05;
            r12.A02 = false;
            r12.A03 = false;
            C14020og.A00(r12, 1772264809);
        }
    }

    public static void A04(C23401dk r4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User A0c = C18220wO.A0c(it);
            if (C23527Ctp.A00(r4.A06).A0L(A0c) == C23894D0g.FollowStatusUnknown) {
                A0c.A03 = C23894D0g.FollowStatusNotFollowing;
            }
        }
    }

    public final void CSX(User user) {
        if (getActivity() != null) {
            C25586DoM.A02(this.A06, user.getId(), "follow_list_user_row", getModuleName());
            C60113Ns.A01(getActivity(), this.A06);
            throw null;
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A022 = C14030oh.A02(139368887);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || getContext() == null) {
            i = 1693339268;
        } else {
            this.A07 = bundle2.getString("ARG_ENTRY_POINT");
            this.A0G = bundle2.getBoolean("ARG_FROM_PRO_ONBOARDING_CHECKLIST");
            if (!C18240wQ.A1T(bundle2, "ARG_MODULE_NAME")) {
                str = bundle2.getString("ARG_MODULE_NAME");
            } else {
                str = "follow_accounts_you_know_sac_nux";
            }
            this.A0F = str;
            this.A06 = C18180wK.A0V(bundle2);
            this.A05 = new C18860y1(getContext(), this, this, this.A06, this);
            List A042 = this.A06.multipleAccountHelper.A00.A04((User) null);
            this.A09 = A042;
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                A03(this, C18220wO.A0c(it), (String) null, true);
            }
            C24671jo r0 = new C24671jo(this, this.A06, this.A09);
            this.A0D = r0;
            r0.A00 = this;
            if (this.A0G) {
                this.A04 = C37076Jk8.A01(C311924p.EDIT_PROFILE, this.A06, this.A0F, C18180wK.A0e());
            }
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A04;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.Bdt(new C37408JrQ("invite_followers_via_suma_followings", this.A07, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            }
            i = 1509241957;
        }
        C14030oh.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-837791278);
        this.A0A = AnonymousClass0wJ.A0y();
        this.A0B = C18200wM.A0u();
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reg_container);
        this.A02 = A0H2;
        ViewGroup A0E2 = C18190wL.A0E(A0H2);
        layoutInflater.inflate(R.layout.sac_nux_follow_accounts_you_know_fragment, A0E2, true);
        View A0H3 = AnonymousClass0wJ.A0H(layoutInflater, A0E2, R.layout.sac_nux_follow_accounts_search_bar_row);
        this.A0C = A0H3;
        TypeaheadHeader typeaheadHeader = (TypeaheadHeader) A0H3.requireViewById(R.id.typeahead_header);
        this.A0E = typeaheadHeader;
        typeaheadHeader.setOnSearchEditTextFocusChangeListener(new IDxCListenerShape345S0100000_1_I2(this, 8));
        this.A05.A00 = this.A0C;
        ((AbsListView) this.A02.requireViewById(16908298)).setAdapter(this.A05);
        this.A01 = this.A02.findViewById(R.id.loading_spinner);
        AnonymousClass3YT.A00.A02(this.A06, "follow_from_logged_in_accounts");
        View view = this.A02;
        C14030oh.A09(768793190, A022);
        return view;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1765381440);
        AnonymousClass3LY.A00(this.A06).A02(this.A0J, BBZ.class);
        super.onDestroy();
        C14030oh.A09(485123731, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-520437212);
        this.A0D.onDestroyView();
        C09860go.A0I(this.A02);
        this.A02 = null;
        this.A0E = null;
        this.A0C = null;
        this.A00 = null;
        super.onDestroyView();
        C14030oh.A09(-1868107495, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-445731919);
        super.onPause();
        C09860go.A0I(this.A02);
        C14030oh.A09(2115152319, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(87840914);
        super.onResume();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
        }
        C18180wK.A15(this);
        C14030oh.A09(-1778918413, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        int A032 = C14030oh.A03(1251915912);
        AnonymousClass4u2 r1 = this.A03;
        if (r1 == null) {
            i4 = -1965092284;
        } else {
            if (i >= 1) {
                r1.Cqb(2131827584);
                this.A03.BHC().setSingleLine(false);
            } else {
                r1.setTitle("");
            }
            this.A0K.onScroll(absListView, i, i2, i3);
            i4 = -1531563379;
        }
        C14030oh.A0A(i4, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = C14030oh.A03(-522083398);
        this.A0K.onScrollStateChanged(absListView, i);
        C14030oh.A0A(-1851961640, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A02(this);
        TypeaheadHeader typeaheadHeader = this.A0E;
        typeaheadHeader.A01 = this;
        typeaheadHeader.A00.setHint(requireContext().getString(2131835293));
        this.A0K.A01(this.A0E);
        C018908v.A00(this);
        this.A05.setOnScrollListener(this);
        AnonymousClass3LY.A00(this.A06).A01(this.A0J, BBZ.class);
    }
}
