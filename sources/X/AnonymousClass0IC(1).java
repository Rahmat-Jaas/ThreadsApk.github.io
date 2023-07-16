package X;

/* renamed from: X.0IC  reason: invalid class name */
public final class AnonymousClass0IC implements Runnable {
    public final /* synthetic */ AnonymousClass0PY A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Throwable A04;

    public AnonymousClass0IC(AnonymousClass0PY r1, Integer num, String str, String str2, Throwable th) {
        this.A00 = r1;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = num;
        this.A04 = th;
    }

    public final void run() {
        try {
            C015207b r2 = new C015207b();
            r2.put("soft_error_category", this.A03);
            r2.put("soft_error_message", this.A02);
            r2.put("sample_rate", Integer.toString(this.A01.intValue()));
            this.A00.A05.get();
        } catch (Throwable unused) {
        }
    }
}
