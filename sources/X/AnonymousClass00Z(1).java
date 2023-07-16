package X;

import java.util.List;

/* renamed from: X.00Z  reason: invalid class name */
public class AnonymousClass00Z extends C000300e {
    public static final int A0n(List list, int i) {
        if (new AnonymousClass8bH(0, list.size() - 1).A06(i)) {
            return (list.size() - 1) - i;
        }
        StringBuilder sb = new StringBuilder("Element index ");
        sb.append(i);
        sb.append(" must be in range [");
        sb.append(new AnonymousClass8bH(0, list.size() - 1));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
