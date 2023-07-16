package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.forker.Process;
import java.util.Arrays;

/* renamed from: X.0yD  reason: invalid class name and case insensitive filesystem */
public final class C18950yD extends FrameLayout {
    public int A00;
    public int A01;
    public C18760xq A02;
    public C86384xa A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Integer A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final C86384xa A0B;
    public final C18940yC A0C;
    public final Integer A0D;
    public final boolean A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18950yD(Context context, C18940yC r14, C66883yU r15, AnonymousClass3HX r16, Integer num) {
        super(context);
        int i;
        int i2;
        C86384xa r1;
        int i3;
        int i4;
        Context context2 = context;
        this.A0C = r14;
        Integer num2 = r15.A0B;
        this.A0D = num2;
        this.A07 = r15.A07;
        Integer num3 = num;
        C58903Hy A042 = C62833aq.A04(num3, AnonymousClass006.A03);
        AnonymousClass3HX r7 = r16;
        if (AnonymousClass3JD.A01(context, r7)) {
            i = A042.A00;
        } else {
            i = A042.A01;
        }
        this.A04 = i;
        Integer num4 = AnonymousClass006.A0N;
        if (num2 == num4) {
            this.A05 = 0;
            this.A08 = 0;
            this.A0A = 0;
            this.A09 = 0;
            this.A0E = false;
            this.A0B = null;
        } else {
            Integer num5 = AnonymousClass006.A0C;
            this.A05 = (int) AnonymousClass3W1.A00(context, (float) C62833aq.A00(num3, num5));
            this.A08 = (int) AnonymousClass3W1.A00(context, 18.0f);
            this.A0A = (int) AnonymousClass3W1.A00(context, 6.0f);
            this.A09 = (int) AnonymousClass3W1.A00(context, 10.0f);
            Integer num6 = r15.A09;
            Integer num7 = AnonymousClass006.A00;
            boolean z = true;
            if (num6 != num7 ? num6 != num5 : !(num2 == num7 || num2 == num4)) {
                z = false;
            }
            this.A0E = !z;
            C86384xa r2 = new C86384xa();
            this.A0B = r2;
            r2.A00(AnonymousClass3JD.A00(context, C314025x.A04, r7));
            Arrays.fill(r2.A03, (float) ((int) AnonymousClass3W1.A00(context, 2.0f)));
            r2.A00 = true;
            r2.invalidateSelf();
        }
        this.A06 = (int) AnonymousClass3W1.A00(context, 16.0f);
        Integer num8 = this.A07;
        if (num8.equals(AnonymousClass006.A0Y)) {
            C58903Hy A043 = C62833aq.A04(num3, AnonymousClass006.A02);
            if (AnonymousClass3JD.A01(context, r7)) {
                i4 = A043.A00;
            } else {
                i4 = A043.A01;
            }
            r1 = new C86384xa();
            r1.A00(i4);
            i2 = this.A05;
        } else {
            int i5 = this.A04;
            i2 = this.A05;
            C18760xq r5 = new C18760xq(context2, r7, num8, num3, i5, i2);
            this.A02 = r5;
            r5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.A02, 0);
            r1 = new C86384xa();
            r1.A00(i5);
        }
        float f = (float) i2;
        Arrays.fill(r1.A03, f);
        r1.A00 = true;
        r1.invalidateSelf();
        setBackground(r1);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, this.A06, 0, 0);
        addView(r14, marginLayoutParams);
        C86384xa r12 = new C86384xa();
        this.A03 = r12;
        Arrays.fill(r12.A03, f);
        r12.A00 = true;
        r12.invalidateSelf();
        C58903Hy A044 = C62833aq.A04(num3, AnonymousClass006.A00);
        if (AnonymousClass3JD.A01(context, r7)) {
            i3 = A044.A00;
        } else {
            i3 = A044.A01;
        }
        this.A01 = i3;
        this.A00 = Color.alpha(i3);
        if (this.A03 != null) {
            setForeground((Drawable) null);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        C86384xa r4;
        super.dispatchDraw(canvas);
        if (this.A0D != AnonymousClass006.A0N && (r4 = this.A0B) != null && this.A0E) {
            int width = (int) (((float) getWidth()) / 2.0f);
            int i = this.A08;
            r4.setBounds(width - i, this.A0A, width + i, this.A09);
            r4.draw(canvas);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int size = View.MeasureSpec.getSize(i2);
        if (this.A0D == AnonymousClass006.A0Y) {
            i3 = Process.WAIT_RESULT_TIMEOUT;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size, i3));
        AnonymousClass51X r0 = this.A0C.A01;
        int measuredWidth = r0.getMeasuredWidth();
        int measuredHeight = r0.getMeasuredHeight() + this.A06;
        C18760xq r02 = this.A02;
        if (r02 != null) {
            r02.A00(measuredWidth, measuredHeight);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }
}
