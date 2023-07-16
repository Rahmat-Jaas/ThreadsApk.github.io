package com.facebook.bloks.common.implementations.product.storyviewer;

import X.AnonymousClass060;
import X.AnonymousClass062;
import X.AnonymousClass065;
import X.C121247Ez;
import X.LLF;
import android.view.ViewGroup;
import androidx.lifecycle.OnLifecycleEvent;

public class StoryViewerOverlayUtil$FragmentLifecycleObserver implements AnonymousClass065 {
    public final String A00;
    public final ViewGroup A01;
    public final AnonymousClass062 A02;
    public final LLF A03;
    public final C121247Ez A04;

    @OnLifecycleEvent(AnonymousClass060.ON_DESTROY)
    public void onDestroy() {
        this.A02.A08(this);
        LLF llf = this.A03;
        ViewGroup viewGroup = this.A01;
        C121247Ez r1 = this.A04;
        llf.setVisibility(8);
        viewGroup.removeView(llf);
        r1.A03();
    }

    public StoryViewerOverlayUtil$FragmentLifecycleObserver(ViewGroup viewGroup, AnonymousClass062 r2, LLF llf, C121247Ez r4, String str) {
        this.A00 = str == null ? "" : str;
        this.A01 = viewGroup;
        this.A02 = r2;
        this.A03 = llf;
        this.A04 = r4;
    }
}
