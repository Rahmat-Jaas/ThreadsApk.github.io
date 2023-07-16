package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.550  reason: invalid class name */
public final class AnonymousClass550 extends AnonymousClass7YV implements C147528pU {
    public final C145068jm A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass550(C145068jm r2, AnonymousClass0YY r3) {
        super(r3);
        C04220Ms.A0B(r3, 2);
        this.A00 = r2;
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
        AnonymousClass550 r3;
        if (!(obj instanceof AnonymousClass550) || (r3 = (AnonymousClass550) obj) == null) {
            return false;
        }
        return C04220Ms.A0I(this.A00, r3.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r6, C147618pd r7, long j) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r7, r6);
        C145068jm r4 = this.A00;
        float ABa = r4.ABa(r7.getLayoutDirection());
        float f = A1Y ? 1.0f : 0.0f;
        if (Float.compare(ABa, f) >= 0) {
            AnonymousClass7V9 r1 = (AnonymousClass7V9) r4;
            float f2 = r1.A03;
            if (Float.compare(f2, f) >= 0 && Float.compare(r4.ABe(r7.getLayoutDirection()), f) >= 0) {
                float f3 = r1.A00;
                if (Float.compare(f3, f) >= 0) {
                    int CfL = r7.CfL(r4.ABa(r7.getLayoutDirection())) + r7.CfL(r4.ABe(r7.getLayoutDirection()));
                    int CfL2 = r7.CfL(f2) + r7.CfL(f3);
                    C123657Xy Bg4 = r6.Bg4(AnonymousClass7JT.A03(j, -CfL, -CfL2));
                    return C147618pd.A00(r7, C86154wM.A0y(Bg4, this, r7, 11), AnonymousClass8bI.A04(j, Bg4.A01 + CfL), AnonymousClass8bI.A03(j, Bg4.A00 + CfL2));
                }
            }
        }
        throw C18190wL.A0a("Padding must be non-negative");
    }
}
