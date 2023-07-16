package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.556  reason: invalid class name */
public final class AnonymousClass556 extends AnonymousClass7YV implements C147528pU {
    public final float A00;
    public final float A01;

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
        AnonymousClass556 r4;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass556) {
            r4 = (AnonymousClass556) obj;
        } else {
            r4 = null;
        }
        return r4 != null && C18180wK.A1W(Float.compare(this.A00, r4.A00)) && C18180wK.A1W(Float.compare(this.A01, r4.A01));
    }

    public final int hashCode() {
        return C86104wH.A05(C86134wK.A03(this.A00), this.A01) + 1231;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("OffsetModifier(x=");
        C134847yT.A02(A0s, this.A00);
        A0s.append(", y=");
        C134847yT.A02(A0s, this.A01);
        C86164wN.A1M(A0s, ", rtlAware=");
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass556(AnonymousClass0YY r1, float f, float f2) {
        super(r1);
        this.A00 = f;
        this.A01 = f2;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r5, C147618pd r6, long j) {
        AnonymousClass0wJ.A1N(r6, r5);
        C123657Xy Bg4 = r5.Bg4(j);
        return C147618pd.A00(r6, C86154wM.A0y(Bg4, this, r6, 8), Bg4.A01, Bg4.A00);
    }
}
