package X;

/* renamed from: X.0bu  reason: invalid class name and case insensitive filesystem */
public final class C07680bu extends AnonymousClass0S6 {
    public volatile C05190Ru A00;

    public C07680bu(Runnable runnable, String str, int i) {
        super(runnable);
        if (str != null) {
            C05190Ru A02 = C07650br.A02(str, i);
            A02.close();
            this.A00 = A02;
            return;
        }
        throw new IllegalArgumentException(String.format("%s cannot be null.", new Object[]{"tag"}));
    }
}
