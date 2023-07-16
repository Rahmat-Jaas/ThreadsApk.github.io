package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;

/* renamed from: X.4R9  reason: invalid class name */
public final class AnonymousClass4R9 implements Runnable {
    public final /* synthetic */ C32432HKu A00;
    public final /* synthetic */ String A01;

    public AnonymousClass4R9(C32432HKu hKu, String str) {
        this.A00 = hKu;
        this.A01 = str;
    }

    public final void run() {
        C32432HKu hKu = this.A00;
        String str = hKu.A00;
        if (str == null || !str.equals(this.A01)) {
            hKu.A00 = this.A01;
            FragmentActivity fragmentActivity = hKu.A07;
            Drawable drawable = fragmentActivity.getDrawable(R.drawable.instagram_draft_pano_outline_24);
            if (drawable != null) {
                Drawable mutate = drawable.mutate();
                mutate.setTint(fragmentActivity.getColor(R.color.igds_icon_on_color));
                C63733iD A012 = C63733iD.A01();
                A012.A02 = -1;
                C63733iD.A07(fragmentActivity, A012, 2131836234);
                A012.A0J = true;
                C63733iD.A06(fragmentActivity, mutate, A012, 2131836235);
                A012.A0C();
                A012.A0G = true;
                C63733iD.A0A(A012);
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }
}
