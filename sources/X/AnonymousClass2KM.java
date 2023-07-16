package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.2KM  reason: invalid class name */
public final class AnonymousClass2KM {
    public static final void A00(View view, String str, String str2, boolean z) {
        View requireViewById = view.requireViewById(R.id.primary_text);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.widget.TextView");
        C18220wO.A17(C18200wM.A0K(view, R.id.secondary_text), str2, 0, C18200wM.A03((TextView) requireViewById, str, z ? 1 : 0));
    }
}
