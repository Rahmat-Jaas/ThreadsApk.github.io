package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.11V  reason: invalid class name */
public final class AnonymousClass11V extends C61803Vq {
    public final int A00;
    public final Drawable A01;

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C41006Ltt ltt) {
        C41030Luu luu = recyclerView.A0F;
        luu.getClass();
        int itemCount = luu.getItemCount();
        int i = this.A00;
        int i2 = itemCount / i;
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (RecyclerView.A03(childAt) / i != i2 - 1) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                int bottom = childAt.getBottom() + ((L70) layoutParams).bottomMargin;
                Drawable drawable = this.A01;
                drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                drawable.draw(canvas);
            }
        }
    }

    public AnonymousClass11V(Context context, int i) {
        this.A01 = context.getDrawable(C121907Is.A02(context, R.attr.horizontalDivider1px));
        this.A00 = i;
    }
}
