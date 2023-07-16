package com.instagram.common.analytics.sampling;

import X.AnonymousClass0KD;
import X.C10380iF;
import X.C10710in;
import X.C10740ir;
import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.InputStream;

public abstract class BaseAnalytics2SamplingPolicyConfig implements SamplingPolicyConfig {
    public final C10740ir A00;
    public final C10710in A01;
    public final String A02;

    public final class NoOpSamplingPolicyConfig implements SamplingPolicyConfig {
        public final void CXy(AnonymousClass0KD r1) {
        }

        public final void CYF(AnonymousClass0KD r1) {
        }

        public final void D9W(InputStream inputStream) {
        }
    }

    public abstract String A00();

    public BaseAnalytics2SamplingPolicyConfig(Context context) {
        C10740ir A002;
        C10740ir A003;
        Class<BaseAnalytics2SamplingPolicyConfig> cls = BaseAnalytics2SamplingPolicyConfig.class;
        synchronized (cls) {
            A002 = C10740ir.A00();
            A002 = A002 == null ? C10740ir.A01(context) : A002;
        }
        String A022 = C10380iF.A02(context);
        synchronized (cls) {
            A003 = C10740ir.A00();
            A003 = A003 == null ? C10740ir.A01(context) : A003;
        }
        C10710in r0 = new C10710in(A003);
        this.A00 = A002;
        this.A02 = A022;
        this.A01 = r0;
    }

    public void CXy(AnonymousClass0KD r3) {
        C10740ir r0 = this.A00;
        AnonymousClass0KD.A00(r3, C10740ir.A02(r0).A03(A00()), "config_checksum");
        AnonymousClass0KD.A00(r3, "v2", "config_version");
    }

    public final void CYF(AnonymousClass0KD r3) {
        AnonymousClass0KD.A00(r3, this.A02, "app_ver");
        AnonymousClass0KD.A00(r3, A00(), "app_uid");
    }

    public final void D9W(InputStream inputStream) {
        this.A01.A00(inputStream);
    }
}
