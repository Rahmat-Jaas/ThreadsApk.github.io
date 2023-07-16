package androidx.paging;

import X.AnonymousClass0YM;
import X.AnonymousClass67E;
import X.C146958n9;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0}, l = {232, 99}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv", "generationId"}, s = {"L$1", "L$2", "I$0"})
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public int A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ AnonymousClass67E A05;
    public final /* synthetic */ PageFetcherSnapshot A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(AnonymousClass67E r2, PageFetcherSnapshot pageFetcherSnapshot, C146958n9 r4) {
        super(3, r4);
        this.A06 = pageFetcherSnapshot;
        this.A05 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        PageFetcherSnapshot pageFetcherSnapshot = this.A06;
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(this.A05, pageFetcherSnapshot, (C146958n9) obj3);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.A03 = obj;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.A04 = obj2;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a A[Catch:{ all -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067 A[SYNTHETIC, Splitter:B:15:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A01
            r6 = 2
            r9 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0023
            if (r0 == r9) goto L_0x0011
            X.AnonymousClass0OU.A00(r12)
        L_0x000e:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0011:
            int r8 = r11.A00
            java.lang.Object r10 = r11.A02
            X.Dnh r10 = (X.C25549Dnh) r10
            java.lang.Object r1 = r11.A04
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r3 = r11.A03
            X.4r0 r3 = (X.C83234r0) r3
            X.AnonymousClass0OU.A00(r12)
            goto L_0x0047
        L_0x0023:
            X.AnonymousClass0OU.A00(r12)
            java.lang.Object r3 = r11.A03
            X.4r0 r3 = (X.C83234r0) r3
            java.lang.Object r0 = r11.A04
            int r8 = X.AnonymousClass0wJ.A04(r0)
            androidx.paging.PageFetcherSnapshot r0 = r11.A06
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r0.A01
            X.Dnh r10 = r1.A01
            r11.A03 = r3
            r11.A04 = r1
            r11.A02 = r10
            r11.A00 = r8
            r11.A01 = r9
            java.lang.Object r0 = r10.A00(r4, r11)
            if (r0 != r5) goto L_0x0047
            return r5
        L_0x0047:
            X.6v1 r0 = r1.A00     // Catch:{ all -> 0x009c }
            X.6vB r2 = r0.A05     // Catch:{ all -> 0x009c }
            X.67E r1 = r11.A05     // Catch:{ all -> 0x009c }
            X.6bS r7 = r2.A00(r1)     // Catch:{ all -> 0x009c }
            X.59K r0 = X.AnonymousClass59K.A00     // Catch:{ all -> 0x009c }
            boolean r0 = X.C04220Ms.A0I(r7, r0)     // Catch:{ all -> 0x009c }
            r7 = 0
            if (r0 == 0) goto L_0x0067
            X.6tY[] r2 = new X.C114596tY[r7]     // Catch:{ all -> 0x009c }
            r0 = 23
            com.facebook.redex.IDxFlowShape251S0100000_2_I2 r1 = new com.facebook.redex.IDxFlowShape251S0100000_2_I2     // Catch:{ all -> 0x009c }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x009c }
            r10.A02(r4)
            goto L_0x008d
        L_0x0067:
            X.6bS r0 = r2.A00(r1)     // Catch:{ all -> 0x009c }
            boolean r0 = r0 instanceof X.AnonymousClass59I     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x0074
            X.59K r0 = X.AnonymousClass59K.A01     // Catch:{ all -> 0x009c }
            r2.A02(r0, r1)     // Catch:{ all -> 0x009c }
        L_0x0074:
            r10.A02(r4)
            androidx.paging.PageFetcherSnapshot r0 = r11.A06
            X.6oA r0 = r0.A00
            X.4tk r2 = r0.A00(r1)
            if (r8 != 0) goto L_0x0082
            r9 = 0
        L_0x0082:
            r1 = 1
            com.facebook.redex.IDxFlowShape19S0101000_2_I2 r0 = new com.facebook.redex.IDxFlowShape19S0101000_2_I2
            r0.<init>(r2, r9, r1)
            com.facebook.redex.IDxFlowShape19S0101000_2_I2 r1 = new com.facebook.redex.IDxFlowShape19S0101000_2_I2
            r1.<init>(r0, r8, r7)
        L_0x008d:
            r11.A03 = r4
            r11.A04 = r4
            r11.A02 = r4
            r11.A01 = r6
            java.lang.Object r0 = X.C25817DsW.A02(r11, r1, r3)
            if (r0 != r5) goto L_0x000e
            return r5
        L_0x009c:
            r0 = move-exception
            r10.A02(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
