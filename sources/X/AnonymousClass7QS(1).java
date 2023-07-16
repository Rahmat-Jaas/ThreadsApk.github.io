package X;

import android.view.Choreographer;

/* renamed from: X.7QS  reason: invalid class name */
public final class AnonymousClass7QS implements Choreographer.FrameCallback {
    public final /* synthetic */ AnonymousClass7WD A00;
    public final /* synthetic */ AnonymousClass0YY A01;
    public final /* synthetic */ AnonymousClass8s9 A02;

    public AnonymousClass7QS(AnonymousClass7WD r1, AnonymousClass0YY r2, AnonymousClass8s9 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void doFrame(long j) {
        Object obj;
        AnonymousClass8s9 r2 = this.A02;
        try {
            obj = this.A01.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            obj = new AnonymousClass0OW(th);
        }
        r2.resumeWith(obj);
    }
}
