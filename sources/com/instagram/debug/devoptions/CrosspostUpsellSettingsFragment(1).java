package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass3ZL;
import X.AnonymousClass3Zu;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18200wM;
import X.C18250wR;
import X.C23411dm;
import X.C63273h9;
import X.C63293hC;
import X.C63613hu;
import X.C80644m9;
import X.C82034oy;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.section.contentliquidity.ContentLiquidityOptions;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class CrosspostUpsellSettingsFragment extends C23411dm implements C82034oy {
    public final String TAG = "CrosspostUpsellSettingsFragment";
    public C10300i6 session;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825103);
    }

    public String getModuleName() {
        return "crosspost_upsell_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        resetItems();
    }

    public void setSession(C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        this.session = r2;
    }

    private final void addCCPItems(List list) {
        C63613hu.A02("Reels CCP", list);
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addCCPItems$1(this), "Clear CCP/XAR/CCP Migration upsell impression timestamp/impression count/settings toggle timestamps"));
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addCCPItems$2(this), "(CCP) Reset CCP upsell and last change timestamp"));
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addCCPItems$3(this), "Clear CCP tooltip seen flag"));
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addCCPItems$4(this), "(XAR) Clear local XAR upsell and toggle timestamps"));
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addCCPItems$5(this), "(CCP) Reset Panavision Content Liquidity Nuxes"));
        list.add(new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new CrosspostUpsellSettingsFragment$addCCPItems$6(this), (CharSequence) "(CCP) Toggle on to always see panavision ccp sharesheet nuxes", AnonymousClass3Zu.A02(AnonymousClass0wJ.A0X(this.userSession$delegate)).getBoolean("PREFERENCE_Always_Show_Panavision_CCP_Nux", false)));
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addCCPItems$7(this), "(CCP) Reset Tooltip For CCP On Panavision M15"));
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addCCPItems$8(this), "Reset Panavision feed post new post capture nux"));
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addCCPItems$9(this), "(Simplification) Reset V1 upsell last seen"));
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addCCPItems$10(this), "(Simplification) Set V1 upsell last seen to now"));
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addCCPItems$11(this), "(Simplification) Reset V1.5 upsell last seen"));
        list.add(new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new CrosspostUpsellSettingsFragment$addCCPItems$12(this), (CharSequence) "(Migration) Bypass XarCcp Migration Upsell Cooldowns", AnonymousClass3Zu.A02(AnonymousClass0wJ.A0X(this.userSession$delegate)).getBoolean("PREFERENCE_BYPASS_XAR_CCP_MIGRATION_UPSELL_COOLDOWNS", false)));
    }

    private final void addServerCXPNoticeItems(List list) {
        C63613hu.A02("Server CXP Notice", list);
        list.add(AnonymousClass4MA.A01(new CrosspostUpsellSettingsFragment$addServerCXPNoticeItems$1(this), "Reset Notices"));
    }

    private final void addStatsItems(List list) {
        AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(AnonymousClass0wJ.A0X(this.userSession$delegate));
        SharedPreferences sharedPreferences = A03.A04;
        C63293hC r4 = new C63293hC((CharSequence) AnonymousClass00U.A0U("ccp upsell lastSeen=", "; ccp lastChanged=", sharedPreferences.getLong("PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS", 0), sharedPreferences.getLong("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS", 0)));
        r4.A01 = R.dimen.abc_control_corner_material;
        list.add(r4);
        C63293hC r3 = new C63293hC((CharSequence) AnonymousClass00U.A0U("xar upsell lastSeen=", "; xar lastChanged=", sharedPreferences.getLong("PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS", 0), A03.A03()));
        r3.A01 = R.dimen.abc_control_corner_material;
        list.add(r3);
        C63293hC r32 = new C63293hC((CharSequence) AnonymousClass00U.A0U("simplification lastSeen v1=", " v15=", sharedPreferences.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_UPSELL_LAST_SEEN", 0), sharedPreferences.getLong("PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_V_1_5_UPSELL_LAST_SEEN", 0)));
        r32.A01 = R.dimen.abc_control_corner_material;
        list.add(r32);
        StringBuilder A0s = C18190wL.A0s("migration lastSeen=");
        A0s.append(sharedPreferences.getLong("PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_LAST_SEEN_MS", 0));
        A0s.append(" count=");
        A0s.append(C18190wL.A04(sharedPreferences, "PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_SEEN_COUNT"));
        C63293hC r33 = new C63293hC((CharSequence) A0s.toString());
        r33.A01 = R.dimen.abc_control_corner_material;
        list.add(r33);
        C63293hC r34 = new C63293hC((CharSequence) AnonymousClass00U.A08(sharedPreferences.getLong("PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_GLOBAL", 0), "(reenter to refresh) sharedUpsell Global="));
        r34.A01 = R.dimen.abc_control_corner_material;
        list.add(r34);
        StringBuilder A0s2 = C18190wL.A0s("(reenter to refresh) sharedUpsell Feed=");
        A0s2.append(sharedPreferences.getLong("PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_FEED", 0));
        A0s2.append(" Story=");
        A0s2.append(sharedPreferences.getLong("PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_STORY", 0));
        A0s2.append(" Reel=");
        A0s2.append(sharedPreferences.getLong("PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL", 0));
        C63293hC r0 = new C63293hC((CharSequence) A0s2.toString());
        r0.A01 = R.dimen.abc_control_corner_material;
        list.add(r0);
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public C10300i6 getSession() {
        C10300i6 r0 = this.session;
        if (r0 != null) {
            return r0;
        }
        C18250wR.A0l();
        throw null;
    }

    private final void addContentLiquidityItems(List list) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C63613hu.A04(list, 2131825051);
            list.addAll(new ContentLiquidityOptions().getItems(AnonymousClass0wJ.A0X(this.userSession$delegate), activity));
        }
    }

    private final void addXARItems(List list) {
        C63613hu.A04(list, 2131825401);
        list.add(AnonymousClass4MA.A00(new CrosspostUpsellSettingsFragment$addXARItems$1(this), 2131825404));
        list.add(AnonymousClass4MA.A00(new CrosspostUpsellSettingsFragment$addXARItems$2(this), 2131825403));
    }

    /* access modifiers changed from: private */
    public final void resetItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        addStatsItems(A0v);
        C63273h9.A02(A0v);
        addServerCXPNoticeItems(A0v);
        C63273h9.A02(A0v);
        addCCPItems(A0v);
        C63273h9.A02(A0v);
        addXARItems(A0v);
        C63273h9.A02(A0v);
        addContentLiquidityItems(A0v);
        setItems(A0v);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1366195297);
        super.onCreate(bundle);
        setSession(C18200wM.A0V(this));
        C14030oh.A09(867752378, A02);
    }
}
