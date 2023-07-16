package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.60v  reason: invalid class name and case insensitive filesystem */
public final class C954660v extends AnonymousClass0gG {
    public final /* synthetic */ C131547sN A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C954660v(C131547sN r3) {
        super(4, 4, false, false);
        this.A00 = r3;
    }

    public final void run() {
        C131547sN r3;
        try {
            r3 = this.A00;
            AnonymousClass760 r6 = r3.A00;
            UserSession userSession = r6.A02;
            if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36311109514297742L)) {
                HashMap A0y = AnonymousClass0wJ.A0y();
                ArrayList<C145298kG> A0v = AnonymousClass0wJ.A0v();
                Context context = r6.A00;
                A0v.add(new C127957i7(new C112986qW(context, userSession)));
                A0v.add(new AnonymousClass7i4(context));
                A0v.add(new AnonymousClass7i6(context, AnonymousClass7i6.A02));
                A0v.add(new AnonymousClass7i5(context));
                for (C145298kG r1 : A0v) {
                    String BaB = r1.BaB();
                    if (A0y.containsKey(BaB)) {
                        String A0L = AnonymousClass00U.A0L("Provider keys must be unique. Conflict on key: ", BaB);
                        AnonymousClass0JW r12 = AnonymousClass0JV.A00;
                        if (r12.isLoggable(6)) {
                            r12.wtf("BigFootReporter", A0L);
                        }
                    } else {
                        Map CXv = r1.CXv();
                        if (CXv != null && !CXv.isEmpty()) {
                            A0y.put(BaB, CXv);
                        }
                    }
                }
                if (!A0y.isEmpty()) {
                    USLEBaseShape0S0000000 A0I = C18180wK.A0I(C86104wH.A0K(r6.A01, "big_foot_reporter_event"), 89);
                    if (AnonymousClass0wJ.A1U(A0I)) {
                        JSONObject A0y2 = C18230wP.A0y();
                        Iterator A0z = AnonymousClass0wJ.A0z(A0y);
                        while (A0z.hasNext()) {
                            Map.Entry A0o = C18180wK.A0o(A0z);
                            String A0p = C18200wM.A0p(A0o);
                            JSONObject A0y3 = C18230wP.A0y();
                            Iterator A0z2 = AnonymousClass0wJ.A0z((Map) A0o.getValue());
                            while (A0z2.hasNext()) {
                                Map.Entry A0o2 = C18180wK.A0o(A0z2);
                                A0y3.put(C18200wM.A0p(A0o2), ((C143518gs) A0o2.getValue()).CxG());
                            }
                            A0y2.put(A0p, A0y3);
                        }
                        A0I.A0T("provider_data", A0y2.toString());
                        A0I.A0Q(I17.A00(725), C18180wK.A0X());
                        A0I.Bb4();
                    }
                }
            }
        } catch (JSONException e) {
            AnonymousClass0LU.A0I("IG4ABigFootReporter", "Json parsing failed for the big foot event", e);
        } catch (Throwable th) {
            C104776cM r4 = this.A00.A01;
            C08350dD A002 = C08360dF.A00();
            AnonymousClass0wJ.A12(A002.A00.edit(), "bigfoot_reporter_last_foreground_measurement", System.currentTimeMillis());
            r4.A00.set(false);
            throw th;
        }
        C104776cM r42 = r3.A01;
        C08350dD A003 = C08360dF.A00();
        AnonymousClass0wJ.A12(A003.A00.edit(), "bigfoot_reporter_last_foreground_measurement", System.currentTimeMillis());
        r42.A00.set(false);
    }
}
