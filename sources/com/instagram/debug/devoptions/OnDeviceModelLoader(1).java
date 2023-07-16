package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0OY;
import X.AnonymousClass0RA;
import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.AnonymousClass7J1;
import X.C04220Ms;
import X.C04530Oa;
import X.C112096oz;
import X.C14030oh;
import X.C144858jP;
import X.C146958n9;
import X.C18180wK;
import X.C18230wP;
import X.C18250wR;
import X.C25237DiI;
import X.C27952Ew2;
import X.C34640IcN;
import X.C82034oy;
import X.C83224qz;
import X.C84874u0;
import X.E5N;
import X.GP0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2;
import com.facebook.models.IgModelLoader;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public final class OnDeviceModelLoader extends C34640IcN implements C144858jP, C82034oy {
    public IgEditText assetInput;
    public final C83224qz coroutineScope;
    public final C84874u0 dispatcherProvider;
    public IgButton fetchButton;
    public IgButton heuristicButton;
    public IgButton inferenceButton;
    public IgEditText modelInput;
    public IgTextView resultView;
    public final Bundle sessionTokenBundle = C18180wK.A06();
    public final C04530Oa userSession$delegate = AnonymousClass0OY.A02(new OnDeviceModelLoader$userSession$2(this));
    public IgEditText versionInput;

    /* access modifiers changed from: private */
    public final void fetchModel(String str, String str2, long j) {
        KtCSuperShape0S2000100_I2 ktCSuperShape0S2000100_I2 = new KtCSuperShape0S2000100_I2(str, str2, j);
        IgModelLoader A00 = GP0.A00(AnonymousClass0RA.A0C.A02(this.sessionTokenBundle));
        if (A00 != null) {
            try {
                outputResult(AnonymousClass00U.A0L("Model path: ", new C112096oz(A00, AnonymousClass0wJ.A0X(this.userSession$delegate)).A00(ktCSuperShape0S2000100_I2)), true);
            } catch (Exception e) {
                outputResult(C18230wP.A0t("Failed to get model path: ", e), false);
            }
        } else {
            throw AnonymousClass0wJ.A0b();
        }
    }

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825338);
    }

    public String getModuleName() {
        return "on_device_compute";
    }

    public void onPredictionResult(Object obj, HashMap hashMap) {
        C04220Ms.A0B(obj, 0);
        AnonymousClass7J1.A02(new OnDeviceModelLoader$onPredictionResult$1(this, obj));
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.modelInput = (IgEditText) AnonymousClass0wJ.A0J(view, R.id.model_input);
        this.assetInput = (IgEditText) AnonymousClass0wJ.A0J(view, R.id.asset_input);
        this.versionInput = (IgEditText) AnonymousClass0wJ.A0J(view, R.id.version_input);
        this.fetchButton = (IgButton) AnonymousClass0wJ.A0J(view, R.id.fetch_button);
        this.inferenceButton = (IgButton) AnonymousClass0wJ.A0J(view, R.id.inference_button);
        this.heuristicButton = (IgButton) AnonymousClass0wJ.A0J(view, R.id.heuristic_button);
        this.resultView = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.result);
        IgButton igButton = this.fetchButton;
        if (igButton == null) {
            str = "fetchButton";
        } else {
            igButton.setOnClickListener(new OnDeviceModelLoader$onViewCreated$1(this));
            IgButton igButton2 = this.inferenceButton;
            if (igButton2 == null) {
                str = "inferenceButton";
            } else {
                igButton2.setOnClickListener(new OnDeviceModelLoader$onViewCreated$2(this));
                IgButton igButton3 = this.heuristicButton;
                if (igButton3 == null) {
                    str = "heuristicButton";
                } else {
                    igButton3.setOnClickListener(new OnDeviceModelLoader$onViewCreated$3(this));
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    private final void outputResult(String str, boolean z) {
        if (!z) {
            AnonymousClass0LU.A0B("on_device_compute", str);
        }
        AnonymousClass7J1.A02(new OnDeviceModelLoader$outputResult$1(this, str));
    }

    public OnDeviceModelLoader() {
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        this.dispatcherProvider = A0J;
        this.coroutineScope = C84874u0.A00(A0J, 1408217342, 3);
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1240646070);
        super.onCreate(bundle);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new OnDeviceModelLoader$onCreate$1(this, (C146958n9) null), this.coroutineScope, 3);
        C14030oh.A09(-362415446, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1781429630);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_on_device_model_loader, viewGroup, false);
        C14030oh.A09(-1132468809, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
