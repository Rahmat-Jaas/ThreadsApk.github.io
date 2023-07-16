package X;

import com.instagram.barcelona.R;
import com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar;

/* renamed from: X.7zk  reason: invalid class name and case insensitive filesystem */
public final class C135597zk implements Runnable {
    public final /* synthetic */ AnonymousClass5xH A00;

    public C135597zk(AnonymousClass5xH r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass5xH r4 = this.A00;
        InstantExperiencesAutofillBar instantExperiencesAutofillBar = r4.A01.A00;
        if (instantExperiencesAutofillBar != null) {
            C25553Dnn dnn = new C25553Dnn(r4.getActivity(), new C26431qd((CharSequence) AnonymousClass0wJ.A0B(r4).getString(2131829119)));
            dnn.A03(D0f.ABOVE_ANCHOR);
            dnn.A02(instantExperiencesAutofillBar, 0, AnonymousClass0wJ.A0B(r4).getDimensionPixelSize(R.dimen.iab_history_item_load_more_button_padding_top), true);
            dnn.A04(AnonymousClass3TC.A06);
            dnn.A0A = true;
            dnn.A00().A05();
            r4.A04 = true;
            AnonymousClass7H6 A01 = AnonymousClass7H6.A01(r4.A03);
            AnonymousClass7H6.A00(r4.A00);
            synchronized (A01.A00) {
            }
        }
    }
}
