package X;

/* renamed from: X.004  reason: invalid class name */
public final class AnonymousClass004 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass098 A01;
    public final /* synthetic */ AnonymousClass00W A02;

    public AnonymousClass004(AnonymousClass098 r1, AnonymousClass00W r2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
    }

    public final void run() {
        AnonymousClass00M r1;
        AnonymousClass098 r4 = this.A01;
        int i = this.A00;
        Object obj = this.A02.A00;
        String str = (String) r4.A05.get(Integer.valueOf(i));
        if (str != null) {
            AnonymousClass00P r0 = (AnonymousClass00P) r4.A07.get(str);
            if (r0 == null || (r1 = r0.A00) == null) {
                r4.A02.remove(str);
                r4.A04.put(str, obj);
            } else if (r4.A00.remove(str)) {
                r1.BjZ(obj);
            }
        }
    }
}
