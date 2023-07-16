package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import kotlin.properties.IDxOPropertyShape345S0200000_2_I2;

/* renamed from: X.51J  reason: invalid class name */
public final class AnonymousClass51J extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0A5[] A05;
    public ImageView A00;
    public ImageView A01;
    public final int A02 = 5;
    public final C86024w9 A03 = AnonymousClass86W.A01(this, 48);
    public final C86024w9 A04;

    public AnonymousClass51J(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A04 = new IDxOPropertyShape345S0200000_2_I2(3, context, this);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_left_add_on_icon, this, true);
        this.A00 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_icon);
        this.A01 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_icon_outline);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(AnonymousClass7Kz.A0G().A02(this.A02), C29934Fwk.A0c);
        AnonymousClass7Fe.A00(obtainStyledAttributes, this, 18, 2131886523);
        obtainStyledAttributes.recycle();
    }

    static {
        Class<AnonymousClass51J> cls = AnonymousClass51J.class;
        A05 = new AnonymousClass0A5[]{C86134wK.A0x(cls, "icon", "getIcon()Lcom/facebookpay/widget/style/Icon;"), C86134wK.A0x(cls, "imageThumbnailUrl", "getImageThumbnailUrl()Ljava/lang/String;")};
    }

    public final int getFbpayWidgetStyleType() {
        return this.A02;
    }

    public final AnonymousClass697 getIcon() {
        return (AnonymousClass697) C86114wI.A0i(this, this.A03, A05, 0);
    }

    public final String getImageThumbnailUrl() {
        return (String) C86114wI.A0i(this, this.A04, A05, 1);
    }

    public final void setIcon(AnonymousClass697 r4) {
        C86114wI.A1L(this, r4, this.A03, A05, 0);
    }

    public final void setImageThumbnailUrl(String str) {
        C86114wI.A1L(this, str, this.A04, A05, 1);
    }

    public final void setImageViewBackground(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A01;
            String str = "imageViewOutline";
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                Rect A0D = C86134wK.A0D();
                if (drawable.getPadding(A0D)) {
                    ImageView imageView2 = this.A00;
                    if (imageView2 == null) {
                        str = "imageView";
                    } else {
                        imageView2.setPadding(A0D.left, A0D.top, A0D.right, A0D.bottom);
                    }
                }
                imageView.setVisibility(0);
                return;
            }
            C04220Ms.A0E(str);
            throw null;
        }
    }

    public final void setImageViewStyle(int i) {
        String str;
        ImageView imageView = this.A00;
        if (imageView == null) {
            str = "imageView";
        } else {
            AnonymousClass7Fe.A01(imageView, i);
            ImageView imageView2 = this.A01;
            if (imageView2 == null) {
                str = "imageViewOutline";
            } else {
                AnonymousClass7Fe.A01(imageView2, i);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
