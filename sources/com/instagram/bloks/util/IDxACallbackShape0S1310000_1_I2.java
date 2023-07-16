package com.instagram.bloks.util;

import X.AnonymousClass1eT;
import X.AnonymousClass2JX;
import X.AnonymousClass3XX;
import X.AnonymousClass601;
import X.AnonymousClass70N;
import X.C109326jp;
import X.C61323St;
import X.C62053Wy;
import X.C63893iY;
import X.C72944Qi;
import X.C72954Qj;
import android.os.Looper;

public class IDxACallbackShape0S1310000_1_I2 extends AnonymousClass1eT {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape0S1310000_1_I2(AnonymousClass601 r1, C109326jp r2, C109326jp r3, String str, int i, boolean z, boolean z2) {
        super(z);
        this.A05 = i;
        this.A04 = z2;
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = str;
    }

    public final void A03(AnonymousClass3XX r3) {
        String str;
        String str2;
        int i = this.A05;
        C109326jp r1 = (C109326jp) this.A01;
        if (i != 0) {
            C63893iY.A0G((AnonymousClass601) this.A00, r1);
            str = this.A03;
            str2 = "AsyncActionWithDataManifest";
        } else {
            if (r1 != null) {
                C63893iY.A0G((AnonymousClass601) this.A00, r1);
            }
            str = this.A03;
            str2 = "AsyncAction";
        }
        AnonymousClass2JX.A00(r3, str2, str);
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        Runnable r2;
        if (this.A05 != 0) {
            C61323St r4 = (C61323St) obj;
            if (this.A04) {
                C109326jp r0 = r4.A02;
                if (r0 != null) {
                    AnonymousClass70N.A01(r0);
                }
                AnonymousClass70N.A01((C109326jp) this.A02);
                AnonymousClass70N.A01((C109326jp) this.A01);
            }
            r2 = new C72954Qj(this, r4);
        } else {
            C61323St r42 = (C61323St) obj;
            if (this.A04) {
                C109326jp r02 = r42.A02;
                if (r02 != null) {
                    AnonymousClass70N.A01(r02);
                }
                C109326jp r03 = (C109326jp) this.A02;
                if (r03 != null) {
                    AnonymousClass70N.A01(r03);
                }
                C109326jp r04 = (C109326jp) this.A01;
                if (r04 != null) {
                    AnonymousClass70N.A01(r04);
                }
            }
            r2 = new C72944Qi(this, r42);
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            r2.run();
        } else {
            C62053Wy.A00.post(r2);
        }
    }
}
