package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6wN  reason: invalid class name and case insensitive filesystem */
public final class C116076wN {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        if (r5 == X.AnonymousClass7GN.A00) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C147188nY r17, X.AnonymousClass59B r18, int r19) {
        /*
            r9 = 0
            r12 = r18
            X.C04220Ms.A0B(r12, r9)
            r0 = 294589392(0x118f13d0, float:2.2573632E-28)
            r14 = r17
            r14.Cvd(r0)
            r2 = r19
            r0 = r19 & 14
            r1 = 2
            if (r0 != 0) goto L_0x00d3
            int r0 = X.C147188nY.A0F(r14, r12)
            r0 = r0 | r19
        L_0x001b:
            r0 = r0 & 11
            if (r0 != r1) goto L_0x0034
            boolean r0 = r14.BCM()
            if (r0 == 0) goto L_0x0034
            r14.CuJ()
        L_0x0028:
            X.8nW r1 = r14.AKE()
            if (r1 == 0) goto L_0x0033
            r0 = 15
            X.C147178nW.A02(r1, r12, r2, r0)
        L_0x0033:
            return
        L_0x0034:
            X.8jq r10 = X.AnonymousClass6EO.A00(r14)
            X.7F7 r0 = r12.A00()
            X.4wG r0 = r0.A04
            X.4oM r7 = X.AnonymousClass7Aj.A01(r14, r0)
            java.lang.Object r1 = r7.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            X.C04220Ms.A0B(r1, r9)
            r0 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            r14.Cvb(r0)
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            boolean r0 = X.C147188nY.A0z(r14, r1, r0)
            r6 = r14
            X.7W3 r6 = (X.AnonymousClass7W3) r6
            java.lang.Object r5 = r6.A13()
            if (r0 != 0) goto L_0x0065
            java.lang.Object r0 = X.AnonymousClass7GN.A00
            if (r5 != r0) goto L_0x0095
        L_0x0065:
            X.84D r5 = new X.84D
            r5.<init>()
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r8 = r1.iterator()
        L_0x0072:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r3 = r8.next()
            r0 = r3
            X.7Zx r0 = (X.C123917Zx) r0
            X.0pE r0 = r0.A02
            X.061 r1 = r0.A00
            X.061 r0 = X.AnonymousClass061.STARTED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0072
            r4.add(r3)
            goto L_0x0072
        L_0x008f:
            r5.addAll(r4)
            r6.A14(r5)
        L_0x0095:
            X.AnonymousClass7W3.A0w(r6, r9)
            X.84D r5 = (X.AnonymousClass84D) r5
            java.lang.Object r1 = X.AnonymousClass7W3.A06(r6, r7)
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 64
            A01(r14, r1, r5, r0)
            java.util.Iterator r1 = r5.iterator()
        L_0x00a9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0028
            X.7Zx r11 = X.C86154wM.A0J(r1)
            X.7AO r13 = r11.A03
            X.592 r13 = (X.AnonymousClass592) r13
            r0 = 27
            kotlin.jvm.internal.KtLambdaShape16S0200000_I2 r16 = X.C86164wN.A0v(r11, r12, r0)
            X.78c r15 = r13.A00
            r0 = 1129586364(0x43541ebc, float:212.12006)
            kotlin.jvm.internal.KtLambdaShape8S0400000_I2 r8 = new kotlin.jvm.internal.KtLambdaShape8S0400000_I2
            r8.<init>(r9, r10, r11, r12, r13)
            X.8sI r17 = X.AnonymousClass7JR.A00(r14, r8, r0)
            r18 = 384(0x180, float:5.38E-43)
            r19 = r9
            X.C115986wE.A01(r14, r15, r16, r17, r18, r19)
            goto L_0x00a9
        L_0x00d3:
            r0 = r2
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116076wN.A00(X.8nY, X.59B, int):void");
    }

    public static final void A01(C147188nY r4, Collection collection, List list, int i) {
        AnonymousClass0wJ.A1N(list, collection);
        r4.Cvd(1537894851);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C123917Zx A0J = C86154wM.A0J(it);
            AnonymousClass7K5.A04(r4, A0J.A02, C86164wN.A11(list, A0J, 30));
        }
        C147178nW AKE = r4.AKE();
        if (AKE != null) {
            C147178nW.A04(AKE, collection, list, i, 25);
        }
    }
}
