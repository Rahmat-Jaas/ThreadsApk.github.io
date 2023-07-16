package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.3Cr  reason: invalid class name and case insensitive filesystem */
public final class C57843Cr {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final IgImageView A05;

    public C57843Cr(View view) {
        this.A00 = C18190wL.A0A(view);
        this.A03 = (IgImageView) AnonymousClass0wJ.A0I(view, R.id.cover_image);
        this.A02 = (TextView) AnonymousClass0wJ.A0I(view, R.id.title);
        this.A01 = (TextView) AnonymousClass0wJ.A0I(view, R.id.subtitle);
        this.A04 = (IgImageView) AnonymousClass0wJ.A0I(view, R.id.primary_avatar);
        this.A05 = (IgImageView) AnonymousClass0wJ.A0I(view, R.id.secondary_avatar);
    }
}
