package com.instagram.igds.components.headline;

import X.AnonymousClass0wJ;
import X.AnonymousClass23M;
import X.C04220Ms;
import X.C11630kW;
import X.C121907Is;
import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C19577Ayd;
import X.C29934Fwk;
import X.C33619HrR;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.facepile.IgFacepile;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsHeadline extends LinearLayout implements C11630kW {
    public C19577Ayd A00;
    public C19577Ayd A01;
    public C19577Ayd A02;
    public C19577Ayd A03;
    public C19577Ayd A04;
    public boolean A05;
    public C19577Ayd A06;
    public AnonymousClass23M A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        C04220Ms.A0B(context, 1);
    }

    public String getModuleName() {
        return "igds_headline_component";
    }

    public final void setBody(int i) {
        A04(R.id.igds_headline_body, i);
        AnonymousClass0wJ.A0K(this, R.id.igds_headline_body).setOnClickListener((View.OnClickListener) null);
    }

    public final void setCircularImageBitmap(Bitmap bitmap) {
        C04220Ms.A0B(bitmap, 0);
        A01(this).setImageBitmap(bitmap);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl) {
        C04220Ms.A0B(imageUrl, 0);
        A01(this).setUrl(imageUrl, this);
    }

    public final void setFacepile(List list) {
        setFacepile(list, (String) null);
    }

    public final void setImageBitmap(Bitmap bitmap, C33619HrR hrR) {
        C04220Ms.A0B(bitmap, 0);
        A02(hrR).setImageBitmap(bitmap);
    }

    public final void setImageResource(int i) {
        A08(i, false);
    }

    public final void setImageURL(ImageUrl imageUrl) {
        setImageURL(imageUrl, (C11630kW) null, (C33619HrR) null);
    }

    public final void setRoundedCornerImageUrl(ImageUrl imageUrl, C11630kW r7) {
        ViewStub viewStub;
        C04220Ms.A0B(imageUrl, 0);
        C19577Ayd ayd = this.A02;
        if (!ayd.A0A() && (viewStub = ayd.A01) != null) {
            viewStub.setLayoutResource(R.layout.igds_headline_rounded_corner_image);
        }
        View A0G = C18230wP.A0G(ayd);
        A0G.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = A0G.getLayoutParams();
        if (layoutParams != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            A0G.setLayoutParams(layoutParams);
        }
        int A052 = C18200wM.A05(this.A00);
        C18180wK.A1L(this.A04, A052);
        C18180wK.A1L(this.A01, A052);
        C18180wK.A1L(this.A03, A052);
        IgImageView igImageView = (IgImageView) AnonymousClass0wJ.A0J(A0G, R.id.igds_headline_rounded_corner_image);
        if (r7 == null) {
            r7 = this;
        }
        igImageView.setUrl(imageUrl, r7);
    }

    public final void setType(AnonymousClass23M r3) {
        C04220Ms.A0B(r3, 0);
        this.A07 = r3;
        if (r3.A00 == 1) {
            A03(R.id.igds_headline_headline);
            A03(R.id.igds_headline_body);
            A03(R.id.igds_headline_link);
            A03(R.id.igds_headline_supporting_text);
            A06(A00(this), true);
        }
    }

    public static final ImageView A00(IgdsHeadline igdsHeadline) {
        ViewStub viewStub;
        C19577Ayd ayd = igdsHeadline.A03;
        if (!ayd.A0A() && (viewStub = ayd.A01) != null) {
            viewStub.setLayoutResource(R.layout.igds_headline_image);
        }
        ImageView imageView = (ImageView) C18230wP.A0G(ayd);
        imageView.setVisibility(0);
        int A052 = C18200wM.A05(igdsHeadline.A02);
        C18180wK.A1L(igdsHeadline.A00, A052);
        C18180wK.A1L(igdsHeadline.A01, A052);
        C18180wK.A1L(igdsHeadline.A04, A052);
        return imageView;
    }

    public static final CircularImageView A01(IgdsHeadline igdsHeadline) {
        ViewStub viewStub;
        C19577Ayd ayd = igdsHeadline.A00;
        if (!ayd.A0A() && (viewStub = ayd.A01) != null) {
            viewStub.setLayoutResource(R.layout.igds_headline_circular_image);
        }
        CircularImageView circularImageView = (CircularImageView) C18230wP.A0G(ayd);
        circularImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        circularImageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = circularImageView.getLayoutParams();
        if (layoutParams != null) {
            int dimensionPixelSize = igdsHeadline.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            circularImageView.setLayoutParams(layoutParams);
        }
        int A052 = C18200wM.A05(igdsHeadline.A02);
        C18180wK.A1L(igdsHeadline.A04, A052);
        C18180wK.A1L(igdsHeadline.A01, A052);
        C18180wK.A1L(igdsHeadline.A03, A052);
        return circularImageView;
    }

    private final IgImageView A02(C33619HrR hrR) {
        ViewStub viewStub;
        C19577Ayd ayd = this.A04;
        if (!ayd.A0A() && (viewStub = ayd.A01) != null) {
            viewStub.setLayoutResource(R.layout.igds_headline_url_image);
        }
        IgImageView igImageView = (IgImageView) C18230wP.A0G(ayd);
        igImageView.setId(R.id.igds_headline_url_image);
        igImageView.setVisibility(0);
        if (hrR != null) {
            igImageView.A0F = hrR;
        }
        int A052 = C18200wM.A05(this.A02);
        C18180wK.A1L(this.A00, A052);
        C18180wK.A1L(this.A01, A052);
        C18180wK.A1L(this.A03, A052);
        return igImageView;
    }

    private final void A06(ImageView imageView, boolean z) {
        int i;
        int i2 = this.A07.A00;
        Context context = getContext();
        if (i2 == 1) {
            i = R.color.canvas_bottom_sheet_description_text_color;
        } else if (z) {
            i = C121907Is.A02(context, R.attr.igdsPrimaryIcon);
        } else {
            i = R.color.fds_transparent;
        }
        C18240wQ.A0r(context, imageView, i);
    }

    public static /* synthetic */ void setCircularImageUrl$default(IgdsHeadline igdsHeadline, ImageUrl imageUrl, String str, C11630kW r5, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            r5 = null;
        }
        igdsHeadline.setCircularImageUrl(imageUrl, str, r5);
    }

    public static /* synthetic */ void setFacepile$default(IgdsHeadline igdsHeadline, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        igdsHeadline.setFacepile(list, str);
    }

    public static /* synthetic */ void setImageURL$default(IgdsHeadline igdsHeadline, ImageUrl imageUrl, C11630kW r4, C33619HrR hrR, int i, Object obj) {
        if ((i & 2) != 0) {
            r4 = null;
        }
        if ((i & 4) != 0) {
            hrR = null;
        }
        igdsHeadline.setImageURL(imageUrl, r4, hrR);
    }

    public static /* synthetic */ void setRoundedCornerImageUrl$default(IgdsHeadline igdsHeadline, ImageUrl imageUrl, C11630kW r3, int i, Object obj) {
        if ((i & 2) != 0) {
            r3 = null;
        }
        igdsHeadline.setRoundedCornerImageUrl(imageUrl, r3);
    }

    public final void setBulletList(List list) {
        ViewGroup viewGroup = (ViewGroup) C18230wP.A0G(this.A06);
        viewGroup.removeAllViews();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18240wQ.A0x(viewGroup, it);
            }
        }
    }

    public final void setHeadline(int i) {
        boolean z = this.A05;
        int i2 = R.id.igds_headline_headline;
        if (z) {
            i2 = R.id.igds_headline_emphasized_headline;
        }
        A04(i2, i);
    }

    public final void setHeadlineStyle(int i) {
        boolean z = this.A05;
        int i2 = R.id.igds_headline_headline;
        if (z) {
            i2 = R.id.igds_headline_emphasized_headline;
        }
        TextView textView = (TextView) AnonymousClass0wJ.A0J(this, i2);
        if (i != 0) {
            textView.setTextAppearance(i);
        }
    }

    private final void A03(int i) {
        TextView textView = (TextView) AnonymousClass0wJ.A0J(this, i);
        Context context = getContext();
        C18180wK.A0s(context, textView, R.color.canvas_bottom_sheet_description_text_color);
        textView.setShadowLayer((float) getResources().getDimensionPixelSize(R.dimen.autofill_optimization_title_top_margin), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, context.getColor(R.color.facepile_inner_stroke_color));
    }

    private final void A04(int i, int i2) {
        int i3;
        TextView textView = (TextView) AnonymousClass0wJ.A0J(this, i);
        if (i2 != 0) {
            A07(textView, i);
            textView.setText(i2);
            C18180wK.A0z(textView);
            C18230wP.A16(textView, textView.getContext());
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    private final void A05(int i, CharSequence charSequence) {
        TextView textView = (TextView) AnonymousClass0wJ.A0J(this, i);
        if (charSequence == null || charSequence.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        A07(textView, i);
        textView.setText(charSequence);
        C18180wK.A0z(textView);
        C18230wP.A16(textView, textView.getContext());
        textView.setVisibility(0);
    }

    public static final void A07(TextView textView, int i) {
        if (i == R.id.igds_headline_headline || i == R.id.igds_headline_emphasized_headline || i == R.id.igds_headline_body) {
            textView.setImportantForAccessibility(2);
        } else if (i == R.id.igds_headline_link) {
            C18210wN.A0y(textView);
        }
    }

    public final void A08(int i, boolean z) {
        ImageView A002 = A00(this);
        A002.setImageResource(i);
        A06(A002, z);
    }

    public final void A09(View.OnClickListener onClickListener, int i) {
        A04(R.id.igds_headline_link, i);
        AnonymousClass0wJ.A0K(this, R.id.igds_headline_link).setOnClickListener(onClickListener);
    }

    public final void setImageDrawable(Drawable drawable) {
        A00(this).setImageDrawable(drawable);
    }

    public final void setLink(String str, View.OnClickListener onClickListener) {
        A05(R.id.igds_headline_link, str);
        AnonymousClass0wJ.A0K(this, R.id.igds_headline_link).setOnClickListener(onClickListener);
    }

    public final void setSupportingText(int i) {
        A04(R.id.igds_headline_supporting_text, i);
    }

    public final void setIsEmphasized(boolean z) {
        this.A05 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void setBody(CharSequence charSequence, View.OnClickListener onClickListener) {
        A05(R.id.igds_headline_body, charSequence);
        AnonymousClass0wJ.A0K(this, R.id.igds_headline_body).setOnClickListener(onClickListener);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl, String str, C11630kW r6) {
        C04220Ms.A0B(imageUrl, 0);
        CircularImageView A012 = A01(this);
        if (r6 == null) {
            r6 = this;
        }
        A012.setUrl(imageUrl, r6);
        if (str != null) {
            A012.setContentDescription(AnonymousClass0wJ.A0l(getContext(), str, 2131828275));
        }
    }

    public final void setFacepile(List list, String str) {
        ViewStub viewStub;
        C19577Ayd ayd = this.A01;
        if (!ayd.A0A() && (viewStub = ayd.A01) != null) {
            viewStub.setLayoutResource(R.layout.dialog_facepile);
        }
        IgFacepile igFacepile = (IgFacepile) C18230wP.A0G(ayd);
        if (list != null) {
            if (str == null) {
                str = "igds_headline_component";
            }
            igFacepile.setImageUris(list, str);
        }
        igFacepile.setVisibility(0);
        int A052 = C18200wM.A05(this.A02);
        C18180wK.A1L(this.A00, A052);
        if (this.A03.A0A()) {
            ayd.A08().setVisibility(A052);
        }
        C18180wK.A1L(this.A04, A052);
    }

    public final void setHeadline(CharSequence charSequence) {
        boolean z = this.A05;
        int i = R.id.igds_headline_headline;
        if (z) {
            i = R.id.igds_headline_emphasized_headline;
        }
        A05(i, charSequence);
    }

    public final void setImageURL(ImageUrl imageUrl, C11630kW r3, C33619HrR hrR) {
        if (imageUrl != null) {
            IgImageView A022 = A02(hrR);
            if (r3 == null) {
                r3 = this;
            }
            A022.setUrl(imageUrl, r3);
        }
    }

    public final void setSupportingText(CharSequence charSequence) {
        A05(R.id.igds_headline_supporting_text, charSequence);
    }

    public final void setBody(CharSequence charSequence) {
        setBody(charSequence, (View.OnClickListener) null);
    }

    public final void setCircularImageUrl(ImageUrl imageUrl, String str) {
        C04220Ms.A0B(imageUrl, 0);
        setCircularImageUrl(imageUrl, str, (C11630kW) null);
    }

    public final void setImageURL(ImageUrl imageUrl, C11630kW r3) {
        setImageURL(imageUrl, r3, (C33619HrR) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C04220Ms.A0B(context, 1);
        AnonymousClass23M r2 = AnonymousClass23M.DEFAULT;
        this.A07 = r2;
        View inflate = LinearLayout.inflate(context, R.layout.igds_headline_layout, this);
        View requireViewById = inflate.requireViewById(R.id.igds_headline_url_image_viewstub);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewStub");
        this.A04 = new C19577Ayd((ViewStub) requireViewById);
        this.A00 = C18180wK.A0U(inflate, R.id.igds_headline_circular_image_viewstub);
        this.A02 = C18180wK.A0U(inflate, R.id.igds_headline_rounded_corner_image_container_viewstub);
        this.A03 = C18180wK.A0U(inflate, R.id.igds_headline_simple_image_viewstub);
        this.A01 = C18180wK.A0U(inflate, R.id.igds_headline_facepile_viewstub);
        this.A06 = C18180wK.A0U(inflate, R.id.igds_headline_bullet_list_container_stub);
        setOrientation(1);
        int A012 = C18240wQ.A01(context, 32);
        setPadding(A012, A012, A012, A012);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A1O);
            C04220Ms.A06(obtainStyledAttributes);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0) {
                A08(resourceId, false);
            }
            this.A05 = obtainStyledAttributes.getBoolean(3, false);
            int i3 = obtainStyledAttributes.getInt(6, 0);
            if (i3 != 0 && i3 == 1) {
                r2 = AnonymousClass23M.ON_MEDIA;
            }
            setHeadline(obtainStyledAttributes.getResourceId(1, 0));
            A04(R.id.igds_headline_body, obtainStyledAttributes.getResourceId(0, 0));
            A04(R.id.igds_headline_supporting_text, obtainStyledAttributes.getResourceId(5, 0));
            A04(R.id.igds_headline_link, obtainStyledAttributes.getResourceId(4, 0));
            obtainStyledAttributes.recycle();
            setType(r2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsHeadline(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i3), C18220wO.A00(i3, i), (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsHeadline(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C04220Ms.A0B(context, 1);
    }
}
