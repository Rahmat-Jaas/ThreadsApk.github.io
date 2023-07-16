package com.instagram.business.fragment;

import X.AnonymousClass00U;
import X.AnonymousClass0P9;
import X.AnonymousClass0wJ;
import X.AnonymousClass234;
import X.AnonymousClass3L5;
import X.AnonymousClass3V5;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C145538kf;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18240wQ;
import X.C18250wR;
import X.C21741Rz;
import X.C23411dm;
import X.C25764Drc;
import X.C32165H8c;
import X.C34832Lb;
import X.C37408JrQ;
import X.C38040KHr;
import X.C63873iU;
import X.C67293zJ;
import X.C82034oy;
import X.C82394pY;
import X.C82424pb;
import X.C84654td;
import X.E2V;
import X.H1T;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.actionbar.ActionButton;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

public class InviteFollowersV2Fragment extends C23411dm implements C82424pb, C82034oy {
    public E2V A00;
    public ActionButton A01;
    public BusinessFlowAnalyticsLogger A02;
    public AnonymousClass3V5 A03;
    public UserSession A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public C84654td A09;
    public String A0A;
    public String A0B;
    public final C82394pY A0C = C18220wO.A0P(this, 13);
    public View mLoadingIndicator;

    public final String getModuleName() {
        return "invite_followers_v2_fragment";
    }

    public static void A0B(InviteFollowersV2Fragment inviteFollowersV2Fragment, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = inviteFollowersV2Fragment.A02;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("invite_followers", inviteFollowersV2Fragment.A05, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        ActionButton A002 = AnonymousClass4u2.A00(C18190wL.A0H(this, 145), r3, "");
        this.A01 = A002;
        A002.setEnabled(this.A06);
        C25764Drc A0K = C18190wL.A0K();
        A0K.A0C = C18190wL.A0H(this, 146);
        A0K.A04 = 2131824015;
        AnonymousClass4u2.A03(A0K, r3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return this.A04;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A08 || (businessFlowAnalyticsLogger = this.A02) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.BbZ(new C37408JrQ("invite_followers", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        AnonymousClass3V5 r7 = this.A03;
        Context context = getContext();
        IDxACallbackShape111S0100000_1_I2 A062 = C63873iU.A06(this, 14);
        C145538kf r4 = r7.A00;
        UserSession userSession = r7.A01;
        H1T A0O = C18180wK.A0O(userSession);
        A0O.A0J("business/account/get_invite_friends_subitems/");
        ArrayList<AnonymousClass234> A0v = AnonymousClass0wJ.A0v();
        for (AnonymousClass234 r3 : AnonymousClass234.values()) {
            switch (r3.ordinal()) {
                case 0:
                    z = !C34832Lb.A00(context, userSession);
                    break;
                case 1:
                case 8:
                    z = userSession.multipleAccountHelper.A0L();
                    break;
                case 7:
                    try {
                        context.getPackageManager().getPackageInfo("com.whatsapp", 128);
                    } catch (PackageManager.NameNotFoundException unused) {
                        break;
                    }
                case 2:
                case 4:
                case 5:
                case 6:
                    A0v.add(r3);
                    continue;
            }
            if (!z) {
            }
            A0v.add(r3);
            continue;
        }
        String str = "";
        for (AnonymousClass234 r1 : A0v) {
            if (str.length() > 0) {
                str = AnonymousClass00U.A0L(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            str = AnonymousClass00U.A0L(str, r1.A00);
        }
        A0O.A0O("client_eligible_sub_items", str);
        A0O.A0O("logged_in_user_ids", AnonymousClass3V5.A00(r7));
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, C21741Rz.class, AnonymousClass3L5.class);
        A0T.A00 = A062;
        r4.schedule(A0T);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A09 = C67293zJ.A01(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1770995647);
        super.onCreate(bundle);
        Bundle A072 = C18250wR.A07(this);
        this.A04 = C18180wK.A0V(A072);
        this.A05 = A072.getString("entry_point");
        this.A0B = A072.getString("ARG_TITLE", requireContext().getString(2131829219));
        this.A0A = A072.getString("ARG_SUB_TITLE", requireContext().getString(2131829218));
        this.A03 = new AnonymousClass3V5(this, this.A04);
        this.A07 = C18240wQ.A1S(A072, "ARG_CHECKLIST_ITEM_COMPLETED");
        BusinessFlowAnalyticsLogger A002 = C67293zJ.A00(this.A09, this, this.A04);
        this.A02 = A002;
        if (A002 != null) {
            A002.Bdt(new C37408JrQ("invite_followers", this.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        C14030oh.A09(544863326, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1191420795);
        View inflate = layoutInflater.inflate(R.layout.invite_followers_v2_fragment, viewGroup, false);
        IgdsHeadline A0S = C18240wQ.A0S(inflate, R.id.onboarding_checklist_headline);
        A0S.setHeadline((CharSequence) this.A0B);
        A0S.setBody(this.A0A, (View.OnClickListener) null);
        A0S.setVisibility(0);
        this.mLoadingIndicator = inflate.requireViewById(R.id.loading_spinner);
        this.A00 = C18190wL.A0M(this);
        C38040KHr.A01.A03(this.A0C, AnonymousClass0P9.class);
        C14030oh.A09(-1182420845, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(409086049);
        super.onDestroyView();
        C38040KHr.A01.A04(this.A0C, AnonymousClass0P9.class);
        C14030oh.A09(148489313, A022);
    }
}
