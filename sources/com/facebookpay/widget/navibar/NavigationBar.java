package com.facebookpay.widget.navibar;

import X.AnonymousClass0A5;
import X.AnonymousClass0wJ;
import X.AnonymousClass4x8;
import X.AnonymousClass697;
import X.AnonymousClass69Q;
import X.AnonymousClass7Fd;
import X.AnonymousClass7Fe;
import X.AnonymousClass7Kz;
import X.AnonymousClass86W;
import X.C04220Ms;
import X.C18230wP;
import X.C29934Fwk;
import X.C86024w9;
import X.C86114wI;
import X.C86124wJ;
import X.C86134wK;
import X.M6d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxLListenerShape382S0100000_2_I2;
import com.instagram.barcelona.R;
import kotlin.properties.IDxOPropertyShape345S0200000_2_I2;
import kotlin.properties.IDxOPropertyShape881S0100000_2_I2;

public final class NavigationBar extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0A5[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public LinearLayout A09;
    public ProgressBar A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public AnonymousClass4x8 A0E;
    public final IDxLListenerShape382S0100000_2_I2 A0F;
    public final IDxLListenerShape382S0100000_2_I2 A0G;
    public final IDxLListenerShape382S0100000_2_I2 A0H;
    public final C86024w9 A0I;
    public final C86024w9 A0J;
    public final C86024w9 A0K;
    public final C86024w9 A0L;
    public final C86024w9 A0M;
    public final C86024w9 A0N;
    public final C86024w9 A0O;
    public final C86024w9 A0P;
    public final C86024w9 A0Q;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A0G = new IDxLListenerShape382S0100000_2_I2(this, 3);
        this.A0F = new IDxLListenerShape382S0100000_2_I2(this, 2);
        this.A0H = new IDxLListenerShape382S0100000_2_I2(this, 4);
        this.A0a = AnonymousClass86W.A01(this, 64);
        this.A0b = new IDxOPropertyShape345S0200000_2_I2(6, context, this);
        this.A0L = new IDxOPropertyShape345S0200000_2_I2(7, context, this);
        this.A0J = new IDxOPropertyShape881S0100000_2_I2(66, this, false);
        this.A0N = AnonymousClass86W.A01(this, 67);
        this.A0Q = AnonymousClass86W.A01(this, 68);
        this.A0K = new IDxOPropertyShape881S0100000_2_I2(69, this, false);
        this.A0T = new IDxOPropertyShape345S0200000_2_I2(8, context, this);
        this.A0V = AnonymousClass86W.A01(this, 70);
        this.A0Z = AnonymousClass86W.A01(this, 56);
        this.A0R = new IDxOPropertyShape345S0200000_2_I2(context, this, false, 4);
        this.A0W = new IDxOPropertyShape345S0200000_2_I2(context, this, false, 5);
        this.A0S = new IDxOPropertyShape881S0100000_2_I2(57, this, false);
        this.A0M = AnonymousClass86W.A01(this, 58);
        this.A0O = AnonymousClass86W.A01(this, 59);
        this.A0U = AnonymousClass86W.A01(this, 60);
        this.A0X = AnonymousClass86W.A01(this, 61);
        this.A0P = AnonymousClass86W.A01(this, 62);
        this.A0Y = AnonymousClass86W.A01(this, 63);
        this.A0I = new IDxOPropertyShape881S0100000_2_I2(65, this, false);
        AnonymousClass4x8 A002 = AnonymousClass4x8.A00(context);
        this.A0E = A002;
        FrameLayout.inflate(A002, R.layout.fbpay_ui_navigation_bar, this);
        this.A08 = (LinearLayout) AnonymousClass0wJ.A0I(this, R.id.navbar_left_container);
        this.A07 = (LinearLayout) AnonymousClass0wJ.A0I(this, R.id.navbar_center_container);
        this.A09 = (LinearLayout) AnonymousClass0wJ.A0I(this, R.id.navbar_right_container);
        this.A06 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.title_icon);
        this.A0D = (TextView) AnonymousClass0wJ.A0I(this, R.id.title_text);
        this.A04 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.left_icon_button);
        this.A0B = (TextView) AnonymousClass0wJ.A0I(this, R.id.left_text_button);
        this.A0C = (TextView) AnonymousClass0wJ.A0I(this, R.id.right_text_button);
        this.A05 = (ImageView) AnonymousClass0wJ.A0I(this, R.id.right_icon_button);
        Context context2 = this.A0E;
        Context context3 = context2;
        this.A03 = new View(context2 == null ? getContext() : context2);
        this.A0A = (ProgressBar) AnonymousClass0wJ.A0I(this, R.id.progress_icon);
        View view = this.A03;
        String str = "bottomDivider";
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            addView(view, layoutParams);
            TextView textView = this.A0D;
            if (textView != null) {
                AnonymousClass7Fd.A02(textView, AnonymousClass69Q.A0q);
                TextView textView2 = this.A0B;
                if (textView2 != null) {
                    AnonymousClass69Q r1 = AnonymousClass69Q.A0v;
                    AnonymousClass7Fd.A02(textView2, r1);
                    TextView textView3 = this.A0C;
                    if (textView3 != null) {
                        AnonymousClass7Fd.A02(textView3, r1);
                        TextView textView4 = this.A0B;
                        if (textView4 != null) {
                            AnonymousClass7Fd.A00(textView4);
                            TextView textView5 = this.A0C;
                            if (textView5 != null) {
                                AnonymousClass7Fd.A00(textView5);
                                ProgressBar progressBar = this.A0A;
                                if (progressBar == null) {
                                    str = "progressIcon";
                                } else {
                                    Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
                                    if (indeterminateDrawable != null) {
                                        indeterminateDrawable.setColorFilter(AnonymousClass7Kz.A0G().A03(context3 == null ? getContext() : context3, 25), PorterDuff.Mode.MULTIPLY);
                                    }
                                    Context context4 = context3 == null ? getContext() : context3;
                                    AnonymousClass7Kz.A0G();
                                    TypedArray obtainStyledAttributes = context4.obtainStyledAttributes(R.style.FBPayUINavigationBar, C29934Fwk.A0d);
                                    AnonymousClass7Fe.A00(obtainStyledAttributes, AnonymousClass0wJ.A0I(this, R.id.navi_bar_container), 1, R.style.FBPayUINavigationBarContainer);
                                    ImageView imageView = this.A06;
                                    if (imageView == null) {
                                        str = "titleIconView";
                                    } else {
                                        AnonymousClass7Fe.A00(obtainStyledAttributes, imageView, 3, R.style.FBPayUINavigationBarTitleIcon);
                                        TextView textView6 = this.A0D;
                                        if (textView6 != null) {
                                            AnonymousClass7Fe.A00(obtainStyledAttributes, textView6, 4, R.style.FBPayUINavigationBarTitle);
                                            View view2 = this.A03;
                                            if (view2 != null) {
                                                AnonymousClass7Fe.A00(obtainStyledAttributes, view2, 0, R.style.FBPayUINavigationBarBottomDivider);
                                                TextView textView7 = this.A0B;
                                                if (textView7 != null) {
                                                    AnonymousClass7Fe.A00(obtainStyledAttributes, textView7, 2, R.style.FBPayUINavigationBarLeftOrRightTextButton);
                                                    TextView textView8 = this.A0C;
                                                    if (textView8 != null) {
                                                        AnonymousClass7Fe.A00(obtainStyledAttributes, textView8, 2, R.style.FBPayUINavigationBarLeftOrRightTextButton);
                                                        ImageView imageView2 = this.A04;
                                                        if (imageView2 == null) {
                                                            str = "leftIconButton";
                                                        } else {
                                                            AnonymousClass7Fe.A01(imageView2, R.style.FBPayUINavigationBarRightIconButton);
                                                            ImageView imageView3 = this.A05;
                                                            if (imageView3 == null) {
                                                                str = "rightIconButton";
                                                            } else {
                                                                AnonymousClass7Fe.A01(imageView3, R.style.FBPayUINavigationBarRightIconButton);
                                                                obtainStyledAttributes.recycle();
                                                                context3 = context3 == null ? getContext() : context3;
                                                                C04220Ms.A09(context3);
                                                                View view3 = this.A03;
                                                                if (view3 != null) {
                                                                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                                                                    int applyDimension = (int) TypedValue.applyDimension(1, 0.5f, C18230wP.A0E(context3));
                                                                    layoutParams2.height = applyDimension == 0 ? 1 : applyDimension;
                                                                    AnonymousClass7Fe.A02(this, 2);
                                                                    View view4 = this.A03;
                                                                    if (view4 != null) {
                                                                        AnonymousClass7Fe.A02(view4, 19);
                                                                        return;
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
                    C04220Ms.A0E("rightTextButton");
                    throw null;
                }
                C04220Ms.A0E("leftTextButton");
                throw null;
            }
            C04220Ms.A0E("titleTextView");
            throw null;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    static {
        Class<NavigationBar> cls = NavigationBar.class;
        A0c = new AnonymousClass0A5[]{C86134wK.A0x(cls, DialogModule.KEY_TITLE, "getTitle()Ljava/lang/String;"), C86134wK.A0x(cls, "titleIcon", "getTitleIcon()Lcom/facebookpay/widget/style/Icon;"), C86134wK.A0x(cls, "leftIconButtonIcon", "getLeftIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), C86134wK.A0x(cls, "isLeftProfileIcon", "isLeftProfileIcon()Z"), C86134wK.A0x(cls, "leftIconButtonOnClickListener", "getLeftIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), C86134wK.A0x(cls, "leftTextButtonText", "getLeftTextButtonText()Ljava/lang/String;"), C86134wK.A0x(cls, "isRightProfileIcon", "isRightProfileIcon()Z"), C86134wK.A0x(cls, "rightIconButtonIcon", "getRightIconButtonIcon()Lcom/facebookpay/widget/style/Icon;"), C86134wK.A0x(cls, "rightIconButtonOnClickListener", "getRightIconButtonOnClickListener()Landroid/view/View$OnClickListener;"), C86134wK.A0x(cls, "rightTextButtonText", "getRightTextButtonText()Ljava/lang/String;"), C86134wK.A0x(cls, "leftTextButtonTextEnable", "getLeftTextButtonTextEnable()Z"), C86134wK.A0x(cls, "rightTextButtonEnable", "getRightTextButtonEnable()Z"), C86134wK.A0x(cls, "progressIconShow", "getProgressIconShow()Z"), C86134wK.A0x(cls, "leftIconButtonLabel", "getLeftIconButtonLabel()Ljava/lang/String;"), C86134wK.A0x(cls, "leftTextButtonHint", "getLeftTextButtonHint()Ljava/lang/String;"), C86134wK.A0x(cls, "rightIconButtonLabel", "getRightIconButtonLabel()Ljava/lang/String;"), C86134wK.A0x(cls, "rightTextButtonHint", "getRightTextButtonHint()Ljava/lang/String;"), C86134wK.A0x(cls, "leftTextButtonOnClickListener", "getLeftTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), C86134wK.A0x(cls, "rightTextButtonOnClickListener", "getRightTextButtonOnClickListener()Landroid/view/View$OnClickListener;"), C86134wK.A0x(cls, "bottomDividerVisible", "getBottomDividerVisible()Z")};
    }

    public static final void A00(NavigationBar navigationBar) {
        String str;
        LinearLayout linearLayout = navigationBar.A08;
        if (linearLayout == null) {
            str = "navbarLeftContainer";
        } else {
            float measuredWidth = (float) linearLayout.getMeasuredWidth();
            LinearLayout linearLayout2 = navigationBar.A07;
            if (linearLayout2 == null) {
                str = "navbarCenterContainer";
            } else {
                float measuredWidth2 = ((float) linearLayout2.getMeasuredWidth()) * 0.6f;
                LinearLayout linearLayout3 = navigationBar.A09;
                if (linearLayout3 == null) {
                    str = "navbarRightContainer";
                } else {
                    float measuredWidth3 = (float) linearLayout3.getMeasuredWidth();
                    float f = measuredWidth + measuredWidth2 + measuredWidth3;
                    float f2 = measuredWidth / f;
                    if (f2 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    }
                    float f3 = measuredWidth2 / f;
                    if (f3 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f3 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    }
                    float f4 = measuredWidth3 / f;
                    if (f4 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f4 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    }
                    ConstraintLayout constraintLayout = (ConstraintLayout) navigationBar.findViewById(R.id.navi_bar_container);
                    M6d m6d = new M6d();
                    m6d.A0I(constraintLayout);
                    m6d.A09(R.id.navbar_left_container, f2);
                    m6d.A09(R.id.navbar_center_container, f3);
                    m6d.A09(R.id.navbar_right_container, f4);
                    m6d.A0G(constraintLayout);
                    constraintLayout.requestLayout();
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A02(NavigationBar navigationBar) {
        LinearLayout linearLayout = navigationBar.A08;
        if (linearLayout == null) {
            C04220Ms.A0E("navbarLeftContainer");
            throw null;
        } else {
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(navigationBar.A0G);
        }
    }

    public static final void A03(NavigationBar navigationBar) {
        LinearLayout linearLayout = navigationBar.A09;
        if (linearLayout == null) {
            C04220Ms.A0E("navbarRightContainer");
            throw null;
        } else {
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(navigationBar.A0H);
        }
    }

    public final boolean getBottomDividerVisible() {
        return AnonymousClass0wJ.A1X(C86114wI.A0i(this, this.A0I, A0c, 19));
    }

    public final AnonymousClass697 getLeftIconButtonIcon() {
        return (AnonymousClass697) C86114wI.A0i(this, this.A0L, A0c, 2);
    }

    public final String getLeftIconButtonLabel() {
        return (String) C86114wI.A0i(this, this.A0M, A0c, 13);
    }

    public final View.OnClickListener getLeftIconButtonOnClickListener() {
        return (View.OnClickListener) C86114wI.A0i(this, this.A0N, A0c, 4);
    }

    public final String getLeftTextButtonHint() {
        return (String) C86114wI.A0i(this, this.A0O, A0c, 14);
    }

    public final View.OnClickListener getLeftTextButtonOnClickListener() {
        return (View.OnClickListener) C86114wI.A0i(this, this.A0P, A0c, 17);
    }

    public final String getLeftTextButtonText() {
        return (String) C86114wI.A0i(this, this.A0Q, A0c, 5);
    }

    public final boolean getLeftTextButtonTextEnable() {
        return AnonymousClass0wJ.A1X(C86114wI.A0i(this, this.A0R, A0c, 10));
    }

    public final boolean getProgressIconShow() {
        return AnonymousClass0wJ.A1X(C86114wI.A0i(this, this.A0S, A0c, 12));
    }

    public final AnonymousClass697 getRightIconButtonIcon() {
        return (AnonymousClass697) C86114wI.A0i(this, this.A0T, A0c, 7);
    }

    public final String getRightIconButtonLabel() {
        return (String) C86114wI.A0i(this, this.A0U, A0c, 15);
    }

    public final View.OnClickListener getRightIconButtonOnClickListener() {
        return (View.OnClickListener) C86114wI.A0i(this, this.A0V, A0c, 8);
    }

    public final boolean getRightTextButtonEnable() {
        return AnonymousClass0wJ.A1X(C86114wI.A0i(this, this.A0W, A0c, 11));
    }

    public final String getRightTextButtonHint() {
        return (String) C86114wI.A0i(this, this.A0X, A0c, 16);
    }

    public final View.OnClickListener getRightTextButtonOnClickListener() {
        return (View.OnClickListener) C86114wI.A0i(this, this.A0Y, A0c, 18);
    }

    public final String getRightTextButtonText() {
        return (String) C86114wI.A0i(this, this.A0Z, A0c, 9);
    }

    public final String getTitle() {
        return (String) C86114wI.A0i(this, this.A0a, A0c, 0);
    }

    public final AnonymousClass697 getTitleIcon() {
        return (AnonymousClass697) C86114wI.A0i(this, this.A0b, A0c, 1);
    }

    public final void setBottomDividerVisible(boolean z) {
        C86124wJ.A1U(this, this.A0I, A0c, 19, z);
    }

    public final void setLeftIconButtonIcon(AnonymousClass697 r4) {
        C86114wI.A1L(this, r4, this.A0L, A0c, 2);
    }

    public final void setLeftIconButtonLabel(String str) {
        C86114wI.A1L(this, str, this.A0M, A0c, 13);
    }

    public final void setLeftIconButtonOnClickListener(View.OnClickListener onClickListener) {
        C86114wI.A1L(this, onClickListener, this.A0N, A0c, 4);
    }

    public final void setLeftProfileIcon(boolean z) {
        C86124wJ.A1U(this, this.A0J, A0c, 3, z);
    }

    public final void setLeftTextButtonHint(String str) {
        C86114wI.A1L(this, str, this.A0O, A0c, 14);
    }

    public final void setLeftTextButtonOnClickListener(View.OnClickListener onClickListener) {
        C86114wI.A1L(this, onClickListener, this.A0P, A0c, 17);
    }

    public final void setLeftTextButtonText(String str) {
        C86114wI.A1L(this, str, this.A0Q, A0c, 5);
    }

    public final void setLeftTextButtonTextEnable(boolean z) {
        C86124wJ.A1U(this, this.A0R, A0c, 10, z);
    }

    public final void setProgressIconShow(boolean z) {
        C86124wJ.A1U(this, this.A0S, A0c, 12, z);
    }

    public final void setRightIconButtonIcon(AnonymousClass697 r4) {
        C86114wI.A1L(this, r4, this.A0T, A0c, 7);
    }

    public final void setRightIconButtonLabel(String str) {
        C86114wI.A1L(this, str, this.A0U, A0c, 15);
    }

    public final void setRightIconButtonOnClickListener(View.OnClickListener onClickListener) {
        C86114wI.A1L(this, onClickListener, this.A0V, A0c, 8);
    }

    public final void setRightProfileIcon(boolean z) {
        C86124wJ.A1U(this, this.A0K, A0c, 6, z);
    }

    public final void setRightTextButtonEnable(boolean z) {
        C86124wJ.A1U(this, this.A0W, A0c, 11, z);
    }

    public final void setRightTextButtonHint(String str) {
        C86114wI.A1L(this, str, this.A0X, A0c, 16);
    }

    public final void setRightTextButtonOnClickListener(View.OnClickListener onClickListener) {
        C86114wI.A1L(this, onClickListener, this.A0Y, A0c, 18);
    }

    public final void setRightTextButtonText(String str) {
        C86114wI.A1L(this, str, this.A0Z, A0c, 9);
    }

    public final void setTitle(String str) {
        C86114wI.A1L(this, str, this.A0a, A0c, 0);
    }

    public final void setTitleIcon(AnonymousClass697 r4) {
        C86114wI.A1L(this, r4, this.A0b, A0c, 1);
    }

    public static final void A01(NavigationBar navigationBar) {
        ConstraintLayout constraintLayout = (ConstraintLayout) navigationBar.findViewById(R.id.navi_bar_container);
        M6d m6d = new M6d();
        m6d.A0I(constraintLayout);
        m6d.A09(R.id.navbar_left_container, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        m6d.A09(R.id.navbar_center_container, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        m6d.A09(R.id.navbar_right_container, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        m6d.A0G(constraintLayout);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
