package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0N8;
import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.AnonymousClass3W9;
import X.AnonymousClass3WK;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C06750aI;
import X.C112076ox;
import X.C112086oy;
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
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgRadioButton;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GraphQLTestFragment extends C34640IcN implements C82034oy {
    public static final Companion Companion = new Companion();
    public static final String TAG = AnonymousClass0N8.A00(GraphQLTestFragment.class);
    public IgButton callButton;
    public final C83224qz coroutineScope;
    public final C84874u0 dispatcherProvider;
    public IgRadioButton featuresApiRadio;
    public IgRadioButton metadataApiRadio;
    public IgEditText purposeInput;
    public IgTextView resultText;
    public IgEditText useCaseInput;
    public final C04530Oa userSession$delegate = AnonymousClass3W9.A00(this);
    public IgEditText versionInput;

    /* access modifiers changed from: private */
    public final void featuresApiCall(String str, String str2, String str3) {
        C112076ox r8 = new C112076ox(requireContext(), AnonymousClass3WK.A01(AnonymousClass0wJ.A0X(this.userSession$delegate)));
        List A17 = C06750aI.A17(new DcpContext((String) null, C86124wJ.A0z(C18180wK.A0p("3339", 500L)), C86124wJ.A0z(C18180wK.A0p("2476", "11609492270")), 11), new DcpContext((String) null, C86124wJ.A0z(C18180wK.A0p("3339", 500L)), C86124wJ.A0z(C18180wK.A0p("2476", "52597046526")), 11));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new GraphQLTestFragment$featuresApiCall$1(r8, str, str2, str3, A17, this, (C146958n9) null), this.coroutineScope, 3);
    }

    /* access modifiers changed from: private */
    public final void metadataApiCall(String str, String str2) {
        C112086oy r3 = new C112086oy(requireContext(), AnonymousClass3WK.A01(AnonymousClass0wJ.A0X(this.userSession$delegate)));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new GraphQLTestFragment$metadataApiCall$1(r3, str, str2, this, (C146958n9) null), this.coroutineScope, 3);
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825109);
    }

    public String getModuleName() {
        return "device_compute_platform";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.useCaseInput = (IgEditText) AnonymousClass0wJ.A0J(view, R.id.use_case_input);
        this.versionInput = (IgEditText) AnonymousClass0wJ.A0J(view, R.id.version_input);
        this.purposeInput = (IgEditText) AnonymousClass0wJ.A0J(view, R.id.purpose_input);
        this.callButton = (IgButton) AnonymousClass0wJ.A0J(view, R.id.run_button);
        this.metadataApiRadio = (IgRadioButton) AnonymousClass0wJ.A0J(view, R.id.metadata_api);
        this.featuresApiRadio = (IgRadioButton) AnonymousClass0wJ.A0J(view, R.id.features_api);
        this.resultText = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.result_text);
        IgButton igButton = this.callButton;
        if (igButton == null) {
            C04220Ms.A0E("callButton");
            throw null;
        } else {
            igButton.setOnClickListener(new GraphQLTestFragment$onViewCreated$1(this));
        }
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    public GraphQLTestFragment() {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        this.dispatcherProvider = A0J;
        this.coroutineScope = C84874u0.A00(A0J, 675609327, 3);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1012076372);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_dcp_graphql, viewGroup, false);
        C14030oh.A09(-1543360622, A02);
        return inflate;
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
