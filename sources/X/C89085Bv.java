package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;
import com.instagram.ui.widget.thumbnailview.ThumbnailView;

/* renamed from: X.5Bv  reason: invalid class name and case insensitive filesystem */
public final class C89085Bv extends M5O {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TouchOverlayView A06;
    public final IgImageView A07;
    public final TransitionCarouselImageView A08;
    public final ClickableTextContainer A09;
    public final ThumbnailView A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89085Bv(View view) {
        super(view);
        C04220Ms.A0B(view, 1);
        this.A07 = (IgImageView) AnonymousClass0wJ.A0I(view, R.id.single_image);
        this.A0A = (ThumbnailView) AnonymousClass0wJ.A0I(view, R.id.thumbnail);
        this.A08 = (TransitionCarouselImageView) AnonymousClass0wJ.A0I(view, R.id.slideshow);
        this.A06 = (TouchOverlayView) AnonymousClass0wJ.A0I(view, R.id.touch_overlay);
        this.A09 = (ClickableTextContainer) AnonymousClass0wJ.A0I(view, R.id.text_container);
        TextView textView = (TextView) AnonymousClass0wJ.A0I(view, R.id.primary_text);
        this.A04 = textView;
        TextView textView2 = (TextView) AnonymousClass0wJ.A0I(view, R.id.secondary_text);
        this.A05 = textView2;
        this.A03 = (TextView) AnonymousClass0wJ.A0I(view, R.id.overlay_text);
        this.A02 = AnonymousClass0wJ.A0I(view, R.id.overlay_gradient);
        this.A00 = AnonymousClass0wJ.A0I(view, R.id.empty_state);
        this.A01 = AnonymousClass0wJ.A0I(view, R.id.media_container);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size);
        AnonymousClass0h8.A04(textView, dimensionPixelSize);
        AnonymousClass0h8.A04(textView2, dimensionPixelSize);
    }
}
