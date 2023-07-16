package com.instagram.igds.components.mediabutton;

import X.AnonymousClass0wJ;
import X.AnonymousClass21G;
import X.AnonymousClass25V;
import X.AnonymousClass3SM;
import X.C04220Ms;
import X.C09860go;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C308423e;
import X.C308523f;
import X.C63393hP;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class IgdsMediaButton extends FrameLayout {
    public TextView A00;
    public C308423e A01;
    public AnonymousClass25V A02;
    public AnonymousClass3SM A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void A03() {
        this.A03 = null;
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, textView.getCompoundDrawablesRelative()[2], (Drawable) null);
        A00();
    }

    public final void setButtonSize(C308423e r2) {
        C04220Ms.A0B(r2, 0);
        this.A01 = r2;
    }

    public final void setButtonStyle(AnonymousClass25V r5) {
        float f;
        C04220Ms.A0B(r5, 0);
        this.A02 = r5;
        A04();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Context context = getContext();
        gradientDrawable.setColor(context.getColor(this.A02.A00()));
        if (this.A02.A00 == 0) {
            f = C09860go.A03(context, 8);
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        setElevation(f);
        gradientDrawable.setCornerRadius(500.0f);
        setBackground(gradientDrawable);
    }

    public final void setEndAddOn(C308523f r8) {
        int i;
        Drawable mutate;
        C04220Ms.A0B(r8, 0);
        int i2 = r8.A00;
        if (i2 != 1) {
            i = R.drawable.instagram_arrow_right_outline_12;
            if (i2 != 2) {
                i = 0;
            }
        } else {
            i = R.drawable.instagram_chevron_right_pano_outline_12;
        }
        Context context = getContext();
        Drawable drawable = context.getDrawable(i);
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            C63393hP.A03(context, mutate, this.A02.A01());
        }
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], (Drawable) null, drawable, (Drawable) null);
        TextView textView2 = this.A00;
        int i3 = 17;
        if (i != 0) {
            i3 = 8388627;
        }
        textView2.setGravity(i3);
        A00();
    }

    public final void setLabelTextView(TextView textView) {
        C04220Ms.A0B(textView, 0);
        this.A00 = textView;
    }

    public final void setMediaButtonStyle(AnonymousClass25V r2) {
        C04220Ms.A0B(r2, 0);
        this.A02 = r2;
    }

    public final void setSize(C308423e r2) {
        C04220Ms.A0B(r2, 0);
        this.A01 = r2;
    }

    public final void setWidthMode(AnonymousClass21G r4) {
        C04220Ms.A0B(r4, 0);
        int i = -1;
        if (r4 == AnonymousClass21G.CONSTRAINED) {
            i = -2;
        }
        setLayoutParams(new ViewGroup.LayoutParams(i, -2));
    }

    private final void A00() {
        float f;
        int i;
        float A032;
        float A033;
        int i2;
        float A034;
        int i3;
        int i4;
        boolean A1W = AnonymousClass0wJ.A1W(this.A00.getCompoundDrawablesRelative()[0]);
        CharSequence text = this.A00.getText();
        if (text == null || text.length() == 0) {
            C308423e r7 = this.A01;
            Context A0A = C18190wL.A0A(this);
            Drawable drawable = this.A00.getCompoundDrawablesRelative()[0];
            if (drawable != null) {
                int i5 = r7.A00;
                if (i5 == 2) {
                    A033 = C09860go.A03(A0A, 8);
                } else {
                    int i6 = 24;
                    if (i5 == 0) {
                        i6 = 16;
                    }
                    A033 = C09860go.A03(A0A, i6);
                }
                f = (A033 - ((float) drawable.getIntrinsicWidth())) / ((float) 2);
            } else {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            int i7 = r7.A00;
            if (i7 == 2) {
                i = 6;
            } else if (i7 == 0) {
                A032 = C09860go.A03(A0A, 8);
                int i8 = (int) (A032 + f);
                C09860go.A0a(this, i8, i8);
                C09860go.A0b(this, i8, i8);
                this.A00.setCompoundDrawablePadding(0);
                return;
            } else {
                i = 10;
            }
            A032 = C09860go.A03(A0A, i);
            int i82 = (int) (A032 + f);
            C09860go.A0a(this, i82, i82);
            C09860go.A0b(this, i82, i82);
            this.A00.setCompoundDrawablePadding(0);
            return;
        }
        boolean z = false;
        Drawable drawable2 = this.A00.getCompoundDrawablesRelative()[0];
        if (drawable2 != null && this.A01.A00 == 1) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int A012 = C18240wQ.A01(getContext(), 24);
            if (A012 == intrinsicHeight || A012 == intrinsicWidth) {
                z = true;
            }
        }
        C308423e r0 = this.A01;
        Context context = getContext();
        if (z) {
            C04220Ms.A06(context);
            int i9 = 8;
            int i10 = r0.A00;
            if (i10 == 2) {
                i9 = 6;
            } else if (i10 != 0) {
                i9 = 10;
            }
            A034 = C09860go.A03(context, i9) + BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            C04220Ms.A06(context);
            int i11 = r0.A00;
            if (i11 == 2) {
                i2 = 2;
            } else {
                i2 = 14;
                if (i11 == 0) {
                    i2 = 8;
                }
            }
            A034 = C09860go.A03(context, i2);
        }
        int i12 = (int) A034;
        C09860go.A0b(this, i12, i12);
        int i13 = this.A01.A00;
        if (i13 == 2) {
            i3 = 2;
        } else {
            i3 = 6;
            if (i13 == 0) {
                i3 = 4;
            }
        }
        this.A00.setCompoundDrawablePadding(C18240wQ.A01(context, i3));
        int i14 = 12;
        if (this.A01.A00 == 2) {
            i14 = 6;
        }
        int A013 = C18240wQ.A01(context, i14);
        int i15 = this.A01.A00;
        if (i15 == 2) {
            i4 = 6;
        } else {
            i4 = 16;
            if (i15 == 0) {
                i4 = 12;
            }
        }
        int A014 = C18240wQ.A01(context, i4);
        if (A1W) {
            if (z) {
                A013 = A014;
            }
            C09860go.A0a(this, A013, A014);
        } else if (this.A00.getCompoundDrawablesRelative()[2] != null) {
            C09860go.A0a(this, A014, A013);
        } else {
            C09860go.A0a(this, A014, A014);
        }
    }

    private final void setStartDrawable(Drawable drawable) {
        int i;
        C308423e r0 = this.A01;
        Context A0A = C18190wL.A0A(this);
        int i2 = r0.A00;
        if (i2 == 2) {
            i = 8;
        } else {
            i = 24;
            if (i2 == 0) {
                i = 16;
            }
        }
        int A012 = C18240wQ.A01(A0A, i);
        if (drawable != null) {
            drawable.setBounds(0, 0, A012, A012);
        }
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelative(drawable, (Drawable) null, textView.getCompoundDrawablesRelative()[2], (Drawable) null);
    }

    public final void A02() {
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], (Drawable) null, (Drawable) null, (Drawable) null);
        this.A00.setGravity(17);
        A00();
    }

    public final C308423e getButtonSize() {
        return this.A01;
    }

    public final int getCompoundDrawablePadding() {
        return this.A00.getCompoundDrawablePadding();
    }

    public final String getLabel() {
        return this.A00.getText().toString();
    }

    public final TextView getLabelTextView() {
        return this.A00;
    }

    public final float getLabelWidth() {
        this.A00.measure(0, 0);
        return (float) this.A00.getMeasuredWidth();
    }

    public final AnonymousClass25V getMediaButtonStyle() {
        return this.A02;
    }

    public final AnonymousClass3SM getStartAddOn() {
        return this.A03;
    }

    public final void setCompoundDrawablePadding(int i) {
        this.A00.setCompoundDrawablePadding(i);
    }

    public final void setLabel(CharSequence charSequence) {
        CharSequence contentDescription;
        this.A00.setText(charSequence);
        if (!(charSequence == null || charSequence.length() == 0 || ((contentDescription = getContentDescription()) != null && contentDescription.length() != 0))) {
            setContentDescription(charSequence);
        }
        A00();
    }

    public final void setLabelAlpha(float f) {
        this.A00.setAlpha(f);
    }

    private final void A01(C308423e r4, AnonymousClass25V r5, AnonymousClass21G r6) {
        C18210wN.A0y(this);
        TextView textView = this.A00;
        textView.setGravity(17);
        textView.setTextAppearance(R.style.igds_emphasized_body_2);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.A00, layoutParams);
        setSize(r4);
        setButtonStyle(r5);
        setWidthMode(r6);
    }

    private final void setStartIcon(int i) {
        Drawable mutate;
        Drawable drawable = getContext().getDrawable(i);
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            C63393hP.A05(mutate, getLabelColor());
        }
        TextView textView = this.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, textView.getCompoundDrawablesRelative()[2], (Drawable) null);
    }

    public final void A04() {
        Drawable mutate;
        int labelColor = getLabelColor();
        TextView textView = this.A00;
        textView.setTextColor(labelColor);
        AnonymousClass3SM r0 = this.A03;
        if (!(r0 == null || r0.A00 == 0)) {
            C63393hP.A05(textView.getCompoundDrawablesRelative()[0].mutate(), labelColor);
        }
        Drawable drawable = textView.getCompoundDrawablesRelative()[2];
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            C63393hP.A05(mutate, labelColor);
        }
    }

    public int getLabelColor() {
        return getContext().getColor(this.A02.A01());
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        AnonymousClass25V r1 = this.A02;
        if (r1 == AnonymousClass25V.CREATION_FLOW_DESTRUCTIVE || r1 == AnonymousClass25V.CREATION_FLOW_RED_LABEL || r1 == AnonymousClass25V.CREATION_FLOW || r1 == AnonymousClass25V.TTS_SELECTED_BLUE || r1 == AnonymousClass25V.CREATION_FLOW_CHANGES_YELLOW) {
            setLabelAlpha(C18230wP.A00(z ? 1 : 0));
        } else if (getBackground() != null) {
            Drawable background = getBackground();
            int i = 77;
            if (z) {
                i = 255;
            }
            background.setAlpha(i);
        }
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        if (getBackground() != null) {
            Drawable background = getBackground();
            int i = 255;
            if (z) {
                i = 179;
            }
            background.setAlpha(i);
        }
    }

    public final void setStartAddOn(AnonymousClass3SM r1) {
        this.A03 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r8 == 6) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        if (r1 == 2) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgdsMediaButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r4 = 1
            X.C04220Ms.A0B(r11, r4)
            r10.<init>(r11, r12, r13)
            X.25V r6 = X.AnonymousClass25V.PRIMARY
            r10.A02 = r6
            X.23e r5 = X.C308423e.SMALL
            r10.A01 = r5
            android.content.Context r3 = r10.getContext()
            com.instagram.common.ui.base.IgTextView r0 = new com.instagram.common.ui.base.IgTextView
            r0.<init>(r3)
            r10.A00 = r0
            if (r12 != 0) goto L_0x0022
            X.21G r0 = X.AnonymousClass21G.CONSTRAINED
            r10.A01(r5, r6, r0)
            return
        L_0x0022:
            int[] r0 = X.C29934Fwk.A1Q
            android.content.res.TypedArray r7 = r3.obtainStyledAttributes(r12, r0)
            X.C04220Ms.A06(r7)
            r9 = 4
            r2 = 0
            int r8 = r7.getInt(r9, r2)
            if (r8 == r2) goto L_0x0061
            X.25V r1 = X.AnonymousClass25V.SECONDARY
            if (r8 == r4) goto L_0x0060
            X.25V r1 = X.AnonymousClass25V.DEFAULT_ON_BLACK
            r0 = 2
            if (r8 == r0) goto L_0x0060
            X.25V r1 = X.AnonymousClass25V.CREATION_FLOW
            r0 = 3
            if (r8 == r0) goto L_0x0060
            X.25V r1 = X.AnonymousClass25V.CREATION_FLOW_RED_LABEL
            if (r8 == r9) goto L_0x0060
            X.25V r1 = X.AnonymousClass25V.CREATION_FLOW_DESTRUCTIVE
            r0 = 7
            if (r8 == r0) goto L_0x0060
            X.25V r1 = X.AnonymousClass25V.CREATION_FLOW_BLUE
            r0 = 8
            if (r8 == r0) goto L_0x0060
            X.25V r1 = X.AnonymousClass25V.CREATION_FLOW_NO_BG
            r0 = 9
            if (r8 == r0) goto L_0x0060
            X.25V r1 = X.AnonymousClass25V.SECONDARY_ON_BLACK
            r0 = 5
            if (r8 == r0) goto L_0x0060
            X.25V r1 = X.AnonymousClass25V.PRIMARY_DESTRUCTIVE
            r0 = 6
            if (r8 != r0) goto L_0x0061
        L_0x0060:
            r6 = r1
        L_0x0061:
            r0 = 3
            int r1 = r7.getInt(r0, r2)
            X.23e r8 = X.C308423e.LARGE
            if (r1 == r4) goto L_0x0071
            if (r1 == r2) goto L_0x00c3
            X.23e r8 = X.C308423e.X_SMALL
            r0 = 2
            if (r1 != r0) goto L_0x00c3
        L_0x0071:
            r0 = 5
            int r1 = r7.getInt(r0, r2)
            X.21G r0 = X.AnonymousClass21G.FLEXIBLE
            if (r1 == r4) goto L_0x007c
            X.21G r0 = X.AnonymousClass21G.CONSTRAINED
        L_0x007c:
            r10.A01(r8, r6, r0)
            java.lang.String r4 = X.AnonymousClass2LX.A00(r3, r7, r4)
            android.widget.TextView r0 = r10.A00
            r0.setText(r4)
            android.widget.TextView r3 = r10.A00
            r1 = 2
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r7.getInt(r1, r0)
            r3.setMaxLines(r0)
            if (r4 == 0) goto L_0x00ac
            int r0 = r4.length()
            if (r0 == 0) goto L_0x00ac
            java.lang.CharSequence r0 = r10.getContentDescription()
            if (r0 == 0) goto L_0x00a9
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00ac
        L_0x00a9:
            r10.setContentDescription(r4)
        L_0x00ac:
            int r1 = r7.getResourceId(r2, r2)
            if (r1 == 0) goto L_0x00bc
            r10.setStartIcon(r1)
            X.3SM r0 = new X.3SM
            r0.<init>((int) r1)
            r10.A03 = r0
        L_0x00bc:
            r7.recycle()
            r10.A00()
            return
        L_0x00c3:
            r8 = r5
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.mediabutton.IgdsMediaButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void setStartAddOn(AnonymousClass3SM r2, CharSequence charSequence) {
        C04220Ms.A0B(r2, 0);
        if (!(charSequence == null || charSequence.length() == 0)) {
            setContentDescription(charSequence);
        }
        int i = r2.A00;
        if (i != 0) {
            setStartIcon(i);
        } else {
            Drawable drawable = r2.A01;
            if (drawable != null) {
                setStartDrawable(drawable);
            }
        }
        this.A03 = r2;
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context, AnonymousClass25V r4, C308423e r5, AnonymousClass21G r6) {
        super(context);
        AnonymousClass0wJ.A1O(context, r4);
        AnonymousClass0wJ.A1R(r5, r6);
        this.A02 = AnonymousClass25V.PRIMARY;
        this.A01 = C308423e.SMALL;
        this.A00 = new IgTextView(getContext());
        A01(r5, r4, r6);
    }

    public /* synthetic */ IgdsMediaButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsMediaButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
