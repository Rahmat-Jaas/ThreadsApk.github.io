package com.instagram.util.offline;

import X.AnonymousClass0TJ;
import X.AnonymousClass3WS;
import X.C001300p;
import X.C04220Ms;
import X.C05030Qo;
import X.C10300i6;
import X.C10600ic;
import X.C18190wL;
import X.C18200wM;
import X.C24845Daz;
import X.C25425DlP;
import X.C25489DmY;
import X.C25666Dpn;
import X.C28161tl;
import X.C34372Jh;
import X.C63803iN;
import X.C691847d;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainFeedBackgroundPrefetchJobService extends BackgroundPrefetchJobService {
    public final String A01() {
        return "MainFeedBackgroundPrefetchJobService";
    }

    public final void A03(C25489DmY dmY, C24845Daz daz) {
        dmY.A01(daz, true, false);
    }

    public final void A02() {
        C10300i6 A0W = C18200wM.A0W(this);
        Long l = 0L;
        if ((A0W instanceof UserSession) && C691847d.A05()) {
            UserSession A02 = C05030Qo.A02(A0W);
            if (C63803iN.A0E(AnonymousClass0TJ.A05, A0W, 36318913471320900L)) {
                C28161tl A01 = AnonymousClass3WS.A01(A02);
                C04220Ms.A0B(A01, 1);
                List A00 = C34372Jh.A00(A01);
                C04220Ms.A0B(A00, 0);
                ArrayList A0s = C18200wM.A0s(A00);
                C001300p.A0x(A0s);
                Iterator it = A0s.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    long A08 = C18190wL.A08(it.next());
                    if (A08 > C18200wM.A0A()) {
                        if (Long.valueOf(A08) != null) {
                            l = Long.valueOf((A08 * 1000) - System.currentTimeMillis());
                        }
                    }
                }
            }
        }
        long longValue = l.longValue();
        if (longValue > 0) {
            Class<?> cls = getClass();
            C04220Ms.A0B(cls, 2);
            C25666Dpn.A00(C10600ic.A00).A02(new C25425DlP(cls, R.id.feed_background_prefetch_job_scheduler_id, 1, 0, longValue, true, false));
        }
    }
}
