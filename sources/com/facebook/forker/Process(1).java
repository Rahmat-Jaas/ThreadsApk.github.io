package com.facebook.forker;

import X.AnonymousClass00U;
import X.C15020qa;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class Process extends Process implements Closeable {
    public static final int FD_STREAM_INPUT = 0;
    public static final int FD_STREAM_OUTPUT = 1;
    public static final int IGNORE_FD = -1;
    public static final int SD_BLACK_HOLE = -3;
    public static final int SD_INHERIT = -2;
    public static final int SD_PIPE = -4;
    public static final int SD_STDOUT = -5;
    public static final int SIGCONT = 18;
    public static final int SIGKILL = 9;
    public static final int SIGSTOP = 19;
    public static final int SIGTERM = 15;
    public static final int SIGTSTP = 20;
    public static final int STATUS_EXITED = 4;
    public static final int STATUS_RUNNING = 1;
    public static final int STATUS_STOPPED = 2;
    public static final int STDERR = 2;
    public static final int STDIN = 0;
    public static final int STDOUT = 1;
    public static final String TAG = "fb-Process";
    public static final int WAIT_RESULT_RUNNING = -2147483646;
    public static final int WAIT_RESULT_STOPPED = -2147483647;
    public static final int WAIT_RESULT_TIMEOUT = Integer.MIN_VALUE;
    public InputStream mChildStderr;
    public OutputStream mChildStdin;
    public InputStream mChildStdout;
    public int mExitStatus;
    public int mPid = -1;
    public int mProcessStatus;
    public WaiterThread mWaiterThread = new WaiterThread();

    public final class WaiterThread extends Thread {
        public WaiterThread() {
            super("PidWaiter:Ready");
        }

        public void run() {
            Process.this.nativeWait();
        }
    }

    private native void nativeKill(int i);

    private native int nativeLaunch(String str, String[] strArr, byte[] bArr, int[] iArr, int[] iArr2);

    public static native void nativeUnixClose(int i);

    public static native int nativeUnixCreateTmpFile(String str);

    public static native int nativeUnixOpen(String str);

    public static native int[] nativeUnixPipe(int[] iArr);

    /* access modifiers changed from: private */
    public native void nativeWait();

    public synchronized int exitValueEx() {
        if (this.mProcessStatus == 4) {
        } else {
            throw new IllegalThreadStateException(AnonymousClass00U.A0J("Process has not yet terminated: ", this.mPid));
        }
        return this.mExitStatus;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int waitFor(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            r1 = 0
        L_0x0003:
            int r4 = r7.mProcessStatus     // Catch:{ all -> 0x005b }
            r0 = r4 & r9
            r3 = 4
            if (r0 != 0) goto L_0x0032
            if (r4 == r3) goto L_0x002f
            if (r8 == 0) goto L_0x0057
            if (r8 <= 0) goto L_0x002b
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005b }
            long r3 = (long) r8     // Catch:{ all -> 0x005b }
            r7.wait(r3)     // Catch:{ all -> 0x005b }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005b }
            long r3 = r3 - r5
            long r3 = java.lang.Math.max(r1, r3)     // Catch:{ all -> 0x005b }
            long r5 = (long) r8     // Catch:{ all -> 0x005b }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0028
            r8 = 0
            goto L_0x0003
        L_0x0028:
            int r0 = (int) r3     // Catch:{ all -> 0x005b }
            int r8 = r8 - r0
            goto L_0x0003
        L_0x002b:
            r7.wait()     // Catch:{ all -> 0x005b }
            goto L_0x0003
        L_0x002f:
            if (r8 == 0) goto L_0x0057
            goto L_0x0043
        L_0x0032:
            r0 = 1
            if (r4 == r0) goto L_0x0053
            r0 = 2
            if (r4 == r0) goto L_0x004f
            if (r4 != r3) goto L_0x003d
            int r0 = r7.mExitStatus     // Catch:{ all -> 0x005b }
            goto L_0x0059
        L_0x003d:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x005b }
            r0.<init>()     // Catch:{ all -> 0x005b }
            goto L_0x004e
        L_0x0043:
            java.lang.String r0 = "process entered unexpected state "
            java.lang.String r1 = X.AnonymousClass00U.A0J(r0, r3)     // Catch:{ all -> 0x005b }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005b }
            r0.<init>(r1)     // Catch:{ all -> 0x005b }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x005b }
        L_0x004f:
            r0 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            goto L_0x0059
        L_0x0053:
            r0 = -2147483646(0xffffffff80000002, float:-2.8E-45)
            goto L_0x0059
        L_0x0057:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0059:
            monitor-exit(r7)
            return r0
        L_0x005b:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.waitFor(int, int):int");
    }

    static {
        C15020qa.A0A("forker");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Process(java.lang.String r18, java.lang.String[] r19, byte[] r20, int[] r21, int[] r22, java.io.File r23) {
        /*
            r17 = this;
            r11 = r17
            r11.<init>()
            r2 = -1
            r11.mPid = r2
            com.facebook.forker.Process$WaiterThread r0 = new com.facebook.forker.Process$WaiterThread
            r0.<init>()
            r11.mWaiterThread = r0
            r9 = 6
            int[] r4 = new int[r9]     // Catch:{ all -> 0x00f5 }
            r1 = 0
            r0 = 0
        L_0x0014:
            r4[r0] = r2     // Catch:{ all -> 0x00f3 }
            int r0 = r0 + 1
            if (r0 < r9) goto L_0x0014
            r6 = 0
        L_0x001b:
            r7 = 2
            r8 = 1
            if (r6 >= r9) goto L_0x003d
            int[] r0 = new int[r7]     // Catch:{ all -> 0x00f3 }
            int[] r5 = nativeUnixPipe(r0)     // Catch:{ all -> 0x00f3 }
            if (r6 != 0) goto L_0x0030
            r0 = r5[r8]     // Catch:{ all -> 0x00f3 }
            r4[r1] = r0     // Catch:{ all -> 0x00f3 }
            r0 = r5[r1]     // Catch:{ all -> 0x00f3 }
            r4[r8] = r0     // Catch:{ all -> 0x00f3 }
            goto L_0x003a
        L_0x0030:
            r0 = r5[r1]     // Catch:{ all -> 0x00f3 }
            r4[r6] = r0     // Catch:{ all -> 0x00f3 }
            int r3 = r6 + 1
            r0 = r5[r8]     // Catch:{ all -> 0x00f3 }
            r4[r3] = r0     // Catch:{ all -> 0x00f3 }
        L_0x003a:
            int r6 = r6 + 2
            goto L_0x001b
        L_0x003d:
            int[] r15 = new int[r9]     // Catch:{ all -> 0x00f3 }
            r6 = 0
            r3 = -1
        L_0x0041:
            r10 = -5
            r9 = 3
            if (r6 >= r9) goto L_0x00a0
            r5 = r22[r6]     // Catch:{ all -> 0x00f9 }
            if (r5 == r10) goto L_0x0073
            r0 = -4
            if (r5 == r0) goto L_0x0075
            r0 = -3
            if (r5 == r0) goto L_0x0059
            r0 = -2
            if (r5 == r0) goto L_0x0073
            r0 = r22[r6]     // Catch:{ all -> 0x00f9 }
            if (r0 < 0) goto L_0x0086
            r5 = r22[r6]     // Catch:{ all -> 0x00f9 }
            goto L_0x007b
        L_0x0059:
            if (r3 != r2) goto L_0x0061
            java.lang.String r0 = "/dev/null"
            int r3 = nativeUnixOpen(r0)     // Catch:{ all -> 0x00f9 }
        L_0x0061:
            if (r3 != r2) goto L_0x006e
            if (r23 == 0) goto L_0x0071
            java.lang.String r0 = r23.getCanonicalPath()     // Catch:{ all -> 0x00f9 }
            int r5 = nativeUnixCreateTmpFile(r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x006f
        L_0x006e:
            r5 = r3
        L_0x006f:
            if (r5 != r2) goto L_0x007b
        L_0x0071:
            r5 = -1
            goto L_0x007b
        L_0x0073:
            r5 = r6
            goto L_0x007b
        L_0x0075:
            int r0 = r6 << 1
            int r0 = r0 + 1
            r5 = r4[r0]     // Catch:{ all -> 0x00f9 }
        L_0x007b:
            int r0 = r6 << 1
            r15[r0] = r5     // Catch:{ all -> 0x00f9 }
            int r0 = r0 + 1
            r15[r0] = r6     // Catch:{ all -> 0x00f9 }
            int r6 = r6 + 1
            goto L_0x0041
        L_0x0086:
            java.lang.String r5 = "illegal stream disposition %s for fd %s"
            r0 = r22[r6]     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00f9 }
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = java.lang.String.format(r5, r0)     // Catch:{ all -> 0x00f9 }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00f9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f9 }
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00a0:
            r6 = 0
        L_0x00a1:
            r0 = r22[r6]     // Catch:{ all -> 0x00f9 }
            if (r0 != r10) goto L_0x00ab
            int r5 = r6 << 1
            r0 = r15[r7]     // Catch:{ all -> 0x00f9 }
            r15[r5] = r0     // Catch:{ all -> 0x00f9 }
        L_0x00ab:
            int r6 = r6 + 1
            if (r6 < r9) goto L_0x00a1
            r12 = r18
            r13 = r19
            r14 = r20
            r16 = r21
            int r6 = r11.nativeLaunch(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00f9 }
            r11.mPid = r6     // Catch:{ all -> 0x00f9 }
            com.facebook.forker.Process$WaiterThread r5 = r11.mWaiterThread     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "PidWaiter:"
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r6)     // Catch:{ all -> 0x00f9 }
            r5.setName(r0)     // Catch:{ all -> 0x00f9 }
            r0 = r4[r1]     // Catch:{ all -> 0x00f9 }
            java.lang.Object r0 = openFdStream(r0, r8)     // Catch:{ all -> 0x00f9 }
            java.io.OutputStream r0 = (java.io.OutputStream) r0     // Catch:{ all -> 0x00f9 }
            r11.mChildStdin = r0     // Catch:{ all -> 0x00f9 }
            r0 = r4[r7]     // Catch:{ all -> 0x00f9 }
            java.lang.Object r0 = openFdStream(r0, r1)     // Catch:{ all -> 0x00f9 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x00f9 }
            r11.mChildStdout = r0     // Catch:{ all -> 0x00f9 }
            r0 = 4
            r0 = r4[r0]     // Catch:{ all -> 0x00f9 }
            java.lang.Object r0 = openFdStream(r0, r1)     // Catch:{ all -> 0x00f9 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x00f9 }
            r11.mChildStderr = r0     // Catch:{ all -> 0x00f9 }
            com.facebook.forker.Process$WaiterThread r0 = r11.mWaiterThread     // Catch:{ all -> 0x00f9 }
            r0.start()     // Catch:{ all -> 0x00f9 }
            unixClose((int) r3)
            unixClose((int[]) r4)
            return
        L_0x00f3:
            r1 = move-exception
            goto L_0x00f7
        L_0x00f5:
            r1 = move-exception
            r4 = 0
        L_0x00f7:
            r3 = -1
            goto L_0x00fa
        L_0x00f9:
            r1 = move-exception
        L_0x00fa:
            unixClose((int) r3)
            unixClose((int[]) r4)
            java.io.OutputStream r0 = r11.mChildStdin
            safeClose(r0)
            java.io.InputStream r0 = r11.mChildStdout
            safeClose(r0)
            java.io.InputStream r0 = r11.mChildStderr
            safeClose(r0)
            int r0 = r11.mPid
            if (r0 == r2) goto L_0x011b
            r0 = 9
            r11.nativeKill(r0)
            r11.nativeWait()
        L_0x011b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.<init>(java.lang.String, java.lang.String[], byte[], int[], int[], java.io.File):void");
    }

    public static String describeStatus(int i) {
        StringBuilder sb;
        if (i < 0) {
            sb = new StringBuilder("killed by signal ");
            i = -i;
        } else if (i <= 0) {
            return "exited successfully";
        } else {
            sb = new StringBuilder("exited with status ");
        }
        sb.append(i);
        return sb.toString();
    }

    public static String fdMagicName(int i) {
        return AnonymousClass00U.A0b("/proc/", "/task/", "/fd/", android.os.Process.myPid(), android.os.Process.myTid(), i);
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void unixClose(int[] iArr) {
        if (iArr != null) {
            for (int unixClose : iArr) {
                unixClose(unixClose);
            }
        }
    }

    public void destroy() {
        nativeKill(9);
        boolean z = false;
        while (true) {
            try {
                this.mWaiterThread.join();
                break;
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
        }
        synchronized (this) {
            safeClose(this.mChildStdin);
            safeClose(this.mChildStdout);
            safeClose(this.mChildStderr);
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public int waitForUninterruptibly(int i, int i2) {
        long j = 0;
        boolean z = false;
        int i3 = WAIT_RESULT_TIMEOUT;
        while (true) {
            if (i > 0) {
                j = System.currentTimeMillis();
            }
            try {
                i3 = waitFor(i, i2);
                if (i3 != Integer.MIN_VALUE) {
                    break;
                }
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
            if (i > 0) {
                long max = Math.max(0, System.currentTimeMillis() - j);
                if (((long) i) < max) {
                    break;
                }
                i -= (int) max;
                continue;
            }
            if (i == 0) {
                break;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i3;
    }

    public static Object openFdStream(int i, int i2) {
        String fdMagicName = fdMagicName(i);
        if (i2 != 0) {
            return new FileOutputStream(fdMagicName);
        }
        try {
            return new FileInputStream(fdMagicName);
        } catch (FileNotFoundException unused) {
            ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(i);
            if (i2 == 0) {
                return new ParcelFileDescriptor.AutoCloseInputStream(fromFd);
            }
            return new ParcelFileDescriptor.AutoCloseOutputStream(fromFd);
        }
    }

    public void close() {
        destroy();
    }

    public int exitValue() {
        int exitValueEx = exitValueEx();
        if (exitValueEx < 0) {
            return (-exitValueEx) + 128;
        }
        return exitValueEx;
    }

    public InputStream getErrorStream() {
        return this.mChildStderr;
    }

    public InputStream getInputStream() {
        return this.mChildStdout;
    }

    public OutputStream getOutputStream() {
        return this.mChildStdin;
    }

    public int getPid() {
        return this.mPid;
    }

    public void kill(int i) {
        nativeKill(i);
    }

    public static void unixClose(int i) {
        if (i != -1) {
            nativeUnixClose(i);
        }
    }

    public synchronized int waitFor() {
        while (this.mProcessStatus != 4) {
            wait();
        }
        return exitValue();
    }

    public int waitForUninterruptibly() {
        int waitFor;
        boolean z = false;
        while (true) {
            try {
                waitFor = waitFor();
                break;
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return waitFor;
    }
}
