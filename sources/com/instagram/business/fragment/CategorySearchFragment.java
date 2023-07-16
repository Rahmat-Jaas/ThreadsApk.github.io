package com.instagram.business.fragment;

import X.AnonymousClass006;
import X.AnonymousClass06E;
import X.AnonymousClass0g9;
import X.AnonymousClass0hA;
import X.AnonymousClass0wJ;
import X.AnonymousClass15H;
import X.AnonymousClass1RF;
import X.AnonymousClass1cM;
import X.AnonymousClass1fK;
import X.AnonymousClass1k2;
import X.AnonymousClass1m9;
import X.AnonymousClass266;
import X.AnonymousClass3SA;
import X.AnonymousClass3Ze;
import X.AnonymousClass48S;
import X.AnonymousClass4OS;
import X.AnonymousClass4OU;
import X.AnonymousClass4u2;
import X.AnonymousClass7Ko;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C14020og;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C18520xK;
import X.C24711ju;
import X.C24731jw;
import X.C25348Dk8;
import X.C31103Gfm;
import X.C31155GhB;
import X.C311924p;
import X.C319329n;
import X.C319529p;
import X.C32165H8c;
import X.C37408JrQ;
import X.C39909L6z;
import X.C59643Lq;
import X.C62163Xl;
import X.C63813iO;
import X.C63873iU;
import X.C64543mW;
import X.C67133yv;
import X.C67293zJ;
import X.C67463zb;
import X.C67473zc;
import X.C73064Qu;
import X.C82034oy;
import X.C82424pb;
import X.C84264sr;
import X.C84294su;
import X.C84654td;
import X.H1T;
import X.I5x;
import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.redex.IDxListenerShape477S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape295S0100000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.common.ui.base.IgRadioButton;
import com.instagram.creatortools.api.CreatorToolsMonetizationApi;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.model.business.BusinessInfo;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape60S0100000_I2_40;

public class CategorySearchFragment extends I5x implements C82424pb, C84294su, C82034oy, C84264sr, CallerContextable {
    public static final CallerContext A0V = CallerContext.A00(CategorySearchFragment.class);
    public int A00 = 0;
    public View A01;
    public ImmutableList A02 = ImmutableList.of();
    public ImmutableList A03 = ImmutableList.of();
    public AnonymousClass1fK A04;
    public BusinessFlowAnalyticsLogger A05;
    public C84654td A06;
    public AnonymousClass48S A07;
    public AnonymousClass1k2 A08;
    public C24711ju A09;
    public C10300i6 A0A;
    public BusinessInfo A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public C24731jw A0M;
    public C311924p A0N;
    public AnonymousClass3SA A0O;
    public String A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final Handler A0T = AnonymousClass0wJ.A0F();
    public final Handler A0U = new C18520xK(Looper.getMainLooper(), this);
    public ActionButton mActionButton;
    public IgdsBottomButtonLayout mBusinessNavBar;
    public ListView mCategoriesListView;
    public IgSwitch mCategoryToggle;
    public View mCategoryToggleContainer;
    public ViewGroup mContainer;
    public IgdsHeadline mHeadline;
    public ViewGroup mMainScreenContainer;
    public InlineSearchBox mSearchBox;
    public View mSelectedCategoryDivider;
    public IgRadioButton mSelectedCategoryView;
    public TextView mSuggestedCategoriesHeader;

    public static void A05(CategorySearchFragment categorySearchFragment) {
        categorySearchFragment.A0K = true;
        AnonymousClass1fK r4 = categorySearchFragment.A04;
        ImmutableList immutableList = categorySearchFragment.A02;
        AnonymousClass48S r2 = categorySearchFragment.A07;
        boolean z = categorySearchFragment.A0I;
        r4.A03();
        if (immutableList != null && !immutableList.isEmpty()) {
            AnonymousClass1fK.A00(r4, r2, immutableList);
        } else if (z) {
            r4.A05(r4.A03, r4.A00.getString(2131831772));
        }
        C14020og.A00(r4, 1476342982);
    }

    public final void CCX() {
        AnonymousClass266 r11;
        AnonymousClass48S r0;
        A07(this, "continue", C18250wR.A0Z(this.A07));
        A03();
        if (this.A0C.equals("creator_tools")) {
            AnonymousClass3Ze.A01(C319329n.CATEGORY_SELECTION, C319529p.CATEGORY_SELECTION_CTA, C05030Qo.A02(this.A0A));
        }
        if (this.A0R) {
            this.mBusinessNavBar.setFooterText(getString(2131824411));
            this.A0T.postDelayed(new AnonymousClass4OS(this), 15000);
            String str = this.A0P;
            AnonymousClass7Ko.A07(str, "creatorToolsEntryPoint should not be null");
            String A0Z = C18250wR.A0Z(this.A07);
            AnonymousClass7Ko.A07(A0Z, "categoryId should not be null");
            Boolean valueOf = Boolean.valueOf(this.A0B.A0P);
            Context requireContext = requireContext();
            UserSession A022 = C05030Qo.A02(this.A0A);
            boolean booleanValue = valueOf.booleanValue();
            C04220Ms.A0B(A022, 2);
            C18180wK.A1R(str, A0Z);
            CreatorToolsMonetizationApi creatorToolsMonetizationApi = (CreatorToolsMonetizationApi) A022.A01(CreatorToolsMonetizationApi.class, new KtLambdaShape60S0100000_I2_40(A022, 28));
            ValuePropsFlow valuePropsFlow = (ValuePropsFlow) ValuePropsFlow.A01.get(str);
            if (valuePropsFlow == null) {
                valuePropsFlow = ValuePropsFlow.UNRECOGNIZED;
            }
            C04220Ms.A0B(valuePropsFlow, 0);
            H1T A0P2 = C18180wK.A0P(creatorToolsMonetizationApi.A00);
            C18250wR.A16(A0P2);
            A0P2.A04();
            A0P2.A0J(C18240wQ.A0h("creators/", "open_creator_tools/", "convert_account/"));
            A0P2.A0B(AnonymousClass1RF.class, C59643Lq.class);
            A0P2.A0O("entry_point", valuePropsFlow.A00);
            A0P2.A0O("category_id", A0Z);
            A0P2.A0R("should_show_category", booleanValue);
            C32165H8c A023 = A0P2.A02();
            C04220Ms.A0C(A023, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.creatortools.api.schemas.CreatorToolsAccountConversionResponse>>");
            A023.A00 = new IDxACallbackShape15S0300000_1_I2(4, (Object) this, (Object) A022, (Object) requireContext);
            schedule(A023);
            return;
        }
        C84654td r02 = this.A06;
        if (r02 == null || !C67293zJ.A06(r02)) {
            C84654td r3 = this.A06;
            if (r3 != null) {
                BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) r3;
                boolean z = false;
                if ((businessConversionActivity.A0A.getValue() instanceof UserSession) && ((C67293zJ.A05(businessConversionActivity) || C67293zJ.A04(businessConversionActivity)) && ConversionStep.CHOOSE_CATEGORY == businessConversionActivity.Abh())) {
                    z = true;
                }
                C84654td r32 = this.A06;
                if (z) {
                    if (C67293zJ.A05(r32) || (this.A0S && (r0 = this.A07) != null && r0.A00 == AnonymousClass266.A05)) {
                        r11 = AnonymousClass266.A05;
                    } else {
                        r11 = AnonymousClass266.A04;
                    }
                    ((BusinessConversionActivity) this.A06).A0I(requireContext(), this, this, r11, "choose_category", false);
                    return;
                }
                String A0Z2 = C18250wR.A0Z(this.A07);
                Bundle A062 = C18180wK.A06();
                A062.putString("subcategory_id", A0Z2);
                r32.Bel(A062);
                A04(this);
                return;
            }
            return;
        }
        A04(this);
        C18230wP.A1P(this.A06);
    }

    public final void CGO() {
        this.A0F = false;
        this.A08.A00 = true;
        this.A0T.removeCallbacksAndMessages((Object) null);
        C39909L6z l6z = (C39909L6z) this.mBusinessNavBar.getLayoutParams();
        l6z.height = -2;
        this.mBusinessNavBar.setLayoutParams(l6z);
        this.mBusinessNavBar.setFooterText((CharSequence) null);
    }

    public final void CJ9() {
    }

    public final String getModuleName() {
        return "choose_category_with_search";
    }

    public static Integer A01(CategorySearchFragment categorySearchFragment) {
        if (categorySearchFragment.A07 != null) {
            for (int i = 0; i < categorySearchFragment.A03.size(); i++) {
                if (categorySearchFragment.A07.isContentSame((AnonymousClass48S) categorySearchFragment.A03.get(i))) {
                    return Integer.valueOf(i);
                }
            }
        }
        return null;
    }

    private void A02() {
        boolean z;
        Integer num;
        if (!this.A0E) {
            this.A01.setVisibility(0);
            AnonymousClass3SA r6 = this.A0O;
            C10300i6 r5 = this.A0A;
            Context requireContext = requireContext();
            AnonymousClass06E A002 = AnonymousClass06E.A00(this);
            C67463zb A003 = C67463zb.A00();
            A003.A05("locale", C31103Gfm.A00());
            AnonymousClass7Ko.A0B(true);
            C32165H8c A0K2 = C18210wN.A0K(C67473zc.A00(A003, AnonymousClass15H.class, "CreatorAndBusinessSuggestedCategoriesQuery"), r5);
            C63873iU.A0F(A0K2, r6, requireContext, 9);
            C31155GhB.A01(requireContext, A002, A0K2);
            return;
        }
        this.A0K = false;
        this.mSuggestedCategoriesHeader.setVisibility(0);
        AnonymousClass1fK r52 = this.A04;
        ImmutableList immutableList = this.A03;
        AnonymousClass48S r4 = this.A07;
        SearchController searchController = this.A08.A03;
        Integer num2 = searchController.A03;
        if (num2 == AnonymousClass006.A0C || (num2 == (num = AnonymousClass006.A01) && searchController.A02 == num)) {
            z = true;
        } else {
            z = false;
        }
        r52.A03();
        if (immutableList != null && !immutableList.isEmpty()) {
            if (z) {
                r52.A05(r52.A01, r52.A00.getString(2131836369));
            }
            AnonymousClass1fK.A00(r52, r4, immutableList);
        }
        C14020og.A00(r52, 214347070);
    }

    private void A03() {
        String str;
        AnonymousClass48S r0 = this.A07;
        String A0Z = C18250wR.A0Z(r0);
        AnonymousClass266 r3 = null;
        if (r0 == null) {
            str = null;
        } else {
            str = r0.A02;
            r3 = r0.A00;
        }
        C62163Xl r1 = new C62163Xl(this.A0B);
        r1.A09 = A0Z;
        r1.A0K = str;
        r1.A02 = r3;
        this.A0B = new BusinessInfo(r1);
        C84654td r02 = this.A06;
        if (r02 != null) {
            C67133yv A0R2 = AnonymousClass0wJ.A0R(r02);
            BusinessInfo businessInfo = this.A0B;
            if (businessInfo != null) {
                A0R2.A06 = businessInfo;
            }
        }
    }

    public static void A04(CategorySearchFragment categorySearchFragment) {
        String str;
        if (categorySearchFragment.A05 != null) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("category_id", C18250wR.A0Z(categorySearchFragment.A07));
            AnonymousClass48S r0 = categorySearchFragment.A07;
            if (r0 == null) {
                str = null;
            } else {
                str = r0.A02;
            }
            A0y.put("category_name", str);
            A0y.put("category_search_keyword", categorySearchFragment.mSearchBox.getSearchString());
            categorySearchFragment.A05.BcE(new C37408JrQ(C18220wO.A0n(categorySearchFragment), categorySearchFragment.A0C, (String) null, (String) null, (String) null, (Map) null, A0y, (Map) null));
        }
    }

    public static void A07(CategorySearchFragment categorySearchFragment, String str, String str2) {
        if (categorySearchFragment.A05 != null) {
            String A0n = C18220wO.A0n(categorySearchFragment);
            HashMap hashMap = null;
            String str3 = categorySearchFragment.A0C;
            if (str2 != null) {
                hashMap = AnonymousClass0wJ.A0y();
                hashMap.put("category_id", str2);
            }
            categorySearchFragment.A05.Be5(new C37408JrQ(A0n, str3, str, (String) null, (String) null, (Map) null, hashMap, (Map) null));
        }
    }

    public static void A08(CategorySearchFragment categorySearchFragment, String str, String str2, String str3, int i) {
        if (categorySearchFragment.A05 != null) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("data_count", String.valueOf(i));
            HashMap hashMap = null;
            if (!(str2 == null || str3 == null)) {
                hashMap = AnonymousClass0wJ.A0y();
                hashMap.put(str2, str3);
            }
            categorySearchFragment.A05.BcA(new C37408JrQ(C18220wO.A0n(categorySearchFragment), categorySearchFragment.A0C, str, (String) null, (String) null, (Map) null, hashMap, A0y));
        }
    }

    public static void A09(CategorySearchFragment categorySearchFragment, boolean z) {
        C62163Xl r1 = new C62163Xl(categorySearchFragment.A0B);
        r1.A0P = z;
        categorySearchFragment.A0B = new BusinessInfo(r1);
        if (categorySearchFragment.A05 != null) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            A0y.put("switch_display_category", String.valueOf(z));
            categorySearchFragment.A05.Be5(new C37408JrQ(C18220wO.A0n(categorySearchFragment), categorySearchFragment.A0C, "switch_display_category", (String) null, (String) null, (Map) null, A0y, (Map) null));
        }
    }

    public final C10300i6 A0I() {
        return this.A0A;
    }

    public final void A0M(AnonymousClass48S r4) {
        String str;
        Integer A012;
        if (this.A0K) {
            str = "searched_category";
        } else {
            str = "suggested_category";
        }
        A07(this, str, r4.A01);
        if (!this.A0J) {
            this.A07 = r4;
            A06(this);
            if (A0O() && (A012 = A01(this)) != null) {
                this.mCategoriesListView.post(new C73064Qu(this, A012));
            }
        }
        this.A08.A00(!this.A0J);
        if (this.A0J) {
            A04(this);
            Fragment targetFragment = getTargetFragment();
            targetFragment.getClass();
            AnonymousClass1cM r0 = (AnonymousClass1cM) targetFragment;
            r0.A0B = r4;
            C18190wL.A19(r0);
        }
    }

    public final void A0N(String str) {
        this.A0D = str;
        if (TextUtils.isEmpty(str)) {
            A02();
            return;
        }
        Handler handler = this.A0U;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        handler.sendMessageDelayed(handler.obtainMessage(1, str), 300);
    }

    public final boolean A0O() {
        return C18180wK.A1Z(this.A08.A03.A03, AnonymousClass006.A0C);
    }

    public final void AHz() {
        if (this.mBusinessNavBar.getVisibility() == 0) {
            this.mBusinessNavBar.setPrimaryButtonEnabled(false);
            return;
        }
        ActionButton actionButton = this.mActionButton;
        if (actionButton != null) {
            actionButton.setEnabled(false);
        }
    }

    public final void AJV() {
        if (this.mBusinessNavBar.getVisibility() == 0) {
            this.mBusinessNavBar.setPrimaryButtonEnabled(true);
            return;
        }
        ActionButton actionButton = this.mActionButton;
        if (actionButton != null) {
            actionButton.setEnabled(true);
        }
    }

    public final void CGJ(String str, String str2, String str3) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A05;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ(C18220wO.A0n(this), this.A0C, "switch_to_professional", str2, str3, (Map) null, (Map) null, (Map) null));
        }
        Context context = getContext();
        if (context != null) {
            C63813iO.A01(context, str);
        }
        this.A09.A00();
    }

    public final void CGY() {
        this.A09.A01();
        this.A0F = true;
        AnonymousClass0g9.A00().A01(new AnonymousClass1m9(this), 8000);
        this.A08.A00 = false;
        this.mBusinessNavBar.setFooterText(getString(2131824411));
        this.A0T.postDelayed(new AnonymousClass4OS(this), 15000);
    }

    public final void CGg(AnonymousClass266 r11) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A05;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdx(new C37408JrQ(C18220wO.A0n(this), this.A0C, "switch_to_professional", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        this.A0U.post(new AnonymousClass4OU(this));
    }

    public final void configureActionBar(AnonymousClass4u2 r5) {
        if (this.A0G) {
            ActionButton Crr = r5.Crr(new C25348Dk8(C18190wL.A0H(this, 128), AnonymousClass0wJ.A0B(this).getString(2131823204), R.drawable.instagram_arrow_back_24));
            this.mActionButton = Crr;
            Crr.setEnabled(false);
            r5.setIsLoading(this.A0H);
            if (!A0O()) {
                A06(this);
                return;
            }
            return;
        }
        AnonymousClass4u2.A04(C18180wK.A0N(), r5, this, 129);
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A0F) {
            this.A03 = ImmutableList.of();
            this.A07 = null;
            this.mSearchBox.A07("", false);
            A06(this);
            if (!this.A0L && (businessFlowAnalyticsLogger = this.A05) != null) {
                businessFlowAnalyticsLogger.BbZ(new C37408JrQ(C18220wO.A0n(this), this.A0C, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
            }
            if (!this.A0G && !this.A0J) {
                A03();
                C84654td r0 = this.A06;
                if (r0 != null) {
                    ((BusinessConversionActivity) r0).CfG((Bundle) null);
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043 A[EDGE_INSN: B:41:0x0043->B:24:0x0043 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(com.instagram.business.fragment.CategorySearchFragment r3) {
        /*
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x0064
            X.48S r0 = r3.A07
            if (r0 == 0) goto L_0x0072
            r3.AJV()
            android.view.View r1 = r3.mCategoryToggleContainer
            if (r1 == 0) goto L_0x0015
            r0 = 0
        L_0x0012:
            r1.setVisibility(r0)
        L_0x0015:
            X.48S r1 = r3.A07
            if (r1 == 0) goto L_0x0043
            com.instagram.common.ui.base.IgRadioButton r0 = r3.mSelectedCategoryView
            if (r0 == 0) goto L_0x0043
            android.view.View r0 = r3.mSelectedCategoryDivider
            if (r0 == 0) goto L_0x0043
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0043
            com.google.common.collect.ImmutableList r0 = r3.A03
            if (r0 == 0) goto L_0x0065
            if (r1 == 0) goto L_0x0065
            X.83w r2 = r0.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r1 = r2.next()
            X.48S r1 = (X.AnonymousClass48S) r1
            X.48S r0 = r3.A07
            boolean r0 = r1.isContentSame(r0)
            if (r0 == 0) goto L_0x002f
        L_0x0043:
            com.instagram.common.ui.base.IgRadioButton r2 = r3.mSelectedCategoryView
            if (r2 == 0) goto L_0x0055
            android.view.View r0 = r3.mSelectedCategoryDivider
            if (r0 == 0) goto L_0x0055
            r1 = 8
        L_0x004d:
            r2.setVisibility(r1)
            android.view.View r0 = r3.mSelectedCategoryDivider
            r0.setVisibility(r1)
        L_0x0055:
            boolean r0 = r3.A0P()
            if (r0 != 0) goto L_0x007c
            boolean r0 = r3.A0O()
            if (r0 == 0) goto L_0x007c
            A05(r3)
        L_0x0064:
            return
        L_0x0065:
            com.instagram.common.ui.base.IgRadioButton r1 = r3.mSelectedCategoryView
            X.48S r0 = r3.A07
            java.lang.String r0 = r0.A02
            r1.setText(r0)
            com.instagram.common.ui.base.IgRadioButton r2 = r3.mSelectedCategoryView
            r1 = 0
            goto L_0x004d
        L_0x0072:
            r3.AHz()
            android.view.View r1 = r3.mCategoryToggleContainer
            if (r1 == 0) goto L_0x0015
            r0 = 8
            goto L_0x0012
        L_0x007c:
            r3.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.CategorySearchFragment.A06(com.instagram.business.fragment.CategorySearchFragment):void");
    }

    public final void A0L() {
        String searchString;
        if (A0O()) {
            searchString = AnonymousClass0wJ.A0n(this.A08.A03.mViewHolder.A0B).trim();
        } else {
            searchString = this.mSearchBox.getSearchString();
        }
        if (!TextUtils.isEmpty(searchString)) {
            A0N(searchString);
            SearchController searchController = this.A08.A03;
            if (searchString == null) {
                searchString = "";
            }
            searchController.mViewHolder.A0B.setText(searchString);
            searchController.mViewHolder.A0B.setSelection(AnonymousClass0hA.A01(searchString));
        } else {
            A02();
        }
        ViewGroup viewGroup = this.mContainer;
        if (viewGroup != null) {
            if (this.A00 == 0) {
                this.A00 = viewGroup.getPaddingTop();
            }
            this.mContainer.setPadding(0, 0, 0, 0);
        }
        this.mMainScreenContainer.setLayoutTransition((LayoutTransition) null);
    }

    public final boolean A0P() {
        String trim;
        if (A0O() && ((trim = AnonymousClass0wJ.A0n(this.A08.A03.mViewHolder.A0B).trim()) == null || trim.length() == 0)) {
            return true;
        }
        if (A0O() || !TextUtils.isEmpty(this.mSearchBox.getSearchString())) {
            return false;
        }
        return true;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A06 = C67293zJ.A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fc, code lost:
        if (r12.A0J != false) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = -1520925387(0xffffffffa5588535, float:-1.8780146E-16)
            int r2 = X.C14030oh.A02(r0)
            super.onCreate(r13)
            android.os.Bundle r3 = r12.requireArguments()
            X.0i6 r0 = X.C18190wL.A0S(r3)
            r12.A0A = r0
            java.lang.String r0 = "entry_point"
            java.lang.String r1 = r3.getString(r0)
            java.lang.String r0 = "entry_point should not be null"
            X.AnonymousClass7Ko.A07(r1, r0)
            r12.A0C = r1
            X.0i6 r1 = r12.A0A
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            r6 = 0
            if (r0 == 0) goto L_0x01dc
            com.instagram.service.session.UserSession r8 = X.C05030Qo.A02(r1)
            X.0Ok r1 = X.C06810aP.A01
            com.instagram.user.model.User r0 = r1.A01(r8)
            boolean r5 = r0.A2z()
            com.instagram.user.model.User r0 = r1.A01(r8)
            boolean r4 = r0.A30()
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r0 = 36321546285685655(0x810a41000d1b97, double:3.033230353970692E-306)
            boolean r0 = X.C63803iN.A0E(r7, r8, r0)
            if (r0 == 0) goto L_0x004d
            X.0TJ r7 = X.AnonymousClass0TJ.A06
        L_0x004d:
            r0 = 36321546285489046(0x810a41000a1b96, double:3.0332303538463555E-306)
            boolean r0 = X.C63803iN.A0E(r7, r8, r0)
            boolean r0 = X.C18210wN.A1W(r0)
            if (r0 == 0) goto L_0x006f
            X.49Q r8 = X.C35662Oi.A00(r8)
            android.content.Context r7 = X.C10600ic.A00
            X.C04220Ms.A06(r7)
            X.4rS r1 = X.GQH.A03
            X.1ns r0 = new X.1ns
            r0.<init>(r7, r8)
            r1.CwT(r0)
        L_0x006f:
            X.4td r0 = r12.A06
            if (r0 == 0) goto L_0x01d2
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            com.instagram.model.business.BusinessInfo r0 = r0.A06
        L_0x0079:
            X.3Xl r1 = new X.3Xl
            r1.<init>(r0)
            r1.A0P = r5
            r1.A0R = r4
            com.instagram.model.business.BusinessInfo r0 = new com.instagram.model.business.BusinessInfo
            r0.<init>((X.C62163Xl) r1)
            r12.A0B = r0
            X.4td r0 = r12.A06
            if (r0 == 0) goto L_0x0097
            X.3yv r1 = X.AnonymousClass0wJ.A0R(r0)
            com.instagram.model.business.BusinessInfo r0 = r12.A0B
            if (r0 == 0) goto L_0x0097
            r1.A06 = r0
        L_0x0097:
            X.4td r1 = r12.A06
            if (r1 == 0) goto L_0x00d4
            boolean r0 = r12.A0J
            if (r0 != 0) goto L_0x00d4
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r1)
            com.instagram.model.business.BusinessInfo r4 = r0.A07
            if (r4 == 0) goto L_0x00d4
            com.instagram.model.business.BusinessInfo r0 = r12.A0B
            X.3Xl r1 = new X.3Xl
            r1.<init>(r0)
            java.lang.String r0 = r4.A09
            r1.A09 = r0
            java.lang.String r0 = r4.A0A
            r1.A0A = r0
            java.lang.String r0 = r4.A0K
            r1.A0K = r0
            r0 = 1
            r1.A0N = r0
            X.266 r0 = r4.A02
            r1.A02 = r0
            com.instagram.model.business.BusinessInfo r0 = new com.instagram.model.business.BusinessInfo
            r0.<init>((X.C62163Xl) r1)
            r12.A0B = r0
            X.4td r0 = r12.A06
            X.3yv r1 = X.AnonymousClass0wJ.A0R(r0)
            com.instagram.model.business.BusinessInfo r0 = r12.A0B
            if (r0 == 0) goto L_0x00d4
            r1.A06 = r0
        L_0x00d4:
            androidx.fragment.app.FragmentActivity r1 = r12.getActivity()
            X.1jw r0 = new X.1jw
            r0.<init>(r1)
            r12.A0M = r0
            r12.registerLifecycleListener(r0)
            X.3SA r0 = new X.3SA
            r0.<init>(r12)
            r12.A0O = r0
            androidx.fragment.app.Fragment r0 = r12.getTargetFragment()
            boolean r0 = r0 instanceof X.AnonymousClass1cM
            r12.A0J = r0
            java.lang.String r4 = "edit_profile_entry"
            java.lang.String r0 = r3.getString(r4)
            if (r0 == 0) goto L_0x00fe
            boolean r1 = r12.A0J
            r0 = 1
            if (r1 == 0) goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            r12.A0G = r0
            X.4td r0 = r12.A06
            boolean r0 = X.C67293zJ.A05(r0)
            if (r0 == 0) goto L_0x010f
            X.0i6 r0 = r12.A0A
            boolean r0 = r0 instanceof com.instagram.service.session.UserSession
            if (r0 != 0) goto L_0x011f
        L_0x010f:
            X.4td r0 = r12.A06
            if (r0 != 0) goto L_0x01cf
            X.0i6 r0 = r12.A0A
            com.instagram.user.model.User r0 = X.C04660Oo.A00(r0)
            boolean r0 = X.C59623Lo.A01(r0)
            if (r0 == 0) goto L_0x01cf
        L_0x011f:
            r0 = 1
        L_0x0120:
            r12.A0Q = r0
            X.4td r5 = r12.A06
            if (r5 == 0) goto L_0x01c5
            X.24p r1 = r5.Aiz()
            X.24p r0 = X.C311924p.INTEREST_ACCOUNT_CONVERSION
            if (r1 == r0) goto L_0x0136
            X.24p r1 = r5.Aiz()
            X.24p r0 = X.C311924p.RENEW_PROFESSIONAL_ACCOUNT
            if (r1 != r0) goto L_0x01c5
        L_0x0136:
            r6 = 1
        L_0x0137:
            r12.A0S = r6
            java.lang.String r0 = r12.A0C
            java.lang.String r1 = "creator_tools"
            if (r0 == r1) goto L_0x0147
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c3
        L_0x0147:
            r0 = 1
        L_0x0148:
            r12.A0R = r0
            if (r0 == 0) goto L_0x0157
            java.lang.String r1 = r3.getString(r1)
            java.lang.String r0 = "creator tools entrypoint should not be null if entrypoint to CategorySearch is creator_tools"
            X.AnonymousClass7Ko.A07(r1, r0)
            r12.A0P = r1
        L_0x0157:
            r0 = 0
            java.lang.String r1 = r3.getString(r4)
            if (r1 == 0) goto L_0x01ae
            X.24p r1 = X.C311924p.EDIT_PROFILE
            r12.A0N = r1
        L_0x0162:
            X.24p r3 = r12.A0N
            if (r3 == 0) goto L_0x016e
            X.0i6 r1 = r12.A0A
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.C37076Jk8.A00(r3, r12, r1, r0)
            r12.A05 = r0
        L_0x016e:
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r12.A05
            if (r0 == 0) goto L_0x01a7
            r10 = 0
            com.instagram.model.business.BusinessInfo r1 = r12.A0B
            if (r1 == 0) goto L_0x018d
            boolean r0 = r1.A0N
            if (r0 == 0) goto L_0x018d
            java.lang.String r3 = r1.A09
            java.lang.String r1 = r1.A0A
            java.util.HashMap r10 = X.AnonymousClass0wJ.A0y()
            java.lang.String r0 = "prefilled_category_id"
            r10.put(r0, r3)
            java.lang.String r0 = "prefilled_category_name"
            r10.put(r0, r1)
        L_0x018d:
            java.lang.String r4 = X.C18220wO.A0n(r12)
            r6 = 0
            java.lang.String r5 = r12.A0C
            com.instagram.model.business.BusinessInfo r0 = r12.A0B
            java.util.Map r9 = X.C34492Jt.A00(r0)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r12.A05
            X.JrQ r3 = new X.JrQ
            r7 = r6
            r8 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.Bdt(r3)
        L_0x01a7:
            r0 = 1431519609(0x55534179, float:1.45173848E13)
            X.C14030oh.A09(r0, r2)
            return
        L_0x01ae:
            X.4td r1 = r12.A06
            if (r1 == 0) goto L_0x0162
            X.24p r0 = r1.Aiz()
            r12.A0N = r0
            X.4td r0 = r12.A06
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0Oa r0 = r0.A0B
            java.lang.String r0 = X.C18200wM.A0q(r0)
            goto L_0x0162
        L_0x01c3:
            r0 = 0
            goto L_0x0148
        L_0x01c5:
            X.4td r0 = r12.A06
            boolean r0 = X.C67293zJ.A06(r0)
            if (r0 == 0) goto L_0x0137
            goto L_0x0136
        L_0x01cf:
            r0 = 0
            goto L_0x0120
        L_0x01d2:
            java.lang.String r0 = "business_info"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            com.instagram.model.business.BusinessInfo r0 = (com.instagram.model.business.BusinessInfo) r0
            goto L_0x0079
        L_0x01dc:
            r5 = 0
            r4 = 0
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.CategorySearchFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0041, code lost:
        if (r10.A0R != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            r0 = 900866477(0x35b221ad, float:1.3271834E-6)
            int r2 = X.C14030oh.A02(r0)
            r0 = 2131493332(0x7f0c01d4, float:1.8610141E38)
            r4 = 0
            android.view.View r3 = r11.inflate(r0, r12, r4)
            r10.mContainer = r12
            r0 = 2131302861(0x7f0919cd, float:1.822382E38)
            android.view.ViewGroup r0 = X.C18220wO.A0J(r3, r0)
            r10.mMainScreenContainer = r0
            r0 = 2131303895(0x7f091dd7, float:1.8225917E38)
            com.instagram.igds.components.headline.IgdsHeadline r0 = X.C18240wQ.A0S(r3, r0)
            r10.mHeadline = r0
            r0.setVisibility(r4)
            com.instagram.igds.components.headline.IgdsHeadline r1 = r10.mHeadline
            r0 = 2131835419(0x7f113a1b, float:1.9303976E38)
            r1.setHeadline((int) r0)
            com.instagram.igds.components.headline.IgdsHeadline r1 = r10.mHeadline
            r0 = 2131835418(0x7f113a1a, float:1.9303974E38)
            r1.setBody((int) r0)
            boolean r0 = r10.A0S
            if (r0 != 0) goto L_0x0043
            boolean r0 = r10.A0Q
            if (r0 != 0) goto L_0x0043
            boolean r0 = r10.A0R
            r1 = 0
            if (r0 == 0) goto L_0x0044
        L_0x0043:
            r1 = 1
        L_0x0044:
            r10.A0E = r4
            r0 = 2131307654(0x7f092c86, float:1.8233541E38)
            android.view.View r0 = r3.requireViewById(r0)
            r10.A01 = r0
            r0 = 2131303605(0x7f091cb5, float:1.822533E38)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r5 = X.C18230wP.A0W(r3, r0)
            r10.mBusinessNavBar = r5
            r4 = 2131831737(0x7f112bb9, float:1.9296508E38)
            if (r1 == 0) goto L_0x0060
            r4 = 2131826219(0x7f11162b, float:1.9285316E38)
        L_0x0060:
            r1 = -1
            X.1ju r0 = new X.1ju
            r0.<init>((X.C84264sr) r10, (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r5, (int) r4, (int) r1)
            r10.A09 = r0
            r10.registerLifecycleListener(r0)
            boolean r0 = r10.A0G
            if (r0 != 0) goto L_0x0073
            boolean r0 = r10.A0J
            if (r0 == 0) goto L_0x007a
        L_0x0073:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r1 = r10.mBusinessNavBar
            r0 = 8
            r1.setVisibility(r0)
        L_0x007a:
            X.4td r0 = r10.A06
            if (r0 == 0) goto L_0x011e
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            com.instagram.model.business.BusinessInfo r0 = r0.A06
        L_0x0084:
            r10.A0B = r0
            r0 = 2131306654(0x7f09289e, float:1.8231513E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.igds.components.search.InlineSearchBox r0 = (com.instagram.igds.components.search.InlineSearchBox) r0
            r10.mSearchBox = r0
            android.content.Context r1 = r10.requireContext()
            X.1fK r0 = new X.1fK
            r0.<init>(r1, r10)
            r10.A04 = r0
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r1 = r3.requireViewById(r0)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r10.mCategoriesListView = r1
            X.1fK r0 = r10.A04
            r1.setAdapter(r0)
            r0 = 2131307653(0x7f092c85, float:1.823354E38)
            android.widget.TextView r0 = X.AnonymousClass0wJ.A0L(r3, r0)
            r10.mSuggestedCategoriesHeader = r0
            r0 = 2131306659(0x7f0928a3, float:1.8231523E38)
            android.view.ViewGroup r8 = X.C18220wO.A0J(r3, r0)
            r0 = 2131301326(0x7f0913ce, float:1.8220707E38)
            android.view.View r6 = r3.requireViewById(r0)
            androidx.fragment.app.FragmentActivity r5 = r10.requireActivity()
            X.1fK r9 = r10.A04
            android.view.ViewGroup r7 = r10.mMainScreenContainer
            com.instagram.igds.components.search.InlineSearchBox r11 = r10.mSearchBox
            X.1k2 r4 = new X.1k2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r10.A08 = r4
            r10.registerLifecycleListener(r4)
            r0 = 2131306050(0x7f092642, float:1.8230288E38)
            android.view.View r1 = r3.requireViewById(r0)
            r10.mCategoryToggleContainer = r1
            r0 = 2131308181(0x7f092e95, float:1.823461E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r1, r0)
            r0 = 2131826199(0x7f111617, float:1.9285276E38)
            r1.setText(r0)
            android.view.View r1 = r10.mCategoryToggleContainer
            r0 = 2131308229(0x7f092ec5, float:1.8234708E38)
            com.instagram.igds.components.switchbutton.IgSwitch r1 = X.C18250wR.A0N(r1, r0)
            r10.mCategoryToggle = r1
            com.instagram.model.business.BusinessInfo r0 = r10.A0B
            boolean r0 = r0.A0P
            r1.setChecked(r0)
            r0 = 2131306410(0x7f0927aa, float:1.8231018E38)
            android.view.View r1 = r3.requireViewById(r0)
            com.instagram.common.ui.base.IgRadioButton r1 = (com.instagram.common.ui.base.IgRadioButton) r1
            r10.mSelectedCategoryView = r1
            r0 = 1
            r1.setChecked(r0)
            r0 = 2131306845(0x7f09295d, float:1.82319E38)
            android.view.View r0 = r3.requireViewById(r0)
            r10.mSelectedCategoryDivider = r0
            r0 = -1504032663(0xffffffffa65a4869, float:-7.573208E-16)
            X.C14030oh.A09(r0, r2)
            return r3
        L_0x011e:
            com.instagram.model.business.BusinessInfo r0 = r10.A0B
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.CategorySearchFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-124459057);
        unregisterLifecycleListener(this.A0M);
        super.onDestroy();
        C14030oh.A09(-250357024, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1373520753);
        this.A0T.removeCallbacksAndMessages((Object) null);
        unregisterLifecycleListener(this.A09);
        this.A01 = null;
        this.A09 = null;
        this.A03 = ImmutableList.of();
        AnonymousClass1k2 r0 = this.A08;
        if (r0 != null) {
            unregisterLifecycleListener(r0);
        }
        super.onDestroyView();
        C14030oh.A09(-1438308237, A022);
    }

    public final void onDetach() {
        int A022 = C14030oh.A02(188475854);
        Handler handler = this.A0U;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        super.onDetach();
        C14030oh.A09(134978222, A022);
    }

    public final void onResume() {
        int i;
        int A022 = C14030oh.A02(-667455641);
        super.onResume();
        if (A0O()) {
            i = 865937908;
        } else {
            A06(this);
            i = -1702985895;
        }
        C14030oh.A09(i, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        IgSwitch igSwitch;
        BusinessInfo businessInfo;
        super.onViewCreated(view, bundle);
        AnonymousClass0wJ.A0L(this.mSearchBox, R.id.search_edit_text).addTextChangedListener(C64543mW.A00(this.A0A));
        if (this.A0C.equals("creator_tools")) {
            AnonymousClass3Ze.A02(C319329n.CATEGORY_SELECTION, C05030Qo.A02(this.A0A));
        }
        if (!(this.A06 == null || (businessInfo = this.A0B) == null || this.A0J)) {
            String str = businessInfo.A09;
            String str2 = businessInfo.A0A;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                this.A07 = new AnonymousClass48S(this.A0B.A02, str, str2);
                A06(this);
            }
        }
        View view2 = this.mCategoryToggleContainer;
        if (view2 != null && (igSwitch = this.mCategoryToggle) != null) {
            igSwitch.A07 = new IDxTListenerShape295S0100000_1_I2(this, 2);
            AnonymousClass0wJ.A16(view2, StringTreeSet.MAX_SYMBOL_COUNT, this);
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        int A022 = C14030oh.A02(-699954703);
        super.onViewStateRestored(bundle);
        this.mSearchBox.A02 = new IDxListenerShape477S0100000_1_I2(this, 0);
        C14030oh.A09(382873384, A022);
    }
}
