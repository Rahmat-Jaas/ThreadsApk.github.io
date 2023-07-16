package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.nux.cal.model.DpActionContent;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1h5  reason: invalid class name */
public final class AnonymousClass1h5 extends C63873iU {
    public final /* synthetic */ C63463hW A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ C10300i6 A03;
    public final /* synthetic */ C67073yp A04;

    public AnonymousClass1h5(Context context, C10300i6 r2, C63463hW r3, C67073yp r4, long j) {
        this.A00 = r3;
        this.A04 = r4;
        this.A02 = context;
        this.A03 = r2;
        this.A01 = j;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-1992796198);
        AnonymousClass1T8 r13 = (AnonymousClass1T8) obj;
        int A033 = C14030oh.A03(-2116716578);
        C67073yp r1 = this.A04;
        List list = r13.A01;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        C27601sp r7 = new C27601sp(r1, list);
        Context context = this.A02;
        C10300i6 r6 = this.A03;
        C27551sh.A00(context, r6, r1, (C82834qL) null).A07(r7);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A01;
        C04220Ms.A0B(r6, 0);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) null, r6), "ig_dynamic_onboarding_updated_steps_from_server"), 1172);
        AnonymousClass0wJ.A1B(A0I, A002, A003);
        C63683i7.A05(A0I);
        C63683i7.A04(A0I);
        C18180wK.A1A(A0I, A003);
        A0I.A0S("update_duration", Long.valueOf(elapsedRealtime));
        AnonymousClass269.A05(A0I);
        C18180wK.A19(A0I);
        C63683i7.A09(A0I, r6);
        A0I.Bb4();
        C38040KHr kHr = C38040KHr.A01;
        StringBuilder A0r = C18200wM.A0r();
        int i = 0;
        while (true) {
            List list2 = r7.A01;
            if (i >= list2.size()) {
                break;
            }
            int i2 = i + 1;
            A0r.append(i2);
            A0r.append(". ");
            A0r.append(((Enum) ((AnonymousClass3IX) list2.get(i)).A00).name());
            A0r.append(" ");
            i = i2;
        }
        kHr.CWx(new AnonymousClass45T(A0r.toString()));
        if ((r6 instanceof UserSession) && r13.A00 != null && C63173fJ.A05(AnonymousClass0TJ.A06, 18296277213118619L)) {
            C05030Qo.A02(r6).A04(DpActionContent.class, r13.A00);
        }
        C14030oh.A0A(-1220803538, A033);
        C14030oh.A0A(-142374870, A032);
    }
}
