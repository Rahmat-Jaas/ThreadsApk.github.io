package com.instagram.clips.drafts.model.disk;

import X.AnonymousClass0wJ;
import X.C25395Dku;
import X.C25736Dr2;
import X.C82304pP;
import X.EFO;
import com.instagram.pendingmedia.store.PendingMediaStore;

public final class PanaVideoSourceVideoDiskCleanupJob implements C82304pP {
    public final PendingMediaStore A00;
    public final EFO A01;
    public final C25736Dr2 A02;
    public final C25395Dku A03;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.clips.drafts.model.disk.PanaVideoSourceVideoDiskCleanupJob r6, X.C146958n9 r7) {
        /*
            r3 = 36
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r7)
            if (r0 == 0) goto L_0x0067
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L_0x0053
            if (r1 != r0) goto L_0x0071
            X.AnonymousClass0OU.A00(r2)
        L_0x0024:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r2.iterator()
        L_0x002e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r0 = r2.next()
            X.DZB r0 = (X.DZB) r0
            if (r0 == 0) goto L_0x002e
            java.util.List r1 = r0.A0f
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass00J.A0G(r1, r0)
            X.Cg2 r0 = (X.C22775Cg2) r0
            if (r0 == 0) goto L_0x002e
            X.CL9 r0 = r0.A0C
            java.lang.String r0 = r0.A0E
            java.io.File r0 = X.C86144wL.A0Z(r0)
            r3.add(r0)
            goto L_0x002e
        L_0x0053:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.clips.drafts.model.migrations.util.ClipsDraftsMigrationUtil r3 = com.instagram.clips.drafts.model.migrations.util.ClipsDraftsMigrationUtil.A00
            X.Dr2 r2 = r6.A02
            X.D2O r1 = X.D2O.FEED_POST
            r5.A00 = r0
            java.lang.String r0 = "PanaVideoSourceVideoDiskCleanupJob"
            java.lang.Object r2 = r3.A00(r1, r2, r0, r5)
            if (r2 != r4) goto L_0x0024
            return r4
        L_0x0067:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r5 = X.C86124wJ.A15(r6, r7, r3)
            goto L_0x0016
        L_0x006c:
            java.util.Set r4 = X.AnonymousClass00J.A0c(r3)
            return r4
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.disk.PanaVideoSourceVideoDiskCleanupJob.A00(com.instagram.clips.drafts.model.disk.PanaVideoSourceVideoDiskCleanupJob, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096 A[Catch:{ IOException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1 A[Catch:{ IOException -> 0x00d1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CfO(com.instagram.service.session.UserSession r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 48
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r9)
            if (r0 == 0) goto L_0x008a
            r5 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A03
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r3) goto L_0x00d4
            java.lang.Object r1 = r5.A02
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r5.A01
            com.instagram.clips.drafts.model.disk.PanaVideoSourceVideoDiskCleanupJob r0 = (com.instagram.clips.drafts.model.disk.PanaVideoSourceVideoDiskCleanupJob) r0
            X.AnonymousClass0OU.A00(r2)
        L_0x002c:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r4 = X.AnonymousClass4WL.A01(r2, r1)
            goto L_0x0090
        L_0x0033:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = r7.A00
            java.lang.Integer r0 = X.AnonymousClass006.A1L
            java.util.List r0 = r1.A0C(r0)
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r0.iterator()
        L_0x0046:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()
            com.instagram.pendingmedia.model.PendingMedia r0 = (com.instagram.pendingmedia.model.PendingMedia) r0
            com.instagram.pendingmedia.model.ClipInfo r0 = r0.A1C
            if (r0 == 0) goto L_0x0046
            r4.add(r0)
            goto L_0x0046
        L_0x005a:
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r4.iterator()
        L_0x0062:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r1.next()
            com.instagram.pendingmedia.model.ClipInfo r0 = (com.instagram.pendingmedia.model.ClipInfo) r0
            java.lang.String r0 = r0.A0D
            if (r0 == 0) goto L_0x0062
            java.io.File r0 = X.C86144wL.A0Z(r0)
            r2.add(r0)
            goto L_0x0062
        L_0x007a:
            java.util.Set r1 = X.AnonymousClass00J.A0c(r2)
            X.C86124wJ.A1S(r7, r1, r5, r3)
            java.lang.Object r2 = A00(r7, r5)
            if (r2 != r6) goto L_0x0088
            return r6
        L_0x0088:
            r0 = r7
            goto L_0x002c
        L_0x008a:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r5.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0090:
            X.EFO r2 = r0.A01     // Catch:{ IOException -> 0x00d1 }
            boolean r0 = r2.A01     // Catch:{ IOException -> 0x00d1 }
            if (r0 != 0) goto L_0x00a3
            java.io.File r1 = r2.A03     // Catch:{ IOException -> 0x00d1 }
            java.lang.String r0 = "panavideo"
            java.io.File r0 = X.C86154wM.A0U(r1, r0)     // Catch:{ IOException -> 0x00d1 }
            X.AnonymousClass0hL.A07(r0)     // Catch:{ IOException -> 0x00d1 }
            r2.A01 = r3     // Catch:{ IOException -> 0x00d1 }
        L_0x00a3:
            java.io.File r1 = r2.A06     // Catch:{ IOException -> 0x00d1 }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x00d1 }
            if (r0 == 0) goto L_0x00d1
            java.io.File[] r0 = r1.listFiles()     // Catch:{ IOException -> 0x00d1 }
            if (r0 == 0) goto L_0x00d1
            java.util.List r0 = X.AnonymousClass8AP.A0A(r0)     // Catch:{ IOException -> 0x00d1 }
            if (r0 == 0) goto L_0x00d1
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x00d1 }
        L_0x00bb:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x00d1 }
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x00d1 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ IOException -> 0x00d1 }
            boolean r0 = r4.contains(r1)     // Catch:{ IOException -> 0x00d1 }
            if (r0 != 0) goto L_0x00bb
            r1.delete()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00bb
        L_0x00d1:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x00d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.disk.PanaVideoSourceVideoDiskCleanupJob.CfO(com.instagram.service.session.UserSession, X.8n9):java.lang.Object");
    }

    public PanaVideoSourceVideoDiskCleanupJob(C25736Dr2 dr2, C25395Dku dku, PendingMediaStore pendingMediaStore, EFO efo) {
        AnonymousClass0wJ.A1O(dr2, dku);
        this.A02 = dr2;
        this.A03 = dku;
        this.A00 = pendingMediaStore;
        this.A01 = efo;
    }
}
