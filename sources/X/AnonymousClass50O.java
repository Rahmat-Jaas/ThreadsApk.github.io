package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import java.util.List;

/* renamed from: X.50O  reason: invalid class name */
public final class AnonymousClass50O extends View {
    public KtCSuperShape0S0200000_I2 A00;

    public /* synthetic */ AnonymousClass50O(Context context) {
        super(context, (AttributeSet) null);
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        super.onDraw(canvas);
        KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2 = this.A00;
        if (ktCSuperShape0S0200000_I2 != null) {
            List list = (List) ktCSuperShape0S0200000_I2.A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C143428gh) list.get(i)).AIi(canvas, (C36993JiQ) ktCSuperShape0S0200000_I2.A00);
            }
        }
    }

    public final KtCSuperShape0S0200000_I2 getCanvasModel() {
        return this.A00;
    }

    public final void setCanvasModel(KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2) {
        if (!C04220Ms.A0I(this.A00, ktCSuperShape0S0200000_I2)) {
            this.A00 = ktCSuperShape0S0200000_I2;
            invalidate();
        }
    }
}
