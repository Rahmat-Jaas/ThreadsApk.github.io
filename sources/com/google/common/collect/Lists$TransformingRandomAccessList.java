package com.google.common.collect;

import X.C93785rg;
import X.McB;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Lists$TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final List fromList;
    public final McB function;

    public final void clear() {
        this.fromList.clear();
    }

    public final Object get(int i) {
        return this.function.apply(this.fromList.get(i));
    }

    public final boolean isEmpty() {
        return this.fromList.isEmpty();
    }

    public final ListIterator listIterator(int i) {
        return new C93785rg(this, this.fromList.listIterator(i));
    }

    public final Object remove(int i) {
        return this.function.apply(this.fromList.remove(i));
    }

    public final int size() {
        return this.fromList.size();
    }

    public Lists$TransformingRandomAccessList(McB mcB, List list) {
        list.getClass();
        this.fromList = list;
        this.function = mcB;
    }

    public final Iterator iterator() {
        return listIterator();
    }
}
