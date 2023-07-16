package X;

import com.facebook.pando.IPandoGraphQLService;

/* renamed from: X.7yx  reason: invalid class name and case insensitive filesystem */
public final class C135147yx implements Runnable {
    public final IPandoGraphQLService.Token A00;

    public final void run() {
        this.A00.cancel();
    }

    public C135147yx(IPandoGraphQLService.Token token) {
        this.A00 = token;
    }
}
