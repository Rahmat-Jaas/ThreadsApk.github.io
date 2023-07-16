package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.557  reason: invalid class name */
public final class AnonymousClass557 extends AnonymousClass7YV implements C147528pU {
    public final AnonymousClass0YY A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass557(AnonymousClass0YY r2, AnonymousClass0YY r3, boolean z) {
        super(r3);
        C04220Ms.A0B(r3, 3);
        this.A00 = r2;
        this.A01 = z;
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
        AnonymousClass557 r4;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass557) {
            r4 = (AnonymousClass557) obj;
        } else {
            r4 = null;
        }
        return r4 != null && C04220Ms.A0I(this.A00, r4.A00) && this.A01 == r4.A01;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A00) + C86124wJ.A04(this.A01 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("OffsetPxModifier(offset=");
        A0s.append(this.A00);
        A0s.append(", rtlAware=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r5, C147618pd r6, long j) {
        AnonymousClass0wJ.A1N(r6, r5);
        C123657Xy Bg4 = r5.Bg4(j);
        return C147618pd.A00(r6, C86154wM.A0y(Bg4, this, r6, 9), Bg4.A01, Bg4.A00);
    }
}
