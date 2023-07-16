package X;

/* renamed from: X.0IG  reason: invalid class name */
public final class AnonymousClass0IG implements Runnable {
    public final /* synthetic */ AnonymousClass0PY A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Throwable A03;

    public AnonymousClass0IG(AnonymousClass0PY r1, String str, String str2, Throwable th) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = th;
    }

    public final void run() {
        try {
            C015207b r3 = new C015207b();
            r3.put("soft_error_category", this.A01);
            String str = this.A02;
            r3.put("soft_error_message", str);
            this.A00.A05.get();
            new AnonymousClass089(str, this.A03);
        } catch (Throwable unused) {
        }
    }
}
