package X;

import android.content.Context;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;

/* renamed from: X.61e  reason: invalid class name and case insensitive filesystem */
public final class C955561e extends C12140lP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C145188k1 A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C955561e(Context context, C145188k1 r8, UserSession userSession, List list) {
        super("ig_story_predict_and_cache", 1109658103, 5, false, false);
        this.A03 = list;
        this.A01 = r8;
        this.A02 = userSession;
        this.A00 = context;
    }

    public final void loggedRun() {
        long j;
        List list = this.A03;
        C145188k1 r9 = this.A01;
        UserSession userSession = this.A02;
        Context context = this.A00;
        C1200878l r5 = (C1200878l) AnonymousClass6H0.A00(userSession).A02.getValue();
        C126027eS r3 = new C126027eS(userSession);
        if (r3.B2R() > 0) {
            long j2 = r5.A00.getLong(C1200878l.A00(r5, "last_prediction_time"), -1);
            long A09 = C18240wQ.A09(j2);
            C07810cE r13 = r3.A00;
            if (r13 != null) {
                r13.At2(36605692732838351L);
            }
            if (j2 != -1) {
                if (r13 != null) {
                    j = r13.At2(36605692732838351L);
                } else {
                    j = 0;
                }
                if (A09 <= j * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) {
                    return;
                }
            }
            AnonymousClass5Id CX7 = AnonymousClass6XE.A00.A00(context, r3, userSession, true).CX7(r9, (Long) null, list);
            if (CX7.A02) {
                Object obj = CX7.A00;
                if (C18190wL.A1a((Collection) obj)) {
                    List list2 = (List) obj;
                    ((Number) ((Pair) list2.get(0)).A01).doubleValue();
                    r5.A01("prediction_score", (float) C86124wJ.A00(((Pair) list2.get(0)).A01));
                    r5.A02("last_prediction_time", System.currentTimeMillis());
                }
            }
        }
    }
}
