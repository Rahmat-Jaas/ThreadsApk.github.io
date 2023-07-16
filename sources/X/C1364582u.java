package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar;
import java.util.List;

/* renamed from: X.82u  reason: invalid class name and case insensitive filesystem */
public final class C1364582u implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass7pY A01;
    public final /* synthetic */ C144478iZ A02;
    public final /* synthetic */ List A03;

    public C1364582u(View view, AnonymousClass7pY r2, C144478iZ r3, List list) {
        this.A01 = r2;
        this.A00 = view;
        this.A03 = list;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass7pY r3 = this.A01;
        InstantExperiencesAutofillBar instantExperiencesAutofillBar = r3.A00;
        if (instantExperiencesAutofillBar == null) {
            instantExperiencesAutofillBar = (InstantExperiencesAutofillBar) C18200wM.A0G(this.A00, R.id.instant_experiences_autofill_bar);
            r3.A00 = instantExperiencesAutofillBar;
        }
        instantExperiencesAutofillBar.A00(new AnonymousClass7pW(this), this.A03);
        r3.A02.A00(true);
    }
}
