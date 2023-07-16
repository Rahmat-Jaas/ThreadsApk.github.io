package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.VideoView;
import com.facebook.redex.IDxTListenerShape261S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.direct.fragment.interop.video.DirectInteropVideoSlide;
import com.instagram.service.session.UserSession;
import com.instagram.ui.slidecardpageadapter.SlideVideoCardViewModel;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1cr  reason: invalid class name and case insensitive filesystem */
public final class C23261cr extends C34640IcN implements C27987Ewb {
    public static final String __redex_internal_original_name = "DirectInteropUpgradeCarouselInterstitialFragment";
    public int A00 = 0;
    public int A01 = 3;
    public ReboundViewPager A02;
    public C18830xy A03;
    public CirclePageIndicator A04;
    public Context A05;
    public C09810gi A06;
    public UserSession A07;

    public final void CA4(int i, int i2, boolean z) {
    }

    public final void CIi(C23881Czs czs, float f, float f2) {
    }

    public final void CIn(C23881Czs czs, C23881Czs czs2) {
    }

    public final void COK(int i, int i2) {
    }

    public final /* synthetic */ void CSd(int i, float f) {
    }

    public final void CUX(View view) {
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void C9s(int i, int i2) {
        VideoView videoView;
        View A0C = this.A02.A0C(i);
        View A0C2 = this.A02.A0C(i2);
        VideoView videoView2 = null;
        if (A0C != null) {
            videoView2 = (VideoView) A0C.findViewById(R.id.video);
        }
        if (!(A0C2 == null || (videoView = (VideoView) A0C2.findViewById(R.id.video)) == null)) {
            videoView.stopPlayback();
            C18230wP.A0z(this.A05, videoView, R.color.direct_widget_primary_background);
            C18830xy r0 = this.A03;
            VideoView videoView3 = (VideoView) videoView.requireViewById(R.id.video);
            Uri uri = ((SlideVideoCardViewModel) r0.A02.get(i2)).A04;
            if (uri != null) {
                videoView3.setVideoURI(uri);
                videoView3.requestFocus();
            }
        }
        if (videoView2 != null) {
            videoView2.start();
        }
        this.A00 = i;
        this.A04.setVisibility(0);
        this.A04.A03(i, this.A01);
    }

    public final C10300i6 getSession() {
        return this.A07;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1979426083);
        super.onCreate(bundle);
        this.A07 = AnonymousClass0wJ.A0W(this);
        this.A06 = C09820gj.A00;
        this.A05 = requireActivity();
        SystemClock.elapsedRealtime();
        Bundle requireArguments = requireArguments();
        requireArguments.getString("qp_source_upsell");
        requireArguments.getString("static_source_upsell");
        C14030oh.A09(-765136352, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList parcelableArrayList;
        int A022 = C14030oh.A02(-236083594);
        View inflate = layoutInflater.inflate(R.layout.interop_upgrade_carousel_interstitial_container, viewGroup, false);
        this.A02 = (ReboundViewPager) inflate.requireViewById(R.id.switch_interop_pager);
        this.A04 = (CirclePageIndicator) inflate.requireViewById(R.id.page_indicator);
        this.A02.A0N(this);
        this.A02.A0N(this.A04);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Bundle bundle2 = this.mArguments;
        if (!(bundle2 == null || (parcelableArrayList = bundle2.getParcelableArrayList("ARG_DIRECT_INTEROP_VIDEO_CONTENT")) == null)) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                DirectInteropVideoSlide directInteropVideoSlide = (DirectInteropVideoSlide) it.next();
                A0v.add(new SlideVideoCardViewModel(directInteropVideoSlide.A00, directInteropVideoSlide.A02, directInteropVideoSlide.A01));
            }
        }
        int size = A0v.size();
        this.A01 = size;
        if (size != 0) {
            this.A04.A03(this.A00, size);
            C18830xy r1 = new C18830xy(this.A02, A0v);
            this.A03 = r1;
            this.A02.setAdapter((Adapter) r1);
            this.A02.A0I(this.A00);
            VideoView videoView = (VideoView) this.A02.A0D.findViewById(R.id.video);
            if (videoView != null) {
                videoView.start();
            }
            this.A02.setOnTouchListener(new IDxTListenerShape261S0100000_1_I2(this, 0));
        }
        C14030oh.A09(-1070549210, A022);
        return inflate;
    }
}
