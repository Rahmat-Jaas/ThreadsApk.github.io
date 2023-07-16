package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.browser.lite.extensions.commercecheckout.instagram.IGShopsLiteMessageHandler;
import com.facebook.redex.IDxCListenerShape5S0500000_1_I2;
import com.instagram.barcelona.R;
import java.util.HashMap;

/* renamed from: X.3y8  reason: invalid class name and case insensitive filesystem */
public final class C66733y8 implements C81804oQ {
    public final /* synthetic */ IGShopsLiteMessageHandler A00;
    public final /* synthetic */ C34344IEq A01;
    public final /* synthetic */ HashMap A02;
    public final /* synthetic */ AnonymousClass0MQ A03;
    public final /* synthetic */ AnonymousClass0MJ A04;

    public C66733y8(IGShopsLiteMessageHandler iGShopsLiteMessageHandler, C34344IEq iEq, HashMap hashMap, AnonymousClass0MQ r4, AnonymousClass0MJ r5) {
        this.A00 = iGShopsLiteMessageHandler;
        this.A01 = iEq;
        this.A02 = hashMap;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void Bsc(Context context, FrameLayout frameLayout, C81814oR r12) {
        boolean A1V = C18210wN.A1V(frameLayout);
        View A012 = AnonymousClass3W1.A01(context, LayoutInflater.from(context).inflate(R.layout.shops_lite_loading_view_ig, (ViewGroup) null, A1V), frameLayout);
        if (A012 != null) {
            C34344IEq iEq = this.A01;
            HashMap hashMap = this.A02;
            A012.setOnClickListener(new IDxCListenerShape5S0500000_1_I2(A1V ? 1 : 0, this.A03, this.A04, iEq, hashMap, r12));
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
