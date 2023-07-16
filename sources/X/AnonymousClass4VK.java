package X;

import java.util.List;

/* renamed from: X.4VK  reason: invalid class name */
public final class AnonymousClass4VK implements C83974sI {
    public final /* synthetic */ List A00;
    public final /* synthetic */ AnonymousClass3YH A01;

    public final void ByF(String str, Throwable th) {
        C04220Ms.A0B(str, 0);
        AnonymousClass3Y2 r2 = this.A01.A05;
        AnonymousClass3Y2.A01(AnonymousClass28H.ERROR, AnonymousClass3Y2.A00("report_events_failure", str, th, this.A00), r2);
    }

    public AnonymousClass4VK(List list, AnonymousClass3YH r2) {
        this.A01 = r2;
        this.A00 = list;
    }

    public final void onSuccess() {
        AnonymousClass3Y2 r3 = this.A01.A05;
        List list = this.A00;
        C04220Ms.A0B(list, 1);
        AnonymousClass3Y2.A01(AnonymousClass28H.INFO, AnonymousClass3Y2.A00("report_events_success", (String) null, (Throwable) null, list), r3);
    }
}
