package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape91S0100000_I2_71;

/* renamed from: X.1nn  reason: invalid class name and case insensitive filesystem */
public final class C25521nn extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25521nn(C697249u r7) {
        super("ODIRPurgeJob", 1998884021, 3, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        UserSession userSession = this.A00.A06;
        C04220Ms.A0B(userSession, 0);
        AnonymousClass3AU r4 = (AnonymousClass3AU) userSession.A01(AnonymousClass3AU.class, new KtLambdaShape91S0100000_I2_71(userSession, 8));
        if (C63803iN.A0E(AnonymousClass0TJ.A05, r4.A02, 36327048138008424L)) {
            try {
                AnonymousClass32U r0 = new AnonymousClass32U(ITF.A00());
                long j = r4.A01;
                long j2 = r4.A00;
                long A07 = C18190wL.A07();
                r0.A00.purgeInstallReferrer(A07 - j, A07 - j2);
            } catch (Exception unused) {
            }
        }
    }
}
