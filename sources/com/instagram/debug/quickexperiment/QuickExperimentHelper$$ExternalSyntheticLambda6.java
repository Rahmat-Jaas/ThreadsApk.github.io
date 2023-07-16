package com.instagram.debug.quickexperiment;

import X.AnonymousClass4MC;
import X.C07950cU;
import X.C10300i6;
import X.C34727Idy;
import android.widget.CompoundButton;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;

public final /* synthetic */ class QuickExperimentHelper$$ExternalSyntheticLambda6 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C07950cU f$0;
    public final /* synthetic */ QuickExperimentDebugStore f$1;
    public final /* synthetic */ AnonymousClass4MC f$2;
    public final /* synthetic */ C10300i6 f$3;
    public final /* synthetic */ C34727Idy f$4;

    public /* synthetic */ QuickExperimentHelper$$ExternalSyntheticLambda6(C07950cU r1, QuickExperimentDebugStore quickExperimentDebugStore, AnonymousClass4MC r3, C10300i6 r4, C34727Idy idy) {
        this.f$0 = r1;
        this.f$1 = quickExperimentDebugStore;
        this.f$2 = r3;
        this.f$3 = r4;
        this.f$4 = idy;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        QuickExperimentHelper.lambda$createSwitchItem$1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, compoundButton, z);
    }
}
