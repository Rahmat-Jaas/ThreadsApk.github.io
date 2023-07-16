package com.facebook.redex;

import java.util.Comparator;

public class IDxComparatorShape94S0000000_1_I2 implements Comparator {
    public final int A00;

    public IDxComparatorShape94S0000000_1_I2(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e6, code lost:
        return X.AnonymousClass722.A00(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        return X.AnonymousClass722.A00(r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 2: goto L_0x0077;
                case 3: goto L_0x0068;
                case 4: goto L_0x00e9;
                case 5: goto L_0x0053;
                case 6: goto L_0x0042;
                case 7: goto L_0x0031;
                case 8: goto L_0x00c5;
                case 9: goto L_0x00a1;
                case 10: goto L_0x001a;
                case 11: goto L_0x008c;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.16z r5 = (X.C209916z) r5
            long r0 = r5.A02
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.16z r6 = (X.C209916z) r6
            long r0 = r6.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0015:
            int r0 = X.AnonymousClass722.A00(r3, r0)
            return r0
        L_0x001a:
            com.facebook.pando.TreeJNI r6 = (com.facebook.pando.TreeJNI) r6
            java.lang.String r2 = "created_time"
            long r0 = r6.getTimeValue(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            com.facebook.pando.TreeJNI r5 = (com.facebook.pando.TreeJNI) r5
            long r0 = r5.getTimeValue(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0015
        L_0x0031:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r5
            boolean r0 = r5.A01
            java.lang.Boolean r3 = X.C18240wQ.A0X(r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r6
            boolean r0 = r6.A01
            java.lang.Boolean r0 = X.C18240wQ.A0X(r0)
            goto L_0x0015
        L_0x0042:
            float r0 = X.C18240wQ.A00(r6)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            float r0 = X.C18240wQ.A00(r5)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0015
        L_0x0053:
            java.lang.Number r6 = (java.lang.Number) r6
            double r0 = r6.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            java.lang.Number r5 = (java.lang.Number) r5
            double r0 = r5.doubleValue()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L_0x0015
        L_0x0068:
            X.7h3 r5 = (X.C127397h3) r5
            r0 = 38
            java.lang.String r3 = r5.A0N(r0)
            X.7h3 r6 = (X.C127397h3) r6
            java.lang.String r0 = r6.A0N(r0)
            goto L_0x0015
        L_0x0077:
            X.4nO r5 = (X.C81224nO) r5
            X.18L r5 = (X.AnonymousClass18L) r5
            long r0 = r5.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            X.4nO r6 = (X.C81224nO) r6
            X.18L r6 = (X.AnonymousClass18L) r6
            long r0 = r6.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0015
        L_0x008c:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r1 = r6.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r0 = r5.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            int r0 = r1.compareTo(r0)
            return r0
        L_0x00a1:
            X.3Vc r5 = (X.C61723Vc) r5
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl r1 = r5.A05
            r3 = 0
            if (r1 == 0) goto L_0x00c3
            java.lang.String r0 = "created_time"
            long r0 = r1.getTimeValue(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L_0x00b2:
            X.3Vc r6 = (X.C61723Vc) r6
            com.instagram.unifiedfeedback.api.graphql.FBCommentImpl r1 = r6.A05
            if (r1 == 0) goto L_0x00e2
            java.lang.String r0 = "created_time"
            long r0 = r1.getTimeValue(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            goto L_0x00e2
        L_0x00c3:
            r2 = r3
            goto L_0x00b2
        L_0x00c5:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r5
            java.lang.Object r0 = r5.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2) r0
            r3 = 0
            if (r0 == 0) goto L_0x00e7
            int r0 = r0.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x00d4:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r6
            java.lang.Object r0 = r6.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0002000_I2) r0
            if (r0 == 0) goto L_0x00e2
            int r0 = r0.A01
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x00e2:
            int r0 = X.AnonymousClass722.A00(r2, r3)
            return r0
        L_0x00e7:
            r2 = r3
            goto L_0x00d4
        L_0x00e9:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2400000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2400000_I2) r6
            java.lang.Object r0 = r6.A02
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.A00
            java.lang.Long r1 = (java.lang.Long) r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2400000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2400000_I2) r5
            java.lang.Object r0 = r5.A02
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A00
            java.lang.Long r0 = (java.lang.Long) r0
            int r0 = X.AnonymousClass722.A00(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxComparatorShape94S0000000_1_I2.compare(java.lang.Object, java.lang.Object):int");
    }
}
