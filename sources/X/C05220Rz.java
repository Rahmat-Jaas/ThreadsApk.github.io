package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.FileLockInterruptionException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.OverlappingFileLockException;

/* renamed from: X.0Rz  reason: invalid class name and case insensitive filesystem */
public final class C05220Rz extends AnonymousClass0AV {
    public FileLock A00;
    public final FileChannel A01;
    public final File A02;
    public final /* synthetic */ AnonymousClass0Ry A03;

    public final String A01() {
        return "CrossProcessBatchLock";
    }

    public final synchronized void A02() {
        try {
            this.A01.close();
        } catch (IOException e) {
            AnonymousClass0LU.A0M("CrossProcessBatchLock", "Failed to close the file channel associated with file: %s", e, this.A02);
        }
        return;
    }

    public final synchronized void A04() {
        RuntimeException runtimeException;
        synchronized (this) {
            while (this.A00 == null) {
                try {
                    this.A00 = this.A01.lock();
                } catch (ClosedChannelException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("File channel is closed prematurely or opened non-writable for: ");
                    sb.append(this.A02);
                    runtimeException = new RuntimeException(sb.toString(), e);
                } catch (FileLockInterruptionException e2) {
                    AnonymousClass0LU.A0L("CrossProcessBatchLock", "Interrupted while waiting to lock the file: %s", e2, this.A02);
                } catch (IOException | NonWritableChannelException e3) {
                    runtimeException = new RuntimeException("Failed to lock the file due to an IOException!", e3);
                }
            }
        }
        return;
        throw runtimeException;
    }

    public final synchronized void A05() {
        this.A02.delete();
    }

    public final synchronized void A06() {
        Throwable th;
        synchronized (this) {
            FileLock fileLock = this.A00;
            if (fileLock != null) {
                try {
                    fileLock.release();
                    this.A00 = null;
                } catch (ClosedChannelException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("File Channel has been closed prematurely for: ");
                    sb.append(this.A02);
                    th = new RuntimeException(sb.toString(), e);
                } catch (IOException e2) {
                    th = new RuntimeException("Failed to unlock the file due to an IOException!", e2);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("File lock was never held for: ");
                sb2.append(this.A02);
                th = new IllegalStateException(sb2.toString());
                throw th;
            }
        }
    }

    public final synchronized boolean A09() {
        return !this.A02.exists();
    }

    public final synchronized boolean A0A() {
        boolean z;
        synchronized (this) {
            if (this.A00 == null) {
                try {
                    this.A00 = this.A01.tryLock();
                } catch (ClosedChannelException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("File channel closed prematurely for: ");
                    sb.append(this.A02);
                    throw new RuntimeException(sb.toString(), e);
                } catch (IOException | OverlappingFileLockException e2) {
                    AnonymousClass0LU.A0H("CrossProcessBatchLock", "IOException happens when trying to lock the file.", e2);
                }
            }
            z = false;
            if (this.A00 != null) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C05220Rz(AnonymousClass0Ry r5, File file) {
        super(r5, file);
        this.A03 = r5;
        if (file.getParentFile().isDirectory() || file.getParentFile().mkdirs()) {
            File file2 = new File(file.getParentFile(), AnonymousClass00U.A0L(file.getName(), ".lock"));
            this.A02 = file2;
            this.A01 = new RandomAccessFile(file2, "rw").getChannel();
            return;
        }
        StringBuilder sb = new StringBuilder("Unable to create parent directories for: ");
        sb.append(file);
        throw new IOException(sb.toString());
    }
}
