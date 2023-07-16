package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.C146958n9;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape1S0000000_I2 extends C39142Kno implements AnonymousClass0YM {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0000000_I2(int i) {
        super(3, (C146958n9) null);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (1 - this.A00 == 0) {
            ((Number) obj2).floatValue();
        }
        C146958n9 r4 = (C146958n9) obj3;
        if (r4 != null) {
            r4.getContext();
        }
        Unit unit = Unit.A00;
        AnonymousClass0OU.A00(unit);
        return unit;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        return Unit.A00;
    }
}
