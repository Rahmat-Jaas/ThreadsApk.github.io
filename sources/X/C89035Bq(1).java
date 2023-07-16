package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.5Bq  reason: invalid class name and case insensitive filesystem */
public final class C89035Bq extends M5O {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgImageButton A02;
    public final /* synthetic */ AnonymousClass5A7 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89035Bq(View view, AnonymousClass5A7 r3) {
        super(view);
        this.A03 = r3;
        this.A02 = (IgImageButton) AnonymousClass0wJ.A0I(view, R.id.preview_clip_thumbnail);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0I(view, R.id.preview_clip_play_count);
        this.A00 = (IgLinearLayout) AnonymousClass0wJ.A0I(view, R.id.play_count_container);
    }
}
