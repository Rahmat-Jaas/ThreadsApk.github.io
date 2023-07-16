package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.51E  reason: invalid class name */
public final class AnonymousClass51E extends FrameLayout {
    public Context A00;
    public IgTextView A01;
    public CircularImageView A02;
    public CircularImageView A03;
    public Boolean A04;

    public AnonymousClass51E(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A00 = context;
        CircularImageView circularImageView = new CircularImageView(context, (AttributeSet) null);
        this.A02 = circularImageView;
        circularImageView.A01 = true;
        addView(circularImageView);
        CircularImageView circularImageView2 = new CircularImageView(context, (AttributeSet) null);
        this.A03 = circularImageView2;
        circularImageView2.A01 = true;
        addView(circularImageView2);
        IgTextView igTextView = new IgTextView(context);
        this.A01 = igTextView;
        igTextView.setVisibility(8);
        addView(this.A01);
        this.A04 = Boolean.valueOf(AnonymousClass0hB.A02(context));
    }

    public void setBottomBadge(int i) {
        float f = (float) i;
        float f2 = 0.64f * f;
        float f3 = f2;
        if (this.A04.booleanValue()) {
            f3 = f;
        }
        int i2 = (int) (f * 0.36f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.leftMargin = (int) f3;
        layoutParams.topMargin = (int) f2;
        CircularImageView circularImageView = this.A03;
        circularImageView.setLayoutParams(layoutParams);
        Context context = this.A00;
        C18180wK.A0r(context, circularImageView, C86104wH.A0G(context, R.attr.presenceBadgeMedium).resourceId);
    }

    public void setAvatarColor(int i) {
        this.A02.setBackgroundColor(i);
    }

    public void setAvatarText(String str) {
        IgTextView igTextView = this.A01;
        igTextView.setGravity(17);
        igTextView.setTextAlignment(4);
        C18180wK.A0s(this.A00, igTextView, R.color.igds_secondary_text);
        igTextView.setAutoSizeTextTypeUniformWithConfiguration(1, 8, 1, 2);
        igTextView.setText(str);
        igTextView.setVisibility(0);
    }

    public void setAvatarUrl(ImageUrl imageUrl, C11630kW r3) {
        this.A02.setUrl(imageUrl, r3);
    }
}
