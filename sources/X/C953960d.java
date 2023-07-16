package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.service.session.UserSession;
import java.io.File;

/* renamed from: X.60d  reason: invalid class name and case insensitive filesystem */
public final class C953960d extends C30809GWj {
    public final /* synthetic */ C18330wh A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ RectF A03;
    public final /* synthetic */ RectF A04;
    public final /* synthetic */ BKU A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        File file = (File) obj;
        C04220Ms.A0B(file, 0);
        UserSession userSession = this.A06;
        C18865Ame.A00(this.A02, this.A03, this.A04, (C171799zz) null, (ClipsCelebrationReshareViewModel) null, this.A05, userSession, file, this.A07, this.A01, 3584, this.A08, false);
    }

    public C953960d(Activity activity, RectF rectF, RectF rectF2, BKU bku, UserSession userSession, C18330wh r6, String str, int i, boolean z) {
        this.A00 = r6;
        this.A02 = activity;
        this.A06 = userSession;
        this.A05 = bku;
        this.A01 = i;
        this.A08 = z;
        this.A03 = rectF;
        this.A04 = rectF2;
        this.A07 = str;
    }

    public final void A02(Exception exc) {
        C63813iO.A03(this.A02, "shareVideoFeedPostToStory_something_went_wrong", 2131836068, 0);
    }

    public final void onFinish() {
        if (!this.A02.isDestroyed()) {
            this.A00.dismiss();
        }
    }

    public final void onStart() {
        C13950oZ.A00(this.A00);
    }
}
