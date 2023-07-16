package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.AnonymousClass3W9;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C06750aI;
import X.C14030oh;
import X.C146958n9;
import X.C18180wK;
import X.C18250wR;
import X.C25237DiI;
import X.C27952Ew2;
import X.C34640IcN;
import X.C82034oy;
import X.C83224qz;
import X.C84874u0;
import X.C86124wJ;
import X.E5N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.dcp.model.DcpContext;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class LocalNotifsTestFragment extends C34640IcN implements C82034oy {
    public final C83224qz coroutineScope;
    public final C84874u0 dispatcherProvider;
    public IgButton predictionButton;
    public IgTextView resultTextView;
    public IgButton trainingButton;
    public final C04530Oa userSession$delegate = AnonymousClass3W9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825119);
    }

    public String getModuleName() {
        return "device_compute_platform";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.predictionButton = (IgButton) AnonymousClass0wJ.A0J(view, R.id.prediction_button);
        this.trainingButton = (IgButton) AnonymousClass0wJ.A0J(view, R.id.training_button);
        this.resultTextView = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.result_text);
        List A17 = C06750aI.A17(new DcpContext((String) null, C86124wJ.A0z(C18180wK.A0p("3339", 500L)), C86124wJ.A0z(C18180wK.A0p("2476", "11609492270")), 11), new DcpContext((String) null, C86124wJ.A0z(C18180wK.A0p("3339", 500L)), C86124wJ.A0z(C18180wK.A0p("2476", "52597046526")), 11));
        IgButton igButton = this.predictionButton;
        if (igButton == null) {
            C04220Ms.A0E("predictionButton");
            throw null;
        }
        igButton.setOnClickListener(new LocalNotifsTestFragment$onViewCreated$1(this, A17));
        IgButton igButton2 = this.trainingButton;
        if (igButton2 == null) {
            C04220Ms.A0E("trainingButton");
            throw null;
        } else {
            igButton2.setOnClickListener(new LocalNotifsTestFragment$onViewCreated$2(this, A17));
        }
    }

    /* access modifiers changed from: private */
    public final void doPrediction(List list) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new LocalNotifsTestFragment$doPrediction$1(this, list, (C146958n9) null), this.coroutineScope, 3);
    }

    /* access modifiers changed from: private */
    public final void doTraining(DcpContext dcpContext) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new LocalNotifsTestFragment$doTraining$1(this, dcpContext, (C146958n9) null), this.coroutineScope, 3);
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public LocalNotifsTestFragment() {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        this.dispatcherProvider = A0J;
        this.coroutineScope = C84874u0.A00(A0J, 675609327, 3);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1971635119);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_dcp_local_notifs, viewGroup, false);
        C14030oh.A09(201776642, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
