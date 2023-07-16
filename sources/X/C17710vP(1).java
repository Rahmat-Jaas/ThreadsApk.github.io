package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.0vP  reason: invalid class name and case insensitive filesystem */
public final class C17710vP extends LinkedHashMap<Integer, String> {
    public C17710vP() {
        super(100);
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 100) {
            return true;
        }
        return false;
    }
}
