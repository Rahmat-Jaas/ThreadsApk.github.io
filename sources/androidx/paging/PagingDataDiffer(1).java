package androidx.paging;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass6D2;
import X.AnonymousClass8AA;
import X.C000300e;
import X.C04220Ms;
import X.C1197776w;
import X.C1201779c;
import X.C1202779m;
import X.C125047cK;
import X.C125057cL;
import X.C141958dY;
import X.C143188gF;
import X.C145768l3;
import X.C18200wM;
import X.C27456Enm;
import X.C27952Ew2;
import X.C84714tk;
import X.C86084wF;
import X.C86114wI;
import X.C86164wN;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2;

public abstract class PagingDataDiffer {
    public C143188gF A00;
    public C125047cK A01;
    public C141958dY A02;
    public final C145768l3 A03;
    public final C1197776w A04;
    public final C125057cL A05;
    public final SingleRunner A06;
    public final CopyOnWriteArrayList A07 = new CopyOnWriteArrayList();
    public final C27952Ew2 A08;
    public final C84714tk A09;
    public final C86084wF A0A;
    public volatile int A0B;
    public volatile boolean A0C;

    public final Object A02(int i) {
        this.A0C = true;
        this.A0B = i;
        if (AnonymousClass6D2.A00 != null && C86164wN.A1P(2)) {
            C04220Ms.A0B(AnonymousClass00U.A0E("Accessing item index[", ']', i), 1);
        }
        C143188gF r1 = this.A00;
        if (r1 != null) {
            r1.A53(this.A01.A01(i));
        }
        C125047cK r3 = this.A01;
        if (i < 0 || i >= r3.getSize()) {
            throw C86114wI.A0a("Index: ", ", Size: ", i, r3.getSize());
        }
        int i2 = i - r3.A01;
        if (i2 < 0 || i2 >= r3.A02) {
            return null;
        }
        return r3.Ajz(i2);
    }

    public final void A04(C1201779c r3, C1201779c r4) {
        C04220Ms.A0B(r3, 0);
        C1197776w r1 = this.A04;
        if (!C04220Ms.A0I(r1.A04, r3) || !C04220Ms.A0I(r1.A03, r4)) {
            r1.A05 = true;
            r1.A04 = r3;
            r1.A03 = r4;
            C1197776w.A00(r1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C143188gF r16, X.C1201779c r17, X.C1201779c r18, androidx.paging.PagingDataDiffer r19, java.util.List r20, X.C146958n9 r21, int r22, int r23, boolean r24) {
        /*
            r8 = r17
            r7 = r18
            r10 = r19
            r3 = r24
            r6 = 0
            r5 = r21
            boolean r0 = r5 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2
            if (r0 == 0) goto L_0x00e2
            r4 = r5
            kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2) r4
            int r0 = r4.A09
            if (r0 != r6) goto L_0x00e2
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e2
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0021:
            java.lang.Object r5 = r4.A06
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0099
            if (r0 != r1) goto L_0x00f0
            boolean r3 = r4.A08
            java.lang.Object r12 = r4.A05
            X.0Mo r12 = (X.C04180Mo) r12
            java.lang.Object r9 = r4.A04
            X.7cK r9 = (X.C125047cK) r9
            java.lang.Object r7 = r4.A03
            X.79c r7 = (X.C1201779c) r7
            java.lang.Object r8 = r4.A02
            X.79c r8 = (X.C1201779c) r8
            java.lang.Object r10 = r4.A01
            androidx.paging.PagingDataDiffer r10 = (androidx.paging.PagingDataDiffer) r10
            X.AnonymousClass0OU.A00(r5)
        L_0x0045:
            java.lang.Number r5 = (java.lang.Number) r5
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x00e9
            if (r3 == 0) goto L_0x0053
            X.C04220Ms.A0A(r8)
            r10.A04(r8, r7)
        L_0x0053:
            if (r5 != 0) goto L_0x008a
            X.8gF r4 = r10.A00
            if (r4 == 0) goto L_0x0087
            int r0 = r9.A02
            int r3 = r0 >> 1
            java.util.List r1 = r9.A03
            java.lang.Object r0 = X.AnonymousClass00J.A0C(r1)
            X.79m r0 = (X.C1202779m) r0
            int[] r0 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass8AP.A04(r0)
            int r2 = X.C86134wK.A0A(r0)
            java.lang.Object r0 = X.AnonymousClass00J.A0E(r1)
            X.79m r0 = (X.C1202779m) r0
            int[] r0 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass8AP.A03(r0)
            int r1 = X.C86134wK.A0A(r0)
            X.59i r0 = new X.59i
            r0.<init>(r3, r3, r2, r1)
        L_0x0084:
            r4.A53(r0)
        L_0x0087:
            kotlin.Unit r2 = kotlin.Unit.A00
            return r2
        L_0x008a:
            int r0 = r5.intValue()
            r10.A0B = r0
            X.8gF r4 = r10.A00
            if (r4 == 0) goto L_0x0087
            X.59j r0 = r9.A01(r0)
            goto L_0x0084
        L_0x0099:
            X.AnonymousClass0OU.A00(r5)
            if (r24 == 0) goto L_0x00a7
            if (r17 != 0) goto L_0x00a7
            java.lang.String r0 = "Cannot dispatch LoadStates in PagingDataDiffer without source LoadStates set."
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x00a7:
            r10.A0C = r6
            X.7cK r9 = new X.7cK
            r14 = r23
            r13 = r22
            r11 = r20
            r9.<init>(r11, r13, r14)
            X.0Mo r12 = new X.0Mo
            r12.<init>()
            X.7cK r15 = r10.A01
            int r0 = r10.A0B
            X.8ET r5 = new X.8ET
            r6 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4.A01 = r10
            r4.A02 = r8
            r4.A03 = r7
            r4.A04 = r9
            r4.A05 = r12
            r4.A08 = r3
            r4.A00 = r1
            r14 = r10
            r16 = r9
            r17 = r4
            r18 = r5
            r19 = r0
            java.lang.Object r5 = r14.A03(r15, r16, r17, r18, r19)
            if (r5 != r2) goto L_0x0045
            return r2
        L_0x00e2:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0711000_I2
            r4.<init>(r10, r5, r6)
            goto L_0x0021
        L_0x00e9:
            java.lang.String r0 = "Missing call to onListPresentable after new list was presented. If you are seeing\n this exception, it is generally an indication of an issue with Paging.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataDiffer.A00(X.8gF, X.79c, X.79c, androidx.paging.PagingDataDiffer, java.util.List, X.8n9, int, int, boolean):java.lang.Object");
    }

    public final AnonymousClass8AA A01() {
        C125047cK r0 = this.A01;
        int i = r0.A01;
        int i2 = r0.A00;
        List<C1202779m> list = r0.A03;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (C1202779m r02 : list) {
            C000300e.A0r(r02.A01, A0v);
        }
        return new AnonymousClass8AA(A0v, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C41800MdR r14, X.C41800MdR r15, X.C146958n9 r16, X.AnonymousClass0ZU r17, int r18) {
        /*
            r13 = this;
            r2 = r17
            r9 = r14
            r10 = r15
            r4 = r18
            boolean r0 = r13 instanceof X.AnonymousClass59Y
            if (r0 == 0) goto L_0x0017
            r0 = r13
            X.59Y r0 = (X.AnonymousClass59Y) r0
            r2.invoke()
            X.76o r0 = r0.A00
            X.C147368pE.A05(r0)
            r0 = 0
            return r0
        L_0x0017:
            r1 = r13
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r1 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r1
            r3 = 0
            r8 = r16
            boolean r0 = r8 instanceof kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2
            if (r0 == 0) goto L_0x00b3
            r6 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2) r6
            int r0 = r6.A08
            if (r0 != r3) goto L_0x00b3
            int r7 = r6.A01
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r7 & r5
            if (r0 == 0) goto L_0x00b3
            int r7 = r7 - r5
            r6.A01 = r7
        L_0x0033:
            java.lang.Object r7 = r6.A06
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A01
            r12 = 1
            if (r0 == 0) goto L_0x0069
            if (r0 != r12) goto L_0x00ba
            int r4 = r6.A00
            java.lang.Object r2 = r6.A05
            X.0ZU r2 = (X.AnonymousClass0ZU) r2
            java.lang.Object r10 = r6.A04
            X.MdR r10 = (X.C41800MdR) r10
            java.lang.Object r9 = r6.A03
            X.MdR r9 = (X.C41800MdR) r9
            java.lang.Object r1 = r6.A02
            androidx.paging.AsyncPagingDataDiffer$differBase$1 r1 = (androidx.paging.AsyncPagingDataDiffer$differBase$1) r1
            X.AnonymousClass0OU.A00(r7)
        L_0x0053:
            X.Llc r7 = (X.C40682Llc) r7
            r2.invoke()
            androidx.paging.AsyncPagingDataDiffer r0 = r1.A00
            X.8lg r0 = r0.A04
            X.M0N.A02(r7, r9, r10, r0)
            int r0 = X.M0N.A00(r7, r9, r10, r4)
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r0)
            return r11
        L_0x0069:
            X.AnonymousClass0OU.A00(r7)
            int r0 = r14.getSize()
            r11 = 0
            if (r0 != 0) goto L_0x0082
            r2.invoke()
            androidx.paging.AsyncPagingDataDiffer r0 = r1.A00
            X.8l3 r1 = r0.A02
            int r0 = r15.getSize()
            r1.C2k(r3, r0)
            return r11
        L_0x0082:
            int r0 = r15.getSize()
            if (r0 != 0) goto L_0x0097
            r2.invoke()
            androidx.paging.AsyncPagingDataDiffer r0 = r1.A00
            X.8l3 r1 = r0.A02
            int r0 = r14.getSize()
            r1.CFn(r3, r0)
            return r11
        L_0x0097:
            androidx.paging.AsyncPagingDataDiffer r8 = r1.A00
            X.Ew2 r0 = r8.A06
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2 r7 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0300000_I2
            r7.<init>(r8, r9, r10, r11, r12)
            r6.A02 = r1
            r6.A03 = r14
            r6.A04 = r15
            r6.A05 = r2
            r6.A00 = r4
            r6.A01 = r12
            java.lang.Object r7 = X.C25599DoZ.A00(r6, r0, r7)
            if (r7 != r5) goto L_0x0053
            return r5
        L_0x00b3:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0602000_I2
            r6.<init>(r1, r8, r3)
            goto L_0x0033
        L_0x00ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataDiffer.A03(X.MdR, X.MdR, X.8n9, X.0ZU, int):java.lang.Object");
    }

    public PagingDataDiffer(C145768l3 r6, C27952Ew2 ew2) {
        boolean A1Z = C18200wM.A1Z(ew2);
        this.A03 = r6;
        this.A08 = ew2;
        C125047cK r1 = C125047cK.A04;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.paging.PagePresenter<T of androidx.paging.PagePresenter.Companion.initial>");
        this.A01 = r1;
        C1197776w r2 = new C1197776w();
        this.A04 = r2;
        this.A06 = new SingleRunner((DefaultConstructorMarker) null, A1Z ? 1 : 0, false);
        this.A05 = new C125057cL(this);
        this.A09 = r2.A07;
        this.A0A = new C27456Enm(AnonymousClass006.A01, 0, 64);
        this.A07.add(new KtLambdaShape22S0100000_I2_2(this, 9));
    }
}
