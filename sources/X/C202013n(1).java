package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.maps.ui.IgStaticMapView;

/* renamed from: X.13n  reason: invalid class name and case insensitive filesystem */
public final class C202013n extends M5O {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public IgStaticMapView A05;
    public ImageView A06;
    public LinearLayout A07;
    public TextView A08;

    public C202013n(View view) {
        super(view);
        this.A05 = (IgStaticMapView) view.requireViewById(R.id.login_activity_map_view);
        this.A00 = AnonymousClass0wJ.A0L(view, R.id.left_button);
        this.A01 = AnonymousClass0wJ.A0L(view, R.id.right_button);
        this.A07 = (LinearLayout) view.requireViewById(R.id.button_container);
        this.A08 = AnonymousClass0wJ.A0L(view, R.id.confirm_text);
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.title_message);
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.body_message_timestamp);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.body_message_device);
        this.A06 = C18200wM.A0J(view, R.id.status_icon);
    }
}
