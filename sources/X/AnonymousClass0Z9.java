package X;

import android.app.Application;
import com.facebook.redex.IDxCFactoryShape111S0000000_I2;
import com.facebook.redex.IDxCFactoryShape203S0200000_I2;
import com.facebook.redex.IDxCListenerShape169S0000000_I2;

/* renamed from: X.0Z9  reason: invalid class name */
public final class AnonymousClass0Z9 implements AnonymousClass0P4 {
    public final Application A00;
    public final C07390bR A01;
    public final AnonymousClass01P A02;

    public final AnonymousClass0OC A7n(AnonymousClass0OC r2, Integer num) {
        C04220Ms.A0B(r2, 1);
        return r2;
    }

    public final AnonymousClass0OM A7o(AnonymousClass0OM r12, AnonymousClass0Z8 r13) {
        int i;
        C04220Ms.A0B(r13, 0);
        C04220Ms.A0B(r12, 1);
        if (C07960cV.A05(AnonymousClass0e5.A00(2342155218239685488L))) {
            Integer num = AnonymousClass006.A0j;
            Application application = this.A00;
            C07390bR r4 = this.A01;
            boolean z = false;
            if (C07960cV.A05(AnonymousClass0e5.A00(36312209025925999L))) {
                z = true;
            }
            boolean z2 = !C07960cV.A05(AnonymousClass0e5.A00(36315168258460074L));
            boolean A05 = C07960cV.A05(AnonymousClass0e5.A00(2342155218239816561L));
            C13810oL.A01("Config.createAnrConfig", -2001511387);
            try {
                AnonymousClass0OC r2 = new AnonymousClass0OC(AnonymousClass006.A0N);
                r2.A00 = new AnonymousClass0YL(application, z, A05, z2);
                r2.A02 = AnonymousClass006.A0C;
                r2.A01(AnonymousClass0ND.CRITICAL_REPORT, new IDxCFactoryShape111S0000000_I2(1));
                r2.A05.A03.add(new AnonymousClass0OI());
                r2.A01 = new IDxCFactoryShape203S0200000_I2(1, application, r4);
                C13810oL.A00(804268052);
                r13.A00(r2, num);
                r12.A00(r2.A00());
            } catch (Throwable th) {
                th = th;
                i = 441582652;
            }
        }
        Integer num2 = AnonymousClass006.A0u;
        Application application2 = this.A00;
        C07390bR r42 = this.A01;
        boolean z3 = !C07960cV.A05(AnonymousClass0e5.A00(36315168258460074L));
        C13810oL.A01("Config.createAnrAppDeathConfig", 644998464);
        try {
            AnonymousClass0OC r22 = new AnonymousClass0OC(AnonymousClass006.A0Y);
            r22.A00 = new AnonymousClass0YJ(z3);
            r22.A02 = AnonymousClass006.A01;
            IDxCFactoryShape111S0000000_I2 iDxCFactoryShape111S0000000_I2 = new IDxCFactoryShape111S0000000_I2(0);
            AnonymousClass0ND r1 = AnonymousClass0ND.CRITICAL_REPORT;
            r22.A02(r1, iDxCFactoryShape111S0000000_I2);
            r22.A02(r1, AnonymousClass0YI.A00);
            r22.A01 = new IDxCFactoryShape203S0200000_I2(0, application2, r42);
            C13810oL.A00(-587538686);
            r13.A00(r22, num2);
            r12.A00(r22.A00());
            AnonymousClass0P0.A00.add(new IDxCListenerShape169S0000000_I2(0));
            return r12;
        } catch (Throwable th2) {
            th = th2;
            i = -370314237;
            C13810oL.A00(i);
            throw th;
        }
    }

    public AnonymousClass0Z9(Application application, C07390bR r2, AnonymousClass01P r3) {
        this.A00 = application;
        this.A02 = r3;
        this.A01 = r2;
    }
}
