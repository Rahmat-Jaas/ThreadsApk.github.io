package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.6qd  reason: invalid class name and case insensitive filesystem */
public final class C113046qd {
    public Executor A00;
    public Executor A01;
    public String A02;
    public final List A03 = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final List A04 = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final List A05 = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final List A06 = Collections.synchronizedList(AnonymousClass0wJ.A0v());
    public final List A07 = Collections.synchronizedList(AnonymousClass0wJ.A0v());

    public final synchronized void A00(String str) {
        if (!AnonymousClass7CU.A00(str)) {
            String str2 = this.A02;
            if (str2 == null || !str2.equals(str)) {
                this.A02 = str;
                this.A00.execute(new C135217z4(this));
            }
        }
    }

    public C113046qd(Executor executor, Executor executor2) {
        this.A00 = executor;
        this.A01 = executor2;
    }
}
