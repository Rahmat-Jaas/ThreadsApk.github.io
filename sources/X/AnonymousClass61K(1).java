package X;

import ch.boye.httpclientandroidlib.HttpStatus;

/* renamed from: X.61K  reason: invalid class name */
public final class AnonymousClass61K extends AnonymousClass0gG {
    public Runnable A00;
    public boolean A01;

    public final synchronized void run() {
        this.A01 = true;
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
    }

    public AnonymousClass61K() {
        super(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE);
    }
}
