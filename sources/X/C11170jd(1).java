package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.0jd  reason: invalid class name and case insensitive filesystem */
public final class C11170jd implements C83334rD {
    public final /* synthetic */ SettableFuture A00;
    public final /* synthetic */ C11160jc A01;

    public C11170jd(SettableFuture settableFuture, C11160jc r2) {
        this.A01 = r2;
        this.A00 = settableFuture;
    }

    /* renamed from: A00 */
    public final void onSuccess(C143338gY r2) {
        this.A00.set(r2);
    }

    public final void onFailure(Throwable th) {
        if (th == null) {
            th = new Throwable();
        }
        this.A00.setException(th);
    }
}
