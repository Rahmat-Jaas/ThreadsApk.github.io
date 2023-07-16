package X;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Ex  reason: invalid class name and case insensitive filesystem */
public final class C03210Ex implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        List list;
        ArrayList<AnonymousClass013> arrayList;
        boolean z;
        int i = message.what;
        C03220Ey r0 = C03220Ey.A06;
        if (r0 == null) {
            return false;
        }
        try {
            synchronized (r0.A01) {
                try {
                    list = (List) r0.A00.get(i);
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                    throw th;
                }
            }
            if (list == null) {
                return false;
            }
            synchronized (list) {
                try {
                    arrayList = new ArrayList<>(list);
                } catch (Throwable th2) {
                    while (true) {
                        th = th2;
                        break;
                    }
                }
            }
            if (arrayList.size() == 0) {
                arrayList.size();
                return false;
            }
            arrayList.size();
            boolean z2 = true;
            for (AnonymousClass013 r02 : arrayList) {
                r02.A00.A02.A01((Object) null, i, message);
                z2 = false;
            }
            Handler.Callback callback = C03220Ey.A04;
            if (callback == null) {
                z = false;
            } else {
                z = callback.handleMessage(message);
            }
            return z | z2;
        } catch (Error | RuntimeException e) {
            C03220Ey.A09.A05("Perform hook for what %d had an error.", e, new Object[]{Integer.valueOf(message.what)}, 6, 0);
            return false;
        }
        throw th;
    }
}
