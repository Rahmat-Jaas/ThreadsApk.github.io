package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.C146958n9;
import X.C18240wQ;
import X.C25237DiI;
import X.C27952Ew2;
import X.C39142Kno;
import X.C83224qz;
import kotlin.Unit;

public class KtSLambdaShape1S0200001_I2 extends C39142Kno implements AnonymousClass0YM {
    public float A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0200001_I2(Object obj, C146958n9 r3, int i) {
        super(3, r3);
        this.A03 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A03;
        float A002 = C18240wQ.A00(obj2);
        C146958n9 r7 = (C146958n9) obj3;
        Object obj4 = this.A01;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        KtSLambdaShape1S0200001_I2 ktSLambdaShape1S0200001_I2 = new KtSLambdaShape1S0200001_I2(obj4, r7, i);
        ktSLambdaShape1S0200001_I2.A02 = obj;
        ktSLambdaShape1S0200001_I2.A00 = A002;
        return ktSLambdaShape1S0200001_I2.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        int i2 = this.A03;
        AnonymousClass0OU.A00(obj);
        C83224qz r5 = (C83224qz) this.A02;
        float f = this.A00;
        Object obj2 = this.A01;
        switch (i2) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            default:
                i = 6;
                break;
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0101001_I2(obj2, (C146958n9) null, f, i), r5, 3);
        return Unit.A00;
    }
}
