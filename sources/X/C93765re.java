package X;

import com.google.common.collect.IDxAIteratorShape25S0200000_2_I2;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5re  reason: invalid class name and case insensitive filesystem */
public final class C93765re extends C39113Kn0<E> {
    public final /* synthetic */ Set A00;
    public final /* synthetic */ Set A01;

    public C93765re(Set set, Set set2) {
        this.A00 = set;
        this.A01 = set2;
    }

    public final C1366783w A00() {
        return new IDxAIteratorShape25S0200000_2_I2(this);
    }

    public final boolean contains(Object obj) {
        if (!this.A00.contains(obj) || this.A01.contains(obj)) {
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.A01.containsAll(this.A00);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new IDxAIteratorShape25S0200000_2_I2(this);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.A00) {
            if (!this.A01.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
