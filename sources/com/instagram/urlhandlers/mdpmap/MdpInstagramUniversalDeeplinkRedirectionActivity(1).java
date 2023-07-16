package com.instagram.urlhandlers.mdpmap;

import X.AnonymousClass0wJ;
import X.C10300i6;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.HashMap;

public final class MdpInstagramUniversalDeeplinkRedirectionActivity extends BaseFragmentActivity {
    public static final HashMap A01;
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    static {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A01 = A0y;
        A0y.put("settings", "instagram://settings");
        A0y.put("news", "instagram://news");
        A0y.put("professional_dashboard", "instagram://professional_dashboard");
        A0y.put("news", "instagram://news");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 1223818202(0x48f1fbda, float:495582.8)
            int r4 = X.C14030oh.A00(r0)
            super.onCreate(r7)
            android.content.Intent r1 = r6.getIntent()
            android.os.Bundle r5 = X.C18210wN.A0B(r1)
            if (r5 != 0) goto L_0x001e
            r6.finish()
            r0 = -1088362035(0xffffffffbf20e9cd, float:-0.6285675)
        L_0x001a:
            X.C14030oh.A07(r0, r4)
            return
        L_0x001e:
            X.0i6 r0 = X.C18190wL.A0S(r5)
            r6.A00 = r0
            java.lang.String r0 = "deeplink"
            java.lang.String r2 = r1.getStringExtra(r0)
            if (r2 == 0) goto L_0x0075
            java.util.HashMap r1 = A01
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = X.C18240wQ.A0f(r2, r1)
            android.content.Intent r3 = X.C18190wL.A0B(r0)
            java.lang.String r0 = "android.intent.category.BROWSABLE"
            r3.addCategory(r0)
        L_0x0047:
            X.0i6 r2 = r6.A00
            if (r2 == 0) goto L_0x0061
            boolean r0 = r2 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x005e
            X.0Ok r1 = X.C06810aP.A01
            r0 = r2
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = r0.A2i()
            if (r0 != 0) goto L_0x0061
        L_0x005e:
            X.AnonymousClass3YR.A00(r6, r5, r2)
        L_0x0061:
            if (r3 == 0) goto L_0x006e
            X.0t2 r0 = X.C16420t2.A00()
            X.05M r0 = r0.A06()
            r0.A09(r6, r3)
        L_0x006e:
            r6.finish()
            r0 = -1538536660(0xffffffffa44bcb2c, float:-4.41907E-17)
            goto L_0x001a
        L_0x0075:
            r3 = 0
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.mdpmap.MdpInstagramUniversalDeeplinkRedirectionActivity.onCreate(android.os.Bundle):void");
    }
}
