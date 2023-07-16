package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.0be  reason: invalid class name and case insensitive filesystem */
public abstract class C07520be implements C05130Ra {
    public static final C11910l0 A03 = new C11910l0();
    public C14090on A00;
    public Handler A01;
    public final Context A02;

    public final Handler A00() {
        Handler handler = this.A01;
        if (handler != null) {
            return handler;
        }
        HandlerThread handlerThread = new HandlerThread("Fixie", 10);
        C13820oM.A00(handlerThread);
        handlerThread.start();
        Handler handler2 = new Handler(handlerThread.getLooper());
        this.A01 = handler2;
        return handler2;
    }

    public C14090on A01() {
        return new C07510bd(this, new C07500bc(this));
    }

    public C07520be(Context context) {
        this.A02 = context;
    }
}
