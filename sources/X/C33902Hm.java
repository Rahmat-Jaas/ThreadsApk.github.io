package X;

import com.instagram.service.session.UserSession;
import java.io.IOException;

/* renamed from: X.2Hm  reason: invalid class name and case insensitive filesystem */
public final class C33902Hm {
    public static final Object A00(AnonymousClass601 r5, C63893iY r6) {
        try {
            C62123Xf parseFromJson = C34652Kj.parseFromJson(C18180wK.A0L(C63893iY.A0D(r6, AnonymousClass0wJ.A1Y(r6, r5) ? 1 : 0)));
            if (parseFromJson != null) {
                C10300i6 A0F = C63913ic.A0F(r5);
                if (!(A0F instanceof UserSession)) {
                    C30967GcS.A02("IGBloksActionChallengeShowCheckpointImpl", "Attempt to render user avatar node outside of logged in user context");
                } else if (parseFromJson.A04) {
                    C38040KHr.A01.CWx(new AnonymousClass45U(A0F, new AnonymousClass3VJ()));
                    return null;
                } else {
                    AnonymousClass3GW r0 = AnonymousClass3GW.A00;
                    C04220Ms.A06(r0);
                    C697449w A00 = r0.A00(A0F);
                    if (A00 != null) {
                        A00.A02(C63913ic.A05(r5), parseFromJson);
                        return null;
                    }
                }
            }
            return null;
        } catch (IOException unused) {
            C30967GcS.A02("IGBloksActionChallengeShowCheckpointImpl", "Unable to parse challenge.");
            return null;
        }
    }
}
