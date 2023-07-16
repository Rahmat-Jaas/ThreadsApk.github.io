package com.instagram.debug.devoptions;

import X.AnonymousClass0e5;
import X.AnonymousClass0wJ;
import X.AnonymousClass4VZ;
import X.C02260Al;
import X.C04220Ms;
import X.C06750aI;
import X.C18180wK;
import X.C18210wN;
import X.C18230wP;
import com.instagram.debug.devoptions.BooleanFeatureExperiment;
import com.instagram.debug.devoptions.L;
import com.instagram.debug.devoptions.Nav3Experiment;
import com.instagram.debug.devoptions.PanaVisionExperiment;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PanavisionDevUtil {
    public static final Companion Companion = new Companion();
    public final PanaVisionExperiment CONTROL_EXPERIENCE;
    public final List GENERAL_FEATURES;
    public final List NAV3_EXPERIMENTS;
    public final List NAV3_ROOT_EXPERIMENT;
    public final List PERF;
    public final List POST_DESIGN;
    public final PanaVisionExperiment SANDBOX_EXPERIENCE;
    public final PanavisionFlags flags;
    public final List nav3BoolParams;
    public final List nav3StringParams;
    public final List panavisionBoolParams;
    public final List panavisionDoubleParams;
    public final List panavisionStringParams;
    public final QuickExperimentDebugStore quickExperimentDebugStore;
    public final UserSession userSession;

    public final class ExperimentFlag {
        public final String description;
        public final String name;
        public final AnonymousClass0e5 param;
        public final /* synthetic */ PanavisionDevUtil this$0;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ExperimentFlag(PanavisionDevUtil panavisionDevUtil, String str, AnonymousClass0e5 r4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(panavisionDevUtil, str, r4, (i & 4) != 0 ? "" : str2);
        }

        public final void clearOverride() {
            this.this$0.quickExperimentDebugStore.removeOverriddenParameter(this.param);
        }

        public final Object getCurrentValue() {
            return this.param.A01(this.this$0.userSession);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getName() {
            return this.name;
        }

        public final void overrideValue(Object obj) {
            this.this$0.quickExperimentDebugStore.putOverriddenParameter(this.param, String.valueOf(obj));
        }

        public ExperimentFlag(PanavisionDevUtil panavisionDevUtil, String str, AnonymousClass0e5 r4, String str2) {
            AnonymousClass0wJ.A1Q(str, r4);
            C04220Ms.A0B(str2, 4);
            this.this$0 = panavisionDevUtil;
            this.name = str;
            this.param = r4;
            this.description = str2;
        }
    }

    public enum ExperimentSeries {
        NAV3,
        GENERAL_FEATURES,
        POST_DESIGN,
        PERF
    }

    public static final PanavisionDevUtil getInstance(UserSession userSession2, QuickExperimentDebugStore quickExperimentDebugStore2) {
        return Companion.getInstance(userSession2, quickExperimentDebugStore2);
    }

    public final List getExperiments(ExperimentSeries experimentSeries) {
        int A04 = C18230wP.A04(experimentSeries, 0);
        if (A04 == 0) {
            return this.NAV3_ROOT_EXPERIMENT;
        }
        if (A04 == 1) {
            return this.GENERAL_FEATURES;
        }
        if (A04 == 2) {
            return this.POST_DESIGN;
        }
        if (A04 == 3) {
            return this.PERF;
        }
        throw AnonymousClass4VZ.A00();
    }

    public final class Companion {
        public final PanavisionDevUtil getInstance(UserSession userSession, QuickExperimentDebugStore quickExperimentDebugStore) {
            AnonymousClass0wJ.A1N(userSession, quickExperimentDebugStore);
            return (PanavisionDevUtil) userSession.A01(PanavisionDevUtil.class, new PanavisionDevUtil$Companion$getInstance$1(userSession, quickExperimentDebugStore));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001a */
        static {
            /*
                com.instagram.debug.devoptions.PanavisionDevUtil$ExperimentSeries[] r0 = com.instagram.debug.devoptions.PanavisionDevUtil.ExperimentSeries.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.instagram.debug.devoptions.PanavisionDevUtil$ExperimentSeries r0 = com.instagram.debug.devoptions.PanavisionDevUtil.ExperimentSeries.NAV3     // Catch:{ NoSuchFieldError -> 0x000c }
                X.C18240wQ.A1E(r0, r2)     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                com.instagram.debug.devoptions.PanavisionDevUtil$ExperimentSeries r0 = com.instagram.debug.devoptions.PanavisionDevUtil.ExperimentSeries.GENERAL_FEATURES     // Catch:{ NoSuchFieldError -> 0x0011 }
                X.C18240wQ.A1F(r0, r2)     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                com.instagram.debug.devoptions.PanavisionDevUtil$ExperimentSeries r0 = com.instagram.debug.devoptions.PanavisionDevUtil.ExperimentSeries.POST_DESIGN     // Catch:{ NoSuchFieldError -> 0x001a }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x001a }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001a }
            L_0x001a:
                com.instagram.debug.devoptions.PanavisionDevUtil$ExperimentSeries r0 = com.instagram.debug.devoptions.PanavisionDevUtil.ExperimentSeries.PERF     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                $EnumSwitchMapping$0 = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.PanavisionDevUtil.WhenMappings.<clinit>():void");
        }
    }

    public PanavisionDevUtil(UserSession userSession2, QuickExperimentDebugStore quickExperimentDebugStore2) {
        UserSession userSession3 = userSession2;
        QuickExperimentDebugStore quickExperimentDebugStore3 = quickExperimentDebugStore2;
        UserSession userSession4 = userSession3;
        AnonymousClass0wJ.A1M(userSession4, 1, quickExperimentDebugStore3);
        this.userSession = userSession4;
        this.quickExperimentDebugStore = quickExperimentDebugStore3;
        ExperimentFlag experimentFlag = new ExperimentFlag(this, "isDarkModeEnabled", L.ig_android_panavision_consumption_launcher.is_dark_mode_enabled.getParameter(), "on dark mode, off default theme");
        ExperimentFlag experimentFlag2 = new ExperimentFlag(this, "isUfiVertical", L.ig_android_panavision_consumption_launcher.is_ufi_vertical.getParameter(), "on vertical, off horizontal");
        ExperimentFlag experimentFlag3 = new ExperimentFlag(this, "isUfiRightAligned", L.ig_android_panavision_consumption_launcher.android_immersive_right_side_ufi_enabled.getParameter(), "on right aligned, off left, only if ufi is not vertical");
        ExperimentFlag experimentFlag4 = new ExperimentFlag(this, "useCombinedView", L.ig_android_panavision_consumption_launcher.use_one_view_type_for_media_item_view.getParameter(), "true to use a single view for both carousel and single media posts");
        ExperimentFlag experimentFlag5 = experimentFlag;
        ExperimentFlag experimentFlag6 = experimentFlag2;
        ExperimentFlag experimentFlag7 = experimentFlag3;
        ExperimentFlag experimentFlag8 = experimentFlag4;
        List A17 = C06750aI.A17(experimentFlag5, experimentFlag6, experimentFlag7, experimentFlag8, new ExperimentFlag(this, "isTallVideoEnabled", L.ig_android_panavision_consumption_launcher.is_tall_video_enabled.getParameter(), ""), new ExperimentFlag(this, "captionTagsH", L.ig_android_panavision_consumption_launcher.android_in_caption_tags_enabled.getParameter(), ""), new ExperimentFlag(this, "captionTagsV", L.ig_android_panavision_consumption_launcher.h_ufi_caption_tags_enabled.getParameter(), ""), new ExperimentFlag(this, "isCaptionInBottomSheet", L.ig_android_panavision_consumption_launcher.android_caption_to_bottom_sheet.getParameter(), ""), new ExperimentFlag(this, "bottomSheetTabIcons", L.ig_android_panavision_consumption_launcher.android_bottom_sheet_tab_icons_enabled.getParameter(), ""), new ExperimentFlag(this, "isRifuDisabled", L.ig_android_panavision_consumption_launcher.android_is_rifu_disabled.getParameter(), ""), new ExperimentFlag(this, "isCommentComposerEnabled", L.ig_android_panavision_consumption_launcher.is_comment_composer_enabled.getParameter(), ""), new ExperimentFlag(this, "isImmersiveEnabled", L.ig_android_panavision_consumption_launcher.is_immersive_enabled.getParameter(), ""), new ExperimentFlag(this, "controlOnlyTallVideoEnabled", L.ig_panavision_v0.tall_video_main_feed_enabled.getParameter(), ""), new ExperimentFlag(this, "androidSecondaryCtaEnabled", L.ig_android_panavision_consumption_launcher.android_secondary_cta_enabled.getParameter(), ""));
        this.panavisionBoolParams = A17;
        List A0n = C18180wK.A0n(new ExperimentFlag(this, "panavisionAdMode", L.ig_android_panavision_consumption_launcher.panavision_ad_mode.getParameter(), ""));
        this.panavisionStringParams = A0n;
        List A0n2 = C18180wK.A0n(new ExperimentFlag(this, "panavisionMilestone", L.ig_android_panavision_consumption_launcher.android_panavision_milestone.getParameter(), "panavision milestone gate"));
        this.panavisionDoubleParams = A0n2;
        List A172 = C06750aI.A17(new ExperimentFlag(this, "isEnabled", L.ig_panavision_nav3_launcher.is_enabled.getParameter(), "is Nav3 enabled"), new ExperimentFlag(this, "swipeRightDirectEnabled", L.ig_panavision_nav3_launcher.swipe_right_direct_enabled.getParameter(), ""), new ExperimentFlag(this, "overrideShareToGallery", L.ig_panavision_nav3_launcher.override_share_to_gallery.getParameter(), ""), new ExperimentFlag(this, "isModifiedProfileMenu", L.ig_panavision_nav3_launcher.is_modified_profile_menu.getParameter(), ""), new ExperimentFlag(this, "filledTabIconsEnabled", L.ig_panavision_nav3_launcher.filled_tab_icons_enabled.getParameter(), ""), new ExperimentFlag(this, "bellIconForAF", L.ig_panavision_nav3_launcher.is_bell_icon_for_af.getParameter(), ""), new ExperimentFlag(this, "isSwappedProfileCreateIcon", L.ig_panavision_nav3_launcher.is_profile_creation_button_icon_swap_enabled.getParameter(), ""));
        this.nav3BoolParams = A172;
        List A173 = C06750aI.A17(new ExperimentFlag(this, "tab0", L.ig_panavision_nav3_launcher.tab_0.getParameter(), ""), new ExperimentFlag(this, "tab1", L.ig_panavision_nav3_launcher.tab_1.getParameter(), ""), new ExperimentFlag(this, "tab2", L.ig_panavision_nav3_launcher.tab_2.getParameter(), ""), new ExperimentFlag(this, "tab3", L.ig_panavision_nav3_launcher.tab_3.getParameter(), ""), new ExperimentFlag(this, "tab4", L.ig_panavision_nav3_launcher.tab_4.getParameter(), ""), new ExperimentFlag(this, "topbar0", L.ig_panavision_nav3_launcher.top_bar_0.getParameter(), ""), new ExperimentFlag(this, "topbar1", L.ig_panavision_nav3_launcher.top_bar_1.getParameter(), ""), new ExperimentFlag(this, "topbar2", L.ig_panavision_nav3_launcher.top_bar_2.getParameter(), ""));
        this.nav3StringParams = A173;
        PanavisionFlags panavisionFlags = new PanavisionFlags(C02260Al.A10(C06750aI.A17(A17, A172)), C02260Al.A10(C06750aI.A17(A0n, A173)), A0n2);
        this.flags = panavisionFlags;
        PanaVisionExperiment.Companion companion = PanaVisionExperiment.Companion;
        PanavisionFlags panavisionFlags2 = panavisionFlags;
        this.CONTROL_EXPERIENCE = companion.create("Control", "control", panavisionFlags2, false, false, false, false, true, false, false, "", 0.0d);
        PanaVisionExperiment create = companion.create("MVP Immersive Feed Sandbox", "immersive_feed_sandbox", panavisionFlags, true, false, true, true, false, true, true, "immersive", 0.0d);
        this.SANDBOX_EXPERIENCE = create;
        BooleanFeatureExperiment.Companion companion2 = BooleanFeatureExperiment.Companion;
        this.GENERAL_FEATURES = C18180wK.A0n(companion2.create("light mode", "isLightMode", panavisionFlags, (Pair) null, (Pair) null, C18180wK.A0p(false, Boolean.valueOf(create.isDarkModeEnabled)), (Pair) null, (Pair) null, (Pair) null, (Pair) null, (Pair) null));
        BooleanFeatureExperiment.Companion companion3 = companion2;
        PanavisionFlags panavisionFlags3 = panavisionFlags;
        this.POST_DESIGN = C06750aI.A17(companion3.create("Caption in Bottom sheet", "captionInBottomSheet", panavisionFlags3, (Pair) null, (Pair) null, (Pair) null, C18180wK.A0p(true, false), C18180wK.A0p(true, false), (Pair) null, (Pair) null, (Pair) null), companion3.create("Tags in caption", "captionTags", panavisionFlags3, (Pair) null, (Pair) null, (Pair) null, (Pair) null, (Pair) null, C18180wK.A0p(true, false), C18180wK.A0p(true, false), (Pair) null), companion3.create("Mimicry (secondary) CTAs in Home", "secondaryCtas", panavisionFlags3, (Pair) null, (Pair) null, (Pair) null, (Pair) null, (Pair) null, (Pair) null, (Pair) null, C18180wK.A0p(true, false)));
        this.PERF = C18180wK.A0n(UserPreferenceBooleanFeatureExperiment.Companion.create("Immersive Debug overlay", "debugOverlay", userSession3, C18180wK.A0p(true, false), (Pair) null));
        Nav3Experiment.Companion companion4 = Nav3Experiment.Companion;
        Nav3Experiment create2 = companion4.create("Control", "control", panavisionFlags2, false, "", "", "", "", "", "", "", "", true, true, false, false, false, false);
        Nav3Experiment create3 = companion4.create("[N1] Variant 1: Minimal", "v1", panavisionFlags, true, "home", "explore", "share", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, "profile", "", "", "news", false, true, true, false, false, false);
        Nav3Experiment.Companion companion5 = companion4;
        PanavisionFlags panavisionFlags4 = panavisionFlags;
        String str = "home";
        String str2 = "share";
        String str3 = "profile";
        String str4 = "";
        Nav3Experiment create4 = companion5.create("[N1] Variant 2: Direct Second", "v2", panavisionFlags4, true, str, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, str2, "explore", str3, str4, "", "news", false, true, true, false, false, false);
        String str5 = "explore";
        String str6 = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        String str7 = "share";
        List A174 = C06750aI.A17(create2, create3, create4, companion5.create("[N1] Variant 3: Bookmarks", "v3", panavisionFlags4, true, str, str5, str2, str6, str3, str4, "news", "menu", false, true, false, false, false, false), companion5.create("[N1] Variant 4: Keep it Reels", "v4", panavisionFlags4, true, str, str5, "clips", str6, str3, str4, str7, "news", false, true, true, false, false, false), companion5.create("[N2] Activity in Tab", "v2.1", panavisionFlags4, true, str, str5, "clips", "news", str3, str4, str7, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, true, true, true, false, false, false), companion4.create("[N2] Create in Tab", "v2.2", panavisionFlags, true, "home", "explore", "share", "clips", "profile", "", "news", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, true, true, true, false, false, true));
        this.NAV3_EXPERIMENTS = A174;
        this.NAV3_ROOT_EXPERIMENT = C18180wK.A0n(MultiChoiceFeatureExperiment.Companion.create("Nav mode", "nav3", A174));
    }

    private final /* synthetic */ void clearOverride(AnonymousClass0e5 r2) {
        this.quickExperimentDebugStore.removeOverriddenParameter(r2);
    }

    private final /* synthetic */ void overrideValue(AnonymousClass0e5 r3, Object obj) {
        this.quickExperimentDebugStore.putOverriddenParameter(r3, String.valueOf(obj));
    }

    public final boolean isSandboxOn() {
        return AnonymousClass0wJ.A1X(C18210wN.A0Y(this.flags, "isImmersiveEnabled"));
    }

    public final void resetAllParamsToDefault() {
        for (ExperimentFlag clearOverride : this.flags.allBoolParams) {
            clearOverride.clearOverride();
        }
        for (ExperimentFlag clearOverride2 : this.flags.allStringParams) {
            clearOverride2.clearOverride();
        }
        for (ExperimentFlag clearOverride3 : this.flags.allDoubleParams) {
            clearOverride3.clearOverride();
        }
    }

    private final void enableSandbox(boolean z) {
        PanaVisionExperiment panaVisionExperiment;
        boolean isSandboxOn = isSandboxOn();
        if (z) {
            if (!isSandboxOn) {
                panaVisionExperiment = this.SANDBOX_EXPERIENCE;
            } else {
                return;
            }
        } else if (isSandboxOn) {
            resetAllParamsToDefault();
            panaVisionExperiment = this.CONTROL_EXPERIENCE;
        } else {
            return;
        }
        panaVisionExperiment.setOverrides();
    }

    public final void setSandboxOn(boolean z) {
        enableSandbox(z);
    }
}
