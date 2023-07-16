package com.facebook.redex;

import X.AnonymousClass0LU;
import X.C16240si;

public class IDxReporterShape810S0100000_I2 implements C16240si {
    public Object A00;
    public final int A01;

    public IDxReporterShape810S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Ccv(String str) {
        String str2;
        if (this.A01 != 0) {
            str2 = "SecurePendingIntent";
        } else {
            str2 = "KeepaliveManager-SecurePendingIntent";
        }
        AnonymousClass0LU.A0D(str2, str);
    }

    public final void Ccw(String str, String str2, Throwable th) {
        Object[] objArr;
        if (this.A01 != 0) {
            AnonymousClass0LU.A0I(String.format("tag: %s, file: %s, category: %s", new Object[]{"SecurePendingIntent", "FbnsRegistrarRetry", str}), str2, th);
            return;
        }
        if (th == null) {
            objArr = new Object[]{str, str2};
        } else {
            objArr = new Object[]{str, str2, th};
        }
        AnonymousClass0LU.A0P("%s-%s", "KeepaliveManager-SecurePendingIntent", objArr);
    }
}
