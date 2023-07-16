package X;

import java.util.Arrays;

/* renamed from: X.0qd  reason: invalid class name and case insensitive filesystem */
public final class C15050qd extends UnsatisfiedLinkError {
    public C15050qd(Throwable th, String str) {
        super(AnonymousClass00U.A0d("APK was built for a different platform. Supported ABIs: ", Arrays.toString(C15000qX.A00()), " error: ", str));
        initCause(th);
    }
}
