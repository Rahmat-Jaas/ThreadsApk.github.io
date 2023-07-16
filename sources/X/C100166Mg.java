package X;

import com.instagram.barcelona.feed.post.data.PostRepository;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12;

/* renamed from: X.6Mg  reason: invalid class name and case insensitive filesystem */
public final class C100166Mg {
    public static final PostRepository A00(UserSession userSession) {
        return (PostRepository) userSession.A01(PostRepository.class, new KtLambdaShape32S0100000_I2_12(userSession, 37));
    }
}
