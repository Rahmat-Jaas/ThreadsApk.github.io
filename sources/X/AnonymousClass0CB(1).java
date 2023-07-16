package X;

import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.util.Iterator;

/* renamed from: X.0CB  reason: invalid class name */
public final class AnonymousClass0CB {
    public final Iterator A00;
    public final AnonymousClass0CC A01;
    public final C02590Ca A02;
    public final SamplingPolicyConfig A03;
    public final Integer A04;

    public final void A00() {
        Iterator it = this.A00;
        if (it.hasNext()) {
            C05500Tz r5 = (C05500Tz) it.next();
            AnonymousClass0CZ r4 = new AnonymousClass0CZ(r5, this.A04);
            this.A02.DA0(new C02760Ct(r5, this.A01, this.A03), r4);
            return;
        }
        throw new IllegalStateException("No more batches to upload");
    }

    public AnonymousClass0CB(AnonymousClass0CC r3, C02590Ca r4, SamplingPolicyConfig samplingPolicyConfig, Integer num, Iterator it) {
        this.A02 = r4;
        this.A04 = num;
        this.A00 = it;
        this.A01 = r3;
        this.A03 = samplingPolicyConfig;
        if (it == null) {
            throw new IllegalArgumentException("mBatchPayloadIterator is null");
        }
    }
}
