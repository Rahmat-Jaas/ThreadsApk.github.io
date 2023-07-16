package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8SZ  reason: invalid class name */
public final class AnonymousClass8SZ extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C113196qu A01;
    public final /* synthetic */ C121827Ii A02;
    public final /* synthetic */ C146978nB A03;
    public final /* synthetic */ AnonymousClass7HD A04;
    public final /* synthetic */ C147168nV A05;
    public final /* synthetic */ AnonymousClass0YY A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8SZ(C113196qu r2, C121827Ii r3, C146978nB r4, AnonymousClass7HD r5, C147168nV r6, AnonymousClass0YY r7, int i, boolean z, boolean z2) {
        super(2);
        this.A02 = r3;
        this.A01 = r2;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C146508mM r0;
        C147188nY r14 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r14.BCM()) {
            C113196qu r7 = this.A01;
            AnonymousClass0YY r11 = this.A06;
            AnonymousClass7Xj r6 = new AnonymousClass7Xj(r7, this.A03, this.A04, this.A05, r11, this.A00);
            C123327Wm A022 = Modifier.A02(r14, -1323940314);
            Object AEA = r14.AEA(AnonymousClass7DE.A02);
            Object A0n = C147188nY.A0n(r14);
            Object A0m = C147188nY.A0m(r14);
            AnonymousClass0ZU r02 = AnonymousClass74X.A00;
            AnonymousClass0YM A002 = C98236Es.A00(A022);
            AnonymousClass7W3 r1 = (AnonymousClass7W3) r14;
            C147188nY.A0w(r14, r1, r02);
            AnonymousClass7KP A023 = AnonymousClass7KP.A02(r14, r6, AEA, A0n, A0m);
            boolean z = false;
            C147188nY.A0x(r14, A023, A002, 0);
            AnonymousClass7W3.A0d(r1);
            C121827Ii r4 = this.A02;
            C147368pE r3 = r7.A08;
            if (r3.getValue() == AnonymousClass679.Selection && (r0 = r7.A01) != null && r0.BRS() && this.A08) {
                z = true;
            }
            AnonymousClass7JQ.A05(r4, r14, 8, z);
            if (r3.getValue() == AnonymousClass679.Cursor && !this.A07 && this.A08) {
                AnonymousClass7JQ.A04(r4, r14, 8);
            }
        } else {
            r14.CuJ();
        }
        return Unit.A00;
    }
}
