package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.8BE  reason: invalid class name */
public final class AnonymousClass8BE extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ Iterator A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8BE(Iterator it, C146958n9 r3, int i, int i2, boolean z, boolean z2) {
        super(2, r3);
        this.A05 = i;
        this.A06 = i2;
        this.A07 = it;
        this.A09 = z;
        this.A08 = z2;
    }

    public final C146958n9 create(Object obj, C146958n9 r9) {
        C146958n9 r2 = r9;
        AnonymousClass8BE r0 = new AnonymousClass8BE(this.A07, r2, this.A05, this.A06, this.A09, this.A08);
        r0.A04 = obj;
        return r0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0162 A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r14.A01
            r5 = 5
            r7 = 4
            r9 = 3
            r2 = 2
            r8 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0043
            if (r0 == r8) goto L_0x008b
            if (r0 == r2) goto L_0x0183
            if (r0 == r9) goto L_0x0131
            if (r0 != r7) goto L_0x0183
            java.lang.Object r2 = r14.A02
            X.8AG r2 = (X.AnonymousClass8AG) r2
            java.lang.Object r3 = r14.A04
            X.83y r3 = (X.C1366983y) r3
            X.AnonymousClass0OU.A00(r15)
        L_0x001f:
            int r10 = r14.A06
            r2.A09(r10)
        L_0x0024:
            int r0 = r2.size()
            if (r0 <= r10) goto L_0x014d
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x003e
            r0 = r2
        L_0x002f:
            r14.A04 = r3
            r14.A02 = r2
            r14.A03 = r4
            r14.A01 = r7
            java.lang.Object r0 = r3.A00(r0, r14)
            if (r0 != r6) goto L_0x001f
            return r6
        L_0x003e:
            java.util.ArrayList r0 = X.C18200wM.A0s(r2)
            goto L_0x002f
        L_0x0043:
            X.AnonymousClass0OU.A00(r15)
            java.lang.Object r3 = r14.A04
            X.83y r3 = (X.C1366983y) r3
            int r1 = r14.A05
            r11 = r1
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 <= r0) goto L_0x0053
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            int r10 = r14.A06
            int r1 = r10 - r1
            if (r1 < 0) goto L_0x00ac
            java.util.ArrayList r7 = X.C18240wQ.A0k(r11)
            r10 = 0
            java.util.Iterator r9 = r14.A07
        L_0x0060:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r0 = r9.next()
            if (r10 <= 0) goto L_0x006f
            int r10 = r10 + -1
            goto L_0x0060
        L_0x006f:
            r7.add(r0)
            int r5 = r7.size()
            int r0 = r14.A05
            if (r5 != r0) goto L_0x0060
            r14.A04 = r3
            r14.A02 = r7
            r14.A03 = r9
            r14.A00 = r1
            r14.A01 = r8
            java.lang.Object r0 = r3.A00(r7, r14)
            if (r0 != r6) goto L_0x009c
            return r6
        L_0x008b:
            int r1 = r14.A00
            java.lang.Object r9 = r14.A03
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r7 = r14.A02
            java.util.AbstractCollection r7 = (java.util.AbstractCollection) r7
            java.lang.Object r3 = r14.A04
            X.83y r3 = (X.C1366983y) r3
            X.AnonymousClass0OU.A00(r15)
        L_0x009c:
            boolean r0 = r14.A09
            if (r0 == 0) goto L_0x00a5
            r7.clear()
        L_0x00a3:
            r10 = r1
            goto L_0x0060
        L_0x00a5:
            int r0 = r14.A05
            java.util.ArrayList r7 = X.C18240wQ.A0k(r0)
            goto L_0x00a3
        L_0x00ac:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r0 = 0
            X.8AG r2 = new X.8AG
            r2.<init>(r1, r0)
            java.util.Iterator r0 = r14.A07
        L_0x00b6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0147
            java.lang.Object r13 = r0.next()
            int r1 = r2.size()
            int r12 = r2.A02
            if (r1 != r12) goto L_0x00cf
            java.lang.String r0 = "ring buffer is full"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x00cf:
            java.lang.Object[] r11 = r2.A03
            int r8 = r2.A01
            int r1 = r2.size()
            int r8 = r8 + r1
            int r8 = r8 % r12
            r11[r8] = r13
            int r1 = r2.size()
            int r1 = r1 + 1
            r2.A00 = r1
            int r8 = r2.size()
            int r1 = r2.A02
            if (r8 != r1) goto L_0x00b6
            int r1 = r2.size()
            int r11 = r14.A05
            if (r1 >= r11) goto L_0x0118
            int r8 = r2.A02
            int r1 = r8 >> 1
            int r8 = r8 + r1
            int r8 = r8 + 1
            if (r8 <= r11) goto L_0x00fd
            r8 = r11
        L_0x00fd:
            int r1 = r2.A01
            if (r1 != 0) goto L_0x0111
            java.lang.Object[] r1 = r2.A03
            java.lang.Object[] r8 = X.C86124wJ.A1b(r1, r8)
        L_0x0107:
            int r1 = r2.size()
            X.8AG r2 = new X.8AG
            r2.<init>(r8, r1)
            goto L_0x00b6
        L_0x0111:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Object[] r8 = r2.toArray(r1)
            goto L_0x0107
        L_0x0118:
            boolean r1 = r14.A09
            if (r1 == 0) goto L_0x012c
            r1 = r2
        L_0x011d:
            r14.A04 = r3
            r14.A02 = r2
            r14.A03 = r0
            r14.A01 = r9
            java.lang.Object r1 = r3.A00(r1, r14)
            if (r1 != r6) goto L_0x0140
            return r6
        L_0x012c:
            java.util.ArrayList r1 = X.C18200wM.A0s(r2)
            goto L_0x011d
        L_0x0131:
            java.lang.Object r0 = r14.A03
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r2 = r14.A02
            X.8AG r2 = (X.AnonymousClass8AG) r2
            java.lang.Object r3 = r14.A04
            X.83y r3 = (X.C1366983y) r3
            X.AnonymousClass0OU.A00(r15)
        L_0x0140:
            int r10 = r14.A06
            r2.A09(r10)
            goto L_0x00b6
        L_0x0147:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0186
            goto L_0x0024
        L_0x014d:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0186
            r14.A04 = r4
            r14.A02 = r4
            r14.A03 = r4
            r14.A01 = r5
            java.lang.Object r0 = r3.A00(r2, r14)
            goto L_0x0180
        L_0x0162:
            boolean r0 = X.C18250wR.A1K(r7)
            if (r0 == 0) goto L_0x0186
            boolean r0 = r14.A08
            if (r0 != 0) goto L_0x0174
            int r1 = r7.size()
            int r0 = r14.A05
            if (r1 != r0) goto L_0x0186
        L_0x0174:
            r14.A04 = r4
            r14.A02 = r4
            r14.A03 = r4
            r14.A01 = r2
            java.lang.Object r0 = r3.A00(r7, r14)
        L_0x0180:
            if (r0 != r6) goto L_0x0186
            return r6
        L_0x0183:
            X.AnonymousClass0OU.A00(r15)
        L_0x0186:
            kotlin.Unit r6 = kotlin.Unit.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8BE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass8BE) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
