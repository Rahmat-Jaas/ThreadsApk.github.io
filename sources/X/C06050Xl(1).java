package X;

import com.facebook.errorreporting.lacrima.common.asl.aslnative.AppStateLoggerNative;

/* renamed from: X.0Xl  reason: invalid class name and case insensitive filesystem */
public final class C06050Xl implements AnonymousClass0IT {
    public final void handleUncaughtException(Thread thread, Throwable th, AnonymousClass0IN r3) {
        AppStateLoggerNative.disableSelfSigkillHandlers();
    }
}
