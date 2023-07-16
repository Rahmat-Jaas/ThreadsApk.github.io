package com.facebook.redex;

import X.AnonymousClass0MQ;
import X.C146958n9;
import X.C83234r0;
import X.D0E;
import kotlin.Unit;

public class IDxFCollectorShape1S0200100_1_I2 implements C83234r0 {
    public long A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxFCollectorShape1S0200100_1_I2(AnonymousClass0MQ r1, C83234r0 r2, int i, long j) {
        this.A03 = i;
        this.A02 = r1;
        this.A00 = j;
        this.A01 = r2;
    }

    public final Object emit(Object obj, C146958n9 r10) {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass0MQ r7 = (AnonymousClass0MQ) this.A02;
        if (currentTimeMillis - r7.A00 >= this.A00) {
            r7.A00 = currentTimeMillis;
            Object emit = ((C83234r0) this.A01).emit(obj, r10);
            if (emit == D0E.COROUTINE_SUSPENDED) {
                return emit;
            }
        }
        return Unit.A00;
    }
}
