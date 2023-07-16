package X;

import android.app.Application;
import com.facebook.redex.IDxCFactoryShape111S0000000_I2;
import com.facebook.redex.IDxCFactoryShape203S0200000_I2;
import com.facebook.redex.IDxCFactoryShape495S0100000_I2;

/* renamed from: X.0Zl  reason: invalid class name and case insensitive filesystem */
public final class C06460Zl implements AnonymousClass0P4 {
    public final Application A00;
    public final C06110Xs A01;
    public final C07390bR A02;

    public final AnonymousClass0OC A7n(AnonymousClass0OC r2, Integer num) {
        C04220Ms.A0B(r2, 1);
        return r2;
    }

    public final AnonymousClass0OM A7o(AnonymousClass0OM r14, AnonymousClass0Z8 r15) {
        int i;
        C04220Ms.A0B(r15, 0);
        C04220Ms.A0B(r14, 1);
        C06450Zk r1 = C06450Zk.A00;
        Integer num = AnonymousClass006.A0C;
        Application application = this.A00;
        C06110Xs r11 = this.A01;
        AnonymousClass0PN r3 = C07140ax.A05;
        AnonymousClass0IR.A00();
        C13810oL.A01("Config.createJavaDetectionConfig", -1716803349);
        try {
            AnonymousClass0OC r4 = new AnonymousClass0OC(AnonymousClass006.A0E);
            r4.A00 = new AnonymousClass0YU(r11, r1, r3);
            Integer num2 = AnonymousClass006.A00;
            r4.A02 = num2;
            IDxCFactoryShape111S0000000_I2 iDxCFactoryShape111S0000000_I2 = new IDxCFactoryShape111S0000000_I2(4);
            AnonymousClass0ND r6 = AnonymousClass0ND.CRITICAL_REPORT;
            r4.A01(r6, iDxCFactoryShape111S0000000_I2);
            AnonymousClass0OI r2 = new AnonymousClass0OI();
            AnonymousClass0OA r32 = r4.A05;
            r32.A03.add(r2);
            r32.A08.add(new C05960Xc(application));
            C13810oL.A00(-1590171681);
            r15.A00(r4, num);
            r14.A00(r4.A00());
            Integer num3 = AnonymousClass006.A15;
            C07390bR r42 = this.A02;
            C06440Zj r10 = new C06440Zj(r1);
            C13810oL.A01("Config.createJavaAppDeathConfig", -976839389);
            try {
                AnonymousClass0OC r33 = new AnonymousClass0OC(AnonymousClass006.A0F);
                r33.A00 = new IDxCFactoryShape203S0200000_I2(3, r11, r10);
                r33.A02 = num;
                r33.A01 = new IDxCFactoryShape495S0100000_I2((Object) r42, 1);
                r33.A01(r6, new IDxCFactoryShape111S0000000_I2(7));
                r33.A05.A03.add(new AnonymousClass0OI());
                C13810oL.A00(-1615734674);
                r15.A00(r33, num3);
                r14.A00(r33.A00());
                Integer num4 = AnonymousClass006.A0N;
                C13810oL.A01("Config.createJavaAppDeathConfig", 1496207950);
                try {
                    AnonymousClass0OC r22 = new AnonymousClass0OC(AnonymousClass006.A0G);
                    r22.A00 = new IDxCFactoryShape111S0000000_I2(6);
                    r22.A02 = num2;
                    r22.A04 = true;
                    r22.A02(r6, new IDxCFactoryShape111S0000000_I2(5));
                    r22.A01 = new IDxCFactoryShape203S0200000_I2(2, application, r42);
                    C13810oL.A00(404436883);
                    r15.A00(r22, num4);
                    r14.A00(r22.A00());
                    return r14;
                } catch (Throwable th) {
                    th = th;
                    i = 438316605;
                    C13810oL.A00(i);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i = 1774241812;
                C13810oL.A00(i);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            i = 880911848;
            C13810oL.A00(i);
            throw th;
        }
    }

    public C06460Zl(Application application, C06110Xs r2, C07390bR r3) {
        this.A00 = application;
        this.A01 = r2;
        this.A02 = r3;
    }
}
