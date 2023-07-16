package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6;

/* renamed from: X.555  reason: invalid class name */
public final class AnonymousClass555 extends AnonymousClass7YV implements C147528pU {
    public final float A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass555(AnonymousClass0YY r3, float f) {
        super(r3);
        C04220Ms.A0B(r3, 2);
        this.A00 = f;
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            throw C18190wL.A0a(AnonymousClass00U.A0Q("targetAspectRatio ", " must be > 0", f));
        }
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
        AnonymousClass555 r4;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass555) {
            r4 = (AnonymousClass555) obj;
        } else {
            r4 = null;
        }
        return r4 != null && this.A00 == r4.A00;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0C("TargetAspectRatioModifier(targetAspectRatio=", ')', this.A00);
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r6, C147618pd r7, long j) {
        AnonymousClass0wJ.A1N(r7, r6);
        float f = this.A00;
        int A03 = AnonymousClass8bI.A03(j, AnonymousClass8bA.A02(((float) Constraints.A02(j)) / f));
        C123657Xy Bg4 = r6.Bg4(Constraints.A01.A03(AnonymousClass8bI.A04(j, AnonymousClass8bA.A03(f, (float) A03)), A03));
        return C147618pd.A00(r7, new KtLambdaShape151S0100000_I2_6(Bg4, 34), Bg4.A01, Bg4.A00);
    }
}
