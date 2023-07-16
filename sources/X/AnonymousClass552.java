package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.552  reason: invalid class name */
public final class AnonymousClass552 extends AnonymousClass7YV implements C147528pU {
    public final AnonymousClass0YP A00;
    public final Integer A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass552(Integer num, Object obj, AnonymousClass0YY r4, AnonymousClass0YP r5) {
        super(r4);
        C04220Ms.A0B(obj, 4);
        this.A01 = num;
        this.A00 = r5;
        this.A02 = obj;
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ int BfA(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A00(r2, r3, this, i);
    }

    public final /* synthetic */ int BfD(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A01(r2, r3, this, i);
    }

    public final C146098ld Bg3(C147578pZ r10, C147618pd r11, long j) {
        int A04;
        C147618pd r5 = r11;
        AnonymousClass0wJ.A1N(r11, r10);
        Integer num = this.A01;
        int i = 0;
        if (num != AnonymousClass006.A00) {
            A04 = 0;
        } else {
            A04 = Constraints.A04(j);
        }
        if (num == AnonymousClass006.A01) {
            i = Constraints.A03(j);
        }
        C123657Xy Bg4 = r10.Bg4(AnonymousClass7JT.A02(A04, Constraints.A02(j), i, Constraints.A01(j)));
        int A042 = AnonymousClass8bI.A04(j, Bg4.A01);
        int A03 = AnonymousClass8bI.A03(j, Bg4.A00);
        return C147618pd.A00(r11, new AnonymousClass8Iw(this, r5, Bg4, A042, A03), A042, A03);
    }

    public final /* synthetic */ int BgL(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A02(r2, r3, this, i);
    }

    public final /* synthetic */ int BgO(C147148nT r2, C147838q0 r3, int i) {
        return AnonymousClass7FO.A03(r2, r3, this, i);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass552)) {
            return false;
        }
        AnonymousClass552 r4 = (AnonymousClass552) obj;
        if (this.A01 == r4.A01) {
            return C86134wK.A1a(this.A02, r4.A02, false);
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 0:
                str = "Vertical";
                break;
            case 1:
                str = "Horizontal";
                break;
            default:
                str = "Both";
                break;
        }
        return C18220wO.A06(this.A02, ((C86144wL.A0B(str, intValue) * 31) + 1237) * 31);
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
