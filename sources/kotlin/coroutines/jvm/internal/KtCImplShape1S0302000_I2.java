package kotlin.coroutines.jvm.internal;

import X.C146958n9;
import X.C27236EjA;
import com.facebook.forker.Process;
import com.instagram.barcelona.feed.data.BarcelonaFeedCacheRoom;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester;
import java.util.List;

public class KtCImplShape1S0302000_I2 extends C27236EjA {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public final Object invokeSuspend(Object obj) {
        int i = this.A05;
        this.A03 = obj;
        this.A01 |= Process.WAIT_RESULT_TIMEOUT;
        switch (i) {
            case 0:
                return ((BarcelonaFeedCacheRoom) this.A04).A00((Integer) null, (List) null, this, 0, 0, false);
            case 1:
                return ((IGTVDraftsRepository) this.A04).AHW(0, this);
            default:
                return ((PlayIntegrityRequester) this.A04).A00((String) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape1S0302000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A04 = obj;
    }
}
