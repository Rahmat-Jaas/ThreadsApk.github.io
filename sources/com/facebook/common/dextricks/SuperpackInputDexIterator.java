package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.C14400pL;
import X.C14600po;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.superpack.SuperpackArchive;
import com.facebook.superpack.SuperpackFile;
import com.facebook.superpack.SuperpackFileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public final class SuperpackInputDexIterator extends InputDexIterator {
    public final C14600po mArchiveExtension;
    public final int[] mDexToArchiveMap;
    public final SynchronousQueue[] mFileQueues;
    public int mNextDexIndex;
    public final C14400pL mPatchingStrategy;
    public boolean mShuttingDownFlag;
    public final SuperpackArchive mSuperpackArchive;
    public SuperpackFile mSuperpackFileToClose;
    public final Thread[] mThreads;

    public class Builder {
        public C14600po archiveExtension = C14600po.NONE;
        public int[] dexToArchive;
        public DexManifest manifest;
        public C14400pL patchingStrategy;
        public LightweightQuickPerformanceLogger qplCollector;
        public ArrayList rawArchives;

        public Builder assignDexToArchive(int i, int i2) {
            if (i2 < 0 || i2 >= this.rawArchives.size()) {
                throw new IndexOutOfBoundsException();
            }
            this.dexToArchive[i] = i2;
            return this;
        }

        public SuperpackInputDexIterator build() {
            if (this.rawArchives.size() >= 1) {
                return new SuperpackInputDexIterator(this);
            }
            throw new IllegalStateException();
        }

        public Builder(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
            dexManifest.getClass();
            this.manifest = dexManifest;
            this.dexToArchive = new int[dexManifest.dexes.length];
            this.qplCollector = lightweightQuickPerformanceLogger;
            this.rawArchives = new ArrayList();
            this.patchingStrategy = null;
            this.archiveExtension = dexManifest.superpackExtension;
        }

        public Builder addRawArchive(InputStream inputStream) {
            inputStream.getClass();
            this.rawArchives.add(inputStream);
            return this;
        }

        public Builder setPatchingStrategy(C14400pL r1) {
            this.patchingStrategy = r1;
            return this;
        }
    }

    public class UnpackingRunnable implements Runnable {
        public InputStream mInput;
        public SynchronousQueue mOutput;

        public UnpackingRunnable(InputStream inputStream, SynchronousQueue synchronousQueue) {
            this.mInput = inputStream;
            this.mOutput = synchronousQueue;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                com.facebook.common.dextricks.SuperpackInputDexIterator r1 = com.facebook.common.dextricks.SuperpackInputDexIterator.this     // Catch:{ IOException -> 0x003b, InterruptedException -> 0x002d }
                java.io.InputStream r0 = r3.mInput     // Catch:{ IOException -> 0x003b, InterruptedException -> 0x002d }
                com.facebook.superpack.SuperpackArchive r2 = r1.getSuperpackArchive(r0)     // Catch:{ IOException -> 0x003b, InterruptedException -> 0x002d }
                java.io.InputStream r0 = r3.mInput     // Catch:{ all -> 0x0028 }
                r0.close()     // Catch:{ all -> 0x0028 }
            L_0x000d:
                boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x0024
                com.facebook.common.dextricks.SuperpackInputDexIterator r0 = com.facebook.common.dextricks.SuperpackInputDexIterator.this     // Catch:{ all -> 0x0028 }
                com.facebook.superpack.SuperpackFile r1 = r0.getNextFileFromSpk(r2)     // Catch:{ all -> 0x0028 }
                java.util.concurrent.SynchronousQueue r0 = r3.mOutput     // Catch:{ all -> 0x001f }
                r0.put(r1)     // Catch:{ all -> 0x001f }
                goto L_0x000d
            L_0x001f:
                r0 = move-exception
                r1.close()     // Catch:{ all -> 0x0028 }
                throw r0     // Catch:{ all -> 0x0028 }
            L_0x0024:
                r2.close()     // Catch:{ IOException -> 0x003b, InterruptedException -> 0x002d }
                return
            L_0x0028:
                r0 = move-exception
                r2.close()     // Catch:{ all -> 0x002c }
            L_0x002c:
                throw r0     // Catch:{ IOException -> 0x003b, InterruptedException -> 0x002d }
            L_0x002d:
                r1 = move-exception
                com.facebook.common.dextricks.SuperpackInputDexIterator r0 = com.facebook.common.dextricks.SuperpackInputDexIterator.this
                boolean r0 = r0.mShuttingDownFlag
                if (r0 != 0) goto L_0x003a
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r1)
                throw r0
            L_0x003a:
                return
            L_0x003b:
                r1 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.SuperpackInputDexIterator.UnpackingRunnable.run():void");
        }
    }

    public SuperpackInputDexIterator(Builder builder) {
        super(builder.manifest, (C14400pL) null, builder.qplCollector);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603017);
        }
        this.mPatchingStrategy = null;
        this.mArchiveExtension = builder.archiveExtension;
        try {
            this.mShuttingDownFlag = false;
            this.mNextDexIndex = 0;
            this.mDexToArchiveMap = builder.dexToArchive;
            int size = builder.rawArchives.size() - 1;
            this.mThreads = new Thread[size];
            this.mFileQueues = new SynchronousQueue[size];
            int i = 0;
            while (i < size) {
                this.mFileQueues[i] = new SynchronousQueue();
                int i2 = i + 1;
                this.mThreads[i] = new Thread(new UnpackingRunnable((InputStream) builder.rawArchives.get(i2), this.mFileQueues[i]));
                this.mThreads[i].start();
                i = i2;
            }
            this.mSuperpackArchive = getSuperpackArchive((InputStream) builder.rawArchives.get(0));
        } catch (Throwable th) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603017, 2);
            }
            throw th;
        }
    }

    public static Builder builder(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        return new Builder(dexManifest, lightweightQuickPerformanceLogger);
    }

    public static String getArchiveExtension(Builder builder) {
        C14600po r2 = builder.manifest.superpackExtension;
        if (r2 == C14600po.NONE) {
            return ".dex.spk.xz";
        }
        if (r2 == C14600po.OB) {
            return ".dex.spo";
        }
        if (r2 == C14600po.XZ) {
            return ".dex.spk.xz";
        }
        if (r2 == C14600po.ZST) {
            return ".dex.spk.zst";
        }
        StringBuilder sb = new StringBuilder("Unknown Superpack Archive Extension ");
        sb.append(r2);
        throw new RuntimeException(sb.toString());
    }

    /* access modifiers changed from: private */
    public SuperpackFile getNextFileFromSpk(SuperpackArchive superpackArchive) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603016);
        }
        try {
            return superpackArchive.next();
        } finally {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603016, 2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.superpack.SuperpackArchive getSuperpackArchive(java.io.InputStream r8) {
        /*
            r7 = this;
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r7.mQplCollector
            r4 = 34603015(0x2100007, float:1.0579457E-37)
            if (r0 == 0) goto L_0x000a
            r0.markerStart(r4)
        L_0x000a:
            r3 = 2
            X.0po r2 = r7.mArchiveExtension     // Catch:{ all -> 0x008d }
            X.0po r0 = X.C14600po.NONE     // Catch:{ all -> 0x008d }
            if (r2 != r0) goto L_0x002d
            com.facebook.xzdecoder.XzInputStream r6 = new com.facebook.xzdecoder.XzInputStream     // Catch:{ all -> 0x008d }
            r6.<init>(r8)     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "spk"
            r0 = 0
            long r0 = com.facebook.superpack.SuperpackArchive.readNative((java.io.InputStream) r6, (java.lang.String) r2, (long) r0)     // Catch:{ all -> 0x0028 }
            r2 = 0
            com.facebook.superpack.SuperpackArchive r5 = new com.facebook.superpack.SuperpackArchive     // Catch:{ all -> 0x0028 }
            r5.<init>(r0, r2)     // Catch:{ all -> 0x0028 }
            r6.close()     // Catch:{ all -> 0x008d }
            goto L_0x006e
        L_0x0028:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ all -> 0x008d }
        L_0x002d:
            X.0po r0 = X.C14600po.OB     // Catch:{ all -> 0x008d }
            if (r2 != r0) goto L_0x0043
            java.lang.String r2 = "spo"
            r8.getClass()     // Catch:{ all -> 0x008d }
            r0 = 0
            long r1 = com.facebook.superpack.SuperpackArchive.readNative((java.io.InputStream) r8, (java.lang.String) r2, (long) r0)     // Catch:{ all -> 0x008d }
            r0 = 0
            com.facebook.superpack.SuperpackArchive r5 = new com.facebook.superpack.SuperpackArchive     // Catch:{ all -> 0x008d }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x008d }
            goto L_0x006e
        L_0x0043:
            X.0po r0 = X.C14600po.XZ     // Catch:{ all -> 0x008d }
            if (r2 != r0) goto L_0x0059
            java.lang.String r2 = "xz"
            r8.getClass()     // Catch:{ all -> 0x008d }
            r0 = 0
            long r1 = com.facebook.superpack.SuperpackArchive.readNative((java.io.InputStream) r8, (java.lang.String) r2, (long) r0)     // Catch:{ all -> 0x008d }
            r0 = 0
            com.facebook.superpack.SuperpackArchive r5 = new com.facebook.superpack.SuperpackArchive     // Catch:{ all -> 0x008d }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x008d }
            goto L_0x006e
        L_0x0059:
            X.0po r0 = X.C14600po.ZST     // Catch:{ all -> 0x008d }
            if (r2 != r0) goto L_0x0076
            java.lang.String r2 = "zst"
            r8.getClass()     // Catch:{ all -> 0x008d }
            r0 = 0
            long r1 = com.facebook.superpack.SuperpackArchive.readNative((java.io.InputStream) r8, (java.lang.String) r2, (long) r0)     // Catch:{ all -> 0x008d }
            r0 = 0
            com.facebook.superpack.SuperpackArchive r5 = new com.facebook.superpack.SuperpackArchive     // Catch:{ all -> 0x008d }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x008d }
        L_0x006e:
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r7.mQplCollector
            if (r0 == 0) goto L_0x0075
            r0.markerEnd(r4, r3)
        L_0x0075:
            return r5
        L_0x0076:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            r1.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "Unknown Superpack Archive Extension "
            r1.append(r0)     // Catch:{ all -> 0x008d }
            r1.append(r2)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x008d }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x008d }
            r0.<init>(r1)     // Catch:{ all -> 0x008d }
            throw r0     // Catch:{ all -> 0x008d }
        L_0x008d:
            r1 = move-exception
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r7.mQplCollector
            if (r0 == 0) goto L_0x0095
            r0.markerEnd(r4, r3)
        L_0x0095:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.SuperpackInputDexIterator.getSuperpackArchive(java.io.InputStream):com.facebook.superpack.SuperpackArchive");
    }

    private void maybeCloseLastSuperpackFile() {
        SuperpackFile superpackFile = this.mSuperpackFileToClose;
        if (superpackFile != null) {
            superpackFile.close();
            this.mSuperpackFileToClose = null;
        }
    }

    private SuperpackFile nextSuperpackFile() {
        int[] iArr = this.mDexToArchiveMap;
        int i = this.mNextDexIndex;
        this.mNextDexIndex = i + 1;
        int i2 = iArr[i];
        if (i2 == 0) {
            return getNextFileFromSpk(this.mSuperpackArchive);
        }
        try {
            return (SuperpackFile) this.mFileQueues[i2 - 1].take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void setLastSuperpackFileToClose(SuperpackFile superpackFile) {
        if (this.mSuperpackFileToClose == null) {
            this.mSuperpackFileToClose = superpackFile;
            return;
        }
        throw new IllegalStateException();
    }

    public void close() {
        if (!this.mShuttingDownFlag) {
            this.mShuttingDownFlag = true;
            maybeCloseLastSuperpackFile();
            try {
                this.mSuperpackArchive.close();
                for (Thread thread : this.mThreads) {
                    thread.interrupt();
                    thread.join();
                }
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
                if (lightweightQuickPerformanceLogger != null) {
                    lightweightQuickPerformanceLogger.markerEnd(34603017, 2);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (Throwable th) {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
                if (lightweightQuickPerformanceLogger2 != null) {
                    lightweightQuickPerformanceLogger2.markerEnd(34603017, 2);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("Iterator already closed");
        }
    }

    public InputDex nextImpl(DexManifest.Dex dex) {
        IllegalStateException illegalStateException;
        String nameNative;
        String nameNative2;
        SuperpackFileInputStream superpackFileInputStream;
        maybeCloseLastSuperpackFile();
        SuperpackFile nextSuperpackFile = nextSuperpackFile();
        String str = dex.assetName;
        synchronized (nextSuperpackFile) {
            long j = nextSuperpackFile.mPtr;
            if (j != 0) {
                nameNative = SuperpackFile.getNameNative(j);
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        }
        if (str.equals(nameNative)) {
            setLastSuperpackFileToClose(nextSuperpackFile);
            synchronized (nextSuperpackFile) {
                if (nextSuperpackFile.mPtr != 0) {
                    superpackFileInputStream = new SuperpackFileInputStream(nextSuperpackFile);
                } else {
                    illegalStateException = new IllegalStateException();
                    throw illegalStateException;
                }
            }
            return new InputDex(dex, superpackFileInputStream);
        }
        String str2 = dex.assetName;
        synchronized (nextSuperpackFile) {
            long j2 = nextSuperpackFile.mPtr;
            if (j2 != 0) {
                nameNative2 = SuperpackFile.getNameNative(j2);
            } else {
                illegalStateException = new IllegalStateException();
                throw illegalStateException;
            }
        }
        throw new RuntimeException(AnonymousClass00U.A0d("Wrong dex, expected ", str2, ", got ", nameNative2));
    }

    private SuperpackFile applyPatch(SuperpackFile superpackFile) {
        return superpackFile;
    }
}
