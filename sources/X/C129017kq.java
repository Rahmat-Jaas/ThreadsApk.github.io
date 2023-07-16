package X;

import java.util.Observable;

/* renamed from: X.7kq  reason: invalid class name and case insensitive filesystem */
public class C129017kq implements C145388kQ {
    public final Observable A00 = new C1377189t();

    public void A01(Object obj) {
        this.A00.notifyObservers(obj);
    }

    public void A6o(C143718hC r3) {
        this.A00.addObserver(new AnonymousClass84W(r3));
    }

    public final void AHZ(C143718hC r3) {
        this.A00.deleteObserver(new AnonymousClass84W(r3));
    }
}
