package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.jvm.internal.KtLambdaShape151S0100000_I2_6;

/* renamed from: X.558  reason: invalid class name */
public final class AnonymousClass558 extends AnonymousClass7YV implements C147528pU {
    public final C145068jm A00;
    public final float A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass558(C145068jm r3, AnonymousClass0YY r4, float f) {
        super(r4);
        C04220Ms.A0B(r4, 3);
        this.A01 = f;
        this.A00 = r3;
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            throw C18190wL.A0a(AnonymousClass00U.A0Q("aspectRatio ", " must be > 0", f));
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
        AnonymousClass558 r2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass558) {
            r2 = (AnonymousClass558) obj;
        } else {
            r2 = null;
        }
        return r2 != null && this.A01 == r2.A01 && C04220Ms.A0I(this.A00, ((AnonymousClass558) obj).A00);
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C86134wK.A03(this.A01));
    }

    public final String toString() {
        return AnonymousClass00U.A0C("ContentAspectRatioModifier(aspectRatio=", ')', this.A01);
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final C146098ld Bg3(C147578pZ r6, C147618pd r7, long j) {
        AnonymousClass0wJ.A1N(r7, r6);
        C145068jm r3 = this.A00;
        AnonymousClass69J r0 = AnonymousClass69J.Ltr;
        AnonymousClass7V9 r32 = (AnonymousClass7V9) r3;
        long A002 = AnonymousClass7FV.A00(r7.CfL(AnonymousClass7K4.A01(r3, r0) + AnonymousClass7K4.A00(r3, r0)), r7.CfL(r32.A03 + r32.A00));
        int A08 = C86104wH.A08(A002);
        long A03 = AnonymousClass7JT.A03(j, -C86104wH.A07(A002), -A08);
        float A02 = (float) Constraints.A02(A03);
        int A012 = Constraints.A01(A03);
        float f = this.A01;
        if (f > A02 / ((float) A012)) {
            A012 = AnonymousClass8bA.A02(A02 / f);
        }
        int i = A012 + A08;
        C123657Xy Bg4 = r6.Bg4(Constraints.A05(Constraints.A04(j), Constraints.A02(j), i, i));
        return C147618pd.A00(r7, new KtLambdaShape151S0100000_I2_6(Bg4, 30), Bg4.A01, Bg4.A00);
    }
}
