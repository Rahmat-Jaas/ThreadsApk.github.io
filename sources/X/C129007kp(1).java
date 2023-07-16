package X;

import com.facebook.redex.IDxPObserverShape271S0200000_2_I2;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7kp  reason: invalid class name and case insensitive filesystem */
public final class C129007kp implements C145388kQ {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();
    public final /* synthetic */ C145388kQ A01;
    public final /* synthetic */ AnonymousClass0YY A02;

    public C129007kp(C145388kQ r2, AnonymousClass0YY r3) {
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A6o(C143718hC r4) {
        IDxPObserverShape271S0200000_2_I2 iDxPObserverShape271S0200000_2_I2 = new IDxPObserverShape271S0200000_2_I2(1, this.A02, r4);
        this.A01.A6o(iDxPObserverShape271S0200000_2_I2);
        this.A00.put(r4, iDxPObserverShape271S0200000_2_I2);
    }

    public final void AHZ(C143718hC r3) {
        C143718hC r1 = (C143718hC) this.A00.remove(r3);
        if (r1 != null) {
            this.A01.AHZ(r1);
        }
    }
}
