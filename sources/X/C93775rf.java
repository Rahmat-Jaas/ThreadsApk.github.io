package X;

import com.google.common.collect.IDxAIteratorShape25S0200000_2_I2;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.5rf  reason: invalid class name and case insensitive filesystem */
public final class C93775rf extends C39113Kn0<E> {
    public final /* synthetic */ Set A00;
    public final /* synthetic */ Set A01;

    public C93775rf(Set set, Set set2) {
        this.A00 = set;
        this.A01 = set2;
    }

    public final C1366783w A00() {
        return new IDxAIteratorShape25S0200000_2_I2(this);
    }

    public final boolean contains(Object obj) {
        if (!this.A00.contains(obj) || !this.A01.contains(obj)) {
            return false;
        }
        return true;
    }

    public final boolean containsAll(Collection collection) {
        if (!this.A00.containsAll(collection) || !this.A01.containsAll(collection)) {
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new IDxAIteratorShape25S0200000_2_I2(this);
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.A00) {
            if (this.A01.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
