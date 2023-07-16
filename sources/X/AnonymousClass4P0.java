package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.4P0  reason: invalid class name */
public final class AnonymousClass4P0 implements Runnable {
    public final /* synthetic */ AnonymousClass1dV A00;

    public AnonymousClass4P0(AnonymousClass1dV r1) {
        this.A00 = r1;
    }

    public final void run() {
        C25745DrH A0b;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null && (A0b = C18220wO.A0b(activity)) != null) {
            A0b.A0G(false);
        }
    }
}
