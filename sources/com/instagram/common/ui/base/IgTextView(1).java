package com.instagram.common.ui.base;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0h8;
import X.AnonymousClass0hB;
import X.AnonymousClass3JA;
import X.AnonymousClass7FY;
import X.C10450iM;
import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C18240wQ;
import X.C18650xZ;
import X.C29934Fwk;
import X.GQD;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class IgTextView extends TextView {
    public boolean A00 = true;
    public int A01 = Integer.MAX_VALUE;

    private void A00(Context context, AttributeSet attributeSet, int i, int i2) {
        int[] iArr = C29934Fwk.A1H;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        boolean A1V = C18200wM.A1V(context, obtainStyledAttributes, this);
        C18210wN.A0q(context, obtainStyledAttributes, this, A1V ? 1 : 0);
        C18200wM.A13(context, obtainStyledAttributes, this, A1V);
        C18240wQ.A0q(context, obtainStyledAttributes, this, A1V);
        obtainStyledAttributes.recycle();
        if (GQD.A01) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            if (obtainStyledAttributes2.hasValue(4)) {
                this.A00 = obtainStyledAttributes2.getBoolean(4, A1V);
            } else {
                this.A00 = A1V;
            }
            obtainStyledAttributes2.recycle();
        }
        if (AnonymousClass0hB.A01()) {
            if (getTextAlignment() == 0) {
                setTextAlignment(1);
            }
            if (getTextDirection() == 0 || getTextDirection() == 1) {
                setTextDirection(5);
            }
        }
    }

    private void setAndSanityCheckMaximum(int i) {
        if (i < 0) {
            C10450iM.A00().CuW("IgTextView.sanityCheckMaximum", AnonymousClass00U.A0J("Invalid maximum: ", i));
        }
        this.A01 = i;
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.A00) {
            boolean A1Z = C18180wK.A1Z(getText(), charSequence);
            if (charSequence == null) {
                charSequence = null;
            } else if (!A1Z) {
                charSequence = GQD.A00().BfL(-1, charSequence);
            }
        }
        if (AnonymousClass3JA.A00(getContext()) && (charSequence instanceof Spanned)) {
            CharSequence charSequence2 = charSequence;
            int i = 0;
            C18650xZ[] r6 = (C18650xZ[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), C18650xZ.class);
            int length = r6.length;
            if (length != 0) {
                SpannableStringBuilder A0E = C18200wM.A0E(charSequence);
                do {
                    C18650xZ r3 = r6[i];
                    String str = r3.A00;
                    if (!TextUtils.isEmpty(str)) {
                        A0E.replace(A0E.getSpanStart(r3), A0E.getSpanEnd(r3), str);
                    }
                    i++;
                } while (i < length);
                charSequence2 = A0E.toString();
            }
            if (charSequence2 != null && !charSequence2.equals(getContentDescription())) {
                setContentDescription(charSequence2.toString());
            }
        }
        super.setText(charSequence, bufferType);
    }

    public IgTextView(Context context) {
        super(context);
        A00(context, (AttributeSet) null, 0, 0);
    }

    public int getExtendedPaddingTop() {
        try {
            return super.getExtendedPaddingTop();
        } catch (ArrayIndexOutOfBoundsException e) {
            C10450iM.A00().Cuc("IgTextView.getExtendedPaddingTop", AnonymousClass00U.A0J("Debug info: mMaximum=", this.A01), 1, e);
            throw e;
        }
    }

    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            if (!AnonymousClass0h8.A06(this, getText())) {
                throw e;
            }
        }
    }

    public void setLines(int i) {
        super.setLines(i);
        setAndSanityCheckMaximum(i);
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        setAndSanityCheckMaximum(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        Integer num;
        super.setOnClickListener(onClickListener);
        if (AnonymousClass3JA.A00(getContext())) {
            Integer A002 = AnonymousClass7FY.A00(this);
            if (onClickListener != null) {
                if (A002.equals(AnonymousClass006.A00)) {
                    num = AnonymousClass006.A01;
                } else {
                    return;
                }
            } else if (A002.equals(AnonymousClass006.A01)) {
                num = AnonymousClass006.A00;
            } else {
                return;
            }
            AnonymousClass7FY.A02(this, num);
        }
    }

    public void setTransformText(boolean z) {
        this.A00 = z;
    }

    public IgTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet, i, 0);
    }

    public IgTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet, i, i2);
    }

    public IgTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet, 0, 0);
    }
}
