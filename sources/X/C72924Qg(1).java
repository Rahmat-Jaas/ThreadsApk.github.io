package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.4Qg  reason: invalid class name and case insensitive filesystem */
public final class C72924Qg implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ CRI A01;

    public C72924Qg(View view, CRI cri) {
        this.A01 = cri;
        this.A00 = view;
    }

    public final void run() {
        FragmentActivity activity = this.A01.getActivity();
        if (activity != null) {
            View view = this.A00;
            C25553Dnn A002 = AnonymousClass4DS.A00(activity, 2131821765);
            C18250wR.A0r(view, A002);
            A002.A04(AnonymousClass3TC.A06);
            A002.A0B = true;
            A002.A00 = 5000;
            A002.A0A = true;
            C18200wM.A1Q(A002);
        }
    }
}
