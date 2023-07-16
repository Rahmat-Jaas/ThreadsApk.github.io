package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.redex.IDxCListenerShape20S0400000_1_I2;
import com.facebook.redex.IDxCListenerShape4S1400000_1_I2;

/* renamed from: X.3NC  reason: invalid class name */
public final class AnonymousClass3NC {
    public static DialogInterface.OnClickListener A00(Context context, AnonymousClass3BW r11, AnonymousClass3GF r12, C84634tZ r13, C07530bf r14, String str) {
        AnonymousClass3BW r3 = r11;
        AnonymousClass25A r2 = (AnonymousClass25A) AnonymousClass25A.A01.get(r11.A00);
        C307922z r0 = C307922z.GO_TO_HELPER_URL;
        C307922z r1 = r11.A00;
        C07530bf r4 = r14;
        if (r0 == r1) {
            AnonymousClass3YT.A00(r4, (AnonymousClass3V1) null, (C313625r) null, (Integer) null, "access_dialog", r2.A00);
            return new IDxCListenerShape20S0400000_1_I2(10, (Object) r2, (Object) r11, (Object) r14, (Object) context);
        }
        C307922z r02 = C307922z.STOP_ACCOUNT_DELETION;
        String str2 = r2.A00;
        C84634tZ r5 = r13;
        C07530bf r6 = r14;
        if (r02 == r1) {
            AnonymousClass3YT.A00(r6, (AnonymousClass3V1) null, (C313625r) null, (Integer) null, "access_dialog", str2);
            return new IDxCListenerShape4S1400000_1_I2(r2, r3, r4, r5, str, 1);
        }
        AnonymousClass3YT.A00(r6, (AnonymousClass3V1) null, (C313625r) null, (Integer) null, "access_dialog", str2);
        return new IDxCListenerShape20S0400000_1_I2(11, (Object) r2, (Object) r12, (Object) r14, (Object) r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r24 == null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.app.Activity r18, X.AnonymousClass3GF r19, X.C26641qy r20, X.C84634tZ r21, X.C07530bf r22, java.lang.String r23, java.lang.String r24) {
        /*
            r12 = r19
            boolean r0 = r12.A08
            r4 = 1
            r6 = r20
            if (r0 == 0) goto L_0x013a
            java.util.ArrayList r0 = r6.A09
            java.util.Iterator r2 = r0.iterator()
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013a
            java.lang.Object r0 = r2.next()
            X.3BW r0 = (X.AnonymousClass3BW) r0
            X.22z r1 = r0.A00
            X.22z r0 = X.C307922z.SWITCH_TO_SIGNUP_FLOW
            if (r1 != r0) goto L_0x000f
            r9 = 1
        L_0x0022:
            java.lang.String r5 = r6.mErrorTitle
            java.lang.String r1 = r6.getErrorMessage()
            r10 = r18
            X.Dsm r3 = X.C18190wL.A0W(r10)
            java.lang.String r8 = r6.A04
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r14 = r22
            r7 = r24
            if (r0 == 0) goto L_0x0109
            r0 = 2131834837(0x7f1137d5, float:1.9302796E38)
            X.C18220wO.A14(r10, r3, r0)
        L_0x0040:
            if (r24 == 0) goto L_0x0054
        L_0x0042:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0054
            r2 = 2131829574(0x7f112346, float:1.929212E38)
            r1 = 3
            com.facebook.redex.IDxCListenerShape14S1200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape14S1200000_1_I2
            r0.<init>((java.lang.Object) r10, (java.lang.Object) r14, (java.lang.String) r7, (int) r1)
            r3.A0O(r0, r2)
        L_0x0054:
            if (r5 != 0) goto L_0x005d
            r0 = 2131826851(0x7f1118a3, float:1.9286598E38)
            java.lang.String r5 = r10.getString(r0)
        L_0x005d:
            r3.A02 = r5
            java.util.ArrayList r2 = r6.A09
            r13 = r21
            r15 = r23
            if (r9 == 0) goto L_0x00b9
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00a0
            r0 = 0
            java.lang.Object r11 = r2.get(r0)
            X.3BW r11 = (X.AnonymousClass3BW) r11
            android.content.DialogInterface$OnClickListener r5 = A00(r10, r11, r12, r13, r14, r15)
            X.269 r0 = X.AnonymousClass269.AccessDialogSwitchToSignUpNegativeButtonTapped
            X.3jD r1 = new X.3jD
            r1.<init>(r5, r14, r0)
            java.lang.String r0 = r11.A01
            r3.A0b(r1, r0)
            int r0 = r2.size()
            if (r0 <= r4) goto L_0x00a0
            java.lang.Object r11 = r2.get(r4)
            X.3BW r11 = (X.AnonymousClass3BW) r11
            android.content.DialogInterface$OnClickListener r4 = A00(r10, r11, r12, r13, r14, r15)
            java.lang.String r2 = r11.A01
            X.269 r1 = X.AnonymousClass269.AccessDialogSwitchToSignUpPositiveButtonTapped
            X.3jD r0 = new X.3jD
            r0.<init>(r4, r14, r1)
            r3.A0c(r0, r2)
        L_0x00a0:
            boolean r0 = r10.isFinishing()
            if (r0 != 0) goto L_0x00ae
            X.4QN r0 = new X.4QN
            r0.<init>(r3)
            X.C63643hy.A04(r0)
        L_0x00ae:
            if (r9 == 0) goto L_0x00b8
            java.lang.String r2 = "switch_to_signup_dialog_loaded"
            r1 = 0
            X.265 r0 = X.AnonymousClass265.ACCESS_DIALOG
            X.C63313hF.A04(r14, r1, r0, r2)
        L_0x00b8:
            return
        L_0x00b9:
            if (r2 == 0) goto L_0x00fd
            if (r21 == 0) goto L_0x00fd
            int r5 = r2.size()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00a0
            int r0 = r5 + -1
            java.lang.Object r11 = r2.get(r0)
            X.3BW r11 = (X.AnonymousClass3BW) r11
            java.lang.String r1 = r11.A01
            android.content.DialogInterface$OnClickListener r0 = A00(r10, r11, r12, r13, r14, r15)
            r3.A0b(r0, r1)
            r0 = 0
            if (r5 <= r4) goto L_0x00a0
            java.lang.Object r11 = r2.get(r0)
            X.3BW r11 = (X.AnonymousClass3BW) r11
            java.lang.String r1 = r11.A01
            android.content.DialogInterface$OnClickListener r0 = A00(r10, r11, r12, r13, r14, r15)
            r3.A0c(r0, r1)
            r0 = 2
            if (r5 <= r0) goto L_0x00a0
            java.lang.Object r11 = r2.get(r4)
            X.3BW r11 = (X.AnonymousClass3BW) r11
            java.lang.String r1 = r11.A01
            android.content.DialogInterface$OnClickListener r0 = A00(r10, r11, r12, r13, r14, r15)
            r3.A0a(r0, r1)
            goto L_0x00a0
        L_0x00fd:
            boolean r0 = r12.A04
            if (r0 != 0) goto L_0x00a0
            r1 = 2131826195(0x7f111613, float:1.9285268E38)
            r0 = 0
            r3.A0P(r0, r1)
            goto L_0x00a0
        L_0x0109:
            android.text.SpannableStringBuilder r2 = X.C18200wM.A0E(r1)
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x0119
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r4)
            X.AnonymousClass3Zw.A00(r2, r0, r1)
        L_0x0119:
            if (r24 == 0) goto L_0x0135
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0135
            com.facebook.redex.IDxCListenerShape0S2200000_1_I2 r15 = new com.facebook.redex.IDxCListenerShape0S2200000_1_I2
            r16 = r10
            r17 = r14
            r19 = r8
            r20 = r4
            r18 = r7
            r15.<init>(r16, r17, r18, r19, r20)
            r3.A0Z(r15, r2, r8)
            goto L_0x0042
        L_0x0135:
            r3.A0p(r2)
            goto L_0x0040
        L_0x013a:
            r9 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3NC.A01(android.app.Activity, X.3GF, X.1qy, X.4tZ, X.0bf, java.lang.String, java.lang.String):void");
    }
}
