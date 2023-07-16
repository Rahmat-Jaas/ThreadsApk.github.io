package X;

import android.app.Application;
import android.content.Context;
import com.instagram.clips.drafts.backup.ClipsDraftBackupFileUtil;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.service.session.UserSession;
import java.io.File;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1201000_I2;

/* renamed from: X.7s4  reason: invalid class name and case insensitive filesystem */
public final class C131477s4 implements C82394pY, AnonymousClass0i1 {
    public final ClipsDraftPreviewItemRepository A00;
    public final C38039KHq A01;

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        String str2;
        int A03 = C14030oh.A03(-610910704);
        C131267rg r1 = (C131267rg) obj;
        int A002 = AnonymousClass0wJ.A00(1690658392, r1);
        ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository = this.A00;
        String A0m = C86154wM.A0m(r1.A00);
        PendingMedia pendingMedia = r1.A01;
        UserSession userSession = clipsDraftPreviewItemRepository.A03;
        C25831Dsp A02 = C25567Do3.A02(userSession);
        String str3 = pendingMedia.A29;
        C171799zz r6 = pendingMedia.A0e;
        D36 d36 = D36.VIDEO;
        C19052Apr apr = pendingMedia.A1D;
        if (apr != null) {
            str = apr.A02;
        } else {
            str = null;
        }
        A02.A1c(r6, d36, str3, str, pendingMedia.A2f);
        C19052Apr apr2 = pendingMedia.A1D;
        if (!(apr2 == null || (str2 = apr2.A02) == null || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36325961511347555L))) {
            File A012 = ClipsDraftBackupFileUtil.A00.A01(clipsDraftPreviewItemRepository.A00, userSession, str2);
            if (A012.exists()) {
                A012.delete();
            }
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1201000_I2(clipsDraftPreviewItemRepository, pendingMedia, A0m, (C146958n9) null, 31), AnonymousClass7Ja.A03(clipsDraftPreviewItemRepository.A02), 3);
        C14030oh.A0A(751339772, A002);
        C14030oh.A0A(1553044648, A03);
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A01.A02(this, C131267rg.class);
        }
    }

    public C131477s4(Context context, UserSession userSession) {
        this.A01 = AnonymousClass3LY.A00(userSession);
        this.A00 = AnonymousClass6PY.A00((Application) C86154wM.A09(context), userSession);
    }
}
