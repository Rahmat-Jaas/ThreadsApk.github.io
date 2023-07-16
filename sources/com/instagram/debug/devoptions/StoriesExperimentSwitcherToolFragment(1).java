package com.instagram.debug.devoptions;

import X.AnonymousClass0ZU;
import X.AnonymousClass0e5;
import X.AnonymousClass0wJ;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C07950cU;
import X.C14030oh;
import X.C18190wL;
import X.C23411dm;
import X.C63273h9;
import X.C63293hC;
import X.C63613hu;
import X.C64533mV;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.instagram.debug.devoptions.L;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class StoriesExperimentSwitcherToolFragment extends C23411dm implements C82034oy {
    public QuickExperimentDebugStore quickExperimentDebugStore;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, "Stories Switcher Tool");
    }

    public String getModuleName() {
        return "stories_experiment_switcher_tool";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        refreshMenuItems();
    }

    private final void addAdsCtaStickerMenuItems(ArrayList arrayList) {
        C63613hu.A01("Story Ads CTA Stickers", arrayList);
        arrayList.add(createBooleanSwitchItem("Enable CTA Stickers", L.ig_android_stories_cta_stickers.is_enabled.getParameter()));
        arrayList.add(createBooleanSwitchItem("Enable Single Tap (otherwise Double Tap)", L.ig_android_stories_cta_stickers.is_single_tap_enabled.getParameter()));
        arrayList.add(createBooleanSwitchItem("Disable old Swipe Up", L.ig_android_stories_cta_stickers.is_swipe_up_disabled.getParameter()));
        C63293hC.A02("Sticker Location Top Percentage", arrayList);
        arrayList.add(createNumberInputItem("Sticker Location Top Percentage", L.ig_android_stories_cta_stickers.sticker_top_location.getParameter()));
        C63293hC.A02("Sticker Height in DP", arrayList);
        arrayList.add(createNumberInputItem("Sticker Height in DP", L.ig_android_stories_cta_stickers.sticker_height_in_dp.getParameter()));
    }

    private final void addDeveloperOptions(ArrayList arrayList) {
        C63613hu.A01("Developer Options", arrayList);
        AnonymousClass0e5 parameter = L.android_stories_should_launch_viewer_as_modal.enabled.getParameter();
        boolean booleanValue = L.android_stories_should_launch_viewer_as_modal.enabled.peekWithoutExposure(AnonymousClass0wJ.A0X(this.userSession$delegate)).booleanValue();
        AnonymousClass4MC.A06(new StoriesExperimentSwitcherToolFragment$addDeveloperOptions$1(this, parameter), "Open Viewer as TransparentModalActivity", arrayList, booleanValue);
        AnonymousClass4MC.A06(new StoriesExperimentSwitcherToolFragment$addDeveloperOptions$2(this, parameter), "Open Viewer as Modal Fragment (Low-End Devices)", arrayList, true);
        AnonymousClass4MC.A06(new StoriesExperimentSwitcherToolFragment$addDeveloperOptions$3(this, parameter), "Open Viewer as TransparentModalFragment (New!)", arrayList, booleanValue);
    }

    private final void addStoryLikesMenuItems(ArrayList arrayList) {
        C63613hu.A01("Story Likes", arrayList);
        AnonymousClass4MA.A02(new StoriesExperimentSwitcherToolFragment$addStoryLikesMenuItems$1(this), "Reset All Story Likes NUXes", arrayList);
    }

    private final void addTrayExperimentsMenuItems(ArrayList arrayList) {
        C63613hu.A01("Tray Experiments", arrayList);
        arrayList.add(createBooleanSwitchItem("Use Large Avatar In Standard Tray", L.ig_android_stories_tray_ranking_experiments.use_large_avatar_in_standard_tray.getParameter()));
        C63293hC.A02("Stories Pog Size Scale Factor", arrayList);
        arrayList.add(createNumberInputItemDouble("Stories Pog Size Scale Factor", L.ig_stories_nav_improvements.pog_size_scale_factor_android.getParameter()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (com.instagram.debug.devoptions.L.ig_android_save_stories_ads.is_bookmark_enabled.getAndExpose(X.AnonymousClass0wJ.A0X(r3.userSession$delegate)).booleanValue() != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void addViewerExperimentsMenuItems(java.util.ArrayList r4) {
        /*
            r3 = this;
            java.lang.String r0 = "Viewer Experiments"
            X.C63613hu.A01(r0, r4)
            X.0Oa r0 = r3.userSession$delegate
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.Boolean r0 = com.instagram.debug.devoptions.L.ig_android_save_stories_ads.is_save_menu_option_enabled.getAndExpose((com.instagram.service.session.UserSession) r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0026
            X.0Oa r0 = r3.userSession$delegate
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.Boolean r0 = com.instagram.debug.devoptions.L.ig_android_save_stories_ads.is_bookmark_enabled.getAndExpose((com.instagram.service.session.UserSession) r0)
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            java.lang.String r1 = "Story Ads Save Enabled"
            com.instagram.debug.devoptions.StoriesExperimentSwitcherToolFragment$addViewerExperimentsMenuItems$1 r0 = new com.instagram.debug.devoptions.StoriesExperimentSwitcherToolFragment$addViewerExperimentsMenuItems$1
            r0.<init>(r3)
            X.AnonymousClass4MC.A06(r0, r1, r4, r2)
            X.0Oa r0 = r3.userSession$delegate
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            java.lang.Boolean r0 = com.instagram.debug.devoptions.L.ig_android_save_stories_ads.is_save_to_collections_enabled.getAndExpose((com.instagram.service.session.UserSession) r0)
            boolean r2 = r0.booleanValue()
            java.lang.String r1 = "Story Ads Collections Save Enabled"
            com.instagram.debug.devoptions.StoriesExperimentSwitcherToolFragment$addViewerExperimentsMenuItems$2 r0 = new com.instagram.debug.devoptions.StoriesExperimentSwitcherToolFragment$addViewerExperimentsMenuItems$2
            r0.<init>(r3)
            X.AnonymousClass4MC.A06(r0, r1, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.StoriesExperimentSwitcherToolFragment.addViewerExperimentsMenuItems(java.util.ArrayList):void");
    }

    private final AnonymousClass4MC createBooleanSwitchItem(String str, AnonymousClass0e5 r5) {
        Object A01 = r5.A01(AnonymousClass0wJ.A0X(this.userSession$delegate));
        C04220Ms.A06(A01);
        return new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new StoriesExperimentSwitcherToolFragment$createBooleanSwitchItem$1(this, r5), (CharSequence) str, AnonymousClass0wJ.A1X(A01));
    }

    private final C64533mV createNumberInputItem(String str, AnonymousClass0e5 r9) {
        String valueOf = String.valueOf(C18190wL.A08(r9.A01(AnonymousClass0wJ.A0X(this.userSession$delegate))));
        return new C64533mV(StoriesExperimentSwitcherToolFragment$createNumberInputItem$2.INSTANCE, new StoriesExperimentSwitcherToolFragment$createNumberInputItem$1(this, r9), 2, str, valueOf, false);
    }

    private final C64533mV createNumberInputItemDouble(String str, AnonymousClass0e5 r9) {
        String valueOf = String.valueOf(((Number) r9.A01(AnonymousClass0wJ.A0X(this.userSession$delegate))).doubleValue());
        return new C64533mV(StoriesExperimentSwitcherToolFragment$createNumberInputItemDouble$2.INSTANCE, new StoriesExperimentSwitcherToolFragment$createNumberInputItemDouble$1(this, r9), 8192, str, valueOf, false);
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    private final void removeParameterOverride(C07950cU r2) {
        QuickExperimentDebugStore quickExperimentDebugStore2 = this.quickExperimentDebugStore;
        if (quickExperimentDebugStore2 == null) {
            C04220Ms.A0E("quickExperimentDebugStore");
            throw null;
        } else {
            quickExperimentDebugStore2.removeOverriddenParameter(r2);
        }
    }

    /* access modifiers changed from: private */
    public final void setParameterOverride(C07950cU r2, String str) {
        QuickExperimentDebugStore quickExperimentDebugStore2 = this.quickExperimentDebugStore;
        if (quickExperimentDebugStore2 == null) {
            C04220Ms.A0E("quickExperimentDebugStore");
            throw null;
        } else {
            quickExperimentDebugStore2.putOverriddenParameter(r2, str);
        }
    }

    private final List getMenuItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63293hC.A02("Tap items to enable or tweak each feature. Press Remove Client Overrides to receive any whitelisted parameters. Press Turn Off All Experiments to force disable all experiments.", A0v);
        AnonymousClass4MA.A02(new StoriesExperimentSwitcherToolFragment$getMenuItems$1(this), "Remove Client Overrides", A0v);
        AnonymousClass4MA.A02(new StoriesExperimentSwitcherToolFragment$getMenuItems$2(this), "Turn Off All Experiments", A0v);
        C63273h9.A02(A0v);
        addTrayExperimentsMenuItems(A0v);
        C63273h9.A02(A0v);
        addViewerExperimentsMenuItems(A0v);
        C63273h9.A02(A0v);
        addStoryLikesMenuItems(A0v);
        C63273h9.A02(A0v);
        addAdsCtaStickerMenuItems(A0v);
        C63273h9.A02(A0v);
        addDeveloperOptions(A0v);
        C63273h9.A02(A0v);
        return A0v;
    }

    /* access modifiers changed from: private */
    public final void refreshMenuItems() {
        setItems(getMenuItems());
    }

    /* access modifiers changed from: private */
    public final void resetAllParamsToDefault() {
        removeParameterOverride(L.ig_android_stories_tray_ranking_experiments.use_large_avatar_in_standard_tray.getParameter());
        removeParameterOverride(L.ig_android_stories_cta_stickers.is_enabled.getParameter());
        removeParameterOverride(L.ig_android_stories_cta_stickers.is_single_tap_enabled.getParameter());
        removeParameterOverride(L.ig_android_stories_cta_stickers.is_swipe_up_disabled.getParameter());
        removeParameterOverride(L.ig_android_stories_cta_stickers.sticker_height_in_dp.getParameter());
        removeParameterOverride(L.ig_android_stories_cta_stickers.sticker_top_location.getParameter());
        removeParameterOverride(L.ig_stories_nav_improvements.pog_size_scale_factor_android.getParameter());
    }

    /* access modifiers changed from: private */
    public final void turnOffAllExperiments() {
        setParameterOverride(L.ig_android_stories_tray_ranking_experiments.use_large_avatar_in_standard_tray.getParameter(), "false");
        setParameterOverride(L.ig_android_stories_cta_stickers.is_enabled.getParameter(), "false");
        removeParameterOverride(L.ig_stories_nav_improvements.pog_size_scale_factor_android.getParameter());
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-793061059);
        super.onCreate(bundle);
        this.quickExperimentDebugStore = QuickExperimentDebugStoreManager.getOverrideStore(AnonymousClass0wJ.A0X(this.userSession$delegate));
        C14030oh.A09(1390045387, A02);
    }

    private final AnonymousClass4MC createBooleanSwitchItem(String str, boolean z, AnonymousClass0ZU r5) {
        return new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) new StoriesExperimentSwitcherToolFragment$createBooleanSwitchItem$2(r5), (CharSequence) str, z);
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
