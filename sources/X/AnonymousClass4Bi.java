package X;

import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.4Bi  reason: invalid class name */
public final class AnonymousClass4Bi implements C82514pp {
    public final /* synthetic */ C25691of A00;

    public AnonymousClass4Bi(C25691of r1) {
        this.A00 = r1;
    }

    public final void onSuccess() {
        C25691of r2 = this.A00;
        IgdsButton igdsButton = r2.A00;
        if (igdsButton != null) {
            igdsButton.setLoading(false);
            C18180wK.A14(r2);
            return;
        }
        C04220Ms.A0E("ctaButton");
        throw null;
    }
}
