package kotlin.coroutines.jvm.internal;

import X.C1201779c;
import X.C143188gF;
import X.C146958n9;
import X.C27236EjA;
import androidx.paging.PagingDataDiffer;
import com.facebook.forker.Process;
import com.instagram.barcelona.feed.data.BarcelonaFeedCache;
import java.util.List;

public class KtCImplShape0S0711000_I2 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public final int A09;

    public final Object invokeSuspend(Object obj) {
        int i = this.A09;
        this.A06 = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        if (i != 0) {
            return ((BarcelonaFeedCache) this.A07).A06((String) null, (String) null, (List) null, this, false);
        }
        return PagingDataDiffer.A00((C143188gF) null, (C1201779c) null, (C1201779c) null, (PagingDataDiffer) this.A07, (List) null, this, 0, 0, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0711000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A09 = i;
        this.A07 = obj;
    }
}
