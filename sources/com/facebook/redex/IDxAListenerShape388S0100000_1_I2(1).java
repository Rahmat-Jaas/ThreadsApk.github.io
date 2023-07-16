package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass13Q;
import android.view.KeyEvent;
import android.widget.TextView;

public class IDxAListenerShape388S0100000_1_I2 implements TextView.OnEditorActionListener {
    public Object A00;
    public final int A01;

    public static final boolean A00(KeyEvent keyEvent, IDxAListenerShape388S0100000_1_I2 iDxAListenerShape388S0100000_1_I2, int i) {
        if (i != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        AnonymousClass13Q r0 = (AnonymousClass13Q) iDxAListenerShape388S0100000_1_I2.A00;
        r0.A02.invoke(AnonymousClass0wJ.A0n(r0.A00));
        return false;
    }

    public IDxAListenerShape388S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01e2, code lost:
        r1 = (X.C23131by) r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r3 = (X.AnonymousClass1av) r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onEditorAction(android.widget.TextView r5, int r6, android.view.KeyEvent r7) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x01cf;
                case 1: goto L_0x01ca;
                case 2: goto L_0x01b7;
                case 3: goto L_0x0022;
                case 4: goto L_0x01f5;
                case 5: goto L_0x000e;
                case 6: goto L_0x01a2;
                case 7: goto L_0x0176;
                case 8: goto L_0x014a;
                case 9: goto L_0x0135;
                case 10: goto L_0x0119;
                case 11: goto L_0x0063;
                case 12: goto L_0x0109;
                case 13: goto L_0x00eb;
                case 14: goto L_0x00d3;
                case 15: goto L_0x00b7;
                case 16: goto L_0x009b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A00
            X.4tH r0 = (X.AnonymousClass4tH) r0
            boolean r2 = r0.Bvc(r6)
            return r2
        L_0x000e:
            java.lang.Object r1 = r4.A00
            X.1c4 r1 = (X.AnonymousClass1c4) r1
            r0 = 6
            if (r6 != r0) goto L_0x01f3
            X.3G5 r0 = r1.A06
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0207
            X.AnonymousClass1c4.A02(r1)
            goto L_0x0207
        L_0x0022:
            r0 = 6
            if (r6 == r0) goto L_0x0035
            if (r7 == 0) goto L_0x0207
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0207
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0207
        L_0x0035:
            java.lang.Object r3 = r4.A00
            X.1av r3 = (X.AnonymousClass1av) r3
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r3.A03
            if (r0 == 0) goto L_0x0207
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0207
            com.instagram.service.session.UserSession r1 = r3.A02
            android.widget.EditText r0 = r3.A01
            java.lang.String r0 = X.C18180wK.A0f(r0)
            X.H1T r2 = X.AnonymousClass0wJ.A0N(r1)
            java.lang.String r1 = X.C62663aU.A00(r2, r1, r0)
            java.lang.String r0 = "enc_new_password"
            r2.A0O(r0, r1)
            X.H8c r1 = X.AnonymousClass0wJ.A0S(r2)
            r0 = 63
            X.C63873iU.A0C(r3, r1, r0)
            goto L_0x01f3
        L_0x0063:
            r0 = 6
            if (r6 == r0) goto L_0x0076
            if (r7 == 0) goto L_0x0207
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0207
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0207
        L_0x0076:
            java.lang.Object r1 = r4.A00
            X.1ca r1 = (X.C23151ca) r1
            android.widget.TextView r0 = r1.A05
            java.lang.String r0 = X.C18180wK.A0f(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0207
            android.widget.EditText r0 = r1.A03
            java.lang.String r0 = X.C18210wN.A0c(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0207
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0207
            r2 = 1
            X.C23151ca.A02(r1, r2)
            return r2
        L_0x009b:
            r0 = 6
            if (r6 == r0) goto L_0x00ae
            if (r7 == 0) goto L_0x0207
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0207
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0207
        L_0x00ae:
            java.lang.Object r0 = r4.A00
            X.1uw r0 = (X.C28761uw) r0
            X.C28761uw.A01(r0)
            goto L_0x01f3
        L_0x00b7:
            r0 = 6
            if (r6 == r0) goto L_0x00ca
            if (r7 == 0) goto L_0x0207
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0207
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0207
        L_0x00ca:
            java.lang.Object r0 = r4.A00
            X.1uv r0 = (X.C28751uv) r0
            X.C28751uv.A00(r0)
            goto L_0x01f3
        L_0x00d3:
            r0 = 2
            if (r6 == r0) goto L_0x00dc
            r0 = 6
            if (r6 == r0) goto L_0x00dc
            r0 = 5
            if (r6 != r0) goto L_0x0207
        L_0x00dc:
            java.lang.Object r1 = r4.A00
            X.1jv r1 = (X.C24721jv) r1
            X.4tS r0 = r1.A01
            boolean r0 = r0.BXY()
            r2 = 1
            if (r0 != 0) goto L_0x0101
            goto L_0x0207
        L_0x00eb:
            r0 = 2
            if (r6 == r0) goto L_0x00f4
            r0 = 6
            if (r6 == r0) goto L_0x00f4
            r0 = 5
            if (r6 != r0) goto L_0x0207
        L_0x00f4:
            java.lang.Object r1 = r4.A00
            X.1cg r1 = (X.C23201cg) r1
            boolean r0 = r1.BXY()
            r2 = 1
            if (r0 == 0) goto L_0x0105
            X.1jv r1 = r1.A08
        L_0x0101:
            r1.A03(r2)
            return r2
        L_0x0105:
            X.C23201cg.A03(r1)
            return r2
        L_0x0109:
            r0 = 5
            if (r0 != r6) goto L_0x0207
            java.lang.Object r0 = r4.A00
            X.1cg r0 = (X.C23201cg) r0
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r0.A0E
            if (r0 == 0) goto L_0x0207
            r0.requestFocus()
            goto L_0x01f3
        L_0x0119:
            r0 = 6
            if (r6 == r0) goto L_0x012c
            if (r7 == 0) goto L_0x0207
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0207
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0207
        L_0x012c:
            java.lang.Object r0 = r4.A00
            X.1bo r0 = (X.C23031bo) r0
            X.C23031bo.A00(r0)
            goto L_0x0207
        L_0x0135:
            r0 = 5
            if (r6 != r0) goto L_0x0207
            java.lang.Object r1 = r4.A00
            X.1c0 r1 = (X.AnonymousClass1c0) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0145
            X.AnonymousClass1c0.A02(r1)
            goto L_0x01f3
        L_0x0145:
            X.AnonymousClass1c0.A01(r1)
            goto L_0x01f3
        L_0x014a:
            r0 = 0
            X.C04220Ms.A0B(r5, r0)
            r0 = 6
            if (r6 == r0) goto L_0x0161
            if (r7 == 0) goto L_0x0207
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0207
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0207
        L_0x0161:
            java.lang.CharSequence r0 = r5.getText()
            if (r0 == 0) goto L_0x0207
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0207
            java.lang.Object r0 = r4.A00
            X.1Yw r0 = (X.C22641Yw) r0
            X.C22641Yw.A00(r0)
            r2 = 1
            return r2
        L_0x0176:
            java.lang.Object r2 = r4.A00
            X.1aN r2 = (X.AnonymousClass1aN) r2
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r2.A02
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = "nextButton"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0185:
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0207
            r0 = 6
            if (r6 == r0) goto L_0x019e
            if (r7 == 0) goto L_0x0207
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0207
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0207
        L_0x019e:
            X.AnonymousClass1aN.A01(r2)
            goto L_0x01f3
        L_0x01a2:
            r0 = 2
            if (r6 != r0) goto L_0x0207
            java.lang.Object r1 = r4.A00
            X.1aA r1 = (X.AnonymousClass1aA) r1
            com.instagram.actionbar.ActionButton r0 = r1.A05
            if (r0 == 0) goto L_0x01f3
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x01f3
            X.AnonymousClass1aA.A00(r1)
            goto L_0x01f3
        L_0x01b7:
            r0 = 2
            if (r6 != r0) goto L_0x0207
            java.lang.Object r1 = r4.A00
            X.1d9 r1 = (X.AnonymousClass1d9) r1
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r1.A04
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x01f3
            r1.A00()
            goto L_0x01f3
        L_0x01ca:
            boolean r2 = A00(r7, r4, r6)
            return r2
        L_0x01cf:
            r0 = 6
            if (r6 == r0) goto L_0x01e2
            if (r7 == 0) goto L_0x0207
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x0207
            int r1 = r7.getKeyCode()
            r0 = 66
            if (r1 != r0) goto L_0x0207
        L_0x01e2:
            java.lang.Object r1 = r4.A00
            X.1by r1 = (X.C23131by) r1
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r1.A01
            if (r0 == 0) goto L_0x0207
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0207
            X.C23131by.A00(r1)
        L_0x01f3:
            r2 = 1
            return r2
        L_0x01f5:
            r0 = 5
            if (r6 != r0) goto L_0x01f3
            java.lang.Object r1 = r4.A00
            X.1c9 r1 = (X.AnonymousClass1c9) r1
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r1.A0G
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0207
            r1.A07()
        L_0x0207:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxAListenerShape388S0100000_1_I2.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
    }
}
