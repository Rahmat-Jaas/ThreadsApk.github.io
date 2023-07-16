package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.framelayout.FixedAspectRatioFrameLayout;

/* renamed from: X.5Al  reason: invalid class name and case insensitive filesystem */
public final class C88745Al extends M5O {
    public final FixedAspectRatioFrameLayout A00;

    public C88745Al(View view) {
        super(view);
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) AnonymousClass0wJ.A0J(view, R.id.image_container);
        this.A00 = fixedAspectRatioFrameLayout;
        fixedAspectRatioFrameLayout.A00 = 0.75f;
    }
}
