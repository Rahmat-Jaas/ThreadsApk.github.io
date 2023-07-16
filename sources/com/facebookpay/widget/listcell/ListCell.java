package com.facebookpay.widget.listcell;

import X.AnonymousClass0A5;
import X.AnonymousClass0wJ;
import X.AnonymousClass51G;
import X.AnonymousClass51H;
import X.AnonymousClass51I;
import X.AnonymousClass51J;
import X.AnonymousClass699;
import X.AnonymousClass69B;
import X.AnonymousClass69Q;
import X.AnonymousClass6I7;
import X.AnonymousClass7Fe;
import X.AnonymousClass7JJ;
import X.AnonymousClass7Kz;
import X.AnonymousClass86W;
import X.AnonymousClass8bQ;
import X.AnonymousClass8e3;
import X.C04220Ms;
import X.C39909L6z;
import X.C86024w9;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import X.C86144wL;
import X.C86154wM;
import X.C86164wN;
import X.D57;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape71S0200000_2_I2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import kotlin.properties.IDxOPropertyShape345S0200000_2_I2;
import kotlin.properties.IDxOPropertyShape881S0100000_2_I2;

public class ListCell extends FrameLayout implements AnonymousClass8e3 {
    public static final /* synthetic */ AnonymousClass0A5[] A0o;
    public float A00;
    public View A01;
    public FrameLayout A02;
    public FrameLayout A03;
    public FrameLayout A04;
    public FrameLayout A05;
    public FrameLayout A06;
    public FrameLayout A07;
    public ImageView A08;
    public LinearLayout A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public ShimmerFrameLayout A0F;
    public ShimmerFrameLayout A0G;
    public ShimmerFrameLayout A0H;
    public ShimmerFrameLayout A0I;
    public ComponentLoggingData A0J;
    public AnonymousClass51J A0K;
    public AnonymousClass51H A0L;
    public AnonymousClass51G A0M;
    public AnonymousClass51I A0N;
    public LoggingContext A0O;
    public FrameLayout A0P;
    public AnonymousClass51I A0Q;
    public final C86024w9 A0R;
    public final C86024w9 A0S;
    public final C86024w9 A0T;
    public final C86024w9 A0U;
    public final C86024w9 A0V;
    public final C86024w9 A0W;
    public final C86024w9 A0X;
    public final C86024w9 A0Y;
    public final C86024w9 A0Z;
    public final C86024w9 A0a;
    public final C86024w9 A0b;
    public final C86024w9 A0c;
    public final C86024w9 A0d;
    public final C86024w9 A0e;
    public final C86024w9 A0f;
    public final C86024w9 A0g;
    public final C86024w9 A0h;
    public final C86024w9 A0i;
    public final C86024w9 A0j;
    public final C86024w9 A0k;
    public final C86024w9 A0l;
    public final C86024w9 A0m;
    public final C86024w9 A0n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C04220Ms.A0B(context, 1);
        this.A0X = AnonymousClass86W.A01(this, 38);
        this.A0e = AnonymousClass86W.A01(this, 42);
        this.A0j = AnonymousClass86W.A01(this, 43);
        this.A0a = AnonymousClass86W.A01(this, 44);
        this.A0h = new IDxOPropertyShape345S0200000_2_I2(1, context, this);
        this.A0Z = new IDxOPropertyShape345S0200000_2_I2(2, context, this);
        this.A0d = AnonymousClass86W.A01(this, 45);
        this.A0i = AnonymousClass86W.A01(this, 46);
        this.A0f = AnonymousClass86W.A01(this, 47);
        this.A0l = AnonymousClass86W.A01(this, 28);
        this.A0b = AnonymousClass86W.A01(this, 29);
        this.A0c = AnonymousClass86W.A01(this, 30);
        this.A0S = AnonymousClass86W.A01(this, 31);
        this.A0T = AnonymousClass86W.A01(this, 32);
        this.A0n = new IDxOPropertyShape881S0100000_2_I2(33, this, AnonymousClass69B.A0N);
        this.A0Y = new IDxOPropertyShape881S0100000_2_I2(34, this, AnonymousClass69Q.PRIMARY_TEXT);
        this.A0g = new IDxOPropertyShape881S0100000_2_I2(35, this, AnonymousClass69Q.A0z);
        this.A0m = new IDxOPropertyShape881S0100000_2_I2(36, this, AnonymousClass69Q.A17);
        this.A0U = new IDxOPropertyShape881S0100000_2_I2(37, this, false);
        this.A0V = new IDxOPropertyShape881S0100000_2_I2(39, this, false);
        this.A0W = new IDxOPropertyShape881S0100000_2_I2(40, this, false);
        this.A0R = new IDxOPropertyShape881S0100000_2_I2(41, this, AnonymousClass699.DEFAULT_CELL);
        this.A0k = new IDxOPropertyShape345S0200000_2_I2(0, context, this);
        this.A00 = context.getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
        FrameLayout.inflate(context, R.layout.fbpay_ui_list_cell, this);
        this.A08 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.image);
        this.A09 = (LinearLayout) AnonymousClass0wJ.A0I(this, R.id.shimmer_container);
        this.A01 = AnonymousClass0wJ.A0I(this, R.id.list_cell_container);
        this.A0B = (TextView) AnonymousClass0wJ.A0I(this, R.id.primary_text);
        this.A0G = (ShimmerFrameLayout) AnonymousClass0wJ.A0I(this, R.id.primary_shimmer_view);
        this.A0D = (TextView) AnonymousClass0wJ.A0I(this, R.id.secondary_text);
        this.A0H = (ShimmerFrameLayout) AnonymousClass0wJ.A0I(this, R.id.secondary_shimmer_view);
        this.A0E = (TextView) AnonymousClass0wJ.A0I(this, R.id.tertiary_text);
        this.A0I = (ShimmerFrameLayout) AnonymousClass0wJ.A0I(this, R.id.tertiary_shimmer_view);
        this.A0C = (TextView) AnonymousClass0wJ.A0I(this, R.id.quaternary_text);
        this.A03 = (FrameLayout) AnonymousClass0wJ.A0I(this, R.id.left_add_on_container);
        this.A06 = (FrameLayout) AnonymousClass0wJ.A0I(this, R.id.right_add_on_container);
        this.A05 = (FrameLayout) AnonymousClass0wJ.A0I(this, R.id.primary_text_add_on_container);
        this.A0A = (TextView) AnonymousClass0wJ.A0I(this, R.id.error_text);
        this.A0F = (ShimmerFrameLayout) AnonymousClass0wJ.A0I(this, R.id.image_shimmer);
        this.A02 = (FrameLayout) AnonymousClass0wJ.A0I(this, R.id.inline_action_menu_container);
        Context context2 = getContext();
        TypedArray A012 = AnonymousClass7Kz.A01(context2, this);
        View view = this.A01;
        if (view == null) {
            str = "containerView";
        } else {
            AnonymousClass7Fe.A00(A012, view, 10, R.style.FBPayUIListCellContainer);
            int resourceId = A012.getResourceId(13, R.style.FBPayUIListCellElement);
            TextView textView = this.A0B;
            if (textView == null) {
                str = "primaryTextView";
            } else {
                AnonymousClass7Fe.A01(textView, resourceId);
                TextView textView2 = this.A0D;
                if (textView2 == null) {
                    str = "secondaryTextView";
                } else {
                    AnonymousClass7Fe.A01(textView2, resourceId);
                    TextView textView3 = this.A0E;
                    if (textView3 == null) {
                        str = "tertiaryTextView";
                    } else {
                        AnonymousClass7Fe.A01(textView3, resourceId);
                        TextView textView4 = this.A0C;
                        if (textView4 == null) {
                            str = "quaternaryTextView";
                        } else {
                            AnonymousClass7Fe.A01(textView4, resourceId);
                            TextView textView5 = this.A0A;
                            if (textView5 == null) {
                                str = "errorTextView";
                            } else {
                                AnonymousClass7Fe.A01(textView5, resourceId);
                                LinearLayout linearLayout = this.A09;
                                if (linearLayout == null) {
                                    str = "shimmerContainer";
                                } else {
                                    AnonymousClass7Fe.A00(A012, linearLayout, 23, R.style.FBPayUIListShimmerContainer);
                                    ShimmerFrameLayout shimmerFrameLayout = this.A0G;
                                    if (shimmerFrameLayout == null) {
                                        str = "primaryShimmerView";
                                    } else {
                                        AnonymousClass7Fe.A00(A012, shimmerFrameLayout, 25, 2131886539);
                                        ShimmerFrameLayout shimmerFrameLayout2 = this.A0H;
                                        if (shimmerFrameLayout2 == null) {
                                            str = "secondaryShimmerView";
                                        } else {
                                            AnonymousClass7Fe.A00(A012, shimmerFrameLayout2, 26, 2131886540);
                                            ShimmerFrameLayout shimmerFrameLayout3 = this.A0I;
                                            if (shimmerFrameLayout3 == null) {
                                                str = "tertiaryShimmerView";
                                            } else {
                                                AnonymousClass7Fe.A00(A012, shimmerFrameLayout3, 27, 2131886541);
                                                ImageView imageView = this.A08;
                                                if (imageView == null) {
                                                    str = "imageView";
                                                } else {
                                                    AnonymousClass7Fe.A00(A012, imageView, 16, 2131886526);
                                                    FrameLayout frameLayout = this.A03;
                                                    if (frameLayout == null) {
                                                        str = "leftAddOnContainer";
                                                    } else {
                                                        AnonymousClass7Fe.A00(A012, frameLayout, 18, 2131886524);
                                                        FrameLayout frameLayout2 = this.A06;
                                                        if (frameLayout2 == null) {
                                                            str = "rightAddOnContainer";
                                                        } else {
                                                            AnonymousClass7Fe.A00(A012, frameLayout2, 21, 2131886523);
                                                            FrameLayout frameLayout3 = this.A05;
                                                            if (frameLayout3 == null) {
                                                                str = "primaryTextAddOnContainer";
                                                            } else {
                                                                AnonymousClass7Fe.A00(A012, frameLayout3, 20, 2131886525);
                                                                FrameLayout frameLayout4 = this.A02;
                                                                if (frameLayout4 == null) {
                                                                    str = "actionMenuContainer";
                                                                } else {
                                                                    AnonymousClass7Fe.A00(A012, frameLayout4, 17, 2131886529);
                                                                    A012.recycle();
                                                                    int A032 = AnonymousClass7Kz.A0G().A03(context2, 15);
                                                                    ShimmerFrameLayout shimmerFrameLayout4 = this.A0G;
                                                                    if (shimmerFrameLayout4 != null) {
                                                                        AnonymousClass7Kz.A0G();
                                                                        C86144wL.A19(context2.getDrawable(R.drawable.fbpay_shimmer_background), shimmerFrameLayout4, A032);
                                                                        ShimmerFrameLayout shimmerFrameLayout5 = this.A0H;
                                                                        if (shimmerFrameLayout5 != null) {
                                                                            AnonymousClass7Kz.A0G();
                                                                            C86144wL.A19(context2.getDrawable(R.drawable.fbpay_shimmer_background), shimmerFrameLayout5, A032);
                                                                            ShimmerFrameLayout shimmerFrameLayout6 = this.A0I;
                                                                            if (shimmerFrameLayout6 != null) {
                                                                                AnonymousClass7Kz.A0G();
                                                                                C86144wL.A19(context2.getDrawable(R.drawable.fbpay_shimmer_background), shimmerFrameLayout6, A032);
                                                                                ShimmerFrameLayout shimmerFrameLayout7 = this.A0F;
                                                                                if (shimmerFrameLayout7 != null) {
                                                                                    AnonymousClass7Kz.A0G();
                                                                                    C86144wL.A19(context2.getDrawable(R.drawable.listcell_image_shimmer_background), shimmerFrameLayout7, A032);
                                                                                    ShimmerFrameLayout shimmerFrameLayout8 = this.A0G;
                                                                                    if (shimmerFrameLayout8 != null) {
                                                                                        shimmerFrameLayout8.setImportantForAccessibility(2);
                                                                                        ShimmerFrameLayout shimmerFrameLayout9 = this.A0H;
                                                                                        if (shimmerFrameLayout9 != null) {
                                                                                            shimmerFrameLayout9.setImportantForAccessibility(2);
                                                                                            ShimmerFrameLayout shimmerFrameLayout10 = this.A0I;
                                                                                            if (shimmerFrameLayout10 != null) {
                                                                                                shimmerFrameLayout10.setImportantForAccessibility(2);
                                                                                                ShimmerFrameLayout shimmerFrameLayout11 = this.A0F;
                                                                                                if (shimmerFrameLayout11 != null) {
                                                                                                    shimmerFrameLayout11.setImportantForAccessibility(2);
                                                                                                    setImportantForAccessibility(1);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                C04220Ms.A0E("imageShimmer");
                                                                                throw null;
                                                                            }
                                                                            C04220Ms.A0E("tertiaryShimmerView");
                                                                            throw null;
                                                                        }
                                                                        C04220Ms.A0E("secondaryShimmerView");
                                                                        throw null;
                                                                    }
                                                                    C04220Ms.A0E("primaryShimmerView");
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
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void A08(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0G;
        if (shimmerFrameLayout == null) {
            C04220Ms.A0E("primaryShimmerView");
            throw null;
        }
        D57.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void A09(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0H;
        if (shimmerFrameLayout == null) {
            C04220Ms.A0E("secondaryShimmerView");
            throw null;
        }
        D57.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void A0A(Integer num) {
        ShimmerFrameLayout shimmerFrameLayout = this.A0I;
        if (shimmerFrameLayout == null) {
            C04220Ms.A0E("tertiaryShimmerView");
            throw null;
        }
        D57.A00(shimmerFrameLayout, num);
        shimmerFrameLayout.setVisibility(0);
    }

    public final void setBackgroundStyle(AnonymousClass699 r4) {
        C04220Ms.A0B(r4, 0);
        C86114wI.A1L(this, r4, this.A0R, A0o, 21);
    }

    public final void setPrimaryTextStyle(AnonymousClass69Q r4) {
        C04220Ms.A0B(r4, 0);
        C86114wI.A1L(this, r4, this.A0Y, A0o, 15);
    }

    public final void setSecondaryTextStyle(AnonymousClass69Q r4) {
        C04220Ms.A0B(r4, 0);
        C86114wI.A1L(this, r4, this.A0g, A0o, 16);
    }

    public final void setTertiaryTextStyle(AnonymousClass69Q r4) {
        C04220Ms.A0B(r4, 0);
        C86114wI.A1L(this, r4, this.A0m, A0o, 17);
    }

    public final void setTextStyle(AnonymousClass69B r4) {
        C04220Ms.A0B(r4, 0);
        C86114wI.A1L(this, r4, this.A0n, A0o, 14);
    }

    static {
        Class<ListCell> cls = ListCell.class;
        A0o = new AnonymousClass0A5[]{C86134wK.A0x(cls, "primaryText", "getPrimaryText()Ljava/lang/String;"), C86134wK.A0x(cls, "secondaryText", "getSecondaryText()Ljava/lang/String;"), C86134wK.A0x(cls, "tertiaryText", "getTertiaryText()Ljava/lang/String;"), C86134wK.A0x(cls, "quaternaryText", "getQuaternaryText()Ljava/lang/String;"), C86134wK.A0x(cls, "tertiaryLinkableText", "getTertiaryLinkableText()Ljava/lang/CharSequence;"), C86134wK.A0x(cls, "quaternaryLinkableText", "getQuaternaryLinkableText()Ljava/lang/CharSequence;"), C86134wK.A0x(cls, "secondarySpannableText", "getSecondarySpannableText()Landroid/text/SpannableStringBuilder;"), C86134wK.A0x(cls, "tertiarySpannableText", "getTertiarySpannableText()Landroid/text/SpannableStringBuilder;"), C86134wK.A0x(cls, "secondaryTextSizePx", "getSecondaryTextSizePx()Ljava/lang/Float;"), C86134wK.A0x(cls, "tertiaryTextSizePx", "getTertiaryTextSizePx()Ljava/lang/Float;"), C86134wK.A0x(cls, "quaternaryTextSizePx", "getQuaternaryTextSizePx()Ljava/lang/Float;"), C86134wK.A0x(cls, "quaternaryTextVerticalSpacing", "getQuaternaryTextVerticalSpacing()Ljava/lang/Integer;"), C86134wK.A0x(cls, "errorText", "getErrorText()Ljava/lang/String;"), C86134wK.A0x(cls, "imageUrl", "getImageUrl()Ljava/lang/String;"), C86134wK.A0x(cls, "textStyle", "getTextStyle()Lcom/facebookpay/widget/listcell/ListCellTextStyle;"), C86134wK.A0x(cls, "primaryTextStyle", "getPrimaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), C86134wK.A0x(cls, "secondaryTextStyle", "getSecondaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), C86134wK.A0x(cls, "tertiaryTextStyle", "getTertiaryTextStyle()Lcom/facebookpay/widget/style/TextStyle;"), C86134wK.A0x(cls, "isPrimaryTextLineBreaks", "isPrimaryTextLineBreaks()Z"), C86134wK.A0x(cls, "isSecondaryTextLineBreaks", "isSecondaryTextLineBreaks()Z"), C86134wK.A0x(cls, "isTertiaryTextLineBreaks", "isTertiaryTextLineBreaks()Z"), C86134wK.A0x(cls, "backgroundStyle", "getBackgroundStyle()Lcom/facebookpay/widget/listcell/ListCellBackgroundStyle;"), C86134wK.A0x(cls, "tertiaryTextOnClickListener", "getTertiaryTextOnClickListener()Landroid/view/View$OnClickListener;")};
    }

    public static /* synthetic */ void A01(ListCell listCell, int i, boolean z, boolean z2) {
        String str;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        TypedArray A012 = AnonymousClass7Kz.A01(listCell.getContext(), listCell);
        if (!z) {
            View view = listCell.A01;
            if (view == null) {
                str = "containerView";
                C04220Ms.A0E(str);
                throw null;
            }
            AnonymousClass7Fe.A00(A012, view, 9, 2131886520);
        }
        if (!z2) {
            int resourceId = A012.getResourceId(12, 2131886531);
            TextView textView = listCell.A0B;
            if (textView == null) {
                str = "primaryTextView";
            } else {
                AnonymousClass7Fe.A01(textView, resourceId);
                TextView textView2 = listCell.A0D;
                if (textView2 == null) {
                    str = "secondaryTextView";
                } else {
                    AnonymousClass7Fe.A01(textView2, resourceId);
                    TextView textView3 = listCell.A0E;
                    if (textView3 == null) {
                        str = "tertiaryTextView";
                    } else {
                        AnonymousClass7Fe.A01(textView3, resourceId);
                        TextView textView4 = listCell.A0C;
                        if (textView4 == null) {
                            str = "quaternaryTextView";
                        } else {
                            AnonymousClass7Fe.A01(textView4, resourceId);
                            TextView textView5 = listCell.A0A;
                            if (textView5 == null) {
                                str = "errorTextView";
                            } else {
                                AnonymousClass7Fe.A01(textView5, resourceId);
                                LinearLayout linearLayout = listCell.A09;
                                if (linearLayout == null) {
                                    str = "shimmerContainer";
                                } else {
                                    AnonymousClass7Fe.A00(A012, linearLayout, 23, 2131886543);
                                    ShimmerFrameLayout shimmerFrameLayout = listCell.A0F;
                                    if (shimmerFrameLayout == null) {
                                        str = "imageShimmer";
                                    } else {
                                        AnonymousClass7Fe.A00(A012, shimmerFrameLayout, 24, 2131886783);
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
        A012.recycle();
    }

    public final void A02() {
        FrameLayout frameLayout = this.A03;
        if (frameLayout == null) {
            C04220Ms.A0E("leftAddOnContainer");
            throw null;
        }
        C39909L6z A0J2 = C86134wK.A0J(frameLayout);
        A0J2.A0s = 0;
        A0J2.A0E = R.id.error_text;
    }

    public final void A03() {
        String str;
        ShimmerFrameLayout shimmerFrameLayout = this.A0G;
        if (shimmerFrameLayout == null) {
            str = "primaryShimmerView";
        } else {
            shimmerFrameLayout.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout2 = this.A0H;
            if (shimmerFrameLayout2 == null) {
                str = "secondaryShimmerView";
            } else {
                shimmerFrameLayout2.setVisibility(8);
                ShimmerFrameLayout shimmerFrameLayout3 = this.A0I;
                if (shimmerFrameLayout3 == null) {
                    str = "tertiaryShimmerView";
                } else {
                    shimmerFrameLayout3.setVisibility(8);
                    ShimmerFrameLayout shimmerFrameLayout4 = this.A0F;
                    if (shimmerFrameLayout4 == null) {
                        str = "imageShimmer";
                    } else {
                        shimmerFrameLayout4.setVisibility(8);
                        String imageUrl = getImageUrl();
                        if (imageUrl != null && !AnonymousClass8bQ.A0n(imageUrl)) {
                            ImageView imageView = this.A08;
                            if (imageView == null) {
                                str = "imageView";
                            } else {
                                imageView.setVisibility(0);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void A05() {
        ShimmerFrameLayout shimmerFrameLayout = this.A0F;
        if (shimmerFrameLayout == null) {
            C04220Ms.A0E("imageShimmer");
            throw null;
        }
        D57.A00(shimmerFrameLayout, (Integer) null);
        shimmerFrameLayout.setVisibility(0);
        ImageView imageView = this.A08;
        if (imageView == null) {
            C04220Ms.A0E("imageView");
            throw null;
        } else {
            imageView.setVisibility(8);
        }
    }

    public final void A07(ComponentLoggingData componentLoggingData, LoggingContext loggingContext) {
        this.A0O = loggingContext;
        this.A0J = componentLoggingData;
        if (loggingContext != null) {
            AnonymousClass7JJ.A01().Bb8("client_load_fbpayui_init", AnonymousClass6I7.A00(this));
        }
    }

    public final FrameLayout getActionMenu() {
        return this.A0P;
    }

    public final AnonymousClass699 getBackgroundStyle() {
        return (AnonymousClass699) C86114wI.A0i(this, this.A0R, A0o, 21);
    }

    public ComponentLoggingData getComponentLoggingData() {
        return this.A0J;
    }

    public final String getErrorText() {
        return (String) C86114wI.A0i(this, this.A0S, A0o, 12);
    }

    public int getFbpayWidgetStyleType() {
        return 0;
    }

    public final String getImageUrl() {
        return (String) C86114wI.A0i(this, this.A0T, A0o, 13);
    }

    public final AnonymousClass51J getLeftAddOnIcon() {
        return this.A0K;
    }

    public final AnonymousClass51H getLeftAddOnText() {
        return this.A0L;
    }

    public final FrameLayout getLeftAddOnView() {
        return this.A04;
    }

    public LoggingContext getLoggingContext() {
        return this.A0O;
    }

    public final String getPrimaryText() {
        return (String) C86114wI.A0i(this, this.A0X, A0o, 0);
    }

    public final AnonymousClass51I getPrimaryTextAddOnText() {
        return this.A0Q;
    }

    public final AnonymousClass69Q getPrimaryTextStyle() {
        return (AnonymousClass69Q) C86114wI.A0i(this, this.A0Y, A0o, 15);
    }

    public final CharSequence getQuaternaryLinkableText() {
        return (CharSequence) C86114wI.A0i(this, this.A0Z, A0o, 5);
    }

    public final String getQuaternaryText() {
        return (String) C86114wI.A0i(this, this.A0a, A0o, 3);
    }

    public final Float getQuaternaryTextSizePx() {
        return (Float) C86114wI.A0i(this, this.A0b, A0o, 10);
    }

    public final Integer getQuaternaryTextVerticalSpacing() {
        return (Integer) C86114wI.A0i(this, this.A0c, A0o, 11);
    }

    public final AnonymousClass51G getRightAddOnIcon() {
        return this.A0M;
    }

    public final AnonymousClass51I getRightAddOnText() {
        return this.A0N;
    }

    public final FrameLayout getRightAddOnView() {
        return this.A07;
    }

    public final SpannableStringBuilder getSecondarySpannableText() {
        return (SpannableStringBuilder) C86114wI.A0i(this, this.A0d, A0o, 6);
    }

    public final String getSecondaryText() {
        return (String) C86114wI.A0i(this, this.A0e, A0o, 1);
    }

    public final Float getSecondaryTextSizePx() {
        return (Float) C86114wI.A0i(this, this.A0f, A0o, 8);
    }

    public final AnonymousClass69Q getSecondaryTextStyle() {
        return (AnonymousClass69Q) C86114wI.A0i(this, this.A0g, A0o, 16);
    }

    public final CharSequence getTertiaryLinkableText() {
        return (CharSequence) C86114wI.A0i(this, this.A0h, A0o, 4);
    }

    public final SpannableStringBuilder getTertiarySpannableText() {
        return (SpannableStringBuilder) C86114wI.A0i(this, this.A0i, A0o, 7);
    }

    public final String getTertiaryText() {
        return (String) C86114wI.A0i(this, this.A0j, A0o, 2);
    }

    public final View.OnClickListener getTertiaryTextOnClickListener() {
        return (View.OnClickListener) C86114wI.A0i(this, this.A0k, A0o, 22);
    }

    public final Float getTertiaryTextSizePx() {
        return (Float) C86114wI.A0i(this, this.A0l, A0o, 9);
    }

    public final AnonymousClass69Q getTertiaryTextStyle() {
        return (AnonymousClass69Q) C86114wI.A0i(this, this.A0m, A0o, 17);
    }

    public final AnonymousClass69B getTextStyle() {
        return (AnonymousClass69B) C86114wI.A0i(this, this.A0n, A0o, 14);
    }

    public final void setActionMenu(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A02;
        if (frameLayout2 == null) {
            C04220Ms.A0E("actionMenuContainer");
            throw null;
        }
        A00(frameLayout, frameLayout2);
        this.A0P = frameLayout;
    }

    public final void setErrorText(String str) {
        C86114wI.A1L(this, str, this.A0S, A0o, 12);
    }

    public final void setImageUrl(String str) {
        C86114wI.A1L(this, str, this.A0T, A0o, 13);
    }

    public final void setLeftAddOnIcon(AnonymousClass51J r2) {
        FrameLayout frameLayout = this.A03;
        if (frameLayout == null) {
            C04220Ms.A0E("leftAddOnContainer");
            throw null;
        }
        A00(r2, frameLayout);
        this.A0K = r2;
    }

    public final void setLeftAddOnText(AnonymousClass51H r2) {
        FrameLayout frameLayout = this.A03;
        if (frameLayout == null) {
            C04220Ms.A0E("leftAddOnContainer");
            throw null;
        }
        A00(r2, frameLayout);
        this.A0L = r2;
    }

    public final void setLeftAddOnView(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A03;
        if (frameLayout2 == null) {
            C04220Ms.A0E("leftAddOnContainer");
            throw null;
        }
        A00(frameLayout, frameLayout2);
        this.A04 = frameLayout;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        IDxCListenerShape71S0200000_2_I2 iDxCListenerShape71S0200000_2_I2;
        if (onClickListener != null) {
            iDxCListenerShape71S0200000_2_I2 = C86164wN.A0L(onClickListener, this, 31);
        } else {
            iDxCListenerShape71S0200000_2_I2 = null;
        }
        super.setOnClickListener(iDxCListenerShape71S0200000_2_I2);
    }

    public final void setPrimaryText(String str) {
        C86114wI.A1L(this, str, this.A0X, A0o, 0);
    }

    public final void setPrimaryTextAddOnText(AnonymousClass51I r2) {
        FrameLayout frameLayout = this.A05;
        if (frameLayout == null) {
            C04220Ms.A0E("primaryTextAddOnContainer");
            throw null;
        }
        A00(r2, frameLayout);
        this.A0Q = r2;
    }

    public final void setPrimaryTextLineBreaks(boolean z) {
        C86124wJ.A1U(this, this.A0U, A0o, 18, z);
    }

    public final void setQuaternaryLinkableText(CharSequence charSequence) {
        C86114wI.A1L(this, charSequence, this.A0Z, A0o, 5);
    }

    public final void setQuaternaryText(String str) {
        C86114wI.A1L(this, str, this.A0a, A0o, 3);
    }

    public final void setQuaternaryTextSizePx(Float f) {
        C86114wI.A1L(this, f, this.A0b, A0o, 10);
    }

    public final void setQuaternaryTextVerticalSpacing(Integer num) {
        C86114wI.A1L(this, num, this.A0c, A0o, 11);
    }

    public final void setRightAddOnIcon(AnonymousClass51G r2) {
        FrameLayout frameLayout = this.A06;
        if (frameLayout == null) {
            C04220Ms.A0E("rightAddOnContainer");
            throw null;
        }
        A00(r2, frameLayout);
        this.A0M = r2;
    }

    public final void setRightAddOnText(AnonymousClass51I r2) {
        FrameLayout frameLayout = this.A06;
        if (frameLayout == null) {
            C04220Ms.A0E("rightAddOnContainer");
            throw null;
        }
        A00(r2, frameLayout);
        this.A0N = r2;
    }

    public final void setRightAddOnView(FrameLayout frameLayout) {
        FrameLayout frameLayout2 = this.A06;
        if (frameLayout2 == null) {
            C04220Ms.A0E("rightAddOnContainer");
            throw null;
        }
        A00(frameLayout, frameLayout2);
        this.A07 = frameLayout;
    }

    public final void setSecondarySpannableText(SpannableStringBuilder spannableStringBuilder) {
        C86114wI.A1L(this, spannableStringBuilder, this.A0d, A0o, 6);
    }

    public final void setSecondaryText(String str) {
        C86114wI.A1L(this, str, this.A0e, A0o, 1);
    }

    public final void setSecondaryTextLineBreaks(boolean z) {
        C86124wJ.A1U(this, this.A0V, A0o, 19, z);
    }

    public final void setSecondaryTextSizePx(Float f) {
        C86114wI.A1L(this, f, this.A0f, A0o, 8);
    }

    public final void setShimmerAccessibilityLabel(String str) {
        LinearLayout linearLayout = this.A09;
        if (linearLayout == null) {
            C04220Ms.A0E("shimmerContainer");
            throw null;
        } else {
            linearLayout.setContentDescription(str);
        }
    }

    public final void setTertiaryLinkableText(CharSequence charSequence) {
        C86114wI.A1L(this, charSequence, this.A0h, A0o, 4);
    }

    public final void setTertiarySpannableText(SpannableStringBuilder spannableStringBuilder) {
        C86114wI.A1L(this, spannableStringBuilder, this.A0i, A0o, 7);
    }

    public final void setTertiaryText(String str) {
        C86114wI.A1L(this, str, this.A0j, A0o, 2);
    }

    public final void setTertiaryTextLineBreaks(boolean z) {
        C86124wJ.A1U(this, this.A0W, A0o, 20, z);
    }

    public final void setTertiaryTextOnClickListener(View.OnClickListener onClickListener) {
        C86114wI.A1L(this, onClickListener, this.A0k, A0o, 22);
    }

    public final void setTertiaryTextSizePx(Float f) {
        C86114wI.A1L(this, f, this.A0l, A0o, 9);
    }

    public static final void A00(FrameLayout frameLayout, FrameLayout frameLayout2) {
        int i = 0;
        if (frameLayout2.getChildCount() <= 0 || !C04220Ms.A0I(frameLayout2.getChildAt(0), frameLayout)) {
            frameLayout2.removeAllViews();
            if (frameLayout != null) {
                frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-2, -1));
            } else {
                i = 8;
            }
            frameLayout2.setVisibility(i);
        }
    }

    public final void A04() {
        TypedArray A012 = AnonymousClass7Kz.A01(getContext(), this);
        View view = this.A01;
        if (view == null) {
            C04220Ms.A0E("containerView");
            throw null;
        }
        AnonymousClass7Fe.A00(A012, view, 8, 2131886519);
        A012.recycle();
    }

    public final void A06(int i, int i2) {
        TypedArray A012 = AnonymousClass7Kz.A01(getContext(), this);
        C04220Ms.A06(A012);
        ImageView imageView = this.A08;
        if (imageView == null) {
            C04220Ms.A0E("imageView");
            throw null;
        }
        AnonymousClass7Fe.A00(A012, imageView, i, i2);
        A012.recycle();
    }

    public final void A0B(String str) {
        Context context = getContext();
        this.A00 = C86154wM.A01(context, R.dimen.fbpay_ui_list_cell_image_large_radius);
        setImageUrl(str);
        this.A00 = context.getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
    }

    public void setComponentLoggingData(ComponentLoggingData componentLoggingData) {
        this.A0J = componentLoggingData;
    }

    public void setLoggingContext(LoggingContext loggingContext) {
        this.A0O = loggingContext;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListCell(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ListCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
