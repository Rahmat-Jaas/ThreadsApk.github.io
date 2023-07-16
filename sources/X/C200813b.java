package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.13b  reason: invalid class name and case insensitive filesystem */
public final class C200813b extends M5O {
    public final IgTextView A00;
    public final CircularImageView A01;
    public final C19577Ayd A02;
    public final View A03;
    public final ImageView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C200813b(ViewGroup viewGroup) {
        super(viewGroup);
        C04220Ms.A0B(viewGroup, 1);
        this.A03 = AnonymousClass0wJ.A0I(viewGroup, R.id.row_container);
        this.A00 = (IgTextView) AnonymousClass0wJ.A0I(viewGroup, R.id.row_title);
        this.A01 = (CircularImageView) AnonymousClass0wJ.A0I(viewGroup, R.id.row_primary_image);
        this.A02 = C18190wL.A0U(viewGroup, R.id.row_user_stacked_avatar);
        this.A04 = (ImageView) AnonymousClass0wJ.A0I(viewGroup, R.id.row_end_image);
    }
}
