package com.facebook.redex;

import X.AnonymousClass5Id;
import X.AnonymousClass7EB;
import X.C125857eB;
import X.C145188k1;
import X.C86134wK;
import com.facebook.dcp.model.PredictorMetadata;
import java.util.List;
import java.util.concurrent.Callable;

public class IDxCallableShape70S0300000_2_I2 implements Callable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCallableShape70S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.A03 != 0) {
            return ((AnonymousClass7EB) this.A02).A02((PredictorMetadata) this.A01, (List) this.A00);
        }
        C125857eB r6 = (C125857eB) this.A02;
        C125857eB.A00(r6, C86134wK.A0N("start_background_thread", (String) null, 6, 1));
        AnonymousClass5Id CX5 = r6.A00.CX5((C145188k1) this.A00, (List) this.A01);
        C125857eB.A00(r6, C86134wK.A0N("end_background_thread", (String) null, 6, 1));
        return CX5;
    }
}
