package com.instagram.urlhandlers.infocenter;

import X.AnonymousClass006;
import X.C10300i6;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public class InfoCenterExternalUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;
    public Integer A01 = AnonymousClass006.A0C;

    public final void A0D(Bundle bundle) {
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fd, code lost:
        if (r3 != null) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = 840631933(0x321b067d, float:9.023663E-9)
            int r1 = X.C14030oh.A00(r0)
            r12 = r18
            r0 = r19
            super.onCreate(r0)
            android.os.Bundle r2 = X.AnonymousClass0wJ.A0C(r12)
            if (r2 != 0) goto L_0x001e
            r12.finish()
            r0 = -481635949(0xffffffffe34ad193, float:-3.7413437E21)
        L_0x001a:
            X.C14030oh.A07(r0, r1)
            return
        L_0x001e:
            X.0RG r0 = X.AnonymousClass0RA.A0C
            X.0i6 r0 = r0.A02(r2)
            r12.A00 = r0
            java.lang.String r0 = "original_url"
            java.lang.String r5 = r2.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x01a4
            java.lang.String r0 = "votinginfocenter"
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x00c7
            r0 = 44
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "coronavirus_info"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x00c4
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x0050:
            r12.A01 = r0
            java.io.PrintStream r9 = java.lang.System.err
            java.lang.StringBuilder r10 = X.C18200wM.A0r()
            java.lang.Integer r8 = X.AnonymousClass006.A01
            boolean r0 = X.C18180wK.A1Z(r0, r8)
            r10.append(r0)
            java.lang.String r11 = " "
            r10.append(r11)
            X.0i6 r0 = r12.A00
            X.0TJ r6 = X.AnonymousClass0TJ.A06
            r3 = 36312041522266945(0x81019c00010341, double:3.0272195033120893E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r6, r0, r3)
            r10.append(r0)
            r10.append(r11)
            java.lang.Integer r0 = r12.A01
            java.lang.Integer r7 = X.AnonymousClass006.A00
            boolean r0 = X.C18180wK.A1Z(r0, r7)
            r10.append(r0)
            r10.append(r11)
            X.0i6 r0 = r12.A00
            r3 = 36313012184810757(0x81027e00000505, double:3.0278333542133404E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r6, r0, r3)
            java.lang.String r0 = X.C18200wM.A0m(r0, r10)
            r9.println(r0)
            java.lang.Integer r0 = r12.A01
            if (r0 != r8) goto L_0x00ae
            X.0i6 r0 = r12.A00
            r3 = 36312041522266945(0x81019c00010341, double:3.0272195033120893E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r6, r0, r3)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00ca
        L_0x00ae:
            java.lang.Integer r0 = r12.A01
            if (r0 != r7) goto L_0x01a4
            X.0i6 r0 = r12.A00
            r3 = 36313012184810757(0x81027e00000505, double:3.0278333542133404E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r6, r0, r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01a4
            goto L_0x00ca
        L_0x00c4:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            goto L_0x0050
        L_0x00c7:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x0050
        L_0x00ca:
            android.net.Uri r7 = X.C15430rJ.A01(r5)     // Catch:{ Exception -> 0x01a4 }
            java.lang.String r3 = r7.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = "http"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x0100
            java.lang.String r0 = "instagram"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x01a4
            java.lang.String r3 = r7.getPath()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00f9
            r0 = 1
            java.lang.String r3 = r3.substring(r0)
        L_0x00f9:
            android.os.Bundle r8 = X.C18180wK.A06()
            if (r3 == 0) goto L_0x0118
            goto L_0x0113
        L_0x0100:
            java.util.List r4 = r7.getPathSegments()
            android.os.Bundle r8 = X.C18180wK.A06()
            int r3 = r4.size()
            r0 = 1
            if (r3 <= r0) goto L_0x0118
            java.lang.String r3 = X.C18190wL.A0p(r4, r0)
        L_0x0113:
            java.lang.String r0 = "url_path"
            r8.putString(r0, r3)
        L_0x0118:
            java.lang.String r4 = "entry_point"
            java.lang.String r0 = r7.getQueryParameter(r4)
            if (r0 == 0) goto L_0x0123
            r8.putString(r4, r0)
        L_0x0123:
            java.lang.String r6 = "media_id"
            java.lang.String r0 = r7.getQueryParameter(r6)
            if (r0 == 0) goto L_0x012e
            r8.putString(r6, r0)
        L_0x012e:
            java.lang.String r5 = "utm_source"
            java.lang.String r0 = r7.getQueryParameter(r5)
            if (r0 == 0) goto L_0x0139
            r8.putString(r5, r0)
        L_0x0139:
            r2.putAll(r8)
            X.0m7 r0 = r12.getSupportFragmentManager()
            boolean r0 = X.AnonymousClass056.A01(r0)
            if (r0 == 0) goto L_0x0151
            X.0i6 r3 = r12.A00
            boolean r0 = r3 instanceof com.instagram.service.session.UserSession
            if (r0 != 0) goto L_0x0156
            X.3YR r0 = X.AnonymousClass3YR.A00
            r0.A02(r12, r2, r3)
        L_0x0151:
            r0 = -2121028031(0xffffffff8193ae41, float:-5.4249314E-38)
            goto L_0x001a
        L_0x0156:
            com.instagram.service.session.UserSession r14 = X.C05030Qo.A02(r3)
            boolean r0 = r2.containsKey(r4)
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = r2.getString(r4)
            X.ItK r13 = X.C101866Sx.A00(r0)
        L_0x0168:
            java.lang.Integer r0 = r12.A01
            int r4 = r0.intValue()
            r0 = 1
            java.lang.String r3 = "url_path"
            if (r4 == r0) goto L_0x018d
            r0 = 0
            if (r4 != r0) goto L_0x0189
            X.6rV r11 = X.C101876Sy.A00()
            java.lang.String r15 = r2.getString(r6)
            java.lang.String r16 = r2.getString(r3)
            java.lang.String r17 = r2.getString(r5)
            r11.A00(r12, r13, r14, r15, r16, r17)
        L_0x0189:
            r12.finish()
            goto L_0x0151
        L_0x018d:
            X.6rV r11 = X.C101876Sy.A00()
            java.lang.String r15 = r2.getString(r6)
            java.lang.String r16 = r2.getString(r3)
            java.lang.String r17 = r2.getString(r5)
            r11.A01(r12, r13, r14, r15, r16, r17)
            goto L_0x0189
        L_0x01a1:
            X.ItK r13 = X.C35356ItK.DEEPLINK
            goto L_0x0168
        L_0x01a4:
            r12.finish()
            r0 = 1649285155(0x624e1823, float:9.504421E20)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.infocenter.InfoCenterExternalUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
