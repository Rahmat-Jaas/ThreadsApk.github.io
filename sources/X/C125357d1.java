package X;

/* renamed from: X.7d1  reason: invalid class name and case insensitive filesystem */
public final class C125357d1 implements C145778l4 {
    public final String getName() {
        return "swap";
    }

    public final void update() {
    }

    public final void ACJ(C113166qr r4, StackTraceElement[] stackTraceElementArr) {
        if (r4 instanceof AnonymousClass5EC) {
            AnonymousClass5EC r42 = (AnonymousClass5EC) r4;
            AnonymousClass09o.A00();
            long[] jArr = AnonymousClass09o.A01;
            r42.A02 = jArr[23];
            r42.A01 = jArr[24];
            r42.A00 = jArr[14];
            String[] strArr = C020909s.A00;
            long[] jArr2 = new long[strArr.length];
            C03620Ka.A02("/proc/self/status", jArr2, strArr);
            r42.A03 = jArr2[7];
        }
    }
}
