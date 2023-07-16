package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7uC  reason: invalid class name and case insensitive filesystem */
public final class C132607uC implements C33841Hva {
    public final /* synthetic */ AnonymousClass7M7 A00;
    public final /* synthetic */ HashMap A01;
    public final /* synthetic */ CountDownLatch A02;
    public final /* synthetic */ AtomicBoolean A03;

    public final String getName() {
        return "EncryptedSharedPrefs_commit_writeToDisk";
    }

    public final int getRunnableId() {
        return 234;
    }

    public final void onCancel() {
    }

    public final void onFinish() {
    }

    public final void onStart() {
    }

    public C132607uC(AnonymousClass7M7 r1, HashMap hashMap, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean) {
        this.A00 = r1;
        this.A03 = atomicBoolean;
        this.A01 = hashMap;
        this.A02 = countDownLatch;
    }

    public final void run() {
        try {
            AtomicBoolean atomicBoolean = this.A03;
            AnonymousClass7M8 r0 = this.A00.A02;
            atomicBoolean.set(r0.A00.A00(r0.A03, this.A01));
        } catch (IOException e) {
            C10450iM.A07("EncryptedSharedPrefs_commit_failed_writeToDisk", e);
        } catch (Throwable th) {
            this.A02.countDown();
            throw th;
        }
        this.A02.countDown();
    }
}
