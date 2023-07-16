package X;

import android.app.Application;
import com.facebook.errorreporting.lacrima.common.IDxLProviderShape25S0000000_I2;
import com.facebook.redex.IDxCFactoryShape111S0000000_I2;
import com.facebook.redex.IDxCFactoryShape203S0200000_I2;
import com.facebook.redex.IDxCFactoryShape495S0100000_I2;
import com.facebook.redex.IDxCListenerShape169S0000000_I2;
import com.facebook.redex.IDxLInitShape120S0000000_I2;
import com.facebook.redex.IDxLInitShape848S0100000_I2;

/* renamed from: X.0a0  reason: invalid class name and case insensitive filesystem */
public final class C06590a0 implements AnonymousClass0P4 {
    public final Application A00;
    public final C07390bR A01;
    public final AnonymousClass01P A02;

    public final AnonymousClass0OC A7n(AnonymousClass0OC r2, Integer num) {
        C04220Ms.A0B(r2, 1);
        return r2;
    }

    public final AnonymousClass0OM A7o(AnonymousClass0OM r14, AnonymousClass0Z8 r15) {
        C04220Ms.A0B(r15, 0);
        C04220Ms.A0B(r14, 1);
        C06570Zy r11 = C06570Zy.A00;
        C06580Zz r10 = C06580Zz.A00;
        AnonymousClass0YX r4 = null;
        IDxLInitShape120S0000000_I2 iDxLInitShape120S0000000_I2 = new IDxLInitShape120S0000000_I2(8);
        r14.A0B = new IDxLProviderShape25S0000000_I2(1);
        Application application = this.A00;
        r14.A00(new IDxLInitShape848S0100000_I2(application, 1));
        r14.A00(new IDxLInitShape120S0000000_I2(6));
        r14.A00(new IDxLInitShape848S0100000_I2(application, 0));
        Integer num = AnonymousClass006.A0Y;
        C07390bR r9 = this.A01;
        AnonymousClass0OC r6 = new AnonymousClass0OC(AnonymousClass006.A0R);
        r6.A00 = new IDxCFactoryShape495S0100000_I2(application, 2);
        r6.A02 = AnonymousClass006.A01;
        IDxCFactoryShape111S0000000_I2 iDxCFactoryShape111S0000000_I2 = new IDxCFactoryShape111S0000000_I2(13);
        AnonymousClass0ND r8 = AnonymousClass0ND.CRITICAL_REPORT;
        r6.A02(r8, iDxCFactoryShape111S0000000_I2);
        r6.A02(r8, new IDxCFactoryShape111S0000000_I2(12));
        r6.A02(r8, C06210Yd.A00);
        r6.A01 = new IDxCFactoryShape203S0200000_I2(4, application, r9);
        r6.A02(AnonymousClass0ND.LARGE_REPORT, r11);
        r6.A02(r8, r10);
        r6.A05.A06.add(new IDxCFactoryShape111S0000000_I2(14));
        r15.A00(r6, num);
        r14.A00(r6.A00());
        r14.A00(new IDxLInitShape120S0000000_I2(0));
        if (C07960cV.A05(AnonymousClass0e5.A00(36316151805905906L))) {
            r4 = new AnonymousClass0YX();
        }
        r14.A00(r4);
        r14.A00(new IDxLInitShape120S0000000_I2(7));
        r14.A00(iDxLInitShape120S0000000_I2);
        AnonymousClass0P0.A00.add(new IDxCListenerShape169S0000000_I2(1));
        return r14;
    }

    public C06590a0(Application application, C07390bR r2, AnonymousClass01P r3) {
        this.A00 = application;
        this.A02 = r3;
        this.A01 = r2;
    }
}
