package X;

import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.7qK  reason: invalid class name and case insensitive filesystem */
public final class C130587qK implements C147008nE {
    public final UserSession A00;
    public final File A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r4, 36311345737499173L) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C130587qK(com.instagram.service.session.UserSession r4, android.content.Context r5, boolean r6) {
        /*
            r3 = this;
            r0 = 1
            X.C04220Ms.A0B(r5, r0)
            r3.<init>()
            r3.A00 = r4
            r3.A02 = r6
            java.io.File r0 = X.C25651DpX.A00(r5, r4)
            r3.A01 = r0
            X.0Kh r0 = X.C03690Kh.A01()
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x0029
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36311345737499173(0x8100fa00000225, double:3.02677948622325E-306)
            boolean r1 = X.C63803iN.A0E(r2, r4, r0)
            r0 = 1
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r3.A04 = r0
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36318913471255363(0x8107dc00151343, double:3.0315653515234824E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            r3.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130587qK.<init>(com.instagram.service.session.UserSession, android.content.Context, boolean):void");
    }

    public final void onFinish() {
    }

    public final InputStream DBG(AnonymousClass3Ud r4, InputStream inputStream) {
        String str;
        if (r4 == null || (str = r4.A01) == null) {
            str = "";
        }
        if (!this.A02 || (this.A03 && !C04220Ms.A0I(str, "cache"))) {
            return inputStream;
        }
        return new AnonymousClass66C(this.A01, inputStream, this.A04);
    }
}
