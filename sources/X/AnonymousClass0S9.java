package X;

/* renamed from: X.0S9  reason: invalid class name */
public final class AnonymousClass0S9 {
    public static volatile AnonymousClass0S8 A00;

    public static Runnable A00(Runnable runnable, String str, int i) {
        Integer num;
        AnonymousClass0S8 r0 = A00;
        if (r0 == null || (num = r0.BI0()) == null) {
            num = AnonymousClass006.A0C;
        }
        if (num == AnonymousClass006.A0C || runnable == null || (runnable instanceof AnonymousClass0S6)) {
            return runnable;
        }
        return new C07680bu(runnable, str, i);
    }
}
