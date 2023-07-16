package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape8S1200000_1_I2;
import com.instagram.barcelona.R;

/* renamed from: X.3y7  reason: invalid class name and case insensitive filesystem */
public final class C66723y7 implements C81804oQ {
    public final /* synthetic */ C34345IEr A00;
    public final /* synthetic */ String A01;

    public C66723y7(C34345IEr iEr, String str) {
        this.A00 = iEr;
        this.A01 = str;
    }

    public final void Bsc(Context context, FrameLayout frameLayout, C81814oR r9) {
        boolean A1V = C18210wN.A1V(frameLayout);
        View inflate = LayoutInflater.from(context).inflate(R.layout.shops_lite_loading_view_ig, (ViewGroup) null, A1V);
        ViewTreeObserver viewTreeObserver = inflate.getViewTreeObserver();
        C34345IEr iEr = this.A00;
        String str = this.A01;
        viewTreeObserver.addOnGlobalLayoutListener(new C65603tt(inflate, iEr, str));
        View A012 = AnonymousClass3W1.A01(context, inflate, frameLayout);
        if (A012 != null) {
            A012.setOnClickListener(new IDxCListenerShape8S1200000_1_I2((Object) r9, (Object) iEr, str, A1V ? 1 : 0));
            A012.setBackgroundResource(R.drawable.instagram_x_pano_outline_24);
            Drawable drawable = context.getDrawable(R.drawable.instagram_x_pano_outline_24);
            if (drawable != null) {
                C63393hP.A03(context, drawable, R.color.igds_primary_text);
            }
        }
        TextView A0G = C18180wK.A0G(frameLayout, R.id.loading_screen_text_ig);
        if (A0G != null) {
            C18180wK.A0s(context, A0G, R.color.igds_primary_text);
        }
    }
}
