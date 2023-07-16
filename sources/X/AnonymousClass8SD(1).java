package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8SD  reason: invalid class name */
public final class AnonymousClass8SD extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C146818mu A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SD(C146818mu r2, String str, String str2, float f, float f2, int i, boolean z, boolean z2) {
        super(2);
        this.A03 = r2;
        this.A01 = f;
        this.A05 = str;
        this.A00 = f2;
        this.A02 = i;
        this.A04 = str2;
        this.A07 = z;
        this.A06 = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r2 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r2.BCM()) {
            C146818mu r1 = this.A03;
            C123327Wm r8 = Modifier.A00;
            float f = (float) 0;
            Modifier A042 = AnonymousClass7K4.A04(r1.DB5(r8, 1.0f, true), this.A01, f);
            float f2 = (float) 4;
            C147268p4 A012 = AnonymousClass7J3.A01(f2);
            String str = this.A05;
            float f3 = this.A00;
            int i = this.A02;
            String str2 = this.A04;
            boolean z = this.A07;
            boolean z2 = this.A06;
            r2.Cvb(-483455358);
            C146288ly A002 = AnonymousClass72M.A00(A012, r2, AnonymousClass7KV.A02);
            AnonymousClass534 A0a = C147188nY.A0a(r2);
            Object AEA = r2.AEA(A0a);
            AnonymousClass534 r11 = AnonymousClass7DE.A07;
            Object AEA2 = r2.AEA(r11);
            AnonymousClass534 r9 = AnonymousClass7DE.A0B;
            Object AEA3 = r2.AEA(r9);
            AnonymousClass0ZU r5 = AnonymousClass74X.A00;
            AnonymousClass0YM A003 = C98236Es.A00(A042);
            AnonymousClass7W3 r0 = (AnonymousClass7W3) r2;
            C147188nY.A0w(r2, r0, r5);
            r0.A0T = false;
            AnonymousClass0YP r3 = AnonymousClass74X.A03;
            AnonymousClass0YP A004 = AnonymousClass7Ak.A00(r2, A002, AEA, r3);
            AnonymousClass0YP r12 = AnonymousClass74X.A02;
            AnonymousClass0YP A013 = AnonymousClass7Ak.A01(r2, AEA2, r12);
            Integer A052 = AnonymousClass7KP.A05(r2, AEA3, A013, A003);
            r2.Cvb(2058660585);
            r2.Cvb(-645290048);
            Modifier A043 = Modifier.A04(r8);
            C146288ly A0g = C147188nY.A0g(r2, AnonymousClass7KV.A04);
            Object A0s = C147188nY.A0s(r2, A0a);
            Object AEA4 = r2.AEA(r11);
            Object AEA5 = r2.AEA(r9);
            AnonymousClass0YM A005 = C98236Es.A00(A043);
            C147188nY.A0w(r2, r0, r5);
            r0.A0T = false;
            AnonymousClass7Ak.A02(r2, A0g, r3);
            AnonymousClass7Ak.A02(r2, A0s, A004);
            A005.invoke(AnonymousClass7KP.A03(r2, AEA4, AEA5, r12, A013), r2, A052);
            r2.Cvb(2058660585);
            AnonymousClass7VA r4 = AnonymousClass7VA.A00;
            r2.Cvb(-669065764);
            C147188nY r26 = r2;
            AnonymousClass7I9.A02(r26, r4.DB5(r8, 1.0f, false), AnonymousClass7J9.A04(r2), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str2, 0, 1, 2, ((i >> 3) & 14) | 805306368, 6, 508, 0, 0, false);
            r2.Cvb(956873494);
            if (z) {
                C101226Qj.A00(AnonymousClass7K4.A05(r8, f2, f, f, f), r2, 6, 0);
            }
            AnonymousClass7W3.A0w(r0, false);
            r2.Cvb(441111475);
            if (z2) {
                C101216Qi.A00(AnonymousClass7K4.A05(r8, (float) 3, f, f, f), r2, 6, 0);
            }
            AnonymousClass7W3.A0w(r0, false);
            AnonymousClass7W3.A0v(r0, true);
            if (str != null && !AnonymousClass8bQ.A0n(str)) {
                String str3 = str;
                AnonymousClass7I9.A02(r2, (Modifier) null, AnonymousClass7J9.A02(r2), (C114236su) null, (C134817yQ) null, (C121117Ee) null, str3, 0, 1, 2, ((i >> 9) & 14) | 805306368, 6, 506, C121657He.A04(C86154wM.A0G(AnonymousClass7KB.A03(r2)), AnonymousClass7KE.A03(AnonymousClass7KB.A03(r2)), AnonymousClass7KE.A02(AnonymousClass7KB.A03(r2)), AnonymousClass7KE.A01(AnonymousClass7KB.A03(r2)), f3), 0, false);
            }
            AnonymousClass7W3.A0v(r0, true);
        } else {
            r2.CuJ();
        }
        return Unit.A00;
    }
}
