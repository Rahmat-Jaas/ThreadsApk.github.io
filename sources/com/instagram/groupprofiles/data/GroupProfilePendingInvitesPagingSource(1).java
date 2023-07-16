package com.instagram.groupprofiles.data;

import X.C04220Ms;
import X.C115116uX;
import androidx.paging.PagingSource;
import com.instagram.service.session.UserSession;

public final class GroupProfilePendingInvitesPagingSource extends PagingSource {
    public final UserSession A00;
    public final String A01;

    public GroupProfilePendingInvitesPagingSource(UserSession userSession, String str) {
        C04220Ms.A0B(str, 2);
        this.A00 = userSession;
        this.A01 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C112056ou r8, X.C146958n9 r9) {
        /*
            r7 = this;
            r3 = 48
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5.A00(r3, r9)
            if (r0 == 0) goto L_0x0078
            r5 = r9
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r5 = (kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0078
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r2) goto L_0x00bc
            X.AnonymousClass0OU.A00(r1)
        L_0x0024:
            X.3b6 r1 = (X.C62903b6) r1
            boolean r0 = r1 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x0088
            X.1jA r1 = (X.AnonymousClass1jA) r1
            java.lang.Object r0 = r1.A00
            X.1RZ r0 = (X.AnonymousClass1RZ) r0
            X.37I r0 = r0.A00
            if (r0 != 0) goto L_0x007d
            X.C18250wR.A0m()
            r0 = 0
            throw r0
        L_0x0039:
            X.AnonymousClass0OU.A00(r1)
            com.instagram.service.session.UserSession r1 = r7.A00
            java.lang.String r0 = r7.A01
            java.lang.Object r4 = r8.A00()
            java.lang.String r4 = (java.lang.String) r4
            r5.A00 = r2
            r3 = 0
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "groups/%s/member_invite_list/"
            r2.A0T(r0, r1)
            java.lang.Class<X.1RZ> r1 = X.AnonymousClass1RZ.class
            java.lang.Class<X.3KL> r0 = X.AnonymousClass3KL.class
            r2.A0B(r1, r0)
            if (r4 == 0) goto L_0x006a
            int r0 = r4.length()
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "max_id"
            r2.A0O(r0, r4)
        L_0x006a:
            X.H8c r1 = r2.A02()
            r0 = 294689531(0x11909afb, float:2.2814708E-28)
            java.lang.Object r1 = X.C63623hv.A00(r1, r5, r0, r3)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x0078:
            kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5 r5 = X.C18190wL.A0y(r7, r9, r3)
            goto L_0x0016
        L_0x007d:
            java.util.List r2 = r0.A01
            r1 = 0
            java.lang.String r0 = r0.A00
            X.59e r3 = new X.59e
            r3.<init>(r1, r0, r2)
            return r3
        L_0x0088:
            boolean r0 = r1 instanceof X.AnonymousClass1jB
            if (r0 == 0) goto L_0x00b7
            X.2L8 r1 = X.AnonymousClass1jB.A00(r1)
            boolean r0 = r1 instanceof X.AnonymousClass1j9
            if (r0 == 0) goto L_0x00a9
            X.1j9 r1 = (X.AnonymousClass1j9) r1
            X.8mT r0 = r1.A00
            X.1j3 r0 = (X.AnonymousClass1j3) r0
            java.lang.String r1 = r0.getStatus()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r1)
        L_0x00a3:
            X.59d r3 = new X.59d
            r3.<init>(r0)
            return r3
        L_0x00a9:
            boolean r0 = r1 instanceof X.AnonymousClass1j8
            if (r0 == 0) goto L_0x00b2
            X.1j8 r1 = (X.AnonymousClass1j8) r1
            java.lang.Throwable r0 = r1.A00
            goto L_0x00a3
        L_0x00b2:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00b7:
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.groupprofiles.data.GroupProfilePendingInvitesPagingSource.A01(X.6ou, X.8n9):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object A02(C115116uX r2) {
        return null;
    }
}
