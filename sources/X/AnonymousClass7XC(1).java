package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7XC  reason: invalid class name */
public final class AnonymousClass7XC implements C146278lx {
    public final /* synthetic */ C146708mj A00;

    public AnonymousClass7XC(C146708mj r1) {
        this.A00 = r1;
    }

    public final void ADO(float f, float f2, float f3, float f4, int i) {
        ((AnonymousClass7X9) this.A00).A01.A02.A01.ADO(f, f2, f3, f4, i);
    }

    public final void BQe(float f, float f2, float f3, float f4) {
        C121167El r5 = ((AnonymousClass7X9) this.A00).A01.A02;
        C146678mg r4 = r5.A01;
        long j = r5.A00;
        long A0C = C86104wH.A0C(AnonymousClass7JK.A02(j) - (f3 + f), AnonymousClass7JK.A00(j) - (f4 + f2));
        if (AnonymousClass7JK.A02(A0C) < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || AnonymousClass7JK.A00(A0C) < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            throw C18190wL.A0a("Width and height must be greater than or equal to zero");
        }
        r5.A00 = A0C;
        r4.D7f(f, f2);
    }

    public final void CfJ(long j, float f) {
        C146678mg r2 = ((AnonymousClass7X9) this.A00).A01.A02.A01;
        r2.D7f(AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j));
        r2.CfI(f);
        r2.D7f(-AnonymousClass7KC.A01(j), -AnonymousClass7KC.A02(j));
    }

    public final void Cg3(float f, float f2, long j) {
        C146678mg r2 = ((AnonymousClass7X9) this.A00).A01.A02.A01;
        r2.D7f(AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j));
        r2.Cg2(f, f2);
        r2.D7f(-AnonymousClass7KC.A01(j), -AnonymousClass7KC.A02(j));
    }

    public final void D7f(float f, float f2) {
        ((AnonymousClass7X9) this.A00).A01.A02.A01.D7f(f, f2);
    }
}
