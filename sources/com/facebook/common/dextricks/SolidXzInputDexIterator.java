package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import X.C14400pL;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.xzdecoder.XzInputStream;
import java.io.Closeable;
import java.io.InputStream;

public final class SolidXzInputDexIterator extends InputDexIterator {
    public boolean mConsumingStream;
    public SliceInputStream mLastPartIs;
    public final ResProvider mResProvider;
    public final XzInputStream mXzs;

    public final class SliceInputStream extends InputStream {
        public int mBytesRead = 0;
        public int mBytesToRead;

        public SliceInputStream(int i) {
            this.mBytesToRead = i;
            SolidXzInputDexIterator.this.mConsumingStream = true;
        }

        public int available() {
            return this.mBytesToRead - this.mBytesRead;
        }

        public void close() {
            SolidXzInputDexIterator.this.mConsumingStream = false;
        }

        public int read(byte[] bArr, int i, int i2) {
            if (i2 > 0 && this.mBytesRead == this.mBytesToRead) {
                return -1;
            }
            int read = SolidXzInputDexIterator.this.mXzs.read(bArr, i, Math.min(i2, this.mBytesToRead - this.mBytesRead));
            if (read <= 0) {
                return read;
            }
            this.mBytesRead += read;
            return read;
        }

        public int read() {
            if (this.mBytesRead == this.mBytesToRead) {
                return -1;
            }
            int read = SolidXzInputDexIterator.this.mXzs.read();
            if (read != -1) {
                this.mBytesRead++;
                return read;
            }
            throw new RuntimeException("truncated xzs stream");
        }
    }

    public InputDex nextImpl(DexManifest.Dex dex) {
        if (!this.mConsumingStream) {
            SliceInputStream sliceInputStream = this.mLastPartIs;
            if (sliceInputStream != null) {
                int i = sliceInputStream.mBytesToRead - sliceInputStream.mBytesRead;
                if (i > 0) {
                    Fs.discardFromInputStream(sliceInputStream, (long) i);
                }
                this.mLastPartIs = null;
            }
            SliceInputStream sliceInputStream2 = new SliceInputStream(getJarFileSizeFromMeta(this.mResProvider, AnonymousClass00U.A0L(dex.assetName, ".meta")));
            this.mLastPartIs = sliceInputStream2;
            return new InputDex(dex, sliceInputStream2);
        }
        throw new RuntimeException("previous InputDex not closed");
    }

    public SolidXzInputDexIterator(DexManifest dexManifest, C14400pL r3, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ResProvider resProvider, InputStream inputStream) {
        super(dexManifest, r3, lightweightQuickPerformanceLogger);
        this.mResProvider = resProvider;
        this.mQplCollector = lightweightQuickPerformanceLogger;
        this.mXzs = new XzInputStream(inputStream);
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603012);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getJarFileSizeFromMeta(com.facebook.common.dextricks.ResProvider r7, java.lang.String r8) {
        /*
            r6 = this;
            java.io.InputStream r5 = r7.open(r8)
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0043 }
            r4.<init>(r5)     // Catch:{ all -> 0x0043 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x003e }
            r3.<init>(r4)     // Catch:{ all -> 0x003e }
            java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0039 }
            r1 = 0
            r0 = 32
            int r0 = r2.indexOf(r0)     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = r2.substring(r1, r0)     // Catch:{ all -> 0x0039 }
            r0 = 58
            int r0 = r1.indexOf(r0)     // Catch:{ all -> 0x0039 }
            int r0 = r0 + 1
            java.lang.String r0 = r1.substring(r0)     // Catch:{ all -> 0x0039 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0039 }
            r3.close()     // Catch:{ all -> 0x003e }
            r4.close()     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x0038
            r5.close()
        L_0x0038:
            return r0
        L_0x0039:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            if (r5 == 0) goto L_0x0049
            r5.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.SolidXzInputDexIterator.getJarFileSizeFromMeta(com.facebook.common.dextricks.ResProvider, java.lang.String):int");
    }

    public void close() {
        super.close();
        try {
            Fs.safeClose((Closeable) this.mXzs);
        } finally {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
            if (lightweightQuickPerformanceLogger != null) {
                lightweightQuickPerformanceLogger.markerEnd(34603012, 2);
            }
        }
    }
}
