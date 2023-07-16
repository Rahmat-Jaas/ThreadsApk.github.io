package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.OnKeyEventElement;
import kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2;

/* renamed from: X.8Z2  reason: invalid class name */
public final class AnonymousClass8Z2 extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ C113196qu A00;
    public final /* synthetic */ AnonymousClass788 A01;
    public final /* synthetic */ C121827Ii A02;
    public final /* synthetic */ C146978nB A03;
    public final /* synthetic */ AnonymousClass7HD A04;
    public final /* synthetic */ AnonymousClass0YY A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Z2(C113196qu r2, AnonymousClass788 r3, C121827Ii r4, C146978nB r5, AnonymousClass7HD r6, AnonymousClass0YY r7, boolean z, boolean z2) {
        super(3);
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
        this.A06 = z;
        this.A07 = z2;
        this.A03 = r5;
        this.A01 = r3;
        this.A05 = r7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        C04220Ms.A0B(obj, 0);
        A0H.Cvb(58482146);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(A0H, -492369756);
        Object A13 = A0Z.A13();
        Object obj4 = AnonymousClass7GN.A00;
        if (A13 == obj4) {
            A13 = new C104016b6();
            A0Z.A14(A13);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        C104016b6 r10 = (C104016b6) A13;
        Object A0r = C147188nY.A0r(A0H, A0Z, -492369756);
        if (A0r == obj4) {
            A0r = new C104006b5();
            A0Z.A14(A0r);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        C113196qu r7 = this.A00;
        C121827Ii r9 = this.A02;
        AnonymousClass7HD r12 = this.A04;
        boolean z = this.A06;
        boolean z2 = this.A07;
        Modifier Cx6 = Modifier.A00.Cx6(new OnKeyEventElement(new IDxRImplShape189S0000000_2_I2(new AnonymousClass772((C104006b5) A0r, r7, this.A01, r9, r10, this.A03, r12, this.A05, z, z2), 0)));
        AnonymousClass7W3.A0w(A0Z, false);
        return Cx6;
    }
}
