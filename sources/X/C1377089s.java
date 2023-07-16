package X;

import java.util.HashSet;

/* renamed from: X.89s  reason: invalid class name and case insensitive filesystem */
public final class C1377089s extends HashSet<String> {
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.contains(obj);
        }
        return false;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return super.remove(obj);
        }
        return false;
    }

    public C1377089s() {
        add("silent_push");
        add("badge_silent_push");
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
