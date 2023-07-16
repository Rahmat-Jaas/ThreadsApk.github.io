package X;

import java.util.Set;

/* renamed from: X.81K  reason: invalid class name */
public final /* synthetic */ class AnonymousClass81K implements Runnable {
    public final AnonymousClass7oI A00;
    public final C143998hf A01;

    public AnonymousClass81K(AnonymousClass7oI r1, C143998hf r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        Set set;
        Object obj;
        AnonymousClass7oI r2 = this.A00;
        C143998hf r1 = this.A01;
        synchronized (r2) {
            if (r2.A00 == null) {
                set = r2.A01;
                obj = r1;
            } else {
                set = r2.A00;
                obj = r1.get();
            }
            set.add(obj);
        }
    }
}
