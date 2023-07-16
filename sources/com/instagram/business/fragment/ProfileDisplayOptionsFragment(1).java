package com.instagram.business.fragment;

import X.AnonymousClass006;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass1fX;
import X.AnonymousClass2KW;
import X.AnonymousClass4u2;
import X.AnonymousClass7FY;
import X.C04620Ok;
import X.C06810aP;
import X.C10300i6;
import X.C10450iM;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C19527Axo;
import X.C22302CTd;
import X.C24;
import X.C24731jw;
import X.C25778Drr;
import X.C25828Dsm;
import X.C311924p;
import X.C37076Jk8;
import X.C37408JrQ;
import X.C59623Lo;
import X.C62163Xl;
import X.C63803iN;
import X.C63873iU;
import X.C67353zP;
import X.C82034oy;
import X.C82424pb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxTListenerShape94S0300000_1_I2;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.model.business.BusinessInfo;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProfileDisplayOptionsFragment extends C22302CTd implements C82424pb, C82034oy {
    public View A00;
    public View A01;
    public BusinessFlowAnalyticsLogger A02;
    public BusinessInfo A03;
    public BusinessInfo A04;
    public UserSession A05;
    public User A06;
    public String A07;
    public boolean A08;
    public IgSwitch mCategoryToggle;
    public IgSwitch mContactsToggle;
    public IgSwitch mDiscountToggle;
    public View mRootView;
    public ActionButton mSaveButton;

    private void A00(View view, IgSwitch igSwitch, Integer num) {
        igSwitch.A07 = new IDxTListenerShape94S0300000_1_I2(0, this, igSwitch, num);
        C18200wM.A1E(view, this, num, igSwitch, 12);
    }

    private boolean A04(User user) {
        if (user == null) {
            return false;
        }
        return C67353zP.A00(getContext(), this.A05, user, true, false) - (C18180wK.A1V(user.A3b() ? 1 : 0) ? 1 : 0) > 0;
    }

    public final String getModuleName() {
        return "profile_display_options";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getContext();
        UserSession userSession = this.A05;
        User user = this.A06;
        setAdapter(new AnonymousClass1fX(this, this, userSession, user, C59623Lo.A01(user), getUseRecyclerViewFromQE().booleanValue()));
        C24 scrollingViewProxy = getScrollingViewProxy();
        if (scrollingViewProxy.BVW()) {
            C25778Drr.A01((ListView) scrollingViewProxy.BLD());
        }
        if (C63803iN.A05(AnonymousClass0TJ.A05, this.A05, 2342165959952834102L).booleanValue()) {
            View view2 = this.A01;
            if (!(view2 == null || this.A00 == null)) {
                view2.setVisibility(0);
                this.A00.setVisibility(8);
            }
            AnonymousClass2KW.A00(C63873iU.A06(this, 19), this.A05, this, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r2.A04(r2.A06) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.business.fragment.ProfileDisplayOptionsFragment r2) {
        /*
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0013
            com.instagram.model.business.BusinessInfo r0 = r2.A03
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0013
            com.instagram.user.model.User r0 = r2.A06
            boolean r0 = r2.A04(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            com.instagram.model.business.BusinessInfo r0 = r2.A03
            com.instagram.model.business.BusinessInfo r0 = X.C62163Xl.A00(r0, r1)
            r2.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.ProfileDisplayOptionsFragment.A01(com.instagram.business.fragment.ProfileDisplayOptionsFragment):void");
    }

    public static void A02(ProfileDisplayOptionsFragment profileDisplayOptionsFragment, IgSwitch igSwitch, Integer num, boolean z) {
        User user;
        boolean z2;
        String str;
        C62163Xl r4 = new C62163Xl(profileDisplayOptionsFragment.A03);
        try {
            user = C19527Axo.A02(C19527Axo.A04(profileDisplayOptionsFragment.A06));
        } catch (IOException unused) {
            C10450iM.A03("profile_display_options", "Exception on serialize and deserialize User");
            user = null;
        }
        profileDisplayOptionsFragment.A06 = user;
        if (user != null && profileDisplayOptionsFragment.A04 != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                r4.A0P = z;
                user.A2c(z);
                z2 = profileDisplayOptionsFragment.A04.A0P;
                str = "switch_display_category";
            } else if (intValue != 1) {
                r4.A0Q = z;
                user.A05.CoY(Boolean.valueOf(z));
                z2 = profileDisplayOptionsFragment.A04.A0Q;
                str = "switch_display_discount";
            } else {
                if (!profileDisplayOptionsFragment.A04(user)) {
                    C25828Dsm A0W = C18190wL.A0W(profileDisplayOptionsFragment.getContext());
                    A0W.A0L(2131831746);
                    A0W.A0K(2131821039);
                    C18180wK.A1O(A0W, profileDisplayOptionsFragment, 19, 2131821038);
                    C18230wP.A1M(A0W, profileDisplayOptionsFragment, igSwitch, 13, 2131823054);
                    AnonymousClass0wJ.A1K(A0W);
                    z2 = false;
                } else {
                    profileDisplayOptionsFragment.A06.A2d(z);
                    z2 = profileDisplayOptionsFragment.A04.A0R;
                }
                r4.A0R = z;
                str = "switch_display_contact";
            }
            profileDisplayOptionsFragment.A03 = new BusinessInfo(r4);
            ((AnonymousClass1fX) profileDisplayOptionsFragment.getAdapter()).A00(profileDisplayOptionsFragment.A06);
            C24 scrollingViewProxy = profileDisplayOptionsFragment.getScrollingViewProxy();
            if (scrollingViewProxy.BVW()) {
                C25778Drr.A01((ListView) scrollingViewProxy.BLD());
            }
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("is_profile_info_shown", String.valueOf(z2));
            HashMap A0y2 = AnonymousClass0wJ.A0y();
            A0y2.put("is_profile_info_shown", String.valueOf(z));
            profileDisplayOptionsFragment.A02.Bbh(new C37408JrQ("profile_display_options", profileDisplayOptionsFragment.A07, str, (String) null, (String) null, A0y, A0y2, (Map) null));
        }
    }

    public static boolean A03(ProfileDisplayOptionsFragment profileDisplayOptionsFragment) {
        return C63803iN.A05(AnonymousClass0TJ.A05, profileDisplayOptionsFragment.A05, 36319647909287199L).booleanValue();
    }

    public final C10300i6 getSession() {
        return this.A05;
    }

    public final Boolean getUseRecyclerViewFromQE() {
        return C63803iN.A05(AnonymousClass0TJ.A05, this.A05, 36316710151654699L);
    }

    public final boolean onBackPressed() {
        this.A02.BbZ(new C37408JrQ("profile_display_options", this.A07, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        this.mSaveButton = AnonymousClass4u2.A00(C18190wL.A0H(this, 162), r3, AnonymousClass0wJ.A0B(this).getString(2131826678));
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 163);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1678781454);
        this.A05 = AnonymousClass0wJ.A0W(this);
        super.onCreate(bundle);
        this.A07 = C18190wL.A0k(this);
        BusinessFlowAnalyticsLogger A002 = C37076Jk8.A00(C311924p.EDIT_PROFILE, this, this.A05, (String) null);
        A002.getClass();
        this.A02 = A002;
        C24731jw.A01(this);
        C14030oh.A09(1339703207, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        User user;
        int A022 = C14030oh.A02(-707383834);
        View inflate = layoutInflater.inflate(R.layout.profile_display_options_fragment, viewGroup, false);
        this.mRootView = inflate;
        this.A00 = inflate.requireViewById(R.id.scroll_view);
        this.A01 = this.mRootView.requireViewById(R.id.loading_spinner);
        boolean isUsingRecyclerView = isUsingRecyclerView();
        int i = R.id.lv_list_stub;
        if (isUsingRecyclerView) {
            i = R.id.rv_list_stub;
        }
        ((ViewStub) this.mRootView.requireViewById(i)).inflate();
        UserSession userSession = this.A05;
        C04620Ok r4 = C06810aP.A01;
        try {
            user = C19527Axo.A02(C19527Axo.A04(r4.A01(userSession)));
        } catch (IOException unused) {
            C10450iM.A03("profile_display_options", "Exception on serialize and deserialize User");
            user = null;
        }
        this.A06 = user;
        this.A08 = A04(user);
        BusinessInfo businessInfo = this.A04;
        if (businessInfo == null) {
            C62163Xl r1 = new C62163Xl();
            r1.A0P = r4.A01(this.A05).A2z();
            r1.A0R = r4.A01(this.A05).A30();
            if (!A03(this)) {
                r1.A0Q = C18210wN.A1T(C18240wQ.A0W(this.A05, r4).BXa());
            }
            businessInfo = new BusinessInfo(r1);
            this.A04 = businessInfo;
        }
        if (this.A03 == null) {
            this.A03 = new BusinessInfo(new C62163Xl(businessInfo));
        }
        A01(this);
        AnonymousClass0wJ.A0L(this.mRootView, R.id.title).setText(2131832968);
        AnonymousClass0wJ.A0L(this.mRootView, R.id.subtitle).setText(2131832967);
        View view = this.mRootView;
        View requireViewById = view.requireViewById(R.id.row_category);
        View requireViewById2 = view.requireViewById(R.id.row_contacts);
        View requireViewById3 = view.requireViewById(R.id.row_discount);
        View requireViewById4 = view.requireViewById(R.id.row_discount_without_toggle);
        Integer num = AnonymousClass006.A01;
        AnonymousClass7FY.A02(requireViewById4, num);
        this.mCategoryToggle = C18250wR.A0N(requireViewById, R.id.toggle);
        this.mContactsToggle = C18250wR.A0N(requireViewById2, R.id.toggle);
        this.mDiscountToggle = C18250wR.A0N(requireViewById3, R.id.toggle);
        this.mCategoryToggle.setChecked(this.A03.A0P);
        AnonymousClass0wJ.A0L(requireViewById, R.id.title).setText(2131832962);
        A00(requireViewById, this.mCategoryToggle, AnonymousClass006.A00);
        if (this.A08) {
            this.A06.A2d(this.A03.A0R);
            this.mContactsToggle.setChecked(this.A03.A0R);
            AnonymousClass0wJ.A0L(requireViewById2, R.id.title).setText(2131832963);
            A00(requireViewById2, this.mContactsToggle, num);
        } else {
            requireViewById2.setVisibility(8);
        }
        User user2 = this.A06;
        if (user2 == null || user2.A05.BXa() == null) {
            requireViewById3.setVisibility(8);
            requireViewById4.setVisibility(8);
        } else if (A03(this)) {
            AnonymousClass0wJ.A0L(requireViewById4, R.id.contact_text).setText(2131832964);
            AnonymousClass0wJ.A16(requireViewById4, 164, this);
            requireViewById3.setVisibility(8);
        } else {
            this.mDiscountToggle.setChecked(this.A03.A0Q);
            AnonymousClass0wJ.A0L(requireViewById3, R.id.title).setText(2131832964);
            AnonymousClass0wJ.A0L(requireViewById3, R.id.subtitle).setText(2131832965);
            C18190wL.A18(requireViewById3, R.id.subtitle, 0);
            A00(requireViewById3, this.mDiscountToggle, AnonymousClass006.A0C);
            requireViewById4.setVisibility(8);
        }
        this.A02.Bdt(new C37408JrQ("profile_display_options", this.A07, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        View view2 = this.mRootView;
        C14030oh.A09(-1540886589, A022);
        return view2;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1948731935);
        super.onResume();
        this.mCategoryToggle.setChecked(this.A03.A0P);
        A01(this);
        this.mContactsToggle.setChecked(this.A03.A0R);
        User user = this.A06;
        if (user != null) {
            user.A2d(this.A03.A0R);
        }
        if (getAdapter() != null) {
            ((AnonymousClass1fX) getAdapter()).A00(this.A06);
        }
        if (!A03(this)) {
            this.mDiscountToggle.setChecked(this.A03.A0Q);
        }
        C14030oh.A09(391554211, A022);
    }

    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        C18190wL.A1D(recyclerView);
    }
}
