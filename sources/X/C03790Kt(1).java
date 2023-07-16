package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;

/* renamed from: X.0Kt  reason: invalid class name and case insensitive filesystem */
public final class C03790Kt {
    public static Runnable A00;

    public static void A01(String str) {
        AnonymousClass0IS r4 = new AnonymousClass0IS(str);
        if (!AnonymousClass0MI.A08() || AnonymousClass0IR.A01() == null) {
            synchronized (C03790Kt.class) {
                if (A00 != null) {
                    Log.e("AppExitUtil", AnonymousClass00U.A0L("Killing process silently, bypassing error reporting: ", r4.getMessage()), new Throwable());
                    A00.run();
                }
            }
            Process.killProcess(Process.myPid());
            return;
        }
        Log.e("AppExitUtil", "App in foreground, sending exception to ExceptionHandlerManager");
        Thread currentThread = Thread.currentThread();
        synchronized (AnonymousClass0IR.class) {
            AnonymousClass0IR.A00().uncaughtException(currentThread, r4);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public static void A00(String str) {
        Handler handler = new Handler(Looper.getMainLooper());
        C03780Ks r2 = new C03780Ks(str);
        if (!AnonymousClass0MI.A08()) {
            handler.postDelayed(r2, 30000);
        }
        AnonymousClass0MI.A04(new AnonymousClass0Jl(handler, r2), false);
    }
}
