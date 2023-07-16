package X;

import android.os.Message;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.systrace.Systrace;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: X.0hm  reason: invalid class name and case insensitive filesystem */
public final class C10130hm extends Thread {
    public static final C10130hm A02;
    public final AnonymousClass0SA A00 = new AnonymousClass0SA(10);
    public final ArrayBlockingQueue A01 = new ArrayBlockingQueue(10);

    static {
        C10130hm r0 = new C10130hm();
        A02 = r0;
        r0.start();
    }

    public C10130hm() {
        super("InflateThread");
    }

    public final void run() {
        int i;
        int intValue;
        while (true) {
            if (!(C10110hk.A05 == null || Process.getThreadPriority(Process.myTid()) == (intValue = C10110hk.A05.intValue()))) {
                Process.setThreadPriority(intValue);
            }
            try {
                C10140hn r5 = (C10140hn) this.A01.take();
                if (Systrace.A0F(1)) {
                    C13930oX.A01("AsyncViewInflation", 923825321);
                }
                try {
                    C10110hk r0 = r5.A04;
                    r0.getClass();
                    View inflate = r0.A01.inflate(r5.A01, (ViewGroup) null, false);
                    r5.A02 = inflate;
                    List<C09200f1> list = r5.A00;
                    if (!(list == null || inflate == null)) {
                        for (C09200f1 r2 : list) {
                            View view = r5.A02;
                            int i2 = r2.A01;
                            ViewStub viewStub = (ViewStub) view.findViewById(i2);
                            if (viewStub != null) {
                                try {
                                    View inflate2 = viewStub.inflate();
                                    inflate2.setVisibility(8);
                                    r2.A00 = inflate2;
                                } catch (IllegalArgumentException e) {
                                    AnonymousClass0LU.A0G("AsyncLayoutInflater", String.format(Locale.US, "Failed to inflate stub %d", new Object[]{Integer.valueOf(i2)}), e);
                                }
                            }
                        }
                    }
                    if (Systrace.A0F(1)) {
                        i = 128023167;
                        C13930oX.A00(i);
                    }
                } catch (RuntimeException e2) {
                    Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread.", e2);
                    if (Systrace.A0F(1)) {
                        i = 1351492381;
                    }
                } catch (Throwable th) {
                    if (Systrace.A0F(1)) {
                        C13930oX.A00(-75009252);
                    }
                    throw th;
                }
                C10110hk r02 = r5.A04;
                r02.getClass();
                Message.obtain(r02.A00, 0, r5).sendToTarget();
            } catch (InterruptedException e3) {
                Log.w("AsyncLayoutInflater", e3);
            }
        }
    }
}
