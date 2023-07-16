package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.4GX  reason: invalid class name */
public final class AnonymousClass4GX implements C82884qQ, CallerContextable {
    public static final String __redex_internal_original_name = "IGQPCALTokenFilter";
    public final C564737i A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1 == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CW4(X.C58743Gz r4) {
        /*
            r3 = this;
            X.37i r0 = r3.A00
            com.instagram.service.session.UserSession r2 = r0.A01
            com.facebook.common.callercontext.CallerContext r1 = r0.A00
            java.lang.String r0 = "ig_android_sdk_token_cache_client_cal_token_qp_handler"
            java.lang.String r0 = X.C62963bD.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0015
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4GX.CW4(X.3Gz):boolean");
    }

    public AnonymousClass4GX(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new C564737i(CallerContext.A00(AnonymousClass4GX.class), userSession);
    }
}
