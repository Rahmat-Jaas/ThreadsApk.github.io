package kotlin.coroutines.jvm.internal;

import X.AnonymousClass7F6;
import X.C146958n9;
import X.C27236EjA;
import X.C83234r0;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import com.facebook.forker.Process;
import com.facebook.redex.IDxFlowShape251S0100000_2_I2;

public class KtCImplShape0S0403000_I2 extends C27236EjA {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0403000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A07 = i;
        this.A06 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        this.A05 = obj;
        this.A02 |= Process.WAIT_RESULT_TIMEOUT;
        Object obj2 = this.A06;
        if (i != 0) {
            return ((IDxFlowShape251S0100000_2_I2) obj2).collect((C83234r0) null, this);
        }
        return ((BringIntoViewRequesterImpl) obj2).AAx((AnonymousClass7F6) null, this);
    }
}
