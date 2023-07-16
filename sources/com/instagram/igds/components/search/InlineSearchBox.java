package com.instagram.igds.components.search;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass4P5;
import X.C04220Ms;
import X.C121907Is;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C25766Dre;
import X.C28174Ezk;
import X.C29934Fwk;
import X.C83604rg;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.facebook.common.dextricks.Constants;
import com.facebook.redex.IDxLListenerShape381S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.bouncylistener.IDxTListenerShape137S0100000_1_I2;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class InlineSearchBox extends LinearLayout {
    public View.OnFocusChangeListener A00;
    public ColorFilterAlphaImageView A01;
    public C83604rg A02;
    public boolean A03;
    public boolean A04;
    public View A05;
    public InputMethodManager A06;
    public ColorFilterAlphaImageView A07;
    public ColorFilterAlphaImageView A08;
    public AnimatedHintsTextLayout A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final BackInterceptEditText A0D;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineSearchBox(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void A05(int i) {
        if (i == 1) {
            A02();
        }
    }

    public final void A06(View.OnClickListener onClickListener, int i, int i2) {
        this.A0A = true;
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A01;
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.setImageResource(i);
            C25766Dre dre = new C25766Dre(colorFilterAlphaImageView);
            dre.A04 = false;
            dre.A02 = new IDxTListenerShape137S0100000_1_I2(onClickListener, 2);
            dre.A03();
            colorFilterAlphaImageView.setContentDescription(getContext().getString(i2));
        }
        A00(this, C18180wK.A1W(getSearchString().length()));
    }

    public final void setEditTextOnBackListener(AnonymousClass0ZU r2) {
        C04220Ms.A0B(r2, 0);
        this.A0D.A00 = r2;
    }

    public final void setHint(String str) {
        C04220Ms.A0B(str, 0);
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A09;
        if (animatedHintsTextLayout != null) {
            animatedHintsTextLayout.setHints(C18180wK.A0n(str));
        }
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            backInterceptEditText.setContentDescription(str);
        }
    }

    public final void setHints(List list) {
        C04220Ms.A0B(list, 0);
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A09;
        if (animatedHintsTextLayout != null) {
            animatedHintsTextLayout.setHints(list);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r5 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.igds.components.search.InlineSearchBox r4, boolean r5) {
        /*
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r4.A0D
            r3 = 0
            if (r0 == 0) goto L_0x0039
            boolean r2 = r0.isFocused()
        L_0x0009:
            r0 = r5 ^ 1
            r4.setVisibilityOfClearButton(r0)
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0022
            r4.setVisibilityOfCustomActionButton(r5)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r4.A01
            if (r1 == 0) goto L_0x0022
            if (r2 == 0) goto L_0x001e
            r0 = 1
            if (r5 != 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r1.setSelected(r0)
        L_0x0022:
            r4.setSelected(r2)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r4.A08
            if (r0 == 0) goto L_0x002c
            r0.setEnabled(r2)
        L_0x002c:
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r4.A07
            if (r0 == 0) goto L_0x0038
            if (r2 == 0) goto L_0x0035
            if (r5 != 0) goto L_0x0035
            r3 = 1
        L_0x0035:
            r0.setSelected(r3)
        L_0x0038:
            return
        L_0x0039:
            r2 = 0
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.search.InlineSearchBox.A00(com.instagram.igds.components.search.InlineSearchBox, boolean):void");
    }

    public final void A01() {
        C83604rg r1 = this.A02;
        if (r1 != null) {
            r1.onSearchCleared(getSearchString());
        }
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            C18250wR.A0t(backInterceptEditText);
            backInterceptEditText.requestFocus();
        }
        A03();
    }

    public final void A03() {
        if (!this.A0B) {
            this.A0C = true;
            getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape381S0100000_1_I2(this, 1));
            return;
        }
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            backInterceptEditText.requestFocus();
        }
        InputMethodManager inputMethodManager = this.A06;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(backInterceptEditText, 0);
            return;
        }
        throw C18180wK.A0a("inputMethodManager is null");
    }

    public final void A07(String str, boolean z) {
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            backInterceptEditText.setText(str);
        }
        if (z && backInterceptEditText != null) {
            backInterceptEditText.requestFocus();
        }
    }

    public final void clearFocus() {
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            backInterceptEditText.setFocusableInTouchMode(false);
            super.clearFocus();
            backInterceptEditText.clearFocus();
            backInterceptEditText.setFocusableInTouchMode(true);
        }
    }

    public final String getSearchString() {
        Editable editable;
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            editable = backInterceptEditText.getText();
        } else {
            editable = null;
        }
        String valueOf = String.valueOf(editable);
        int length = valueOf.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1U = C18230wP.A1U(valueOf.charAt(i2));
            if (z) {
                if (!A1U) {
                    break;
                }
                length--;
            } else if (!A1U) {
                z = true;
            } else {
                i++;
            }
        }
        return C18220wO.A0s(valueOf, length, i);
    }

    public final Integer getSelectionEnd() {
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            return Integer.valueOf(backInterceptEditText.getSelectionEnd());
        }
        return null;
    }

    public final Integer getSelectionStart() {
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            return Integer.valueOf(backInterceptEditText.getSelectionStart());
        }
        return null;
    }

    public final void setEditTextAndCustomActionEnabled(boolean z) {
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            backInterceptEditText.setEnabled(z);
        }
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A01;
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.setEnabled(z);
        }
    }

    public final void setEndMargin(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.A05;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        C04220Ms.A0C(layoutParams, C28174Ezk.A00(4));
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(i);
    }

    public final void setImeOptions(int i) {
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            backInterceptEditText.setImeOptions(i | 33554432);
        }
    }

    public final void setSearchRowBackgroundColor(int i) {
        View view = this.A05;
        if (view != null) {
            view.setBackgroundResource(i);
        }
    }

    public final void setSelection(int i) {
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            backInterceptEditText.setSelection(i);
        }
    }

    public final void setTextsize(float f) {
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            backInterceptEditText.setTextSize(0, f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r3 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setVisibilityOfClearButton(boolean r3) {
        /*
            r2 = this;
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r2.A07
            if (r1 == 0) goto L_0x0010
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x000b
            r0 = 0
            if (r3 != 0) goto L_0x000d
        L_0x000b:
            r0 = 8
        L_0x000d:
            r1.setVisibility(r0)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.search.InlineSearchBox.setVisibilityOfClearButton(boolean):void");
    }

    public final void setVisibilityOfCustomActionButton(boolean z) {
        ColorFilterAlphaImageView colorFilterAlphaImageView;
        if (this.A0A && (colorFilterAlphaImageView = this.A01) != null) {
            colorFilterAlphaImageView.setVisibility(C18190wL.A00(z ? 1 : 0));
        }
    }

    public final void A02() {
        clearFocus();
        InputMethodManager inputMethodManager = this.A06;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            this.A0C = false;
            return;
        }
        throw C18180wK.A0a("inputMethodManager is null");
    }

    public final void A04(int i) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
        View view = this.A05;
        if (view != null) {
            view.setBackgroundResource(C121907Is.A02(contextThemeWrapper, R.attr.inlineSearchBarBackground));
        }
        int A002 = C121907Is.A00(contextThemeWrapper, R.attr.textColorPrimary);
        int A003 = C121907Is.A00(contextThemeWrapper, R.attr.textColorSecondary);
        BackInterceptEditText backInterceptEditText = this.A0D;
        if (backInterceptEditText != null) {
            backInterceptEditText.setTextColor(A002);
        }
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A08;
        if (colorFilterAlphaImageView != null) {
            colorFilterAlphaImageView.A03(A003, A002);
        }
        ColorFilterAlphaImageView colorFilterAlphaImageView2 = this.A07;
        if (colorFilterAlphaImageView2 != null) {
            colorFilterAlphaImageView2.A03(A003, A002);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A0B = true;
        if (this.A0C) {
            post(new AnonymousClass4P5(this));
            this.A0C = false;
        }
    }

    public final void setCustomActionEnabled(boolean z) {
        this.A0A = z;
    }

    public final void setEditTextOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00 = onFocusChangeListener;
    }

    public final void setListener(C83604rg r1) {
        this.A02 = r1;
    }

    public final void setPermanentlyHideClearButton(boolean z) {
        this.A03 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineSearchBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View view;
        BackInterceptEditText backInterceptEditText;
        C04220Ms.A0B(context, 1);
        this.A04 = true;
        View inflate = LayoutInflater.from(context).inflate(R.layout.igds_search_row, this);
        setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        this.A05 = inflate.requireViewById(R.id.search_row);
        this.A09 = (AnimatedHintsTextLayout) inflate.requireViewById(R.id.animated_hints_text_layout);
        BackInterceptEditText backInterceptEditText2 = (BackInterceptEditText) AnonymousClass0wJ.A0J(inflate, R.id.search_edit_text);
        this.A0D = backInterceptEditText2;
        C18230wP.A17(backInterceptEditText2, this, 10);
        C18210wN.A10(backInterceptEditText2, 3, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29934Fwk.A1X);
            C04220Ms.A06(obtainStyledAttributes);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setHint(resourceId);
            }
            if (!obtainStyledAttributes.getBoolean(2, true) && (backInterceptEditText = this.A0D) != null) {
                backInterceptEditText.setTextIsSelectable(false);
                backInterceptEditText.setFocusable(false);
                backInterceptEditText.setFocusableInTouchMode(false);
                backInterceptEditText.setEnabled(false);
                backInterceptEditText.setClickable(false);
                backInterceptEditText.setLongClickable(false);
                backInterceptEditText.clearFocus();
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (!(resourceId2 == 0 || (view = this.A05) == null)) {
                view.setBackgroundResource(resourceId2);
            }
            obtainStyledAttributes.recycle();
        }
        backInterceptEditText2.setContentDescription(context.getString(2131835293));
        AnimatedHintsTextLayout animatedHintsTextLayout = this.A09;
        if (animatedHintsTextLayout != null) {
            animatedHintsTextLayout.getHintTextView().setImportantForAccessibility(4);
        }
        View requireViewById = inflate.requireViewById(R.id.action_button);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView");
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) requireViewById;
        C25766Dre dre = new C25766Dre(colorFilterAlphaImageView);
        dre.A04 = false;
        dre.A02 = new IDxTListenerShape137S0100000_1_I2(this, 1);
        dre.A03();
        colorFilterAlphaImageView.setContentDescription(colorFilterAlphaImageView.getResources().getString(2131823316));
        this.A07 = colorFilterAlphaImageView;
        this.A01 = (ColorFilterAlphaImageView) inflate.requireViewById(R.id.custom_action_button);
        this.A08 = (ColorFilterAlphaImageView) inflate.requireViewById(R.id.search_bar_glyph);
        A00(this, C18180wK.A1W(getSearchString().length()));
        Object systemService = context.getSystemService("input_method");
        C04220Ms.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.A06 = (InputMethodManager) systemService;
    }

    public final void setHint(int i) {
        setHint(AnonymousClass0wJ.A0k(getContext(), i));
    }

    public /* synthetic */ InlineSearchBox(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineSearchBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineSearchBox(Context context, boolean z) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
        this.A04 = z;
    }
}
