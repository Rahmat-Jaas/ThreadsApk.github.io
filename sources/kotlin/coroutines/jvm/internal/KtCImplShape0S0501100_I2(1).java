package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0BO;
import X.AnonymousClass32X;
import X.AnonymousClass3R9;
import X.C09120et;
import X.C146958n9;
import X.C27236EjA;
import X.C82744qC;
import X.C84874u0;
import com.facebook.forker.Process;
import com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache;
import com.instagram.nux.ndx.util.NdxStepsFilterer;

public class KtCImplShape0S0501100_I2 extends C27236EjA {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0501100_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A07 = i;
        this.A06 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        this.A05 = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        if (i != 0) {
            return ((NdxStepsFilterer) this.A06).A00((C84874u0) null, (C82744qC) null, (AnonymousClass3R9) null, (C09120et) null, (AnonymousClass0BO) null, this);
        }
        return OnDemandSurfaceTriggerCache.A00((AnonymousClass32X) null, (OnDemandSurfaceTriggerCache) this.A06, (Object) null, this, false);
    }
}
