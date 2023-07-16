package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.switchbutton.IgSwitch;

/* renamed from: X.13g  reason: invalid class name and case insensitive filesystem */
public final class C201313g extends M5O {
    public final View A00;
    public final ImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgSwitch A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C201313g(ViewGroup viewGroup) {
        super(viewGroup);
        C04220Ms.A0B(viewGroup, 1);
        this.A00 = AnonymousClass0wJ.A0I(viewGroup, R.id.row_container);
        this.A03 = (IgTextView) AnonymousClass0wJ.A0I(viewGroup, R.id.row_title);
        this.A02 = (IgTextView) AnonymousClass0wJ.A0I(viewGroup, R.id.row_subtitle);
        this.A04 = (CircularImageView) AnonymousClass0wJ.A0I(viewGroup, R.id.row_primary_image);
        this.A01 = (ImageView) AnonymousClass0wJ.A0I(viewGroup, R.id.row_end_image);
        this.A05 = (IgSwitch) AnonymousClass0wJ.A0I(viewGroup, R.id.row_toggle);
    }
}
