package X;

import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.signals.model.SignalMetadata;
import com.facebook.dcp.signals.model.SignalResult;
import com.instagram.service.session.UserSession;

/* renamed from: X.7eO  reason: invalid class name and case insensitive filesystem */
public final class C125987eO implements C143328gX {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ Object ADZ(SignalMetadata signalMetadata) {
        long j = AnonymousClass3Zs.A03(this.A00).A01(D2R.A1P).getLong(C28174Ezk.A00(92), 0);
        if (j == 0) {
            return AnonymousClass0ZV.A00;
        }
        return C18180wK.A0n(new SignalResult((DcpContext) null, signalMetadata.A0B, (String) null, (String) null, AnonymousClass4WK.A0O(C18180wK.A0p("1800001", Long.valueOf(j))), AnonymousClass4WJ.A0A(), AnonymousClass4WJ.A0A(), AnonymousClass4WJ.A0A(), 0));
    }

    public C125987eO(UserSession userSession) {
        this.A00 = userSession;
    }
}
