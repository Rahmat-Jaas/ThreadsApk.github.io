package X;

import com.facebook.react.uimanager.BaseViewManager;
import kotlin.coroutines.jvm.internal.KtSLambdaShape10S0301000_I2_2;

/* renamed from: X.7U8  reason: invalid class name */
public final class AnonymousClass7U8 implements C142668fO {
    public final long A00;

    public final C142678fP CbD(C142738fV r8, C147188nY r9, int i) {
        C04220Ms.A0B(r8, 0);
        AnonymousClass7W3 A0Z = C147188nY.A0Z(r9, -1693923695);
        Object A13 = A0Z.A13();
        Object obj = AnonymousClass7GN.A00;
        if (A13 == obj) {
            A13 = AnonymousClass6DU.A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A0Z.A14(A13);
        }
        AnonymousClass7JH r4 = (AnonymousClass7JH) A13;
        AnonymousClass7K5.A05(r9, r8, new KtSLambdaShape10S0301000_I2_2((Object) r4, (Object) r8, (C146958n9) null, 40));
        boolean A0y = C147188nY.A0y(r9, r8);
        Object A132 = A0Z.A13();
        if (A0y || A132 == obj) {
            A132 = new AnonymousClass7UD(r4.A04, this);
            A0Z.A14(A132);
        }
        AnonymousClass7W3.A0w(A0Z, false);
        AnonymousClass7UD r1 = (AnonymousClass7UD) A132;
        AnonymousClass7W3.A0w(A0Z, false);
        return r1;
    }

    public AnonymousClass7U8(long j) {
        this.A00 = j;
    }
}
