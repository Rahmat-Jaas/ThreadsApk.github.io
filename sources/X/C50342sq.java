package X;

/* renamed from: X.2sq  reason: invalid class name and case insensitive filesystem */
public final class C50342sq {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C57583Bq r7, X.C201713k r8, X.C81734oH r9, X.AnonymousClass4MC r10) {
        /*
            android.view.View r4 = r8.itemView
            if (r9 == 0) goto L_0x0026
            com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment r9 = (com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment) r9
            X.AnonymousClass0wJ.A1N(r4, r10)
            X.37o r3 = r9.A00
            if (r3 == 0) goto L_0x011b
            java.lang.String r1 = "toggle"
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            X.Jix r2 = X.C37284Jnx.A00(r10, r0, r1)
            X.4AP r0 = r3.A01
            r2.A01(r0)
            X.GbW r1 = r3.A00
            X.Jnx r0 = r2.A02()
            r1.A03(r4, r0)
        L_0x0026:
            r1 = 4
            androidx.core.view.IDxDCompatShape36S0100000_4_I2 r0 = new androidx.core.view.IDxDCompatShape36S0100000_4_I2
            r0.<init>(r10, r1)
            X.C006702y.A0C(r4, r0)
            if (r7 == 0) goto L_0x003c
            android.content.Context r0 = r4.getContext()
            int r0 = X.C50322so.A00(r0, r7)
            r4.setBackgroundResource(r0)
        L_0x003c:
            java.lang.CharSequence r0 = r10.A0B
            android.widget.TextView r6 = r8.A05
            if (r0 == 0) goto L_0x0114
            r6.setText(r0)
        L_0x0045:
            int r0 = r10.A03
            r3 = 8
            if (r0 == 0) goto L_0x005e
            android.content.Context r2 = r4.getContext()
            android.graphics.drawable.Drawable r1 = X.C63403hQ.A00(r2, r0)
            r0 = 0
            r6.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r0, r0, r0)
            int r0 = X.C18240wQ.A01(r2, r3)
            r6.setCompoundDrawablePadding(r0)
        L_0x005e:
            int r1 = r10.A01
            r2 = 0
            if (r1 == 0) goto L_0x006b
            android.widget.TextView r0 = r8.A03
            r0.setText(r1)
            r0.setVisibility(r2)
        L_0x006b:
            int r0 = r10.A02
            if (r0 == 0) goto L_0x0109
            android.widget.TextView r1 = r8.A04
            r1.setText(r0)
        L_0x0074:
            r1.setVisibility(r2)
        L_0x0077:
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0080
            android.widget.TextView r0 = r8.A04
            X.C18180wK.A0z(r0)
        L_0x0080:
            android.view.View$OnClickListener r1 = r10.A06
            if (r1 == 0) goto L_0x0089
            android.view.View r0 = r8.A01
            r0.setOnClickListener(r1)
        L_0x0089:
            com.instagram.igds.components.switchbutton.IgSwitch r7 = r8.A06
            java.lang.CharSequence r0 = r6.getText()
            r7.setTag(r0)
            r5 = 0
            r7.setOnCheckedChangeListener(r5)
            boolean r0 = r10.A0C
            r7.setChecked(r0)
            r1 = 53
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r0.<init>((java.lang.Object) r10, (int) r1)
            r7.setOnCheckedChangeListener(r0)
            X.HpC r0 = r10.A09
            r7.A07 = r0
            boolean r0 = r10.A0E
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r10.A0F
            if (r0 != 0) goto L_0x00f8
            r0 = 1
            r7.setEnabled(r0)
            r1 = 9
            com.facebook.redex.IDxCListenerShape149S0200000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape149S0200000_1_I2
            r0.<init>(r1, r10, r8)
            r7.setOnCheckedChangeListener(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r0)
            X.HpC r0 = r10.A09
            r7.A07 = r0
        L_0x00c8:
            android.view.View r0 = r8.A00
            r0.setVisibility(r3)
            android.widget.CheckBox r0 = r8.A02
            r0.setVisibility(r3)
            r0.setOnCheckedChangeListener(r5)
            r0.setChecked(r2)
            r0.setOnCheckedChangeListener(r5)
            android.view.View$OnLongClickListener r0 = r10.A07
            r4.setOnLongClickListener(r0)
            int r0 = r10.A05
            if (r0 != 0) goto L_0x00e8
            int r0 = r10.A00
            if (r0 == 0) goto L_0x00f7
        L_0x00e8:
            int r3 = r4.getPaddingLeft()
            int r2 = r10.A05
            int r1 = r4.getPaddingRight()
            int r0 = r10.A00
            r4.setPadding(r3, r2, r1, r0)
        L_0x00f7:
            return
        L_0x00f8:
            r4.setOnClickListener(r5)
            boolean r0 = r10.A0E
            if (r0 == 0) goto L_0x0105
            r0 = 1050253722(0x3e99999a, float:0.3)
            r6.setAlpha(r0)
        L_0x0105:
            r7.setEnabled(r2)
            goto L_0x00c8
        L_0x0109:
            java.lang.CharSequence r0 = r10.A0A
            if (r0 == 0) goto L_0x0077
            android.widget.TextView r1 = r8.A04
            r1.setText(r0)
            goto L_0x0074
        L_0x0114:
            int r0 = r10.A04
            r6.setText(r0)
            goto L_0x0045
        L_0x011b:
            java.lang.String r0 = "messageAccessToggleViewPointHelper"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50342sq.A00(X.3Bq, X.13k, X.4oH, X.4MC):void");
    }
}
