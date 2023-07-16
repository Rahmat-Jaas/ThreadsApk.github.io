package X;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.KtLambdaShape5S0102000_I2;

/* renamed from: X.7XW  reason: invalid class name */
public final class AnonymousClass7XW implements C147528pU {
    public final long A00;

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
        AnonymousClass7XW r6;
        if (!(obj instanceof AnonymousClass7XW) || (r6 = (AnonymousClass7XW) obj) == null) {
            return false;
        }
        return C18180wK.A1W((this.A00 > r6.A00 ? 1 : (this.A00 == r6.A00 ? 0 : -1)));
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public AnonymousClass7XW(long j) {
        this.A00 = j;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r8, C147618pd r9, long j) {
        AnonymousClass0wJ.A1N(r9, r8);
        C123657Xy Bg4 = r8.Bg4(j);
        int i = Bg4.A01;
        long j2 = this.A00;
        int max = Math.max(i, r9.CfL(AnonymousClass7HB.A01(j2)));
        int max2 = Math.max(Bg4.A00, r9.CfL(AnonymousClass7HB.A00(j2)));
        return C147618pd.A00(r9, new KtLambdaShape5S0102000_I2(Bg4, max, max2, 3), max, max2);
    }
}
