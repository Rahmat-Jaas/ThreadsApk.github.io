package androidx.recyclerview.widget;

import X.AnonymousClass00J;
import X.AnonymousClass9NU;
import X.C131747sk;
import X.C131877sx;
import X.GKR;
import java.util.List;

public class IDxSLookupShape43S0100000_2_I2 extends GKR {
    public Object A00;
    public final int A01;

    public IDxSLookupShape43S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final int A00(int i) {
        if (this.A01 != 0) {
            Number number = (Number) AnonymousClass00J.A0G((List) this.A00, i);
            if (number != null) {
                return number.intValue();
            }
            return 1;
        }
        AnonymousClass9NU r1 = (AnonymousClass9NU) this.A00;
        if (r1.isModelClass(i, C131877sx.class) || r1.isModelClass(i, C131747sk.class)) {
            return 1;
        }
        return 3;
    }
}
