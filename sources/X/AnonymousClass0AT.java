package X;

import android.content.Context;
import com.facebook.flexiblesampling.SamplingPolicyConfig;

/* renamed from: X.0AT  reason: invalid class name */
public final class AnonymousClass0AT {
    public final AnonymousClass0AR A00;
    public final AnonymousClass0AS A01;
    public final AnonymousClass0LI A02;

    public AnonymousClass0AT(Context context, AnonymousClass0LI r3, SamplingPolicyConfig samplingPolicyConfig, String str) {
        AnonymousClass0AR r0;
        this.A02 = r3;
        this.A01 = new AnonymousClass0AS(context, str);
        if (samplingPolicyConfig != null) {
            r0 = new AnonymousClass0AR(samplingPolicyConfig);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }
}
