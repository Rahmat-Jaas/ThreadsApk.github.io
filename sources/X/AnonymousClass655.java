package X;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.655  reason: invalid class name */
public final class AnonymousClass655 extends C23426Cs5 {
    public final C134077wz A00;

    public final void A0L(C81684oC r10) {
        C04220Ms.A0B(r10, 0);
        if (r10 instanceof C134087x0) {
            C134087x0 r102 = (C134087x0) r10;
            User user = r102.A00;
            String BB4 = user.BB4();
            if (BB4 == null) {
                BB4 = user.BK7();
            }
            C134077wz r4 = this.A00;
            ImageUrl B4M = user.B4M();
            Integer num = r102.A01;
            int A02 = C18200wM.A02(1, BB4, num);
            boolean z = true;
            if (num == AnonymousClass006.A0C) {
                View view = r4.A01;
                String A0h = C18190wL.A0h(view.getResources(), BB4, 2131823891);
                C04220Ms.A06(A0h);
                C63813iO.A02(view.getContext(), A0h, (String) null, 0);
                return;
            }
            if (num != AnonymousClass006.A00) {
                z = false;
            }
            r4.A00 = z;
            C04530Oa r2 = r4.A06;
            C86144wL.A0I(r2).setVisibility(0);
            ((IgImageView) r2.getValue()).setUrl(B4M, r4.A04);
            View A0I = C86144wL.A0I(r2);
            double random = (Math.random() * ((double) A02)) - ((double) 1);
            C04530Oa r3 = r4.A05;
            A0I.setTranslationX((float) (((double) AnonymousClass0wJ.A04(r3.getValue())) * random));
            r4.A03.A09(((double) AnonymousClass0wJ.A04(r3.getValue())) * random);
            C86124wJ.A1M(r4.A02);
        } else if (r10 instanceof C134097x1) {
            C134077wz r42 = this.A00;
            C04530Oa r32 = r42.A06;
            C86144wL.A0I(r32).setVisibility(8);
            r42.A02.A09(0.0d);
            r42.A03.A09(0.0d);
            C86144wL.A0I(r32).setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    public AnonymousClass655(View view, C11630kW r3) {
        super(C18210wN.A0l(C134067wy.class));
        this.A00 = new C134077wz(view, r3);
    }

    public final AnonymousClass0W7[] A0O() {
        return new AnonymousClass0W7[]{C18210wN.A0l(C134087x0.class), C18210wN.A0l(C134097x1.class)};
    }

    public final /* bridge */ /* synthetic */ C39586KwJ A0P() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ void A0J(C81664oA r1) {
    }
}
