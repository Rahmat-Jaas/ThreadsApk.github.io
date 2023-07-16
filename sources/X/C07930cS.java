package X;

import java.util.HashSet;

/* renamed from: X.0cS  reason: invalid class name and case insensitive filesystem */
public final class C07930cS implements C05580Uh {
    public final boolean AKV(HashSet hashSet, String[] strArr) {
        for (String contains : strArr) {
            if (hashSet.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
