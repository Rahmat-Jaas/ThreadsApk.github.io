package X;

import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.4MF  reason: invalid class name */
public final class AnonymousClass4MF implements AnonymousClass4tH {
    public final /* synthetic */ C22841am A00;

    public final void Bl8() {
    }

    public final boolean Bvc(int i) {
        boolean z = false;
        if (i == 2) {
            z = true;
            C22841am r1 = this.A00;
            ProgressButton progressButton = r1.A01;
            if (progressButton == null) {
                C04220Ms.A0E("nextButton");
                throw null;
            } else if (progressButton.isEnabled()) {
                C22841am.A00(r1);
            }
        }
        return z;
    }

    public final void CAo() {
    }

    public final void CRi() {
    }

    public final void CSm() {
    }

    public AnonymousClass4MF(C22841am r1) {
        this.A00 = r1;
    }
}
