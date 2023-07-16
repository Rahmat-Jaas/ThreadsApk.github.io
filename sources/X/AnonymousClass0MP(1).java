package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0MP  reason: invalid class name */
public class AnonymousClass0MP {
    public static int A01 = 1;
    public static final Set A02 = new HashSet();
    public final String A00;

    public AnonymousClass0MP(int i, String str, boolean z) {
        this.A00 = str;
        A01 = Math.max(A01, i + 1);
        if (!z) {
            A02.add(str);
        }
    }
}
