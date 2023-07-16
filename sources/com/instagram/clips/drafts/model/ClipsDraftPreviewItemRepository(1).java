package com.instagram.clips.drafts.model;

import X.AnonymousClass006;
import X.AnonymousClass0YY;
import X.AnonymousClass0gQ;
import X.AnonymousClass0gW;
import X.AnonymousClass7Ja;
import X.C120467Az;
import X.C146958n9;
import X.C18250wR;
import X.C25237DiI;
import X.C25736Dr2;
import X.C27952Ew2;
import X.C84714tk;
import X.C86124wJ;
import X.C86154wM;
import X.E5N;
import X.Lv1;
import X.MAm;
import android.content.Context;
import android.os.CancellationSignal;
import com.facebook.redex.IDxCallableShape88S0200000_2_I2;
import com.facebook.redex.IDxFlowShape251S0100000_2_I2;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2;

public final class ClipsDraftPreviewItemRepository {
    public final Context A00;
    public final ClipsDraftLocalDataSource A01;
    public final AnonymousClass0gQ A02;
    public final UserSession A03;
    public final C84714tk A04;
    public final E5N A05;
    public final PendingMediaStore A06;

    public ClipsDraftPreviewItemRepository(Context context, ClipsDraftLocalDataSource clipsDraftLocalDataSource, PendingMediaStore pendingMediaStore, UserSession userSession) {
        int A07 = C86124wJ.A07(1, clipsDraftLocalDataSource, userSession);
        this.A01 = clipsDraftLocalDataSource;
        this.A06 = pendingMediaStore;
        this.A03 = userSession;
        this.A00 = context;
        this.A04 = new IDxFlowShape251S0100000_2_I2(clipsDraftLocalDataSource.A0C(), 17);
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, A07);
        this.A05 = A0J;
        this.A02 = A0J.AHN(2113530577, A07);
        for (PendingMedia pendingMedia : pendingMediaStore.A0C(AnonymousClass006.A06)) {
            this.A06.A07(pendingMedia.A2Y);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0101100_I2(this, (C146958n9) null, 7, currentTimeMillis), AnonymousClass7Ja.A03(this.A02), A07);
    }

    public final void A02(String str, AnonymousClass0YY r10) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1201000_I2(this, r10, str, (C146958n9) null, 29), AnonymousClass7Ja.A03(this.A02), 3);
    }

    public final void A03(String str, AnonymousClass0YY r10) {
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1201000_I2(this, r10, str, (C146958n9) null, 30), AnonymousClass7Ja.A03(this.A02), 3);
    }

    public final Object A00(String str, C146958n9 r8) {
        C25736Dr2 dr2 = this.A01.A04;
        MAm A002 = Lv1.A00("SELECT EXISTS(SELECT 1 FROM drafts WHERE id = ? AND has_published_clip = 0)", 1);
        C86154wM.A1L(A002, str, 1);
        return C120467Az.A00(new CancellationSignal(), dr2.A02, new IDxCallableShape88S0200000_2_I2(11, dr2, A002), r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.util.List<X.CKW> r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 42
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r9)
            if (r0 == 0) goto L_0x011c
            r6 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x011c
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r6.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r1 = r6.A00
            r0 = 1
            if (r1 == 0) goto L_0x00ca
            if (r1 != r0) goto L_0x0123
            java.lang.Object r8 = r6.A02
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r2 = r6.A01
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r2 = (com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository) r2
            X.AnonymousClass0OU.A00(r3)
        L_0x002c:
            java.util.Iterator r6 = r8.iterator()
        L_0x0030:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0128
            java.lang.Object r5 = r6.next()
            X.CKW r5 = (X.CKW) r5
            boolean r0 = r5.A00()
            if (r0 == 0) goto L_0x0030
            com.instagram.service.session.UserSession r4 = r2.A03
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325961511347555(0x810e4500022563, double:3.036022560457964E-306)
            boolean r0 = X.C63803iN.A0E(r3, r4, r0)
            if (r0 == 0) goto L_0x0064
            com.instagram.clips.drafts.backup.ClipsDraftBackupFileUtil r3 = com.instagram.clips.drafts.backup.ClipsDraftBackupFileUtil.A00
            android.content.Context r1 = r2.A00
            java.lang.String r0 = r5.A07
            java.io.File r1 = r3.A01(r1, r4, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0064
            r1.delete()
        L_0x0064:
            X.Dsp r4 = X.C25567Do3.A02(r4)
            java.lang.String r5 = r5.A07
            X.0nS r1 = r4.A0W
            java.lang.String r0 = "ig_camera_draft_delete_success"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 916(0x394, float:1.284E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.C18180wK.A0I(r1, r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r3)
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = r4.A0K
            if (r1 != 0) goto L_0x0084
            java.lang.String r1 = ""
        L_0x0084:
            java.lang.String r0 = "camera_session_id"
            r3.A0T(r0, r1)
            X.9zz r1 = r4.A06
            java.lang.String r0 = "entry_point"
            r3.A0O(r1, r0)
            X.6BO r1 = X.AnonymousClass6BO.STATE_EVENT
            java.lang.String r0 = "event_type"
            r3.A0O(r1, r0)
            X.D36 r1 = r4.A08
            java.lang.String r0 = "media_type"
            r3.A0O(r1, r0)
            X.0kW r0 = r4.A0T
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r3.A0T(r0, r1)
            r0 = 508(0x1fc, float:7.12E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r3.A0T(r0, r5)
            X.D3D r1 = r4.A0o()
            java.lang.String r0 = "camera_destination"
            r3.A0O(r1, r0)
            X.D3Q r1 = r4.A0B
            java.lang.String r0 = "surface"
            r3.A0O(r1, r0)
            X.C18190wL.A1L(r3)
            r3.Bb4()
            goto L_0x0030
        L_0x00ca:
            X.AnonymousClass0OU.A00(r3)
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r3 = r7.A01
            X.C86124wJ.A1S(r7, r8, r6, r0)
            java.util.Iterator r2 = r8.iterator()
        L_0x00d6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r2.next()
            X.CKW r0 = (X.CKW) r0
            java.lang.String r1 = r0.A07
            X.D2O r0 = r0.A03
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource.A01(r3, r0, r1)
            goto L_0x00d6
        L_0x00ea:
            X.Dr2 r4 = r3.A04
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0w(r8)
            java.util.Iterator r1 = r8.iterator()
        L_0x00f4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0106
            java.lang.Object r0 = r1.next()
            X.CKW r0 = (X.CKW) r0
            java.lang.String r0 = r0.A07
            r3.add(r0)
            goto L_0x00f4
        L_0x0106:
            X.M6w r2 = r4.A02
            r1 = 17
            com.facebook.redex.IDxCallableShape88S0200000_2_I2 r0 = new com.facebook.redex.IDxCallableShape88S0200000_2_I2
            r0.<init>(r1, r4, r3)
            java.lang.Object r0 = X.C120467Az.A01(r2, r0, r6)
            if (r0 == r5) goto L_0x0117
            kotlin.Unit r0 = kotlin.Unit.A00
        L_0x0117:
            if (r0 == r5) goto L_0x012a
            r2 = r7
            goto L_0x002c
        L_0x011c:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0123:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0128:
            kotlin.Unit r5 = kotlin.Unit.A00
        L_0x012a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository.A01(java.util.List, X.8n9):java.lang.Object");
    }
}
