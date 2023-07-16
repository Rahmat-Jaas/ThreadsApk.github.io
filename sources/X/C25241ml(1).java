package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1ml  reason: invalid class name and case insensitive filesystem */
public final class C25241ml extends AnonymousClass0gG {
    public final /* synthetic */ C28181to A00;
    public final /* synthetic */ AnonymousClass3Ie A01;
    public final /* synthetic */ AnonymousClass3Ie A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ boolean A04;

    public final void run() {
        AnonymousClass3Ie r0 = this.A01;
        UserSession userSession = this.A03;
        boolean z = this.A04;
        r0.A04(userSession, z);
        AnonymousClass3Ie r02 = this.A02;
        if (r02 != null) {
            r02.A04(userSession, z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25241ml(C28181to r2, AnonymousClass3Ie r3, AnonymousClass3Ie r4, UserSession userSession, boolean z) {
        super(64142938);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = userSession;
        this.A04 = z;
        this.A02 = r4;
    }
}
