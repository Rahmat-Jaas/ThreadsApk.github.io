package X;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.VideoView;
import com.instagram.barcelona.R;
import java.util.Map;

/* renamed from: X.4R4  reason: invalid class name */
public final class AnonymousClass4R4 implements Runnable {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C67443zY A01;

    public AnonymousClass4R4(Uri uri, C67443zY r2) {
        this.A01 = r2;
        this.A00 = uri;
    }

    public final void run() {
        VideoView videoView;
        C67443zY r3 = this.A01;
        AnonymousClass1cX r2 = r3.A00;
        AnonymousClass10K r1 = r2.A07;
        r1.A05.BcA(new C37408JrQ("intro", r1.A08, "value_props_video", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        ViewGroup viewGroup = r2.A03;
        if (viewGroup != null && (videoView = (VideoView) viewGroup.findViewById(R.id.video)) != null) {
            r3.A01.A01(this.A00, videoView);
        }
    }
}
