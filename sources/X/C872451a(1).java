package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.util.List;
import kotlin.properties.IDxOPropertyShape881S0100000_2_I2;

/* renamed from: X.51a  reason: invalid class name and case insensitive filesystem */
public final class C872451a extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0A5[] A0E;
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public TextView A09;
    public final int A0A = 5;
    public final TypedArray A0B;
    public final C86024w9 A0C;
    public final C86024w9 A0D;

    public C872451a(Context context) {
        super(context, (AttributeSet) null, 0);
        String str;
        AnonymousClass7Kz.A0G();
        int[] iArr = C29934Fwk.A0c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2131886515, iArr);
        C04220Ms.A06(obtainStyledAttributes);
        this.A0B = obtainStyledAttributes;
        this.A0C = new IDxOPropertyShape881S0100000_2_I2(51, this, AnonymousClass0ZV.A00);
        this.A0D = new IDxOPropertyShape881S0100000_2_I2(52, this, 0);
        LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_left_add_on_multi_image_icon, this, true);
        this.A01 = AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_multi_image_container);
        this.A04 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_image_1);
        this.A05 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_image_2);
        this.A06 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_image_3);
        this.A07 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_image_4);
        this.A08 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_multi_image_outline);
        this.A03 = AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_vertical_divider);
        this.A00 = AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_horizontal_divider_1);
        this.A02 = AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_horizontal_divider_2);
        this.A09 = (TextView) AnonymousClass0wJ.A0I(this, R.id.list_cell_left_add_on_badge_icon);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(AnonymousClass7Kz.A0G().A02(this.A0A), iArr);
        AnonymousClass7Fe.A00(obtainStyledAttributes2, this, 18, 2131886523);
        obtainStyledAttributes2.recycle();
        AnonymousClass7Kz.A0G();
        int color = context2.getColor(R.color.igds_separator);
        View view = this.A03;
        if (view == null) {
            str = "verticalDivider";
        } else {
            view.setBackgroundColor(color);
            View view2 = this.A00;
            if (view2 == null) {
                str = "leftHalfDivider";
            } else {
                view2.setBackgroundColor(color);
                View view3 = this.A02;
                if (view3 == null) {
                    str = "rightHalfDivider";
                } else {
                    view3.setBackgroundColor(color);
                    Drawable drawable = context2.getDrawable(R.drawable.fbpay_widget_multi_item_thumbnail_border);
                    String A002 = C28174Ezk.A00(0);
                    C04220Ms.A0C(drawable, A002);
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    gradientDrawable.mutate();
                    gradientDrawable.setStroke(context2.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin), color);
                    ImageView imageView = this.A08;
                    str = "imageViewOutline";
                    if (imageView != null) {
                        TypedArray typedArray = this.A0B;
                        AnonymousClass7Fe.A00(typedArray, imageView, 3, R.style.FBPayUIListCellLeftAddOnIconOutline);
                        ImageView imageView2 = this.A08;
                        if (imageView2 != null) {
                            imageView2.setImageDrawable(gradientDrawable);
                            ImageView imageView3 = this.A08;
                            if (imageView3 != null) {
                                imageView3.setVisibility(0);
                                View view4 = this.A01;
                                str = "multiImageContainer";
                                if (view4 != null) {
                                    AnonymousClass7Fe.A00(typedArray, view4, 3, R.style.FBPayUIListCellLeftAddOnIconOutline);
                                    View view5 = this.A01;
                                    if (view5 != null) {
                                        view5.setBackgroundResource(R.drawable.fbpay_widget_multi_item_thumbnail_border);
                                        View view6 = this.A01;
                                        if (view6 != null) {
                                            Drawable background = view6.getBackground();
                                            C04220Ms.A0C(background, A002);
                                            GradientDrawable gradientDrawable2 = (GradientDrawable) background;
                                            gradientDrawable2.mutate();
                                            gradientDrawable2.setStroke(C18220wO.A01(context2, R.dimen.account_recs_header_image_margin), color);
                                            View view7 = this.A01;
                                            if (view7 != null) {
                                                view7.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                                                View view8 = this.A01;
                                                if (view8 != null) {
                                                    view8.setClipToOutline(true);
                                                    TextView textView = this.A09;
                                                    if (textView != null) {
                                                        AnonymousClass7Fe.A00(typedArray, textView, 0, R.style.FBPayUIListCellLeftAddOnBadgeIcon);
                                                        TextView textView2 = this.A09;
                                                        if (textView2 != null) {
                                                            AnonymousClass7Fd.A02(textView2, AnonymousClass69Q.A06);
                                                            TextView textView3 = this.A09;
                                                            if (textView3 != null) {
                                                                textView3.setBackgroundResource(R.drawable.fbpay_widget_multi_item_badge);
                                                                TextView textView4 = this.A09;
                                                                if (textView4 != null) {
                                                                    Drawable background2 = textView4.getBackground();
                                                                    C04220Ms.A0C(background2, A002);
                                                                    GradientDrawable gradientDrawable3 = (GradientDrawable) background2;
                                                                    gradientDrawable3.mutate();
                                                                    AnonymousClass7Kz.A0G();
                                                                    gradientDrawable3.setColor(context2.getColor(R.color.igds_elevated_background));
                                                                    int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
                                                                    AnonymousClass7Kz.A0G();
                                                                    gradientDrawable3.setStroke(dimensionPixelSize, context2.getColor(R.color.igds_separator));
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    C04220Ms.A0E("badgeIcon");
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void setImageThumbnailUrls(List list) {
        C04220Ms.A0B(list, 0);
        C86114wI.A1L(this, list, this.A0C, A0E, 0);
    }

    static {
        Class<C872451a> cls = C872451a.class;
        A0E = new AnonymousClass0A5[]{C86134wK.A0x(cls, "imageThumbnailUrls", "getImageThumbnailUrls()Ljava/util/List;"), C86134wK.A0x(cls, "numItems", "getNumItems()I")};
    }

    public static final void A01(C872451a r8) {
        ImageView imageView = r8.A04;
        if (imageView != null) {
            r8.setQuarterImageViewStyle(imageView);
            ImageView imageView2 = r8.A05;
            if (imageView2 != null) {
                r8.setQuarterImageViewStyle(imageView2);
                ImageView imageView3 = r8.A06;
                if (imageView3 != null) {
                    r8.setQuarterImageViewStyle(imageView3);
                    ImageView imageView4 = r8.A07;
                    String str = "imageView4";
                    if (imageView4 != null) {
                        r8.setQuarterImageViewStyle(imageView4);
                        if (imageView != null) {
                            A00(imageView, r8, C18190wL.A0p(r8.getImageThumbnailUrls(), 0));
                            if (imageView2 != null) {
                                A00(imageView2, r8, C18190wL.A0p(r8.getImageThumbnailUrls(), 1));
                                if (imageView3 != null) {
                                    A00(imageView3, r8, C18190wL.A0p(r8.getImageThumbnailUrls(), 2));
                                    A00(imageView4, r8, C18190wL.A0p(r8.getImageThumbnailUrls(), 3));
                                    View view = r8.A03;
                                    if (view == null) {
                                        str = "verticalDivider";
                                    } else {
                                        view.setVisibility(0);
                                        View view2 = r8.A02;
                                        if (view2 == null) {
                                            str = "rightHalfDivider";
                                        } else {
                                            view2.setVisibility(0);
                                            View view3 = r8.A00;
                                            if (view3 == null) {
                                                str = "leftHalfDivider";
                                            } else {
                                                view3.setVisibility(0);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C04220Ms.A0E(str);
                    throw null;
                }
                C04220Ms.A0E("imageView3");
                throw null;
            }
            C04220Ms.A0E("imageView2");
            throw null;
        }
        C04220Ms.A0E("imageView1");
        throw null;
    }

    public static final void A02(C872451a r6) {
        ImageView imageView = r6.A04;
        String str = "imageView1";
        if (imageView != null) {
            r6.setHalfImageViewStyle(imageView);
            ImageView imageView2 = r6.A05;
            if (imageView2 != null) {
                r6.setQuarterImageViewStyle(imageView2);
                ImageView imageView3 = r6.A06;
                str = "imageView3";
                if (imageView3 != null) {
                    r6.setQuarterImageViewStyle(imageView3);
                    A00(imageView, r6, C18190wL.A0p(r6.getImageThumbnailUrls(), 0));
                    if (imageView2 != null) {
                        A00(imageView2, r6, C18190wL.A0p(r6.getImageThumbnailUrls(), 1));
                        A00(imageView3, r6, C18190wL.A0p(r6.getImageThumbnailUrls(), 2));
                        View view = r6.A03;
                        if (view == null) {
                            str = "verticalDivider";
                        } else {
                            view.setVisibility(0);
                            View view2 = r6.A02;
                            if (view2 == null) {
                                str = "rightHalfDivider";
                            } else {
                                view2.setVisibility(0);
                                return;
                            }
                        }
                    }
                }
            }
            C04220Ms.A0E("imageView2");
            throw null;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A03(C872451a r5) {
        ImageView imageView = r5.A04;
        if (imageView != null) {
            r5.setHalfImageViewStyle(imageView);
            ImageView imageView2 = r5.A05;
            String str = "imageView2";
            if (imageView2 != null) {
                r5.setHalfImageViewStyle(imageView2);
                if (imageView != null) {
                    A00(imageView, r5, C18190wL.A0p(r5.getImageThumbnailUrls(), 0));
                    A00(imageView2, r5, C18190wL.A0p(r5.getImageThumbnailUrls(), 1));
                    View view = r5.A03;
                    if (view == null) {
                        str = "verticalDivider";
                    } else {
                        view.setVisibility(0);
                        return;
                    }
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
        C04220Ms.A0E("imageView1");
        throw null;
    }

    private final void setHalfImageViewStyle(ImageView imageView) {
        AnonymousClass7Fe.A00(this.A0B, imageView, 2, R.style.FBPayUIListCellLeftAddOnHalfIcon);
    }

    private final void setQuarterImageViewStyle(ImageView imageView) {
        AnonymousClass7Fe.A00(this.A0B, imageView, 5, R.style.FBPayUIListCellLeftAddOnQuarterIcon);
    }

    public final int getFbpayWidgetStyleType() {
        return this.A0A;
    }

    public final List getImageThumbnailUrls() {
        return (List) C86114wI.A0i(this, this.A0C, A0E, 0);
    }

    public final int getNumItems() {
        return AnonymousClass0wJ.A04(C86114wI.A0i(this, this.A0D, A0E, 1));
    }

    public final TypedArray getStyle() {
        return this.A0B;
    }

    public final void setNumItems(int i) {
        this.A0D.CrD(this, Integer.valueOf(i), A0E[1]);
    }

    public static final void A00(ImageView imageView, C872451a r6, String str) {
        C111906oc A0L = AnonymousClass7Kz.A0L();
        if (A0L.A00(str)) {
            C92895kC r1 = new C92895kC(A0L.A00, str, "ListCell");
            r1.A08 = true;
            r1.A02(imageView);
        } else {
            C121097Ec.A01(r6.getContext(), imageView, AnonymousClass7Kz.A0G(), 35, 33);
        }
        imageView.setVisibility(0);
    }
}
