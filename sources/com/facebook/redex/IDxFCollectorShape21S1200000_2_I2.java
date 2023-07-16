package com.facebook.redex;

import X.AnonymousClass7Ja;
import X.C146958n9;
import X.C62903b6;
import X.C83224qz;
import X.C83234r0;
import X.D1X;
import X.F6v;
import X.F70;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import kotlin.Unit;

public class IDxFCollectorShape21S1200000_2_I2 implements C83234r0 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxFCollectorShape21S1200000_2_I2(F6v f6v, String str, C83224qz r3, int i) {
        this.A03 = i;
        if (i != 0) {
            this.A00 = r3;
            this.A01 = f6v;
            this.A02 = str;
        } else {
            this.A01 = f6v;
            this.A02 = str;
            this.A00 = r3;
        }
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, C146958n9 r8) {
        F6v f6v;
        String str;
        boolean z;
        C62903b6 r7 = (C62903b6) obj;
        if (this.A03 != 0) {
            if (AnonymousClass7Ja.A06((C83224qz) this.A00)) {
                f6v = (F6v) this.A01;
                str = this.A02;
                z = false;
            }
            return Unit.A00;
        }
        f6v = (F6v) this.A01;
        F70 f70 = f6v.A07;
        D1X d1x = f70.A03;
        str = this.A02;
        f70.A04.A01.CrC(new KtCSuperShape0S2100000_I2(d1x, "search", str));
        if (AnonymousClass7Ja.A06((C83224qz) this.A00)) {
            z = true;
        }
        return Unit.A00;
        F6v.A01(f6v, r7, str, z);
        return Unit.A00;
    }
}
