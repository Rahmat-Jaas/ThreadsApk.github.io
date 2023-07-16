package com.facebook.redex;

import android.widget.CompoundButton;

public class IDxCListenerShape16S0101000_1_I2 implements CompoundButton.OnCheckedChangeListener {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape16S0101000_1_I2(int i, int i2, Object obj) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        if (r3 == 2) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r9, boolean r10) {
        /*
            r8 = this;
            int r0 = r8.A02
            if (r0 == 0) goto L_0x0013
            java.lang.Object r2 = r8.A01
            X.0YY r2 = (X.AnonymousClass0YY) r2
            int r1 = r8.A00
            X.1th r0 = new X.1th
            r0.<init>(r1, r10)
            r2.invoke(r0)
            return
        L_0x0013:
            if (r10 == 0) goto L_0x004a
            java.lang.Object r0 = r8.A01
            X.1bs r0 = (X.C23071bs) r0
            X.0zW r4 = X.C23071bs.A00(r0)
            int r3 = r8.A00
            r7 = 1
            r5 = 0
            r2 = 2
            if (r3 != r2) goto L_0x006e
            X.20y r1 = r4.A05
            X.20y r0 = X.AnonymousClass20y.Broadcast
            if (r1 != r0) goto L_0x0070
            int r0 = r4.A01
            if (r0 >= r7) goto L_0x0070
            X.4wE r4 = r4.A0A
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131836331(0x7f113dab, float:1.9305826E38)
            X.1kC r2 = X.AnonymousClass1kC.A00(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131836324(0x7f113da4, float:1.9305812E38)
        L_0x003e:
            X.1kC r1 = X.AnonymousClass1kC.A00(r1, r0)
            X.19G r0 = new X.19G
            r0.<init>(r2, r1)
        L_0x0047:
            r4.CrC(r0)
        L_0x004a:
            java.lang.Object r0 = r8.A01
            X.1bs r0 = (X.C23071bs) r0
            X.0zW r0 = X.C23071bs.A00(r0)
            X.4wG r0 = r0.A0B()
            java.lang.Object r2 = r0.getValue()
            X.2MY r2 = (X.AnonymousClass2MY) r2
            boolean r0 = r2 instanceof X.AnonymousClass1oZ
            if (r0 == 0) goto L_0x00e0
            int r1 = r8.A00
            X.1oZ r2 = (X.AnonymousClass1oZ) r2
            int r0 = r2.A00
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            r9.setChecked(r0)
            return
        L_0x006e:
            if (r3 != r2) goto L_0x008b
        L_0x0070:
            X.20y r1 = r4.A05
            X.20y r0 = X.AnonymousClass20y.Social
            if (r1 != r0) goto L_0x008b
            int r0 = r4.A00
            if (r0 >= r2) goto L_0x008b
            X.4wE r4 = r4.A0A
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131836331(0x7f113dab, float:1.9305826E38)
            X.1kC r2 = X.AnonymousClass1kC.A00(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131836330(0x7f113daa, float:1.9305824E38)
            goto L_0x003e
        L_0x008b:
            X.49Y r6 = r4.A04
            if (r3 == r2) goto L_0x0090
            r7 = 0
        L_0x0090:
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r5 = X.AnonymousClass49Y.A00(r6)
            boolean r0 = X.AnonymousClass0wJ.A1U(r5)
            if (r0 == 0) goto L_0x00c2
            X.AnonymousClass49Y.A03(r5, r6)
            if (r7 == 0) goto L_0x00d9
            X.2AE r0 = X.AnonymousClass2AE.A0G
        L_0x00a1:
            X.C18220wO.A1D(r0, r5)
            X.2A4 r0 = X.AnonymousClass2A4.TOGGLE
            X.C18220wO.A1E(r0, r5)
            X.Lci r0 = X.C40328Lci.A0L
            X.C18230wP.A1D(r0, r5)
            X.2AA r0 = X.AnonymousClass2AA.A04
            X.C18240wQ.A13(r0, r5)
            X.2AG r1 = X.AnonymousClass2AG.SUBSCRIBER_BROADCAST
            java.lang.String r0 = "parent_surface"
            r5.A0O(r1, r0)
            java.lang.String r0 = r6.A00
            X.C62443a0.A01(r5, r0)
            r5.Bb4()
        L_0x00c2:
            X.4wE r1 = r4.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.CrC(r0)
            X.20y r1 = r4.A05
            X.20y r0 = X.AnonymousClass20y.Social
            if (r1 != r0) goto L_0x004a
            X.4wE r4 = r4.A08
            if (r3 != r2) goto L_0x00dc
            X.24x r0 = X.C312624x.ONE_MONTH
            goto L_0x0047
        L_0x00d9:
            X.2AE r0 = X.AnonymousClass2AE.A0F
            goto L_0x00a1
        L_0x00dc:
            X.24x r0 = X.C312624x.INDEFINITE
            goto L_0x0047
        L_0x00e0:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape16S0101000_1_I2.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
