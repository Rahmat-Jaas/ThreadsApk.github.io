package com.instagram.debug.devoptions;

import X.AnonymousClass0MZ;
import X.AnonymousClass0wJ;
import X.AnonymousClass36P;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C23411dm;
import X.C40877Lpc;
import X.C41026Luf;
import X.C63273h9;
import X.C63613hu;
import X.C80644m9;
import X.C82034oy;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.debug.devoptions.PanavisionDevUtil;
import com.instagram.debug.devoptions.refresh.AppRestartUtil;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PanavisionExperimentSwitcherToolFragment extends C23411dm implements C82034oy {
    public PanavisionDevUtil panavisionDevUtil;
    public QuickExperimentDebugStore quickExperimentDebugStore;
    public boolean settingChanged;
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, "Panavision Experiment Switcher");
    }

    public String getModuleName() {
        return "feed_experiment_switcher_tool";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        refreshMenuItems();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.4MC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.3Xk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.4MC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.4MC} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (r6 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        if (r6 != false) goto L_0x008a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void addItems(java.util.ArrayList r9, com.instagram.debug.devoptions.PanavisionDevUtil.ExperimentSeries r10) {
        /*
            r8 = this;
            com.instagram.debug.devoptions.PanavisionDevUtil r0 = r8.panavisionDevUtil
            java.lang.String r7 = "panavisionDevUtil"
            if (r0 == 0) goto L_0x0095
            java.util.List r1 = r0.getExperiments(r10)
            com.instagram.debug.devoptions.PanavisionDevUtil$ExperimentSeries r0 = com.instagram.debug.devoptions.PanavisionDevUtil.ExperimentSeries.NAV3
            boolean r6 = X.C18180wK.A1Z(r10, r0)
            java.util.Iterator r5 = r1.iterator()
        L_0x0014:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0094
            java.lang.Object r4 = r5.next()
            com.instagram.debug.devoptions.FeatureExperiment r4 = (com.instagram.debug.devoptions.FeatureExperiment) r4
            boolean r0 = r4 instanceof com.instagram.debug.devoptions.Nav3Experiment
            if (r0 != 0) goto L_0x008e
            boolean r0 = r4 instanceof com.instagram.debug.devoptions.MultiChoiceFeatureExperiment
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = r4.getHumanName()
            com.instagram.debug.devoptions.PanavisionExperimentSwitcherToolFragment$addItems$item$1 r0 = new com.instagram.debug.devoptions.PanavisionExperimentSwitcherToolFragment$addItems$item$1
            r0.<init>(r8, r4)
            X.3Xk r3 = new X.3Xk
            r3.<init>((java.lang.CharSequence) r1, (android.view.View.OnClickListener) r0)
            com.instagram.debug.devoptions.MultiChoiceFeatureExperiment r4 = (com.instagram.debug.devoptions.MultiChoiceFeatureExperiment) r4
            java.lang.String r0 = r4.getHumanValue()
            r3.A04 = r0
            com.instagram.debug.devoptions.PanavisionDevUtil r0 = r8.panavisionDevUtil
            if (r0 == 0) goto L_0x0095
            boolean r0 = r0.isSandboxOn()
            if (r0 != 0) goto L_0x004b
            r0 = 1
            if (r6 == 0) goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r3.A07 = r0
            r0 = 1
            r3.A08 = r0
        L_0x0051:
            r9.add(r3)
            goto L_0x0014
        L_0x0055:
            boolean r0 = r4 instanceof com.instagram.debug.devoptions.UserPreferenceBooleanFeatureExperiment
            if (r0 != 0) goto L_0x0062
            boolean r0 = r4 instanceof com.instagram.debug.devoptions.BooleanFeatureExperiment
            if (r0 != 0) goto L_0x0062
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x0062:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.debug.devoptions.FeatureExperiment<kotlin.Boolean>"
            X.C04220Ms.A0C(r4, r0)
            java.lang.String r2 = r4.getHumanName()
            java.lang.Object r0 = r4.getHumanValue()
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            com.instagram.debug.devoptions.PanavisionExperimentSwitcherToolFragment$addItems$item$3 r0 = new com.instagram.debug.devoptions.PanavisionExperimentSwitcherToolFragment$addItems$item$3
            r0.<init>(r4, r8)
            X.4MC r3 = new X.4MC
            r3.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r0, (java.lang.CharSequence) r2, (boolean) r1)
            com.instagram.debug.devoptions.PanavisionDevUtil r0 = r8.panavisionDevUtil
            if (r0 == 0) goto L_0x0095
            boolean r0 = r0.isSandboxOn()
            if (r0 != 0) goto L_0x008a
            r0 = 1
            if (r6 == 0) goto L_0x008b
        L_0x008a:
            r0 = 0
        L_0x008b:
            r3.A0E = r0
            goto L_0x0051
        L_0x008e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0094:
            return
        L_0x0095:
            X.C04220Ms.A0E(r7)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.PanavisionExperimentSwitcherToolFragment.addItems(java.util.ArrayList, com.instagram.debug.devoptions.PanavisionDevUtil$ExperimentSeries):void");
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void resetAllParamsToDefault() {
        PanavisionDevUtil panavisionDevUtil2 = this.panavisionDevUtil;
        if (panavisionDevUtil2 == null) {
            C04220Ms.A0E("panavisionDevUtil");
            throw null;
        } else {
            panavisionDevUtil2.resetAllParamsToDefault();
        }
    }

    /* access modifiers changed from: private */
    public final void selectExperiment(int i, MultiChoiceFeatureExperiment multiChoiceFeatureExperiment, boolean z) {
        multiChoiceFeatureExperiment.setExperiment(((FeatureExperiment) multiChoiceFeatureExperiment.rootExperiments.get(i)).getName());
        if (!z) {
            this.settingChanged = true;
            refreshMenuItems();
            return;
        }
        resetApp();
    }

    /* access modifiers changed from: private */
    public final void showExperimentSelectorDialog(MultiChoiceFeatureExperiment multiChoiceFeatureExperiment) {
        Iterator it = multiChoiceFeatureExperiment.rootExperiments.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (AnonymousClass0wJ.A1X(((FeatureExperiment) it.next()).getHumanValue())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        AnonymousClass0MZ r3 = new AnonymousClass0MZ();
        r3.A00 = i;
        Context context = getContext();
        if (context != null) {
            C41026Luf luf = new C41026Luf(context);
            luf.A08("Select Panavision experiment");
            C40877Lpc lpc = luf.A01;
            List<FeatureExperiment> list = multiChoiceFeatureExperiment.rootExperiments;
            ArrayList A0w = AnonymousClass0wJ.A0w(list);
            for (FeatureExperiment humanName : list) {
                A0w.add(humanName.getHumanName());
            }
            luf.A06(new PanavisionExperimentSwitcherToolFragment$showExperimentSelectorDialog$1$2(r3), (CharSequence[]) A0w.toArray(new String[0]), i);
            PanavisionExperimentSwitcherToolFragment$showExperimentSelectorDialog$1$3 panavisionExperimentSwitcherToolFragment$showExperimentSelectorDialog$1$3 = PanavisionExperimentSwitcherToolFragment$showExperimentSelectorDialog$1$3.INSTANCE;
            lpc.A0E = "Cancel";
            lpc.A02 = panavisionExperimentSwitcherToolFragment$showExperimentSelectorDialog$1$3;
            luf.A04(new PanavisionExperimentSwitcherToolFragment$showExperimentSelectorDialog$1$4(this, r3, multiChoiceFeatureExperiment), "Select");
            luf.A05(new PanavisionExperimentSwitcherToolFragment$showExperimentSelectorDialog$1$5(this, r3, multiChoiceFeatureExperiment), "Select & Restart");
            luf.A01();
        }
    }

    private final List getMenuItems() {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass4MA.A02(new PanavisionExperimentSwitcherToolFragment$getMenuItems$1(this), "Click to remove Panavision client Overrides", A0v);
        A0v.add(new AnonymousClass36P(new PanavisionExperimentSwitcherToolFragment$getMenuItems$2(this)));
        A0v.add(new C63273h9(false));
        C63613hu.A01("Immersive Feed", A0v);
        PanavisionDevUtil panavisionDevUtil2 = this.panavisionDevUtil;
        if (panavisionDevUtil2 == null) {
            C04220Ms.A0E("panavisionDevUtil");
            throw null;
        }
        C23411dm.A03(new PanavisionExperimentSwitcherToolFragment$getMenuItems$3(this), "Immersive Feed (Sandbox)", "Turn off to opt out", A0v, panavisionDevUtil2.isSandboxOn());
        A0v.add(new C63273h9(false));
        C63613hu.A01("General", A0v);
        addItems(A0v, PanavisionDevUtil.ExperimentSeries.GENERAL_FEATURES);
        A0v.add(new C63273h9(false));
        C63613hu.A01("Post Design", A0v);
        addItems(A0v, PanavisionDevUtil.ExperimentSeries.POST_DESIGN);
        A0v.add(new C63273h9(false));
        A0v.add(new C63613hu("Nav 3", "varients of tab and actionbar buttons", (CharSequence) null));
        addItems(A0v, PanavisionDevUtil.ExperimentSeries.NAV3);
        A0v.add(new C63273h9(false));
        C63613hu.A01("Performance tests", A0v);
        addItems(A0v, PanavisionDevUtil.ExperimentSeries.PERF);
        return A0v;
    }

    /* access modifiers changed from: private */
    public final void refreshMenuItems() {
        setItems(getMenuItems());
    }

    /* access modifiers changed from: private */
    public final void resetApp() {
        Context context = getContext();
        if (context != null) {
            AppRestartUtil.restartApp(context);
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-464786285);
        super.onCreate(bundle);
        this.quickExperimentDebugStore = QuickExperimentDebugStoreManager.getOverrideStore(AnonymousClass0wJ.A0X(this.userSession$delegate));
        PanavisionDevUtil.Companion companion = PanavisionDevUtil.Companion;
        UserSession A0X = AnonymousClass0wJ.A0X(this.userSession$delegate);
        QuickExperimentDebugStore quickExperimentDebugStore2 = this.quickExperimentDebugStore;
        if (quickExperimentDebugStore2 == null) {
            C04220Ms.A0E("quickExperimentDebugStore");
            throw null;
        }
        this.panavisionDevUtil = companion.getInstance(A0X, quickExperimentDebugStore2);
        C14030oh.A09(-241201513, A02);
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
