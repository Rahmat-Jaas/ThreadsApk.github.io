package X;

import android.view.View;
import kotlin.jvm.internal.KtLambdaShape54S0100000_I2_34;

/* renamed from: X.6q8  reason: invalid class name and case insensitive filesystem */
public final class C112756q8 {
    public final View A00;
    public final C25757DrU A01 = C25757DrU.A01(120.0d, 10.0d);
    public final C04530Oa A02 = AnonymousClass0OY.A02(new KtLambdaShape54S0100000_I2_34(this, 17));
    public final C04530Oa A03 = AnonymousClass0OY.A02(new KtLambdaShape54S0100000_I2_34(this, 18));

    public C112756q8(View view) {
        C04220Ms.A0B(view, 1);
        this.A00 = view;
        view.setCameraDistance(C09860go.A03(view.getContext(), 5000));
    }

    public final void A00(boolean z, AnonymousClass0ZU r6) {
        double d;
        C04180Mo r3 = new C04180Mo();
        C04530Oa r2 = this.A03;
        ((C25812DsR) C18190wL.A0f(r2)).A0E(new C127257go(this, r6, r3));
        C25812DsR dsR = (C25812DsR) C18190wL.A0f(r2);
        if (z) {
            d = 1.0d;
        } else {
            d = -1.0d;
        }
        dsR.A0A(d);
    }
}
