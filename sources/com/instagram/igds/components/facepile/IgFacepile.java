package com.instagram.igds.components.facepile;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18220wO;
import X.C18470xF;
import X.C29934Fwk;
import X.C62393Zl;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

public final class IgFacepile extends FrameLayout {
    public int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgFacepile(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
        A00(context, (AttributeSet) null);
    }

    public final void setImageBitmaps(List list, String str) {
        C04220Ms.A0B(list, 0);
        setImageBitmaps(list, 3, str);
    }

    public final void setImageDrawables(List list) {
        C04220Ms.A0B(list, 0);
        if (list.size() >= 3) {
            ImageView imageView = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_avatar_left);
            imageView.setImageDrawable((Drawable) list.get(0));
            imageView.setVisibility(0);
            ImageView imageView2 = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_avatar_center);
            imageView2.setImageDrawable((Drawable) list.get(1));
            imageView2.setVisibility(0);
            ImageView imageView3 = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_avatar_right);
            imageView3.setImageDrawable((Drawable) list.get(2));
            imageView3.setVisibility(0);
        }
    }

    public final void setImageUris(List list, String str) {
        C04220Ms.A0B(list, 0);
        if (list.size() < 3) {
            return;
        }
        if (this.A00 == 1) {
            setLargePileUris(list, str);
        } else {
            setStandardPileUris(list, 3, str);
        }
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C29934Fwk.A14, 0, 0);
        C04220Ms.A06(obtainStyledAttributes);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        int i = this.A00;
        int i2 = R.layout.facepile_standard;
        if (i == 1) {
            i2 = R.layout.facepile_large;
        }
        FrameLayout.inflate(context, i2, this);
    }

    private final void setLargePileBitmaps(List list, String str) {
        ImageView imageView = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_avatar_left);
        Context A0A = C18190wL.A0A(this);
        imageView.setImageDrawable(C62393Zl.A00(A0A, (Bitmap) list.get(0), str));
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_avatar_center);
        Bitmap bitmap = (Bitmap) list.get(1);
        Resources resources = A0A.getResources();
        imageView2.setImageDrawable(C62393Zl.A01(A0A, bitmap, str, resources.getDimensionPixelSize(R.dimen.business_card_profile_pic_size), resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), A0A.getColor(R.color.canvas_bottom_sheet_description_text_color)));
        imageView2.setVisibility(0);
        ImageView imageView3 = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_avatar_right);
        imageView3.setImageDrawable(C62393Zl.A00(A0A, (Bitmap) list.get(2), str));
        imageView3.setVisibility(0);
    }

    private final void setLargePileUris(List list, String str) {
        ImageView imageView = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_avatar_left);
        Context A0A = C18190wL.A0A(this);
        String str2 = str;
        imageView.setImageDrawable(C62393Zl.A03(A0A, (ImageUrl) list.get(0), str2, A0A.getResources().getDimensionPixelSize(R.dimen._self_serve_linking_artist_avatar_search_size), 0, 0));
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_avatar_center);
        imageView2.setImageDrawable(C62393Zl.A02(A0A, (ImageUrl) list.get(1), str));
        imageView2.setVisibility(0);
        ImageView imageView3 = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_avatar_right);
        imageView3.setImageDrawable(C62393Zl.A03(A0A, (ImageUrl) list.get(2), str2, C18220wO.A01(A0A, R.dimen._self_serve_linking_artist_avatar_search_size), 0, 0));
        imageView3.setVisibility(0);
    }

    private final void setStandardPileBitmaps(List list, int i, String str) {
        ImageView imageView = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_holder);
        Context A0A = C18190wL.A0A(this);
        List list2 = list;
        C04220Ms.A0B(list2, 1);
        Resources resources = A0A.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int min = Math.min(i, list2.size());
        for (int i2 = 0; i2 < min; i2++) {
            Context context = A0A;
            A0v.add(C62393Zl.A01(context, (Bitmap) list2.get(i2), str, resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin), resources.getDimensionPixelSize(R.dimen.autofill_optimization_title_top_margin), A0A.getColor(R.color.direct_dark_mode_glyph_color_primary)));
        }
        imageView.setImageDrawable(new C18470xF(A0A, AnonymousClass006.A00, A0v, 0.42f, dimensionPixelSize, dimensionPixelSize, 0));
    }

    private final void setStandardPileUris(List list, int i, String str) {
        ImageView imageView = (ImageView) AnonymousClass0wJ.A0J(this, R.id.facepile_holder);
        Context A0A = C18190wL.A0A(this);
        List list2 = list;
        C04220Ms.A0B(list2, 1);
        Resources resources = A0A.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int min = Math.min(i, list2.size());
        for (int i2 = 0; i2 < min; i2++) {
            Context context = A0A;
            A0v.add(C62393Zl.A03(context, (ImageUrl) list2.get(i2), str, resources.getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin), resources.getDimensionPixelSize(R.dimen.autofill_optimization_title_top_margin), A0A.getColor(R.color.direct_dark_mode_glyph_color_primary)));
        }
        imageView.setImageDrawable(new C18470xF(A0A, AnonymousClass006.A00, A0v, 0.42f, dimensionPixelSize, dimensionPixelSize, 0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgFacepile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        A00(context, attributeSet);
    }

    public final void setImageBitmaps(List list, int i, String str) {
        C04220Ms.A0B(list, 0);
        if (i >= 3 && list.size() >= 3) {
            if (this.A00 == 1) {
                setLargePileBitmaps(list, str);
            } else {
                setStandardPileBitmaps(list, i, str);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgFacepile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        A00(context, attributeSet);
    }
}
