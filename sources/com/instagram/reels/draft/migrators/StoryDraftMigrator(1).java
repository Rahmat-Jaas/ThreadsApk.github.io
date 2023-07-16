package com.instagram.reels.draft.migrators;

import X.AnonymousClass0QY;
import X.AnonymousClass0gW;
import X.AnonymousClass0i4;
import X.AnonymousClass7Ja;
import X.AnonymousClass8bb;
import X.C14030oh;
import X.C146958n9;
import X.C148838sG;
import X.C18250wR;
import X.C25235DiG;
import X.C25237DiI;
import X.C27952Ew2;
import X.C83224qz;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0101000_I2_10;

public final class StoryDraftMigrator implements AnonymousClass0i4, AnonymousClass0QY {
    public final UserSession A00;
    public final List A01;
    public final C83224qz A02 = AnonymousClass7Ja.A03(C25235DiG.A01(new AnonymousClass8bb((C148838sG) null), C18250wR.A0J((AnonymousClass0gW) null, 3).AHN(1911310022, 3)));

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.reels.draft.migrators.StoryDraftMigrator r6, X.C146958n9 r7, boolean r8) {
        /*
            r3 = 5
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x005b
            r5 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A03
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 != r3) goto L_0x0064
            boolean r8 = r5.A05
            java.lang.Object r2 = r5.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r0 = r5.A01
            X.AnonymousClass0OU.A00(r1)
        L_0x002b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0061
            java.lang.Object r1 = r2.next()
            com.instagram.reels.draft.model.migrations.StoryDraftMigration r1 = (com.instagram.reels.draft.model.migrations.StoryDraftMigration) r1
            r5.A01 = r0
            r5.A02 = r2
            r5.A05 = r8
            r5.A00 = r3
            if (r8 == 0) goto L_0x004c
            java.lang.Object r1 = com.instagram.reels.draft.model.migrations.StoryDraftMigration.A00(r1, r5)
        L_0x0045:
            if (r1 == r4) goto L_0x0049
            kotlin.Unit r1 = kotlin.Unit.A00
        L_0x0049:
            if (r1 != r4) goto L_0x002b
            return r4
        L_0x004c:
            java.lang.Object r1 = com.instagram.reels.draft.model.migrations.StoryDraftMigration.A01(r1, r5)
            goto L_0x0045
        L_0x0051:
            X.AnonymousClass0OU.A00(r1)
            java.util.List r0 = r6.A01
            java.util.Iterator r2 = r0.iterator()
            goto L_0x002b
        L_0x005b:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2 r5 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2
            r5.<init>(r6, r7, r3)
            goto L_0x0015
        L_0x0061:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.draft.migrators.StoryDraftMigrator.A00(com.instagram.reels.draft.migrators.StoryDraftMigrator, X.8n9, boolean):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        AnonymousClass7Ja.A05((CancellationException) null, this.A02);
    }

    public StoryDraftMigrator(UserSession userSession, List list) {
        this.A00 = userSession;
        this.A01 = list;
    }

    public final void CSb(boolean z) {
        int A03 = C14030oh.A03(1656905707);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0101000_I2_10(this, (C146958n9) null, 24), this.A02, 3);
        C14030oh.A0A(-51792034, A03);
    }
}
