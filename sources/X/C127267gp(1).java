package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.7gp  reason: invalid class name and case insensitive filesystem */
public final class C127267gp implements C27927Evd {
    public final RectF A00 = C86134wK.A0E();
    public final RectF A01 = C86134wK.A0E();
    public final ViewGroup A02;
    public final ImageView A03;
    public final C25812DsR A04;

    public C127267gp(ViewGroup viewGroup) {
        this.A02 = viewGroup;
        ImageView imageView = new ImageView(viewGroup.getContext());
        this.A03 = imageView;
        viewGroup.getResources().getDimensionPixelSize(R.dimen._self_serve_linking_artist_avatar_search_size);
        imageView.setVisibility(8);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        viewGroup.addView(imageView);
        C25812DsR A0O = C86134wK.A0O();
        A0O.A06 = true;
        A0O.A0D(C25757DrU.A01(40.0d, 7.0d));
        this.A04 = A0O;
    }

    public final void CLf(C25812DsR dsR) {
    }

    public final void CLh(C25812DsR dsR) {
    }

    public final void CLi(C25812DsR dsR) {
        C25812DsR dsR2 = dsR;
        C04220Ms.A0B(dsR2, 0);
        double d = (double) ((float) dsR2.A09.A00);
        float A002 = (float) C98896Hi.A00(d, 0.0d, 1.0d, 1.0d, 0.05d);
        RectF rectF = this.A01;
        float centerX = rectF.centerX();
        RectF rectF2 = this.A00;
        float A003 = (float) C98896Hi.A00(d, 0.0d, 1.0d, 0.0d, (double) (centerX - rectF2.centerX()));
        ImageView imageView = this.A03;
        imageView.setVisibility(0);
        imageView.setTranslationX(A003);
        imageView.setTranslationY((float) C98896Hi.A00(d, 0.0d, 1.0d, 0.0d, (double) (rectF.centerY() - rectF2.centerY())));
        imageView.setScaleX(A002);
        imageView.setScaleY(A002);
    }

    public final void CLg(C25812DsR dsR) {
        ViewGroup viewGroup = this.A02;
        ImageView imageView = this.A03;
        viewGroup.removeView(imageView);
        imageView.setVisibility(8);
        imageView.setImageBitmap((Bitmap) null);
        this.A04.A0F(this);
    }
}
