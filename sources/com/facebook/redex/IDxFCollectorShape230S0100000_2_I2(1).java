package com.facebook.redex;

import X.C83234r0;

public class IDxFCollectorShape230S0100000_2_I2 implements C83234r0 {
    public Object A00;
    public final int A01;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.C968767a r6, X.C146958n9 r7) {
        /*
            r5 = this;
            r3 = 7
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1.A00(r3, r7)
            if (r0 == 0) goto L_0x0049
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0049
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A02
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 != r1) goto L_0x004f
            java.lang.Object r0 = r4.A01
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r0 = (com.facebook.redex.IDxFCollectorShape230S0100000_2_I2) r0
            X.AnonymousClass0OU.A00(r3)
        L_0x0027:
            java.lang.Object r0 = r0.A00
            com.instagram.barcelona.profile.editor.ProfilePictureDelegateImpl r0 = (com.instagram.barcelona.profile.editor.ProfilePictureDelegateImpl) r0
            X.7En r2 = r0.A00
            r1 = 0
            java.lang.String r0 = "edit_picture_option"
            r2.A02(r0, r1)
            kotlin.Unit r2 = kotlin.Unit.A00
        L_0x0035:
            return r2
        L_0x0036:
            X.AnonymousClass0OU.A00(r3)
            java.lang.Object r0 = r5.A00
            com.instagram.barcelona.profile.editor.ProfilePictureDelegateImpl r0 = (com.instagram.barcelona.profile.editor.ProfilePictureDelegateImpl) r0
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r0 = r0.A01(r6, r4)
            if (r0 == r2) goto L_0x0035
            r0 = r5
            goto L_0x0027
        L_0x0049:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1
            r4.<init>(r5, r7, r3)
            goto L_0x0015
        L_0x004f:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape230S0100000_2_I2.A02(X.67a, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(java.util.List r13, X.C146958n9 r14) {
        /*
            r12 = this;
            r3 = 2
            boolean r0 = r14 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2
            if (r0 == 0) goto L_0x00ca
            r4 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2) r4
            int r0 = r4.A07
            if (r0 != r3) goto L_0x00ca
            int r2 = r4.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ca
            int r2 = r2 - r1
            r4.A01 = r2
        L_0x0017:
            java.lang.Object r1 = r4.A05
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A01
            r3 = 1
            if (r0 == 0) goto L_0x0075
            if (r0 != r3) goto L_0x00d4
            int r10 = r4.A00
            java.lang.Object r8 = r4.A04
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r4.A03
            X.D4T r2 = (X.D4T) r2
            java.lang.Object r6 = r4.A02
            java.util.List r6 = (java.util.List) r6
            X.AnonymousClass0OU.A00(r1)
        L_0x0033:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r11 = r8.next()
            int r7 = r10 + 1
            if (r10 >= 0) goto L_0x0046
            X.C06750aI.A1A()
            r0 = 0
            throw r0
        L_0x0046:
            X.DuI r1 = r2.A01
            int r9 = r6.size()
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            android.os.Handler r1 = r1.A00
            r0 = 6
            android.os.Message r0 = r1.obtainMessage(r0, r10, r9, r11)
            r0.sendToTarget()
            int r0 = X.C86144wL.A0C(r6, r3)
            if (r10 >= r0) goto L_0x0073
            r0 = 15
            r4.A02 = r6
            r4.A03 = r2
            r4.A04 = r8
            r4.A00 = r7
            r4.A01 = r3
            java.lang.Object r0 = X.AnonymousClass729.A01(r4, r0)
            if (r0 != r5) goto L_0x0073
            return r5
        L_0x0073:
            r10 = r7
            goto L_0x0033
        L_0x0075:
            X.AnonymousClass0OU.A00(r1)
            java.lang.Object r2 = r12.A00
            X.D4T r2 = (X.D4T) r2
            X.6DM r1 = r2.A03
            r0 = 0
            X.C04220Ms.A0B(r13, r0)
            int r0 = r1.A01
            if (r0 <= 0) goto L_0x008a
            java.util.List r13 = X.AnonymousClass00J.A0Z(r13, r0)
        L_0x008a:
            int r1 = r1.A00
            if (r1 <= 0) goto L_0x00bf
            boolean r0 = X.C18190wL.A1a(r13)
            if (r0 == 0) goto L_0x00bf
            int r0 = r13.size()
            if (r0 <= r1) goto L_0x00bf
            X.8A9 r0 = new X.8A9
            r0.<init>(r13)
            java.util.List r0 = X.AnonymousClass00J.A0R(r0, r1, r1)
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00ab:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r0 = r1.next()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = X.AnonymousClass00J.A0L(r0)
            r6.add(r0)
            goto L_0x00ab
        L_0x00bf:
            java.util.List r6 = X.C18180wK.A0n(r13)
        L_0x00c3:
            r10 = 0
            java.util.Iterator r8 = r6.iterator()
            goto L_0x0033
        L_0x00ca:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0502000_I2
            r4.<init>(r12, r14, r3)
            goto L_0x0017
        L_0x00d1:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x00d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape230S0100000_2_I2.A04(java.util.List, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.AnonymousClass3I2 r7, X.C146958n9 r8) {
        /*
            r6 = this;
            r3 = 6
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x0058
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0058
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r5.A00
            r0 = 2
            r1 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r1) goto L_0x0029
            if (r2 != r0) goto L_0x005e
            X.AnonymousClass0OU.A00(r4)
        L_0x0026:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x0028:
            return r3
        L_0x0029:
            java.lang.Object r7 = r5.A02
            X.3I2 r7 = (X.AnonymousClass3I2) r7
            java.lang.Object r0 = r5.A01
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r0 = (com.facebook.redex.IDxFCollectorShape230S0100000_2_I2) r0
            X.AnonymousClass0OU.A00(r4)
            goto L_0x0048
        L_0x0035:
            X.AnonymousClass0OU.A00(r4)
            java.lang.Object r0 = r6.A00
            X.6lN r0 = (X.C110256lN) r0
            X.4wF r0 = r0.A03
            X.C86124wJ.A1S(r6, r7, r5, r1)
            java.lang.Object r0 = r0.emit(r7, r5)
            if (r0 == r3) goto L_0x0028
            r0 = r6
        L_0x0048:
            java.lang.Object r0 = r0.A00
            X.6lN r0 = (X.C110256lN) r0
            androidx.paging.FlattenedPageController r0 = r0.A00
            X.C86164wN.A1N(r5)
            java.lang.Object r0 = r0.A00(r7, r5)
            if (r0 != r3) goto L_0x0026
            return r3
        L_0x0058:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r5.<init>(r6, r8, r3)
            goto L_0x0015
        L_0x005e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape230S0100000_2_I2.A05(X.3I2, X.8n9):java.lang.Object");
    }

    public IDxFCollectorShape230S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C113226qx r6, X.C146958n9 r7) {
        /*
            r5 = this;
            r3 = 17
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x0022
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r1) goto L_0x002b
            goto L_0x0027
        L_0x0022:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = X.C86114wI.A0x(r5, r7, r3)
            goto L_0x0016
        L_0x0027:
            X.AnonymousClass0OU.A00(r3)     // Catch:{ D3l -> 0x0040 }
            goto L_0x0040
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0030:
            X.AnonymousClass0OU.A00(r3)
            java.lang.Object r0 = r5.A00     // Catch:{ D3l -> 0x0040 }
            X.8m8 r0 = (X.C146368m8) r0     // Catch:{ D3l -> 0x0040 }
            r4.A00 = r1     // Catch:{ D3l -> 0x0040 }
            java.lang.Object r0 = r0.Cgt(r6, r4)     // Catch:{ D3l -> 0x0040 }
            if (r0 != r2) goto L_0x0040
            return r2
        L_0x0040:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape230S0100000_2_I2.A01(X.6qx, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        if (r1.A00 != true) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C106456f4 r13, X.C146958n9 r14) {
        /*
            r12 = this;
            r3 = 34
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r14)
            if (r0 == 0) goto L_0x00b2
            r5 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b2
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 != r4) goto L_0x00b9
            java.lang.Object r13 = r5.A02
            X.6f4 r13 = (X.C106456f4) r13
            java.lang.Object r0 = r5.A01
            com.facebook.redex.IDxFCollectorShape230S0100000_2_I2 r0 = (com.facebook.redex.IDxFCollectorShape230S0100000_2_I2) r0
            X.AnonymousClass0OU.A00(r1)
        L_0x002c:
            java.lang.Object r0 = r0.A00
            com.instagram.barcelona.profile.ui.ProfileViewModel r0 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r0
            com.instagram.user.model.User r2 = r13.A00
            X.7p1 r1 = r0.A07
            java.lang.String r0 = r2.getId()
            r1.A00 = r0
            java.lang.String r0 = r2.BK7()
            r1.A01 = r0
        L_0x0040:
            kotlin.Unit r3 = kotlin.Unit.A00
        L_0x0042:
            return r3
        L_0x0043:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.user.model.User r6 = r13.A00
            java.lang.String r1 = r6.getId()
            java.lang.Object r2 = r12.A00
            com.instagram.barcelona.profile.ui.ProfileViewModel r2 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r2
            java.lang.String r0 = r2.A00
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 != 0) goto L_0x0064
            java.lang.String r1 = r6.BK7()
            java.lang.String r0 = r2.A01
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0040
        L_0x0064:
            boolean r0 = r13 instanceof X.C964564x
            if (r0 == 0) goto L_0x0083
            com.instagram.barcelona.profile.ui.ProfileViewModel.A03(r2, r6)
            com.instagram.service.session.UserSession r0 = r2.A0D
            X.Drj r0 = X.C37088JkK.A00(r0)
            r0.A0C(r6)
            java.lang.String r0 = r6.getId()
            X.C86124wJ.A1S(r12, r13, r5, r4)
            java.lang.Object r0 = com.instagram.barcelona.profile.ui.ProfileViewModel.A00(r2, r0, r5)
            if (r0 == r3) goto L_0x0042
            r0 = r12
            goto L_0x002c
        L_0x0083:
            boolean r0 = r13 instanceof X.C964464w
            if (r0 == 0) goto L_0x0040
            X.4wE r3 = r2.A0I
        L_0x0089:
            java.lang.Object r2 = r3.getValue()
            r5 = r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2) r5
            r0 = r13
            X.64w r0 = (X.C964464w) r0
            X.6iH r1 = r0.A00
            if (r1 == 0) goto L_0x00a0
            boolean r0 = r1.A01
            if (r0 != r4) goto L_0x00a0
            boolean r0 = r1.A00
            r11 = 1
            if (r0 == r4) goto L_0x00a1
        L_0x00a0:
            r11 = 0
        L_0x00a1:
            r6 = 0
            r10 = 47
            r7 = r6
            r8 = r6
            r9 = r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2.A00(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x0089
            goto L_0x0040
        L_0x00b2:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r5.<init>(r12, r14, r3)
            goto L_0x0016
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape230S0100000_2_I2.A03(X.6f4, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1027:0x18b3, code lost:
        X.AnonymousClass0OU.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1030:0x18c2, code lost:
        if ((!r2) == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1031:0x18c4, code lost:
        r7.A00 = r5;
        r0 = r4.emit(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1032:0x18ca, code lost:
        if (r0 != r1) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1033:0x18cc, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1035:0x18db, code lost:
        r2.CrC(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x064d, code lost:
        r7.A00 = r5;
        r9 = r9;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0794, code lost:
        r2.A00 = r3;
        r0 = r4.emit(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a9d, code lost:
        if (r11 == null) goto L_0x0a9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0b0f, code lost:
        if (r1 != null) goto L_0x0b11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0b17, code lost:
        if (r2 < r1) goto L_0x0b1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b3e, code lost:
        if (r9 <= 0) goto L_0x0b40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b47, code lost:
        if (r1 == false) goto L_0x0b49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0ef9, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0fc1, code lost:
        r7.A00 = r5;
        r9 = r9;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0fc3, code lost:
        r0 = r6.emit(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x0ff5, code lost:
        r3 = X.C86124wJ.A17(r4, r6);
        r2 = X.AnonymousClass0wJ.A1X(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:769:0x118d, code lost:
        if (r2 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:770:0x118f, code lost:
        r7.A00 = r5;
        r0 = r3.emit(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:816:0x126e, code lost:
        X.AnonymousClass0OU.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:861:0x13e8, code lost:
        r1.CrC(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:885:0x145e, code lost:
        if (((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2) ((X.AnonymousClass5z1) r3).A00).A01 != false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:898:0x1494, code lost:
        if (r0 != X.AnonymousClass68D.LOADING) goto L_0x18c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:1023:0x18a6  */
    /* JADX WARNING: Removed duplicated region for block: B:1028:0x18b8  */
    /* JADX WARNING: Removed duplicated region for block: B:1094:0x0640 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05b1  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05be  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x065b  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x06e0  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0759  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0766  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x08a4  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08b1  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0a61  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:570:0x0c30  */
    /* JADX WARNING: Removed duplicated region for block: B:611:0x0d8e  */
    /* JADX WARNING: Removed duplicated region for block: B:615:0x0d9b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:682:0x0fac  */
    /* JADX WARNING: Removed duplicated region for block: B:686:0x0fb9  */
    /* JADX WARNING: Removed duplicated region for block: B:696:0x0fe8  */
    /* JADX WARNING: Removed duplicated region for block: B:708:0x101e  */
    /* JADX WARNING: Removed duplicated region for block: B:712:0x102b  */
    /* JADX WARNING: Removed duplicated region for block: B:764:0x117a  */
    /* JADX WARNING: Removed duplicated region for block: B:768:0x1187  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:794:0x1219  */
    /* JADX WARNING: Removed duplicated region for block: B:798:0x1226  */
    /* JADX WARNING: Removed duplicated region for block: B:812:0x1261  */
    /* JADX WARNING: Removed duplicated region for block: B:817:0x1273  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:854:0x13c6  */
    /* JADX WARNING: Removed duplicated region for block: B:858:0x13d3  */
    /* JADX WARNING: Removed duplicated region for block: B:876:0x143a  */
    /* JADX WARNING: Removed duplicated region for block: B:880:0x1447  */
    /* JADX WARNING: Removed duplicated region for block: B:893:0x1481  */
    /* JADX WARNING: Removed duplicated region for block: B:897:0x148e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:972:0x179d  */
    /* JADX WARNING: Removed duplicated region for block: B:976:0x17aa  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:986:0x17db  */
    /* JADX WARNING: Removed duplicated region for block: B:990:0x17e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r31, X.C146958n9 r32) {
        /*
            r30 = this;
            r4 = r30
            r0 = r31
            int r1 = r4.A01
            r6 = r32
            switch(r1) {
                case 2: goto L_0x18cd;
                case 3: goto L_0x1888;
                case 4: goto L_0x1839;
                case 5: goto L_0x000b;
                case 6: goto L_0x000b;
                case 7: goto L_0x1829;
                case 8: goto L_0x181c;
                case 9: goto L_0x1901;
                case 10: goto L_0x17bc;
                case 11: goto L_0x177e;
                case 12: goto L_0x18fa;
                case 13: goto L_0x1775;
                case 14: goto L_0x18f5;
                case 15: goto L_0x1762;
                case 16: goto L_0x1640;
                case 17: goto L_0x14e4;
                case 18: goto L_0x1498;
                case 19: goto L_0x1462;
                case 20: goto L_0x141b;
                case 21: goto L_0x13ed;
                case 22: goto L_0x13e2;
                case 23: goto L_0x13db;
                case 24: goto L_0x13db;
                case 25: goto L_0x13a7;
                case 26: goto L_0x12a7;
                case 27: goto L_0x1242;
                case 28: goto L_0x11fb;
                case 29: goto L_0x11ac;
                case 30: goto L_0x1197;
                case 31: goto L_0x115b;
                case 32: goto L_0x1033;
                case 33: goto L_0x0fff;
                case 34: goto L_0x000b;
                case 35: goto L_0x0fc9;
                case 36: goto L_0x0f8d;
                case 37: goto L_0x0f6b;
                case 38: goto L_0x0efe;
                case 39: goto L_0x0eed;
                case 40: goto L_0x0eac;
                case 41: goto L_0x0e91;
                case 42: goto L_0x0dc6;
                case 43: goto L_0x0d6f;
                case 44: goto L_0x0d3f;
                case 45: goto L_0x0d1f;
                case 46: goto L_0x0cf5;
                case 47: goto L_0x0cc5;
                case 48: goto L_0x0c98;
                case 49: goto L_0x0c3d;
                case 50: goto L_0x0c11;
                case 51: goto L_0x09fb;
                case 52: goto L_0x099d;
                case 53: goto L_0x0977;
                case 54: goto L_0x095b;
                case 55: goto L_0x18ee;
                case 56: goto L_0x093e;
                case 57: goto L_0x093e;
                case 58: goto L_0x08e7;
                case 59: goto L_0x18e7;
                case 60: goto L_0x08df;
                case 61: goto L_0x0885;
                case 62: goto L_0x0810;
                case 63: goto L_0x07fe;
                case 64: goto L_0x07d7;
                case 65: goto L_0x07c6;
                case 66: goto L_0x073a;
                case 67: goto L_0x06b4;
                case 68: goto L_0x05d7;
                case 69: goto L_0x0592;
                case 70: goto L_0x053f;
                case 71: goto L_0x04e9;
                case 72: goto L_0x04d1;
                case 73: goto L_0x0468;
                case 74: goto L_0x03f6;
                case 75: goto L_0x0397;
                case 76: goto L_0x038b;
                case 77: goto L_0x037f;
                case 78: goto L_0x036d;
                case 79: goto L_0x0361;
                case 80: goto L_0x0355;
                case 81: goto L_0x0349;
                case 82: goto L_0x02ec;
                case 83: goto L_0x029b;
                case 84: goto L_0x0245;
                case 85: goto L_0x01fb;
                case 86: goto L_0x01f3;
                case 87: goto L_0x01b0;
                case 88: goto L_0x0178;
                case 89: goto L_0x0163;
                case 90: goto L_0x00fb;
                case 91: goto L_0x18e0;
                case 92: goto L_0x00f3;
                case 93: goto L_0x0015;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r1 = r4.A00
            X.8pE r1 = (X.C147368pE) r1
            r1.CrC(r0)
        L_0x0012:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x0015:
            X.6Vj r0 = (X.C102486Vj) r0
            boolean r1 = r0 instanceof X.C965765q
            if (r1 == 0) goto L_0x00c9
            java.lang.Object r9 = r4.A00
            X.5wn r9 = (X.C94815wn) r9
            X.65q r0 = (X.C965765q) r0
            java.lang.Object r5 = r0.A01
            r4 = r5
            X.23z r4 = (X.C310423z) r4
            int r3 = r4.ordinal()
            r1 = 2
            if (r3 == r1) goto L_0x006a
            r2 = 0
            r1 = 2131837531(0x7f11425b, float:1.930826E38)
            if (r3 == r2) goto L_0x0036
            r1 = 2131837530(0x7f11425a, float:1.9308258E38)
        L_0x0036:
            java.lang.String r8 = X.C18180wK.A0g(r9, r1)
            r1 = 2131837219(0x7f114123, float:1.9307627E38)
            java.lang.String r7 = X.C18180wK.A0g(r9, r1)
            X.DrH r1 = X.C18230wP.A0a(r9)
            if (r1 == 0) goto L_0x004a
            r1.A0C()
        L_0x004a:
            java.lang.Object r0 = r0.A00
            if (r0 == r5) goto L_0x0012
            X.23z r0 = (X.C310423z) r0
            java.lang.String r6 = r0.name()
            java.lang.String r5 = r4.name()
            r0 = 38
            kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123 r4 = new kotlin.jvm.internal.KtLambdaShape143S0100000_I2_123
            r4.<init>(r9, r0)
            X.76U r3 = r9.A02
            if (r3 != 0) goto L_0x006e
            java.lang.String r0 = "snackBarLogger"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x006a:
            r1 = 2131837532(0x7f11425c, float:1.9308262E38)
            goto L_0x0036
        L_0x006e:
            boolean r2 = X.AnonymousClass0wJ.A1Z(r6, r5)
            X.3iD r1 = new X.3iD
            r1.<init>()
            r1.A0A = r8
            X.22b r0 = X.AnonymousClass22b.ICON
            r1.A0E(r0)
            r0 = 2131232972(0x7f0808cc, float:1.8082068E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B = r0
            r1.A0D = r7
            r0 = 5000(0x1388, float:7.006E-42)
            r1.A01 = r0
            X.7vu r0 = new X.7vu
            r0.<init>(r3, r4)
            r1.A07 = r0
            r1.A0I = r2
            X.3TR r2 = r1.A0B()
            java.lang.Integer r8 = X.AnonymousClass006.A0j
            java.lang.String r0 = "original_value"
            kotlin.Pair r1 = X.C18180wK.A0p(r0, r6)
            java.lang.String r0 = "new_value"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r5)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r1, r0}
            java.util.Map r10 = X.AnonymousClass4WJ.A0I(r0)
            X.79D r4 = r3.A01
            java.lang.String r9 = r3.A03
            X.9vW r5 = r3.A00
            java.lang.Integer r7 = X.AnonymousClass006.A00
            X.68t r6 = r3.A02
            r4.A01(r5, r6, r7, r8, r9, r10)
            X.KHr r1 = X.C38040KHr.A01
            X.H4Q r0 = new X.H4Q
            r0.<init>(r2)
            r1.CWx(r0)
            goto L_0x0012
        L_0x00c9:
            boolean r0 = r0 instanceof X.C965665p
            if (r0 == 0) goto L_0x0012
            X.GVD r2 = X.C25745DrH.A00
            java.lang.Object r1 = r4.A00
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.DrH r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x00e0
            r0.A0C()
        L_0x00e0:
            android.content.Context r3 = r1.requireContext()
            r2 = 2131834837(0x7f1137d5, float:1.9302796E38)
            r1 = 0
            r0 = 214(0xd6, float:3.0E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            X.C63813iO.A03(r3, r0, r2, r1)
            goto L_0x0012
        L_0x00f3:
            java.lang.Object r1 = r4.A00
            X.Adb r1 = (X.C18325Adb) r1
            X.4wE r1 = r1.A02
            goto L_0x13e8
        L_0x00fb:
            boolean r0 = r0 instanceof X.C23263CpB
            if (r0 == 0) goto L_0x0012
            java.lang.Object r3 = r4.A00
            X.5x9 r3 = (X.AnonymousClass5x9) r3
            android.view.View r5 = r3.A03
            java.lang.String r4 = "updateInfoToastView"
            if (r5 == 0) goto L_0x1908
            android.graphics.drawable.Drawable r0 = r3.A00
            if (r0 != 0) goto L_0x0127
            android.content.Context r2 = r5.getContext()
            r0 = 2131232575(0x7f08073f, float:1.8081263E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            r3.A00 = r1
            X.C04220Ms.A0A(r1)
            r0 = 2131099740(0x7f06005c, float:1.7811842E38)
            int r0 = r2.getColor(r0)
            r1.setTint(r0)
        L_0x0127:
            r0 = 2131301509(0x7f091485, float:1.8221078E38)
            android.view.View r1 = r5.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.drawable.Drawable r0 = r3.A00
            r1.setImageDrawable(r0)
            r0 = 2131303126(0x7f091ad6, float:1.8224358E38)
            android.widget.TextView r1 = X.C18180wK.A0G(r5, r0)
            r0 = 2131832291(0x7f112de3, float:1.9297632E38)
            X.C18180wK.A10(r1, r3, r0)
            r2 = 0
            r5.setVisibility(r2)
            android.view.View r1 = r3.A03
            if (r1 == 0) goto L_0x1908
            r0 = 2131307979(0x7f092dcb, float:1.82342E38)
            android.widget.TextView r1 = X.C18180wK.A0G(r1, r0)
            if (r1 == 0) goto L_0x0012
            r1.setVisibility(r2)
            r0 = 2131832321(0x7f112e01, float:1.9297693E38)
            X.C18180wK.A10(r1, r3, r0)
            r0 = 150(0x96, float:2.1E-43)
            X.C86104wH.A1C(r1, r0, r3)
            goto L_0x0012
        L_0x0163:
            java.lang.Object r4 = r4.A00
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r3 = 0
            r2 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape12S0200000_I2_7 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape12S0200000_I2_7
            r1.<init>(r0, r4, r3, r2)
            X.062 r0 = r4.getLifecycle()
            java.lang.Object r1 = X.C98346Fd.A00(r0, r6, r1)
            goto L_0x1824
        L_0x0178:
            r5 = 48
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r5, r6)
            if (r1 == 0) goto L_0x019e
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x019e
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x018e:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r3 = r7.A00
            r2 = 1
            if (r3 == 0) goto L_0x01a4
            if (r3 == r2) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x019e:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6
            r7.<init>(r4, r6, r5)
            goto L_0x018e
        L_0x01a4:
            X.4r0 r6 = X.C86124wJ.A17(r4, r6)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r9 = r0.A00
            r7.A00 = r2
            goto L_0x0fc3
        L_0x01b0:
            r5 = 47
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r5, r6)
            if (r1 == 0) goto L_0x01d6
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x01d6
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x01c6:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x01dc
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01d6:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6
            r7.<init>(r4, r6, r5)
            goto L_0x01c6
        L_0x01dc:
            X.4r0 r3 = X.C86124wJ.A17(r4, r6)
            r2 = r0
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r2 = r2.A01
            boolean r2 = X.AnonymousClass0wJ.A1X(r2)
            if (r2 == 0) goto L_0x0012
            r7.A00 = r5
            java.lang.Object r0 = r3.emit(r0, r7)
            goto L_0x18ca
        L_0x01f3:
            java.lang.Object r1 = r4.A00
            com.instagram.monetization.repository.MonetizationRepository r1 = (com.instagram.monetization.repository.MonetizationRepository) r1
            X.4wE r1 = r1.A0D
            goto L_0x13e8
        L_0x01fb:
            r5 = 23
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r5, r6)
            if (r1 == 0) goto L_0x0221
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0221
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x0211:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x0227
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0221:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6
            r7.<init>(r4, r6, r5)
            goto L_0x0211
        L_0x0227:
            X.4r0 r3 = X.C86124wJ.A17(r4, r6)
            X.6Pk r0 = (X.C100976Pk) r0
            boolean r2 = r0 instanceof X.AnonymousClass5z2
            if (r2 == 0) goto L_0x0243
            X.5z2 r0 = (X.AnonymousClass5z2) r0
            java.lang.Object r0 = r0.A00
            X.4vm r0 = (X.C85794vm) r0
            java.lang.Object r0 = r0.D7H()
        L_0x023b:
            r7.A00 = r5
            java.lang.Object r0 = r3.emit(r0, r7)
            goto L_0x18ca
        L_0x0243:
            r0 = 0
            goto L_0x023b
        L_0x0245:
            r5 = 18
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r5, r6)
            if (r1 == 0) goto L_0x026b
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x026b
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x025b:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x0271
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x026b:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6
            r7.<init>(r4, r6, r5)
            goto L_0x025b
        L_0x0271:
            X.4r0 r3 = X.C86124wJ.A17(r4, r6)
            X.3b6 r0 = (X.C62903b6) r0
            boolean r2 = r0 instanceof X.AnonymousClass1jA
            if (r2 == 0) goto L_0x0296
            X.1jA r0 = (X.AnonymousClass1jA) r0
            java.lang.Object r0 = r0.A00
            X.5tc r0 = (X.C94015tc) r0
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
            java.util.List r0 = r0.A00
            r2.addAll((java.lang.Iterable) r0)
            com.google.common.collect.ImmutableList r0 = r2.build()
        L_0x028e:
            r7.A00 = r5
            java.lang.Object r0 = r3.emit(r0, r7)
            goto L_0x18ca
        L_0x0296:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            goto L_0x028e
        L_0x029b:
            r5 = 0
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6.A00(r5, r6)
            if (r1 == 0) goto L_0x02c0
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x02c0
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x02b0:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x02c6
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x02c0:
            kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6
            r7.<init>(r4, r6, r5)
            goto L_0x02b0
        L_0x02c6:
            X.4r0 r3 = X.C86124wJ.A17(r4, r6)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r0
            java.lang.Object r2 = r0.A00
            X.EUq r2 = (X.C26743EUq) r2
            if (r2 == 0) goto L_0x02e9
            java.lang.Object r2 = r2.A04()
            java.io.File r2 = (java.io.File) r2
            if (r2 == 0) goto L_0x02e7
            r0 = -1
            com.instagram.common.typedurl.ImageUrl r0 = X.AnonymousClass3WG.A01(r2, r0, r0)
        L_0x02df:
            r7.A00 = r5
            java.lang.Object r0 = r3.emit(r0, r7)
            goto L_0x18ca
        L_0x02e7:
            r0 = 0
            goto L_0x02df
        L_0x02e9:
            java.lang.Object r0 = r0.A01
            goto L_0x02df
        L_0x02ec:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1) r0
            java.lang.Object r5 = r4.A00
            X.57T r5 = (X.AnonymousClass57T) r5
            X.4wE r4 = r5.A04
        L_0x02f4:
            java.lang.Object r6 = r4.getValue()
            r7 = r6
            X.5IH r7 = (X.AnonymousClass5IH) r7
            java.lang.Object r10 = r0.A00
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r11 = r0.A01
            java.util.List r11 = (java.util.List) r11
            java.lang.Integer r1 = X.AnonymousClass006.A01
            boolean r14 = X.C18180wK.A1Z(r10, r1)
            java.util.Iterator r3 = r11.iterator()
        L_0x030d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0347
            java.lang.Object r8 = r3.next()
            r1 = r8
            com.instagram.api.schemas.ProfileTheme r1 = (com.instagram.api.schemas.ProfileTheme) r1
            java.lang.String r2 = r1.A04
            java.lang.String r1 = r5.A03
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x030d
        L_0x0324:
            com.instagram.api.schemas.ProfileTheme r8 = (com.instagram.api.schemas.ProfileTheme) r8
            boolean r12 = r7.A08
            boolean r13 = r7.A06
            boolean r15 = r7.A07
            boolean r3 = r7.A09
            boolean r2 = r7.A04
            X.676 r9 = r7.A01
            r1 = 0
            X.C04220Ms.A0B(r10, r1)
            X.5IH r7 = new X.5IH
            r17 = r2
            r16 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r1 = r4.ADi(r6, r7)
            if (r1 == 0) goto L_0x02f4
            goto L_0x0012
        L_0x0347:
            r8 = 0
            goto L_0x0324
        L_0x0349:
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            java.lang.Object r0 = r4.A00
            X.5xT r0 = (X.AnonymousClass5xT) r0
            r0.A00 = r1
            goto L_0x0012
        L_0x0355:
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            java.lang.Object r0 = r4.A00
            X.5xW r0 = (X.AnonymousClass5xW) r0
            r0.A02 = r1
            goto L_0x0012
        L_0x0361:
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            java.lang.Object r0 = r4.A00
            X.5xW r0 = (X.AnonymousClass5xW) r0
            r0.A03 = r1
            goto L_0x0012
        L_0x036d:
            int r0 = X.AnonymousClass0wJ.A04(r0)
            java.lang.Object r1 = r4.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            if (r0 != 0) goto L_0x037b
            X.676 r0 = X.AnonymousClass676.Theme
            goto L_0x0ef9
        L_0x037b:
            X.676 r0 = X.AnonymousClass676.Photo
            goto L_0x0ef9
        L_0x037f:
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            java.lang.Object r0 = r4.A00
            X.5xS r0 = (X.AnonymousClass5xS) r0
            r0.A00 = r1
            goto L_0x0012
        L_0x038b:
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            java.lang.Object r0 = r4.A00
            X.5xU r0 = (X.AnonymousClass5xU) r0
            r0.A01 = r1
            goto L_0x0012
        L_0x0397:
            r7 = 47
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r7, r6)
            if (r1 == 0) goto L_0x03bd
            r5 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x03bd
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x03ad:
            java.lang.Object r6 = r5.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r5.A00
            r7 = 1
            if (r2 == 0) goto L_0x03c3
            if (r2 == r7) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x03bd:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r5.<init>(r4, r6, r7)
            goto L_0x03ad
        L_0x03c3:
            X.4r0 r4 = X.C86124wJ.A17(r4, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x03d1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03ee
            java.lang.Object r0 = r2.next()
            X.CKW r0 = (X.CKW) r0
            java.lang.String r10 = r0.A07
            java.lang.String r11 = r0.A0A
            int r9 = r0.A00
            long r12 = r0.A01
            X.5MZ r8 = new X.5MZ
            r8.<init>(r9, r10, r11, r12)
            r3.add(r8)
            goto L_0x03d1
        L_0x03ee:
            r5.A00 = r7
            java.lang.Object r0 = r4.emit(r3, r5)
            goto L_0x18ca
        L_0x03f6:
            r5 = 46
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r5, r6)
            if (r1 == 0) goto L_0x041c
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x041c
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x040c:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x0422
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x041c:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r7.<init>(r4, r6, r5)
            goto L_0x040c
        L_0x0422:
            X.4r0 r6 = X.C86124wJ.A17(r4, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r3 = r0.iterator()
        L_0x0430:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0445
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.CKW r0 = (X.CKW) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0430
            r4.add(r2)
            goto L_0x0430
        L_0x0445:
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = r4.iterator()
        L_0x044d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x064d
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.CKW r0 = (X.CKW) r0
            X.D2O r2 = r0.A03
            X.D2O r0 = X.D2O.CLIPS
            if (r2 == r0) goto L_0x0464
            X.D2O r0 = X.D2O.FEED_POST
            if (r2 != r0) goto L_0x044d
        L_0x0464:
            r9.add(r3)
            goto L_0x044d
        L_0x0468:
            r5 = 42
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r5, r6)
            if (r1 == 0) goto L_0x048e
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x048e
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x047e:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x0494
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x048e:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r7.<init>(r4, r6, r5)
            goto L_0x047e
        L_0x0494:
            X.4r0 r6 = X.C86124wJ.A17(r4, r6)
            X.5HY r0 = (X.AnonymousClass5HY) r0
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            X.C04220Ms.A0B(r0, r5)
            java.util.List r2 = r0.A03
            java.util.Iterator r4 = r2.iterator()
        L_0x04a7:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x04b9
            java.lang.Object r3 = r4.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r3
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            X.C100956Pi.A00(r3, r2, r8)
            goto L_0x04a7
        L_0x04b9:
            java.util.List r10 = r0.A02
            java.util.Iterator r4 = r10.iterator()
        L_0x04bf:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x062c
            java.lang.Object r3 = r4.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r3
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            X.C100956Pi.A00(r3, r2, r8)
            goto L_0x04bf
        L_0x04d1:
            X.6e2 r0 = (X.C105816e2) r0
            java.lang.Object r1 = r4.A00
            X.57C r1 = (X.AnonymousClass57C) r1
            X.4wE r3 = r1.A02
            if (r0 == 0) goto L_0x04e6
            java.lang.String r1 = r0.A00
            r0 = 9
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r2 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2
            r2.<init>(r1, r0)
            goto L_0x1402
        L_0x04e6:
            r2 = 0
            goto L_0x1402
        L_0x04e9:
            r5 = 31
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r5, r6)
            if (r1 == 0) goto L_0x050f
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x050f
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x04ff:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x0515
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x050f:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r7.<init>(r4, r6, r5)
            goto L_0x04ff
        L_0x0515:
            X.4r0 r4 = X.C86124wJ.A17(r4, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0523:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0537
            java.lang.Object r0 = r2.next()
            X.DYI r0 = (X.DYI) r0
            X.CKW r0 = X.C25561Dnx.A00(r0)
            r3.add(r0)
            goto L_0x0523
        L_0x0537:
            r7.A00 = r5
            java.lang.Object r0 = r4.emit(r3, r7)
            goto L_0x18ca
        L_0x053f:
            r5 = 28
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r5, r6)
            if (r1 == 0) goto L_0x0565
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0565
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x0555:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x056b
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0565:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r7.<init>(r4, r6, r5)
            goto L_0x0555
        L_0x056b:
            X.4r0 r6 = X.C86124wJ.A17(r4, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r3 = r0.iterator()
        L_0x0579:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x058e
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.CKW r0 = (X.CKW) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0579
            r9.add(r2)
            goto L_0x0579
        L_0x058e:
            r7.A00 = r5
            goto L_0x0fc3
        L_0x0592:
            r5 = 27
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r5, r6)
            if (r1 == 0) goto L_0x05b8
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x05b8
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x05a8:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x05be
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x05b8:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r7.<init>(r4, r6, r5)
            goto L_0x05a8
        L_0x05be:
            X.4r0 r4 = X.C86124wJ.A17(r4, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r3 = 8
            com.facebook.redex.IDxComparatorShape95S0000000_2_I2 r2 = new com.facebook.redex.IDxComparatorShape95S0000000_2_I2
            r2.<init>(r3)
            java.util.List r0 = X.AnonymousClass00J.A0W(r0, r2)
            r7.A00 = r5
            java.lang.Object r0 = r4.emit(r0, r7)
            goto L_0x18ca
        L_0x05d7:
            r5 = 26
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r5, r6)
            if (r1 == 0) goto L_0x05fd
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x05fd
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x05ed:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x0603
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x05fd:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r7.<init>(r4, r6, r5)
            goto L_0x05ed
        L_0x0603:
            X.4r0 r6 = X.C86124wJ.A17(r4, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = r0.iterator()
        L_0x0611:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x064d
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.CKW r0 = (X.CKW) r0
            X.D2O r2 = r0.A03
            X.D2O r0 = X.D2O.CLIPS
            if (r2 == r0) goto L_0x0628
            X.D2O r0 = X.D2O.FEED_POST
            if (r2 != r0) goto L_0x0611
        L_0x0628:
            r9.add(r3)
            goto L_0x0611
        L_0x062c:
            X.9Rz r4 = r0.A01
            boolean r2 = r4.A02
            if (r2 != 0) goto L_0x0640
            boolean r2 = r4.A03
            if (r2 != 0) goto L_0x0640
            boolean r2 = r10 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0651
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x0651
        L_0x0640:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1100000_I2 r3 = r0.A00
            X.8Pa r2 = X.C139718Pa.A00
            java.util.List r0 = X.C121407Fu.A03(r0, r2)
            X.9AJ r9 = new X.9AJ
            r9.<init>(r3, r4, r8, r0)
        L_0x064d:
            r7.A00 = r5
            goto L_0x0fc3
        L_0x0651:
            java.util.Iterator r11 = r10.iterator()
        L_0x0655:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0640
            java.lang.Object r2 = r11.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r2
            java.lang.Object r2 = r2.A01
            X.9S0 r2 = (X.AnonymousClass9S0) r2
            java.lang.Integer r3 = r2.A04
            java.lang.Integer r9 = X.AnonymousClass006.A00
            if (r3 == r9) goto L_0x066f
            java.lang.Integer r2 = X.AnonymousClass006.A01
            if (r3 != r2) goto L_0x0655
        L_0x066f:
            boolean r2 = r0.A04
            if (r2 == 0) goto L_0x06ae
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r10 = r10.iterator()
        L_0x067b:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0694
            java.lang.Object r3 = r10.next()
            r2 = r3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r2
            java.lang.Object r2 = r2.A01
            X.9S0 r2 = (X.AnonymousClass9S0) r2
            java.lang.Integer r2 = r2.A04
            if (r2 != r9) goto L_0x067b
            r11.add(r3)
            goto L_0x067b
        L_0x0694:
            boolean r2 = X.C18190wL.A1a(r11)
            if (r2 == 0) goto L_0x0640
            java.util.Iterator r3 = r11.iterator()
        L_0x069e:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0640
            java.lang.Object r2 = r3.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r2
            X.C100956Pi.A00(r2, r9, r8)
            goto L_0x069e
        L_0x06ae:
            X.5yA r2 = X.AnonymousClass5yA.A00
            r8.add(r2)
            goto L_0x0640
        L_0x06b4:
            r7 = 14
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r7, r6)
            if (r1 == 0) goto L_0x06da
            r2 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r2 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r2
            int r5 = r2.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r3
            if (r1 == 0) goto L_0x06da
            int r5 = r5 - r3
            r2.A00 = r5
        L_0x06ca:
            java.lang.Object r6 = r2.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r5 = r2.A00
            r3 = 1
            if (r5 == 0) goto L_0x06e0
            if (r5 == r3) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x06da:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r2 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r2.<init>(r4, r6, r7)
            goto L_0x06ca
        L_0x06e0:
            X.4r0 r4 = X.C86124wJ.A17(r4, r6)
            X.6Pk r0 = (X.C100976Pk) r0
            boolean r5 = r0 instanceof X.AnonymousClass5z2
            if (r5 == 0) goto L_0x0714
            r11 = 0
            X.5z2 r0 = (X.AnonymousClass5z2) r0
            java.lang.Object r5 = r0.A00
            X.6l4 r5 = (X.C110066l4) r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r0 = r5.A00
            r7 = 0
            if (r0 == 0) goto L_0x0712
            java.lang.String r8 = r0.A00
        L_0x06f8:
            java.util.List r6 = r5.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r0 = r5.A01
            if (r0 == 0) goto L_0x0710
            java.lang.String r9 = r0.A00
        L_0x0700:
            if (r0 == 0) goto L_0x0708
            boolean r0 = r0.A01
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x0708:
            r10 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0794
        L_0x0710:
            r9 = r7
            goto L_0x0700
        L_0x0712:
            r8 = r7
            goto L_0x06f8
        L_0x0714:
            boolean r5 = r0 instanceof X.AnonymousClass5z3
            if (r5 == 0) goto L_0x0724
            r6 = 0
            r10 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2
            r7 = r6
            r8 = r6
            r9 = r6
            r11 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0794
        L_0x0724:
            boolean r5 = r0 instanceof X.AnonymousClass5z1
            if (r5 == 0) goto L_0x190d
            r11 = 0
            X.5z1 r0 = (X.AnonymousClass5z1) r0
            java.lang.Object r8 = r0.A00
            java.lang.String r8 = (java.lang.String) r8
            X.0ZV r6 = X.AnonymousClass0ZV.A00
            r7 = 0
            r10 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2
            r9 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0794
        L_0x073a:
            r7 = 13
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r7, r6)
            if (r1 == 0) goto L_0x0760
            r2 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r2 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r2
            int r5 = r2.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r3
            if (r1 == 0) goto L_0x0760
            int r5 = r5 - r3
            r2.A00 = r5
        L_0x0750:
            java.lang.Object r6 = r2.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r5 = r2.A00
            r3 = 1
            if (r5 == 0) goto L_0x0766
            if (r5 == r3) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0760:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r2 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r2.<init>(r4, r6, r7)
            goto L_0x0750
        L_0x0766:
            X.4r0 r4 = X.C86124wJ.A17(r4, r6)
            X.6Pk r0 = (X.C100976Pk) r0
            boolean r5 = r0 instanceof X.AnonymousClass5z2
            if (r5 == 0) goto L_0x07a0
            r11 = 0
            X.5z2 r0 = (X.AnonymousClass5z2) r0
            java.lang.Object r5 = r0.A00
            X.6l4 r5 = (X.C110066l4) r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r0 = r5.A00
            r7 = 0
            if (r0 == 0) goto L_0x079e
            java.lang.String r8 = r0.A00
        L_0x077e:
            java.util.List r6 = r5.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r0 = r5.A01
            if (r0 == 0) goto L_0x079c
            java.lang.String r9 = r0.A00
        L_0x0786:
            if (r0 == 0) goto L_0x078e
            boolean r0 = r0.A01
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
        L_0x078e:
            r10 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x0794:
            r2.A00 = r3
            java.lang.Object r0 = r4.emit(r5, r2)
            goto L_0x18ca
        L_0x079c:
            r9 = r7
            goto L_0x0786
        L_0x079e:
            r8 = r7
            goto L_0x077e
        L_0x07a0:
            boolean r5 = r0 instanceof X.AnonymousClass5z3
            if (r5 == 0) goto L_0x07b0
            r6 = 0
            r10 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2
            r7 = r6
            r8 = r6
            r9 = r6
            r11 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0794
        L_0x07b0:
            boolean r5 = r0 instanceof X.AnonymousClass5z1
            if (r5 == 0) goto L_0x1912
            r11 = 0
            X.5z1 r0 = (X.AnonymousClass5z1) r0
            java.lang.Object r8 = r0.A00
            java.lang.String r8 = (java.lang.String) r8
            X.0ZV r6 = X.AnonymousClass0ZV.A00
            r7 = 0
            r10 = 4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r5 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2
            r9 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0794
        L_0x07c6:
            boolean r1 = X.AnonymousClass0wJ.A1X(r0)
            java.lang.Object r0 = r4.A00
            X.Ib9 r0 = (X.Ib9) r0
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r0.A00
            if (r0 == 0) goto L_0x0012
            r0.setPrimaryButtonEnabled(r1)
            goto L_0x0012
        L_0x07d7:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2) r0
            boolean r1 = r0.A01
            if (r1 != 0) goto L_0x07f3
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x07f3
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x07f3
            java.lang.Object r0 = r4.A00
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r0 = (com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController) r0
            java.lang.Object r1 = com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController.A00(r0, r1, r6)
            goto L_0x1824
        L_0x07f3:
            java.lang.Object r0 = r4.A00
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r0 = (com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            X.C86154wM.A1H(r0)
            goto L_0x0012
        L_0x07fe:
            X.6Pk r0 = (X.C100976Pk) r0
            boolean r1 = r0 instanceof X.AnonymousClass5z2
            if (r1 == 0) goto L_0x0012
            java.lang.Object r1 = r4.A00
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r1 = (com.instagram.brandedcontent.repository.BrandedContentSettingsRepository) r1
            X.4wE r3 = r1.A06
            X.5z2 r0 = (X.AnonymousClass5z2) r0
            java.lang.Object r2 = r0.A00
            goto L_0x1402
        L_0x0810:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.api.schemas.ProductGatingDecision>"
            X.C04220Ms.A0C(r0, r1)
            java.util.List r6 = X.C03940Lk.A01(r0)
            java.util.Iterator r3 = r6.iterator()
        L_0x081d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x087e
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.5Hl r0 = (X.C89895Hl) r0
            com.instagram.api.schemas.UserMonetizationProductType r1 = r0.A08
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT
            if (r1 != r0) goto L_0x081d
        L_0x0830:
            X.5Hl r2 = (X.C89895Hl) r2
            if (r2 == 0) goto L_0x083f
            java.lang.Object r0 = r4.A00
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r0 = (com.instagram.brandedcontent.repository.BrandedContentSettingsRepository) r0
            X.4wE r1 = r0.A06
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0111000_I2 r0 = r2.A02
            r1.CrC(r0)
        L_0x083f:
            java.lang.Object r0 = r4.A00
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r0 = (com.instagram.brandedcontent.repository.BrandedContentSettingsRepository) r0
            X.4wE r5 = r0.A07
            java.lang.Object r0 = r5.getValue()
            java.util.Iterator r4 = X.C86144wL.A0y(r0)
        L_0x084d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0880
            java.lang.Object r3 = r4.next()
            X.5Hl r3 = (X.C89895Hl) r3
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0867
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0867
        L_0x0863:
            r6.add(r3)
            goto L_0x084d
        L_0x0867:
            java.util.Iterator r2 = r6.iterator()
        L_0x086b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0863
            java.lang.Object r0 = r2.next()
            X.5Hl r0 = (X.C89895Hl) r0
            com.instagram.api.schemas.UserMonetizationProductType r1 = r0.A08
            com.instagram.api.schemas.UserMonetizationProductType r0 = r3.A08
            if (r1 != r0) goto L_0x086b
            goto L_0x084d
        L_0x087e:
            r2 = 0
            goto L_0x0830
        L_0x0880:
            r5.CrC(r6)
            goto L_0x0012
        L_0x0885:
            r5 = 8
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r5, r6)
            if (r1 == 0) goto L_0x08ab
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x08ab
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x089b:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x08b1
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x08ab:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2
            r7.<init>(r4, r6, r5)
            goto L_0x089b
        L_0x08b1:
            X.4r0 r4 = X.C86124wJ.A17(r4, r6)
            X.6Pk r0 = (X.C100976Pk) r0
            boolean r3 = r0 instanceof X.AnonymousClass5z1
            r2 = 0
            if (r3 != 0) goto L_0x08ce
            boolean r3 = r0 instanceof X.AnonymousClass5z2
            if (r3 == 0) goto L_0x08d6
            X.5z2 r0 = (X.AnonymousClass5z2) r0
            java.lang.Object r0 = r0.A00
            X.4vm r0 = (X.C85794vm) r0
            java.lang.Object r0 = r0.D7H()
            X.6dC r0 = (X.C105296dC) r0
            java.util.List r2 = r0.A00
        L_0x08ce:
            r7.A00 = r5
            java.lang.Object r0 = r4.emit(r2, r7)
            goto L_0x18ca
        L_0x08d6:
            boolean r0 = r0 instanceof X.AnonymousClass5z3
            if (r0 != 0) goto L_0x08ce
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x08df:
            java.lang.Object r1 = r4.A00
            com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository r1 = (com.instagram.brandedcontent.ads.repository.BCAApprovePostsForPromotionRepository) r1
            X.4wE r1 = r1.A01
            goto L_0x13e8
        L_0x08e7:
            java.util.Map r0 = (java.util.Map) r0
            X.66y r3 = X.C968566y.Posts
            java.lang.Object r6 = r4.A00
            com.instagram.barcelona.profile.ui.ProfileViewModel r6 = (com.instagram.barcelona.profile.ui.ProfileViewModel) r6
            java.lang.Object r1 = r0.get(r3)
            java.lang.String r5 = "Required value was null."
            if (r1 == 0) goto L_0x191c
            java.util.List r1 = (java.util.List) r1
            java.util.List r2 = com.instagram.barcelona.profile.ui.ProfileViewModel.A01(r6, r1)
            r4 = 19
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2
            r1.<init>((java.util.List) r2, (int) r4)
            kotlin.Pair r3 = X.C18180wK.A0p(r3, r1)
            X.66y r2 = X.C968566y.Replies
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x1917
            java.util.List r0 = (java.util.List) r0
            java.util.List r1 = com.instagram.barcelona.profile.ui.ProfileViewModel.A01(r6, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2
            r0.<init>((java.util.List) r1, (int) r4)
            kotlin.Pair r0 = X.C18180wK.A0p(r2, r0)
            java.util.Map r7 = X.AnonymousClass4WJ.A0G(r3, r0)
            X.4wE r2 = r6.A0I
        L_0x0925:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2) r3
            r4 = 0
            r9 = 0
            r8 = 55
            r5 = r4
            r6 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0510000_I2.A00(r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0925
            goto L_0x0012
        L_0x093e:
            java.lang.Object r0 = r4.A00
            X.57k r0 = (X.C882757k) r0
            X.4wE r3 = r0.A0D
        L_0x0944:
            java.lang.Object r2 = r3.getValue()
            int r0 = X.AnonymousClass0wJ.A04(r2)
            int r1 = r0 + 1
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x0944
            goto L_0x0012
        L_0x095b:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r4.A00
            com.instagram.barcelona.profile.editor.ProfilePictureDelegateImpl r3 = (com.instagram.barcelona.profile.editor.ProfilePictureDelegateImpl) r3
            X.6db r1 = r3.A02
            X.4wE r2 = r1.A00
            r1 = 0
            r2.CrC(r1)
            java.io.File r0 = X.C86144wL.A0Z(r0)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            java.lang.Object r1 = com.instagram.barcelona.profile.editor.ProfilePictureDelegateImpl.A00(r0, r3, r6)
            goto L_0x1824
        L_0x0977:
            X.5Im r0 = (X.AnonymousClass5Im) r0
            java.lang.Object r1 = r4.A00
            X.58X r1 = (X.AnonymousClass58X) r1
            X.4wE r6 = r1.A01
        L_0x097f:
            java.lang.Object r5 = r6.getValue()
            r1 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2) r1
            boolean r4 = r1.A03
            boolean r3 = r1.A02
            boolean r2 = r1.A01
            r1 = 0
            X.C04220Ms.A0B(r0, r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2
            r1.<init>((X.AnonymousClass5Im) r0, (boolean) r4, (boolean) r3, (boolean) r2)
            boolean r1 = r6.ADi(r5, r1)
            if (r1 == 0) goto L_0x097f
            goto L_0x0012
        L_0x099d:
            X.E6C r0 = (X.E6C) r0
            com.instagram.pendingmedia.model.PendingMedia r3 = r0.A00
            java.lang.String r1 = r3.A2o
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r4.A00
            com.instagram.barcelona.profile.data.ProfileFeedDataSource r2 = (com.instagram.barcelona.profile.data.ProfileFeedDataSource) r2
            com.instagram.service.session.UserSession r6 = r2.A07
            com.instagram.pendingmedia.store.PendingMediaStore r0 = com.instagram.pendingmedia.store.PendingMediaStore.A01(r6)
            com.instagram.pendingmedia.model.PendingMedia r5 = r0.A06(r1)
            if (r5 == 0) goto L_0x0012
            java.util.List r0 = r5.A3z
            X.C04220Ms.A06(r0)
            java.lang.Object r0 = X.AnonymousClass00J.A0F(r0)
            com.instagram.pendingmedia.model.PendingMedia r0 = (com.instagram.pendingmedia.model.PendingMedia) r0
            if (r0 == 0) goto L_0x09f9
            java.lang.String r1 = r0.A2Y
        L_0x09c4:
            java.lang.String r0 = r3.A2Y
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0012
            X.66y r4 = r2.A04
            X.66y r0 = X.C968566y.Posts
            if (r4 != r0) goto L_0x09d6
            java.lang.String r0 = r5.A2w
            if (r0 == 0) goto L_0x09de
        L_0x09d6:
            X.66y r0 = X.C968566y.Replies
            if (r4 != r0) goto L_0x0012
            java.lang.String r0 = r5.A2w
            if (r0 == 0) goto L_0x0012
        L_0x09de:
            X.4wE r3 = r2.A08
        L_0x09e0:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            java.util.List r1 = (java.util.List) r1
            X.66y r0 = X.C968566y.Replies
            boolean r0 = X.C18180wK.A1Z(r4, r0)
            java.util.List r0 = X.C117936zU.A01(r5, r6, r1, r0)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x09e0
            goto L_0x0012
        L_0x09f9:
            r1 = 0
            goto L_0x09c4
        L_0x09fb:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r3 = r4.A00
            X.57x r3 = (X.C884057x) r3
            X.Awj r2 = r3.A08
            java.lang.String r1 = r3.A0D
            X.BKU r5 = r2.A05(r1)
            if (r5 == 0) goto L_0x0ae8
            int r1 = r5.A04
            if (r1 == 0) goto L_0x0ae8
            r28 = 1
            java.lang.Object r6 = r0.A01
            java.util.List r6 = (java.util.List) r6
            boolean r1 = X.C18190wL.A1a(r6)
            if (r1 == 0) goto L_0x0aea
            java.lang.Object r1 = X.AnonymousClass00J.A0C(r6)
            java.util.List r1 = X.C18180wK.A0n(r1)
        L_0x0a23:
            java.util.List r11 = X.C884057x.A00(r3, r1)
            boolean r1 = r11.isEmpty()
            r7 = 0
            if (r1 == 0) goto L_0x0aa1
            if (r5 == 0) goto L_0x0ae5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2
            r1.<init>((X.BKU) r5)
        L_0x0a35:
            r3.A00 = r1
            java.lang.String r1 = r3.A0C
            X.BKU r1 = r2.A05(r1)
            if (r1 == 0) goto L_0x0ae2
            X.BKN r1 = r1.A0f
            X.5Ml r1 = r1.A1J
            if (r1 == 0) goto L_0x0adf
            java.lang.Integer r1 = r1.A08
            if (r1 == 0) goto L_0x0adf
            int r2 = r1.intValue()
        L_0x0a4d:
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r2)
            int r1 = r1.intValue()
            if (r1 <= 0) goto L_0x0ae2
            X.7pG r9 = new X.7pG
            r9.<init>(r1)
        L_0x0a5d:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2 r4 = r3.A00
            if (r4 == 0) goto L_0x0a9f
            r2 = 0
            boolean r1 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2.A00(r2, r4)
            if (r1 == 0) goto L_0x0ada
            java.lang.Object r1 = r4.A00
            X.BKU r1 = (X.BKU) r1
            java.lang.String r8 = r1.A0N
        L_0x0a6e:
            X.C04220Ms.A09(r8)
            com.instagram.api.schemas.LineType r12 = com.instagram.api.schemas.LineType.LINE
            X.0ZV r15 = X.AnonymousClass0ZV.A00
            r16 = 1
            X.5IF r10 = new X.5IF
            r11 = r4
            r13 = r9
            r14 = r7
            r17 = r2
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.List r2 = X.C18180wK.A0n(r10)
            com.instagram.api.schemas.ThreadContainerType r1 = com.instagram.api.schemas.ThreadContainerType.THREAD
            X.5HQ r4 = new X.5HQ
            r4.<init>(r1, r8, r7, r2)
            java.lang.Integer r2 = X.AnonymousClass006.A00
            X.5I1 r1 = new X.5I1
            r1.<init>(r4, r2)
            java.util.List r1 = X.C18180wK.A0n(r1)
            java.util.List r11 = X.C884057x.A00(r3, r1)
            if (r11 != 0) goto L_0x0aa1
        L_0x0a9f:
            X.0ZV r11 = X.AnonymousClass0ZV.A00
        L_0x0aa1:
            com.instagram.service.session.UserSession r4 = r3.A0A
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r1 = 36328538491595197(0x81109d000029bd, double:3.0376522531432395E-306)
            boolean r1 = X.C63803iN.A0E(r8, r4, r1)
            if (r1 == 0) goto L_0x0b19
            java.lang.Object r1 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r1
            if (r1 == 0) goto L_0x0b19
            java.lang.String r1 = r1.A01
            if (r1 != 0) goto L_0x0b19
            java.util.Iterator r9 = r6.iterator()
            r2 = 0
        L_0x0abf:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0af1
            java.lang.Object r8 = r9.next()
            X.5I1 r8 = (X.AnonymousClass5I1) r8
            java.lang.Integer r6 = r8.A01
            java.lang.Integer r1 = X.AnonymousClass006.A01
            if (r6 != r1) goto L_0x0abf
            X.5HQ r1 = r8.A00
            java.util.List r1 = r1.A03
            int r2 = X.C86164wN.A06(r1, r2)
            goto L_0x0abf
        L_0x0ada:
            java.lang.String r8 = r4.A01()
            goto L_0x0a6e
        L_0x0adf:
            r2 = 0
            goto L_0x0a4d
        L_0x0ae2:
            r9 = r7
            goto L_0x0a5d
        L_0x0ae5:
            r1 = r7
            goto L_0x0a35
        L_0x0ae8:
            r28 = 0
        L_0x0aea:
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            r6 = r1
            goto L_0x0a23
        L_0x0af1:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2 r6 = r3.A00
            if (r6 == 0) goto L_0x0b79
            int r1 = r6.A01
            if (r1 != 0) goto L_0x0b77
            java.lang.Object r1 = r6.A00
            X.BKU r1 = (X.BKU) r1
            X.BKN r1 = r1.A0f
            X.5Ml r1 = r1.A1J
            if (r1 == 0) goto L_0x0b77
            java.lang.Integer r1 = r1.A08
            if (r1 == 0) goto L_0x0b77
            int r1 = r1.intValue()
        L_0x0b0b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x0b79
        L_0x0b11:
            int r1 = r1.intValue()
        L_0x0b15:
            r29 = 1
            if (r2 < r1) goto L_0x0b1b
        L_0x0b19:
            r29 = 0
        L_0x0b1b:
            java.lang.Object r10 = r0.A02
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r12 = r0.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2 r12 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2) r12
            java.util.Iterator r5 = r11.iterator()
            r2 = 0
            r9 = 0
        L_0x0b29:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0b75
            java.lang.Object r0 = r5.next()
            X.8mY r0 = (X.C146628mY) r0
            X.67q r1 = r0.BIh()
            X.67q r0 = X.C970267q.TARGET_POST
            if (r1 != r0) goto L_0x0b72
            r1 = 1
            if (r9 > 0) goto L_0x0b41
        L_0x0b40:
            r1 = 0
        L_0x0b41:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            if (r10 != r0) goto L_0x0b49
            r27 = 1
            if (r1 != 0) goto L_0x0b4b
        L_0x0b49:
            r27 = 0
        L_0x0b4b:
            if (r9 <= 0) goto L_0x0bc1
            java.util.List r0 = r11.subList(r2, r9)
            java.lang.Class<X.5Ll> r5 = X.C90335Ll.class
            X.C04220Ms.A0B(r0, r2)
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x0b5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0b88
            java.lang.Object r1 = r2.next()
            boolean r0 = r5.isInstance(r1)
            if (r0 == 0) goto L_0x0b5e
            r6.add(r1)
            goto L_0x0b5e
        L_0x0b72:
            int r9 = r9 + 1
            goto L_0x0b29
        L_0x0b75:
            r9 = -1
            goto L_0x0b40
        L_0x0b77:
            r1 = 0
            goto L_0x0b0b
        L_0x0b79:
            if (r5 == 0) goto L_0x0b86
            X.BKN r1 = r5.A0f
            X.5Ml r1 = r1.A1J
            if (r1 == 0) goto L_0x0b86
            java.lang.Integer r1 = r1.A08
            if (r1 == 0) goto L_0x0b86
            goto L_0x0b11
        L_0x0b86:
            r1 = 0
            goto L_0x0b15
        L_0x0b88:
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r6.iterator()
        L_0x0b90:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0ba7
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5Ll r0 = (X.C90335Ll) r0
            java.lang.String r0 = r0.A0B
            boolean r0 = X.C18250wR.A1J(r4, r0)
            X.C18240wQ.A1N(r1, r5, r0)
            goto L_0x0b90
        L_0x0ba7:
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r5.iterator()
        L_0x0baf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0bc4
            java.lang.Object r0 = r1.next()
            X.5Ll r0 = (X.C90335Ll) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A02
            r2.add(r0)
            goto L_0x0baf
        L_0x0bc1:
            X.0ZV r15 = X.AnonymousClass0ZV.A00
            goto L_0x0bcc
        L_0x0bc4:
            java.util.Set r0 = X.AnonymousClass00J.A0b(r2)
            java.util.List r15 = X.AnonymousClass00J.A0N(r0)
        L_0x0bcc:
            X.4wE r8 = r3.A0F
        L_0x0bce:
            java.lang.Object r6 = r8.getValue()
            r0 = r6
            X.5Ho r0 = (X.C89925Ho) r0
            X.8s2 r5 = X.AnonymousClass7C0.A00(r15)
            r4 = 0
            if (r12 == 0) goto L_0x0c0f
            java.lang.String r14 = r12.A01
            java.lang.String r4 = r12.A00
        L_0x0be0:
            java.lang.String r13 = r0.A05
            java.lang.String r3 = r0.A04
            com.instagram.common.typedurl.ImageUrl r2 = r0.A02
            X.67t r1 = r0.A01
            r0 = 6
            X.C18210wN.A1M(r10, r0, r5)
            X.5Ho r0 = new X.5Ho
            r26 = r9
            r25 = r5
            r24 = r11
            r23 = r4
            r22 = r14
            r21 = r3
            r20 = r13
            r19 = r10
            r18 = r2
            r17 = r1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = r8.ADi(r6, r0)
            if (r0 == 0) goto L_0x0bce
            goto L_0x0012
        L_0x0c0f:
            r14 = r7
            goto L_0x0be0
        L_0x0c11:
            r5 = 31
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r5, r6)
            if (r1 == 0) goto L_0x0c37
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0c37
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x0c27:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x0ff5
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0c37:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1
            r7.<init>(r4, r6, r5)
            goto L_0x0c27
        L_0x0c3d:
            X.E6C r0 = (X.E6C) r0
            com.instagram.pendingmedia.model.PendingMedia r3 = r0.A00
            java.lang.String r1 = r3.A2o
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r4.A00
            X.64o r2 = (X.C963664o) r2
            com.instagram.service.session.UserSession r7 = r2.A02
            com.instagram.pendingmedia.store.PendingMediaStore r0 = com.instagram.pendingmedia.store.PendingMediaStore.A01(r7)
            com.instagram.pendingmedia.model.PendingMedia r6 = r0.A06(r1)
            if (r6 == 0) goto L_0x0012
            java.lang.String r1 = r6.A2w
            java.lang.String r0 = r2.A04
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = r6.A3z
            X.C04220Ms.A06(r0)
            java.lang.Object r0 = X.AnonymousClass00J.A0F(r0)
            com.instagram.pendingmedia.model.PendingMedia r0 = (com.instagram.pendingmedia.model.PendingMedia) r0
            if (r0 == 0) goto L_0x0c96
            java.lang.String r1 = r0.A2Y
        L_0x0c6e:
            java.lang.String r0 = r3.A2Y
            boolean r0 = X.C04220Ms.A0I(r1, r0)
            if (r0 == 0) goto L_0x0012
            X.4wE r5 = r2.A07
        L_0x0c78:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r3
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            java.util.List r2 = X.C117936zU.A00(r6, r7, r0)
            r1 = 0
            r0 = 14
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2.A01(r3, r1, r1, r2, r0)
            boolean r0 = r5.ADi(r4, r0)
            if (r0 == 0) goto L_0x0c78
            goto L_0x0012
        L_0x0c96:
            r1 = 0
            goto L_0x0c6e
        L_0x0c98:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r1 = r4.A00
            X.582 r1 = (X.AnonymousClass582) r1
            X.4wE r6 = r1.A04
        L_0x0ca0:
            java.lang.Object r5 = r6.getValue()
            r1 = r5
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r1
            java.lang.Object r4 = r0.A03
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r4
            java.lang.Object r3 = r0.A00
            X.67v r3 = (X.C970767v) r3
            java.lang.String r2 = r1.A02
            X.AnonymousClass0wJ.A1N(r2, r4)
            r1 = 2
            X.C04220Ms.A0B(r3, r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2
            r1.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r4, (X.C970767v) r3, (java.lang.String) r2)
            boolean r1 = r6.ADi(r5, r1)
            if (r1 == 0) goto L_0x0ca0
            goto L_0x0012
        L_0x0cc5:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2) r0
            java.lang.Object r1 = r4.A00
            X.57N r1 = (X.AnonymousClass57N) r1
            X.4wE r3 = r1.A04
        L_0x0ccd:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2300000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2300000_I2) r1
            java.lang.Object r9 = r0.A01
            java.util.List r9 = (java.util.List) r9
            java.lang.String r7 = r0.A03
            java.lang.String r8 = r0.A02
            java.lang.Object r5 = r0.A00
            X.67Y r5 = (X.AnonymousClass67Y) r5
            java.lang.Object r6 = r1.A02
            X.67Y r6 = (X.AnonymousClass67Y) r6
            r1 = 0
            X.C18180wK.A1P(r9, r1, r5)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2300000_I2 r4 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2300000_I2
            r4.<init>((X.AnonymousClass67Y) r5, (X.AnonymousClass67Y) r6, (java.lang.String) r7, (java.lang.String) r8, (java.util.List) r9)
            boolean r1 = r3.ADi(r2, r4)
            if (r1 == 0) goto L_0x0ccd
            goto L_0x0012
        L_0x0cf5:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r0
            java.lang.Object r1 = r4.A00
            X.58Y r1 = (X.AnonymousClass58Y) r1
            X.4wE r7 = r1.A02
        L_0x0cfd:
            java.lang.Object r6 = r7.getValue()
            r1 = r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2) r1
            java.lang.Object r5 = r0.A00
            X.5Im r5 = (X.AnonymousClass5Im) r5
            boolean r4 = r1.A03
            boolean r3 = r1.A02
            boolean r2 = r1.A01
            r1 = 0
            X.C04220Ms.A0B(r5, r1)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2
            r1.<init>((X.AnonymousClass5Im) r5, (boolean) r4, (boolean) r3, (boolean) r2)
            boolean r1 = r7.ADi(r6, r1)
            if (r1 == 0) goto L_0x0cfd
            goto L_0x0012
        L_0x0d1f:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r0
            java.lang.Object r0 = r0.A00
            X.5Im r0 = (X.AnonymousClass5Im) r0
            boolean r5 = r0.A06
            java.lang.Object r0 = r4.A00
            X.57K r0 = (X.AnonymousClass57K) r0
            X.4wE r3 = r0.A03
        L_0x0d2d:
            java.lang.Object r2 = r3.getValue()
            r1 = 1
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0010000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0010000_I2
            r0.<init>(r5, r1)
            boolean r0 = r3.ADi(r2, r0)
            if (r0 == 0) goto L_0x0d2d
            goto L_0x0012
        L_0x0d3f:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r0
            java.lang.Object r1 = r4.A00
            X.57z r1 = (X.C884257z) r1
            X.4wE r3 = r1.A04
        L_0x0d47:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2) r1
            java.lang.Object r5 = r0.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r5
            java.lang.Object r6 = r0.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2 r6 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r6
            java.lang.String r7 = r1.A02
            java.lang.String r8 = r1.A03
            boolean r9 = r1.A04
            X.AnonymousClass0wJ.A1N(r7, r8)
            X.AnonymousClass0wJ.A1Q(r5, r6)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2 r4 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2210000_I2
            r4.<init>((com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r5, (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2) r6, (java.lang.String) r7, (java.lang.String) r8, (boolean) r9)
            boolean r1 = r3.ADi(r2, r4)
            if (r1 == 0) goto L_0x0d47
            goto L_0x0012
        L_0x0d6f:
            r5 = 27
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r5, r6)
            if (r1 == 0) goto L_0x0d95
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0d95
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x0d85:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x0d9b
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0d95:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1
            r7.<init>(r4, r6, r5)
            goto L_0x0d85
        L_0x0d9b:
            X.4r0 r6 = X.C86124wJ.A17(r4, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r4 = r0.iterator()
        L_0x0da9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0fc1
            java.lang.Object r3 = r4.next()
            r0 = r3
            X.7Zx r0 = (X.C123917Zx) r0
            X.7AO r0 = r0.A03
            java.lang.String r2 = r0.A05
            java.lang.String r0 = "barcelonaComposable"
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0da9
            r9.add(r3)
            goto L_0x0da9
        L_0x0dc6:
            X.6VT r0 = (X.AnonymousClass6VT) r0
            boolean r1 = r0 instanceof X.C23565Cui
            if (r1 == 0) goto L_0x0e35
            java.lang.Object r5 = r4.A00
            X.57g r5 = (X.C882357g) r5
            X.Cui r0 = (X.C23565Cui) r0
            X.4wE r4 = r5.A05
        L_0x0dd4:
            java.lang.Object r6 = r4.getValue()
            r1 = r6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2) r1
            java.lang.Integer r3 = X.AnonymousClass006.A01
            java.util.List r7 = r0.A04
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r7)
            java.util.Iterator r10 = r7.iterator()
        L_0x0de7:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x0e26
            java.lang.Object r7 = r10.next()
            kotlin.Pair r7 = (kotlin.Pair) r7
            java.lang.Object r8 = r7.A00
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            java.lang.Object r13 = r7.A01
            X.D0g r13 = (X.C23894D0g) r13
            java.lang.String r14 = r8.getId()
            java.lang.String r15 = r8.BK7()
            java.lang.String r16 = r8.Ak2()
            com.instagram.common.typedurl.ImageUrl r12 = r8.B4M()
            boolean r17 = r8.BZi()
            com.instagram.service.session.UserSession r9 = r5.A01
            java.lang.String r7 = r8.getId()
            boolean r18 = X.C19573AyZ.A07(r9, r7)
            boolean r19 = r8.A3Q()
            X.5Hf r11 = new X.5Hf
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r2.add(r11)
            goto L_0x0de7
        L_0x0e26:
            int r7 = r1.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2 r1 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2
            r1.<init>((java.lang.Integer) r3, (java.util.List) r2, (int) r7)
            boolean r1 = r4.ADi(r6, r1)
            if (r1 == 0) goto L_0x0dd4
            goto L_0x0012
        L_0x0e35:
            X.65f r1 = X.C965065f.A00
            boolean r1 = X.C04220Ms.A0I(r0, r1)
            if (r1 == 0) goto L_0x0e63
            java.lang.Object r0 = r4.A00
            X.57g r0 = (X.C882357g) r0
            X.4wE r5 = r0.A05
        L_0x0e43:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2) r0
            java.lang.Integer r3 = X.AnonymousClass006.A00
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            int r1 = r0.A00
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2
            r0.<init>((java.lang.Integer) r3, (java.util.List) r2, (int) r1)
            boolean r0 = r5.ADi(r4, r0)
            if (r0 == 0) goto L_0x0e43
            goto L_0x0012
        L_0x0e63:
            X.65e r1 = X.C964965e.A00
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r4.A00
            X.57g r0 = (X.C882357g) r0
            X.4wE r5 = r0.A05
        L_0x0e71:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2) r0
            java.lang.Integer r3 = X.AnonymousClass006.A0C
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            int r1 = r0.A00
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2
            r0.<init>((java.lang.Integer) r3, (java.util.List) r2, (int) r1)
            boolean r0 = r5.ADi(r4, r0)
            if (r0 == 0) goto L_0x0e71
            goto L_0x0012
        L_0x0e91:
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            java.lang.Object r2 = r4.A00
            X.AgK r2 = (X.C18488AgK) r2
            if (r0 == 0) goto L_0x0ea3
            java.lang.String r1 = "focused"
            r0 = 0
            r2.A01(r1, r0)
            goto L_0x0012
        L_0x0ea3:
            java.lang.String r1 = "unfocused"
            X.KXt r0 = r2.A02
            r0.A05(r1)
            goto L_0x0012
        L_0x0eac:
            X.E6M r0 = (X.E6M) r0
            java.lang.String r2 = r0.A01
            java.lang.Object r3 = r4.A00
            X.58B r3 = (X.AnonymousClass58B) r3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape5S0100000_I2 r1 = r3.A00
            if (r1 == 0) goto L_0x0eeb
            com.instagram.service.session.UserSession r0 = r3.A04
            com.instagram.user.model.User r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0eeb
            java.lang.String r0 = r0.getId()
        L_0x0ec4:
            boolean r0 = X.C04220Ms.A0I(r2, r0)
            if (r0 == 0) goto L_0x0012
            X.4wE r2 = r3.A06
        L_0x0ecc:
            java.lang.Object r1 = r2.getValue()
            r8 = r1
            X.5IS r8 = (X.AnonymousClass5IS) r8
            java.util.List r9 = X.AnonymousClass58B.A00(r3)
            r11 = 0
            r4 = 0
            r10 = 126(0x7e, float:1.77E-43)
            r5 = r4
            r6 = r4
            r7 = r4
            r12 = r11
            X.5IS r0 = X.AnonymousClass5IS.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r2.ADi(r1, r0)
            if (r0 == 0) goto L_0x0ecc
            goto L_0x0012
        L_0x0eeb:
            r0 = 0
            goto L_0x0ec4
        L_0x0eed:
            float r0 = X.C18240wQ.A00(r0)
            java.lang.Object r1 = r4.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.Float r0 = X.C86154wM.A0W(r0)
        L_0x0ef9:
            r1.invoke(r0)
            goto L_0x0012
        L_0x0efe:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r6 = r4.A00
            X.56Z r6 = (X.AnonymousClass56Z) r6
            X.4wG r1 = r6.A0E
            X.4wE r1 = (X.C86074wE) r1
            java.lang.Object r1 = r1.getValue()
            X.5IX r1 = (X.AnonymousClass5IX) r1
            java.lang.String r5 = r1.A06
            if (r0 == 0) goto L_0x0012
            X.0MJ r7 = X.C86144wL.A17()
            int r2 = r0.size()
            r4 = 0
            r1 = 1
            if (r2 != r1) goto L_0x0f55
            java.lang.Object r3 = X.AnonymousClass00J.A0C(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = ".gif"
            r1 = 0
            X.C04220Ms.A0B(r3, r1)
            boolean r1 = r3.endsWith(r2)
            if (r1 == 0) goto L_0x0f55
            java.lang.Object r2 = X.AnonymousClass00J.A0C(r0)
            java.lang.String r2 = (java.lang.String) r2
            X.HFU r1 = new X.HFU     // Catch:{ IOException -> 0x0f3c }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0f3c }
            goto L_0x0f49
        L_0x0f3c:
            r3 = move-exception
            java.lang.String r2 = "PostEditorViewModel"
            r1 = 363(0x16b, float:5.09E-43)
            java.lang.String r1 = X.C28174Ezk.A00(r1)
            X.AnonymousClass0LU.A0E(r2, r1, r3)
            r1 = r4
        L_0x0f49:
            r7.A00 = r1
            r2 = 14
            kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6 r1 = new kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6
            r1.<init>(r7, r2)
            X.AnonymousClass56Z.A03(r6, r5, r1)
        L_0x0f55:
            X.4qz r2 = X.AnonymousClass3J5.A00(r6)
            r12 = 8
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2
            r7 = r1
            r8 = r6
            r9 = r0
            r10 = r5
            r11 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 3
            X.C25237DiI.A00(r4, r4, r1, r2, r0)
            goto L_0x0012
        L_0x0f6b:
            com.instagram.barcelona.creation.mediapicker.data.MediaPickerResult r0 = (com.instagram.barcelona.creation.mediapicker.data.MediaPickerResult) r0
            if (r0 == 0) goto L_0x0012
            java.lang.String r5 = r0.A00
            if (r5 == 0) goto L_0x0012
            java.lang.Object r4 = r4.A00
            X.56Z r4 = (X.AnonymousClass56Z) r4
            X.7En r3 = r4.A04
            r2 = 0
            java.lang.String r1 = "media_picker_result"
            r3.A02(r1, r2)
            java.util.List r2 = r0.A01
            r1 = 32
            kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2 r0 = new kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r2)
            X.AnonymousClass56Z.A03(r4, r5, r0)
            goto L_0x0012
        L_0x0f8d:
            r5 = 16
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r5, r6)
            if (r1 == 0) goto L_0x0fb3
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0fb3
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x0fa3:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x0fb9
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0fb3:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1
            r7.<init>(r4, r6, r5)
            goto L_0x0fa3
        L_0x0fb9:
            X.4r0 r6 = X.C86124wJ.A17(r4, r6)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r0
            java.lang.Object r9 = r0.A00
        L_0x0fc1:
            r7.A00 = r5
        L_0x0fc3:
            java.lang.Object r0 = r6.emit(r9, r7)
            goto L_0x18ca
        L_0x0fc9:
            r5 = 14
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r5, r6)
            if (r1 == 0) goto L_0x0fef
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0fef
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x0fdf:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x0ff5
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0fef:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1
            r7.<init>(r4, r6, r5)
            goto L_0x0fdf
        L_0x0ff5:
            X.4r0 r3 = X.C86124wJ.A17(r4, r6)
            boolean r2 = X.AnonymousClass0wJ.A1X(r0)
            goto L_0x118d
        L_0x0fff:
            r5 = 13
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r5, r6)
            if (r1 == 0) goto L_0x1025
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x1025
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x1015:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x102b
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x1025:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1
            r7.<init>(r4, r6, r5)
            goto L_0x1015
        L_0x102b:
            X.4r0 r3 = X.C86124wJ.A17(r4, r6)
            boolean r2 = r0 instanceof X.C28480FNs
            goto L_0x118d
        L_0x1033:
            boolean r1 = r0 instanceof X.LXY
            r6 = 0
            if (r1 == 0) goto L_0x1069
            java.lang.Object r3 = r4.A00
            X.FOC r3 = (X.FOC) r3
            com.instagram.avatareditor.handler.RichAvatarViewHandler r2 = r3.A01
            if (r2 == 0) goto L_0x104d
            X.0Oa r0 = r3.A05
            java.lang.Object r1 = r0.getValue()
            X.F6p r1 = (X.F6p) r1
            java.lang.String r0 = "center_pose"
            r1.A00(r2, r0)
        L_0x104d:
            X.514 r0 = r3.A02
            if (r0 == 0) goto L_0x1054
            r0.A00()
        L_0x1054:
            X.FOC.A01(r3, r6)
        L_0x1057:
            java.lang.Object r0 = r4.A00
            X.FOC r0 = (X.FOC) r0
            X.0Oa r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.LAD r0 = (X.LAD) r0
            X.4wE r3 = r0.A00
            X.LXa r2 = X.C40181LXa.A00
            goto L_0x1402
        L_0x1069:
            boolean r1 = r0 instanceof X.LXZ
            r5 = 1
            if (r1 == 0) goto L_0x10af
            java.lang.Object r6 = r4.A00
            X.FOC r6 = (X.FOC) r6
            com.instagram.avatareditor.handler.RichAvatarViewHandler r2 = r6.A01
            if (r2 == 0) goto L_0x1083
            X.0Oa r0 = r6.A05
            java.lang.Object r1 = r0.getValue()
            X.F6p r1 = (X.F6p) r1
            java.lang.String r0 = "left_pose"
            r1.A00(r2, r0)
        L_0x1083:
            X.514 r3 = r6.A02
            if (r3 == 0) goto L_0x10ab
            r3.A02 = r5
            java.util.List r2 = r3.A00
            if (r2 == 0) goto L_0x10a5
            r1 = 3
            java.util.List r0 = r3.A01
            if (r0 != 0) goto L_0x1094
            X.0ZV r0 = X.AnonymousClass0ZV.A00
        L_0x1094:
            r2.addAll(r1, r0)
            int r0 = X.C86144wL.A0C(r2, r5)
            java.lang.Object r1 = r2.get(r0)
            X.6kq r1 = (X.C109926kq) r1
            r0 = 1127481344(0x43340000, float:180.0)
            r1.A00 = r0
        L_0x10a5:
            r0 = -1224413827(0xffffffffb704ed7d, float:-7.923108E-6)
            X.C14020og.A00(r3, r0)
        L_0x10ab:
            X.FOC.A01(r6, r5)
            goto L_0x1057
        L_0x10af:
            boolean r1 = r0 instanceof X.LXU
            if (r1 == 0) goto L_0x10bd
            java.lang.Object r1 = r4.A00
            X.FOC r1 = (X.FOC) r1
            java.lang.String r0 = "HairStyle"
        L_0x10b9:
            X.FOC.A00(r1, r0)
            goto L_0x1057
        L_0x10bd:
            boolean r1 = r0 instanceof X.LXT
            if (r1 == 0) goto L_0x10c8
            java.lang.Object r1 = r4.A00
            X.FOC r1 = (X.FOC) r1
            java.lang.String r0 = "OutfitStyle"
            goto L_0x10b9
        L_0x10c8:
            boolean r1 = r0 instanceof X.LXX
            if (r1 == 0) goto L_0x10d2
            java.lang.Object r1 = r4.A00
            X.FOC r1 = (X.FOC) r1
            r0 = 0
            goto L_0x10b9
        L_0x10d2:
            boolean r1 = r0 instanceof X.LXW
            if (r1 == 0) goto L_0x1115
            java.lang.Object r2 = r4.A00
            X.FOC r2 = (X.FOC) r2
            X.0Oa r0 = r2.A09
            X.0i6 r8 = X.AnonymousClass0wJ.A0U(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r9 = com.instagram.modal.ModalActivity.class
            r0 = 600(0x258, float:8.41E-43)
            java.lang.String r1 = X.C28174Ezk.A00(r0)
            r0 = 426(0x1aa, float:5.97E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0}
            android.os.Bundle r7 = X.C98316Fa.A00(r0)
            androidx.fragment.app.FragmentActivity r6 = r2.getActivity()
            r0 = 932(0x3a4, float:1.306E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            X.3iT r5 = new X.3iT
            r5.<init>(r6, r7, r8, r9, r10)
            r5.A0F()
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            r5.A0I(r0)
            goto L_0x1057
        L_0x1115:
            boolean r0 = r0 instanceof X.LXV
            if (r0 == 0) goto L_0x1057
            java.lang.Object r2 = r4.A00
            X.FOC r2 = (X.FOC) r2
            X.0Oa r0 = r2.A09
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r0)
            X.Jj9 r0 = new X.Jj9
            r0.<init>(r1)
            X.Jqm r5 = r0.A00()
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            java.lang.Boolean r0 = r2.A04
            if (r0 == 0) goto L_0x1138
            boolean r6 = r0.booleanValue()
        L_0x1138:
            X.1Y2 r2 = new X.1Y2
            r2.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r0 = 53
            java.lang.String r0 = X.C18170wI.A00(r0)
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0}
            android.os.Bundle r0 = X.C98316Fa.A00(r0)
            r2.setArguments(r0)
            X.C37383Jqm.A00(r3, r2, r5)
            goto L_0x1057
        L_0x115b:
            r5 = 12
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r5, r6)
            if (r1 == 0) goto L_0x1181
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x1181
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x1171:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x1187
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x1181:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1
            r7.<init>(r4, r6, r5)
            goto L_0x1171
        L_0x1187:
            X.4r0 r3 = X.C86124wJ.A17(r4, r6)
            boolean r2 = r0 instanceof X.C28482FNu
        L_0x118d:
            if (r2 == 0) goto L_0x0012
            r7.A00 = r5
            java.lang.Object r0 = r3.emit(r0, r7)
            goto L_0x18ca
        L_0x1197:
            X.6Lq r0 = (X.C100016Lq) r0
            boolean r1 = r0 instanceof X.AnonymousClass5vW
            if (r1 == 0) goto L_0x0012
            java.lang.Object r1 = r4.A00
            X.CSH r1 = (X.CSH) r1
            X.5vW r0 = (X.AnonymousClass5vW) r0
            java.util.List r0 = r0.A00
            r1.A07 = r0
            X.CSH.A02(r1, r0)
            goto L_0x0012
        L_0x11ac:
            X.6US r0 = (X.AnonymousClass6US) r0
            java.lang.Object r1 = r4.A00
            X.57d r1 = (X.C882057d) r1
            X.56r r2 = r1.A00
            boolean r1 = r0 instanceof X.C964064s
            if (r1 == 0) goto L_0x11c6
            X.64s r0 = (X.C964064s) r0
            X.IZD r0 = r0.A00
            X.CQ5 r1 = new X.CQ5
            r1.<init>(r0)
        L_0x11c1:
            r2.A0H(r1)
            goto L_0x0012
        L_0x11c6:
            boolean r1 = r0 instanceof X.C963964r
            if (r1 == 0) goto L_0x1926
            X.64r r0 = (X.C963964r) r0
            X.2L8 r1 = r0.A00
            boolean r0 = r1 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x11e9
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.coroutine.HttpErrorOrException.HttpError<com.instagram.model.reels.ReelTrayResponse_Response>"
            X.C04220Ms.A0C(r1, r0)
            X.1j9 r1 = (X.AnonymousClass1j9) r1
            X.8mT r1 = r1.A00
            r1.getClass()
            X.3XX r0 = new X.3XX
            r0.<init>((java.lang.Object) r1)
        L_0x11e3:
            X.CQ4 r1 = new X.CQ4
            r1.<init>(r0)
            goto L_0x11c1
        L_0x11e9:
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x1921
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.coroutine.HttpErrorOrException.Exception<com.instagram.model.reels.ReelTrayResponse_Response>"
            X.C04220Ms.A0C(r1, r0)
            X.1j8 r1 = (X.AnonymousClass1j8) r1
            java.lang.Throwable r0 = r1.A00
            X.3XX r0 = X.AnonymousClass3XX.A00(r0)
            goto L_0x11e3
        L_0x11fb:
            r5 = 0
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1.A00(r5, r6)
            if (r1 == 0) goto L_0x1220
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x1220
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x1210:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x1226
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x1220:
            kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1
            r7.<init>(r4, r6, r5)
            goto L_0x1210
        L_0x1226:
            X.4r0 r3 = X.C86124wJ.A17(r4, r6)
            X.3b6 r0 = (X.C62903b6) r0
            boolean r2 = r0 instanceof X.AnonymousClass1jA
            if (r2 == 0) goto L_0x123c
            X.1jA r0 = (X.AnonymousClass1jA) r0
            java.lang.Object r0 = r0.A00
        L_0x1234:
            r7.A00 = r5
            java.lang.Object r0 = r3.emit(r0, r7)
            goto L_0x18ca
        L_0x123c:
            boolean r0 = r0 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x192b
            r0 = 0
            goto L_0x1234
        L_0x1242:
            r5 = 49
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r5, r6)
            if (r1 == 0) goto L_0x1268
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x1268
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x1258:
            java.lang.Object r6 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x1273
            if (r2 == r5) goto L_0x126e
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x1268:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r7.<init>(r4, r6, r5)
            goto L_0x1258
        L_0x126e:
            X.AnonymousClass0OU.A00(r6)
            goto L_0x0012
        L_0x1273:
            X.4r0 r3 = X.C86124wJ.A17(r4, r6)
            X.3b6 r0 = (X.C62903b6) r0
            boolean r2 = r0 instanceof X.AnonymousClass1jB
            if (r2 == 0) goto L_0x129a
            X.1jB r0 = (X.AnonymousClass1jB) r0
            java.lang.Object r2 = r0.A00
            boolean r0 = r2 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x1293
            X.5vA r0 = X.AnonymousClass5vA.A00
        L_0x1287:
            X.1jB r0 = X.C86164wN.A0R(r0)
        L_0x128b:
            r7.A00 = r5
            java.lang.Object r0 = r3.emit(r0, r7)
            goto L_0x18ca
        L_0x1293:
            boolean r0 = r2 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x1930
            X.5v9 r0 = X.AnonymousClass5v9.A00
            goto L_0x1287
        L_0x129a:
            boolean r2 = r0 instanceof X.AnonymousClass1jA
            if (r2 == 0) goto L_0x1935
            X.1jA r0 = (X.AnonymousClass1jA) r0
            java.lang.Object r0 = r0.A00
            X.1jA r0 = X.AnonymousClass1jA.A00(r0)
            goto L_0x128b
        L_0x12a7:
            X.6Pk r0 = (X.C100976Pk) r0
            boolean r1 = r0 instanceof X.AnonymousClass5z3
            if (r1 == 0) goto L_0x12b7
            java.lang.Object r0 = r4.A00
            X.57r r0 = (X.C883457r) r0
            X.4wE r3 = r0.A05
            X.7ol r2 = X.C130127ol.A00
            goto L_0x1402
        L_0x12b7:
            boolean r1 = r0 instanceof X.AnonymousClass5z1
            if (r1 == 0) goto L_0x12ed
            java.lang.Object r2 = r4.A00
            X.57r r2 = (X.C883457r) r2
            X.7EX r1 = r2.A00
            X.5z1 r0 = (X.AnonymousClass5z1) r0
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            r1.A02(r0)
            X.4wE r1 = r2.A05
            X.7oj r0 = X.AnonymousClass7oj.A00
            r1.CrC(r0)
            X.4wD r4 = r2.A03
            r1 = 2131821411(0x7f110363, float:1.9275564E38)
            java.lang.Object[] r0 = X.C86164wN.A1T()
            X.3I0 r3 = new X.3I0
            r3.<init>(r0, r1)
            r2 = 1
            java.lang.String r1 = "appreciation_gifting_query_gifts_failure"
            X.5LU r0 = new X.5LU
            r0.<init>(r3, r1, r2)
            java.lang.Object r1 = r4.Cgt(r0, r6)
            goto L_0x1824
        L_0x12ed:
            boolean r1 = r0 instanceof X.AnonymousClass5z2
            if (r1 == 0) goto L_0x0012
            java.lang.Object r8 = r4.A00
            X.57r r8 = (X.C883457r) r8
            X.6dI r1 = r8.A01
            X.5z2 r0 = (X.AnonymousClass5z2) r0
            java.lang.Object r13 = r0.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2 r13 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0201000_I2) r13
            r12 = 0
            X.C04220Ms.A0B(r13, r12)
            int r11 = r13.A00
            android.content.res.Resources r6 = r1.A00
            java.lang.String r10 = X.C86134wK.A0m(r6, r11, r12)
            java.lang.Object r0 = r13.A02
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r7 = 10
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0x(r0, r7)
            java.util.Iterator r15 = r0.iterator()
        L_0x1317:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x135b
            java.lang.Object r0 = r15.next()
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4001000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4001000_I2) r0
            int r5 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.String r19 = X.C120737Cg.A01(r6, r1, r12)
            X.C04220Ms.A06(r19)
            java.lang.String r4 = r0.A03
            java.lang.String r3 = r0.A04
            java.lang.String r2 = r0.A02
            java.lang.String r0 = r0.A01
            java.lang.Object[] r14 = new java.lang.Object[]{r0, r1}
            r0 = 2131821410(0x7f110362, float:1.9275562E38)
            X.1kC r1 = new X.1kC
            r1.<init>(r14, r0)
            X.5Hc r0 = new X.5Hc
            r22 = r5
            r23 = r12
            r20 = r3
            r21 = r2
            r18 = r4
            r17 = r1
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r9.add(r0)
            goto L_0x1317
        L_0x135b:
            java.lang.Object r0 = r13.A01
            X.20f r0 = (X.C302320f) r0
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2 r6 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1201000_I2
            r6.<init>((X.C302320f) r0, (java.lang.String) r10, (java.util.List) r9, (int) r11)
            X.4wE r2 = r8.A05
            r5 = 0
            r1 = 1
            X.5LX r0 = new X.5LX
            r0.<init>(r5, r6, r1)
            r2.CrC(r0)
            X.7EX r4 = r8.A00
            int r3 = r6.A00
            java.lang.Object r0 = r6.A02
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0x(r0, r7)
            java.util.Iterator r1 = r0.iterator()
        L_0x1380:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1392
            java.lang.Object r0 = r1.next()
            X.5Hc r0 = (X.AnonymousClass5Hc) r0
            java.lang.String r0 = r0.A04
            r2.add(r0)
            goto L_0x1380
        L_0x1392:
            r4.A00 = r2
            java.lang.Integer r0 = X.AnonymousClass006.A00
            X.5Ch r1 = X.AnonymousClass7EX.A00(r4, r0, r5)
            X.C86134wK.A1F(r1, r3)
            java.lang.String r0 = "gift_options"
            r1.A0B(r0, r2)
            X.C122017Jn.A01(r1, r4)
            goto L_0x0012
        L_0x13a7:
            r5 = 29
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r5, r6)
            if (r1 == 0) goto L_0x13cd
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x13cd
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x13bd:
            java.lang.Object r8 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x13d3
            if (r2 == r5) goto L_0x18b3
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x13cd:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r7.<init>(r4, r6, r5)
            goto L_0x13bd
        L_0x13d3:
            X.4r0 r4 = X.C86124wJ.A17(r4, r8)
            boolean r2 = r0 instanceof X.AnonymousClass5z3
            goto L_0x18c0
        L_0x13db:
            java.lang.Object r1 = r4.A00
            X.6md r1 = (X.C111006md) r1
            X.4wE r1 = r1.A02
            goto L_0x13e8
        L_0x13e2:
            java.lang.Object r1 = r4.A00
            X.6md r1 = (X.C111006md) r1
            X.4wE r1 = r1.A04
        L_0x13e8:
            r1.CrC(r0)
            goto L_0x0012
        L_0x13ed:
            X.6Pk r0 = (X.C100976Pk) r0
            boolean r1 = r0 instanceof X.AnonymousClass5z2
            if (r1 == 0) goto L_0x1407
            java.lang.Object r1 = r4.A00
            X.6md r1 = (X.C111006md) r1
            X.4wE r3 = r1.A03
            X.5z2 r0 = (X.AnonymousClass5z2) r0
            java.lang.Object r0 = r0.A00
            X.5z2 r2 = new X.5z2
            r2.<init>(r0)
        L_0x1402:
            r3.CrC(r2)
            goto L_0x0012
        L_0x1407:
            boolean r1 = r0 instanceof X.AnonymousClass5z1
            if (r1 == 0) goto L_0x0012
            java.lang.Object r1 = r4.A00
            X.6md r1 = (X.C111006md) r1
            X.4wE r3 = r1.A03
            X.5z1 r0 = (X.AnonymousClass5z1) r0
            java.lang.Object r0 = r0.A00
            X.5z1 r2 = new X.5z1
            r2.<init>(r0)
            goto L_0x1402
        L_0x141b:
            r5 = 28
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r5, r6)
            if (r1 == 0) goto L_0x1441
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x1441
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x1431:
            java.lang.Object r8 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x1447
            if (r2 == r5) goto L_0x18b3
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x1441:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r7.<init>(r4, r6, r5)
            goto L_0x1431
        L_0x1447:
            X.4r0 r4 = X.C86124wJ.A17(r4, r8)
            r3 = r0
            X.6Pk r3 = (X.C100976Pk) r3
            boolean r2 = r3 instanceof X.AnonymousClass5z2
            if (r2 != 0) goto L_0x18c4
            boolean r2 = r3 instanceof X.AnonymousClass5z1
            if (r2 == 0) goto L_0x0012
            X.5z1 r3 = (X.AnonymousClass5z1) r3
            java.lang.Object r2 = r3.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1010000_I2) r2
            boolean r2 = r2.A01
            if (r2 != 0) goto L_0x0012
            goto L_0x18c4
        L_0x1462:
            r5 = 27
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r5, r6)
            if (r1 == 0) goto L_0x1488
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x1488
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x1478:
            java.lang.Object r8 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x148e
            if (r2 == r5) goto L_0x18b3
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x1488:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r7.<init>(r4, r6, r5)
            goto L_0x1478
        L_0x148e:
            X.4r0 r4 = X.C86124wJ.A17(r4, r8)
            X.68D r2 = X.AnonymousClass68D.LOADING
            if (r0 == r2) goto L_0x0012
            goto L_0x18c4
        L_0x1498:
            X.6Pk r0 = (X.C100976Pk) r0
            java.lang.Object r4 = r4.A00
            X.58H r4 = (X.AnonymousClass58H) r4
            X.4wE r3 = r4.A0B
            boolean r2 = r0 instanceof X.AnonymousClass5z2
            r5 = 0
            if (r2 == 0) goto L_0x14cb
            r1 = r0
            X.5z2 r1 = (X.AnonymousClass5z2) r1
            if (r1 == 0) goto L_0x14cb
            java.lang.Object r1 = r1.A00
        L_0x14ac:
            r3.CrC(r1)
            if (r2 == 0) goto L_0x14cd
            X.7Jo r1 = r4.A00
            java.lang.Integer r4 = X.AnonymousClass006.A0C
            r2 = 0
            X.5z2 r0 = (X.AnonymousClass5z2) r0
            java.lang.Object r0 = r0.A00
            com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl r0 = (com.instagram.appreciation.graphql.ContentAppreciationMetricsDataImpl) r0
            if (r0 == 0) goto L_0x14c2
            java.util.Map r5 = X.AnonymousClass58H.A00(r0)
        L_0x14c2:
            r7 = 22
            r3 = r2
            r6 = r2
            X.C122027Jo.A04(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0012
        L_0x14cb:
            r1 = r5
            goto L_0x14ac
        L_0x14cd:
            boolean r1 = r0 instanceof X.AnonymousClass5z1
            if (r1 == 0) goto L_0x0012
            X.7Jo r4 = r4.A00
            java.lang.Integer r7 = X.AnonymousClass006.A0C
            X.5z1 r0 = (X.AnonymousClass5z1) r0
            java.lang.Object r8 = r0.A00
            java.lang.String r8 = (java.lang.String) r8
            r10 = 110(0x6e, float:1.54E-43)
            r6 = r5
            r9 = r5
            X.C122027Jo.A03(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0012
        L_0x14e4:
            X.6LL r0 = (X.AnonymousClass6LL) r0
            boolean r1 = r0 instanceof X.AnonymousClass5uZ
            if (r1 == 0) goto L_0x151c
            java.lang.Object r1 = r4.A00
            X.5xM r1 = (X.AnonymousClass5xM) r1
            X.5uZ r0 = (X.AnonymousClass5uZ) r0
            com.instagram.api.schemas.MonetizationEligibilityDecision r6 = r0.A00
            r5 = 0
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            X.0Oa r1 = r1.A0C
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r1)
            X.Drz r4 = X.C18180wK.A0Q(r2, r0)
            X.C24182DCb.A00()
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r3 = new com.instagram.monetization.impl.MonetizationFragmentFactoryImpl
            r3.<init>()
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r1)
            com.instagram.api.schemas.UserMonetizationProductType r1 = com.instagram.api.schemas.UserMonetizationProductType.CONTENT_APPRECIATION
            java.lang.String r0 = r6.A00
            androidx.fragment.app.Fragment r3 = r3.A00(r1, r2, r0, r5)
        L_0x1515:
            r4.A03 = r3
            r4.A05()
            goto L_0x0012
        L_0x151c:
            boolean r1 = r0 instanceof X.C94275uc
            if (r1 == 0) goto L_0x1570
            java.lang.Object r2 = r4.A00
            X.5xM r2 = (X.AnonymousClass5xM) r2
            X.5uc r0 = (X.C94275uc) r0
            boolean r7 = r0.A02
            boolean r6 = r0.A01
            java.util.Map r5 = r0.A00
            com.instagram.appreciation.analytics.LoggingData r3 = X.C117526yp.A01(r2)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0Oa r0 = r2.A0C
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.Drz r4 = X.C18180wK.A0Q(r1, r0)
            X.6uP r0 = X.AnonymousClass2FT.A00()
            r0.A01()
            java.lang.String r2 = r3.A01
            java.lang.String r0 = r3.A00
            X.5xc r3 = new X.5xc
            r3.<init>()
            com.instagram.appreciation.analytics.LoggingData r1 = new com.instagram.appreciation.analytics.LoggingData
            r1.<init>(r2, r0)
            java.lang.String r0 = "appreciation_logging_data"
            kotlin.Pair r2 = X.C18180wK.A0p(r0, r1)
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r1 = new com.instagram.appreciation.analytics.creator.CreatorLoggingData
            r1.<init>(r7, r6, r5)
            java.lang.String r0 = "appreciation_creator_logging_data"
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r2, r0}
            android.os.Bundle r0 = X.C98316Fa.A00(r0)
            r3.setArguments(r0)
            goto L_0x1515
        L_0x1570:
            boolean r1 = r0 instanceof X.C94285ud
            if (r1 == 0) goto L_0x1591
            java.lang.Object r4 = r4.A00
            X.62L r4 = (X.AnonymousClass62L) r4
            X.5ud r0 = (X.C94285ud) r0
            boolean r9 = r0.A02
            boolean r7 = r0.A04
            boolean r8 = r0.A01
            boolean r10 = r0.A03
            java.util.Map r5 = r0.A00
            android.app.Dialog r0 = r4.A00
            r14 = 1
            if (r0 == 0) goto L_0x15bb
            boolean r0 = r0.isShowing()
            if (r0 != r14) goto L_0x15bb
            goto L_0x0012
        L_0x1591:
            boolean r1 = r0 instanceof X.C94295ue
            if (r1 == 0) goto L_0x15fa
            java.lang.Object r2 = r4.A00
            X.5xM r2 = (X.AnonymousClass5xM) r2
            X.0Oa r0 = r2.A05
            java.lang.String r0 = X.C18200wM.A0q(r0)
            X.ItJ r3 = X.C35355ItJ.valueOf(r0)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0Oa r0 = r2.A0C
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.Drz r4 = X.C18180wK.A0Q(r1, r0)
            com.instagram.api.schemas.UserMonetizationProductType r2 = com.instagram.api.schemas.UserMonetizationProductType.CONTENT_APPRECIATION
            r1 = 0
            r0 = 1
            androidx.fragment.app.Fragment r3 = X.AnonymousClass6S1.A00(r2, r3, r1, r1, r0)
            goto L_0x1515
        L_0x15bb:
            X.Dsm r2 = X.AnonymousClass0wJ.A0V(r4)
            r0 = 2131821434(0x7f11037a, float:1.9275611E38)
            r2.A0L(r0)
            r0 = 2131821433(0x7f110379, float:1.927561E38)
            r2.A0K(r0)
            r1 = 2131821432(0x7f110378, float:1.9275607E38)
            r6 = 0
            com.facebook.redex.IDxCListenerShape0S0240000_2_I2 r3 = new com.facebook.redex.IDxCListenerShape0S0240000_2_I2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.25l r0 = X.AnonymousClass25l.RED_BOLD
            r2.A0T(r3, r0, r1)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            com.facebook.redex.IDxCListenerShape0S0240000_2_I2 r11 = new com.facebook.redex.IDxCListenerShape0S0240000_2_I2
            r12 = r4
            r13 = r5
            r15 = r7
            r16 = r8
            r17 = r9
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.25l r0 = X.AnonymousClass25l.DEFAULT
            r2.A0S(r11, r0, r1)
            android.app.Dialog r0 = r2.A0G()
            r4.A00 = r0
            X.C13950oZ.A00(r0)
            goto L_0x0012
        L_0x15fa:
            boolean r1 = r0 instanceof X.C94255ua
            if (r1 == 0) goto L_0x161a
            java.lang.Object r1 = r4.A00
            X.5xM r1 = (X.AnonymousClass5xM) r1
            X.5ua r0 = (X.C94255ua) r0
            java.lang.String r6 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.0Oa r0 = r1.A0C
            com.instagram.service.session.UserSession r3 = X.AnonymousClass0wJ.A0X(r0)
            X.9wF r4 = X.C171209wF.A0l
            java.lang.String r7 = "AppreciationCreatorSettingsFragment"
            r5 = 0
            X.C37412JrW.A06(r2, r3, r4, r5, r6, r7)
            goto L_0x0012
        L_0x161a:
            boolean r1 = r0 instanceof X.C94265ub
            if (r1 == 0) goto L_0x1633
            java.lang.Object r2 = r4.A00
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.5ub r0 = (X.C94265ub) r0
            int r0 = r0.A00
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = r2.getString(r0)
            X.C63813iO.A0B(r1, r0)
            goto L_0x0012
        L_0x1633:
            boolean r0 = r0 instanceof X.C94305uf
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r4.A00
            X.5xM r0 = (X.AnonymousClass5xM) r0
            r0.A0C()
            goto L_0x0012
        L_0x1640:
            X.6LM r0 = (X.AnonymousClass6LM) r0
            java.lang.Object r2 = r4.A00
            X.62L r2 = (X.AnonymousClass62L) r2
            X.0Oa r1 = r2.A0B
            java.lang.Object r6 = r1.getValue()
            X.CDB r6 = (X.CDB) r6
            X.0Oa r1 = r2.A02
            java.lang.Object r5 = r1.getValue()
            X.58H r5 = (X.AnonymousClass58H) r5
            r7 = 0
            X.C04220Ms.A0B(r0, r7)
            boolean r1 = r0 instanceof X.C94325uj
            if (r1 != 0) goto L_0x1757
            boolean r1 = r0 instanceof X.AnonymousClass5ui
            if (r1 != 0) goto L_0x1757
            boolean r1 = r0 instanceof X.C94315ug
            r12 = 0
            if (r1 == 0) goto L_0x16c7
            X.8AN r4 = new X.8AN
            r4.<init>()
            r2 = 2131821427(0x7f110373, float:1.9275597E38)
            r1 = 1
            X.3tG r3 = X.C65443tG.A00
            X.C86154wM.A1G(r3, r12, r4, r2, r1)
            r1 = r0
            X.5ug r1 = (X.C94315ug) r1
            X.5HR r7 = r1.A00
            X.Erq r1 = r5.A03(r12, r7)
            r4.add(r1)
            boolean r1 = r7.A04
            if (r1 == 0) goto L_0x169a
            r2 = 2131824630(0x7f110ff6, float:1.9282093E38)
            r1 = 1
            X.C86154wM.A1G(r3, r12, r4, r2, r1)
            r1 = 43
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r2 = X.C86164wN.A0L(r0, r5, r1)
            X.7wE r1 = new X.7wE
            r1.<init>(r2)
            r4.add(r1)
        L_0x169a:
            r1 = 2131821424(0x7f110370, float:1.927559E38)
            r2 = 1
            X.C86154wM.A1G(r3, r12, r4, r1, r2)
            java.util.List r1 = r5.A04(r12, r7)
            r4.addAll(r1)
            r1 = 2131821428(0x7f110374, float:1.9275599E38)
            X.C86154wM.A1G(r3, r12, r4, r1, r2)
            r2 = 2131821423(0x7f11036f, float:1.9275589E38)
            r1 = 44
        L_0x16b3:
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r1 = X.C86164wN.A0L(r0, r5, r1)
            X.EK3 r0 = new X.EK3
            r0.<init>(r1, r2)
            r4.add(r0)
            X.AnonymousClass0OP.A11(r4)
        L_0x16c2:
            r6.A00(r4)
            goto L_0x0012
        L_0x16c7:
            boolean r1 = r0 instanceof X.AnonymousClass5uh
            if (r1 == 0) goto L_0x193a
            X.8AN r4 = new X.8AN
            r4.<init>()
            r1 = 2131821427(0x7f110373, float:1.9275597E38)
            r13 = r12
            r3 = 1
            X.3tG r2 = X.C65443tG.A00
            X.C86154wM.A1G(r2, r12, r4, r1, r3)
            r1 = r0
            X.5uh r1 = (X.AnonymousClass5uh) r1
            X.5HR r8 = r1.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1110000_I2 r9 = r1.A00
            X.Erq r1 = r5.A03(r9, r8)
            r4.add(r1)
            r1 = 2131821424(0x7f110370, float:1.927559E38)
            X.C86154wM.A1G(r2, r12, r4, r1, r3)
            java.util.List r1 = r5.A04(r9, r8)
            r4.addAll(r1)
            r11 = 2131821426(0x7f110372, float:1.9275595E38)
            boolean r10 = r9.A02
            if (r10 == 0) goto L_0x1703
            r1 = 2131821415(0x7f110367, float:1.9275573E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
        L_0x1703:
            r1 = 45
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r8 = X.C86164wN.A0L(r0, r5, r1)
            X.EK3 r1 = new X.EK3
            r1.<init>(r8, r12, r11, r10)
            r4.add(r1)
            r1 = 2131821422(0x7f11036e, float:1.9275587E38)
            X.C86154wM.A1G(r2, r13, r4, r1, r3)
            r1 = 2131821420(0x7f11036c, float:1.9275583E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            r1 = 46
            com.facebook.redex.IDxCListenerShape71S0200000_2_I2 r12 = X.C86164wN.A0L(r0, r5, r1)
            java.lang.String r1 = r9.A01
            r24 = 520176(0x7eff0, float:7.28922E-40)
            X.EK3 r11 = new X.EK3
            r14 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r21 = r13
            r22 = r1
            r23 = r13
            r25 = r7
            r26 = r7
            r27 = r7
            r28 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4.add(r11)
            r1 = 2131821428(0x7f110374, float:1.9275599E38)
            X.C86154wM.A1G(r2, r13, r4, r1, r3)
            r2 = 2131821423(0x7f11036f, float:1.9275589E38)
            r1 = 47
            goto L_0x16b3
        L_0x1757:
            X.7wC r0 = new X.7wC
            r0.<init>()
            java.util.List r4 = X.C18180wK.A0n(r0)
            goto L_0x16c2
        L_0x1762:
            X.FfA r0 = (X.C28969FfA) r0
            if (r0 == 0) goto L_0x0012
            java.lang.Object r2 = r4.A00
            X.7dQ r2 = (X.C125527dQ) r2
            boolean r1 = r2.A01
            if (r1 != 0) goto L_0x0012
            X.GVp r1 = r2.A04
            r1.A02(r0)
            goto L_0x0012
        L_0x1775:
            java.lang.Object r1 = r4.A00
            X.8m8 r1 = (X.C146368m8) r1
            r1.D7w(r0)
            goto L_0x0012
        L_0x177e:
            r7 = 13
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r7, r6)
            if (r1 == 0) goto L_0x17a4
            r5 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x17a4
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x1794:
            java.lang.Object r8 = r5.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r5.A00
            r3 = 1
            if (r2 == 0) goto L_0x17aa
            if (r2 == r3) goto L_0x18b3
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x17a4:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r5.<init>(r4, r6, r7)
            goto L_0x1794
        L_0x17aa:
            X.4r0 r2 = X.C86124wJ.A17(r4, r8)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0012
            r5.A00 = r3
            java.lang.Object r0 = r2.emit(r0, r5)
            goto L_0x18ca
        L_0x17bc:
            r5 = 12
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r5, r6)
            if (r1 == 0) goto L_0x17e2
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x17e2
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x17d2:
            java.lang.Object r8 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r6 = 1
            if (r2 == 0) goto L_0x17e8
            if (r2 == r6) goto L_0x18b3
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x17e2:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r7.<init>(r4, r6, r5)
            goto L_0x17d2
        L_0x17e8:
            X.4r0 r8 = X.C86124wJ.A17(r4, r8)
            X.6if r0 = (X.C108626if) r0
            X.6lN r2 = r0.A00
            X.4tk r3 = r2.A02
            r4 = 0
            r2 = 20
            kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2 r2 = X.C86164wN.A0o(r0, r4, r2)
            com.facebook.redex.IDxFlowShape94S0200000_2_I2 r5 = X.C86144wL.A0O(r2, r3)
            kotlin.coroutines.jvm.internal.KtSLambdaShape20S0101000_I2 r3 = new kotlin.coroutines.jvm.internal.KtSLambdaShape20S0101000_I2
            r3.<init>(r0, r4, r6)
            r2 = 28
            com.facebook.redex.IDxFlowShape94S0200000_2_I2 r4 = new com.facebook.redex.IDxFlowShape94S0200000_2_I2
            r4.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r5)
            X.6ii r0 = r0.A01
            X.8dY r3 = r0.A01
            X.8gF r2 = r0.A00
            X.6ii r0 = new X.6ii
            r0.<init>(r2, r3, r4)
            r7.A00 = r6
            java.lang.Object r0 = r8.emit(r0, r7)
            goto L_0x18ca
        L_0x181c:
            java.lang.Object r1 = r4.A00
            X.8gB r1 = (X.C143148gB) r1
            java.lang.Object r1 = r1.emit(r0, r6)
        L_0x1824:
            X.D0E r0 = X.D0E.COROUTINE_SUSPENDED
            if (r1 != r0) goto L_0x0012
            return r1
        L_0x1829:
            float r1 = X.C18240wQ.A00(r0)
            java.lang.Object r0 = r4.A00
            X.7Wo r0 = (X.C123347Wo) r0
            X.8pE r2 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            goto L_0x18db
        L_0x1839:
            X.8ca r0 = (X.AnonymousClass8ca) r0
            boolean r1 = r0 instanceof X.C122927Un
            if (r1 != 0) goto L_0x187f
            boolean r1 = r0 instanceof X.C122957Ur
            if (r1 == 0) goto L_0x1850
            java.lang.Object r1 = r4.A00
            X.84D r1 = (X.AnonymousClass84D) r1
            X.7Ur r0 = (X.C122957Ur) r0
            X.7Un r0 = r0.A00
        L_0x184b:
            r1.remove((java.lang.Object) r0)
            goto L_0x0012
        L_0x1850:
            boolean r1 = r0 instanceof X.C122917Um
            if (r1 != 0) goto L_0x187f
            boolean r1 = r0 instanceof X.AnonymousClass7Uq
            if (r1 == 0) goto L_0x1861
            java.lang.Object r1 = r4.A00
            X.84D r1 = (X.AnonymousClass84D) r1
            X.7Uq r0 = (X.AnonymousClass7Uq) r0
            X.7Um r0 = r0.A00
            goto L_0x184b
        L_0x1861:
            boolean r1 = r0 instanceof X.C122987Uv
            if (r1 != 0) goto L_0x187f
            boolean r1 = r0 instanceof X.C122997Uw
            if (r1 == 0) goto L_0x1872
            java.lang.Object r1 = r4.A00
            X.84D r1 = (X.AnonymousClass84D) r1
            X.7Uw r0 = (X.C122997Uw) r0
            X.7Uv r0 = r0.A00
            goto L_0x184b
        L_0x1872:
            boolean r1 = r0 instanceof X.C122977Uu
            if (r1 == 0) goto L_0x0012
            java.lang.Object r1 = r4.A00
            X.84D r1 = (X.AnonymousClass84D) r1
            X.7Uu r0 = (X.C122977Uu) r0
            X.7Uv r0 = r0.A00
            goto L_0x184b
        L_0x187f:
            java.lang.Object r1 = r4.A00
            X.84D r1 = (X.AnonymousClass84D) r1
            r1.add(r0)
            goto L_0x0012
        L_0x1888:
            r5 = 6
            boolean r1 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r5, r6)
            if (r1 == 0) goto L_0x18ad
            r7 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2) r7
            int r3 = r7.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x18ad
            int r3 = r3 - r2
            r7.A00 = r3
        L_0x189d:
            java.lang.Object r8 = r7.A02
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x18b8
            if (r2 == r5) goto L_0x18b3
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x18ad:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r7 = new kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2
            r7.<init>(r4, r6, r5)
            goto L_0x189d
        L_0x18b3:
            X.AnonymousClass0OU.A00(r8)
            goto L_0x0012
        L_0x18b8:
            X.4r0 r4 = X.C86124wJ.A17(r4, r8)
            boolean r2 = X.AnonymousClass0wJ.A1X(r0)
        L_0x18c0:
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0012
        L_0x18c4:
            r7.A00 = r5
            java.lang.Object r0 = r4.emit(r0, r7)
        L_0x18ca:
            if (r0 != r1) goto L_0x0012
            return r1
        L_0x18cd:
            java.lang.Object r1 = r4.A00
            androidx.compose.foundation.pager.PagerState r1 = (androidx.compose.foundation.pager.PagerState) r1
            int r0 = r1.A05()
            X.8pE r2 = r1.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x18db:
            r2.CrC(r0)
            goto L_0x0012
        L_0x18e0:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r4.A04(r0, r6)
            return r1
        L_0x18e7:
            X.6f4 r0 = (X.C106456f4) r0
            java.lang.Object r1 = r4.A03(r0, r6)
            return r1
        L_0x18ee:
            X.67a r0 = (X.C968767a) r0
            java.lang.Object r1 = r4.A02(r0, r6)
            return r1
        L_0x18f5:
            java.lang.Object r1 = ((X.C1197176o) r4.A00).A01.CrC(r0)
            return r1
        L_0x18fa:
            X.6qx r0 = (X.C113226qx) r0
            java.lang.Object r1 = r4.A01(r0, r6)
            return r1
        L_0x1901:
            X.3I2 r0 = (X.AnonymousClass3I2) r0
            java.lang.Object r1 = r4.A05(r0, r6)
            return r1
        L_0x1908:
            X.C04220Ms.A0E(r4)
            r0 = 0
            throw r0
        L_0x190d:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x1912:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x1917:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r5)
            throw r0
        L_0x191c:
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r5)
            throw r0
        L_0x1921:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x1926:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x192b:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x1930:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x1935:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x193a:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxFCollectorShape230S0100000_2_I2.emit(java.lang.Object, X.8n9):java.lang.Object");
    }
}
