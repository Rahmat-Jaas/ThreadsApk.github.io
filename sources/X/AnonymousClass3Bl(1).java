package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.3Bl  reason: invalid class name */
public final class AnonymousClass3Bl {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final C19577Ayd A03;

    public AnonymousClass3Bl(View view) {
        this.A00 = AnonymousClass0wJ.A0K(view, R.id.row_fb_user_container);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(view, R.id.fb_label);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.options_label);
        View requireViewById = view.requireViewById(R.id.selectable_user_row_checkbox_view_stub);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewStub");
        C19577Ayd ayd = new C19577Ayd((ViewStub) requireViewById);
        this.A03 = ayd;
        ayd.A02 = AnonymousClass4AI.A00;
        ayd.A09(0);
    }
}
