package androidx.recyclerview.widget;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C121907Is;
import X.C18220wO;
import X.C18240wQ;
import X.C41006Ltt;
import X.C61803Vq;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;

public class IDxIDecorationShape56S0100000_2_I2 extends C61803Vq {
    public Object A00;
    public final int A01;

    public IDxIDecorationShape56S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        int A012;
        switch (this.A01) {
            case 0:
                C04220Ms.A0B(rect, 0);
                A012 = C18240wQ.A01(C18220wO.A0A(this.A00), 8);
                break;
            case 1:
                AnonymousClass0wJ.A1N(rect, view);
                C04220Ms.A0B(recyclerView, 2);
                int A03 = (RecyclerView.A03(view) % 3) + 1;
                int A013 = C121907Is.A01(((Fragment) this.A00).getContext(), R.attr.mediaPickerSpacing);
                rect.bottom = A013;
                if (A03 != 3) {
                    rect.right = A013;
                    return;
                }
                return;
            default:
                C04220Ms.A0B(rect, 0);
                Fragment fragment = (Fragment) this.A00;
                rect.left = AnonymousClass0wJ.A0B(fragment).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                rect.right = AnonymousClass0wJ.A0B(fragment).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                rect.top = AnonymousClass0wJ.A0B(fragment).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                A012 = AnonymousClass0wJ.A0B(fragment).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                break;
        }
        rect.bottom = A012;
    }
}
