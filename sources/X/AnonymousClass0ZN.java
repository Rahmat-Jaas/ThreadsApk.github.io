package X;

import com.facebook.redex.IDxCFactoryShape495S0100000_I2;

/* renamed from: X.0ZN  reason: invalid class name */
public final class AnonymousClass0ZN implements AnonymousClass0P4 {
    public final AnonymousClass0OC A7n(AnonymousClass0OC r4, Integer num) {
        AnonymousClass0OB iDxCFactoryShape495S0100000_I2;
        C04220Ms.A0B(num, 0);
        C04220Ms.A0B(r4, 1);
        int intValue = num.intValue();
        switch (intValue) {
            case 2:
            case 5:
            case 6:
            case 7:
                r4.A01(AnonymousClass0ND.CRITICAL_REPORT, AnonymousClass0ZI.A00);
                break;
            case 4:
            case 9:
                r4.A02(AnonymousClass0ND.CRITICAL_REPORT, AnonymousClass0ZJ.A00);
                break;
        }
        if (intValue == 6) {
            iDxCFactoryShape495S0100000_I2 = new IDxCFactoryShape495S0100000_I2((Object) this, 5);
        } else if (intValue == 9 || intValue == 4 || intValue == 3) {
            r4.A02(AnonymousClass0ND.CRITICAL_REPORT, new IDxCFactoryShape495S0100000_I2((Object) this, 6));
            return r4;
        } else {
            if (intValue == 10) {
                iDxCFactoryShape495S0100000_I2 = AnonymousClass0ZM.A00;
            }
            return r4;
        }
        r4.A01(AnonymousClass0ND.CRITICAL_REPORT, iDxCFactoryShape495S0100000_I2);
        return r4;
    }

    public final AnonymousClass0OM A7o(AnonymousClass0OM r2, AnonymousClass0Z8 r3) {
        C04220Ms.A0B(r2, 1);
        return r2;
    }
}
