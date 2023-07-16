package X;

import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

/* renamed from: X.8Iw  reason: invalid class name */
public final class AnonymousClass8Iw extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass552 A02;
    public final /* synthetic */ C147618pd A03;
    public final /* synthetic */ C123657Xy A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Iw(AnonymousClass552 r2, C147618pd r3, C123657Xy r4, int i, int i2) {
        super(1);
        this.A02 = r2;
        this.A01 = i;
        this.A04 = r4;
        this.A00 = i2;
        this.A03 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        AnonymousClass0YP r5 = this.A02.A00;
        int i = this.A01;
        C123657Xy r4 = this.A04;
        C122067Jz.A01(r4, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((C121127Eg) r5.invoke(new C114336t4(AnonymousClass7FV.A00(i - r4.A01, this.A00 - r4.A00)), this.A03.getLayoutDirection())).A00);
        return Unit.A00;
    }
}
