package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3Vq  reason: invalid class name and case insensitive filesystem */
public abstract class C61803Vq {
    public void onDraw(Canvas canvas, RecyclerView recyclerView) {
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
    }

    public static void A00(View view, Rect rect) {
        view.getLayoutParams();
        rect.set(0, 0, 0, 0);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C41006Ltt ltt) {
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C41006Ltt ltt) {
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        A00(view, rect);
    }

    public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }
}
