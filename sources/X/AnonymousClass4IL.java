package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.4IL  reason: invalid class name */
public final class AnonymousClass4IL implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r1.A3Z() == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BN1(android.net.Uri r9, android.os.Bundle r10) {
        /*
            r8 = this;
            androidx.fragment.app.Fragment r4 = r8.A00
            android.content.Context r3 = r4.requireContext()
            com.instagram.service.session.UserSession r6 = r8.A01
            java.lang.String r2 = "qp"
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r6)
            java.lang.String r0 = r1.A17()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001f
            boolean r0 = r1.A3Z()
            r7 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r7 = 0
        L_0x0020:
            X.1ho r5 = new X.1ho
            r5.<init>(r3, r4, r6, r2)
            com.facebook.common.callercontext.CallerContext r1 = X.C67243zD.A00
            java.lang.String r0 = "ig_professional_fb_page_linking"
            boolean r0 = X.C61853Wb.A01(r1, r6, r0)
            if (r0 == 0) goto L_0x0033
            X.C67243zD.A01(r3, r4, r5, r6, r7)
            return
        L_0x0033:
            X.42n r2 = new X.42n
            r2.<init>(r3, r4, r5, r6, r7)
            X.C67243zD.A02(r4, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4IL.BN1(android.net.Uri, android.os.Bundle):void");
    }

    public AnonymousClass4IL(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
