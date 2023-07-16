package com.facebook.redex;

import X.C04220Ms;
import X.C10650ih;
import X.C18250wR;
import android.content.Intent;
import android.webkit.WebChromeClient;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.HttpStatus;

public class IDxCClientShape27S0100000_1_I2 extends WebChromeClient {
    public Object A00;
    public final int A01;

    public IDxCClientShape27S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(IDxCClientShape27S0100000_1_I2 iDxCClientShape27S0100000_1_I2, String str) {
        Intent putExtra = C18250wR.A05("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setTypeAndNormalize(str).setType("image/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        Fragment fragment = (Fragment) iDxCClientShape27S0100000_1_I2.A00;
        C10650ih.A07(fragment, Intent.createChooser(putExtra, fragment.requireContext().getString(2131827810)), HttpStatus.SC_SWITCHING_PROTOCOLS);
    }

    public static final void A01(IDxCClientShape27S0100000_1_I2 iDxCClientShape27S0100000_1_I2, String str) {
        Intent putExtra = C18250wR.A05("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setTypeAndNormalize(str).setType("image/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        C04220Ms.A06(putExtra);
        Fragment fragment = (Fragment) iDxCClientShape27S0100000_1_I2.A00;
        C10650ih.A07(fragment, Intent.createChooser(putExtra, fragment.requireContext().getString(2131827810)), HttpStatus.SC_SWITCHING_PROTOCOLS);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.Ibd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.Ibe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.Ibd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.Ibd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onShowFileChooser(android.webkit.WebView r6, android.webkit.ValueCallback r7, android.webkit.WebChromeClient.FileChooserParams r8) {
        /*
            r5 = this;
            int r0 = r5.A01
            if (r0 == 0) goto L_0x002b
            java.lang.String[] r2 = r8.getAcceptTypes()
            r2.getClass()
            int r0 = r2.length
            r1 = 0
            boolean r0 = X.C18230wP.A1V(r0)
            X.AnonymousClass0KW.A03(r0)
            r1 = r2[r1]
            java.lang.Object r3 = r5.A00
            X.Ibe r3 = (X.C34608Ibe) r3
            r3.A01 = r7
            android.app.Activity r0 = r3.getRootActivity()
            boolean r0 = X.C121897Ir.A03(r0)
            if (r0 == 0) goto L_0x005d
            A00(r5, r1)
        L_0x0029:
            r0 = 1
            return r0
        L_0x002b:
            r4 = 1
            X.AnonymousClass0wJ.A1M(r7, r4, r8)
            java.lang.String[] r3 = r8.getAcceptTypes()
            if (r3 == 0) goto L_0x006a
            int r2 = r3.length
            r1 = 0
            r0 = 1
            if (r2 == r4) goto L_0x003b
            r0 = 0
        L_0x003b:
            X.AnonymousClass0KW.A03(r0)
            r1 = r3[r1]
            X.C04220Ms.A03(r1)
            java.lang.Object r3 = r5.A00
            X.Ibd r3 = (X.C34607Ibd) r3
            r3.A01 = r7
            android.app.Activity r0 = r3.getRootActivity()
            boolean r0 = X.C121897Ir.A03(r0)
            if (r0 == 0) goto L_0x0057
            A01(r5, r1)
            goto L_0x0029
        L_0x0057:
            X.47w r2 = new X.47w
            r2.<init>(r5, r3, r1)
            goto L_0x0062
        L_0x005d:
            X.47u r2 = new X.47u
            r2.<init>(r5, r1)
        L_0x0062:
            android.app.Activity r0 = r3.getRootActivity()
            X.C121897Ir.A02(r0, r2)
            goto L_0x0029
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCClientShape27S0100000_1_I2.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }
}
