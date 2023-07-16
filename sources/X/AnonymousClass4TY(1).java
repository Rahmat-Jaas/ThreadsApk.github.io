package X;

import java.util.Comparator;

/* renamed from: X.4TY  reason: invalid class name */
public final class AnonymousClass4TY implements Comparator {
    public static final AnonymousClass4TY A00 = new AnonymousClass4TY();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j = ((AnonymousClass18L) ((C81224nO) obj)).A00;
        long j2 = ((AnonymousClass18L) ((C81224nO) obj2)).A00;
        if (j < j2) {
            return -1;
        }
        return C18180wK.A1X((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
    }
}
