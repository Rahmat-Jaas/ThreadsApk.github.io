package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.C146958n9;
import X.C147368pE;
import X.C18240wQ;
import X.C39142Kno;
import X.D0E;
import com.instagram.barcelona.common.ui.toast.ToastDragDismissState;
import kotlin.Unit;

public class KtSLambdaShape1S0101001_I2 extends C39142Kno implements AnonymousClass0YM {
    public float A00;
    public int A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0101001_I2(ToastDragDismissState toastDragDismissState, C146958n9 r3, int i) {
        super(3, r3);
        this.A03 = i;
        this.A02 = toastDragDismissState;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A03;
        float A002 = C18240wQ.A00(obj2);
        C146958n9 r7 = (C146958n9) obj3;
        ToastDragDismissState toastDragDismissState = (ToastDragDismissState) this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        KtSLambdaShape1S0101001_I2 ktSLambdaShape1S0101001_I2 = new KtSLambdaShape1S0101001_I2(toastDragDismissState, r7, i);
        ktSLambdaShape1S0101001_I2.A00 = A002;
        return ktSLambdaShape1S0101001_I2.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        ToastDragDismissState toastDragDismissState;
        C147368pE r0;
        int i = this.A03;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i2 = this.A01;
        if (i != 0) {
            if (i2 == 0) {
                AnonymousClass0OU.A00(obj);
                f = this.A00;
                toastDragDismissState = (ToastDragDismissState) this.A02;
                r0 = toastDragDismissState.A04;
            }
            AnonymousClass0OU.A00(obj);
            return Unit.A00;
        }
        if (i2 == 0) {
            AnonymousClass0OU.A00(obj);
            f = this.A00;
            toastDragDismissState = (ToastDragDismissState) this.A02;
            r0 = toastDragDismissState.A03;
        }
        AnonymousClass0OU.A00(obj);
        return Unit.A00;
        this.A01 = 1;
        if (toastDragDismissState.A00(r0, this, f) == d0e) {
            return d0e;
        }
        return Unit.A00;
    }
}
