package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C121057Dw;
import X.C147188nY;
import java.util.Arrays;
import kotlin.Unit;

public class KtLambdaShape3S2100000_I2 extends C02220Ah implements AnonymousClass0YP {
    public Object A00;
    public String A01;
    public String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S2100000_I2(Object obj, String str, String str2) {
        super(2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r6 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r6.BCM()) {
            C121057Dw r4 = C121057Dw.A00;
            String str = this.A01;
            String str2 = this.A02;
            Object[] objArr = (Object[]) this.A00;
            r4.A01(r6, str, str2, Arrays.copyOf(objArr, objArr.length));
        } else {
            r6.CuJ();
        }
        return Unit.A00;
    }
}
