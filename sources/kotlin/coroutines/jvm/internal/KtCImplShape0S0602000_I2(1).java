package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.C146958n9;
import X.C24393DKj;
import X.C27236EjA;
import X.C41800MdR;
import androidx.paging.PagingDataDiffer;
import com.facebook.forker.Process;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.instagram.direct.headmojis.effects.HeadmojiEffectRenderer;
import java.util.List;

public class KtCImplShape0S0602000_I2 extends C27236EjA {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;

    public final Object invokeSuspend(Object obj) {
        int i = this.A08;
        this.A06 = obj;
        this.A01 |= Process.WAIT_RESULT_TIMEOUT;
        switch (i) {
            case 0:
                return ((PagingDataDiffer) this.A07).A03((C41800MdR) null, (C41800MdR) null, this, (AnonymousClass0ZU) null, 0);
            case 1:
                return ((ECPRepositoryImpl) this.A07).A06((ECPHandler) null, (ECPPaymentRequest) null, (TransactionInfo) null, (String) null, (List) null, this, false);
            default:
                return HeadmojiEffectRenderer.A01((C24393DKj) null, (HeadmojiEffectRenderer) this.A07, (String) null, this, (AnonymousClass0YY) null, (AnonymousClass0YY) null, 0, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0602000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A08 = i;
        this.A07 = obj;
    }
}
