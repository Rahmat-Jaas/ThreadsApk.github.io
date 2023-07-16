package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.AnonymousClass7JH;
import X.C02220Ah;
import X.C18240wQ;
import com.instagram.compose.core.SwipeableState;

public class KtLambdaShape3S0100001_I2 extends C02220Ah implements AnonymousClass0ZU {
    public float A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0100001_I2(Object obj, float f, int i) {
        super(0);
        this.A02 = i;
        this.A00 = f;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        float A002;
        switch (this.A02) {
            case 0:
            case 1:
                A002 = this.A00 * C18240wQ.A00(AnonymousClass7JH.A01((AnonymousClass7JH) this.A01));
                break;
            default:
                A002 = C18240wQ.A00(((SwipeableState) this.A01).A09.getValue()) / this.A00;
                break;
        }
        return Float.valueOf(A002);
    }
}
