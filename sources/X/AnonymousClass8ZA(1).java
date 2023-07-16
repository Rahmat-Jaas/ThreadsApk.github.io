package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import ch.boye.httpclientandroidlib.HttpStatus;
import kotlin.Unit;

/* renamed from: X.8ZA  reason: invalid class name */
public final class AnonymousClass8ZA extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ Modifier A06;
    public final /* synthetic */ C121807If A07;
    public final /* synthetic */ C121807If A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ZA(Modifier modifier, Modifier modifier2, C121807If r4, C121807If r5, String str, String str2, String str3, float f, float f2, float f3, int i, int i2) {
        super(3);
        this.A0B = str;
        this.A03 = i;
        this.A04 = i2;
        this.A02 = f;
        this.A01 = f2;
        this.A0A = str2;
        this.A08 = r4;
        this.A09 = str3;
        this.A06 = modifier;
        this.A00 = f3;
        this.A05 = modifier2;
        this.A07 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        float f;
        C147278p5 r2 = (C147278p5) obj;
        C147188nY r4 = (C147188nY) obj2;
        int A042 = AnonymousClass0wJ.A04(obj3);
        C04220Ms.A0B(r2, 0);
        if ((A042 & 14) == 0) {
            i = C147188nY.A0F(r4, r2) | A042;
        } else {
            i = A042;
        }
        if ((i & 91) != 18 || !r4.BCM()) {
            AnonymousClass534 r11 = AnonymousClass7DE.A02;
            C147168nV A0k = C147188nY.A0k(r4, r11);
            String str = this.A0B;
            long j = ((AnonymousClass7V4) r2).A00;
            Integer valueOf = Integer.valueOf(Constraints.A02(j));
            int i2 = this.A03;
            int i3 = this.A04;
            float f2 = this.A02;
            float f3 = this.A01;
            boolean A10 = C147188nY.A10(r4, str, valueOf, 511388516);
            AnonymousClass7W3 r22 = (AnonymousClass7W3) r4;
            Object A13 = r22.A13();
            if (A10 || A13 == AnonymousClass7GN.A00) {
                float CxL = ((float) (i2 + i3)) + A0k.CxL(f3);
                float A022 = (float) Constraints.A02(j);
                if (CxL > A022) {
                    float f4 = A022 * f2;
                    if (((float) i3) > f4) {
                        f = A0k.CxD(f4);
                        A13 = C134847yT.A00(f);
                        r22.A14(A13);
                    }
                }
                f = Float.NaN;
                A13 = C134847yT.A00(f);
                r22.A14(A13);
            }
            AnonymousClass7W3.A0w(r22, false);
            float f5 = ((C134847yT) A13).A00;
            C141758cu r12 = AnonymousClass7KV.A04;
            String str2 = this.A0A;
            C121807If r10 = this.A08;
            String str3 = this.A09;
            Modifier modifier = this.A06;
            float f6 = this.A00;
            Modifier modifier2 = this.A05;
            C121807If r29 = this.A07;
            C123327Wm A023 = Modifier.A02(r4, 693286680);
            C146288ly A002 = AnonymousClass72N.A00(AnonymousClass7J3.A01, r4, r12);
            Object A0s = C147188nY.A0s(r4, r11);
            Object A0n = C147188nY.A0n(r4);
            Object A0m = C147188nY.A0m(r4);
            AnonymousClass0ZU r112 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A023);
            C147188nY.A0w(r4, r22, r112);
            AnonymousClass7W3.A0a(r4, r22, A002, A0s);
            AnonymousClass7KP.A07(r4, A0n, A0m, A003);
            r4.Cvb(-1504352194);
            AnonymousClass7I9.A02(r4, AnonymousClass7Kq.A0E(A023, Float.NaN, Float.NaN, f5, Float.NaN), r10, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 1, 2, 805306368, 6, 508, 0, 0, false);
            if (str3.length() > 0) {
                C115686vk.A01(r4, AnonymousClass7Kq.A0A(modifier, f3), 0);
                C147188nY r26 = r4;
                C121807If r28 = r29;
                AnonymousClass7I9.A02(r26, AnonymousClass7K4.A06(C115656vh.A01(A023, AnonymousClass7G5.A00((float) 20), C120537Bh.A00(r4).A0b), f6, 6).Cx6(modifier2), r28, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str3, 0, 1, 2, 805306368, 6, HttpStatus.SC_GATEWAY_TIMEOUT, AnonymousClass7KB.A03(r4), 0, false);
            }
            AnonymousClass7W3.A0v(r22, true);
        } else {
            r4.CuJ();
        }
        return Unit.A00;
    }
}
