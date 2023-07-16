package com.instagram.clips.drafts.model.disk;

import X.C04220Ms;
import X.C25736Dr2;
import X.C82304pP;
import X.EA2;
import X.EFO;

public final class DraftDirectoryDiskCleanupJob implements C82304pP {
    public final EA2 A00;
    public final C25736Dr2 A01;
    public final EFO A02;

    public DraftDirectoryDiskCleanupJob(EA2 ea2, C25736Dr2 dr2, EFO efo) {
        C04220Ms.A0B(dr2, 1);
        this.A01 = dr2;
        this.A00 = ea2;
        this.A02 = efo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[LOOP:0: B:10:0x002e->B:12:0x0034, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob r5, X.C146958n9 r6) {
        /*
            r3 = 35
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2.A00(r3, r6)
            if (r0 == 0) goto L_0x004e
            r4 = r6
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.D0E r2 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r1) goto L_0x0058
            X.AnonymousClass0OU.A00(r3)
        L_0x0024:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x002e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r1.next()
            X.6eJ r0 = (X.C105986eJ) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L_0x002e
        L_0x0040:
            X.AnonymousClass0OU.A00(r3)
            X.Dr2 r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A03(r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x004e:
            kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2 r4 = X.C86124wJ.A15(r5, r6, r3)
            goto L_0x0016
        L_0x0053:
            java.util.Set r2 = X.AnonymousClass00J.A0c(r2)
            return r2
        L_0x0058:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob.A00(com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob, X.8n9):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CfO(com.instagram.service.session.UserSession r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r4 = 47
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r4, r9)
            if (r0 == 0) goto L_0x0076
            r3 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0076
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r3.A03
            X.D0E r1 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 != r4) goto L_0x007c
            java.lang.Object r8 = r3.A02
            com.instagram.service.session.UserSession r8 = (com.instagram.service.session.UserSession) r8
            java.lang.Object r6 = r3.A01
            com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob r6 = (com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob) r6
            X.AnonymousClass0OU.A00(r5)
        L_0x002c:
            java.util.Set r5 = (java.util.Set) r5
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = com.instagram.pendingmedia.store.PendingMediaStore.A01(r8)
            java.lang.Integer r0 = X.AnonymousClass006.A1L
            java.util.List r0 = r1.A0C(r0)
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r2 = r0.iterator()
        L_0x0044:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r1 = r2.next()
            com.instagram.pendingmedia.model.PendingMedia r1 = (com.instagram.pendingmedia.model.PendingMedia) r1
            X.Apr r0 = r1.A1D
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L_0x005c
        L_0x0058:
            java.lang.String r0 = r1.A3G
            if (r0 == 0) goto L_0x0044
        L_0x005c:
            r3.add(r0)
            goto L_0x0044
        L_0x0060:
            X.AnonymousClass0OU.A00(r5)
            X.EFO r0 = r7.A02
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00b5
            X.C86124wJ.A1S(r7, r8, r3, r4)
            java.lang.Object r5 = A00(r7, r3)
            if (r5 == r1) goto L_0x00b7
            r6 = r7
            goto L_0x002c
        L_0x0076:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r3.<init>(r7, r9, r4)
            goto L_0x0016
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0081:
            java.util.Set r3 = X.AnonymousClass00J.A0c(r3)
            boolean r0 = X.C18190wL.A1a(r3)
            if (r0 == 0) goto L_0x00b8
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326541331932795(0x810ecc0002267b, double:3.03638924133082E-306)
            boolean r0 = X.C63803iN.A0E(r2, r8, r0)
            if (r0 == 0) goto L_0x00b8
            java.util.Set r5 = X.AnonymousClass4WL.A01(r3, r5)
        L_0x009c:
            X.EFO r3 = r6.A02
            com.instagram.pendingmedia.store.PendingMediaStore r0 = com.instagram.pendingmedia.store.PendingMediaStore.A01(r8)
            java.util.Set r2 = r0.A0E()
            X.C04220Ms.A0B(r5, r4)
            X.0gW r1 = X.AnonymousClass0gN.A00()
            X.1mf r0 = new X.1mf
            r0.<init>(r3, r5, r2)
            r1.AKp(r0)
        L_0x00b5:
            kotlin.Unit r1 = kotlin.Unit.A00
        L_0x00b7:
            return r1
        L_0x00b8:
            X.AnonymousClass4WL.A01(r3, r5)
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.disk.DraftDirectoryDiskCleanupJob.CfO(com.instagram.service.session.UserSession, X.8n9):java.lang.Object");
    }
}
