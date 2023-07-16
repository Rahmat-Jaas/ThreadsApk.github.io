package com.instagram.debug.devoptions.api;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.C12560m7;
import X.C18180wK;
import X.C18230wP;
import X.C18240wQ;
import X.C28979FfK;
import X.C36813Jf5;
import X.C37200JmN;
import X.C39690KyC;
import X.C63813iO;
import X.C63863iT;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.endtoend.EndToEnd;
import com.instagram.debug.devoptions.DeveloperOptionsFragment;
import com.instagram.debug.devoptions.HomeDeliveryDebugToolFragment;
import com.instagram.debug.devoptions.InjectMediaToolFragment;
import com.instagram.debug.devoptions.PanavisionExperimentSwitcherToolFragment;
import com.instagram.debug.devoptions.StoriesExperimentSwitcherToolFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class DeveloperOptionsLauncher {
    public static final String DEV_OPTIONS_PLUGIN_IMPL = "com.instagram.debug.devoptions.DeveloperOptionsPluginImpl";

    public static /* synthetic */ Fragment lambda$launchHomeDeliveryDebugTool$3() {
        return new HomeDeliveryDebugToolFragment();
    }

    public static /* synthetic */ Fragment lambda$launchMediaInjectionTool$0() {
        return new InjectMediaToolFragment();
    }

    public static /* synthetic */ Fragment lambda$launchPanavisionExperimentSwitcherTool$1() {
        return new PanavisionExperimentSwitcherToolFragment();
    }

    public static /* synthetic */ Fragment lambda$launchStoriesExperimentSwitcherTool$2() {
        return new StoriesExperimentSwitcherToolFragment();
    }

    public static /* synthetic */ Fragment lambda$loadAndLaunchDeveloperOptions$4() {
        return new DeveloperOptionsFragment();
    }

    public static void launchDirectInboxV2ExperimentSwitcherTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        launchDeveloperOptionModalActivity(context, fragmentActivity, userSession, "direct_inbox_experiment_switcher");
    }

    public static void launchHomeDeliveryDebugTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, (C12560m7) null, fragmentActivity, userSession, DeveloperOptionsLauncher$$ExternalSyntheticLambda0.INSTANCE);
    }

    public static void launchMediaInjectionTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, (C12560m7) null, fragmentActivity, userSession, DeveloperOptionsLauncher$$ExternalSyntheticLambda1.INSTANCE);
    }

    public static void launchPanavisionExperimentSwitcherTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, (C12560m7) null, fragmentActivity, userSession, DeveloperOptionsLauncher$$ExternalSyntheticLambda2.INSTANCE);
    }

    public static void launchStoriesExperimentSwitcherTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, (C12560m7) null, fragmentActivity, userSession, DeveloperOptionsLauncher$$ExternalSyntheticLambda3.INSTANCE);
    }

    public static void loadAndLaunchDeveloperOptions(Context context, C12560m7 r2, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, r2, fragmentActivity, userSession, DeveloperOptionsLauncher$$ExternalSyntheticLambda4.INSTANCE);
    }

    public static void launchDeveloperOptionModalActivity(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str) {
        if (EndToEnd.A04()) {
            C63813iO.A0A(context, 2131825336, 1);
            return;
        }
        try {
            DeveloperOptionsPlugin.sInstance = (DeveloperOptionsPlugin) C18230wP.A0g(DEV_OPTIONS_PLUGIN_IMPL);
            C63863iT.A09(fragmentActivity, C18180wK.A06(), userSession, ModalActivity.class, str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void loadAndLaunchDeveloperOption(final Context context, C12560m7 r7, final FragmentActivity fragmentActivity, final UserSession userSession, final Callable callable) {
        if (EndToEnd.A04()) {
            C63813iO.A0A(context, 2131825336, 1);
            return;
        }
        C12560m7 r5 = null;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C18240wQ.A1Q(A0v, new C28979FfK[]{C28979FfK.DEVELOPER_OPTIONS});
        Integer num = AnonymousClass006.A00;
        AnonymousClass1 r2 = new C39690KyC() {
            public void onFailure(String str) {
                C63813iO.A0A(context, 2131825166, 1);
            }

            public void onSuccess() {
                try {
                    DeveloperOptionsPlugin.sInstance = (DeveloperOptionsPlugin) C18230wP.A0g(DeveloperOptionsLauncher.DEV_OPTIONS_PLUGIN_IMPL);
                    Fragment fragment = (Fragment) callable.call();
                    if (fragment != null) {
                        AnonymousClass0wJ.A19(fragment, fragmentActivity, userSession);
                        return;
                    }
                    throw new NullPointerException();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
        if (r7 != null) {
            r5 = r7;
        }
        C37200JmN.A00().A02(userSession, new C36813Jf5(r5, r2, num, A0v));
    }
}
