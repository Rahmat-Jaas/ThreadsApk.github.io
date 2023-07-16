package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass006;
import X.AnonymousClass01V;
import X.AnonymousClass0OY;
import X.AnonymousClass0RA;
import X.AnonymousClass0ZU;
import X.AnonymousClass1fC;
import X.AnonymousClass4u2;
import X.AnonymousClass9K7;
import X.C04220Ms;
import X.C04530Oa;
import X.C09120et;
import X.C13950oZ;
import X.C14030oh;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18250wR;
import X.C23411dm;
import X.C40877Lpc;
import X.C41026Luf;
import X.C82034oy;
import X.C83364rG;
import X.KK7;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.debug.sandbox.SandboxUtil;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class SandboxSelectorFragment extends C23411dm implements C82034oy {
    public final C09120et devPreferences = C18190wL.A0X();
    public AnonymousClass9K7 navigationPerfLogger;
    public UserSession session;
    public final C04530Oa viewModel$delegate;

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825489);
    }

    public String getModuleName() {
        return "sandbox_selector";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass1fC r4 = new AnonymousClass1fC(requireContext(), getSession(), this);
        getScrollingViewProxy().ChZ(r4);
        SandboxSelectorViewModel viewModel = getViewModel();
        viewModel.viewState.A0C(getViewLifecycleOwner(), new SandboxSelectorFragment$onViewCreated$1$1(r4, this));
        C18180wK.A18(this, new SandboxSelectorFragment$onViewCreated$1$2(this, (C146958n9) null), viewModel.toasts);
    }

    public void setSession(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        this.session = userSession;
    }

    /* access modifiers changed from: private */
    public final SandboxSelectorViewModel getViewModel() {
        return (SandboxSelectorViewModel) this.viewModel$delegate.getValue();
    }

    public UserSession getSession() {
        UserSession userSession = this.session;
        if (userSession != null) {
            return userSession;
        }
        C18250wR.A0l();
        throw null;
    }

    public SandboxSelectorFragment() {
        SandboxSelectorFragment$viewModel$2 sandboxSelectorFragment$viewModel$2 = new SandboxSelectorFragment$viewModel$2(this);
        C04530Oa A01 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new SandboxSelectorFragment$special$$inlined$viewModels$default$2(new SandboxSelectorFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = C18220wO.A0M(new SandboxSelectorFragment$special$$inlined$viewModels$default$3(A01), sandboxSelectorFragment$viewModel$2, new SandboxSelectorFragment$special$$inlined$viewModels$default$4((AnonymousClass0ZU) null, A01), C18210wN.A0l(SandboxSelectorViewModel.class));
    }

    /* access modifiers changed from: private */
    public final void showErrorDialog(String str, String str2) {
        C41026Luf luf = new C41026Luf(requireContext());
        luf.A08(str);
        C40877Lpc lpc = luf.A01;
        lpc.A0C = str2;
        luf.A03(SandboxSelectorFragment$showErrorDialog$1.INSTANCE, 2131831976);
        lpc.A05 = new SandboxSelectorFragment$showErrorDialog$2(this);
        C18250wR.A0u(luf);
    }

    /* access modifiers changed from: private */
    public final void showManualEntryDialog() {
        Dialog sandboxDialog = SandboxUtil.getSandboxDialog(requireContext(), getSession(), (List) null);
        sandboxDialog.setOnDismissListener(new SandboxSelectorFragment$showManualEntryDialog$1$1(this));
        C13950oZ.A00(sandboxDialog);
    }

    /* access modifiers changed from: private */
    public final void updateOverlayIndicator() {
        C83364rG r1;
        Context context = getContext();
        if ((context instanceof C83364rG) && (r1 = (C83364rG) context) != null) {
            r1.Bti(this.devPreferences);
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-2088573534);
        super.onCreate(bundle);
        setSession(C18180wK.A0W(this, AnonymousClass0RA.A0C));
        getSession();
        AnonymousClass9K7 r2 = new AnonymousClass9K7(AnonymousClass01V.A0p, "sandbox", 31799736);
        this.navigationPerfLogger = r2;
        r2.A0L(requireContext(), KK7.A00(getSession()), this);
        C14030oh.A09(1281457185, A02);
    }
}
