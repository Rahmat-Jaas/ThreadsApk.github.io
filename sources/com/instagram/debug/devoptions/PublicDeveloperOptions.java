package com.instagram.debug.devoptions;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass2B9;
import X.AnonymousClass31S;
import X.AnonymousClass32H;
import X.AnonymousClass3FH;
import X.AnonymousClass3LW;
import X.AnonymousClass3RL;
import X.AnonymousClass4BB;
import X.AnonymousClass4BC;
import X.AnonymousClass4MA;
import X.AnonymousClass4MC;
import X.C04000Lv;
import X.C04220Ms;
import X.C08340dC;
import X.C08380dH;
import X.C09120et;
import X.C13950oZ;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C36622Sa;
import X.C41026Luf;
import X.C60833Qr;
import X.C61823Vx;
import X.C63273h9;
import X.C63473hX;
import X.C63613hu;
import X.C63743iE;
import X.C81704oE;
import X.GHO;
import X.I17;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ShortcutManager;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.NumberPicker;
import android.widget.Switch;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.debug.devoptions.DeveloperOptionUtils;
import com.instagram.debug.devoptions.L;
import com.instagram.debug.devoptions.helper.DevOptionsHelper;
import com.instagram.debug.devoptions.section.appversion.AppVersionOptions;
import com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection;
import com.instagram.debug.devoptions.section.newusernux.NewUserNuxOptions;
import com.instagram.debug.devoptions.section.zone.PolicyZonePreferencesSection;
import com.instagram.debug.sandbox.SandboxUtil;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

public final class PublicDeveloperOptions {
    public static final PublicDeveloperOptions INSTANCE = new PublicDeveloperOptions();
    public static final Object LOCK_FOR_ANR = new Object();
    public static final String TAG = "PublicDeveloperOptions";

    private final void addSections(Context context, List list, FragmentActivity fragmentActivity, UserSession userSession, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        int i = 0;
        DeveloperOptionsSection[] developerOptionsSectionArr = {new NewUserNuxOptions(context), new AnonymousClass4BB(), new PolicyZonePreferencesSection(context)};
        do {
            DeveloperOptionUtils.Companion.addSection(list, developerOptionsSectionArr[i], userSession, fragmentActivity, onPinnedDevOptionItemAdded);
            i++;
        } while (i < 3);
    }

    /* access modifiers changed from: private */
    public final void forceAnr() {
        new Thread(PublicDeveloperOptions$forceAnr$1.INSTANCE).start();
        C18250wR.A08().postDelayed(PublicDeveloperOptions$forceAnr$2.INSTANCE, 1000);
    }

    private final List getQuickExperimentOptions(Context context, FragmentActivity fragmentActivity, UserSession userSession, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        C61823Vx r6 = C61823Vx.A01;
        if (r6 != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            C63613hu.A03(A0v, 2131825176);
            DevOptionsHelper.Companion companion = DevOptionsHelper.Companion;
            companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A00(new PublicDeveloperOptions$getQuickExperimentOptions$1(r6, userSession, context, fragmentActivity), 2131825330), onPinnedDevOptionItemAdded);
            r6.A09(userSession, false);
            long lastNormalUpdateTimestamp = r6.A03().A01.A00.A06().getLastNormalUpdateTimestamp();
            long lastNormalUpdateTimestamp2 = r6.A04(userSession).A01.A00.A06().getLastNormalUpdateTimestamp();
            companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A01(new PublicDeveloperOptions$getQuickExperimentOptions$2(context, r6, userSession), getForceSyncString(context, 2131825183, lastNormalUpdateTimestamp)), onPinnedDevOptionItemAdded);
            companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A01(new PublicDeveloperOptions$getQuickExperimentOptions$3(context, r6, userSession), getForceSyncString(context, 2131825187, lastNormalUpdateTimestamp2)), onPinnedDevOptionItemAdded);
            companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A00(new PublicDeveloperOptions$getQuickExperimentOptions$4(r6, userSession, context), 2131825313), onPinnedDevOptionItemAdded);
            companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A01(new PublicDeveloperOptions$getQuickExperimentOptions$5(r6, userSession, context), "Force emergency push"), onPinnedDevOptionItemAdded);
            companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A01(new PublicDeveloperOptions$getQuickExperimentOptions$6(fragmentActivity, userSession), "Import overrides from task"), onPinnedDevOptionItemAdded);
            companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A01(new PublicDeveloperOptions$getQuickExperimentOptions$7(userSession, context), "Delete local overrides"), onPinnedDevOptionItemAdded);
            companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A00(new PublicDeveloperOptions$getQuickExperimentOptions$8(userSession, fragmentActivity), 2131825329), onPinnedDevOptionItemAdded);
            companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A00(new PublicDeveloperOptions$getQuickExperimentOptions$9(userSession, fragmentActivity), 2131825349), onPinnedDevOptionItemAdded);
            companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A01(new PublicDeveloperOptions$getQuickExperimentOptions$10(userSession, fragmentActivity), "== Diagnose MobileConfig Rollout =="), onPinnedDevOptionItemAdded);
            C63273h9.A02(A0v);
            return A0v;
        }
        throw AnonymousClass0wJ.A0b();
    }

    private final boolean isApplicationShortcutSupported(Context context) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager != null) {
            return shortcutManager.isRequestPinShortcutSupported();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void showInstacrashDialog(Context context) {
        Context context2 = context;
        Dialog A0G = C18190wL.A0W(context2).A0G();
        View A0D = C18180wK.A0D(LayoutInflater.from(context2), (ViewGroup) null, R.layout.layout_instacrash_test_options, false);
        A0G.setContentView(A0D);
        C09120et A0X = C18190wL.A0X();
        NumberPicker numberPicker = (NumberPicker) AnonymousClass0wJ.A0K(A0D, R.id.dev_options_instacrash_time);
        String[] strArr = {RealtimeSubscription.GRAPHQL_MQTT_VERSION, "5", "10", "30", "45", "60"};
        numberPicker.setMaxValue(5);
        numberPicker.setMinValue(0);
        numberPicker.setDisplayedValues(strArr);
        numberPicker.setWrapSelectorWheel(false);
        Switch switchR = (Switch) AnonymousClass0wJ.A0K(A0D, R.id.dev_options_instacrash_test_mode);
        switchR.setChecked(true);
        AnonymousClass0wJ.A0K(A0D, R.id.dev_options_instacrash_save_button).setOnClickListener(new PublicDeveloperOptions$showInstacrashDialog$1(A0G, A0X, strArr, numberPicker, switchR, context2));
        AnonymousClass0wJ.A0K(A0D, R.id.dev_options_instacrash_cancel_button).setOnClickListener(new PublicDeveloperOptions$showInstacrashDialog$2(A0G));
        C13950oZ.A00(A0G);
    }

    private final void addAnalytics(List list, FragmentActivity fragmentActivity, UserSession userSession, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        boolean A1V = AnonymousClass0wJ.A1V(C18190wL.A0X().A2D);
        C63613hu.A04(list, 2131824991);
        DevOptionsHelper.Companion companion = DevOptionsHelper.Companion;
        companion.addMenuItem(userSession, list, AnonymousClass4MA.A00(new PublicDeveloperOptions$addAnalytics$1(fragmentActivity, userSession), 2131825315), onPinnedDevOptionItemAdded);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded, userSession, AnonymousClass4MC.A03(new PublicDeveloperOptions$addAnalytics$2(fragmentActivity), 2131825175, A1V), list);
    }

    private final void addInteropSwitchItem(List list, Context context, UserSession userSession, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        Integer A06 = C63473hX.A01(userSession).A06();
        C04220Ms.A06(A06);
        if (A06 != AnonymousClass006.A0N && A06 != AnonymousClass006.A00) {
            DevOptionsHelper.Companion.addSwitchItem(userSession, list, AnonymousClass4MC.A03(new PublicDeveloperOptions$addInteropSwitchItem$1(userSession, context), 2131825298, C18180wK.A1Z(A06, AnonymousClass006.A0C)), onPinnedDevOptionItemAdded);
        }
    }

    private final void addMobileBoost(UserSession userSession, List list, Context context, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        C63613hu.A04(list, 2131825328);
        DevOptionsHelper.Companion.addMenuItem(userSession, list, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMobileBoost$1(context), 2131825327), onPinnedDevOptionItemAdded);
    }

    private final void addZeroRating(Context context, List list, FragmentActivity fragmentActivity, UserSession userSession, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        C63613hu.A04(list, 2131825589);
        DevOptionsHelper.Companion companion = DevOptionsHelper.Companion;
        companion.addMenuItem(userSession, list, AnonymousClass4MA.A01(new PublicDeveloperOptions$addZeroRating$1(fragmentActivity, userSession), "Zero Rating Options"), onPinnedDevOptionItemAdded);
        companion.addMenuItem(userSession, list, AnonymousClass4MA.A01(new PublicDeveloperOptions$addZeroRating$2(fragmentActivity, userSession), "Zero E2E Test"), onPinnedDevOptionItemAdded);
        companion.addMenuItem(userSession, list, AnonymousClass4MA.A01(new PublicDeveloperOptions$addZeroRating$3(context, userSession), "Zero Dogfood Carrier"), onPinnedDevOptionItemAdded);
        companion.addMenuItem(userSession, list, AnonymousClass4MA.A00(new PublicDeveloperOptions$addZeroRating$4(userSession, context), 2131825440), onPinnedDevOptionItemAdded);
        companion.addMenuItem(userSession, list, AnonymousClass4MA.A00(new PublicDeveloperOptions$addZeroRating$5(userSession, context), 2131825179), onPinnedDevOptionItemAdded);
    }

    private final List getApplicationShortcutOptions(Context context, UserSession userSession, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A03(A0v, 2131824999);
        DevOptionsHelper.Companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A00(new PublicDeveloperOptions$getApplicationShortcutOptions$1(context), 2131825084), onPinnedDevOptionItemAdded);
        return A0v;
    }

    private final String getForceSyncString(Context context, int i, long j) {
        String str;
        String A0k = AnonymousClass0wJ.A0k(context, i);
        if (j > 0) {
            str = DateUtils.formatDateTime(context, j, 524289);
        } else {
            str = "N/A";
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(A0k);
        A0r.append(" (Last sync at ");
        A0r.append(str);
        return AnonymousClass0wJ.A0u(A0r);
    }

    private final List getMediaInjectionOptions(FragmentActivity fragmentActivity, UserSession userSession, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C63613hu.A03(A0v, 2131825319);
        DevOptionsHelper.Companion.addMenuItem(userSession, A0v, AnonymousClass4MA.A00(new PublicDeveloperOptions$getMediaInjectionOptions$1(fragmentActivity, userSession), 2131825286), onPinnedDevOptionItemAdded);
        C63273h9.A02(A0v);
        return A0v;
    }

    /* access modifiers changed from: private */
    public final void openBloksFragment(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, int i) {
        C63743iE A02 = C63743iE.A02(str, AnonymousClass0wJ.A0y());
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        A0N.A0P = str2;
        A0N.A0S = fragmentActivity.getResources().getString(i);
        C63743iE.A07(fragmentActivity, A0N, A02);
    }

    /* access modifiers changed from: private */
    public final void showCasperResult(UserSession userSession, Context context, View view, long j) {
        AnonymousClass0wJ.A0F().post(new PublicDeveloperOptions$showCasperResult$1(context, j));
    }

    /* access modifiers changed from: private */
    public final void showQpIpOverrideDialog(Context context) {
        C09120et A0X = C18190wL.A0X();
        C41026Luf luf = new C41026Luf(context);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(context), (ViewGroup) null, R.layout.dev_text_input_dialog);
        C04220Ms.A06(A0H);
        IgEditText igEditText = (IgEditText) AnonymousClass0wJ.A0J(A0H, R.id.edit_text);
        AnonymousClass0ZU r1 = A0X.A1w.A00;
        if (!TextUtils.isEmpty((String) r1.invoke())) {
            igEditText.setText((String) r1.invoke());
        }
        igEditText.addTextChangedListener(new PublicDeveloperOptions$showQpIpOverrideDialog$1((TextView) AnonymousClass0wJ.A0J(A0H, R.id.description), context));
        luf.A07(A0H);
        luf.A02(2131825350);
        luf.A03(new PublicDeveloperOptions$showQpIpOverrideDialog$2(igEditText, A0X, context), 2131826219);
        C18250wR.A0u(luf);
    }

    public final void addOptions(Context context, List list, FragmentActivity fragmentActivity, UserSession userSession, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        AnonymousClass0wJ.A1N(context, list);
        AnonymousClass0wJ.A1Q(fragmentActivity, userSession);
        C04220Ms.A0B(onPinnedDevOptionItemAdded, 4);
        addMainOptions(context, list, fragmentActivity, userSession, onPinnedDevOptionItemAdded);
        addAnalytics(list, fragmentActivity, userSession, onPinnedDevOptionItemAdded);
        addZeroRating(context, list, fragmentActivity, userSession, onPinnedDevOptionItemAdded);
        addSections(context, list, fragmentActivity, userSession, onPinnedDevOptionItemAdded);
    }

    public final List addPinnedDevOptions(DeveloperOptionsFragment developerOptionsFragment, UserSession userSession) {
        AnonymousClass0wJ.A1N(developerOptionsFragment, userSession);
        return PinnedDeveloperOptionsUtil.getPinnedDevOptions(userSession, developerOptionsFragment, new PublicDeveloperOptions$addPinnedDevOptions$1(developerOptionsFragment));
    }

    private final void addMainOptions(Context context, List list, FragmentActivity fragmentActivity, UserSession userSession, DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        String str;
        String str2;
        DevOptionsHelper.Companion companion = DevOptionsHelper.Companion;
        List list2 = list;
        UserSession userSession2 = userSession;
        DevOptionsHelper.OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded2 = onPinnedDevOptionItemAdded;
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$1(context), 2131824993), onPinnedDevOptionItemAdded2);
        DeveloperOptionUtils.Companion companion2 = DeveloperOptionUtils.Companion;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        companion2.addSection(list2, new AppVersionOptions(context), userSession2, fragmentActivity2, onPinnedDevOptionItemAdded2);
        list2.addAll(getMediaInjectionOptions(fragmentActivity2, userSession2, onPinnedDevOptionItemAdded2));
        list2.addAll(getQuickExperimentOptions(context, fragmentActivity2, userSession2, onPinnedDevOptionItemAdded2));
        if (L.ig_android_event_debugger.instagram_android_event_debugger_ui.getAndExpose(userSession2).booleanValue()) {
            C63613hu.A04(list2, 2131825130);
            companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$2(fragmentActivity2, userSession2), 2131825134), onPinnedDevOptionItemAdded2);
        }
        if (isApplicationShortcutSupported(context)) {
            list2.addAll(getApplicationShortcutOptions(context, userSession2, onPinnedDevOptionItemAdded2));
        }
        C63613hu.A04(list2, 2131825204);
        Dialog sandboxDialog = SandboxUtil.getSandboxDialog(fragmentActivity2, userSession2, (List) null);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$3(fragmentActivity2, userSession2), 2131825488), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$4(sandboxDialog), 2131825035), list2);
        C63613hu.A04(list2, 2131825203);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$5(fragmentActivity2, userSession2), 2131825406), list2);
        C63613hu.A04(list2, 2131825264);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$6(userSession2, context), context.getString(2131825265)), list2);
        C63613hu.A04(list2, 2131825575);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$7(fragmentActivity2, userSession2), context.getString(2131825576)), list2);
        C63613hu.A04(list2, 2131825398);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$8(fragmentActivity2, userSession2), 2131825396), list2);
        C63613hu.A04(list2, 2131825384);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$9(fragmentActivity2, userSession2), 2131825580), list2);
        C63613hu.A04(list2, 2131824985);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$10(userSession2), 2131825407), list2);
        C63613hu.A04(list2, 2131825394);
        if (L.ig_dev_tool_launch.enabled.getAndExpose(userSession2).booleanValue()) {
            companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$11(context), "Quick Promotion Config"), onPinnedDevOptionItemAdded2);
        }
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$12(userSession2, context), 2131825471), onPinnedDevOptionItemAdded2);
        C36622Sa.A00();
        C04220Ms.A0B(userSession2, 0);
        ((InstagramQpSdkModule) userSession2.A01(InstagramQpSdkModule.class, new KtLambdaShape95S0100000_I2_75(userSession2, 14))).A03.getValue();
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(PublicDeveloperOptions$addMainOptions$13.INSTANCE, AnonymousClass00U.A0L("QP SDK Stats: ", AnonymousClass00U.A0L("Last Fetch ", "Never"))), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$14(fragmentActivity2, userSession2), 2131825581), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$15(fragmentActivity2), 2131825350), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$16(fragmentActivity2, userSession2), 2131825386), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$17(fragmentActivity2, userSession2), 2131825391), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$18(userSession2, context), 2131825472), list2);
        C63613hu.A04(list2, 2131825002);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$19(fragmentActivity2, userSession2), 2131825003), list2);
        C63613hu.A04(list2, 2131825364);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$20(context, userSession2), 2131825365), list2);
        C63613hu.A02("Session Survey Options", list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$21(userSession2, fragmentActivity2), 2131825536), list2);
        C63613hu.A02("Take a Break Nudge", list2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$22(userSession2, context), "Clear has seen Take a Break"), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$23(userSession2, context), "Set Take a Break upsell last seen time to two days ago"), list2);
        C63613hu.A02("Explore Controls", list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$24(userSession2, context), "Reset Multihide upsell seen"), list2);
        C63613hu.A02("Quiet Mode", list2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$25(userSession2, context), "Clear All Quiet Mode Upsell entries in NudgeTracker"), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$26(userSession2, context), "Quiet Mode - Toggle bypass upsell checks"), list2);
        C63613hu.A02("Alternate Topic Nudge", list2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$27(userSession2, context), "Add Alternative Topic Nudge entry to NudgeTracker"), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$28(userSession2, context), "Clear All Alternative Topic Nudge entries in NudgeTracker"), list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$29(userSession2, context), "Add old entries to AlternativeTopicNudge history"), list2);
        C63613hu.A04(list2, 2131825042);
        C63273h9.A03(list2);
        C63613hu.A04(list2, 2131825201);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$30(userSession2, context), 2131825431), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$31(userSession2, context), 2131825433), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$32(userSession2, context), 2131825432), list2);
        C63613hu.A02("Consent", list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$33(userSession2), "Launch Privacy Flow Trigger"), list2);
        C63613hu.A04(list2, 2131825197);
        C08380dH r5 = C09120et.A3D;
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$34.INSTANCE, 2131825184, AnonymousClass0wJ.A1V(r5.A00().A0u)), list2);
        C63613hu.A04(list2, 2131825337);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$35.INSTANCE, 2131825181, AnonymousClass0wJ.A1V(r5.A00().A0s)), list2);
        C63613hu.A04(list2, 2131825137);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$36(context), C18230wP.A0i(context)), onPinnedDevOptionItemAdded2);
        C63613hu.A04(list2, 2131825177);
        AnonymousClass3FH A0N = C18220wO.A0N(userSession2);
        if (A0N == null) {
            str = I17.A00(428);
        } else {
            str = A0N.A01;
        }
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$37(context, str), str), onPinnedDevOptionItemAdded2);
        if (C18200wM.A0C().getString("google_ad_id", (String) null) != null) {
            str2 = C18200wM.A0C().getString("google_ad_id", (String) null);
        } else {
            str2 = "None";
        }
        C63613hu.A04(list2, 2131824990);
        C04220Ms.A0A(str2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$38(context, str2), str2), list2);
        C63613hu.A04(list2, 2131825588);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01((View.OnClickListener) null, String.valueOf(C04000Lv.A00(context))), list2);
        C63613hu.A04(list2, 2131825291);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$40(context), 2131825297), list2);
        C63613hu.A04(list2, 2131825081);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$41(context), 2131825082), list2);
        AnonymousClass4MC.A08(PublicDeveloperOptions$addMainOptions$42.INSTANCE, list2, 2131825186, AnonymousClass0wJ.A1V(r5.A00().A13));
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(PublicDeveloperOptions$addMainOptions$43.INSTANCE, 2131825080), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(PublicDeveloperOptions$addMainOptions$44.INSTANCE, 2131825332), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(PublicDeveloperOptions$addMainOptions$45.INSTANCE, "Force native soft error"), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(PublicDeveloperOptions$addMainOptions$46.INSTANCE, 2131825348), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(PublicDeveloperOptions$addMainOptions$47.INSTANCE, 2131825331), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(PublicDeveloperOptions$addMainOptions$48.INSTANCE, 2131824984), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(PublicDeveloperOptions$addMainOptions$49.INSTANCE, 2131825324), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(PublicDeveloperOptions$addMainOptions$50.INSTANCE, 2131824992), list2);
        C63613hu.A04(list2, 2131825152);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$51(fragmentActivity2, userSession2), 2131825158), list2);
        C63613hu.A04(list2, 2131825362);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(new PublicDeveloperOptions$addMainOptions$52(context, fragmentActivity2), 2131825361, AnonymousClass0wJ.A1V(r5.A00().A2N)), list2);
        C63613hu.A04(list2, 2131825333);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$53(fragmentActivity2, userSession2), context.getString(2131825334)), list2);
        C63613hu.A04(list2, 2131825548);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$54(fragmentActivity2, userSession2), 2131825540), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$55(fragmentActivity2, userSession2), 2131825138), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$56(fragmentActivity2, userSession2), 2131825370), list2);
        C63613hu.A04(list2, 2131824967);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$57(context), context.getString(2131824957)), list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$58(fragmentActivity2, userSession2), context.getString(2131824955)), list2);
        C63613hu.A04(list2, 2131825285);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$59(fragmentActivity2, userSession2), context.getString(2131825272)), list2);
        C63613hu.A02("Memory", list2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(PublicDeveloperOptions$addMainOptions$60.INSTANCE, "Dump hprof and send it to Omura"), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$61(context), "Dump local hprof"), onPinnedDevOptionItemAdded2);
        companion2.addSection(list2, new AnonymousClass4BC(), userSession2, fragmentActivity2, onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(PublicDeveloperOptions$addMainOptions$62.INSTANCE, "Trim OnCloseToDalvikHeapLimit"), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(PublicDeveloperOptions$addMainOptions$63.INSTANCE, "Trim OnSystemMemoryCriticallyLowWhileAppInForeground"), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(PublicDeveloperOptions$addMainOptions$64.INSTANCE, "Trim OnSystemLowMemoryWhileAppInForeground"), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(PublicDeveloperOptions$addMainOptions$65.INSTANCE, "Trim OnSystemLowMemoryWhileAppInBackground"), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(PublicDeveloperOptions$addMainOptions$66.INSTANCE, "Trim OnAppBackgrounded"), list2);
        C63613hu.A02("Ingestion Pipeline Debug", list2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$67(fragmentActivity2, userSession2), "See PendingMedia Debug Logs"), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$68(fragmentActivity2, userSession2, context), "Stop All Uploads"), onPinnedDevOptionItemAdded2);
        C63613hu.A02("UI Debug", list2);
        if (AnonymousClass2B9.A00) {
            companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$69(fragmentActivity2, userSession2), 2131833836), onPinnedDevOptionItemAdded2);
        }
        companion.addSwitchItem(userSession2, list2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$70.INSTANCE, 2131822287, AnonymousClass3LW.A01()), onPinnedDevOptionItemAdded2);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$71.INSTANCE, 2131822286, AnonymousClass3LW.A00()), list2);
        C81704oE r7 = AnonymousClass31S.A00;
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(new PublicDeveloperOptions$addMainOptions$72(r7), 2131827425, C08340dC.A01("LithoFeedDebugConfigurations").getBoolean("main_thread_render_detector", false)), list2);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(new PublicDeveloperOptions$addMainOptions$73(r7), 2131827426, C08340dC.A01("LithoFeedDebugConfigurations").getBoolean("mount_time_debug_detector_enabled", false)), list2);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(new PublicDeveloperOptions$addMainOptions$74(r7), 2131827427, C08340dC.A01("LithoFeedDebugConfigurations").getBoolean("litho_view_debug_overlay", false)), list2);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$75.INSTANCE, 2131834535, AnonymousClass0wJ.A1V(r5.A00().A2A)), list2);
        AnonymousClass4MC.A08(PublicDeveloperOptions$addMainOptions$76.INSTANCE, list2, 2131834442, AnonymousClass0wJ.A1V(r5.A00().A09));
        C63273h9.A03(list2);
        C63613hu.A02("Feed Media Debug Info", list2);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$77.INSTANCE, 2131825167, AnonymousClass0wJ.A1V(r5.A00().A0k)), list2);
        C63613hu.A04(list2, 2131824196);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$78(fragmentActivity2, userSession2), 2131835932), list2);
        C63613hu.A02("Bloks", list2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$79(fragmentActivity2, userSession2), 2131822386), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$80(fragmentActivity2, userSession2), 2131822388), onPinnedDevOptionItemAdded2);
        GHO A00 = C60833Qr.A00(context);
        C04220Ms.A06(A00);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(new PublicDeveloperOptions$addMainOptions$81(new AnonymousClass32H(A00)), 2131822381, false), list2);
        C63613hu.A02("Admin", list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$82(fragmentActivity2, userSession2), 2131821192), list2);
        C63613hu.A04(list2, 2131825383);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$83.INSTANCE, 2131825382, AnonymousClass0wJ.A1V(r5.A00().A1M)), list2);
        C63613hu.A04(list2, 2131825027);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01((View.OnClickListener) null, AnonymousClass3RL.A00(context)), onPinnedDevOptionItemAdded2);
        companion.addSwitchItem(userSession2, list2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$84.INSTANCE, 2131825206, AnonymousClass0wJ.A1V(r5.A00().A24)), onPinnedDevOptionItemAdded2);
        companion.addSwitchItem(userSession2, list2, new AnonymousClass4MC((CompoundButton.OnCheckedChangeListener) PublicDeveloperOptions$addMainOptions$85.INSTANCE, (CharSequence) "Debug IAW Autofill", AnonymousClass0wJ.A1V(r5.A00().A23)), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$86(fragmentActivity2), 2131834022), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$87(userSession2, fragmentActivity2), 2131834024), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$88(userSession2, fragmentActivity2), 2131834025), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$89(fragmentActivity2), 2131834008), onPinnedDevOptionItemAdded2);
        companion.addSwitchItem(userSession2, list2, AnonymousClass4MC.A03(new PublicDeveloperOptions$addMainOptions$90(context, fragmentActivity2, userSession2), 2131825549, r5.A00().A0S()), onPinnedDevOptionItemAdded2);
        if (r5.A00().A0S()) {
            companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(PublicDeveloperOptions$addMainOptions$91.INSTANCE, 2131835950), onPinnedDevOptionItemAdded2);
        }
        C63273h9.A03(list2);
        C63613hu.A04(list2, 2131825587);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$92(userSession2, context), 2131825473), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$93(userSession2, context), 2131825450), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$94(userSession2, context), 2131825475), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$95(userSession2, context), 2131825446), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$96(userSession2, context), 2131825481), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$97(userSession2, context), 2131825448), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$98(userSession2, context), 2131825309), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$99(userSession2, context), 2131825305), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$100(userSession2, context), 2131825307), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$101(userSession2, context), "Reset Custom comment filter upsell count"), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$102(userSession2, context), "Reset Custom Comment filter upsell timestamp"), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$103(userSession2, context), 2131825351), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$104(userSession2, context), 2131825424), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$105(userSession2, context), 2131825477), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$106(userSession2, context), 2131825455), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$107(userSession2, context), 2131825438), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$108(userSession2, context), 2131825412), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$109(userSession2, context), 2131825451), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$110(userSession2, context), 2131825467), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$111(userSession2, context), 2131825414), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$112(userSession2, context), 2131825416), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$113(userSession2, context), 2131825442), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$114(userSession2, context), 2131825459), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$115(userSession2, context), 2131825420), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$116(userSession2, context), 2131825408), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$117(userSession2, context), 2131825422), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$118(userSession2, context), 2131825410), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$119(userSession2, context), 2131825418), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$120(context), 2131825457), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$121(context), 2131825453), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$122(userSession2, context), 2131825465), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$123(userSession2, context), 2131825461), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$124(userSession2, context), 2131825463), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$125(userSession2, context), 2131825469), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$126(userSession2, context), 2131825043), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$127(userSession2, context), 2131825429), onPinnedDevOptionItemAdded2);
        companion.addSwitchItem(userSession2, list2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$128.INSTANCE, 2131825267, C18200wM.A0C().getBoolean("show_internal_badge", true)), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$129(context, userSession2, fragmentActivity2), 2131825266), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$130(fragmentActivity2, userSession2), 2131825550), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$131(userSession2, fragmentActivity2), 2131825565), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$132(userSession2), 2131825564), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$133(userSession2), 2131825538), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$134(userSession2), 2131825195), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$135(userSession2, context), 2131825483), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$136(userSession2, context), 2131825038), onPinnedDevOptionItemAdded2);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$137.INSTANCE, 2131825185, AnonymousClass0wJ.A1V(r5.A00().A12)), list2);
        C63613hu.A04(list2, 2131825223);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$138(context, userSession2), context.getString(2131825224)), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$139(userSession2, context), context.getString(2131825222)), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, PublicDeveloperOptions$addMainOptions$141.INSTANCE, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$140(userSession2, fragmentActivity2), 2131825225), list2);
        C63613hu.A04(list2, 2131825190);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$142(userSession2, context), 2131825444), list2);
        C63613hu.A04(list2, 2131825191);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$143(fragmentActivity2, userSession2), 2131825194), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$144(fragmentActivity2, userSession2), 2131825192), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$145(fragmentActivity2, userSession2), 2131825193), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$146(fragmentActivity2, userSession2), 2131827806), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$147(fragmentActivity2, userSession2), 2131827788), list2);
        C63613hu.A02("Events", list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$148(fragmentActivity2, userSession2), "View Event Details"), list2);
        C63613hu.A04(list2, 2131825526);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$149(fragmentActivity2, userSession2), context.getString(2131825528)), list2);
        addMobileBoost(userSession2, list2, context, onPinnedDevOptionItemAdded2);
        C63273h9.A03(list2);
        C63613hu.A04(list2, 2131825029);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$150.INSTANCE, 2131825028, AnonymousClass0wJ.A1V(r5.A00().A25)), list2);
        C63613hu.A04(list2, 2131825240);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$151(fragmentActivity2, userSession2), 2131828635), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$152(fragmentActivity2, userSession2), 2131828629), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$153(fragmentActivity2, userSession2), context.getString(2131825257)), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$154(fragmentActivity2, userSession2), context.getString(2131825232)), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$155(fragmentActivity2, userSession2), 2131824986), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$156(fragmentActivity2, userSession2), 2131824987), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$157(userSession2, context), context.getString(2131824979)), onPinnedDevOptionItemAdded2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$158(userSession2, context), context.getString(2131824980)), onPinnedDevOptionItemAdded2);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$159.INSTANCE, 2131825024, AnonymousClass0wJ.A1V(r5.A00().A18)), list2);
        C63613hu.A04(list2, 2131825554);
        companion.addSwitchItem(userSession2, list2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$160.INSTANCE, 2131825556, AnonymousClass0wJ.A1V(r5.A00().A1S)), onPinnedDevOptionItemAdded2);
        companion.addSwitchItem(userSession2, list2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$161.INSTANCE, 2131825553, AnonymousClass0wJ.A1V(r5.A00().A1Q)), onPinnedDevOptionItemAdded2);
        companion.addSwitchItem(userSession2, list2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$162.INSTANCE, 2131825552, AnonymousClass0wJ.A1V(r5.A00().A1P)), onPinnedDevOptionItemAdded2);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$163.INSTANCE, 2131825555, AnonymousClass0wJ.A1V(r5.A00().A1R)), list2);
        addInteropSwitchItem(list2, context, userSession2, onPinnedDevOptionItemAdded2);
        C63273h9.A03(list2);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$164.INSTANCE, 2131825567, AnonymousClass0wJ.A1V(r5.A00().A1W)), list2);
        C63273h9.A01(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MC.A03(PublicDeveloperOptions$addMainOptions$165.INSTANCE, 2131825568, AnonymousClass0wJ.A1V(r5.A00().A1X)), list2);
        C63613hu.A04(list2, 2131825395);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$166(userSession2, context), 2131834049), list2);
        C63613hu.A04(list2, 2131825178);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$167(fragmentActivity2, userSession2), context.getString(2131825338)), list2);
        C63273h9.A03(list2);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$168(fragmentActivity2, userSession2), context.getString(2131825136)), onPinnedDevOptionItemAdded2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$169(fragmentActivity2, userSession2), context.getString(2131825557)), list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$170(fragmentActivity2, userSession2), context.getString(2131825007)), list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$171(fragmentActivity2, userSession2), context.getString(2131825311)), list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$172(fragmentActivity2, userSession2), 2131825099), list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$173(fragmentActivity2, userSession2), 2131825100), list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$174(userSession2, fragmentActivity2), 2131825400), list2);
        C63613hu.A04(list2, 2131825045);
        companion.addMenuItem(userSession2, list2, AnonymousClass4MA.A00(new PublicDeveloperOptions$addMainOptions$175(fragmentActivity2, userSession2), 2131825573), onPinnedDevOptionItemAdded2);
        C63613hu.A04(list2, 2131825101);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$176(fragmentActivity2, userSession2), context.getString(2131825103)), list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$177(fragmentActivity2, userSession2), context.getString(2131825102)), list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$178(fragmentActivity2, userSession2), context.getString(2131825108)), list2);
        C63273h9.A00(companion, onPinnedDevOptionItemAdded2, userSession2, AnonymousClass4MA.A01(new PublicDeveloperOptions$addMainOptions$179(fragmentActivity2, userSession2), context.getString(2131824978)), list2);
    }
}
