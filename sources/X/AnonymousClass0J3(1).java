package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0J3  reason: invalid class name */
public final class AnonymousClass0J3 implements Handler.Callback {
    public static Field A03;
    public Handler.Callback A00;
    public final Handler A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    static {
        try {
            Field declaredField = Handler.class.getDeclaredField("mCallback");
            A03 = declaredField;
            declaredField.setAccessible(true);
        } catch (Error | Exception unused) {
        }
    }

    public final boolean handleMessage(Message message) {
        List<AnonymousClass0J5> list = AnonymousClass0J4.A00;
        boolean z = false;
        if (!list.isEmpty()) {
            for (AnonymousClass0J5 r2 : list) {
                if (r2.C7K(message, this, "ActivityThread") && !z) {
                    r2.A4w(message, this, "ActivityThread");
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        Handler.Callback callback = this.A00;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }

    public AnonymousClass0J3(Handler handler) {
        this.A01 = handler;
        AnonymousClass0J2 r2 = new AnonymousClass0J2(this);
        if (handler.getLooper() == Looper.myLooper()) {
            r2.run();
        } else {
            new Handler(handler.getLooper()).post(r2);
        }
    }
}
