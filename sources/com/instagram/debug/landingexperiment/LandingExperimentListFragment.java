package com.instagram.debug.landingexperiment;

import X.AnonymousClass0wJ;
import X.AnonymousClass3R8;
import X.AnonymousClass3YK;
import X.AnonymousClass4MA;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C14030oh;
import X.C18190wL;
import X.C18200wM;
import X.C23411dm;
import X.C24;
import X.C60913Rb;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.dextricks.Constants;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;

public final class LandingExperimentListFragment extends C23411dm implements C82034oy {
    public final String SELECTED_LANDING_EXPERIMENT = "selected_landing_experiment";
    public LandingExperimentListAdapter adapter;
    public ArrayList landingExperimentList = AnonymousClass0wJ.A0v();
    public final C04530Oa userSession$delegate = C80644m9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A08(r2, "Landing Experiments");
    }

    public String getModuleName() {
        return "landing_experiment_list";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18200wM.A0H(this).setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        C24 scrollingViewProxy = getScrollingViewProxy();
        LandingExperimentListAdapter landingExperimentListAdapter = this.adapter;
        if (landingExperimentListAdapter != null) {
            scrollingViewProxy.ChZ(landingExperimentListAdapter);
            LandingExperimentListAdapter landingExperimentListAdapter2 = this.adapter;
            if (landingExperimentListAdapter2 != null) {
                landingExperimentListAdapter2.setMenuItemList(this.landingExperimentList);
                return;
            }
        }
        C04220Ms.A0E("adapter");
        throw null;
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1989817116);
        super.onCreate(bundle);
        this.adapter = new LandingExperimentListAdapter(requireContext());
        AnonymousClass3R8.A00(C18190wL.A09(this));
        for (AnonymousClass3YK r3 : (Collection) C60913Rb.A02.getValue()) {
            ArrayList arrayList = this.landingExperimentList;
            AnonymousClass4MA.A02(new LandingExperimentListFragment$onCreate$1(this, r3), r3.A09, arrayList);
        }
        C14030oh.A09(125625153, A02);
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
