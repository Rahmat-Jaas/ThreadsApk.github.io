package X;

import android.view.View;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.1hm  reason: invalid class name and case insensitive filesystem */
public final class C24261hm extends C63873iU {
    public User A00;
    public boolean A01;
    public final /* synthetic */ C23401dk A02;

    public C24261hm(C23401dk r1, User user, boolean z) {
        this.A02 = r1;
        this.A01 = z;
        this.A00 = user;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r17) {
        /*
            r16 = this;
            r10 = r17
            r0 = 1792937100(0x6ade0c8c, float:1.3422039E26)
            int r6 = X.C14030oh.A03(r0)
            X.4K4 r10 = (X.AnonymousClass4K4) r10
            r0 = -293154983(0xffffffffee86cf59, float:-2.086083E28)
            int r5 = X.C14030oh.A03(r0)
            r2 = r16
            super.onSuccess(r10)
            java.util.List r0 = r10.getItems()
            if (r0 == 0) goto L_0x00a2
            java.util.List r0 = r10.getItems()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a2
            X.1dk r7 = r2.A02
            java.util.List r1 = r10.getItems()
            X.C23401dk.A04(r7, r1)
            java.util.Map r0 = r7.A0A
            com.instagram.user.model.User r3 = r2.A00
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x00b6
            java.util.Map r0 = r7.A0A
            java.lang.Object r2 = r0.get(r3)
            X.3Fz r2 = (X.C58523Fz) r2
            java.util.List r9 = r2.A05
            r9.addAll(r1)
            int r8 = r9.size()
            int r4 = r2.A00
            int r8 = r8 - r4
            boolean r0 = r2.A03
            r1 = 10
            if (r0 == 0) goto L_0x0056
            r1 = 50
        L_0x0056:
            if (r8 > r1) goto L_0x00af
            int r0 = r9.size()
            r2.A00 = r0
            int r0 = r9.size()
            int r0 = r0 + 1
        L_0x0064:
            r2.A01 = r0
            java.lang.String r0 = r10.A02
            r2.A02 = r0
        L_0x006a:
            java.util.Map r0 = r7.A0A
            r0.put(r3, r2)
        L_0x006f:
            X.0y1 r2 = r7.A05
            java.util.Map r0 = r7.A0A
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r1 = X.C18200wM.A0s(r0)
            java.util.List r0 = r2.A04
            r0.clear()
            r0.addAll(r1)
            r0 = 0
            r2.A03 = r0
            r0 = 1521446800(0x5aaf6f90, float:2.46903926E16)
            X.C14020og.A00(r2, r0)
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = r7.A04
            if (r0 == 0) goto L_0x00a2
            java.lang.String r8 = "invite_followers_via_suma_followings"
            r10 = 0
            java.lang.String r9 = r7.A07
            X.JrQ r7 = new X.JrQ
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0.BcA(r7)
        L_0x00a2:
            r0 = -2029802465(0xffffffff8703ac1f, float:-9.905926E-35)
            X.C14030oh.A0A(r0, r5)
            r0 = -576238373(0xffffffffdda74cdb, float:-1.50690639E18)
            X.C14030oh.A0A(r0, r6)
            return
        L_0x00af:
            int r4 = r4 + r1
            r2.A00 = r4
            int r0 = r2.A01
            int r0 = r0 + r1
            goto L_0x0064
        L_0x00b6:
            java.lang.String r0 = r10.A02
            X.3Fz r2 = new X.3Fz
            r2.<init>(r3, r0, r1)
            java.util.Map r0 = r7.A0A
            r0.put(r3, r2)
            java.util.Map r0 = r7.A0A
            java.util.Set r0 = r0.keySet()
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x00d9
            r2.A03 = r0
            android.content.Context r0 = r7.getContext()
            r2.A00(r0)
            goto L_0x006a
        L_0x00d9:
            java.util.Map r0 = r7.A0A
            java.util.Iterator r4 = X.AnonymousClass0wJ.A0z(r0)
        L_0x00df:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006f
            java.util.Map$Entry r3 = X.C18180wK.A0o(r4)
            java.lang.Object r2 = r3.getValue()
            X.3Fz r2 = (X.C58523Fz) r2
            r0 = 0
            r2.A03 = r0
            android.content.Context r0 = r7.getContext()
            r2.A00(r0)
            java.util.Map r1 = r7.A0A
            java.lang.Object r0 = r3.getKey()
            r1.put(r0, r2)
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24261hm.onSuccess(java.lang.Object):void");
    }

    public final void onFail(AnonymousClass3XX r13) {
        String str;
        int A03 = C14030oh.A03(189215934);
        Throwable th = r13.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        C23401dk r1 = this.A02;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r1.A04;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BcB(new C37408JrQ("invite_followers_via_suma_followings", r1.A07, (String) null, str, (String) null, (Map) null, (Map) null, (Map) null));
        }
        C14030oh.A0A(-108033535, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-2066879152);
        if (this.A01) {
            C23401dk r2 = this.A02;
            if (r2.A0I.incrementAndGet() == r2.A09.size()) {
                View view = r2.A01;
                if (view != null) {
                    view.setVisibility(8);
                }
                if (r2.A0A.keySet().isEmpty()) {
                    C18860y1 r1 = r2.A05;
                    r1.A03 = true;
                    C14020og.A00(r1, -900434024);
                }
            }
        }
        C14030oh.A0A(421865071, A03);
    }
}
