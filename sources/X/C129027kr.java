package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.7kr  reason: invalid class name and case insensitive filesystem */
public final class C129027kr implements C145388kQ {
    public static final McB A03 = C86164wN.A0N(33);
    public final ListenableFuture A00;
    public final McB A01;
    public final Map A02 = Collections.synchronizedMap(AnonymousClass0wJ.A0y());

    public final void A6o(C143718hC r4) {
        C129997nq r2 = new C129997nq(r4, this.A01);
        this.A02.put(r4, r2);
        C30954Gc6.A03(r2, this.A00, C97356Ba.A01);
    }

    public final void AHZ(C143718hC r3) {
        C129997nq r0 = (C129997nq) this.A02.remove(r3);
        if (r0 != null) {
            r0.A00.set((Object) null);
        }
    }

    public C129027kr(McB mcB, ListenableFuture listenableFuture) {
        this.A00 = listenableFuture;
        this.A01 = mcB;
    }
}
