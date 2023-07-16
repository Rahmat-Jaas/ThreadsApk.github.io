package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass67C;
import X.C146958n9;
import X.C147828pz;
import X.C18220wO;
import X.C39144Knq;
import X.D0E;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import kotlin.Unit;

public class KtSLambdaShape2S0101000_I2 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape2S0101000_I2(int i, C146958n9 r3) {
        super(2, r3);
        this.A02 = i;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        int i;
        if (this.A02 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        KtSLambdaShape2S0101000_I2 ktSLambdaShape2S0101000_I2 = new KtSLambdaShape2S0101000_I2(i, r4);
        ktSLambdaShape2S0101000_I2.A01 = obj;
        return ktSLambdaShape2S0101000_I2;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A02;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (i != 0) {
            if (this.A00 != 0) {
                AnonymousClass0OU.A00(obj);
            } else {
                AnonymousClass0OU.A00(obj);
                this.A00 = 1;
                obj = TapGestureDetectorKt.A00((C147828pz) this.A01, AnonymousClass67C.Main, this);
                if (obj == d0e) {
                    return d0e;
                }
            }
            return obj;
        }
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            this.A00 = 1;
            if (ForEachGestureKt.A00((C147828pz) this.A01, this) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape2S0101000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
