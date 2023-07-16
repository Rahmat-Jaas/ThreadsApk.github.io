package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;

/* renamed from: X.41n  reason: invalid class name */
public final class AnonymousClass41n implements C82034oy {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ ViewGroup A03;
    public final /* synthetic */ C22771Zk A04;
    public final /* synthetic */ boolean A05;

    public AnonymousClass41n(ViewGroup viewGroup, C22771Zk r2, int i, int i2, int i3, boolean z) {
        this.A01 = i;
        this.A04 = r2;
        this.A03 = viewGroup;
        this.A05 = z;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final void configureActionBar(AnonymousClass4u2 r7) {
        C04220Ms.A0B(r7, 0);
        r7.CtT(true);
        int i = this.A01;
        C22771Zk r4 = this.A04;
        r7.Cjt(AnonymousClass0wJ.A0X(r4.A07), R.layout.event_details_actionbar_title, 0, i);
        View requireViewById = this.A03.requireViewById(R.id.event_actionbar_title);
        int i2 = this.A02;
        int i3 = this.A00;
        TextView textView = (TextView) requireViewById;
        C18200wM.A15(r4.requireContext(), textView, i2);
        textView.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
        if (this.A05) {
            C25764Drc A0K = C18240wQ.A0K();
            A0K.A05 = R.drawable.instagram_more_horizontal_outline_24;
            A0K.A04 = 2131830699;
            A0K.A0C = C18190wL.A0H(r4, HttpStatus.SC_PAYMENT_REQUIRED);
            A0K.A07 = 17;
            r7.A7Q(new C25435DlZ(A0K));
        }
    }
}
