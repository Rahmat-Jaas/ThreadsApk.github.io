package com.facebook.redex;

import X.AnonymousClass765;
import X.AnonymousClass7JN;
import X.C1192574g;
import X.C28051Exi;
import X.C41259M6w;
import X.C86124wJ;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

public class IDxCallableShape272S0100000_2_I2 implements Callable {
    public Object A00;
    public final int A01;

    public IDxCallableShape272S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object call() {
        if (this.A01 == 0) {
            return new C1192574g((JsReplyProxyBoundaryInterface) this.A00);
        }
        AnonymousClass765 r0 = (AnonymousClass765) this.A00;
        AnonymousClass7JN r3 = r0.A02;
        C28051Exi acquire = r3.acquire();
        C41259M6w m6w = r0.A01;
        m6w.beginTransaction();
        try {
            Unit A14 = C86124wJ.A14(m6w, acquire);
            r3.release(acquire);
            return A14;
        } catch (Throwable th) {
            m6w.endTransaction();
            r3.release(acquire);
            throw th;
        }
    }
}
