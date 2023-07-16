package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.65Y  reason: invalid class name */
public final class AnonymousClass65Y extends AnonymousClass50M {
    public final C86374xZ A00;

    public final void onDraw(Canvas canvas) {
        this.A00.draw(canvas);
    }

    public final void onMeasure(int i, int i2) {
        C86374xZ r3 = this.A00;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(C86124wJ.A0A(r3), 1073741824), View.MeasureSpec.makeMeasureSpec(C86134wK.A08(r3), 1073741824));
    }

    public void setProgress(String str) {
        this.A00.A00 = str;
        invalidate();
    }

    public AnonymousClass65Y(Context context) {
        super(context);
        Resources resources = getResources();
        this.A00 = new C86374xZ(resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material), context.getColor(R.color.grey_8), context.getColor(R.color.design_dark_default_color_on_background));
    }
}
