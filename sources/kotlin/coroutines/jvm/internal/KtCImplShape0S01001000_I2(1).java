package kotlin.coroutines.jvm.internal;

import X.C146958n9;
import X.C27236EjA;
import androidx.work.CoroutineWorker;
import com.facebook.forker.Process;
import com.facebook.redex.IDxFCollectorShape84S0200000_2_I2;

public class KtCImplShape0S01001000_I2 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public final int A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S01001000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A0B = i;
        this.A0A = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A0B;
        this.A09 = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        Object obj2 = this.A0A;
        if (i != 0) {
            return ((CoroutineWorker) obj2).A05(this);
        }
        return ((IDxFCollectorShape84S0200000_2_I2) obj2).A00(this);
    }
}
