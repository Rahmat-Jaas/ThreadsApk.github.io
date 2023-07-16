package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.13T  reason: invalid class name */
public final class AnonymousClass13T extends M5O {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnonymousClass13T(View view) {
        super(view);
        IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0I(view, R.id.section_icon);
        IgTextView igTextView = (IgTextView) AnonymousClass0wJ.A0I(view, R.id.title);
        IgTextView igTextView2 = (IgTextView) AnonymousClass0wJ.A0I(view, R.id.subtitle);
        AnonymousClass0wJ.A1Q(igImageView, igTextView);
        C04220Ms.A0B(igTextView2, 4);
        this.A00 = view;
        this.A03 = igImageView;
        this.A02 = igTextView;
        this.A01 = igTextView2;
    }
}
