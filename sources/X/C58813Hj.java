package X;

import android.os.Bundle;

/* renamed from: X.3Hj  reason: invalid class name and case insensitive filesystem */
public final class C58813Hj {
    public final boolean A02(Bundle bundle) {
        if (bundle == null || bundle.getString("DynamicFlowPlugin.extraFlowId") == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.os.Bundle r10, java.lang.Object r11) {
        /*
            r9 = this;
            r10.getClass()
            java.lang.String r1 = "DynamicFlowPlugin.extraFlowId"
            java.lang.String r0 = r10.getString(r1)
            r0.getClass()
            X.3ZJ r6 = X.AnonymousClass3ZJ.A01()
            java.lang.String r7 = r10.getString(r1)
            X.1yu r6 = (X.C29601yu) r6
            java.util.Map r5 = r6.A01
            java.lang.Object r4 = r5.get(r7)
            X.3HU r4 = (X.AnonymousClass3HU) r4
            java.lang.String r0 = "Could not find flow for the given id."
            X.AnonymousClass7Ko.A07(r4, r0)
            X.3DI r3 = r4.A01
            if (r3 != 0) goto L_0x0062
            r0 = 1
        L_0x0028:
            com.instagram.util.dynamicflow.impl.IDxSAdapterShape198S0100000_1_I2 r2 = new com.instagram.util.dynamicflow.impl.IDxSAdapterShape198S0100000_1_I2
            r2.<init>(r4, r0)
        L_0x002d:
            boolean r0 = r2 instanceof com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2
            if (r0 == 0) goto L_0x0055
            com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2 r2 = (com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2) r2
            int r0 = r2.A03
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0054
            java.lang.Object r0 = r2.A02
            boolean r0 = X.C18220wO.A1U(r0)
            if (r0 == 0) goto L_0x0054
        L_0x0041:
            java.util.Map r1 = r6.A00
            java.lang.Object r0 = r1.get(r7)
            X.4sB r0 = (X.C83904sB) r0
            if (r0 == 0) goto L_0x004e
            r0.BzX()
        L_0x004e:
            r5.remove(r7)
            r1.remove(r7)
        L_0x0054:
            return
        L_0x0055:
            boolean r0 = r2 instanceof com.instagram.util.dynamicflow.impl.IDxSAdapterShape198S0100000_1_I2
            if (r0 == 0) goto L_0x0054
            com.instagram.util.dynamicflow.impl.IDxSAdapterShape198S0100000_1_I2 r2 = (com.instagram.util.dynamicflow.impl.IDxSAdapterShape198S0100000_1_I2) r2
            int r0 = r2.A01
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0041
            return
        L_0x0062:
            X.4tt r0 = r3.A05
            java.lang.Object r2 = r0.D7Y(r3, r11)
            X.4tq r0 = r3.A00
            boolean r0 = r0.ABr(r3, r2)
            if (r0 == 0) goto L_0x00a9
            java.util.Stack r1 = r4.A04
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0096
            r0 = 0
        L_0x0079:
            r8 = -1
            X.4ts r1 = r3.A03
            java.lang.Object r2 = r1.C8i(r3, r2, r8)
            r1 = 0
            r3.A04 = r1
            r4.A01 = r0
            if (r0 == 0) goto L_0x008f
            X.4ts r1 = r0.A02
            java.lang.Object r1 = r1.C8i(r0, r2, r8)
            r4.A02 = r1
        L_0x008f:
            r1 = 1
            com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2 r2 = new com.instagram.util.dynamicflow.impl.IDxSAdapterShape39S0300000_1_I2
            r2.<init>(r4, r3, r0, r1)
            goto L_0x002d
        L_0x0096:
            java.lang.Object r0 = r1.pop()
            int r1 = X.AnonymousClass0wJ.A04(r0)
            r4.A00 = r1
            java.util.List r0 = r4.A03
            java.lang.Object r0 = r0.get(r1)
            X.3DI r0 = (X.AnonymousClass3DI) r0
            goto L_0x0079
        L_0x00a9:
            r0 = 2
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58813Hj.A00(android.os.Bundle, java.lang.Object):void");
    }

    public final void A01(Bundle bundle, Object obj) {
        bundle.getClass();
        bundle.getString("DynamicFlowPlugin.extraFlowId").getClass();
        AnonymousClass3ZJ.A01().A08(bundle.getString("DynamicFlowPlugin.extraFlowId"), obj);
    }
}
