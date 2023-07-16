package X;

import java.util.Set;

/* renamed from: X.4Qb  reason: invalid class name and case insensitive filesystem */
public final class C72874Qb implements Runnable {
    public final /* synthetic */ AnonymousClass5IZ A00;
    public final /* synthetic */ Set A01;

    public C72874Qb(AnonymousClass5IZ r1, Set set) {
        this.A01 = set;
        this.A00 = r1;
    }

    public final void run() {
        Set<AnonymousClass0YY> set = this.A01;
        AnonymousClass5IZ r2 = this.A00;
        for (AnonymousClass0YY invoke : set) {
            invoke.invoke(r2);
        }
    }
}
