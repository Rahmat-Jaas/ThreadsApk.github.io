package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass1j8;
import X.AnonymousClass1j9;
import X.AnonymousClass2L8;
import X.AnonymousClass3XX;
import X.AnonymousClass56Y;
import X.AnonymousClass5z1;
import X.AnonymousClass5z2;
import X.AnonymousClass5z3;
import X.AnonymousClass68G;
import X.AnonymousClass78J;
import X.AnonymousClass9Qy;
import X.AnonymousClass9R0;
import X.C100976Pk;
import X.C146578mT;
import X.C146958n9;
import X.C18230wP;
import X.C21835C2k;
import X.C25603Doe;
import X.C83234r0;
import X.C86074wE;
import X.C86154wM;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0301000_I2;
import java.util.List;
import kotlin.Unit;

public class IDxFCollectorShape13S0110000_2_I2 implements C83234r0 {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxFCollectorShape13S0110000_2_I2(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, C146958n9 r9) {
        Object value;
        AnonymousClass68G r2;
        C146578mT r1;
        AnonymousClass3XX A002;
        C86074wE r3;
        Object r12;
        if (this.A02 != 0) {
            C100976Pk r8 = (C100976Pk) obj;
            if (r8 instanceof AnonymousClass5z3) {
                boolean z = this.A01;
                Integer num = AnonymousClass006.A0C;
                r3 = ((AnonymousClass78J) this.A00).A04;
                r12 = new AnonymousClass9R0(num, z, false);
            } else if (r8 instanceof AnonymousClass5z2) {
                AnonymousClass78J.A00((C21835C2k) ((AnonymousClass5z2) r8).A00, (AnonymousClass78J) this.A00, this.A01, false);
            } else if (r8 instanceof AnonymousClass5z1) {
                AnonymousClass78J r32 = (AnonymousClass78J) this.A00;
                AnonymousClass2L8 r13 = (AnonymousClass2L8) ((AnonymousClass5z1) r8).A00;
                boolean z2 = this.A01;
                if (r13 instanceof AnonymousClass1j9) {
                    r1 = ((AnonymousClass1j9) r13).A00;
                    r1.getClass();
                } else if (r13 instanceof AnonymousClass1j8) {
                    A002 = AnonymousClass3XX.A00(((AnonymousClass1j8) r13).A00);
                    r3 = r32.A04;
                    r12 = new AnonymousClass9Qy(A002, z2);
                } else {
                    r1 = null;
                }
                A002 = new AnonymousClass3XX((Object) r1);
                r3 = r32.A04;
                r12 = new AnonymousClass9Qy(A002, z2);
            }
            r3.CrC(r12);
        } else {
            KtCSuperShape0S0301000_I2 ktCSuperShape0S0301000_I2 = (KtCSuperShape0S0301000_I2) obj;
            if (ktCSuperShape0S0301000_I2.A03 == AnonymousClass006.A01) {
                AnonymousClass56Y r6 = (AnonymousClass56Y) this.A00;
                C86074wE r5 = r6.A0B;
                boolean z3 = this.A01;
                do {
                    value = r5.getValue();
                    if (z3) {
                        r2 = AnonymousClass68G.SILENT_REFRESHED;
                    } else {
                        r2 = AnonymousClass68G.REFRESHED;
                    }
                } while (!C86154wM.A1a(r2, value, C25603Doe.A00(C18230wP.A09(r6.A08()), (List) ktCSuperShape0S0301000_I2.A01), r5, false));
            }
        }
        return Unit.A00;
    }
}
