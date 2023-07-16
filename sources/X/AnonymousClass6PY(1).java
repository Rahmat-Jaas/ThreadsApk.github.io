package X;

import android.app.Application;
import com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape22S0200000_I2_6;

/* renamed from: X.6PY  reason: invalid class name */
public final class AnonymousClass6PY {
    public static final ClipsDraftPreviewItemRepository A00(Application application, UserSession userSession) {
        AnonymousClass0wJ.A1N(application, userSession);
        return (ClipsDraftPreviewItemRepository) userSession.A01(ClipsDraftPreviewItemRepository.class, new KtLambdaShape22S0200000_I2_6(23, application, userSession));
    }
}
