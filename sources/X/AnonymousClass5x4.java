package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.KtLambdaShape38S0100000_I2_18;

/* renamed from: X.5x4  reason: invalid class name */
public final class AnonymousClass5x4 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "BrandedContentPartnerPromotionAdPreviewFragment";
    public final C04530Oa A00 = C86154wM.A0v(this, 44);
    public final C04530Oa A01 = C62373Zc.A03(new KtLambdaShape38S0100000_I2_18(this, 45));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator it = ((C111036mg) C18190wL.A0f(this.A00)).A06.iterator();
        while (it.hasNext()) {
            C109156jY r1 = (C109156jY) it.next();
            C971968h r0 = r1.A00;
            if (r0 != null) {
                A0y.put(r0, r1);
            } else {
                C04220Ms.A0E("placementName");
                throw null;
            }
        }
        C18180wK.A0G(view, R.id.promote_preview_subtitle_text).setText(2131832147);
        C971968h r12 = C971968h.FEED;
        if (A0y.containsKey(r12)) {
            Object obj = A0y.get(r12);
            if (obj != null) {
                C86104wH.A1D(((ViewStub) view.findViewById(R.id.feed_button_stub)).inflate(), 59, obj, this);
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        } else {
            ((ViewStub) view.findViewById(R.id.feed_button_stub_disabled)).inflate().setAlpha(0.4f);
        }
        if (A0y.containsKey(C971968h.STORIES)) {
            View findViewById = view.findViewById(R.id.stories_button_stub);
            C04220Ms.A0C(findViewById, C18170wI.A00(3));
            C86104wH.A1D(((ViewStub) findViewById).inflate(), 60, A0y, this);
        } else {
            ((ViewStub) view.findViewById(R.id.stories_button_stub_disabled)).inflate().setAlpha(0.4f);
        }
        C971968h r13 = C971968h.EXPLORE;
        if (A0y.containsKey(r13)) {
            Object obj2 = A0y.get(r13);
            if (obj2 != null) {
                View findViewById2 = view.findViewById(R.id.explore_button_stub);
                C04220Ms.A0C(findViewById2, C18170wI.A00(3));
                C86104wH.A1D(((ViewStub) findViewById2).inflate(), 58, obj2, this);
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        } else {
            ((ViewStub) view.findViewById(R.id.explore_button_stub_disabled)).inflate().setAlpha(0.4f);
        }
        View findViewById3 = view.findViewById(R.id.performance_disclaimer_stub);
        C04220Ms.A0C(findViewById3, C18170wI.A00(3));
        View inflate = ((ViewStub) findViewById3).inflate();
        C04220Ms.A0C(inflate, I17.A00(0));
        C18200wM.A15(requireContext(), (TextView) inflate, 2131832146);
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        if (r2 != null) {
            AnonymousClass4u2.A07(r2, 2131822553);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public static final void A00(AnonymousClass5x4 r3, String str, int i) {
        C25786Drz A0Q = C18180wK.A0Q(r3.requireActivity(), AnonymousClass0wJ.A0U(r3.A01));
        IgFragmentFactoryImpl.A00();
        C19504AxR axR = new C19504AxR();
        axR.A04 = str;
        axR.A06 = __redex_internal_original_name;
        axR.A02 = C171059w0.A02;
        axR.A08 = r3.requireContext().getString(i);
        A0Q.A03 = axR.A05();
        A0Q.A05();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1470097353);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_preview, viewGroup, false);
        C14030oh.A09(535253998, A02);
        return inflate;
    }

    public final void onResume() {
        int A02 = C14030oh.A02(1296410652);
        super.onResume();
        C26159E1n A08 = C19554AyF.A02().A08(requireActivity());
        if (A08 != null && A08.A0U()) {
            A08.A0R((RectF) null, (RectF) null, this, (C27905EvG) null);
        }
        C14030oh.A09(662549261, A02);
    }
}
