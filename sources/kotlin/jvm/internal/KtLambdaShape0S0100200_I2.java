package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass7JK;
import X.C02220Ah;
import X.C04220Ms;
import X.C104136bI;
import X.C122067Jz;
import X.C123657Xy;
import X.C147558pX;
import X.C18240wQ;
import X.C29;
import X.C86104wH;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

public class KtLambdaShape0S0100200_I2 extends C02220Ah implements AnonymousClass0YY {
    public long A00;
    public long A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0100200_I2(Object obj, int i, long j, long j2) {
        super(1);
        this.A03 = i;
        this.A02 = obj;
        this.A00 = j;
        this.A01 = j2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A03 != 0) {
            C147558pX r5 = (C147558pX) obj2;
            C04220Ms.A0B(r5, 0);
            r5.AIq();
            float CxL = r5.CxL((float) 2);
            long BCH = r5.BCH();
            float A002 = AnonymousClass7JK.A00(BCH) - (0.5f * CxL);
            float A022 = AnonymousClass7JK.A02(BCH) * C18240wQ.A00(C86104wH.A0f(this.A02));
            r5.AJ3((C104136bI) null, (C29) null, CxL, 1.0f, 0, 3, this.A00, C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A002), C86104wH.A0C(AnonymousClass7JK.A02(r5.BCH()), A002));
            r5.AJ3((C104136bI) null, (C29) null, CxL, 1.0f, 0, 3, this.A01, C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A002), C86104wH.A0C(A022, A002));
        } else {
            C04220Ms.A0B(obj2, 0);
            long j = this.A00;
            long j2 = this.A01;
            C122067Jz.A00((C123657Xy) this.A02, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, ((int) (j >> 32)) + ((int) (j2 >> 32)), C86104wH.A08(j) + C86104wH.A08(j2));
        }
        return Unit.A00;
    }
}
