package com.instagram.ui.widget.edittext;

import X.AnonymousClass0hB;
import X.AnonymousClass80I;
import X.C14030oh;
import X.C29934Fwk;
import X.C86104wH;
import X.C86134wK;
import X.C86144wL;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.instagram.barcelona.R;

public class ConfirmationCodeEditText extends EditText {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public BroadcastReceiver A05 = null;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public int A0A;
    public Paint A0B;
    public Paint A0C;
    public Paint A0D;
    public Paint A0E;
    public final Runnable A0F = new AnonymousClass80I(this);

    private void A00() {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.A03)});
        setBackground((Drawable) null);
        setCursorVisible(false);
        setInputType(2);
        if (AnonymousClass0hB.A02(getContext())) {
            setLayoutDirection(1);
            setTextDirection(2);
        }
    }

    private void A02(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C29934Fwk.A0L);
            this.A01 = obtainStyledAttributes.getDimension(2, getResources().getDimension(R.dimen.clips_viewer_suggested_title_text_size));
            this.A03 = obtainStyledAttributes.getInt(1, 6);
            this.A08 = obtainStyledAttributes.getBoolean(3, false);
            this.A06 = obtainStyledAttributes.getBoolean(0, false);
            this.A02 = 0;
        }
        A00();
        A01();
    }

    public final void A04(int i, boolean z) {
        float f;
        this.A03 = i;
        this.A08 = z;
        int i2 = this.A04;
        if (z) {
            f = ((float) i2) / (((float) i) + 0.5f);
        } else {
            f = (float) (i2 / i);
        }
        this.A00 = f;
        A00();
        invalidate();
    }

    public final void A05(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.A05 == null) {
            this.A05 = broadcastReceiver;
            int i = Build.VERSION.SDK_INT;
            Context context = getContext();
            if (i >= 33) {
                context.registerReceiver(broadcastReceiver, intentFilter, 4);
            } else {
                context.registerReceiver(broadcastReceiver, intentFilter);
            }
        }
    }

    public final void A06(Integer num, Integer num2, boolean z, boolean z2) {
        float dimension;
        int i;
        if (num != null) {
            dimension = (float) num.intValue();
        } else {
            dimension = getResources().getDimension(R.dimen.clips_viewer_suggested_title_text_size);
        }
        this.A01 = dimension;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = 6;
        }
        this.A03 = i;
        this.A08 = z;
        this.A06 = z2;
        this.A02 = 0;
        A00();
        A01();
    }

    public int getMaximumSize() {
        return this.A03;
    }

    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        float f3;
        boolean A022 = AnonymousClass0hB.A02(getContext());
        if (A022) {
            f = ((float) this.A04) - (this.A00 / 2.0f);
        } else {
            f = this.A00 / 2.0f;
        }
        int i2 = this.A09;
        float f4 = (float) (i2 - 8);
        float descent = ((float) (i2 >> 1)) - ((this.A0E.descent() + this.A0E.ascent()) / 2.0f);
        Editable text = getText();
        int length = text.length();
        boolean A1X = C86134wK.A1X(this.A0A, length);
        if (this.A07 || A1X) {
            i = length;
        } else {
            i = length - 1;
        }
        this.A0A = length;
        int i3 = 0;
        Canvas canvas2 = canvas;
        if (this.A02 != 1) {
            while (true) {
                int i4 = this.A03;
                if (i3 >= i4) {
                    break;
                }
                if (this.A08 && i3 == (i4 >> 1)) {
                    float f5 = this.A00 / 2.0f;
                    if (A022) {
                        f2 -= f5;
                    } else {
                        f2 += f5;
                    }
                }
                if (this.A06 && i3 < i) {
                    canvas2.drawCircle(f2, f4 - ((float) (this.A09 >> 2)), 8.0f, this.A0C);
                } else if (i3 < length) {
                    canvas2.drawText(Character.toString(text.charAt(i3)), f2, f4, this.A0E);
                    if (this.A06) {
                        postDelayed(this.A0F, 750);
                    }
                } else {
                    float f6 = this.A00 / 4.0f;
                    canvas2.drawLine(f2 - f6, f4, f2 + f6, f4, this.A0D);
                }
                float f7 = this.A00;
                if (A022) {
                    f3 = f2 - f7;
                } else {
                    f3 = f2 + f7;
                }
                i3++;
            }
        } else {
            while (true) {
                int i5 = this.A03;
                if (i3 >= i5) {
                    break;
                }
                if (this.A08 && i3 == (i5 >> 1)) {
                    float f8 = this.A00 / 2.0f;
                    if (A022) {
                        f2 -= f8;
                    } else {
                        f2 += f8;
                    }
                }
                if (this.A06 && i3 < i) {
                    canvas2.drawCircle(f2, (f4 - ((float) (this.A09 >> 1))) + 8.0f, 8.0f, this.A0C);
                } else if (i3 < length) {
                    canvas2.drawText(Character.toString(text.charAt(i3)), f2, descent, this.A0E);
                    if (this.A06) {
                        postDelayed(this.A0F, 750);
                    }
                }
                float f9 = this.A00 / 2.5f;
                canvas2.drawRoundRect(new RectF(f2 - f9, (f4 - ((float) this.A09)) + 16.0f, f9 + f2, f4), 12.0f, 12.0f, this.A0B);
                float f10 = this.A00;
                if (A022) {
                    f2 -= f10;
                } else {
                    f2 += f10;
                }
                i3++;
            }
        }
        this.A07 = false;
    }

    public ConfirmationCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(attributeSet);
    }

    private void A01() {
        Paint A0F2 = C86144wL.A0F();
        this.A0E = A0F2;
        A0F2.setTextSize(this.A01);
        this.A0E.setAntiAlias(true);
        this.A0E.setTextAlign(Paint.Align.CENTER);
        Paint paint = this.A0E;
        Context context = getContext();
        C86104wH.A18(context, paint, R.color.igds_primary_text);
        Paint A0F3 = C86144wL.A0F();
        this.A0D = A0F3;
        Paint.Style style = Paint.Style.STROKE;
        A0F3.setStyle(style);
        this.A0D.setStrokeWidth(8.0f);
        C86104wH.A18(context, this.A0D, R.color.igds_primary_text);
        Paint A0F4 = C86144wL.A0F();
        this.A0B = A0F4;
        A0F4.setStyle(style);
        this.A0B.setStrokeWidth(8.0f);
        C86104wH.A18(context, this.A0B, R.color.igds_secondary_text);
        Paint A0F5 = C86144wL.A0F();
        this.A0C = A0F5;
        C86134wK.A13(A0F5);
        C86104wH.A18(context, this.A0C, R.color.igds_primary_text);
    }

    public static int[] A03(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int A002 = (int) (C86134wK.A00() * 252.0f);
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(A002, size);
            } else {
                size = A002;
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != 1073741824) {
            int A003 = (int) (C86134wK.A00() * 40.0f);
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(A003, size2);
            } else {
                size2 = A003;
            }
        }
        return new int[]{size, size2};
    }

    public final void onDetachedFromWindow() {
        int A062 = C14030oh.A06(75124302);
        super.onDetachedFromWindow();
        this.A07 = true;
        removeCallbacks(this.A0F);
        C14030oh.A0D(-1045458131, A062);
    }

    public final void onMeasure(int i, int i2) {
        int A062 = C14030oh.A06(1159419816);
        int[] A032 = A03(i, i2);
        setMeasuredDimension(A032[0], A032[1]);
        C14030oh.A0D(-1191683879, A062);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        int A062 = C14030oh.A06(874948578);
        super.onSizeChanged(i, i2, i3, i4);
        this.A04 = i;
        this.A09 = i2;
        if (this.A08) {
            f = ((float) i) / (((float) this.A03) + 0.5f);
        } else {
            f = (float) (i / this.A03);
        }
        this.A00 = f;
        C14030oh.A0D(-285740953, A062);
    }

    public void setFrameStyle(int i) {
        this.A02 = i;
    }

    public ConfirmationCodeEditText(Context context) {
        super(context);
        A00();
        A01();
    }

    public ConfirmationCodeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(attributeSet);
    }
}
