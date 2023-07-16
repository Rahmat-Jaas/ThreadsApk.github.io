package com.instagram.debug.quickexperiment;

import X.AnonymousClass4MA;
import X.C07950cU;
import X.C10300i6;
import X.C13950oZ;
import X.C34727Idy;
import android.content.Context;
import android.view.View;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;

public final /* synthetic */ class QuickExperimentHelper$$ExternalSyntheticLambda3 implements View.OnClickListener {
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ C10300i6 f$1;
    public final /* synthetic */ C07950cU f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ AnonymousClass4MA f$5;
    public final /* synthetic */ QuickExperimentDebugStore f$6;
    public final /* synthetic */ C34727Idy f$7;

    public /* synthetic */ QuickExperimentHelper$$ExternalSyntheticLambda3(Context context, C10300i6 r2, C07950cU r3, String str, String str2, AnonymousClass4MA r6, QuickExperimentDebugStore quickExperimentDebugStore, C34727Idy idy) {
        this.f$0 = context;
        this.f$1 = r2;
        this.f$2 = r3;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$5 = r6;
        this.f$6 = quickExperimentDebugStore;
        this.f$7 = idy;
    }

    public final void onClick(View view) {
        C13950oZ.A00(QuickExperimentHelper.getSimpleDialog(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7));
    }
}
