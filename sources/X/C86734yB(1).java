package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.litho.TextContent;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4yB  reason: invalid class name and case insensitive filesystem */
public final class C86734yB extends Drawable implements Drawable.Callback, C41781Mbv, TextContent {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public Path A06;
    public Layout A07;
    public AZD A08;
    public CharSequence A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public ClickableSpan[] A0E;
    public ImageSpan[] A0F;
    public Paint A0G;

    public static AZD A00(C86734yB r10) {
        C86734yB r5 = r10;
        Layout layout = r10.A07;
        if (layout == null) {
            return null;
        }
        AZD azd = r10.A08;
        if (azd != null) {
            return azd;
        }
        CharSequence charSequence = r10.A09;
        float textSize = layout.getPaint().getTextSize();
        AZD azd2 = new AZD(layout.getPaint().getTypeface(), r5, charSequence, textSize, (((float) layout.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null)) * layout.getSpacingMultiplier()) + layout.getSpacingAdd(), r10.A07.getPaint().getColor(), layout.getLineCount());
        r5.A08 = azd2;
        return azd2;
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static void A01(C86734yB r2, int i, int i2) {
        if (Color.alpha(r2.A01) == 0) {
            return;
        }
        if (r2.A03 != i || r2.A02 != i2) {
            r2.A03 = i;
            r2.A02 = i2;
            Paint paint = r2.A0G;
            if (paint == null) {
                paint = C86144wL.A0F();
                r2.A0G = paint;
            }
            paint.setColor(r2.A01);
            r2.A0C = true;
            r2.invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        if (this.A07 != null) {
            int save = canvas.save();
            Rect bounds = getBounds();
            if (this.A0B) {
                canvas.clipRect(bounds);
            }
            canvas.translate((float) bounds.left, ((float) bounds.top) + this.A00);
            try {
                Layout layout = this.A07;
                Path path = null;
                if (!(this.A03 == this.A02 || Color.alpha(this.A01) == 0)) {
                    if (this.A0C) {
                        Path path2 = this.A06;
                        if (path2 == null) {
                            path2 = C86144wL.A0G();
                            this.A06 = path2;
                        }
                        this.A07.getSelectionPath(this.A03, this.A02, path2);
                        this.A0C = false;
                    }
                    path = this.A06;
                }
                layout.draw(canvas, path, this.A0G, 0);
                canvas.restoreToCount(save);
            } catch (IndexOutOfBoundsException e) {
                String message = e.getMessage();
                StringBuilder A0s = C18190wL.A0s(" [");
                A0s.append(this.A0A);
                A0s.append("] ");
                CharSequence charSequence = this.A09;
                if (charSequence instanceof SpannableStringBuilder) {
                    Object[] spans = ((SpannableStringBuilder) charSequence).getSpans(0, charSequence.length(), Object.class);
                    A0s.append("spans: ");
                    for (Object A0e : spans) {
                        A0s.append(C18210wN.A0e(A0e));
                        C86144wL.A1T(A0s);
                    }
                }
                A0s.append("ellipsizedWidth: ");
                A0s.append(this.A07.getEllipsizedWidth());
                A0s.append(", lineCount: ");
                throw new IndexOutOfBoundsException(AnonymousClass00U.A0L(message, C86144wL.A0v(A0s, this.A07.getLineCount())));
            }
        }
    }

    public final boolean isStateful() {
        return AnonymousClass0wJ.A1W(this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r2 = r0.getPaint().getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStateChange(int[] r4) {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.A05
            if (r0 == 0) goto L_0x0026
            android.text.Layout r0 = r3.A07
            if (r0 == 0) goto L_0x0026
            android.text.TextPaint r0 = r0.getPaint()
            int r2 = r0.getColor()
            android.content.res.ColorStateList r1 = r3.A05
            int r0 = r3.A04
            int r1 = r1.getColorForState(r4, r0)
            if (r1 == r2) goto L_0x0026
            android.text.Layout r0 = r3.A07
            android.text.TextPaint r0 = r0.getPaint()
            r0.setColor(r1)
            r3.invalidateSelf()
        L_0x0026:
            boolean r0 = super.onStateChange(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86734yB.onStateChange(int[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r5 == 0) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A02(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r5 = r7.getActionMasked()
            r4 = 0
            r0 = 1
            if (r5 == r0) goto L_0x000b
            r3 = 0
            if (r5 != 0) goto L_0x000c
        L_0x000b:
            r3 = 1
        L_0x000c:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x0026
            android.graphics.Rect r2 = r6.getBounds()
            float r0 = r7.getX()
            int r1 = (int) r0
            float r0 = r7.getY()
            int r0 = (int) r0
            boolean r0 = r2.contains(r1, r0)
            if (r0 == 0) goto L_0x0026
            if (r3 != 0) goto L_0x0029
        L_0x0026:
            r0 = 3
            if (r5 != r0) goto L_0x002a
        L_0x0029:
            r4 = 1
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86734yB.A02(android.view.MotionEvent):boolean");
    }

    public final boolean CPd(View view, MotionEvent motionEvent) {
        float paragraphLeft;
        float lineMax;
        ClickableSpan[] clickableSpanArr;
        ClickableSpan clickableSpan;
        if (!A02(motionEvent)) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            A01(this, 0, 0);
            return false;
        }
        Rect bounds = getBounds();
        if (!bounds.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        int x = ((int) motionEvent.getX()) - bounds.left;
        int lineForVertical = this.A07.getLineForVertical(((int) motionEvent.getY()) - bounds.top);
        Layout.Alignment alignment = this.A07.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = this.A07;
        if (alignment == alignment2) {
            paragraphLeft = layout.getLineLeft(lineForVertical);
            lineMax = this.A07.getLineRight(lineForVertical);
        } else {
            boolean A1T = AnonymousClass0wJ.A1T(layout.getParagraphDirection(lineForVertical), -1);
            Layout layout2 = this.A07;
            if (A1T) {
                paragraphLeft = ((float) layout2.getWidth()) - this.A07.getLineMax(lineForVertical);
                lineMax = (float) this.A07.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = (float) layout2.getParagraphLeft(lineForVertical);
                lineMax = this.A07.getLineMax(lineForVertical);
            }
        }
        float f = (float) x;
        if (f >= paragraphLeft && f <= lineMax) {
            try {
                int offsetForHorizontal = this.A07.getOffsetForHorizontal(lineForVertical, f);
                if (offsetForHorizontal >= 0 && (clickableSpanArr = (ClickableSpan[]) ((Spanned) this.A09).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) != null && clickableSpanArr.length > 0 && (clickableSpan = clickableSpanArr[0]) != null) {
                    if (actionMasked == 1) {
                        A01(this, 0, 0);
                        clickableSpan.onClick(view);
                        return true;
                    } else if (actionMasked != 0) {
                        return true;
                    } else {
                        Spanned spanned = (Spanned) this.A09;
                        A01(this, spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
                        return true;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        A01(this, 0, 0);
        return false;
    }

    public final boolean CsQ(MotionEvent motionEvent) {
        if (!A02(motionEvent)) {
            return false;
        }
        return true;
    }

    public final List getItems() {
        AZD A002 = A00(this);
        if (A002 == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(A002);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
