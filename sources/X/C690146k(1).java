package X;

import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.46k  reason: invalid class name and case insensitive filesystem */
public final class C690146k implements C82394pY {
    public final /* synthetic */ AnonymousClass1aA A00;

    public C690146k(AnonymousClass1aA r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C14030oh.A03(1497918525);
        int A032 = C14030oh.A03(1774063858);
        AnonymousClass1aA r2 = this.A00;
        C18190wL.A0M(r2).setIsLoading(true);
        r2.A02.setText(((AnonymousClass45I) obj).A00);
        ProgressButton progressButton = r2.A0F;
        if (progressButton != null && progressButton.isEnabled()) {
            r2.A0F.performClick();
        }
        C14030oh.A0A(798680621, A032);
        C14030oh.A0A(1495039326, A03);
    }
}
