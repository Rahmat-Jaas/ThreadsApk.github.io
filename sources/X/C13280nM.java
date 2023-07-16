package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0nM  reason: invalid class name and case insensitive filesystem */
public abstract class C13280nM implements C10390iG {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public final void A01(C10270i0 r2) {
        r2.getClass();
        this.A00.addIfAbsent(r2);
    }

    public final void onAppBackgrounded() {
        int A03 = C14030oh.A03(-1012753951);
        C10300i6 A032 = AnonymousClass0RA.A0C.A03(this);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C10270i0) it.next()).Bks(A032);
        }
        C14030oh.A0A(-1763174486, A03);
    }

    public final void onAppForegrounded() {
        int A03 = C14030oh.A03(-1603879052);
        C10300i6 A032 = AnonymousClass0RA.A0C.A03(this);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C10270i0) it.next()).Bku(A032);
        }
        C14030oh.A0A(-973715436, A03);
    }
}
