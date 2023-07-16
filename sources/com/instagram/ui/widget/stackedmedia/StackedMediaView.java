package com.instagram.ui.widget.stackedmedia;

import X.AnonymousClass3WG;
import X.C11630kW;
import X.C18180wK;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

public class StackedMediaView extends FrameLayout {
    public IgImageView A00;
    public IgImageView A01;

    public StackedMediaView(Context context) {
        super(context);
        A00();
    }

    private void A00() {
        View inflate = C18180wK.A0C(this).inflate(R.layout.stacked_media, this, true);
        this.A01 = (IgImageView) inflate.findViewById(R.id.media_front);
        this.A00 = (IgImageView) inflate.findViewById(R.id.media_back);
    }

    public void setUrls(ImageUrl imageUrl, ImageUrl imageUrl2, C11630kW r5) {
        if (!AnonymousClass3WG.A02(imageUrl)) {
            this.A01.setUrl(imageUrl, r5);
        } else {
            this.A01.A09();
        }
        boolean A02 = AnonymousClass3WG.A02(imageUrl2);
        IgImageView igImageView = this.A00;
        if (!A02) {
            igImageView.setUrl(imageUrl2, r5);
        } else {
            igImageView.A09();
        }
    }

    public StackedMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public StackedMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
