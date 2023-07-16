package com.instagram.analytics.sampling;

import X.AnonymousClass0KD;
import X.AnonymousClass0wJ;
import X.C05030Qo;
import X.C10300i6;
import X.C18200wM;
import android.content.Context;
import com.instagram.common.analytics.sampling.BaseAnalytics2SamplingPolicyConfig;
import com.instagram.service.session.UserSession;

public final class IgAnalytics2SamplingPolicyConfig extends BaseAnalytics2SamplingPolicyConfig {
    public final String A00;

    public final String A00() {
        return this.A00;
    }

    public IgAnalytics2SamplingPolicyConfig(Context context) {
        super(context);
        String str;
        C10300i6 A0W = C18200wM.A0W(this);
        if (A0W == null || !(A0W instanceof UserSession)) {
            str = "0";
        } else {
            str = AnonymousClass0wJ.A0Y(C05030Qo.A02(A0W)).getId();
        }
        this.A00 = str;
    }

    public final void CXy(AnonymousClass0KD r3) {
        super.CXy(r3);
        AnonymousClass0KD.A00(r3, "v7", "qpl_config_version");
    }
}
