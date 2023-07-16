package com.instagram.debug.devoptions.cam;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass3XJ;
import X.AnonymousClass3iG;
import X.AnonymousClass6BX;
import X.C04220Ms;
import X.C18170wI;
import X.C18180wK;
import X.C25542DnY;
import X.C25581DoH;
import X.C28101EyY;
import X.C86104wH;
import X.C89865Hh;
import X.C98316Fa;
import android.os.Bundle;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.config.MediaKitConfig;
import com.instagram.service.session.UserSession;

public final class MediaKitDevOptionFragment$delegate$1 implements Delegate {
    public final /* synthetic */ MediaKitDevOptionFragment this$0;

    public void deleteMediaKit(String str) {
        C04220Ms.A0B(str, 0);
        this.this$0.getMediaKitDevOptionViewModel().deleteMediaKitById(str);
    }

    public void duplicateMediaKit(String str) {
        C04220Ms.A0B(str, 0);
        this.this$0.getMediaKitDevOptionViewModel().duplicateMediaKit(str);
    }

    public void onEditMediaKit(String str) {
        C04220Ms.A0B(str, 0);
        this.this$0.getMediaKitDevOptionViewModel().fetchMediaKitInfo(str);
    }

    public void onViewMediaKit(C89865Hh r8) {
        C04220Ms.A0B(r8, 0);
        AnonymousClass3XJ.A00().CVc(this.this$0.requireActivity(), new MediaKitConfig(MediaKitEntryPoint.DEV_OPTIONS, String.valueOf(r8.A03), (String) null), AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
    }

    public void shareMediaKit(C89865Hh r11) {
        C04220Ms.A0B(r11, 0);
        MediaKitDevOptionFragment mediaKitDevOptionFragment = this.this$0;
        UserSession A0X = AnonymousClass0wJ.A0X(mediaKitDevOptionFragment.userSession$delegate);
        C28101EyY access$getLoggable = this.this$0.getLoggable();
        AnonymousClass6BX r4 = AnonymousClass6BX.DEV_OPTIONS_FEED;
        MediaKitDevOptionFragment$delegate$1$shareMediaKit$1 mediaKitDevOptionFragment$delegate$1$shareMediaKit$1 = MediaKitDevOptionFragment$delegate$1$shareMediaKit$1.INSTANCE;
        MediaKitDevOptionFragment$delegate$1$shareMediaKit$2 mediaKitDevOptionFragment$delegate$1$shareMediaKit$2 = MediaKitDevOptionFragment$delegate$1$shareMediaKit$2.INSTANCE;
        C04220Ms.A0B(A0X, 1);
        C86104wH.A1P(access$getLoggable, 2, mediaKitDevOptionFragment$delegate$1$shareMediaKit$1);
        C04220Ms.A0B(mediaKitDevOptionFragment$delegate$1$shareMediaKit$2, 8);
        C25542DnY dnY = new C25542DnY(AnonymousClass006.A08);
        dnY.A04(AnonymousClass006.A01);
        dnY.A02(r4);
        C25581DoH.A01(access$getLoggable, dnY);
        Bundle A00 = C98316Fa.A00(C18180wK.A0p("android.intent.extra.TEXT", r11.A04));
        AnonymousClass3iG.A03(mediaKitDevOptionFragment.requireActivity(), A00, mediaKitDevOptionFragment, A0X, C18170wI.A00(219), AnonymousClass0wJ.A0y());
    }

    public MediaKitDevOptionFragment$delegate$1(MediaKitDevOptionFragment mediaKitDevOptionFragment) {
        this.this$0 = mediaKitDevOptionFragment;
    }
}
