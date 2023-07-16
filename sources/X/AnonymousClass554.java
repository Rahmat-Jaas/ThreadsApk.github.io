package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.554  reason: invalid class name */
public final class AnonymousClass554 extends AnonymousClass7YV implements C147528pU {
    public final float A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass554(AnonymousClass0YY r2, float f) {
        super(r2);
        C04220Ms.A0B(r2, 2);
        this.A00 = f;
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
        AnonymousClass554 r4;
        if (obj instanceof AnonymousClass554) {
            r4 = (AnonymousClass554) obj;
        } else {
            r4 = null;
        }
        if (r4 == null || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0C("ZIndexModifier(zIndex=", ')', this.A00);
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r5, C147618pd r6, long j) {
        AnonymousClass0wJ.A1N(r6, r5);
        C123657Xy Bg4 = r5.Bg4(j);
        return C147618pd.A00(r6, C86164wN.A11(this, Bg4, 6), Bg4.A01, Bg4.A00);
    }
}
