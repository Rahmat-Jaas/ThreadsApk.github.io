package X;

import com.facebook.redex.IDxFunctionShape172S0000000_2_I2;
import com.fbpay.ptt.impl.ServerCertsVerifier;
import com.fbpay.util.pttatresource.IDxBResourceShape34S0000000_2_I2;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.5kL  reason: invalid class name and case insensitive filesystem */
public abstract class C92975kL extends C1202479j {
    public final C142618fJ A00;
    public final AnonymousClass76O A01;
    public final C104996ci A02;
    public final C120977Dl A03;

    public static C1202479j A01(AnonymousClass76O r6, C104996ci r7, C120977Dl r8) {
        return new IDxBResourceShape34S0000000_2_I2(new IDxFunctionShape172S0000000_2_I2(0), r6, r7, r8, 1);
    }

    public final C145388kQ A04(C113806sA r19) {
        C104996ci r2 = this.A02;
        C142618fJ r3 = this.A00;
        C120977Dl r0 = this.A03;
        AnonymousClass76O r1 = this.A01;
        C110356lY r8 = new C110356lY(r0.A04, r0.A05, r0.A06, r0.A00, r0.A07);
        C107436gk r11 = new C107436gk(r3, r19);
        C107416gi r9 = r0.A01;
        C1196876l r6 = r1.A02;
        C1202379i r13 = new C1202379i(r8.A01, r8.A02, r8.A03, r8.A04);
        Map map = r6.A02;
        if (!map.containsKey(r13)) {
            AnonymousClass5k3 r12 = (AnonymousClass5k3) map.get(r13);
            if (r12 == null) {
                C106136eY r4 = r6.A01;
                r12 = new AnonymousClass5k3(r13, (ServerCertsVerifier) r6.A03.get(), r6.A00, r4, r6.A04);
                map.put(r13, r12);
            }
            r12.A00 = r13;
            C1202479j.A02(r12.A03.A00, r12);
        }
        Executor executor = r1.A03.A00.A02;
        return new C92925kF(new C1197276p(r1.A00, r8, r9, (AnonymousClass5k3) C86104wH.A0h(r13, map), r11, executor), r2, r0);
    }

    public C92975kL(C142618fJ r1, AnonymousClass76O r2, C104996ci r3, C120977Dl r4) {
        super(r3);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
    }

    public static M5J A00(C120977Dl r2) {
        return A01(AnonymousClass7Kz.A09(), AnonymousClass7Kz.A0C(), r2).A03();
    }
}
