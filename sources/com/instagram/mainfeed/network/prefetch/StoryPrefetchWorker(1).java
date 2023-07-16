package com.instagram.mainfeed.network.prefetch;

import X.AnonymousClass0wJ;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.instagram.service.session.UserSession;

public final class StoryPrefetchWorker extends CoroutineWorker {
    public StoryBackgroundMediaPrefetchHelper A00;
    public UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryPrefetchWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass0wJ.A1O(context, workerParameters);
    }
}
