package com.instagram.clips.drafts.migrators;

import X.AnonymousClass0QY;
import X.AnonymousClass0TJ;
import X.AnonymousClass4SG;
import X.C121897Ir;
import X.C14030oh;
import X.C63803iN;
import X.C72474Oh;
import android.content.Context;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import com.instagram.service.session.UserSession;
import java.util.List;

public final class ClipsDraftMigrator implements AnonymousClass0QY {
    public final UserSession A00;
    public final List A01;
    public final List A02;
    public final Context A03;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.clips.drafts.migrators.ClipsDraftMigrator r7, X.C146958n9 r8) {
        /*
            r3 = 41
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r8)
            if (r0 == 0) goto L_0x007f
            r4 = r8
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r6 = r4.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r4.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0056
            if (r0 == r2) goto L_0x004a
            if (r0 != r3) goto L_0x0088
            java.lang.Object r2 = r4.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r7 = r4.A01
            com.instagram.clips.drafts.migrators.ClipsDraftMigrator r7 = (com.instagram.clips.drafts.migrators.ClipsDraftMigrator) r7
            X.AnonymousClass0OU.A00(r6)
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r1 = r2.next()
            X.4pP r1 = (X.C82304pP) r1
            com.instagram.service.session.UserSession r0 = r7.A00
            r4.A01 = r7
            r4.A02 = r2
            r4.A00 = r3
            java.lang.Object r0 = r1.CfO(r0, r4)
            if (r0 != r5) goto L_0x002f
            return r5
        L_0x004a:
            java.lang.Object r1 = r4.A02
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r7 = r4.A01
            com.instagram.clips.drafts.migrators.ClipsDraftMigrator r7 = (com.instagram.clips.drafts.migrators.ClipsDraftMigrator) r7
            X.AnonymousClass0OU.A00(r6)
            goto L_0x005f
        L_0x0056:
            X.AnonymousClass0OU.A00(r6)
            java.util.List r0 = r7.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x005f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r1.next()
            X.4pQ r0 = (X.C82314pQ) r0
            r4.A01 = r7
            r4.A02 = r1
            r4.A00 = r2
            java.lang.Object r0 = r0.BgE(r4)
            if (r0 != r5) goto L_0x005f
            return r5
        L_0x0078:
            java.util.List r0 = r7.A01
            java.util.Iterator r2 = r0.iterator()
            goto L_0x002f
        L_0x007f:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r4.<init>(r7, r8, r3)
            goto L_0x0016
        L_0x0085:
            kotlin.Unit r5 = kotlin.Unit.A00
            return r5
        L_0x0088:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.migrators.ClipsDraftMigrator.A00(com.instagram.clips.drafts.migrators.ClipsDraftMigrator, X.8n9):java.lang.Object");
    }

    public ClipsDraftMigrator(Context context, UserSession userSession, List list, List list2) {
        this.A03 = context;
        this.A00 = userSession;
        this.A02 = list;
        this.A01 = list2;
    }

    public final void CSb(boolean z) {
        int i;
        int A032 = C14030oh.A03(-375882000);
        Context context = this.A03;
        if (!C121897Ir.A03(context) || !C121897Ir.A04(context)) {
            UserSession userSession = this.A00;
            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
            boolean A0E = C63803iN.A0E(r2, userSession, 36326541331801721L);
            boolean A0E2 = C63803iN.A0E(r2, userSession, 36326541331867258L);
            if (A0E || A0E2) {
                PendingMediaStoreSerializer.A00(userSession).A04(new AnonymousClass4SG(this, A0E, A0E2));
            }
            i = -999888486;
        } else {
            PendingMediaStoreSerializer.A00(this.A00).A04(new C72474Oh(this));
            i = -334200453;
        }
        C14030oh.A0A(i, A032);
    }
}
