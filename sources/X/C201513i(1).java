package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.13i  reason: invalid class name and case insensitive filesystem */
public final class C201513i extends M5O {
    public ImageView A00;
    public CircularImageView A01;
    public final View A02;
    public final ViewGroup A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final /* synthetic */ AnonymousClass115 A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C201513i(ViewGroup viewGroup, AnonymousClass115 r3) {
        super(viewGroup);
        C04220Ms.A0B(viewGroup, 2);
        this.A06 = r3;
        this.A03 = viewGroup;
        this.A04 = (IgTextView) AnonymousClass0wJ.A0J(viewGroup, R.id.row_user_username);
        this.A05 = (IgTextView) AnonymousClass0wJ.A0J(viewGroup, R.id.row_user_info);
        this.A01 = (CircularImageView) AnonymousClass0wJ.A0J(viewGroup, R.id.user_profile_pic);
        this.A00 = (ImageView) AnonymousClass0wJ.A0J(viewGroup, R.id.close_friends_icon);
        this.A02 = AnonymousClass0wJ.A0K(viewGroup, R.id.row_user_message);
    }
}
