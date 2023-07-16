package X;

import java.util.Comparator;

/* renamed from: X.4Td  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73624Td implements Comparator {
    public static final /* synthetic */ C73624Td A00 = new C73624Td();

    public final int compare(Object obj, Object obj2) {
        return ((AnonymousClass3HO) obj).A00.name().replace('_', ' ').compareTo(((AnonymousClass3HO) obj2).A00.name().replace('_', ' '));
    }
}
