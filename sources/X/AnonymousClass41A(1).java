package X;

/* renamed from: X.41A  reason: invalid class name */
public final class AnonymousClass41A implements McB {
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Number number = (Number) obj;
        number.getClass();
        return Long.valueOf((long) Math.floor(((Math.pow(2.0d, (double) Math.min(number.intValue() + 1, 10)) - 1.0d) / 2.0d) * 1000.0d));
    }
}
