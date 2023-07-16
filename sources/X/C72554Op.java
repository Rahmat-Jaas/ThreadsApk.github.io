package X;

import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.4Op  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72554Op implements Runnable {
    public final /* synthetic */ C28666FWp A00;

    public /* synthetic */ C72554Op(C28666FWp fWp) {
        this.A00 = fWp;
    }

    public final void run() {
        C28666FWp fWp = this.A00;
        View view = fWp.mView;
        if (view != null) {
            C18200wM.A1D(view, R.id.scrubber_spinner);
            fWp.mView.requireViewById(R.id.scrubber_content).setVisibility(0);
        }
    }
}
