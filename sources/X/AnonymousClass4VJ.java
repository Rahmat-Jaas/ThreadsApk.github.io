package X;

import java.util.List;
import org.json.JSONObject;

/* renamed from: X.4VJ  reason: invalid class name */
public final class AnonymousClass4VJ implements C83974sI {
    public final /* synthetic */ AnonymousClass3YH A00;

    public final void ByF(String str, Throwable th) {
        C04220Ms.A0B(str, 0);
        AnonymousClass3Y2 r2 = this.A00.A05;
        AnonymousClass3Y2.A01(AnonymousClass28H.ERROR, AnonymousClass3Y2.A00("report_adid_failure", str, th, (List) null), r2);
    }

    public AnonymousClass4VJ(AnonymousClass3YH r1) {
        this.A00 = r1;
    }

    public final void onSuccess() {
        AnonymousClass3Y2 r3 = this.A00.A05;
        JSONObject A0y = C18230wP.A0y();
        A0y.put("event_name", "report_adid_success");
        AnonymousClass3Y2.A01(AnonymousClass28H.INFO, C18190wL.A0n(A0y), r3);
    }
}
