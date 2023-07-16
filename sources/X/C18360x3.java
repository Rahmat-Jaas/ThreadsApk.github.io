package X;

import android.content.BroadcastReceiver;
import java.util.Map;

/* renamed from: X.0x3  reason: invalid class name and case insensitive filesystem */
public final class C18360x3 extends BroadcastReceiver {
    public final C10300i6 A00;
    public final C82814qJ A01;
    public final String A02;
    public final Map A03;

    public C18360x3() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r11.A01.CHy(r12, r2, r11.A02);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            r11 = this;
            r0 = -804451650(0xffffffffd00d0abe, float:-9.4651658E9)
            int r6 = X.C14030oh.A01(r0)
            java.lang.String r3 = "SmsReceivedBroadcastReceiver"
            java.lang.String r0 = r13.getAction()
            java.lang.String r2 = "android.provider.Telephony.SMS_RECEIVED"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r13.getAction()
            java.lang.String r0 = "Registered to wrong action - expected action: %s, received action: %s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r2, r1)
            X.C10450iM.A03(r3, r0)
            r0 = -562496501(0xffffffffde78fc0b, float:-4.48530678E18)
        L_0x0025:
            X.C14030oh.A0E(r0, r6, r13)
            return
        L_0x0029:
            android.telephony.SmsMessage[] r8 = android.provider.Telephony.Sms.Intents.getMessagesFromIntent(r13)
            if (r8 == 0) goto L_0x0084
            int r7 = r8.length
            r5 = 0
            r4 = 0
        L_0x0032:
            if (r4 >= r7) goto L_0x0064
            r10 = r8[r4]
            java.lang.String r1 = r10.getMessageBody()
            if (r1 == 0) goto L_0x0064
            java.lang.String r2 = X.AnonymousClass3XK.A00(r1)
            if (r2 != 0) goto L_0x00bf
            java.lang.String r9 = X.AnonymousClass3XK.A01(r1)
            if (r9 == 0) goto L_0x0088
            java.lang.String r3 = r10.getDisplayOriginatingAddress()
            if (r3 == 0) goto L_0x00bb
            java.util.Map r2 = r11.A03
            java.lang.Object r1 = r2.get(r3)
            java.lang.String r0 = "#ig"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b8
            X.4qJ r1 = r11.A01
            java.lang.String r0 = r11.A02
            r1.CHy(r12, r9, r0)
        L_0x0063:
            r5 = 1
        L_0x0064:
            X.0i6 r3 = r11.A00
            java.lang.String r2 = "background_confirm_sms_parsed"
            r1 = 0
            X.25r r0 = X.C313625r.PHONE
            X.3Vg r2 = X.C63313hF.A02(r3, r0, r1, r2)
            java.lang.String r0 = "code_found"
            r2.A04(r0, r5)
            java.util.Locale r0 = X.C31103Gfm.A02()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "locale"
            r2.A03(r0, r1)
            r2.A01()
        L_0x0084:
            r0 = 1087811695(0x40d6b06f, float:6.7090373)
            goto L_0x0025
        L_0x0088:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00bb
            java.lang.String r3 = "#ig"
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = " #ig"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "。#ig"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x00bb
        L_0x00a6:
            java.lang.String r1 = r10.getDisplayOriginatingAddress()
            if (r1 == 0) goto L_0x00bb
            java.util.Map r0 = r11.A03
            java.lang.String r2 = X.C18220wO.A0r(r1, r0)
            if (r2 != 0) goto L_0x00bf
            r0.put(r1, r3)
            goto L_0x00bb
        L_0x00b8:
            r2.put(r3, r9)
        L_0x00bb:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x00bf:
            X.4qJ r1 = r11.A01
            java.lang.String r0 = r11.A02
            r1.CHy(r12, r2, r0)
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18360x3.onReceive(android.content.Context, android.content.Intent):void");
    }

    public C18360x3(C10300i6 r2, C82814qJ r3, String str) {
        this.A03 = new C013306f();
        this.A00 = r2;
        this.A02 = str;
        this.A01 = r3;
    }
}
