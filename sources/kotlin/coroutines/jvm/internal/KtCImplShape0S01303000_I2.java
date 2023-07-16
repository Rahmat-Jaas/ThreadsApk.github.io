package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass67E;
import X.C113226qx;
import X.C114596tY;
import X.C146958n9;
import X.C27236EjA;
import androidx.paging.PageFetcherSnapshot;
import com.facebook.forker.Process;

public class KtCImplShape0S01303000_I2 extends C27236EjA {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public Object A0E;
    public Object A0F;
    public final int A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S01303000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A0G = i;
        this.A07 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A0G;
        this.A06 = obj;
        this.A02 |= Process.WAIT_RESULT_TIMEOUT;
        Object obj2 = this.A07;
        if (i != 0) {
            return PageFetcherSnapshot.A01((C114596tY) null, (AnonymousClass67E) null, (PageFetcherSnapshot) obj2, this);
        }
        return ((C113226qx) obj2).A00(this, (AnonymousClass0YP) null);
    }
}
