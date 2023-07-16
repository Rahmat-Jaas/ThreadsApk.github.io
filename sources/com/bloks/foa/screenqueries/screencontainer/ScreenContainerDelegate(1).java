package com.bloks.foa.screenqueries.screencontainer;

import X.AnonymousClass006;
import X.AnonymousClass066;
import X.AnonymousClass0wJ;
import X.AnonymousClass3B8;
import X.AnonymousClass3HX;
import X.AnonymousClass3VO;
import X.C109326jp;
import X.C121247Ez;
import X.C122047Jt;
import X.C127397h3;
import X.C147858q2;
import X.C58513Fy;
import X.C62533aC;
import X.C63893iY;
import X.C66833yP;
import X.C83454rP;
import android.content.Context;
import android.util.SparseArray;

public final class ScreenContainerDelegate implements C147858q2 {
    public AnonymousClass3B8 A00;
    public Integer A01;
    public final Context A02;
    public final C66833yP A03;
    public final C121247Ez A04;

    public final /* synthetic */ void BsJ(AnonymousClass066 r1) {
    }

    public final /* synthetic */ void CAO(AnonymousClass066 r1) {
    }

    public final /* synthetic */ void CHK(AnonymousClass066 r1) {
    }

    public final void A00() {
        AnonymousClass3B8 r2;
        Integer num;
        String str;
        Integer num2 = this.A01;
        Integer num3 = AnonymousClass006.A01;
        if (num2 != num3 && (r2 = this.A00) != null) {
            this.A01 = num3;
            if (num2 == AnonymousClass006.A00) {
                num = num3;
            } else {
                num = AnonymousClass006.A0C;
            }
            C109326jp r5 = r2.A02;
            if (r5 != null) {
                C127397h3 r4 = r2.A01;
                AnonymousClass3HX r3 = r2.A00;
                if (num == num3) {
                    str = "forward";
                } else {
                    str = "back";
                }
                AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                A002.A02(r3, 0);
                C122047Jt.A03(r3, r4, C63893iY.A05(A002, str, 1), r5);
            }
        }
    }

    public final void A01(Integer num) {
        Integer num2;
        C109326jp r5;
        String str;
        if (num != AnonymousClass006.A00 && this.A01 == (num2 = AnonymousClass006.A01)) {
            this.A01 = AnonymousClass006.A0C;
            AnonymousClass3B8 r1 = this.A00;
            if (r1 != null && (r5 = r1.A03) != null) {
                C127397h3 r4 = r1.A01;
                AnonymousClass3HX r3 = r1.A00;
                if (num == num2) {
                    str = "forward";
                } else {
                    str = "back";
                }
                AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                A002.A02(r3, 0);
                C122047Jt.A03(r3, r4, C63893iY.A05(A002, str, 1), r5);
            }
        }
    }

    public final void Btb(AnonymousClass066 r5) {
        for (Object A042 : this.A03.A00) {
            int A043 = AnonymousClass0wJ.A04(A042);
            if (Integer.valueOf(A043) != null) {
                synchronized (C62533aC.A01) {
                    C62533aC.A00.delete(A043);
                }
            }
        }
        this.A04.A03();
    }

    public ScreenContainerDelegate(Context context, SparseArray sparseArray, C66833yP r5, C83454rP r6, Integer num) {
        this.A02 = context;
        this.A03 = r5;
        this.A01 = num;
        C58513Fy r1 = new C58513Fy(context, r5.A04, r6);
        r1.A02 = r5.A02.A03;
        r1.A00 = sparseArray;
        this.A04 = r1.A00();
    }
}
