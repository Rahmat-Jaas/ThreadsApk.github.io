package com.google.common.collect;

import X.C41836MeS;
import X.C93765re;
import X.C93775rf;
import X.C93795rh;
import java.util.Iterator;

public class IDxAIteratorShape25S0200000_2_I2 extends C93795rh {
    public Object A00;
    public Object A01;
    public final int A02 = 2;

    public IDxAIteratorShape25S0200000_2_I2(C41836MeS meS, Iterator it) {
        this.A01 = it;
        this.A00 = meS;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r1.hasNext() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r1.hasNext() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        r0 = r1.next();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00() {
        /*
            r2 = this;
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r2.A00
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r1.next()
            java.lang.Object r1 = r2.A01
            X.5re r1 = (X.C93765re) r1
            java.util.Set r1 = r1.A01
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x0005
            return r0
        L_0x0020:
            java.lang.Object r1 = r2.A00
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r1.next()
            java.lang.Object r1 = r2.A01
            X.5rf r1 = (X.C93775rf) r1
            java.util.Set r1 = r1.A01
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0020
            return r0
        L_0x003b:
            java.lang.Object r1 = r2.A01
            java.util.Iterator r1 = (java.util.Iterator) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r1.next()
            java.lang.Object r1 = r2.A00
            X.MeS r1 = (X.C41836MeS) r1
            boolean r1 = r1.apply(r0)
            if (r1 == 0) goto L_0x003b
            return r0
        L_0x0054:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r2.A00 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.IDxAIteratorShape25S0200000_2_I2.A00():java.lang.Object");
    }

    public IDxAIteratorShape25S0200000_2_I2(C93765re r2) {
        this.A01 = r2;
        this.A00 = r2.A00.iterator();
    }

    public IDxAIteratorShape25S0200000_2_I2(C93775rf r2) {
        this.A01 = r2;
        this.A00 = r2.A00.iterator();
    }
}
