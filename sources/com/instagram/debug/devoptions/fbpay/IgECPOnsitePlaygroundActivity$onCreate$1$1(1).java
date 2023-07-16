package com.instagram.debug.devoptions.fbpay;

import X.AnonymousClass69R;
import X.C04220Ms;
import X.C113996sW;
import X.C14030oh;
import android.view.View;

public final class IgECPOnsitePlaygroundActivity$onCreate$1$1 implements View.OnClickListener {
    public final /* synthetic */ IgECPOnsitePlaygroundActivity this$0;

    public IgECPOnsitePlaygroundActivity$onCreate$1$1(IgECPOnsitePlaygroundActivity igECPOnsitePlaygroundActivity) {
        this.this$0 = igECPOnsitePlaygroundActivity;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1017498012);
        C113996sW r2 = this.this$0.ecpLauncher;
        if (r2 == null) {
            C04220Ms.A0E("ecpLauncher");
            throw null;
        }
        r2.A01(AnonymousClass69R.A00(), "FORCE_PUX");
        C14030oh.A0C(-832218824, A05);
    }
}
