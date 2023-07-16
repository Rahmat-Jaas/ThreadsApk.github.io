package X;

import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1iI  reason: invalid class name */
public final class AnonymousClass1iI extends C63873iU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C27531sf A03;

    public AnonymousClass1iI(C27531sf r1, int i, int i2, int i3) {
        this.A03 = r1;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final void onFail(AnonymousClass3XX r5) {
        int A032 = C14030oh.A03(48529031);
        super.onFail(r5);
        C27531sf r2 = this.A03;
        if (r2.A02 != null) {
            C63553hn.A08(r2.A02, C18230wP.A0l(r2));
        }
        C14030oh.A0A(-321612410, A032);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(-513585876);
        ProgressButton progressButton = this.A03.A03;
        if (progressButton != null) {
            progressButton.setShowProgressBar(false);
        }
        C14030oh.A0A(-87620714, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(-356655461);
        ProgressButton progressButton = this.A03.A03;
        if (progressButton != null) {
            progressButton.setShowProgressBar(true);
        }
        C14030oh.A0A(440653426, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-1684424777);
        AnonymousClass1T6 r9 = (AnonymousClass1T6) obj;
        int A033 = C14030oh.A03(1304917226);
        C27531sf r6 = this.A03;
        RegFlowExtras regFlowExtras = r6.A00;
        boolean z = r9.A00;
        regFlowExtras.A0r = z;
        int i = this.A02;
        int i2 = this.A01;
        int i3 = this.A00;
        if (z) {
            regFlowExtras.A0u = r9.A01;
            regFlowExtras.A03 = new UserBirthDate(i, i2, i3);
            r6.A03(AnonymousClass2AT.A07.A00);
        } else {
            r6.A04(regFlowExtras.A0J, i, i2, i3);
        }
        C14030oh.A0A(1859221810, A033);
        C14030oh.A0A(-1342631179, A032);
    }
}
