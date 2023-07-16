package X;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.09N  reason: invalid class name */
public final class AnonymousClass09N {
    public Queue A00;

    public final synchronized String toString() {
        String obj;
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (AnonymousClass09M r0 : this.A00) {
                if (i >= 0) {
                    sb.append(r0.toString());
                    sb.append(10);
                }
                i++;
            }
            obj = sb.toString();
        }
        return obj;
    }

    public AnonymousClass09N() {
        synchronized (this) {
            this.A00 = new LinkedList();
        }
    }
}
