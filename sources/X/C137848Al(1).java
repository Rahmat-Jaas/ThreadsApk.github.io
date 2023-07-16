package X;

import com.facebook.forker.Process;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.fbpay.logging.LoggingPolicy;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl", f = "ECPRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {1005}, m = "awaitCheckoutSetupMutationInternal", n = {"this", "sessionId", "productId", "loggingPolicy", "isPrefetchNeeded", "isAvailableCall"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
/* renamed from: X.8Al  reason: invalid class name and case insensitive filesystem */
public final class C137848Al extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ ECPRepositoryImpl A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137848Al(ECPRepositoryImpl eCPRepositoryImpl, C146958n9 r2) {
        super(r2);
        this.A08 = eCPRepositoryImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ECPRepositoryImpl.A01(this.A08, (LoggingPolicy) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, this, false, false);
    }
}
