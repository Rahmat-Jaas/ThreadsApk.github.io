package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass56T;
import X.C04220Ms;
import X.C105556dc;
import X.C110106l8;
import X.C21749Bza;
import X.C22284CSe;
import X.C28221tt;
import X.C28231tu;
import X.C28251tw;
import X.C28271ty;
import X.C28291u0;
import X.C28321u4;
import X.C81644o8;
import X.C82904qS;
import X.C86074wE;
import X.C86144wL;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import kotlin.Unit;

public class IDxMListenerShape501S0100000_2_I2 implements C82904qS {
    public Object A00;
    public final int A01;

    public IDxMListenerShape501S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void C6x(C81644o8 r8) {
        C28271ty r82;
        Object value;
        C28291u0 r83;
        String str;
        String str2;
        if (this.A01 != 0) {
            if ((r8 instanceof C28271ty) && (r83 = (C28291u0) r8) != null) {
                C22284CSe cSe = (C22284CSe) this.A00;
                C21749Bza bza = cSe.A00;
                String str3 = "qpMegaphoneViewStubber";
                if (bza != null) {
                    if (!bza.BV2()) {
                        cSe.A04 = new C110106l8(bza.BLC());
                    }
                    C110106l8 r4 = cSe.A04;
                    if (r4 != null) {
                        C28321u4 r3 = cSe.A03;
                        if (r3 == null) {
                            str3 = "quickPromotionDelegate";
                        } else {
                            C28221tt r5 = r83.A08;
                            C04220Ms.A06(r5);
                            C28251tw r1 = r5.A09;
                            Unit unit = null;
                            if (!(r1 == null || (str2 = r1.A00) == null)) {
                                TextView textView = r4.A03;
                                textView.setText(str2);
                                textView.setVisibility(0);
                                unit = Unit.A00;
                            }
                            if (unit == null) {
                                r4.A03.setVisibility(8);
                            }
                            C28231tu r0 = r5.A03;
                            if (r0 == null || (str = r0.A00) == null) {
                                r4.A02.setVisibility(8);
                            } else {
                                TextView textView2 = r4.A02;
                                textView2.setText(str);
                                textView2.setVisibility(0);
                            }
                            C86144wL.A1C(r4.A01, r83, r4, r3, 18);
                            r3.CEB(r83);
                            return;
                        }
                    } else {
                        throw AnonymousClass0wJ.A0b();
                    }
                }
                C04220Ms.A0E(str3);
                throw null;
            }
        } else if ((r8 instanceof C28271ty) && (r82 = (C28271ty) r8) != null) {
            C86074wE r52 = ((AnonymousClass56T) this.A00).A09;
            do {
                value = r52.getValue();
            } while (!r52.ADi(value, new KtCSuperShape0S0110000_I2(7, (Object) new C105556dc(r82), ((KtCSuperShape0S0110000_I2) value).A01)));
        }
    }
}
