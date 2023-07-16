package X;

import android.util.SparseArray;

/* renamed from: X.0lq  reason: invalid class name and case insensitive filesystem */
public final class C12400lq extends SparseArray implements AnonymousClass0Jz {
    public boolean A00 = false;

    private void A00() {
        if (this.A00) {
            throw new IllegalStateException("Map is locked from modifications");
        }
    }

    public final void append(int i, Object obj) {
        A00();
        super.append(i, obj);
    }

    public final void clear() {
        A00();
        super.clear();
    }

    public final void put(int i, Object obj) {
        A00();
        super.put(i, obj);
    }

    public final void remove(int i) {
        A00();
        super.remove(i);
    }

    public final void removeAt(int i) {
        A00();
        super.removeAt(i);
    }

    public final void setValueAt(int i, Object obj) {
        A00();
        super.setValueAt(i, obj);
    }
}
