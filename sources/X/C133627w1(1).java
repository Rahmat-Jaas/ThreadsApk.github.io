package X;

import com.google.common.util.concurrent.SettableFuture;
import com.instagram.service.session.UserSession;

/* renamed from: X.7w1  reason: invalid class name and case insensitive filesystem */
public final class C133627w1 implements C39690KyC {
    public final /* synthetic */ SettableFuture A00;
    public final /* synthetic */ UserSession A01;

    public C133627w1(SettableFuture settableFuture, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = settableFuture;
    }

    public final void onFailure(String str) {
        AnonymousClass0LU.A0B("Papaya", "Failed to load app-module.");
        this.A00.set(C18180wK.A0X());
    }

    public final void onSuccess() {
        UserSession userSession = this.A01;
        userSession.isStopped();
        this.A00.set(C18240wQ.A0X(userSession.isStopped()));
    }
}
