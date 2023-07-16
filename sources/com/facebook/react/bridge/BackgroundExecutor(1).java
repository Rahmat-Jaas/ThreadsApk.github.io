package com.facebook.react.bridge;

import X.AnonymousClass85K;
import X.C33107Hgp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BackgroundExecutor {
    public final ExecutorService A00;

    private void queueRunnable(Runnable runnable) {
        if (runnable == null) {
            ReactSoftExceptionLogger.logSoftException("FabricBackgroundExecutor", new C33107Hgp("runnable is null"));
            return;
        }
        ExecutorService executorService = this.A00;
        if (executorService == null) {
            ReactSoftExceptionLogger.logSoftException("FabricBackgroundExecutor", new C33107Hgp("executorService is null"));
        } else {
            executorService.execute(runnable);
        }
    }

    public BackgroundExecutor(String str) {
        this.A00 = Executors.newFixedThreadPool(1, new AnonymousClass85K(str));
    }
}
