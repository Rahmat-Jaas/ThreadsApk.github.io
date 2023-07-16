package kotlin.coroutines.jvm.internal;

import X.C146958n9;
import X.C148838sG;
import X.C27236EjA;
import androidx.paging.SingleRunner;
import androidx.paging.UnbatchedFlowCombiner;
import com.facebook.forker.Process;
import com.facebook.redex.IDxFCollectorShape230S0100000_2_I2;
import java.util.List;

public class KtCImplShape0S0502000_I2 extends C27236EjA {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0502000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A07 = i;
        this.A06 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A07;
        this.A05 = obj;
        this.A01 |= Process.WAIT_RESULT_TIMEOUT;
        switch (i) {
            case 0:
                return ((SingleRunner.Holder) this.A06).A01(this, (C148838sG) null, 0);
            case 1:
                return ((UnbatchedFlowCombiner) this.A06).A00((Object) null, this, 0);
            default:
                return ((IDxFCollectorShape230S0100000_2_I2) this.A06).A04((List) null, this);
        }
    }
}
