package X;

import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape1S0000001_I2;

/* renamed from: X.8JD  reason: invalid class name */
public final class AnonymousClass8JD extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C81784oM A03;
    public final /* synthetic */ C123657Xy A04;
    public final /* synthetic */ C123657Xy A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8JD(C81784oM r2, C123657Xy r3, C123657Xy r4, int i, int i2, int i3) {
        super(1);
        this.A05 = r3;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r2;
        this.A04 = r4;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        C123657Xy r3 = this.A05;
        int i = this.A01;
        C122067Jz.A02(r3, 0, (i - this.A00) - r3.A00);
        float A002 = C18240wQ.A00(this.A03.getValue());
        C141758cu r7 = AnonymousClass7KV.A04;
        C123657Xy r32 = this.A04;
        int A032 = AnonymousClass8bA.A03(C86134wK.A01(i - r32.A00), ((float) 1) + ((AnonymousClass7Wh) r7).A00);
        if (A002 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            C122067Jz.A02(r32, 0, A032);
        } else {
            C122067Jz.A04(r32, new KtLambdaShape1S0000001_I2(A002, 14), 0, A032 + AnonymousClass8bA.A03((float) (this.A02 - A032), A002), 4);
        }
        return Unit.A00;
    }
}
