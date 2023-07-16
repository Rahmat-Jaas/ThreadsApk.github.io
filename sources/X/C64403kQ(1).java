package X;

import android.media.MediaPlayer;
import android.view.ViewGroup;
import android.widget.VideoView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.3kQ  reason: invalid class name and case insensitive filesystem */
public final class C64403kQ implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ VideoView A02;
    public final /* synthetic */ C18830xy A03;

    public C64403kQ(ViewGroup viewGroup, VideoView videoView, C18830xy r3, int i) {
        this.A03 = r3;
        this.A02 = videoView;
        this.A01 = viewGroup;
        this.A00 = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C18230wP.A0z(this.A01.getContext(), this.A02, R.color.direct_widget_primary_background);
        C18830xy r2 = this.A03;
        ReboundViewPager reboundViewPager = r2.A00;
        if (reboundViewPager != null && reboundViewPager.A0M == C23881Czs.IDLE) {
            if (this.A00 == r2.A02.size() - 1) {
                reboundViewPager.A0J(0, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            reboundViewPager.A0A(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }
}
