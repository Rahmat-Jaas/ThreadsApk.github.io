package X;

import android.content.IntentSender;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.417  reason: invalid class name */
public final class AnonymousClass417 implements C143878hS {
    public final /* synthetic */ FragmentActivity A00;

    public AnonymousClass417(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    public final void BrG(AnonymousClass7HU r5) {
        C04220Ms.A0B(r5, 0);
        if (!r5.A0C()) {
            Exception A03 = r5.A03();
            if (A03 instanceof C93185l9) {
                try {
                    ((C32102Af) A03).A00.A00(this.A00, 23107);
                } catch (IntentSender.SendIntentException e) {
                    C10450iM.A07("AymhErrorSaveSmartLock", e);
                }
            }
        }
    }
}
