package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.forker.Process;

/* renamed from: X.0yC  reason: invalid class name and case insensitive filesystem */
public final class C18940yC extends FrameLayout {
    public ViewGroup A00;
    public AnonymousClass51X A01;
    public final Integer A02;

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredWidth()), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredHeight()), Process.WAIT_RESULT_TIMEOUT);
        ViewGroup viewGroup = this.A00;
        viewGroup.measure(makeMeasureSpec, makeMeasureSpec2);
        viewGroup.layout(0, 0, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
    }

    public C18940yC(Context context, Integer num) {
        super(context);
        this.A02 = num;
        Context context2 = getContext();
        this.A00 = new FrameLayout(context2);
        AnonymousClass51X r1 = new AnonymousClass51X(context2);
        this.A01 = r1;
        r1.setImportantForAccessibility(1);
        addView(this.A01);
        addView(this.A00);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        int size = View.MeasureSpec.getSize(i2);
        if (this.A02 == AnonymousClass006.A0Y) {
            i3 = Process.WAIT_RESULT_TIMEOUT;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, i3);
        AnonymousClass51X r0 = this.A01;
        r0.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(r0.getMeasuredWidth(), r0.getMeasuredHeight());
    }
}
