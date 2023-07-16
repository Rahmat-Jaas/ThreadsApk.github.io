package com.facebook.papaya.fb.instagram;

import X.AnonymousClass0i1;
import X.AnonymousClass6HX;
import X.C04220Ms;
import X.C15020qa;
import X.C971268a;
import android.content.Context;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

public final class UserScopedTransport extends ITransport implements AnonymousClass0i1 {
    public static final AnonymousClass6HX Companion = new AnonymousClass6HX();

    public UserScopedTransport(Context context, TigonServiceHolder tigonServiceHolder, ScheduledExecutorService scheduledExecutorService, File file, C971268a r13) {
        super(context);
        C15020qa.A0A("papaya-ig4a-jni-transport");
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = new AndroidAsyncExecutorFactory(scheduledExecutorService);
        String canonicalPath = file.getCanonicalPath();
        C04220Ms.A06(canonicalPath);
        initHybridTransport(tigonServiceHolder, androidAsyncExecutorFactory, "https://i.instagram.com/api/v1/papaya/", "PROD", canonicalPath, r13.A00);
    }

    private final native void initHybridTransport(TigonServiceHolder tigonServiceHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, String str2, String str3, int i);

    public void onUserSessionWillEnd(boolean z) {
    }
}
