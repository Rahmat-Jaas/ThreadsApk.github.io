package com.facebook.redex;

import android.text.NoCopySpan;
import android.text.TextWatcher;

public class IDxObjectShape282S0100000_1_I2 implements NoCopySpan, TextWatcher {
    public Object A00;
    public final int A01;

    public IDxObjectShape282S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r5.length() == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r5.length() != 0) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0079;
                case 2: goto L_0x0005;
                case 3: goto L_0x0081;
                case 4: goto L_0x00a4;
                case 5: goto L_0x0030;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0006;
                case 10: goto L_0x0005;
                case 11: goto L_0x00bc;
                case 12: goto L_0x00c7;
                case 13: goto L_0x0044;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0014;
                case 19: goto L_0x00cf;
                case 20: goto L_0x00da;
                case 21: goto L_0x00ee;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r4.A00
            android.view.View r1 = (android.view.View) r1
            r2 = 1
            if (r5 == 0) goto L_0x005a
            int r0 = r5.length()
            if (r0 != 0) goto L_0x005b
            goto L_0x005a
        L_0x0014:
            java.lang.Object r0 = r4.A00
            X.1bo r0 = (X.C23031bo) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r0.A05
            if (r1 != 0) goto L_0x0023
            java.lang.String r0 = "loginButton"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0023:
            if (r5 == 0) goto L_0x002c
            int r2 = r5.length()
            r0 = 0
            if (r2 != 0) goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            r2 = r0 ^ 1
            goto L_0x005b
        L_0x0030:
            java.lang.Object r0 = r4.A00
            com.instagram.creation.fragment.ShareLaterFragment r0 = (com.instagram.creation.fragment.ShareLaterFragment) r0
            X.KYA r1 = r0.A07
            if (r1 == 0) goto L_0x0005
            java.lang.String r0 = r5.toString()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A07(r0)
            return
        L_0x0044:
            java.lang.Object r1 = r4.A00
            X.1Yo r1 = (X.C22561Yo) r1
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.A07
            boolean r0 = X.C18250wR.A1I(r0)
            if (r0 == 0) goto L_0x005f
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.A06
            boolean r0 = X.C18250wR.A1I(r0)
            if (r0 == 0) goto L_0x005f
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r1.A05
        L_0x005a:
            r2 = 0
        L_0x005b:
            r1.setEnabled(r2)
            return
        L_0x005f:
            java.lang.String r0 = r5.toString()
            boolean r0 = X.AnonymousClass0hA.A09(r0)
            if (r0 == 0) goto L_0x0005
            com.instagram.ui.widget.progressbutton.ProgressButton r1 = r1.A05
            r2 = 1
            goto L_0x005b
        L_0x006d:
            java.lang.Object r1 = r4.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r1.invoke(r0)
            return
        L_0x0079:
            java.lang.Object r0 = r4.A00
            X.1by r0 = (X.C23131by) r0
            X.C23131by.A01(r0)
            return
        L_0x0081:
            java.lang.Object r3 = r4.A00
            X.1c2 r3 = (X.AnonymousClass1c2) r3
            X.3IL r2 = new X.3IL
            r2.<init>()
            com.instagram.bugreporter.BugReport r0 = r3.A07
            r2.A01(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = r0.trim()
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            r2.A05 = r1
            com.instagram.bugreporter.BugReport r0 = r2.A00()
            r3.A07 = r0
            return
        L_0x00a4:
            java.lang.Object r2 = r4.A00
            X.1cM r2 = (X.AnonymousClass1cM) r2
            com.instagram.business.ui.BusinessNavBar r1 = r2.A0C
            if (r1 == 0) goto L_0x00b0
            r0 = 0
            r1.setPrimaryButtonEnabled(r0)
        L_0x00b0:
            android.os.Handler r3 = r2.A0S
            r2 = 1
            r3.removeMessages(r2)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.sendEmptyMessageDelayed(r2, r0)
            return
        L_0x00bc:
            java.lang.Object r1 = r4.A00
            X.1aw r1 = (X.AnonymousClass1aw) r1
            r0 = 0
            r1.A08 = r0
            X.AnonymousClass1aw.A01(r1)
            return
        L_0x00c7:
            java.lang.Object r0 = r4.A00
            X.1av r0 = (X.AnonymousClass1av) r0
            X.AnonymousClass1av.A00(r0)
            return
        L_0x00cf:
            java.lang.Object r1 = r4.A00
            X.1ca r1 = (X.C23151ca) r1
            r0 = 0
            r1.A0G = r0
            X.C23151ca.A00(r1)
            return
        L_0x00da:
            java.lang.Object r0 = r4.A00
            X.1dZ r0 = (X.AnonymousClass1dZ) r0
            X.3vj r1 = r0.A00
            java.lang.String r0 = r5.toString()
            java.lang.String r0 = X.C18240wQ.A0g(r0)
            r1.A00 = r0
            X.C65763vj.A00(r1)
            return
        L_0x00ee:
            java.lang.Object r3 = r4.A00
            X.1uv r3 = (X.C28751uv) r3
            int r0 = r5.length()
            boolean r2 = X.C18180wK.A1X(r0)
            android.widget.TextView r0 = r3.A03
            r0.setEnabled(r2)
            android.widget.TextView r1 = r3.A03
            if (r2 == 0) goto L_0x0109
            int r0 = r3.A01
        L_0x0105:
            r1.setTextColor(r0)
            return
        L_0x0109:
            int r0 = r3.A00
            goto L_0x0105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObjectShape282S0100000_1_I2.afterTextChanged(android.text.Editable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        if (X.AnonymousClass8bQ.A0n(r8) != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r1 != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b5, code lost:
        r2.CrC(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0199, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b8, code lost:
        r3.setEnabled(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01bb, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 2: goto L_0x0034;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0049;
                case 7: goto L_0x008a;
                case 8: goto L_0x00b9;
                case 9: goto L_0x0005;
                case 10: goto L_0x0006;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x018f;
                case 15: goto L_0x01be;
                case 16: goto L_0x01be;
                case 17: goto L_0x01be;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r0 = 0
            X.C04220Ms.A0B(r8, r0)
            java.lang.Object r1 = r7.A00
            com.instagram.igds.components.search.InlineSearchBox r1 = (com.instagram.igds.components.search.InlineSearchBox) r1
            int r0 = r8.length()
            boolean r0 = X.C18180wK.A1W(r0)
            com.instagram.igds.components.search.InlineSearchBox.A00(r1, r0)
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0028
            java.lang.String r8 = X.AnonymousClass0hA.A02(r8)
            if (r8 != 0) goto L_0x0028
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0028:
            X.4rg r1 = r1.A02
            if (r1 == 0) goto L_0x0005
            java.lang.String r0 = r8.toString()
            r1.onSearchTextChanged(r0)
            return
        L_0x0034:
            java.lang.Object r0 = r7.A00
            X.1bO r0 = (X.AnonymousClass1bO) r0
            X.0Oa r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.109 r0 = (X.AnonymousClass109) r0
            X.48v r0 = r0.A02
            X.4wE r2 = r0.A01
            java.lang.String r0 = java.lang.String.valueOf(r8)
            goto L_0x00b5
        L_0x0049:
            java.lang.Object r6 = r7.A00
            X.1b3 r6 = (X.AnonymousClass1b3) r6
            X.0Oa r0 = r6.A06
            java.lang.Object r0 = r0.getValue()
            X.0zy r0 = (X.C19500zy) r0
            X.4wE r5 = r0.A02
        L_0x0057:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2 r0 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2) r0
            java.lang.String r3 = java.lang.String.valueOf(r8)
            int r2 = r0.A00
            r0 = 1
            X.C04220Ms.A0B(r3, r0)
            r1 = 6
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2 r0 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1001000_I2
            r0.<init>((int) r2, (java.lang.String) r3, (int) r1)
            boolean r0 = r5.ADi(r4, r0)
            if (r0 == 0) goto L_0x0057
            com.instagram.common.ui.base.IgButton r3 = r6.A00
            if (r3 != 0) goto L_0x007c
            java.lang.String r0 = "submitButton"
            goto L_0x0199
        L_0x007c:
            if (r8 == 0) goto L_0x0085
            boolean r1 = X.AnonymousClass8bQ.A0n(r8)
            r0 = 0
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r0 = 1
        L_0x0086:
            r1 = r0 ^ 1
            goto L_0x01b8
        L_0x008a:
            java.lang.Object r0 = r7.A00
            X.1bs r0 = (X.C23071bs) r0
            X.0zW r2 = X.C23071bs.A00(r0)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.4wE r0 = r2.A0B
            r0.CrC(r1)
            X.4wE r2 = r2.A0C
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00b0
            boolean r1 = X.AnonymousClass8bQ.A0n(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00b1
        L_0x00b0:
            r0 = 1
        L_0x00b1:
            java.lang.Boolean r0 = X.C18240wQ.A0X(r0)
        L_0x00b5:
            r2.CrC(r0)
            return
        L_0x00b9:
            java.lang.Object r2 = r7.A00
            X.1aY r2 = (X.AnonymousClass1aY) r2
            com.instagram.service.session.UserSession r4 = r2.A0A
            if (r4 == 0) goto L_0x018c
            X.0TJ r3 = X.AnonymousClass0TJ.A06
            r0 = 36598228078103354(0x8205e500010b3a, double:3.208205033603798E-306)
            int r4 = X.C63803iN.A01(r3, r4, r0)
            android.widget.EditText r0 = r2.A06()
            java.lang.String r5 = X.AnonymousClass0wJ.A0n(r0)
            java.util.regex.Pattern r0 = android.util.Patterns.WEB_URL
            java.util.regex.Matcher r1 = r0.matcher(r5)
            int r0 = r5.length()
            if (r0 != 0) goto L_0x0167
            java.lang.Integer r3 = X.AnonymousClass006.A0N
        L_0x00e2:
            r0 = 0
            r2.A0C = r0
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r3 != r0) goto L_0x010e
            android.widget.TextView r3 = r2.A05
            if (r3 == 0) goto L_0x0189
            android.content.Context r0 = r2.A05()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131826093(0x7f1115ad, float:1.928506E38)
        L_0x00f8:
            java.lang.String r0 = r1.getString(r0)
        L_0x00fc:
            r3.setText(r0)
            android.widget.TextView r3 = r2.A05
            if (r3 == 0) goto L_0x0189
            android.content.Context r1 = r2.A05()
            r0 = 2131100067(0x7f0601a3, float:1.7812505E38)
        L_0x010a:
            X.C18180wK.A0s(r1, r3, r0)
            return
        L_0x010e:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            r1 = 1
            if (r3 != r0) goto L_0x0127
            android.widget.TextView r3 = r2.A05
            if (r3 == 0) goto L_0x0189
            android.content.Context r0 = r2.A05()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131689548(0x7f0f004c, float:1.9008114E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0m(r1, r4, r0)
            goto L_0x00fc
        L_0x0127:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r3 != r0) goto L_0x013b
            android.widget.TextView r3 = r2.A05
            if (r3 == 0) goto L_0x0189
            android.content.Context r0 = r2.A05()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131826098(0x7f1115b2, float:1.928507E38)
            goto L_0x00f8
        L_0x013b:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r3 != r0) goto L_0x014f
            android.widget.TextView r3 = r2.A05
            if (r3 == 0) goto L_0x0189
            android.content.Context r0 = r2.A05()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131826099(0x7f1115b3, float:1.9285073E38)
            goto L_0x00f8
        L_0x014f:
            r2.A0C = r1
            android.widget.TextView r1 = r2.A05
            if (r1 == 0) goto L_0x0189
            r0 = 2131826100(0x7f1115b4, float:1.9285075E38)
            r1.setText(r0)
            android.widget.TextView r3 = r2.A05
            if (r3 == 0) goto L_0x0189
            android.content.Context r1 = r2.A05()
            r0 = 2131100109(0x7f0601cd, float:1.781259E38)
            goto L_0x010a
        L_0x0167:
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0171
            java.lang.Integer r3 = X.AnonymousClass006.A01
            goto L_0x00e2
        L_0x0171:
            java.lang.String r1 = "\n"
            r3 = 0
            r0 = 0
            boolean r0 = X.AnonymousClass8bP.A0j(r5, r1, r0)
            if (r0 == 0) goto L_0x017f
            java.lang.Integer r3 = X.AnonymousClass006.A00
            goto L_0x00e2
        L_0x017f:
            int r0 = X.AnonymousClass0hA.A01(r5)
            if (r0 <= r4) goto L_0x00e2
            java.lang.Integer r3 = X.AnonymousClass006.A0C
            goto L_0x00e2
        L_0x0189:
            java.lang.String r0 = "messageTitle"
            goto L_0x0199
        L_0x018c:
            java.lang.String r0 = "userSession"
            goto L_0x0199
        L_0x018f:
            java.lang.Object r0 = r7.A00
            X.1ZN r0 = (X.AnonymousClass1ZN) r0
            com.instagram.ui.widget.progressbutton.ProgressButton r3 = r0.A01
            if (r3 != 0) goto L_0x019e
            java.lang.String r0 = "nextButton"
        L_0x0199:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x019e:
            com.instagram.igds.components.form.IgFormField r0 = r0.A00
            if (r0 != 0) goto L_0x01a5
            java.lang.String r0 = "emailFormField"
            goto L_0x0199
        L_0x01a5:
            android.widget.EditText r0 = r0.A00
            java.lang.String r2 = X.AnonymousClass0wJ.A0n(r0)
            int r0 = r2.length()
            r1 = 1
            if (r0 <= 0) goto L_0x01bc
            boolean r0 = X.AnonymousClass0hA.A09(r2)
            if (r0 == 0) goto L_0x01bc
        L_0x01b8:
            r3.setEnabled(r1)
            return
        L_0x01bc:
            r1 = 0
            goto L_0x01b8
        L_0x01be:
            java.lang.Object r1 = r7.A00
            X.0YY r1 = (X.AnonymousClass0YY) r1
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r1.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxObjectShape282S0100000_1_I2.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
