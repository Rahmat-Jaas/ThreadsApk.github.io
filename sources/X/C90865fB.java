package X;

import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.5fB  reason: invalid class name and case insensitive filesystem */
public final class C90865fB extends C127237gm {
    public final /* synthetic */ C112236pE A00;

    public C90865fB(C112236pE r1) {
        this.A00 = r1;
    }

    public final void CLg(C25812DsR dsR) {
        this.A00.A00.setTag(R.id.view_bouncer, (Object) null);
    }

    public final void CLi(C25812DsR dsR) {
        float max = (float) Math.max(0.0d, dsR.A09.A00);
        View view = this.A00.A00;
        view.setPivotX(((float) view.getWidth()) / 2.0f);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
        view.setScaleX(max);
        view.setScaleY(max);
    }
}
