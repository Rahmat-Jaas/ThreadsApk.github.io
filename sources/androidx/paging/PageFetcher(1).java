package androidx.paging;

import X.AnonymousClass0YY;
import X.AnonymousClass77a;
import X.C04220Ms;
import X.C146958n9;
import X.C84714tk;
import X.D4V;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PageFetcher {
    public final AnonymousClass77a A00 = new AnonymousClass77a((Object) null, (DefaultConstructorMarker) null, 1);
    public final AnonymousClass77a A01 = new AnonymousClass77a((Object) null, (DefaultConstructorMarker) null, 1);
    public final PagingConfig A02;
    public final C84714tk A03 = D4V.A00(new KtSLambdaShape8S0301000_I2((Object) this, (Object) null, (C146958n9) null, 35, 42));
    public final AnonymousClass0YY A04;

    public PageFetcher(PagingConfig pagingConfig, AnonymousClass0YY r9) {
        C04220Ms.A0B(r9, 1);
        this.A04 = r9;
        this.A02 = pagingConfig;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(androidx.paging.PageFetcher r6, androidx.paging.PagingSource r7, X.C146958n9 r8) {
        /*
            r3 = 10
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x005d
            r5 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005d
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A03
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r3) goto L_0x009d
            java.lang.Object r7 = r5.A02
            androidx.paging.PagingSource r7 = (androidx.paging.PagingSource) r7
            java.lang.Object r6 = r5.A01
            androidx.paging.PageFetcher r6 = (androidx.paging.PageFetcher) r6
            X.AnonymousClass0OU.A00(r4)
        L_0x002c:
            androidx.paging.PagingSource r4 = (androidx.paging.PagingSource) r4
            boolean r0 = r4 instanceof X.C885759f
            if (r0 == 0) goto L_0x0065
            r5 = r4
            X.59f r5 = (X.C885759f) r5
            androidx.paging.PagingConfig r0 = r6.A02
            int r1 = r0.A03
            int r2 = r5.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x0063
            if (r1 == r2) goto L_0x0063
            java.lang.String r1 = "Page size is already set to "
            r0 = 46
            java.lang.String r0 = X.AnonymousClass00U.A0E(r1, r0, r2)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x004e:
            X.AnonymousClass0OU.A00(r4)
            X.0YY r0 = r6.A04
            X.C86124wJ.A1S(r6, r7, r5, r3)
            java.lang.Object r4 = r0.invoke(r5)
            if (r4 != r1) goto L_0x002c
            return r1
        L_0x005d:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x0063:
            r5.A00 = r1
        L_0x0065:
            if (r4 == r7) goto L_0x0096
            kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2 r1 = new kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2
            r1.<init>(r6, r3)
            X.6uj r0 = r4.A00
            r0.A00(r1)
            if (r7 == 0) goto L_0x0081
            r0 = 2
            kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2 r1 = new kotlin.jvm.internal.IDxRImplShape182S0000000_2_I2
            r1.<init>(r6, r0)
            X.6uj r0 = r7.A00
            r0.A01(r1)
            r7.A03()
        L_0x0081:
            X.8dV r0 = X.AnonymousClass6D2.A00
            if (r0 == 0) goto L_0x0095
            r0 = 3
            boolean r0 = X.C86164wN.A1P(r0)
            if (r0 != r3) goto L_0x0095
            java.lang.String r0 = "Generated new PagingSource "
            java.lang.String r0 = X.AnonymousClass0wJ.A0t(r0, r4)
            X.C04220Ms.A0B(r0, r3)
        L_0x0095:
            return r4
        L_0x0096:
            java.lang.String r0 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x009d:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher.A00(androidx.paging.PageFetcher, androidx.paging.PagingSource, X.8n9):java.lang.Object");
    }
}
