package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.5fc  reason: invalid class name and case insensitive filesystem */
public final class C91115fc extends C86994zf {
    public final boolean A00;
    public final AnonymousClass3HX A01;
    public final C127397h3 A02;
    public final C127397h3 A03;
    public final C109326jp A04;

    public final void updateDrawState(TextPaint textPaint) {
    }

    public C91115fc(AnonymousClass3HX r1, C127397h3 r2, C127397h3 r3, C109326jp r4, String str, String str2, boolean z) {
        super(str, str2);
        this.A04 = r4;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = z;
    }

    public final void onClick(View view) {
        Object obj;
        AnonymousClass3VO A002 = AnonymousClass3VO.A00();
        A002.A03(this.A03, 0);
        if (!this.A00 || !(view instanceof RCTextView)) {
            obj = this.A01;
        } else {
            RCTextView rCTextView = (RCTextView) view;
            Spanned spanned = (Spanned) rCTextView.A07;
            Layout layout = rCTextView.A06;
            int spanStart = (int) ((double) spanned.getSpanStart(this));
            double primaryHorizontal = (double) layout.getPrimaryHorizontal(spanStart);
            double primaryHorizontal2 = (double) layout.getPrimaryHorizontal((int) ((double) spanned.getSpanEnd(this)));
            int lineForOffset = layout.getLineForOffset(spanStart);
            Rect A0D = C86134wK.A0D();
            layout.getLineBounds(lineForOffset, A0D);
            RectF rectF = new RectF(A0D);
            float paddingBottom = (float) (((double) rectF.left) + ((((double) rCTextView.getPaddingBottom()) + primaryHorizontal) - ((double) rCTextView.getScrollX())) + ((double) rCTextView.A00));
            rectF.left = paddingBottom;
            rectF.right = (float) ((((double) paddingBottom) + primaryHorizontal2) - primaryHorizontal);
            double scrollY = (double) (((float) (rCTextView.getScrollY() + rCTextView.getPaddingTop())) + rCTextView.A01);
            rectF.top = (float) (((double) rectF.top) + scrollY);
            rectF.bottom = (float) (((double) rectF.bottom) + scrollY);
            rCTextView.getMatrix().mapRect(rectF);
            rectF.offset((float) rCTextView.getLeft(), (float) rCTextView.getTop());
            obj = new C110006ky(rectF.left + (rectF.width() / 2.0f), rectF.top + (rectF.height() / 2.0f), rectF.width(), rectF.height());
        }
        A002.A03(obj, 1);
        C127397h3 r3 = this.A02;
        C109326jp r2 = this.A04;
        C122047Jt.A03(this.A01, r3, A002.A01(), r2);
    }
}
