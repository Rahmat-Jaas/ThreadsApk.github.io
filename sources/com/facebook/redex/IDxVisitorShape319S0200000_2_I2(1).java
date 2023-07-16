package com.facebook.redex;

import X.C109246jh;
import X.C127397h3;
import X.C144568ii;
import X.C41190Lyh;
import X.LmH;

public class IDxVisitorShape319S0200000_2_I2 implements C144568ii {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxVisitorShape319S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final boolean DAZ(C127397h3 r6) {
        Object obj;
        if (this.A02 != 0) {
            C41190Lyh lyh = (C41190Lyh) this.A01;
            LmH lmH = lyh.A00;
            if (!(lmH == null || (obj = lmH.A01.get(r6)) == null)) {
                lyh.A01.A01.put(r6, obj);
            }
            long j = (long) r6.A02;
            Object A002 = lyh.A00(j);
            if (A002 == null) {
                return false;
            }
            lyh.A01(j, A002);
            return false;
        }
        C109246jh r4 = (C109246jh) this.A01;
        C109246jh r3 = (C109246jh) this.A00;
        int i = r6.A02;
        Object obj2 = r4.A02.get(i);
        if (obj2 != null) {
            r3.A02.put(i, obj2);
        }
        Object obj3 = r4.A00.get(i);
        if (obj3 != null) {
            r3.A00.put(i, obj3);
        }
        Object obj4 = r4.A01.get(i);
        if (obj4 == null) {
            return false;
        }
        r3.A01.put(i, obj4);
        return false;
    }
}
