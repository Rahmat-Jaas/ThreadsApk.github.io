package X;

import android.os.Process;
import com.facebook.backtrace.NativeBacktrace;

/* renamed from: X.7d6  reason: invalid class name */
public final class AnonymousClass7d6 implements C145778l4 {
    public static final String[] A00 = {"android.", "java.", "dalvik.", "com.android.", "sun."};

    public final String getName() {
        return "native_stack";
    }

    public final void update() {
    }

    public final void ACJ(C113166qr r6, StackTraceElement[] stackTraceElementArr) {
        if ((r6 instanceof AnonymousClass5EC) && stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            AnonymousClass5EC r62 = (AnonymousClass5EC) r6;
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            if (stackTraceElement.isNativeMethod()) {
                String className = stackTraceElement.getClassName();
                String[] strArr = A00;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (!className.startsWith(strArr[i])) {
                        i++;
                    } else {
                        return;
                    }
                }
                r62.A06 = NativeBacktrace.getBacktrace((long) Process.myPid(), 32, true);
            }
        }
    }
}
