package X;

import android.app.Activity;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.barcelona.R;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.830  reason: invalid class name */
public final class AnonymousClass830 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ double A02;
    public final /* synthetic */ IgReactNavigatorModule A03;

    public AnonymousClass830(IgReactNavigatorModule igReactNavigatorModule, String str, double d, int i) {
        this.A03 = igReactNavigatorModule;
        this.A02 = d;
        this.A01 = str;
        this.A00 = i;
    }

    public final void run() {
        Activity currentActivity = this.A03.getCurrentActivity();
        if ((currentActivity instanceof FragmentActivity) && currentActivity != null && C1186671u.A01(currentActivity, (int) this.A02) && (currentActivity instanceof C82044oz)) {
            E2V A032 = E2V.A03(currentActivity);
            String str = this.A01;
            if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                A032.CtT(false);
                return;
            }
            C25764Drc drc = new C25764Drc();
            drc.A04(this.A00);
            drc.A04 = IgReactNavigatorModule.contentDescriptionForIconType(str);
            drc.A0C = C86134wK.A0P(this, 152);
            A032.Crl(new C25435DlZ(drc));
            ImageView imageView = A032.A0P;
            imageView.setColorFilter(C63393hP.A00(C121907Is.A00(imageView.getContext(), R.attr.glyphColorPrimary)));
        }
    }
}
