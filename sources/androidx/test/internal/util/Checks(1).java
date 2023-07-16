package androidx.test.internal.util;

import X.AnonymousClass0wJ;
import X.C18180wK;
import android.os.StrictMode;
import androidx.test.internal.platform.ThreadChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

public final class Checks {
    public static final ThreadChecker A00;

    static {
        ThreadChecker threadChecker;
        Class<ThreadChecker> cls = ThreadChecker.class;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator<S> it = ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            A0v.add(it.next());
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (A0v.isEmpty()) {
            threadChecker = new ThreadChecker() {
            };
        } else if (A0v.size() == 1) {
            threadChecker = (ThreadChecker) A0v.get(0);
        } else {
            throw C18180wK.A0a(String.format("Found more than one %s implementations.", new Object[]{cls.getName()}));
        }
        A00 = threadChecker;
    }
}
