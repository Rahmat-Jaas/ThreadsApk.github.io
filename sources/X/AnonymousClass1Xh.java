package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1Xh  reason: invalid class name */
public final class AnonymousClass1Xh extends C34640IcN {
    public static final String __redex_internal_original_name = "ClipsAudioBrowserBackgroundFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return "music_overlay_detail";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1710537085);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_audio_browser_background_fragment, viewGroup, false);
        C14030oh.A09(1996729737, A02);
        return inflate;
    }
}
