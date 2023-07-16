package com.instagram.urlhandlers.clips;

import X.C10300i6;
import X.C18180wK;
import X.C25556Dns;
import X.C37220Jmj;
import X.C37235Jn1;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class ClipsUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;
    public Boolean A01 = C18180wK.A0X();

    public final void A0D(Bundle bundle) {
    }

    public final C37220Jmj getGnvGestureHandler() {
        C10300i6 r2 = this.A00;
        if (!C25556Dns.A02(r2)) {
            return null;
        }
        C37220Jmj A002 = C37220Jmj.A00(r2);
        C37235Jn1 A003 = C37235Jn1.A00(r2);
        A002.A03(A003);
        A002.A02(A003);
        return A002;
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        if (X.C19430AwC.A01(r1, false) == false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 1162090481(0x454417f1, float:3137.4963)
            int r5 = X.C14030oh.A00(r0)
            super.onCreate(r9)
            android.os.Bundle r3 = X.AnonymousClass0wJ.A0C(r8)
            r3.getClass()
            X.0i6 r0 = X.C18190wL.A0S(r3)
            r8.A00 = r0
            java.lang.String r0 = "extra_source_intent"
            android.os.Parcelable r2 = r3.getParcelable(r0)
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 == 0) goto L_0x002e
            r1 = 0
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_IS_INTERNAL_LINK"
            boolean r0 = r2.getBooleanExtra(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A01 = r0
        L_0x002e:
            java.lang.String r7 = X.C18190wL.A0i(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x004b
            X.0i6 r6 = r8.A00
            boolean r0 = r6 instanceof com.instagram.service.session.UserSession
            if (r0 != 0) goto L_0x0055
            r1 = 1
            java.lang.String r0 = "ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG"
            r3.putBoolean(r0, r1)
            X.3YR r1 = X.AnonymousClass3YR.A00
            X.0i6 r0 = r8.A00
            r1.A02(r8, r3, r0)
        L_0x004b:
            r8.finish()
        L_0x004e:
            r0 = -1078964824(0xffffffffbfb04da8, float:-1.3773699)
            X.C14030oh.A07(r0, r5)
            return
        L_0x0055:
            com.instagram.service.session.UserSession r6 = (com.instagram.service.session.UserSession) r6
            r1 = 0
            java.lang.Boolean r0 = r8.A01
            boolean r4 = r0.booleanValue()
            r3 = 0
            X.C04220Ms.A0B(r6, r3)
            r2 = 1
            r0 = 3
            X.C04220Ms.A0B(r7, r0)
            android.os.Bundle r1 = X.C19430AwC.A00(r6, r7, r1)
            if (r4 == 0) goto L_0x0074
            if (r1 == 0) goto L_0x0074
            java.lang.String r0 = "ClipsConstants.ARG_CLIPS_INTERNAL_LINK"
            r1.putBoolean(r0, r2)
        L_0x0074:
            boolean r0 = X.C19430AwC.A01(r1, r3)
            if (r0 != 0) goto L_0x004e
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.clips.ClipsUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
