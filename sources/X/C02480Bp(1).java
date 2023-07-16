package X;

import android.database.Observable;

/* renamed from: X.0Bp  reason: invalid class name and case insensitive filesystem */
public final class C02480Bp extends Observable {
    public final void A00() {
        synchronized (this.mObservers) {
            int size = this.mObservers.size();
            for (int i = 0; i < size; i++) {
                ((C02500Br) this.mObservers.get(i)).Bm8();
            }
        }
    }

    public final void A01() {
        synchronized (this.mObservers) {
            int size = this.mObservers.size();
            for (int i = 0; i < size; i++) {
                ((C02500Br) this.mObservers.get(i)).Bzt();
            }
        }
    }
}
