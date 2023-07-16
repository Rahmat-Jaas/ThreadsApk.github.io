package X;

/* renamed from: X.7d4  reason: invalid class name and case insensitive filesystem */
public final class C125387d4 implements C145778l4 {
    public AnonymousClass5EB A00;
    public AnonymousClass5EA A01;

    public final String getName() {
        return "render_thread";
    }

    public final void ACJ(C113166qr r4, StackTraceElement[] stackTraceElementArr) {
        if (r4 instanceof AnonymousClass5EC) {
            AnonymousClass5EC r42 = (AnonymousClass5EC) r4;
            AnonymousClass5EB r0 = this.A00;
            if (r0 != null) {
                r42.A07 = r0.A01();
            }
            if (stackTraceElementArr.length != 0) {
                StackTraceElement stackTraceElement = stackTraceElementArr[0];
                if (this.A01 == null) {
                    return;
                }
                if ("android.graphics.HardwareRenderer".equals(stackTraceElement.getClassName()) || "android.view.ThreadedRenderer".equals(stackTraceElement.getClassName())) {
                    r42.A09 = this.A01.A01();
                }
            }
        }
    }

    public final void update() {
        int A002;
        if (this.A01 == null && (A002 = AnonymousClass6XH.A00()) >= 0) {
            this.A01 = new AnonymousClass5EA(A002);
            this.A00 = new AnonymousClass5EB(A002);
        }
        AnonymousClass5EA r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass5EB r02 = this.A00;
        if (r02 != null) {
            r02.A02();
        }
    }
}
