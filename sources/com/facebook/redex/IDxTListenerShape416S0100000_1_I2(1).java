package com.facebook.redex;

import X.AnonymousClass1x2;
import X.AnonymousClass47H;
import X.C04220Ms;
import X.C23381dg;
import X.C28281tz;
import X.C28321u4;
import X.C29131wm;
import X.C29201xU;
import X.C83704rq;

public class IDxTListenerShape416S0100000_1_I2 implements C83704rq {
    public Object A00;
    public final int A01;

    public IDxTListenerShape416S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void C9n(C28281tz r2) {
        AnonymousClass47H r0;
        switch (this.A01) {
            case 0:
                r0 = ((C23381dg) this.A00).A04;
                break;
            case 1:
                r0 = ((C29131wm) this.A00).A02;
                break;
            case 2:
                r0 = ((C29201xU) this.A00).A01;
                if (r0 == null) {
                    return;
                }
                break;
            default:
                r0 = ((AnonymousClass1x2) this.A00).A04;
                if (r0 == null) {
                    C04220Ms.A0E("quickPromotionTooltipsController");
                    throw null;
                }
                break;
        }
        r0.A01 = r2;
    }

    public final void CPN(C28281tz r3) {
        AnonymousClass47H r1;
        C28321u4 r0;
        String str;
        switch (this.A01) {
            case 0:
                C23381dg r02 = (C23381dg) this.A00;
                r1 = r02.A04;
                r0 = r02.A03;
                break;
            case 1:
                C29131wm r03 = (C29131wm) this.A00;
                r1 = r03.A02;
                r0 = r03.A01;
                break;
            case 2:
                C04220Ms.A0B(r3, 0);
                C29201xU r04 = (C29201xU) this.A00;
                r1 = r04.A01;
                if (r1 != null) {
                    r0 = r04.A00;
                    break;
                } else {
                    return;
                }
            default:
                C04220Ms.A0B(r3, 0);
                AnonymousClass1x2 r05 = (AnonymousClass1x2) this.A00;
                r1 = r05.A04;
                if (r1 == null) {
                    str = "quickPromotionTooltipsController";
                } else {
                    r0 = r05.A03;
                    if (r0 == null) {
                        str = "quickPromotionDelegate";
                    }
                }
                C04220Ms.A0E(str);
                throw null;
        }
        r1.A01(r0, r3);
    }
}
