package com.instagram.security.attestation.playintegrity.worker;

import X.AnonymousClass0gQ;
import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.C18250wR;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class PlayIntegrityAttestationWorker extends CoroutineWorker {
    public final AnonymousClass0gQ A00 = C18250wR.A0J((AnonymousClass0gW) null, 3).BQy(718484570, 3);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayIntegrityAttestationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass0wJ.A1O(context, workerParameters);
    }
}
