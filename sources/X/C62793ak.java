package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3ak  reason: invalid class name and case insensitive filesystem */
public abstract class C62793ak {
    public final Map mBagOfTags;
    public volatile boolean mCleared;
    public final Set mCloseables;

    public final void clear() {
        this.mCleared = true;
        Map map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                for (Object closeWithRuntimeException : this.mBagOfTags.values()) {
                    closeWithRuntimeException(closeWithRuntimeException);
                }
            }
        }
        Set set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                for (Closeable closeWithRuntimeException2 : this.mCloseables) {
                    closeWithRuntimeException(closeWithRuntimeException2);
                }
            }
        }
        onCleared();
    }

    public void onCleared() {
    }

    public static void closeWithRuntimeException(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void addCloseable(Closeable closeable) {
        Set set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                this.mCloseables.add(closeable);
            }
        }
    }

    public Object getTag(String str) {
        Object obj;
        Map map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            obj = this.mBagOfTags.get(str);
        }
        return obj;
    }

    public Object setTagIfAbsent(String str, Object obj) {
        Object obj2;
        synchronized (this.mBagOfTags) {
            obj2 = this.mBagOfTags.get(str);
            if (obj2 == null) {
                this.mBagOfTags.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.mCleared) {
            closeWithRuntimeException(obj);
        }
        return obj;
    }

    public C62793ak(Closeable... closeableArr) {
        this.mBagOfTags = AnonymousClass0wJ.A0y();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.mCloseables = linkedHashSet;
        this.mCleared = false;
        C18240wQ.A1Q(linkedHashSet, closeableArr);
    }

    public static AnonymousClass23Z A08(C04530Oa r0) {
        return ((C195310c) r0.getValue()).A00;
    }

    public C62793ak() {
        this.mBagOfTags = AnonymousClass0wJ.A0y();
        this.mCloseables = new LinkedHashSet();
        this.mCleared = false;
    }
}
