package com.instagram.igds.components.bottombutton;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass21F;
import X.AnonymousClass7FY;
import X.C04220Ms;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C29601Fr1;
import X.C29934Fwk;
import X.C63403hQ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class IgdsBottomButtonLayout extends LinearLayout {
    public View A00;
    public TextView A01;
    public TextView A02;
    public View A03;
    public View A04;
    public TextView A05;
    public TextView A06;
    public SpinnerImageView A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsBottomButtonLayout(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
        A02(context, (AttributeSet) null);
    }

    private final void A01(Context context, TypedArray typedArray, View view, TextView textView, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            textView.setText(context.getText(resourceId));
            view.setContentDescription(context.getText(resourceId));
            view.setVisibility(0);
            textView.setVisibility(0);
        } else {
            A03(view, textView, this, typedArray.getText(i));
        }
        A00();
    }

    private final void A02(Context context, AttributeSet attributeSet) {
        AnonymousClass21F r0;
        setOrientation(1);
        Context context2 = context;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C29934Fwk.A05, 0, 0);
        C04220Ms.A06(obtainStyledAttributes);
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        if (z) {
            LinearLayout.inflate(context, R.layout.bottom_button_full_width, this);
            TextView textView = (TextView) AnonymousClass0wJ.A0J(this, R.id.bb_primary_action);
            this.A05 = textView;
            if (textView != null) {
                this.A00 = textView;
                A01(context2, obtainStyledAttributes, textView, textView, 3);
            }
            C04220Ms.A0E("primaryAction");
            throw null;
        }
        LinearLayout.inflate(context, R.layout.bottom_button_layout, this);
        this.A05 = (TextView) AnonymousClass0wJ.A0J(this, R.id.bb_primary_action);
        View A0K = AnonymousClass0wJ.A0K(this, R.id.bb_primary_action_container);
        this.A00 = A0K;
        TextView textView2 = this.A05;
        if (textView2 != null) {
            A01(context2, obtainStyledAttributes, A0K, textView2, 3);
            SpinnerImageView spinnerImageView = (SpinnerImageView) requireViewById(R.id.bb_primary_spinner);
            this.A07 = spinnerImageView;
            if (spinnerImageView != null) {
                spinnerImageView.setImageDrawable(C63403hQ.A01(context, R.drawable.nav_spinner, R.color.igds_icon_on_color));
            }
            TextView A0L = AnonymousClass0wJ.A0L(this, R.id.bb_secondary_action);
            this.A06 = A0L;
            if (A0L != null) {
                A01(context2, obtainStyledAttributes, A0L, A0L, 4);
            }
            TextView A0L2 = AnonymousClass0wJ.A0L(this, R.id.bb_footer);
            this.A01 = A0L2;
            if (A0L2 != null) {
                A01(context2, obtainStyledAttributes, A0L2, A0L2, 1);
                C18180wK.A0z(A0L2);
                A0L2.setHighlightColor(0);
                A0L2.setFocusable(true);
            }
            TextView A0L3 = AnonymousClass0wJ.A0L(this, R.id.bb_footer_above_action);
            this.A02 = A0L3;
            if (A0L3 != null) {
                A01(context2, obtainStyledAttributes, A0L3, A0L3, 1);
                C18180wK.A0z(A0L3);
                A0L3.setHighlightColor(0);
                A0L3.setFocusable(true);
            }
            boolean z2 = obtainStyledAttributes.getBoolean(5, true);
            this.A03 = requireViewById(R.id.bb_divider);
            setDividerVisible(z2);
            this.A04 = requireViewById(R.id.bb_extra_padding);
            A05(this);
        }
        C04220Ms.A0E("primaryAction");
        throw null;
        if (obtainStyledAttributes.getInt(0, 0) == 1) {
            r0 = AnonymousClass21F.ON_MEDIA;
        } else {
            r0 = AnonymousClass21F.DEFAULT;
        }
        A04(r0, z);
        View view = this.A00;
        if (view == null) {
            C04220Ms.A0E("primaryActionContainer");
            throw null;
        }
        Integer num = AnonymousClass006.A01;
        AnonymousClass7FY.A02(view, num);
        TextView textView3 = this.A05;
        if (textView3 != null) {
            C29601Fr1.A00(textView3);
            TextView textView4 = this.A06;
            if (textView4 != null) {
                AnonymousClass7FY.A02(textView4, num);
                C29601Fr1.A00(textView4);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        C04220Ms.A0E("primaryAction");
        throw null;
    }

    public static final void A03(View view, TextView textView, IgdsBottomButtonLayout igdsBottomButtonLayout, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            view.setVisibility(8);
        } else {
            textView.setText(charSequence);
            view.setVisibility(0);
            view.setContentDescription(charSequence);
        }
        igdsBottomButtonLayout.A00();
    }

    public final void setButtonType(AnonymousClass21F r2) {
        C04220Ms.A0B(r2, 0);
        A04(r2, C18220wO.A1U(this.A06));
    }

    public final void setFooterAboveActionText(CharSequence charSequence) {
        TextView textView = this.A02;
        if (textView != null) {
            A03(textView, textView, this, charSequence);
            textView.setBreakStrategy(2);
            A05(this);
        }
    }

    public final void setFooterText(CharSequence charSequence) {
        TextView textView = this.A01;
        if (textView != null) {
            A03(textView, textView, this, charSequence);
            textView.setBreakStrategy(0);
            A05(this);
        }
    }

    private final void A00() {
        TextView textView;
        TextView textView2;
        CharSequence text;
        CharSequence text2;
        TextView textView3 = this.A05;
        if (textView3 == null) {
            C04220Ms.A0E("primaryAction");
            throw null;
        }
        CharSequence text3 = textView3.getText();
        int i = 0;
        if ((text3 == null || text3.length() == 0) && (((textView = this.A06) == null || (text2 = textView.getText()) == null || text2.length() == 0) && ((textView2 = this.A01) == null || (text = textView2.getText()) == null || text.length() == 0))) {
            i = 8;
        }
        setVisibility(i);
    }

    private final void A04(AnonymousClass21F r6, boolean z) {
        if (r6 == AnonymousClass21F.ON_MEDIA) {
            String str = "primaryAction";
            TextView textView = this.A05;
            if (z) {
                if (textView != null) {
                    textView.setTextAppearance(2131886723);
                    TextView textView2 = this.A05;
                    if (textView2 != null) {
                        textView2.setBackground(getContext().getDrawable(R.drawable.primary_media_bottom_button_full_width_selector));
                        return;
                    }
                }
            } else if (textView != null) {
                textView.setTextAppearance(2131886692);
                Context context = getContext();
                Drawable drawable = context.getDrawable(R.drawable.primary_media_bottom_button_selector);
                View view = this.A00;
                if (view == null) {
                    str = "primaryActionContainer";
                } else {
                    view.setBackground(drawable);
                    TextView textView3 = this.A06;
                    if (textView3 != null) {
                        textView3.setTextAppearance(2131886691);
                    }
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.autofill_optimization_title_top_margin);
                    TextView textView4 = this.A01;
                    if (textView4 != null) {
                        textView4.setShadowLayer((float) dimensionPixelSize, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, context.getColor(R.color.facepile_inner_stroke_color));
                        return;
                    }
                    return;
                }
            }
            C04220Ms.A0E(str);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.getVisibility() != 8) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r4) {
        /*
            android.widget.TextView r0 = r4.A06
            r3 = 1
            r2 = 8
            if (r0 == 0) goto L_0x000e
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == r2) goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            android.widget.TextView r0 = r4.A01
            if (r0 == 0) goto L_0x0026
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L_0x0026
        L_0x0019:
            android.view.View r0 = r4.A04
            if (r0 == 0) goto L_0x0025
            if (r1 == 0) goto L_0x0022
            if (r3 == 0) goto L_0x0022
            r2 = 0
        L_0x0022:
            r0.setVisibility(r2)
        L_0x0025:
            return
        L_0x0026:
            r3 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout.A05(com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout):void");
    }

    public final void setDividerVisible(boolean z) {
        View view = this.A03;
        if (view != null) {
            view.setVisibility(C18190wL.A00(z ? 1 : 0));
        }
    }

    public final void setPrimaryActionIsLoading(boolean z) {
        SpinnerImageView spinnerImageView = this.A07;
        if (spinnerImageView != null) {
            int i = 0;
            spinnerImageView.setVisibility(C18190wL.A00(z ? 1 : 0));
            TextView textView = this.A05;
            if (textView == null) {
                C04220Ms.A0E("primaryAction");
                throw null;
            }
            if (z) {
                i = 8;
            }
            textView.setVisibility(i);
            setPrimaryButtonEnabled(!z);
        }
    }

    public final void setPrimaryActionOnClickListener(View.OnClickListener onClickListener) {
        View view = this.A00;
        if (view == null) {
            C04220Ms.A0E("primaryActionContainer");
            throw null;
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void setPrimaryActionText(CharSequence charSequence) {
        String str;
        TextView textView = this.A05;
        if (textView == null) {
            str = "primaryAction";
        } else {
            View view = this.A00;
            if (view == null) {
                str = "primaryActionContainer";
            } else {
                A03(view, textView, this, charSequence);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void setPrimaryButtonEnabled(boolean z) {
        View view = this.A00;
        if (view != null) {
            view.setEnabled(z);
            View view2 = this.A00;
            if (view2 != null) {
                Drawable background = view2.getBackground();
                if (background != null) {
                    int i = 77;
                    if (z) {
                        i = 255;
                    }
                    background.setAlpha(i);
                    return;
                }
                return;
            }
        }
        C04220Ms.A0E("primaryActionContainer");
        throw null;
    }

    public final void setSecondaryActionOnClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.A06;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public final void setSecondaryActionText(CharSequence charSequence) {
        TextView textView = this.A06;
        if (textView != null) {
            A03(textView, textView, this, charSequence);
            A05(this);
        }
    }

    public final void setSecondaryButtonEnabled(boolean z) {
        TextView textView = this.A06;
        if (textView != null) {
            textView.setEnabled(z);
        }
        TextView textView2 = this.A06;
        if (textView2 != null) {
            float f = 0.25f;
            if (z) {
                f = 1.0f;
            }
            textView2.setAlpha(f);
        }
    }

    public final void setPrimaryAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        setPrimaryActionText(charSequence);
        setPrimaryActionOnClickListener(onClickListener);
    }

    public final void setSecondaryAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        setSecondaryActionText(charSequence);
        setSecondaryActionOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsBottomButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        A02(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsBottomButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04220Ms.A0B(context, 1);
        A02(context, attributeSet);
    }
}
