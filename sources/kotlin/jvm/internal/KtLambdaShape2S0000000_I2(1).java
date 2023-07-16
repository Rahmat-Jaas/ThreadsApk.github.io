package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass75O;
import X.C02220Ah;
import X.C04220Ms;
import kotlin.Unit;

public class KtLambdaShape2S0000000_I2 extends C02220Ah implements AnonymousClass0YY {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0000000_I2(int i) {
        super(1);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                C04220Ms.A0B(obj, 0);
                break;
            default:
                AnonymousClass75O.A00(obj).A01("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
                break;
        }
        return Unit.A00;
    }
}
