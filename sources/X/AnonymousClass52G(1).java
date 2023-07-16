package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.52G  reason: invalid class name */
public final class AnonymousClass52G extends AnonymousClass00C {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass564 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass52G(FragmentActivity fragmentActivity, AnonymousClass564 r3) {
        super(true);
        this.A00 = fragmentActivity;
        this.A01 = r3;
    }

    public final void A01() {
        String str;
        FragmentActivity fragmentActivity = this.A00;
        Intent A0B = C18230wP.A0B();
        AnonymousClass56X r0 = this.A01.A09;
        if (r0 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        if (r0.A07.A08() == AnonymousClass67R.A03) {
            str = "CANCELED_CARD_VERIFICATION";
        } else {
            str = "CANCELED_CVV_VERIFICATION";
        }
        A0B.putExtra("keyResultEventName", str);
        fragmentActivity.setResult(0, A0B);
        fragmentActivity.finish();
    }
}
