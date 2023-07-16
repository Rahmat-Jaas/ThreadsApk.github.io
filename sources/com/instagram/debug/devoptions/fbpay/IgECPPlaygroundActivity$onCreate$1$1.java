package com.instagram.debug.devoptions.fbpay;

import X.AnonymousClass69R;
import X.C04220Ms;
import X.C113996sW;
import X.C14030oh;
import android.view.View;

public final class IgECPPlaygroundActivity$onCreate$1$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPPlaygroundActivity this$0;

    public IgECPPlaygroundActivity$onCreate$1$1(IgECPPlaygroundActivity igECPPlaygroundActivity) {
        this.this$0 = igECPPlaygroundActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(2049809960);
        C113996sW r2 = this.this$0.ecpLauncher;
        if (r2 == null) {
            C04220Ms.A0E("ecpLauncher");
            throw null;
        }
        r2.A00(AnonymousClass69R.A00(), "FORCE_PUX");
        C14030oh.A0C(908965828, A05);
    }
}
