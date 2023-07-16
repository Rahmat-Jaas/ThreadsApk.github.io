package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.forker.Process;
import com.instagram.barcelona.R;
import java.util.Arrays;

/* renamed from: X.5yV  reason: invalid class name */
public final class AnonymousClass5yV extends AnonymousClass436 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
        if (this.A04) {
            r2.A5K(1);
        }
    }

    public final String getBinderGroupName() {
        return "Gap";
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        if (i == 0) {
            return this.A03;
        }
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = C14030oh.A03(1763085996);
        if (i == 0) {
            if (this.A03 != view.getLayoutParams().height) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = this.A03;
                view.setLayoutParams(layoutParams);
            }
            int i2 = this.A00;
            if (i2 != 0) {
                C18230wP.A0z(view.getContext(), view, i2);
            }
        }
        C14030oh.A0A(-496761143, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int i2;
        int A032 = C14030oh.A03(1214308490);
        LayoutInflater A0C = C18180wK.A0C(viewGroup);
        if (i == 0) {
            inflate = A0C.inflate(R.layout.gap_binder_layout, viewGroup, false);
            i2 = -2024317049;
        } else if (i == 1) {
            inflate = A0C.inflate(R.layout.divider_layout, viewGroup, false);
            View requireViewById = inflate.requireViewById(R.id.divider);
            int i3 = this.A01;
            if (i3 != 0) {
                C18230wP.A0z(requireViewById.getContext(), requireViewById, i3);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) requireViewById.getLayoutParams();
            int i4 = this.A02;
            layoutParams.leftMargin = i4;
            layoutParams.rightMargin = i4;
            i2 = 803393162;
        } else {
            IllegalArgumentException A0a = C18190wL.A0a(AnonymousClass00U.A0J("Illegal view type: ", i));
            C14030oh.A0A(1173193140, A032);
            throw A0a;
        }
        C14030oh.A0A(i2, A032);
        return inflate;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(C18210wN.A1X(i));
    }
}
