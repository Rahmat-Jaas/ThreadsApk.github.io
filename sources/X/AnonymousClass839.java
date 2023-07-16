package X;

import com.fbpay.logging.FBPayLoggerData;

/* renamed from: X.839  reason: invalid class name */
public final class AnonymousClass839 implements Runnable {
    public final /* synthetic */ C104616c4 A00;
    public final /* synthetic */ C121597Gy A01;
    public final /* synthetic */ AnonymousClass583 A02;
    public final /* synthetic */ C145348kM A03;
    public final /* synthetic */ C107266gT A04;
    public final /* synthetic */ C120967Dk A05;

    public AnonymousClass839(C121597Gy r1, C104616c4 r2, AnonymousClass583 r3, C145348kM r4, C107266gT r5, C120967Dk r6) {
        this.A02 = r3;
        this.A00 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = r1;
        this.A05 = r6;
    }

    public final void run() {
        AnonymousClass583 r4 = this.A02;
        M5J A0H = C86114wI.A0H(r4.A06.A04(this.A00, (FBPayLoggerData) C18240wQ.A0D(this.A04.A01, "logger_data")), r4, 6);
        A0H.A0E(C86164wN.A0O(A0H, this, 15));
    }
}
