package com.instagram.clips.drafts.model.migrations.util;

public final class ClipsDraftsMigrationUtil {
    public static final ClipsDraftsMigrationUtil A00 = new ClipsDraftsMigrationUtil();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        if (r0 == r5) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.D2O r9, X.C25736Dr2 r10, java.lang.String r11, X.C146958n9 r12) {
        /*
            r8 = this;
            r3 = 3
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2.A00(r3, r12)
            if (r0 == 0) goto L_0x0038
            r4 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0038
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r4.A06
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r4.A00
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r1) goto L_0x0070
            if (r2 != r3) goto L_0x003e
            java.lang.Object r7 = r4.A05
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r4.A04
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r4.A03
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r11 = r4.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r4.A01
            X.Dr2 r10 = (X.C25736Dr2) r10
            goto L_0x00a3
        L_0x0038:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0701000_I2
            r4.<init>(r8, r12, r3)
            goto L_0x0015
        L_0x003e:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0043:
            X.AnonymousClass0OU.A00(r0)
            r4.A01 = r10
            r4.A02 = r11
            r4.A00 = r1
            java.lang.String r0 = "SELECT id FROM drafts  WHERE clips_creation_type = ?"
            X.MAm r7 = X.Lv1.A00(r0, r1)
            r0 = 0
            X.C04220Ms.A0B(r9, r0)
            java.lang.String r0 = r9.A00
            X.C86154wM.A1L(r7, r0, r1)
            android.os.CancellationSignal r6 = new android.os.CancellationSignal
            r6.<init>()
            X.M6w r2 = r10.A02
            r1 = 13
            com.facebook.redex.IDxCallableShape88S0200000_2_I2 r0 = new com.facebook.redex.IDxCallableShape88S0200000_2_I2
            r0.<init>(r1, r10, r7)
            java.lang.Object r0 = X.C120467Az.A00(r6, r2, r0, r4)
            if (r0 != r5) goto L_0x007b
        L_0x006f:
            return r5
        L_0x0070:
            java.lang.Object r11 = r4.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r4.A01
            X.Dr2 r10 = (X.C25736Dr2) r10
            X.AnonymousClass0OU.A00(r0)
        L_0x007b:
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r6 = r0.iterator()
        L_0x0085:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = X.C18180wK.A0k(r6)
            r4.A01 = r10     // Catch:{ SQLiteBlobTooBigException -> 0x00ac }
            r4.A02 = r11     // Catch:{ SQLiteBlobTooBigException -> 0x00ac }
            r4.A03 = r7     // Catch:{ SQLiteBlobTooBigException -> 0x00ac }
            r4.A04 = r6     // Catch:{ SQLiteBlobTooBigException -> 0x00ac }
            r4.A05 = r7     // Catch:{ SQLiteBlobTooBigException -> 0x00ac }
            r4.A00 = r3     // Catch:{ SQLiteBlobTooBigException -> 0x00ac }
            java.lang.Object r0 = r10.A02(r0, r4)     // Catch:{ SQLiteBlobTooBigException -> 0x00ac }
            if (r0 == r5) goto L_0x006f
            r2 = r7
            goto L_0x00a6
        L_0x00a3:
            X.AnonymousClass0OU.A00(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00aa }
        L_0x00a6:
            r7.add(r0)     // Catch:{ SQLiteBlobTooBigException -> 0x00aa }
            goto L_0x00ba
        L_0x00aa:
            r1 = move-exception
            goto L_0x00ae
        L_0x00ac:
            r1 = move-exception
            r2 = r7
        L_0x00ae:
            java.lang.String r0 = "SQLiteBlobTooBigException migrateFromClipsDraft()"
            X.C10450iM.A03(r11, r0)
            java.lang.String r0 = r1.getMessage()
            X.AnonymousClass0LU.A0J(r11, r0, r1)
        L_0x00ba:
            r7 = r2
            goto L_0x0085
        L_0x00bc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.migrations.util.ClipsDraftsMigrationUtil.A00(X.D2O, X.Dr2, java.lang.String, X.8n9):java.lang.Object");
    }
}
