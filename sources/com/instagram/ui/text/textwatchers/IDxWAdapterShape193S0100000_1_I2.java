package com.instagram.ui.text.textwatchers;

import X.C64493mQ;

public class IDxWAdapterShape193S0100000_1_I2 extends C64493mQ {
    public Object A00;
    public final int A01;

    public IDxWAdapterShape193S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r2.setCompoundDrawablesWithIntrinsicBounds(r4.A03, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r0 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        r0 = r0.A00;
        r3 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r0 = r0.A06.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0113, code lost:
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0116, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013f, code lost:
        if (r6.length() <= 0) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0141, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        r2.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016d, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0171, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017d, code lost:
        if (r2 == r1) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e8, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e9, code lost:
        r3.setEnabled(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0089;
                case 1: goto L_0x00c8;
                case 2: goto L_0x0016;
                case 3: goto L_0x002f;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x00de;
                case 7: goto L_0x015f;
                case 8: goto L_0x0100;
                case 9: goto L_0x010d;
                case 10: goto L_0x0064;
                case 11: goto L_0x0117;
                case 12: goto L_0x0183;
                case 13: goto L_0x01b6;
                case 14: goto L_0x012c;
                case 15: goto L_0x0133;
                case 16: goto L_0x0146;
                case 17: goto L_0x014e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A00
            X.3Fs r0 = (X.C58463Fs) r0
            X.353 r0 = r0.A01
            if (r0 == 0) goto L_0x0015
            X.1aw r1 = r0.A00
            r0 = 0
            r1.A08 = r0
            X.AnonymousClass1aw.A01(r1)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r4 = r5.A00
            X.3G5 r4 = (X.AnonymousClass3G5) r4
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0052
            android.widget.EditText r2 = r4.A06
            android.text.Editable r0 = r2.getText()
            int r1 = android.text.TextUtils.getTrimmedLength(r0)
            r0 = 6
            if (r1 < r0) goto L_0x0052
            r0 = 0
            r4.A02 = r0
            goto L_0x004c
        L_0x002f:
            java.lang.Object r4 = r5.A00
            X.3G5 r4 = (X.AnonymousClass3G5) r4
            android.widget.EditText r0 = r4.A06
            java.lang.String r3 = X.AnonymousClass0wJ.A0n(r0)
            android.widget.EditText r2 = r4.A05
            java.lang.String r1 = X.AnonymousClass0wJ.A0n(r2)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0052
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 0
            r4.A01 = r0
        L_0x004c:
            android.graphics.drawable.Drawable r1 = r4.A03
            r0 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r1, r0, r0, r0)
        L_0x0052:
            X.354 r0 = r4.A00
            if (r0 == 0) goto L_0x0015
            X.1c4 r0 = r0.A00
            android.view.View r3 = r0.A00
            if (r3 == 0) goto L_0x0015
            X.3G5 r0 = r0.A06
            boolean r0 = r0.A00()
            goto L_0x01e9
        L_0x0064:
            java.lang.Object r3 = r5.A00
            X.1sf r3 = (X.C27531sf) r3
            android.widget.TextView r1 = r3.A01
            if (r1 == 0) goto L_0x007e
            r0 = 2131821237(0x7f1102b5, float:1.9275212E38)
            r1.setText(r0)
            android.widget.TextView r2 = r3.A01
            android.app.Activity r1 = r3.getRootActivity()
            r0 = 2131100109(0x7f0601cd, float:1.781259E38)
            X.C18180wK.A0s(r1, r2, r0)
        L_0x007e:
            int r1 = r6.length()
            r0 = 2
            if (r1 < r0) goto L_0x0015
            X.C18240wQ.A10(r3)
            return
        L_0x0089:
            java.lang.Object r4 = r5.A00
            X.1cf r4 = (X.AnonymousClass1cf) r4
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A03
            java.lang.String r0 = X.C18180wK.A0f(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0015
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A03
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x0015
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A03
            java.lang.String r3 = X.C18210wN.A0c(r0)
            r2 = 0
        L_0x00a8:
            java.lang.String[] r1 = X.C40566Lj1.A00
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0156
            r0 = r1[r2]
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00c5
            r0 = 0
            r4.A05 = r0
            r0 = 2131832183(0x7f112d77, float:1.9297413E38)
            java.lang.String r1 = r4.getString(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r4.Cth(r1, r0)
            return
        L_0x00c5:
            int r2 = r2 + 1
            goto L_0x00a8
        L_0x00c8:
            java.lang.Object r2 = r5.A00
            X.1c9 r2 = (X.AnonymousClass1c9) r2
            com.instagram.ui.text.FreeAutoCompleteTextView r0 = r2.A0E
            java.lang.String r0 = X.C18180wK.A0f(r0)
            boolean r1 = X.C18210wN.A1U(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r2.A0G
            r0.setEnabled(r1)
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r2.A0F
            goto L_0x0113
        L_0x00de:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r0 = r5.A00
            X.1aN r0 = (X.AnonymousClass1aN) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r2 = r0.A02
            if (r2 != 0) goto L_0x00ee
            java.lang.String r0 = "nextButton"
            goto L_0x016d
        L_0x00ee:
            int r1 = r6.length()
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r0 = r0.A01
            if (r0 == 0) goto L_0x0180
            int r0 = r0.A03
            boolean r0 = X.AnonymousClass0wJ.A1T(r1, r0)
            r2.setEnabled(r0)
            return
        L_0x0100:
            java.lang.Object r1 = r5.A00
            X.1cj r1 = (X.AnonymousClass1cj) r1
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r1.A0O
            r0.A04()
            r0 = 1
            r1.A0V = r0
            return
        L_0x010d:
            java.lang.Object r0 = r5.A00
            X.1cj r0 = (X.AnonymousClass1cj) r0
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r0.A0N
        L_0x0113:
            r0.A04()
            return
        L_0x0117:
            java.lang.Object r0 = r5.A00
            X.1cg r0 = (X.C23201cg) r0
            android.os.Handler r3 = r0.A0L
            r1 = 1
            r3.removeMessages(r1)
            r0 = 0
            android.os.Message r2 = android.os.Message.obtain(r0, r1)
            r0 = 250(0xfa, double:1.235E-321)
            r3.sendMessageDelayed(r2, r0)
            return
        L_0x012c:
            java.lang.Object r0 = r5.A00
            X.3Cp r0 = (X.C57823Cp) r0
            android.widget.ImageView r2 = r0.A05
            goto L_0x0139
        L_0x0133:
            java.lang.Object r0 = r5.A00
            X.3GG r0 = (X.AnonymousClass3GG) r0
            android.widget.ImageView r2 = r0.A06
        L_0x0139:
            int r1 = r6.length()
            r0 = 8
            if (r1 <= 0) goto L_0x0142
            r0 = 0
        L_0x0142:
            r2.setVisibility(r0)
            return
        L_0x0146:
            java.lang.Object r0 = r5.A00
            X.1jv r0 = (X.C24721jv) r0
            r0.A02()
            return
        L_0x014e:
            java.lang.Object r0 = r5.A00
            X.1cm r0 = (X.C23211cm) r0
            X.C23211cm.A01(r0)
            return
        L_0x0156:
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r4.A01
            r0.A04()
            r0 = 1
            r4.A05 = r0
            return
        L_0x015f:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            java.lang.Object r0 = r5.A00
            X.1Yw r0 = (X.C22641Yw) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r0.A0B
            if (r3 != 0) goto L_0x0172
            java.lang.String r0 = "confirmButton"
        L_0x016d:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0172:
            int r2 = r6.length()
            com.instagram.ui.widget.edittext.ConfirmationCodeEditText r0 = r0.A0A
            if (r0 == 0) goto L_0x0180
            int r1 = r0.A03
            r0 = 0
            if (r2 != r1) goto L_0x01e9
            goto L_0x01e8
        L_0x0180:
            java.lang.String r0 = "confirmationCodeEditText"
            goto L_0x016d
        L_0x0183:
            java.lang.Object r4 = r5.A00
            X.1ck r4 = (X.AnonymousClass1ck) r4
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A08
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x019b
            android.os.Handler r3 = r4.A0F
            java.lang.Runnable r2 = r4.A0G
            r3.removeCallbacks(r2)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
        L_0x019b:
            X.3Gi r0 = r4.A01
            r0.A00()
            com.instagram.registration.ui.NotificationBar r0 = r4.A04
            r0.A02()
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r4.A06
            r0.A04()
            X.3GA r0 = r4.A00
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r4.A07
            goto L_0x01e8
        L_0x01b6:
            java.lang.Object r4 = r5.A00
            X.1cl r4 = (X.AnonymousClass1cl) r4
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r4.A08
            boolean r0 = r0.isFocused()
            if (r0 == 0) goto L_0x01ce
            android.os.Handler r3 = r4.A0F
            java.lang.Runnable r2 = r4.A0G
            r3.removeCallbacks(r2)
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
        L_0x01ce:
            X.3Gi r0 = r4.A01
            r0.A00()
            com.instagram.registration.ui.NotificationBar r0 = r4.A04
            r0.A02()
            com.instagram.ui.widget.inlineerror.InlineErrorMessageView r0 = r4.A06
            r0.A04()
            X.3GA r0 = r4.A00
            android.view.View r1 = r0.A00
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r4.A07
        L_0x01e8:
            r0 = 1
        L_0x01e9:
            r3.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.text.textwatchers.IDxWAdapterShape193S0100000_1_I2.afterTextChanged(android.text.Editable):void");
    }
}
