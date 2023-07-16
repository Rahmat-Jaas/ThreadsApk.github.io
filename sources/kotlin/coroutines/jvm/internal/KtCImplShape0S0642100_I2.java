package kotlin.coroutines.jvm.internal;

import X.C146958n9;
import X.C27236EjA;
import com.facebook.forker.Process;
import com.instagram.barcelona.feed.data.BarcelonaFeedCache;
import com.instagram.mainfeed.network.FlashFeedCache;
import java.util.List;

public class KtCImplShape0S0642100_I2 extends C27236EjA {
    public int A00;
    public int A01;
    public long A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;

    public final Object invokeSuspend(Object obj) {
        int i = this.A0D;
        this.A07 = obj;
        this.A01 |= Process.WAIT_RESULT_TIMEOUT;
        Object obj2 = this.A08;
        if (i != 0) {
            return ((FlashFeedCache) obj2).A01((Integer) null, (List) null, this, 0, 0, false, false, false, false);
        }
        return ((BarcelonaFeedCache) obj2).A05((Integer) null, (List) null, this, 0, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0642100_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A0D = i;
        this.A08 = obj;
    }
}
