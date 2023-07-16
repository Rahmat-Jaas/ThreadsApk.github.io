package X;

import com.android.internal.os.SomeArgs;

/* renamed from: X.0F7  reason: invalid class name */
public final class AnonymousClass0F7 {
    public static boolean A00;

    public static AnonymousClass0QS A00(Object obj) {
        if (!A00) {
            A00 = true;
        }
        try {
            return new AnonymousClass0QS((SomeArgs) obj);
        } catch (ClassCastException | Error e) {
            AnonymousClass0F8.A00.A09(e, "Cannot construct linked SomeArgsWrapper for %s", obj.getClass().getName());
            return null;
        }
    }
}
