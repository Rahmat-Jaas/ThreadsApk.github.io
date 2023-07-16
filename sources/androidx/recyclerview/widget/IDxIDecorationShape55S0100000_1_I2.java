package androidx.recyclerview.widget;

import X.AnonymousClass0wJ;
import X.AnonymousClass3GA;
import X.C04220Ms;
import X.C18250wR;
import X.C41006Ltt;
import X.C61803Vq;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;

public class IDxIDecorationShape55S0100000_1_I2 extends C61803Vq {
    public Object A00;
    public final int A01;

    public IDxIDecorationShape55S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        switch (this.A01) {
            case 0:
                C04220Ms.A0B(rect, 0);
                Context context = ((View) this.A00).getContext();
                rect.left = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
                rect.right = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
                return;
            case 1:
                C04220Ms.A0B(rect, 0);
                Fragment fragment = (Fragment) this.A00;
                rect.left = AnonymousClass0wJ.A0B(fragment).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                rect.right = AnonymousClass0wJ.A0B(fragment).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                rect.top = AnonymousClass0wJ.A0B(fragment).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                rect.bottom = AnonymousClass0wJ.A0B(fragment).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
                return;
            case 2:
                if (RecyclerView.A03(view) != 0) {
                    rect.left = C18250wR.A00(((AnonymousClass3GA) this.A00).A01.getContext().getResources());
                    return;
                }
                return;
            default:
                C04220Ms.A0B(rect, 0);
                rect.top = ((View) this.A00).getResources().getDimensionPixelOffset(R.dimen.abc_floating_window_z);
                return;
        }
    }
}
