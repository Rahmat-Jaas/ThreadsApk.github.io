package com.google.android.play.core.splitinstall;

import X.AnonymousClass75s;
import X.C111836oV;
import X.C14030oh;
import X.C86164wN;
import android.os.Bundle;
import com.google.android.play.core.internal.zzcb;

public class zzbh extends zzcb {
    public final C111836oV A00;
    public final /* synthetic */ AnonymousClass75s A01;

    public zzbh(AnonymousClass75s r3, C111836oV r4) {
        this.A01 = r3;
        int A03 = C14030oh.A03(-1227828932);
        this.A00 = r4;
        C14030oh.A0A(2086189844, A03);
    }

    public static int A00(zzbh zzbh, int i) {
        int A03 = C14030oh.A03(i);
        zzbh.A01.A00.A02(zzbh.A00);
        return A03;
    }

    public void DC8(Bundle bundle) {
        int A002 = A00(this, 969156116);
        AnonymousClass75s.A02.A01("onDeferredUninstall", C86164wN.A1T());
        C14030oh.A0A(1935872819, A002);
    }
}
