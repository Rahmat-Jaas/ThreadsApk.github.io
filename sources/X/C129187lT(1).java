package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7lT  reason: invalid class name and case insensitive filesystem */
public final class C129187lT implements C143748hF {
    public final /* synthetic */ C113286r5 A00;
    public final /* synthetic */ C143818hM A01;
    public final /* synthetic */ AnonymousClass8eK A02;
    public final /* synthetic */ C113426rN A03;

    public C129187lT(C113286r5 r1, C143818hM r2, AnonymousClass8eK r3, C113426rN r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void Br9(Status status) {
        Exception r1;
        if (status.A01 <= 0) {
            C113286r5 r5 = this.A00;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) r5;
            C13320nQ.A07(!basePendingResult.A0C, "Result has already been consumed.");
            try {
                if (!basePendingResult.A0A.await(0, timeUnit)) {
                    basePendingResult.A08(Status.A0A);
                }
            } catch (InterruptedException unused) {
                basePendingResult.A08(Status.A08);
            }
            C13320nQ.A07(C18180wK.A1W((basePendingResult.A0A.getCount() > 0 ? 1 : (basePendingResult.A0A.getCount() == 0 ? 0 : -1))), "Result is not ready.");
            C82014ow A002 = BasePendingResult.A00(basePendingResult);
            C113426rN r2 = this.A03;
            r2.A00.A0B(this.A01.AEV(A002));
            return;
        }
        C113426rN r22 = this.A03;
        if (status.A02 != null) {
            r1 = new C93185l9(status);
        } else {
            r1 = new C32102Af(status);
        }
        r22.A00.A0A(r1);
    }
}
