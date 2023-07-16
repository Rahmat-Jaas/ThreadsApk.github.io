package X;

/* renamed from: X.6XH  reason: invalid class name */
public final class AnonymousClass6XH {
    public static volatile Integer A00;

    public static int A00() {
        int i;
        if (A00 == null) {
            int[] A002 = AnonymousClass6GZ.A00("(RenderThread)");
            if (A002 == null || A002.length != 1) {
                i = -1;
            } else {
                i = A002[0];
            }
            A00 = Integer.valueOf(i);
        }
        return A00.intValue();
    }
}
