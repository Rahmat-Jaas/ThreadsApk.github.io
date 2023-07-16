package X;

import android.app.Application;
import com.facebook.redex.IDxCFactoryShape111S0000000_I2;
import com.facebook.redex.IDxCFactoryShape495S0100000_I2;
import com.facebook.redex.IDxCListenerShape849S0100000_I2;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Zi  reason: invalid class name and case insensitive filesystem */
public final class C06430Zi implements AnonymousClass0P4 {
    public final long A00;
    public final Application A01;
    public final AnonymousClass01P A02;

    public final AnonymousClass0OC A7n(AnonymousClass0OC r2, Integer num) {
        C04220Ms.A0B(r2, 1);
        return r2;
    }

    public final AnonymousClass0OM A7o(AnonymousClass0OM r18, AnonymousClass0Z8 r19) {
        int i;
        Integer num;
        Integer num2;
        Integer num3;
        AnonymousClass0Z8 r6 = r19;
        C04220Ms.A0B(r6, 0);
        AnonymousClass0OM r3 = r18;
        C04220Ms.A0B(r3, 1);
        C06400Ze r11 = C06400Ze.A00;
        long j = this.A00;
        r3.A01 = j;
        AnonymousClass01P r8 = this.A02;
        r3.A0H = true;
        Integer num4 = AnonymousClass006.A00;
        Application application = this.A01;
        C13810oL.A01("Config.createStartupConfig", 779563253);
        try {
            if (AnonymousClass0M6.A00 != null) {
                AnonymousClass0LU.A0C("lacrima", "ErrorReportingDiagnosticData.setInstance already set.");
            } else {
                AnonymousClass0M6.A00 = new C06320Yu();
                AnonymousClass0X7.A01(AnonymousClass0MU.A3H);
                AnonymousClass0X7.A01(AnonymousClass0MU.A3p);
                AnonymousClass0X7.A01(AnonymousClass0MU.A3t);
                AnonymousClass0X7.A01(AnonymousClass0MU.A3z);
                AnonymousClass0X7.A01(AnonymousClass0MU.A4f);
                AnonymousClass0X7.A01(AnonymousClass0MU.A07);
                AnonymousClass0X7.A01(AnonymousClass0MU.A56);
                AnonymousClass0X7.A01(AnonymousClass0MU.A57);
                AnonymousClass0X7.A01(AnonymousClass0MU.A1U);
                AnonymousClass0X7.A01(AnonymousClass0MU.A5T);
                AnonymousClass0X7.A01(AnonymousClass0MU.A5W);
                AnonymousClass0X7.A01(AnonymousClass0MU.A0E);
                AnonymousClass0X7.A01(AnonymousClass0MU.A5u);
                AnonymousClass0X7.A01(AnonymousClass0MU.A6C);
                AnonymousClass0X7.A01(AnonymousClass0MU.A6O);
                AnonymousClass0X7.A01(AnonymousClass0MU.A6X);
                AnonymousClass0X7.A01(AnonymousClass0MU.A6f);
                AnonymousClass0X7.A01(AnonymousClass0MU.A6g);
                AnonymousClass0X7.A01(AnonymousClass0MU.A6o);
                AnonymousClass0X7.A01(AnonymousClass0MU.A6t);
                AnonymousClass0X7.A01(AnonymousClass0MU.A7k);
                AnonymousClass0X7.A01(AnonymousClass0MU.A0S);
                AnonymousClass0X7.A01(AnonymousClass0MU.A7w);
                AnonymousClass0ON r4 = AnonymousClass0MU.A7x;
                AnonymousClass0X7.A01(r4);
                AnonymousClass0X7.A01(r4);
                AnonymousClass0X7.A01(AnonymousClass0MU.A7y);
                AnonymousClass0ON r42 = AnonymousClass0MU.A8S;
                AnonymousClass0X7.A01(r42);
                AnonymousClass0X7.A01(r42);
                AnonymousClass0X7.A01(AnonymousClass0MU.A8e);
                AnonymousClass0X7.A01(AnonymousClass0MU.A8f);
                AnonymousClass0X7.A01(AnonymousClass0MU.A8g);
                AnonymousClass0X7.A01(AnonymousClass0MU.A8h);
                AnonymousClass0X7.A01(AnonymousClass0MU.A8q);
                AnonymousClass0X7.A01(AnonymousClass0MU.A8x);
                AnonymousClass0X7.A01(AnonymousClass0MU.A8w);
                AnonymousClass0X7.A01(AnonymousClass0MU.A8v);
                AnonymousClass0X7.A01(AnonymousClass0MU.A92);
                AnonymousClass0X7.A01(AnonymousClass0MU.A94);
            }
            AnonymousClass0OC r12 = new AnonymousClass0OC(AnonymousClass006.A0h);
            r12.A00 = new IDxCFactoryShape111S0000000_I2(16);
            IDxCFactoryShape495S0100000_I2 iDxCFactoryShape495S0100000_I2 = new IDxCFactoryShape495S0100000_I2(application, 4);
            AnonymousClass0ND r10 = AnonymousClass0ND.CRITICAL_REPORT;
            r12.A01(r10, iDxCFactoryShape495S0100000_I2);
            r12.A01(r10, new IDxCFactoryShape111S0000000_I2(24));
            r12.A01(r10, new IDxCFactoryShape111S0000000_I2(23));
            C13810oL.A00(372908909);
            r12.A05.A03.add(new AnonymousClass0VL(j, num4));
            r12.A01(r10, r11);
            r6.A00(r12, num4);
            r3.A00(r12.A00());
            Integer num5 = AnonymousClass006.A06;
            C13810oL.A01("Config.createBackgroundConfig", 99503965);
            try {
                AnonymousClass0OC r122 = new AnonymousClass0OC(AnonymousClass006.A0k);
                r122.A00 = new IDxCFactoryShape495S0100000_I2((Object) r8, 3);
                num = AnonymousClass006.A01;
                r122.A02 = num;
                C13810oL.A00(53795278);
                r6.A00(r122, num5);
                r122.A02(r10, AnonymousClass0P8.A00);
                r3.A00(r122.A00());
                C13810oL.A01("Config.createNavigationConfig", 1138904713);
            } catch (Throwable th) {
                th = th;
                i = -1730712266;
                C13810oL.A00(i);
                throw th;
            }
            try {
                AnonymousClass0OC r123 = new AnonymousClass0OC(AnonymousClass006.A0p);
                r123.A00 = new IDxCFactoryShape111S0000000_I2(21);
                C13810oL.A00(-1288255057);
                r3.A00(r123.A00());
                C13810oL.A01("Config.createAttributionIdConfig", -112814643);
            } catch (Throwable th2) {
                th = th2;
                i = 385025071;
                C13810oL.A00(i);
                throw th;
            }
            try {
                AnonymousClass0OC r124 = new AnonymousClass0OC(AnonymousClass006.A0i);
                r124.A00 = new IDxCFactoryShape111S0000000_I2(22);
                C13810oL.A00(-608784592);
                r3.A00(r124.A00());
                AnonymousClass0Z2 r125 = new AnonymousClass0Z2();
                synchronized (AnonymousClass0MI.class) {
                    AnonymousClass0MI.A04 = r125;
                    if (AnonymousClass0MI.A04 != null) {
                        List list = AnonymousClass0MI.A00;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            it.next();
                            AnonymousClass0MI.A03.execute(new AnonymousClass0M8(r125));
                        }
                        list.clear();
                    }
                }
                C04410Nm[] r14 = {new IDxCListenerShape849S0100000_I2(r125, 1)};
                int A002 = (int) C07960cV.A00(AnonymousClass0e5.A00(36597394854709855L));
                boolean A05 = C07960cV.A05(AnonymousClass0e5.A00(36324149035016504L));
                C13810oL.A01("Config.createLifecycleConfig", -441884698);
                try {
                    AnonymousClass0P0.A00.add(r14[0]);
                    AnonymousClass0OC r5 = new AnonymousClass0OC(AnonymousClass006.A0o);
                    r5.A00 = new C06300Yq(A002, A05);
                    r5.A02 = num4;
                    C13810oL.A00(1470291112);
                    r5.A05.A03.add(new AnonymousClass0VL(j, num));
                    r6.A00(r5, num);
                    r3.A00(r5.A00());
                    C13810oL.A01("Config.createReportSourceConfig", -1686928486);
                } catch (Throwable th3) {
                    th = th3;
                    i = 1145894786;
                    C13810oL.A00(i);
                    throw th;
                }
                try {
                    AnonymousClass0OC r1 = new AnonymousClass0OC(AnonymousClass006.A0e);
                    r1.A00 = C06250Yk.A00;
                    r1.A02 = num4;
                    C13810oL.A00(-38200418);
                    r3.A00(r1.A00());
                    C13810oL.A01("Config.createUserChangeConfig", 920242569);
                    try {
                        AnonymousClass0OC r2 = new AnonymousClass0OC(AnonymousClass006.A0w);
                        r2.A00 = new IDxCFactoryShape111S0000000_I2(27);
                        num2 = AnonymousClass006.A0C;
                        r2.A02 = num2;
                        C13810oL.A00(-1295987272);
                        r2.A01(r10, r11);
                        r3.A00(r2.A00());
                        num3 = AnonymousClass006.A02;
                        C13810oL.A01("Config.createLateStartupConfig", -1767983259);
                    } catch (Throwable th4) {
                        th = th4;
                        i = -76992389;
                        C13810oL.A00(i);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    i = 884009741;
                    C13810oL.A00(i);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                i = -1595223377;
                C13810oL.A00(i);
                throw th;
            }
            try {
                AnonymousClass0OC r22 = new AnonymousClass0OC(AnonymousClass006.A0H);
                r22.A00 = new IDxCFactoryShape111S0000000_I2(17);
                r22.A02 = num2;
                r22.A03 = false;
                r22.A05.A08.add(new AnonymousClass0XQ(application));
                C13810oL.A00(1035884697);
                r6.A00(r22, num3);
                r3.A00(r22.A00());
                Integer num6 = AnonymousClass006.A03;
                C13810oL.A01("Config.createAfterStartupConfig", 147402321);
                try {
                    AnonymousClass0OC r23 = new AnonymousClass0OC(num);
                    r23.A00 = new IDxCFactoryShape111S0000000_I2(18);
                    r23.A02 = AnonymousClass006.A0N;
                    r23.A03 = false;
                    C13810oL.A00(589800820);
                    r6.A00(r23, num6);
                    r3.A00(r23.A00());
                    r3.A0G = C07960cV.A05(AnonymousClass0e5.A00(36321245637122692L));
                    r3.A0I = C07960cV.A05(AnonymousClass0e5.A00(36321245637188229L));
                    C13810oL.A01("Config.createForegroundTransitionConfig", -614438906);
                } catch (Throwable th7) {
                    th = th7;
                    i = -670600317;
                    C13810oL.A00(i);
                    throw th;
                }
                try {
                    AnonymousClass0OC r24 = new AnonymousClass0OC(AnonymousClass006.A0m);
                    r24.A00 = new IDxCFactoryShape111S0000000_I2(19);
                    r24.A02 = num2;
                    r24.A05.A03.add(new C04590Oh());
                    C13810oL.A00(60948993);
                    r3.A00(r24.A00());
                    return r18;
                } catch (Throwable th8) {
                    th = th8;
                    i = -1292744503;
                    C13810oL.A00(i);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                i = -469152769;
                C13810oL.A00(i);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            i = 1809296511;
            C13810oL.A00(i);
            throw th;
        }
    }

    public C06430Zi(Application application, AnonymousClass01P r2, long j) {
        this.A01 = application;
        this.A00 = j;
        this.A02 = r2;
    }
}
