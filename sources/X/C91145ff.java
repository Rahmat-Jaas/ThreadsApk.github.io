package X;

import com.facebook.rsys.log.gen.CallSummaryInfo;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.5ff  reason: invalid class name and case insensitive filesystem */
public final class C91145ff extends LogPersistenceProxy {
    public C1195675x A00;
    public ITF A01;
    public ExecutorService A02;

    public final void deleteCallSummaryLog(String str) {
        C04220Ms.A0B(str, 0);
        C1195675x r2 = this.A00;
        r2.A01.execute(new C1358480j(r2, str));
    }

    public C91145ff() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C04220Ms.A06(newSingleThreadExecutor);
        this.A02 = newSingleThreadExecutor;
        ITF A002 = ITF.A00();
        this.A01 = A002;
        this.A00 = new C1195675x(A002, newSingleThreadExecutor);
    }

    public final void writeCallSummaryLog(CallSummaryInfo callSummaryInfo, String str) {
        AnonymousClass0wJ.A1N(callSummaryInfo, str);
        C1195675x r2 = this.A00;
        r2.A01.execute(new MQp(r2, callSummaryInfo, str));
    }
}
