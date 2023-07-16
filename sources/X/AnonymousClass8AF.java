package X;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.8AF  reason: invalid class name */
public final class AnonymousClass8AF<E> extends AnonymousClass8AJ<E> implements RandomAccess {
    public int A00;
    public int A01;
    public final List A02;

    public final void A09(int i, int i2) {
        C120667By.A02(i, i2, this.A02.size());
        this.A01 = i;
        this.A00 = i2 - i;
    }

    public AnonymousClass8AF(List list) {
        this.A02 = list;
    }
}
