package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7oI  reason: invalid class name */
public final class AnonymousClass7oI implements C143998hf {
    public volatile Set A00 = null;
    public volatile Set A01 = Collections.newSetFromMap(new ConcurrentHashMap());

    public final /* bridge */ /* synthetic */ Object get() {
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    this.A00 = Collections.newSetFromMap(new ConcurrentHashMap());
                    for (C143998hf r0 : this.A01) {
                        this.A00.add(r0.get());
                    }
                    this.A01 = null;
                }
            }
        }
        return Collections.unmodifiableSet(this.A00);
    }

    public AnonymousClass7oI(Collection collection) {
        this.A01.addAll(collection);
    }
}
