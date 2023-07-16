package com.facebook.redex;

import X.C83234r0;

public class IDxFCollectorShape59S0300000_1_I2 implements C83234r0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxFCollectorShape59S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj3;
        this.A00 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0131, code lost:
        X.AnonymousClass0OU.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019d, code lost:
        if (r0 != r7) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019f, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r9, X.C146958n9 r10) {
        /*
            r8 = this;
            int r0 = r8.A03
            switch(r0) {
                case 0: goto L_0x0102;
                case 1: goto L_0x01a0;
                case 2: goto L_0x0033;
                case 3: goto L_0x008e;
                default: goto L_0x0005;
            }
        L_0x0005:
            r3 = 29
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape12S0201000_I2_10.A00(r3, r10)
            if (r0 == 0) goto L_0x002b
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape12S0201000_I2_10 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape12S0201000_I2_10) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r5.A01
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0174
            if (r0 == r4) goto L_0x0131
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x002b:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape12S0201000_I2_10 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape12S0201000_I2_10
            r5.<init>((java.lang.Object) r8, (X.C146958n9) r10, (int) r3, (int) r0)
            goto L_0x001b
        L_0x0033:
            X.4ns r9 = (X.C81484ns) r9
            boolean r0 = r9 instanceof X.AnonymousClass4CC
            if (r0 == 0) goto L_0x0046
            java.lang.Object r4 = r8.A02
            X.9NU r4 = (X.AnonymousClass9NU) r4
            X.21l r1 = X.C304721l.LOADING
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x0041:
            r4.updateUi(r1, r0)
            goto L_0x01d0
        L_0x0046:
            boolean r0 = r9 instanceof X.AnonymousClass19M
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r4 = r8.A02
            X.9NU r4 = (X.AnonymousClass9NU) r4
            java.lang.Object r3 = r8.A00
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r3 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r3
            X.19M r9 = (X.AnonymousClass19M) r9
            boolean r1 = r9.A03
            int r2 = r9.A00
            int r0 = X.C18190wL.A00(r1)
            r3.setVisibility(r0)
            if (r1 == 0) goto L_0x007c
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131824621(0x7f110fed, float:1.9282075E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 423(0x1a7, float:5.93E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r4, r0)
            r3.setPrimaryAction(r1, r0)
            android.content.Context r0 = r4.requireContext()
            X.C31014GdU.A00(r0, r3, r2)
        L_0x007c:
            java.lang.Object r1 = r8.A01
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r9.A02
            int r0 = X.C18190wL.A00(r0)
            r1.setVisibility(r0)
            X.21l r1 = X.C304721l.LOADED
            java.util.List r0 = r9.A01
            goto L_0x0041
        L_0x008e:
            r3 = 18
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7.A00(r3, r10)
            if (r0 == 0) goto L_0x00b4
            r6 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b4
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x00a4:
            java.lang.Object r1 = r6.A02
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto L_0x00ba
            if (r0 == r5) goto L_0x0131
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x00b4:
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7
            r6.<init>(r8, r10, r3)
            goto L_0x00a4
        L_0x00ba:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r4 = r8.A02
            X.4r0 r4 = (X.C83234r0) r4
            r1 = r9
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r2 = r8.A00
            X.0et r2 = (X.C09120et) r2
            java.util.Set r0 = r2.A0E()
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r1 = r1.A00
            X.16q r1 = (X.C209216q) r1
            java.lang.String r3 = r1.A04
            boolean r0 = X.AnonymousClass00J.A0k(r0, r3)
            if (r0 != 0) goto L_0x01d0
            java.util.Set r0 = r2.A0E()
            java.lang.String r2 = r1.A03
            boolean r0 = X.AnonymousClass00J.A0k(r0, r2)
            if (r0 != 0) goto L_0x01d0
            java.lang.Object r1 = r8.A01
            java.util.Map r1 = (java.util.Map) r1
            boolean r0 = r1.containsKey(r3)
            if (r0 != 0) goto L_0x01d0
            boolean r0 = r1.containsValue(r2)
            if (r0 != 0) goto L_0x01d0
            r6.A00 = r5
            java.lang.Object r0 = r4.emit(r9, r6)
            goto L_0x019d
        L_0x0102:
            r3 = 9
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r10)
            if (r0 == 0) goto L_0x012b
            r5 = r10
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x012b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0118:
            java.lang.Object r1 = r5.A03
            X.D0E r7 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0142
            if (r0 == r3) goto L_0x0136
            if (r0 == r4) goto L_0x0131
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x012b:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r5.<init>(r8, r10, r3)
            goto L_0x0118
        L_0x0131:
            X.AnonymousClass0OU.A00(r1)
            goto L_0x01d0
        L_0x0136:
            java.lang.Object r2 = r5.A02
            X.0MJ r2 = (X.AnonymousClass0MJ) r2
            java.lang.Object r0 = r5.A01
            com.facebook.redex.IDxFCollectorShape59S0300000_1_I2 r0 = (com.facebook.redex.IDxFCollectorShape59S0300000_1_I2) r0
            X.AnonymousClass0OU.A00(r1)
            goto L_0x015c
        L_0x0142:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r2 = r8.A01
            X.0MJ r2 = (X.AnonymousClass0MJ) r2
            java.lang.Object r1 = r8.A02
            X.0YM r1 = (X.AnonymousClass0YM) r1
            java.lang.Object r0 = r2.A00
            r5.A01 = r8
            r5.A02 = r2
            r5.A00 = r3
            java.lang.Object r1 = r1.invoke(r0, r9, r5)
            if (r1 == r7) goto L_0x01d2
            r0 = r8
        L_0x015c:
            r2.A00 = r1
            java.lang.Object r2 = r0.A00
            X.4r0 r2 = (X.C83234r0) r2
            java.lang.Object r0 = r0.A01
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r1 = r0.A00
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r4
            java.lang.Object r0 = r2.emit(r1, r5)
            goto L_0x019d
        L_0x0174:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r3 = r8.A02
            X.4Uy r3 = (X.C73904Uy) r3
            java.lang.Object r2 = r8.A01
            X.0MJ r2 = (X.AnonymousClass0MJ) r2
            java.lang.Object r1 = r2.A00
            X.Lr0 r0 = X.DIV.A01
            if (r1 == r0) goto L_0x0191
            X.0YP r0 = r3.A01
            java.lang.Object r0 = r0.invoke(r1, r9)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 != 0) goto L_0x01d0
        L_0x0191:
            r2.A00 = r9
            java.lang.Object r0 = r8.A00
            X.4r0 r0 = (X.C83234r0) r0
            r5.A00 = r4
            java.lang.Object r0 = r0.emit(r9, r5)
        L_0x019d:
            if (r0 != r7) goto L_0x01d0
            return r7
        L_0x01a0:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r9 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r9
            java.lang.Object r3 = r8.A01
            com.instagram.igds.components.textcell.IgdsListCell r3 = (com.instagram.igds.components.textcell.IgdsListCell) r3
            boolean r2 = r9.A01
            r1 = 8
            int r0 = X.C18190wL.A00(r2)
            r3.setVisibility(r0)
            java.lang.Object r0 = r8.A00
            android.view.View r0 = (android.view.View) r0
            if (r2 == 0) goto L_0x01b8
            r1 = 0
        L_0x01b8:
            r0.setVisibility(r1)
            java.lang.Object r1 = r8.A02
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.Object r0 = r9.A00
            X.3Dd r0 = (X.C57943Dd) r0
            java.lang.CharSequence r1 = X.C59523Ld.A01(r1, r0)
            r0 = 0
            r3.A0J(r1, r0)
            X.24V r0 = X.AnonymousClass24V.TYPE_CHEVRON
            r3.setTextCellType(r0)
        L_0x01d0:
            kotlin.Unit r7 = kotlin.Unit.A00
        L_0x01d2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape59S0300000_1_I2.emit(java.lang.Object, X.8n9):java.lang.Object");
    }
}
