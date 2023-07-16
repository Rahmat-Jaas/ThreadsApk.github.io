package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass25A;
import X.AnonymousClass2CV;
import X.AnonymousClass3BW;
import X.C07530bf;
import X.C18250wR;
import X.C40877Lpc;
import X.C41026Luf;
import X.C64013jH;
import X.C64363kK;
import X.C81224nO;
import X.C84634tZ;
import X.C84854ty;
import android.content.Context;
import android.content.DialogInterface;

public class IDxCListenerShape4S1400000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public IDxCListenerShape4S1400000_1_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A05 = i;
        this.A03 = obj2;
        this.A04 = str;
        this.A02 = obj4;
        this.A01 = obj3;
        this.A00 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A05 != 0) {
            C84634tZ r2 = (C84634tZ) this.A02;
            String str = this.A04;
            AnonymousClass3BW r0 = (AnonymousClass3BW) this.A03;
            ((AnonymousClass25A) this.A00).A00((C07530bf) this.A01);
            dialogInterface.dismiss();
            if (r2 != null) {
                r2.BjS(str, r0.A03);
                return;
            }
            return;
        }
        String str2 = this.A04;
        C81224nO r6 = (C81224nO) this.A02;
        C84854ty r5 = (C84854ty) this.A01;
        C41026Luf luf = new C41026Luf((Context) this.A00);
        luf.A08("Reset Counters");
        int length = AnonymousClass006.A00(5).length;
        boolean[] zArr = new boolean[length];
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i2 = 0; i2 < length; i2++) {
            charSequenceArr[i2] = AnonymousClass2CV.A00(AnonymousClass006.A00(5)[i2]);
        }
        C64363kK r02 = new C64363kK(zArr);
        C40877Lpc lpc = luf.A01;
        lpc.A0J = charSequenceArr;
        lpc.A07 = r02;
        lpc.A0K = new boolean[length];
        lpc.A0H = true;
        luf.A05(new C64013jH(r5, r6, str2, zArr, length), "GO!");
        C18250wR.A0u(luf);
    }
}
