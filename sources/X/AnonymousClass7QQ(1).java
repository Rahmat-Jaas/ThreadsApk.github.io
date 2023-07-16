package X;

import android.view.Choreographer;

/* renamed from: X.7QQ  reason: invalid class name */
public final class AnonymousClass7QQ implements Choreographer.FrameCallback {
    public final /* synthetic */ AnonymousClass0YY A00;
    public final /* synthetic */ AnonymousClass8s9 A01;

    public AnonymousClass7QQ(AnonymousClass0YY r1, AnonymousClass8s9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void doFrame(long j) {
        Object obj;
        AnonymousClass8s9 r2 = this.A01;
        try {
            obj = this.A00.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            obj = new AnonymousClass0OW(th);
        }
        r2.resumeWith(obj);
    }
}
