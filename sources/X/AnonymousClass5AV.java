package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.5AV  reason: invalid class name */
public final class AnonymousClass5AV extends C113246qz {
    public static final ViewGroup.MarginLayoutParams A01;
    public C112496ph A00;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A01 = marginLayoutParams;
    }

    public AnonymousClass5AV(C112496ph r1) {
        this.A00 = r1;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C14030oh.A0A(-1288031156, C14030oh.A03(-200646024));
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View A0q;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height;
        int top;
        int i3;
        float f;
        int A03 = C14030oh.A03(692404252);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0H;
        int A1i = linearLayoutManager.A1i();
        if (!(A1i == -1 || (A0q = linearLayoutManager.A0q(A1i)) == null)) {
            if (A0q.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) A0q.getLayoutParams();
            } else {
                marginLayoutParams = A01;
            }
            if (linearLayoutManager.A01 == 0) {
                height = A0q.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                if (linearLayoutManager.A08.getLayoutDirection() == 0) {
                    top = A0q.getLeft();
                    i3 = marginLayoutParams.leftMargin;
                } else {
                    top = height - A0q.getRight();
                    i3 = marginLayoutParams.rightMargin;
                }
            } else {
                height = marginLayoutParams.bottomMargin + A0q.getHeight() + marginLayoutParams.topMargin;
                top = A0q.getTop();
                i3 = marginLayoutParams.topMargin;
            }
            int i4 = -(top - i3);
            if (height == 0) {
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            } else {
                f = ((float) i4) / ((float) height);
            }
            C112496ph r5 = this.A00;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            AnonymousClass3HX r4 = r5.A00;
            A002.A03(r4, 0);
            A002.A03(Integer.valueOf(A1i), 1);
            A002.A03(AnonymousClass3WF.A00((double) f), 2);
            C122047Jt.A03(r4, r5.A01, C86154wM.A0S(A002, Integer.valueOf(i4), 3), r5.A02);
        }
        C14030oh.A0A(-1546697251, A03);
    }
}
