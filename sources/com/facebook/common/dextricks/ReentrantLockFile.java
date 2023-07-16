package com.facebook.common.dextricks;

import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public final class ReentrantLockFile implements Closeable {
    public static final int ACQUIRE_SHARED = 1;
    public static final boolean LOCK_DEBUG = false;
    public static final ReentrantLockFile sListHead = new ReentrantLockFile();
    public final File lockFileName;
    public FileChannel mChannel;
    public int mLockFlags;
    public final Lock mLockHandle;
    public boolean mLockInProgress;
    public Thread mLockOwner;
    public int mLockShareCount;
    public ReentrantLockFile mNext;
    public ReentrantLockFile mPrev;
    public int mReferenceCount;
    public FileLock mTheLock;

    public final class Lock implements Closeable {
        public Lock() {
        }

        public void close() {
            ReentrantLockFile.this.release();
        }

        public ReentrantLockFile getReentrantLockFile() {
            return ReentrantLockFile.this;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        if (r1 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        if (r10.mLockOwner == java.lang.Thread.currentThread()) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0048, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.common.dextricks.ReentrantLockFile.Lock tryAcquire(int r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.nio.channels.FileChannel r4 = r10.mChannel     // Catch:{ all -> 0x0071 }
            if (r4 == 0) goto L_0x0069
            r0 = r11 & 1
            r1 = 0
            r9 = 0
            if (r0 == 0) goto L_0x000c
            r9 = 1
        L_0x000c:
            boolean r0 = r10.mLockInProgress     // Catch:{ all -> 0x0071 }
            r3 = 0
            if (r0 != 0) goto L_0x0067
            int r2 = r10.mLockShareCount     // Catch:{ all -> 0x0071 }
            if (r2 <= 0) goto L_0x0032
            int r0 = r10.mLockFlags     // Catch:{ all -> 0x0071 }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            if (r9 == 0) goto L_0x0021
            if (r1 != 0) goto L_0x002b
            goto L_0x0023
        L_0x0021:
            if (r1 != 0) goto L_0x0067
        L_0x0023:
            java.lang.Thread r1 = r10.mLockOwner     // Catch:{ all -> 0x0071 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0071 }
            if (r1 != r0) goto L_0x0067
        L_0x002b:
            int r0 = r2 + 1
            r10.mLockShareCount = r0     // Catch:{ all -> 0x0071 }
            com.facebook.common.dextricks.ReentrantLockFile$Lock r0 = r10.mLockHandle     // Catch:{ all -> 0x0071 }
            goto L_0x0047
        L_0x0032:
            r5 = 0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.nio.channels.FileLock r0 = r4.tryLock(r5, r7, r9)     // Catch:{ IOException -> 0x0049 }
            if (r0 == 0) goto L_0x0067
            r10.addrefLocked()     // Catch:{ all -> 0x0071 }
            r10.claimLock(r11, r0)     // Catch:{ all -> 0x0071 }
            com.facebook.common.dextricks.ReentrantLockFile$Lock r0 = r10.mLockHandle     // Catch:{ all -> 0x0071 }
        L_0x0047:
            monitor-exit(r10)
            return r0
        L_0x0049:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0061
            java.lang.String r0 = ": EAGAIN ("
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = ": errno 11 ("
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0071 }
            r0.<init>(r2)     // Catch:{ all -> 0x0071 }
            goto L_0x0070
        L_0x0067:
            monitor-exit(r10)
            return r3
        L_0x0069:
            java.lang.String r1 = "cannot acquire closed lock"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            r0.<init>(r1)     // Catch:{ all -> 0x0071 }
        L_0x0070:
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.tryAcquire(int):com.facebook.common.dextricks.ReentrantLockFile$Lock");
    }

    private void addrefLocked() {
        if (this.mChannel != null) {
            this.mReferenceCount++;
            return;
        }
        throw new IllegalStateException("cannot add reference to dead lock");
    }

    private void claimLock(int i, FileLock fileLock) {
        if ((i & 1) == 0) {
            this.mLockOwner = Thread.currentThread();
        }
        this.mTheLock = fileLock;
        this.mLockFlags = i;
        this.mLockShareCount = 1;
    }

    public static synchronized ReentrantLockFile open(File file) {
        ReentrantLockFile reentrantLockFile;
        FileChannel fileChannel;
        RandomAccessFile randomAccessFile;
        synchronized (ReentrantLockFile.class) {
            File absoluteFile = file.getAbsoluteFile();
            reentrantLockFile = sListHead;
            do {
                reentrantLockFile = reentrantLockFile.mNext;
                ReentrantLockFile reentrantLockFile2 = sListHead;
                if (reentrantLockFile == reentrantLockFile2) {
                    RandomAccessFile randomAccessFile2 = null;
                    try {
                        randomAccessFile = new RandomAccessFile(absoluteFile, "rw");
                    } catch (Throwable th) {
                        th = th;
                        fileChannel = null;
                        Fs.safeClose((Closeable) randomAccessFile2);
                        Fs.safeClose((Closeable) fileChannel);
                        throw th;
                    }
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        try {
                            reentrantLockFile = new ReentrantLockFile(absoluteFile, fileChannel);
                            reentrantLockFile.mPrev = reentrantLockFile2;
                            reentrantLockFile.mNext = reentrantLockFile2.mNext;
                            reentrantLockFile2.mNext = reentrantLockFile;
                            reentrantLockFile.mNext.mPrev = reentrantLockFile;
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            Fs.safeClose((Closeable) randomAccessFile2);
                            Fs.safeClose((Closeable) fileChannel);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileChannel = null;
                        randomAccessFile2 = randomAccessFile;
                        Fs.safeClose((Closeable) randomAccessFile2);
                        Fs.safeClose((Closeable) fileChannel);
                        throw th;
                    }
                }
            } while (!absoluteFile.equals(reentrantLockFile.lockFileName));
            synchronized (reentrantLockFile) {
                try {
                    reentrantLockFile.addrefLocked();
                } catch (Throwable th4) {
                    while (true) {
                        th = th4;
                        break;
                    }
                }
            }
        }
        return reentrantLockFile;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        if (r1 == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = r9.mChannel.lock(0, Long.MAX_VALUE, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0046, code lost:
        if (r0 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r9.mLockInProgress = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004e, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0050, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0056, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        claimLock(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r9.mLockInProgress = false;
        notifyAll();
        r0 = r9.mLockHandle;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0061, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0062, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0063, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0064, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0067, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x006f, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0070, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r9.mLockInProgress = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0079, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x007f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0088, code lost:
        if (r2 == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x008b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x008c, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x008f, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:32:0x0048, B:64:0x0072] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.common.dextricks.ReentrantLockFile.Lock acquireInterruptubly(int r10) {
        /*
            r9 = this;
            r0 = r10 & 1
            r3 = 1
            r2 = 0
            r8 = 0
            if (r0 == 0) goto L_0x0008
            r8 = 1
        L_0x0008:
            r9.assertMonitorLockNotHeld()
            monitor-enter(r9)     // Catch:{ all -> 0x0087 }
            r1 = 0
        L_0x000d:
            com.facebook.common.dextricks.ReentrantLockFile$Lock r0 = r9.tryAcquire(r10)     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0017
            com.facebook.common.dextricks.ReentrantLockFile$Lock r0 = r9.mLockHandle     // Catch:{ all -> 0x0080 }
            monitor-exit(r9)     // Catch:{ all -> 0x0080 }
            goto L_0x002a
        L_0x0017:
            boolean r0 = r9.mLockInProgress     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0020
            int r0 = r9.mLockShareCount     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0020
            goto L_0x0030
        L_0x0020:
            if (r1 != 0) goto L_0x0026
            r9.addrefLocked()     // Catch:{ all -> 0x0080 }
            r1 = 1
        L_0x0026:
            r9.wait()     // Catch:{ all -> 0x0080 }
            goto L_0x000d
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r9.close()
        L_0x002f:
            return r0
        L_0x0030:
            if (r1 != 0) goto L_0x0036
            r9.addrefLocked()     // Catch:{ all -> 0x0080 }
            r1 = 1
        L_0x0036:
            r9.mLockInProgress = r3     // Catch:{ all -> 0x0080 }
            monitor-exit(r9)     // Catch:{ all -> 0x0080 }
            java.nio.channels.FileChannel r3 = r9.mChannel     // Catch:{ IOException -> 0x0069 }
            r4 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.nio.channels.FileLock r0 = r3.lock(r4, r6, r8)     // Catch:{ IOException -> 0x0069 }
            if (r0 != 0) goto L_0x0056
            monitor-enter(r9)     // Catch:{ all -> 0x008b }
            r9.mLockInProgress = r2     // Catch:{ all -> 0x0050 }
            r9.notifyAll()     // Catch:{ all -> 0x0050 }
            monitor-exit(r9)     // Catch:{ all -> 0x0050 }
            goto L_0x0053
        L_0x0050:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0050 }
            goto L_0x007f
        L_0x0053:
            r9.close()     // Catch:{ all -> 0x008b }
        L_0x0056:
            monitor-enter(r9)     // Catch:{ all -> 0x008b }
            r9.claimLock(r10, r0)     // Catch:{ all -> 0x0063 }
            r9.mLockInProgress = r2     // Catch:{ all -> 0x0067 }
            r9.notifyAll()     // Catch:{ all -> 0x0067 }
            com.facebook.common.dextricks.ReentrantLockFile$Lock r0 = r9.mLockHandle     // Catch:{ all -> 0x0067 }
            monitor-exit(r9)     // Catch:{ all -> 0x0067 }
            return r0
        L_0x0063:
            r0 = move-exception
            r2 = 1
        L_0x0065:
            monitor-exit(r9)     // Catch:{ all -> 0x0067 }
            goto L_0x0086
        L_0x0067:
            r0 = move-exception
            goto L_0x0065
        L_0x0069:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0070 }
            r0.<init>(r1)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            monitor-enter(r9)     // Catch:{ all -> 0x008b }
            r9.mLockInProgress = r2     // Catch:{ all -> 0x0079 }
            r9.notifyAll()     // Catch:{ all -> 0x0079 }
            monitor-exit(r9)     // Catch:{ all -> 0x0079 }
            goto L_0x007c
        L_0x0079:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0079 }
            goto L_0x007f
        L_0x007c:
            r9.close()     // Catch:{ all -> 0x008b }
        L_0x007f:
            throw r0     // Catch:{ all -> 0x008b }
        L_0x0080:
            r0 = move-exception
            r2 = r1
        L_0x0082:
            monitor-exit(r9)     // Catch:{ all -> 0x0084 }
            goto L_0x0086
        L_0x0084:
            r0 = move-exception
            goto L_0x0082
        L_0x0086:
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            if (r2 == 0) goto L_0x008f
            goto L_0x008c
        L_0x008b:
            r0 = move-exception
        L_0x008c:
            r9.close()
        L_0x008f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.acquireInterruptubly(int):com.facebook.common.dextricks.ReentrantLockFile$Lock");
    }

    public void donateLock(Thread thread) {
        boolean z = false;
        if (this.mLockOwner == Thread.currentThread()) {
            z = true;
        }
        Mlog.assertThat(z, "caller must own lock exclusively", new Object[0]);
        this.mLockOwner = thread;
    }

    public void stealLock() {
        boolean z = false;
        if (this.mLockOwner != null) {
            z = true;
        }
        Mlog.assertThat(z, "cannot steal unowned lock", new Object[0]);
        this.mLockOwner = Thread.currentThread();
    }

    public ReentrantLockFile(File file, FileChannel fileChannel) {
        this.lockFileName = file;
        this.mChannel = fileChannel;
        this.mReferenceCount = 1;
        this.mLockHandle = new Lock();
    }

    private void assertMonitorLockNotHeld() {
        Mlog.assertThat(!Thread.holdsLock(this), "lock order violation", new Object[0]);
    }

    public Lock acquire(int i) {
        try {
            return acquireInterruptubly(i);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        r2 = com.facebook.common.dextricks.ReentrantLockFile.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0 = r3.mReferenceCount - 1;
        r3.mReferenceCount = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r0 != 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001e, code lost:
        r1 = r3.mPrev;
        r1.mNext = r3.mNext;
        r3.mNext.mPrev = r1;
        r3.mPrev = null;
        r3.mNext = null;
        com.facebook.common.dextricks.Fs.safeClose((java.io.Closeable) r3.mChannel);
        r3.mChannel = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r3 = this;
            r3.assertMonitorLockNotHeld()
            monitor-enter(r3)
            java.nio.channels.FileChannel r0 = r3.mChannel     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0010
            int r0 = r3.mReferenceCount     // Catch:{ all -> 0x003d }
            r1 = 1
            if (r0 <= r1) goto L_0x0012
            int r0 = r0 - r1
            r3.mReferenceCount = r0     // Catch:{ all -> 0x003d }
        L_0x0010:
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            return
        L_0x0012:
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            java.lang.Class<com.facebook.common.dextricks.ReentrantLockFile> r2 = com.facebook.common.dextricks.ReentrantLockFile.class
            monitor-enter(r2)
            monitor-enter(r3)     // Catch:{ all -> 0x003a }
            int r0 = r3.mReferenceCount     // Catch:{ all -> 0x0037 }
            int r0 = r0 - r1
            r3.mReferenceCount = r0     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0034
            com.facebook.common.dextricks.ReentrantLockFile r1 = r3.mPrev     // Catch:{ all -> 0x0037 }
            com.facebook.common.dextricks.ReentrantLockFile r0 = r3.mNext     // Catch:{ all -> 0x0037 }
            r1.mNext = r0     // Catch:{ all -> 0x0037 }
            com.facebook.common.dextricks.ReentrantLockFile r0 = r3.mNext     // Catch:{ all -> 0x0037 }
            r0.mPrev = r1     // Catch:{ all -> 0x0037 }
            r1 = 0
            r3.mPrev = r1     // Catch:{ all -> 0x0037 }
            r3.mNext = r1     // Catch:{ all -> 0x0037 }
            java.nio.channels.FileChannel r0 = r3.mChannel     // Catch:{ all -> 0x0037 }
            com.facebook.common.dextricks.Fs.safeClose((java.io.Closeable) r0)     // Catch:{ all -> 0x0037 }
            r3.mChannel = r1     // Catch:{ all -> 0x0037 }
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.close():void");
    }

    public Thread getExclusiveOwner() {
        return this.mLockOwner;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r5.mLockOwner == java.lang.Thread.currentThread()) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r5 = this;
            r5.assertMonitorLockNotHeld()
            monitor-enter(r5)
            int r0 = r5.mLockShareCount     // Catch:{ all -> 0x0051 }
            r4 = 1
            r3 = 0
            r2 = 0
            if (r0 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.String r1 = "lock release balance"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x0051 }
            com.facebook.common.dextricks.Mlog.assertThat(r2, r1, r0)     // Catch:{ all -> 0x0051 }
            int r0 = r5.mLockFlags     // Catch:{ all -> 0x0051 }
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0022
            java.lang.Thread r1 = r5.mLockOwner     // Catch:{ all -> 0x0051 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0051 }
            r2 = 0
            if (r1 != r0) goto L_0x0023
        L_0x0022:
            r2 = 1
        L_0x0023:
            java.lang.String r1 = "lock thread affinity"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x0051 }
            com.facebook.common.dextricks.Mlog.assertThat(r2, r1, r0)     // Catch:{ all -> 0x0051 }
            int r0 = r5.mLockShareCount     // Catch:{ all -> 0x0051 }
            int r0 = r0 - r4
            r5.mLockShareCount = r0     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x003f
            java.nio.channels.FileLock r0 = r5.mTheLock     // Catch:{ IOException -> 0x0038 }
            r0.release()     // Catch:{ IOException -> 0x0038 }
            r0 = 0
            goto L_0x0041
        L_0x0038:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0051 }
            r0.<init>(r1)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x003f:
            r4 = 0
            goto L_0x004a
        L_0x0041:
            r5.mLockOwner = r0     // Catch:{ all -> 0x0051 }
            r5.mTheLock = r0     // Catch:{ all -> 0x0051 }
            r5.mLockFlags = r3     // Catch:{ all -> 0x0051 }
            r5.notifyAll()     // Catch:{ all -> 0x0051 }
        L_0x004a:
            monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x0050
            r5.close()
        L_0x0050:
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.ReentrantLockFile.release():void");
    }

    public ReentrantLockFile() {
        this.lockFileName = null;
        this.mLockHandle = null;
        this.mNext = this;
        this.mPrev = this;
    }
}
