package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.831  reason: invalid class name */
public final class AnonymousClass831 implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ IgReactNavigatorModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AnonymousClass831(FragmentActivity fragmentActivity, IgReactNavigatorModule igReactNavigatorModule, String str, String str2) {
        this.A01 = igReactNavigatorModule;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void run() {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            IgReactNavigatorModule igReactNavigatorModule = this.A01;
            View view = igReactNavigatorModule.mCustomActionBarView;
            if (view == null || view.getParent() == null) {
                igReactNavigatorModule.mCustomActionBarView = LayoutInflater.from(fragmentActivity).inflate(R.layout.action_bar_image_title, (ViewGroup) null);
            } else {
                ((ViewGroup) igReactNavigatorModule.mCustomActionBarView.getParent()).removeView(igReactNavigatorModule.mCustomActionBarView);
            }
            ImageView A0J = C18200wM.A0J(igReactNavigatorModule.mCustomActionBarView, R.id.action_bar_title_imageview);
            A0J.setColorFilter(C63393hP.A00(C121907Is.A00(fragmentActivity, R.attr.glyphColorPrimary)));
            AnonymousClass0wJ.A0L(igReactNavigatorModule.mCustomActionBarView, R.id.action_bar_title_textview).setText(this.A03);
            C18180wK.A0r(fragmentActivity, A0J, IgReactNavigatorModule.resourceForIconType(this.A02));
            E2V.A03(fragmentActivity).Cjr(igReactNavigatorModule.mCustomActionBarView);
        }
    }
}
