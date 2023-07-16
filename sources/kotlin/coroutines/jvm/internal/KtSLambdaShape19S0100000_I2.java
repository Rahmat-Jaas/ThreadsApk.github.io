package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0OU;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.C146958n9;
import X.C18240wQ;
import X.C39142Kno;
import X.C86144wL;
import X.C86164wN;
import kotlin.Unit;

public class KtSLambdaShape19S0100000_I2 extends C39142Kno implements AnonymousClass0YY {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape19S0100000_I2(C146958n9 r2, AnonymousClass0ZU r3, int i) {
        super(1, r2);
        this.A01 = i;
        this.A00 = r3;
    }

    public final C146958n9 create(C146958n9 r4) {
        int i;
        int i2 = this.A01;
        AnonymousClass0ZU r2 = (AnonymousClass0ZU) this.A00;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new KtSLambdaShape19S0100000_I2(r4, r2, i);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A01;
        AnonymousClass0OU.A00(obj);
        if (i == 0) {
            return C86144wL.A0j(this.A00);
        }
        C18240wQ.A1G(this.A00);
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((KtSLambdaShape19S0100000_I2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
