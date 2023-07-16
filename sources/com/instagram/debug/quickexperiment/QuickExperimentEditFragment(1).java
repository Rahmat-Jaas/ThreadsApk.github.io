package com.instagram.debug.quickexperiment;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C07950cU;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C23411dm;
import X.C40290Lbt;
import X.C82034oy;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuickExperimentEditFragment extends C23411dm implements C82034oy {
    public ExperimentParameterListGenerator mExperimentParameterListGenerator;
    public UserSession mSession;
    public String mTitle;

    public interface ExperimentParameterListGenerator {
        List createList(Context context);
    }

    public String getModuleName() {
        return "quick_experiment_edit";
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        List createList = this.mExperimentParameterListGenerator.createList(getContext());
        Collections.sort(createList, new Comparator() {
            public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return C18190wL.A06((C07950cU) obj, (C07950cU) obj2);
            }

            public int compare(C07950cU r2, C07950cU r3) {
                return C18190wL.A06(r2, r3);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity != null) {
            QuickExperimentEditAdapter quickExperimentEditAdapter = new QuickExperimentEditAdapter(activity);
            getScrollingViewProxy().ChZ(quickExperimentEditAdapter);
            quickExperimentEditAdapter.setMenuItemList(QuickExperimentHelper.setupMenuItems(this, this.mSession, createList, quickExperimentEditAdapter, false, true));
        }
    }

    public static QuickExperimentEditFragment createForAllOverrides(final UserSession userSession) {
        return new QuickExperimentEditFragment("Quick Experiments: Overrides", new ExperimentParameterListGenerator() {
            public List createList(Context context) {
                return QuickExperimentHelper.getOverriddenExperimentParameters(QuickExperimentDebugStoreManager.getOverrideStore(UserSession.this));
            }
        });
    }

    public static QuickExperimentEditFragment createWithExperimentCategory(final C40290Lbt lbt) {
        return new QuickExperimentEditFragment(AnonymousClass00U.A0L("Quick Experiments: ", lbt.A01), new ExperimentParameterListGenerator() {
            public List createList(Context context) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                for (C07950cU r2 : QuickExperimentHelper.getAllExperiments()) {
                    if (QuickExperimentHelper.getCategory(r2) == C40290Lbt.this && !OverlayConfigHelper.isOverlayConfig(r2)) {
                        A0v.add(r2);
                    }
                }
                return A0v;
            }
        });
    }

    public static QuickExperimentEditFragment createWithUniverse(final String str) {
        return new QuickExperimentEditFragment("Quick Experiments: Launcher", new ExperimentParameterListGenerator() {
            public List createList(Context context) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                for (C07950cU r2 : QuickExperimentHelper.getAllExperiments()) {
                    if (str.equals(r2.mUniverseName) && !OverlayConfigHelper.isOverlayConfig(r2)) {
                        A0v.add(r2);
                    }
                }
                return A0v;
            }
        });
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        r2.setTitle(this.mTitle);
        r2.CtT(C18180wK.A1X(this.mFragmentManager.A0I()));
    }

    public C10300i6 getSession() {
        return this.mSession;
    }

    public QuickExperimentEditFragment(String str, ExperimentParameterListGenerator experimentParameterListGenerator) {
        this.mTitle = str;
        this.mExperimentParameterListGenerator = experimentParameterListGenerator;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1234508333);
        super.onCreate(bundle);
        this.mSession = C18180wK.A0V(this.mArguments);
        C14030oh.A09(1802868018, A02);
    }
}
