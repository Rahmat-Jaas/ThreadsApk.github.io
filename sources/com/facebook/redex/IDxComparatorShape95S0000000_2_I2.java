package com.facebook.redex;

import java.util.Comparator;

public class IDxComparatorShape95S0000000_2_I2 implements Comparator {
    public final int A00;

    public IDxComparatorShape95S0000000_2_I2(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005e, code lost:
        r0 = java.lang.Long.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return X.AnonymousClass722.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x00a1;
                case 2: goto L_0x0093;
                case 3: goto L_0x0063;
                case 4: goto L_0x00ff;
                case 5: goto L_0x0052;
                case 6: goto L_0x0045;
                case 7: goto L_0x00e6;
                case 8: goto L_0x0038;
                case 9: goto L_0x002b;
                case 10: goto L_0x00cd;
                case 11: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.6mH r7 = (X.C110786mH) r7
            int r0 = r7.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.6mH r8 = (X.C110786mH) r8
            int r0 = r8.A01
        L_0x0011:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0015:
            int r5 = X.AnonymousClass722.A00(r2, r0)
        L_0x0019:
            return r5
        L_0x001a:
            java.io.File r8 = (java.io.File) r8
            long r0 = r8.lastModified()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.io.File r7 = (java.io.File) r7
            long r0 = r7.lastModified()
            goto L_0x005e
        L_0x002b:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2 r8 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2) r8
            int r0 = r8.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2) r7
            int r0 = r7.A00
            goto L_0x0011
        L_0x0038:
            X.CKW r8 = (X.CKW) r8
            long r0 = r8.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.CKW r7 = (X.CKW) r7
            long r0 = r7.A01
            goto L_0x005e
        L_0x0045:
            X.5HH r7 = (X.AnonymousClass5HH) r7
            long r0 = r7.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.5HH r8 = (X.AnonymousClass5HH) r8
            long r0 = r8.A00
            goto L_0x005e
        L_0x0052:
            com.facebook.dcp.signals.model.SignalResult r7 = (com.facebook.dcp.signals.model.SignalResult) r7
            long r0 = r7.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            com.facebook.dcp.signals.model.SignalResult r8 = (com.facebook.dcp.signals.model.SignalResult) r8
            long r0 = r8.A00
        L_0x005e:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0015
        L_0x0063:
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r7 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r7
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r8 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r8
            java.util.Map r3 = r7.A00
            java.lang.String r2 = "last_used_time"
            java.lang.Object r0 = r3.get(r2)
            r5 = 1
            if (r0 == 0) goto L_0x0019
            java.util.Map r1 = r8.A00
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = X.C18220wO.A0r(r2, r3)
            long r3 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = X.C18220wO.A0r(r2, r1)
            long r0 = java.lang.Long.parseLong(r0)
            long r3 = r3 - r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
        L_0x0091:
            r5 = -1
            return r5
        L_0x0093:
            X.7HE r7 = (X.AnonymousClass7HE) r7
            int r0 = r7.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.7HE r8 = (X.AnonymousClass7HE) r8
            int r0 = r8.A01
            goto L_0x0011
        L_0x00a1:
            X.7Y3 r7 = (X.AnonymousClass7Y3) r7
            X.7Y3 r8 = (X.AnonymousClass7Y3) r8
            X.AnonymousClass0wJ.A1N(r7, r8)
            int r1 = r7.A01
            int r0 = r8.A01
            int r5 = X.C04220Ms.A00(r1, r0)
            if (r5 != 0) goto L_0x0019
            int r1 = r7.hashCode()
            int r0 = r8.hashCode()
            int r5 = X.C04220Ms.A00(r1, r0)
            return r5
        L_0x00bf:
            X.6iY r7 = (X.C108556iY) r7
            int r0 = r7.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.6iY r8 = (X.C108556iY) r8
            int r0 = r8.A01
            goto L_0x0011
        L_0x00cd:
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.Number r8 = (java.lang.Number) r8
            int r0 = r7.intValue()
            float r1 = android.graphics.Color.luminance(r0)
            int r0 = r8.intValue()
            float r0 = android.graphics.Color.luminance(r0)
            int r5 = java.lang.Float.compare(r1, r0)
            return r5
        L_0x00e6:
            java.io.File r7 = (java.io.File) r7
            java.io.File r8 = (java.io.File) r8
            long r0 = r8.lastModified()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r0 = r7.lastModified()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r5 = r2.compareTo(r0)
            return r5
        L_0x00ff:
            com.facebook.dcp.model.FeatureData r7 = (com.facebook.dcp.model.FeatureData) r7
            java.lang.String r1 = r7.A03
            com.facebook.dcp.model.FeatureData r8 = (com.facebook.dcp.model.FeatureData) r8
            java.lang.String r0 = r8.A03
            int r5 = X.AnonymousClass722.A00(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxComparatorShape95S0000000_2_I2.compare(java.lang.Object, java.lang.Object):int");
    }
}
