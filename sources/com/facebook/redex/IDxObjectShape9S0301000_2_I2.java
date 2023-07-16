package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.C03740Kn;
import X.C1371186e;
import X.C1371386g;
import X.C18220wO;
import X.C86154wM;
import java.util.Iterator;

public class IDxObjectShape9S0301000_2_I2 implements Iterator, C03740Kn {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04 = 1;

    public IDxObjectShape9S0301000_2_I2(C1371186e r2) {
        this.A03 = r2;
        this.A01 = r2.A01.iterator();
        this.A00 = -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r1 = r4.A01
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r3 = r1.next()
            java.lang.Object r2 = r4.A03
            X.86g r2 = (X.C1371386g) r2
            X.0YY r0 = r2.A00
            java.lang.Object r0 = r0.invoke(r3)
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            boolean r0 = r2.A02
            if (r1 != r0) goto L_0x0000
            r4.A02 = r3
            r0 = 1
        L_0x0023:
            r4.A00 = r0
            return
        L_0x0026:
            r0 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObjectShape9S0301000_2_I2.A00():void");
    }

    public final void A01() {
        Iterator it = (Iterator) this.A01;
        if (it.hasNext()) {
            Object next = it.next();
            if (AnonymousClass0wJ.A1X(((C1371186e) this.A03).A00.invoke(next))) {
                this.A00 = 1;
                this.A02 = next;
                return;
            }
        }
        this.A00 = 0;
    }

    public final boolean hasNext() {
        int i = this.A04;
        int i2 = this.A00;
        if (i != 0) {
            if (i2 == -1) {
                A01();
            }
        } else if (i2 == -1) {
            A00();
        }
        if (this.A00 != 1) {
            return false;
        }
        return true;
    }

    public final Object next() {
        int i = this.A04;
        int i2 = this.A00;
        if (i != 0) {
            if (i2 == -1) {
                A01();
            }
            if (this.A00 == 0) {
                throw C86154wM.A0u();
            }
        } else {
            if (i2 == -1) {
                A00();
            }
            if (this.A00 == 0) {
                throw C86154wM.A0u();
            }
        }
        Object obj = this.A02;
        this.A02 = null;
        this.A00 = -1;
        return obj;
    }

    public final void remove() {
        int i = this.A04;
        throw C18220wO.A0v();
    }

    public IDxObjectShape9S0301000_2_I2(C1371386g r2) {
        this.A03 = r2;
        this.A01 = r2.A01.iterator();
        this.A00 = -1;
    }
}
