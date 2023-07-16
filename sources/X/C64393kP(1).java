package X;

import android.media.MediaPlayer;
import android.widget.VideoView;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.Map;

/* renamed from: X.3kP  reason: invalid class name and case insensitive filesystem */
public final class C64393kP implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ VideoView A00;
    public final /* synthetic */ C18880y3 A01;

    public C64393kP(VideoView videoView, C18880y3 r2) {
        this.A01 = r2;
        this.A00 = videoView;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C18880y3 r1 = this.A01;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r1.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BcE(new C37408JrQ("value_props_video", r1.A01, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        this.A00.start();
        C18880y3.A00(r1);
    }
}
