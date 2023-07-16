package X;

import com.facebook.pando.IPandoGraphQLService;

/* renamed from: X.7gI  reason: invalid class name and case insensitive filesystem */
public final class C126977gI implements IPandoGraphQLService.Token {
    public final IPandoGraphQLService.Token A00;
    public final C145218k7 strongCallbacks;

    public final void cancel() {
        IPandoGraphQLService.Token token = this.A00;
        if (token != null) {
            token.cancel();
        }
    }

    public C126977gI(C145218k7 r1, IPandoGraphQLService.Token token) {
        this.A00 = token;
        this.strongCallbacks = r1;
    }
}
