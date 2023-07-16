package X;

import android.os.Process;

/* renamed from: X.7d5  reason: invalid class name and case insensitive filesystem */
public final class C125397d5 implements C145778l4 {
    public static C125397d5 A03;
    public final AnonymousClass5EA A00 = new AnonymousClass5EA(Process.myPid());
    public final AnonymousClass5EB A01 = new AnonymousClass5EB();
    public final AnonymousClass5EB A02 = new AnonymousClass5EB(Process.myPid());

    public final String getName() {
        return "procstat";
    }

    public final void ACJ(C113166qr r2, StackTraceElement[] stackTraceElementArr) {
        r2.A0A = this.A02.A01();
        r2.A09 = this.A01.A01();
        r2.A0B = this.A00.A01();
    }

    public final void update() {
        this.A02.A02();
        this.A01.A02();
        this.A00.A02();
    }
}
