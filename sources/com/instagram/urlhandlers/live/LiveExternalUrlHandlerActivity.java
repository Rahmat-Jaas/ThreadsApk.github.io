package com.instagram.urlhandlers.live;

import X.C10300i6;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class LiveExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = -320039085(0xffffffffecec9753, float:-2.2881688E27)
            int r5 = X.C14030oh.A00(r0)
            r6 = r19
            r0 = r20
            super.onCreate(r0)
            android.os.Bundle r4 = X.AnonymousClass0wJ.A0C(r6)
            if (r4 == 0) goto L_0x00b5
            java.lang.String r1 = "original_url"
            boolean r0 = X.C18240wQ.A1T(r4, r1)
            if (r0 != 0) goto L_0x00b5
            X.0i6 r0 = X.C18190wL.A0S(r4)
            r6.A00 = r0
            java.lang.String r0 = r4.getString(r1)
            r11 = 0
            android.net.Uri r2 = X.C15430rJ.A01(r0)
            if (r2 != 0) goto L_0x0037
            r6.finish()
            r0 = -471731562(0xffffffffe3e1f296, float:-8.335995E21)
        L_0x0033:
            X.C14030oh.A07(r0, r5)
            return
        L_0x0037:
            java.lang.String r1 = "INSTAGRAM"
            java.lang.String r0 = r2.getScheme()
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r1 = r2.getHost()
            java.lang.String r0 = "live_camera"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0067
            android.content.Intent r0 = X.C62333Yi.A00(r6)
            android.content.Intent r2 = r0.setData(r2)
            r1 = 1
            java.lang.String r0 = "com.instagram.url.extra.IS_ALREADY_HANDLED"
            r2.putExtra(r0, r1)
            X.C10650ih.A02(r6, r2)
            r6.finish()
            r0 = -1684788246(0xffffffff9b942bea, float:-2.4512925E-22)
            goto L_0x0033
        L_0x0067:
            java.util.List r9 = r2.getPathSegments()
            r0 = 0
            java.lang.String r0 = X.C18190wL.A0p(r9, r0)
            android.os.Bundle r8 = X.C18180wK.A06()
            java.lang.String r7 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            r8.putString(r7, r0)
            java.lang.Integer r10 = X.AnonymousClass006.A0C
            r14 = 0
            int r0 = r9.size()
            java.lang.String r3 = "InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS"
            r2 = 2
            if (r0 == r2) goto L_0x0090
            int r1 = r9.size()
            r0 = 3
            if (r1 != r0) goto L_0x00b3
            java.lang.String r14 = X.C18190wL.A0p(r9, r2)
        L_0x0090:
            r16 = 1
            r15 = 0
            com.instagram.profile.intf.AutoLaunchReelParams r9 = new com.instagram.profile.intf.AutoLaunchReelParams
            r12 = r11
            r13 = r11
            r17 = r15
            r18 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r8.putParcelable(r3, r9)
        L_0x00a1:
            r4.putAll(r8)
            boolean r0 = r4.containsKey(r7)
            if (r0 == 0) goto L_0x00af
            X.0i6 r0 = r6.A00
            X.C63753iH.A09(r4, r6, r0)
        L_0x00af:
            r0 = -1528531820(0xffffffffa4e47494, float:-9.907673E-17)
            goto L_0x0033
        L_0x00b3:
            r8 = r11
            goto L_0x00a1
        L_0x00b5:
            r6.finish()
            r0 = -512565558(0xffffffffe172deca, float:-2.8001036E20)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.live.LiveExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
