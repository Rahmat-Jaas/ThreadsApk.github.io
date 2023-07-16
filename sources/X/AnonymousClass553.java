package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.553  reason: invalid class name */
public final class AnonymousClass553 extends AnonymousClass7YV implements C147528pU {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

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
        AnonymousClass553 r4;
        if (obj instanceof AnonymousClass553) {
            r4 = (AnonymousClass553) obj;
        } else {
            r4 = null;
        }
        if (r4 == null || !C18180wK.A1W(Float.compare(this.A00, r4.A00)) || !C18180wK.A1W(Float.compare(this.A01, r4.A01)) || !C18180wK.A1W(Float.compare(this.A03, r4.A03)) || !C18180wK.A1W(Float.compare(this.A02, r4.A02))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C86104wH.A05(C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A00), this.A01), this.A03), this.A02) + 1231;
    }

    public AnonymousClass553(AnonymousClass0YY r3, float f, float f2, float f3, float f4) {
        super(r3);
        this.A00 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A02 = f4;
        if ((f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && !C18180wK.A1W(Float.compare(f, Float.NaN))) || ((f2 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && !C18180wK.A1W(Float.compare(f2, Float.NaN))) || ((f3 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && !C18180wK.A1W(Float.compare(f3, Float.NaN))) || (f4 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && !C18180wK.A1W(Float.compare(f4, Float.NaN)))))) {
            throw C18190wL.A0a("Padding must be non-negative");
        }
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r6, C147618pd r7, long j) {
        AnonymousClass0wJ.A1N(r7, r6);
        int CfL = r7.CfL(this.A00) + r7.CfL(this.A03);
        int CfL2 = r7.CfL(this.A01) + r7.CfL(this.A02);
        C123657Xy Bg4 = r6.Bg4(AnonymousClass7JT.A03(j, -CfL, -CfL2));
        return C147618pd.A00(r7, C86154wM.A0y(Bg4, this, r7, 10), AnonymousClass8bI.A04(j, Bg4.A01 + CfL), AnonymousClass8bI.A03(j, Bg4.A00 + CfL2));
    }
}
