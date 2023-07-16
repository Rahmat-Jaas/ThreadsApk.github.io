package com.instagram.feo2confidence.helper;

import X.AnonymousClass0wJ;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class ConfidencePingWorker extends CoroutineWorker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfidencePingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass0wJ.A1O(context, workerParameters);
    }
}
