package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7JN  reason: invalid class name */
public abstract class AnonymousClass7JN {
    public final C41259M6w database;
    public final AtomicBoolean lock = C18230wP.A0w();
    public final C04530Oa stmt$delegate = C86114wI.A0w(this, 10);

    public AnonymousClass7JN(C41259M6w m6w) {
        C04220Ms.A0B(m6w, 1);
        this.database = m6w;
    }

    public static void A00(C28170Ezf ezf, C89885Hk r4, long j) {
        ezf.AAa(1, j);
        ezf.AAi(2, r4.A06);
        ezf.AAi(3, r4.A08);
        ezf.AAi(4, r4.A09);
        ezf.AAa(5, r4.A03);
        ezf.AAa(6, r4.A00);
        ezf.AAi(7, r4.A07);
        ezf.AAa(8, r4.A04);
        ezf.AAa(9, r4.A01);
        ezf.AAi(10, r4.A05);
    }

    public abstract String createQuery();

    public void release(C28051Exi exi) {
        C04220Ms.A0B(exi, 0);
        if (exi == getStmt()) {
            this.lock.set(false);
        }
    }

    private final C28051Exi getStmt(boolean z) {
        if (z) {
            return getStmt();
        }
        return createNewStatement();
    }

    public void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    /* access modifiers changed from: private */
    public final C28051Exi createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    public C28051Exi acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    private final C28051Exi getStmt() {
        return (C28051Exi) this.stmt$delegate.getValue();
    }
}
