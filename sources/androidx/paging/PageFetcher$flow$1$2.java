package androidx.paging;

import X.AnonymousClass0YM;
import X.C146958n9;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", i = {0, 1, 1}, l = {73, 77}, m = "invokeSuspend", n = {"previousGeneration", "previousGeneration", "pagingSource"}, s = {"L$0", "L$0", "L$1"})
public final class PageFetcher$flow$1$2 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ PageFetcher A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$2(PageFetcher pageFetcher, C146958n9 r3) {
        super(3, r3);
        this.A03 = pageFetcher;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r7.A01 == null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r2 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        r1 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1.A01 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        r8 = r6.A02(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (X.AnonymousClass6D2.A00 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (X.C86164wN.A1P(3) != true) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        r1 = X.C18190wL.A0s("Refresh key ");
        r1.append(r8);
        X.C04220Ms.A0B(X.C86104wH.A0x(r6, " returned from PagingSource ", r1), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        if (r7 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (r7 != null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r7 = r12
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r11.A00
            r5 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0094
            if (r0 == r4) goto L_0x00b0
            java.lang.Object r6 = r11.A01
            androidx.paging.PagingSource r6 = (androidx.paging.PagingSource) r6
            java.lang.Object r2 = r11.A02
            X.6ig r2 = (X.C108636ig) r2
            X.AnonymousClass0OU.A00(r12)
        L_0x0017:
            X.6uX r7 = (X.C115116uX) r7
            if (r7 == 0) goto L_0x0023
            java.util.List r0 = r7.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0032
        L_0x0023:
            if (r2 == 0) goto L_0x0091
            X.6uX r1 = r2.A01
            if (r1 == 0) goto L_0x0091
            java.util.List r0 = r1.A02
            boolean r0 = X.C18190wL.A1a(r0)
            if (r0 != r4) goto L_0x0091
            r7 = r1
        L_0x0032:
            java.lang.Integer r0 = r7.A01
            if (r0 != 0) goto L_0x0041
        L_0x0036:
            if (r2 == 0) goto L_0x008e
            X.6uX r1 = r2.A01
            if (r1 == 0) goto L_0x008e
            java.lang.Integer r0 = r1.A01
            if (r0 == 0) goto L_0x008e
            r7 = r1
        L_0x0041:
            java.lang.Object r8 = r6.A02(r7)
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r0 == 0) goto L_0x0062
            r0 = 3
            boolean r0 = X.C86164wN.A1P(r0)
            if (r0 != r4) goto L_0x0062
            java.lang.String r0 = "Refresh key "
            java.lang.StringBuilder r1 = X.C18190wL.A0s(r0)
            r1.append(r8)
            java.lang.String r0 = " returned from PagingSource "
            java.lang.String r0 = X.C86104wH.A0x(r6, r0, r1)
            X.C04220Ms.A0B(r0, r4)
        L_0x0062:
            if (r2 == 0) goto L_0x0070
            androidx.paging.PageFetcherSnapshot r0 = r2.A00
            X.EnT r0 = r0.A07
            r0.AC7(r3)
            X.8sG r0 = r2.A02
            r0.AC7(r3)
        L_0x0070:
            androidx.paging.PageFetcher r1 = r11.A03
            androidx.paging.PagingConfig r5 = r1.A02
            X.77a r0 = r1.A01
            X.4tk r10 = r0.A00
            r0 = 0
            kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2 r9 = new kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2
            r9.<init>(r1, r0)
            androidx.paging.PageFetcherSnapshot r4 = new androidx.paging.PageFetcherSnapshot
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.EnT r0 = new X.EnT
            r0.<init>(r3)
            X.6ig r6 = new X.6ig
            r6.<init>(r4, r7, r0)
        L_0x008d:
            return r6
        L_0x008e:
            if (r7 != 0) goto L_0x0041
            goto L_0x00cf
        L_0x0091:
            if (r7 == 0) goto L_0x0036
            goto L_0x0032
        L_0x0094:
            X.AnonymousClass0OU.A00(r12)
            java.lang.Object r2 = r11.A02
            X.6ig r2 = (X.C108636ig) r2
            androidx.paging.PageFetcher r1 = r11.A03
            if (r2 == 0) goto L_0x00ae
            androidx.paging.PageFetcherSnapshot r0 = r2.A00
            androidx.paging.PagingSource r0 = r0.A03
        L_0x00a3:
            r11.A02 = r2
            r11.A00 = r4
            java.lang.Object r7 = androidx.paging.PageFetcher.A00(r1, r0, r11)
            if (r7 != r6) goto L_0x00b7
            return r6
        L_0x00ae:
            r0 = r3
            goto L_0x00a3
        L_0x00b0:
            java.lang.Object r2 = r11.A02
            X.6ig r2 = (X.C108636ig) r2
            X.AnonymousClass0OU.A00(r12)
        L_0x00b7:
            androidx.paging.PagingSource r7 = (androidx.paging.PagingSource) r7
            if (r2 == 0) goto L_0x00cd
            androidx.paging.PageFetcherSnapshot r0 = r2.A00
            r11.A02 = r2
            r11.A01 = r7
            r11.A00 = r5
            java.lang.Object r0 = r0.A09(r11)
            if (r0 == r6) goto L_0x008d
            r6 = r7
            r7 = r0
            goto L_0x0017
        L_0x00cd:
            r6 = r7
            r7 = r3
        L_0x00cf:
            r8 = 0
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        PageFetcher$flow$1$2 pageFetcher$flow$1$2 = new PageFetcher$flow$1$2(this.A03, (C146958n9) obj3);
        pageFetcher$flow$1$2.A02 = obj;
        return pageFetcher$flow$1$2.invokeSuspend(Unit.A00);
    }
}
