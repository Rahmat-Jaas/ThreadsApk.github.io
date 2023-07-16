package X;

import com.facebook.backtrace.NativeBacktrace;

/* renamed from: X.7d3  reason: invalid class name and case insensitive filesystem */
public final class C125377d3 implements C145778l4 {
    public int A00 = -1;

    public final String getName() {
        return "render_thread_stack";
    }

    public final void ACJ(C113166qr r5, StackTraceElement[] stackTraceElementArr) {
        if ((r5 instanceof AnonymousClass5EC) && this.A00 != -1 && stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            AnonymousClass5EC r52 = (AnonymousClass5EC) r5;
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            if (stackTraceElement.isNativeMethod() && "nSyncAndDrawFrame".equals(stackTraceElement.getMethodName())) {
                r52.A08 = NativeBacktrace.getBacktrace((long) this.A00, 32, true);
            }
        }
    }

    public final void update() {
        int A002;
        if (this.A00 == -1 && (A002 = AnonymousClass6XH.A00()) >= 0) {
            this.A00 = A002;
        }
    }
}
