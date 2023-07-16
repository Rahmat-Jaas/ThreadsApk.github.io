package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.51G  reason: invalid class name */
public final class AnonymousClass51G extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0A5[] A02 = {C86134wK.A0x(AnonymousClass51G.class, "icon", "getIcon()Lcom/facebookpay/widget/style/Icon;")};
    public ImageView A00;
    public final C86024w9 A01 = AnonymousClass86W.A01(this, 53);

    public AnonymousClass51G(Context context) {
        super(context, (AttributeSet) null, 0);
        addView(LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_right_add_on_icon, this, false));
        setFocusable(false);
        setImportantForAccessibility(2);
        this.A00 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.list_cell_right_add_on_icon);
    }

    public final AnonymousClass697 getIcon() {
        return (AnonymousClass697) C86114wI.A0i(this, this.A01, A02, 0);
    }

    public final void setIcon(AnonymousClass697 r4) {
        C86114wI.A1L(this, r4, this.A01, A02, 0);
    }
}
