package com.facebook.common.dextricks;

import X.AnonymousClass00U;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class LogcatReader {
    public static final int DEFAULT_WAIT_TIME = 10000;
    public static final int GROUP_IDX_PID = 4;
    public static final int GROUP_IDX_TAG = 5;
    public static final int GROUP_IDX_TIMESTAMP = 1;
    public static final int GROUP_IDX_YEAR = 3;
    public static final Pattern LOGCAT_INFO_PARSER = Pattern.compile("^(((\\d{4})-)?\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3})\\s+(\\d+)\\s+\\d+\\s\\w\\s(\\w+)\\s:.*");
    public static final boolean MUST_PARSE_PID = false;
    public static final String TAG = "LogcatReader";
    public final String mTag;
    public final File mTmpDir;

    public static boolean shouldProcess(int i, String str, String str2) {
        if (str2 != null) {
            if (!MUST_PARSE_PID) {
                return true;
            }
            Matcher matcher = LOGCAT_INFO_PARSER.matcher(str2);
            if (matcher == null || !matcher.matches()) {
                String.format("Logcat line is not in the expected form. Line: %s", new Object[]{str2});
            } else {
                String group = matcher.group(4);
                if (matcher.group(5).equals(str)) {
                    try {
                        if (Integer.parseInt(group) == i) {
                            return true;
                        }
                    } catch (NumberFormatException e) {
                        Log.w(TAG, String.format("Could not process line since %s is not a number", new Object[]{group}), e);
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public abstract void processLine(String str);

    public abstract void reset();

    public final boolean readAndParseProcess(int i) {
        return readAndParseProcess(i, 10000);
    }

    public LogcatReader(String str, File file) {
        this.mTag = str;
        this.mTmpDir = file;
    }

    private boolean readAndParseProcessFile(int i, RandomAccessFile randomAccessFile) {
        String readProgramOutputFile = Fs.readProgramOutputFile(randomAccessFile);
        boolean z = false;
        if (readProgramOutputFile == null) {
            Log.w(TAG, "Cannot find logcat file to parse");
            return false;
        }
        BufferedReader bufferedReader = new BufferedReader(new StringReader(readProgramOutputFile));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (shouldProcess(i, this.mTag, readLine)) {
                    processLine(readLine);
                }
                z = true;
            } finally {
                bufferedReader.close();
            }
        }
        if (!z) {
            Log.w(TAG, AnonymousClass00U.A0L("Could not read out any logs. \n Read: ", readProgramOutputFile));
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean readAndParseProcess(int r12, int r13) {
        /*
            r11 = this;
            java.lang.String r5 = "LogcatReader"
            r11.reset()
            java.lang.String r1 = "-v"
            r10 = 0
            java.lang.String r0 = "threadtime"
            r3 = 1
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            java.lang.String r0 = "/system/bin/logcat"
            com.facebook.forker.ProcessBuilder r2 = new com.facebook.forker.ProcessBuilder
            r2.<init>(r0, r1)
            java.lang.String r0 = "-d"
            r2.addArgument(r0)
            boolean r0 = MUST_PARSE_PID
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "--pid="
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r12)
        L_0x0025:
            r2.addArgument(r0)
            java.lang.String r0 = r11.mTag
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%s:V"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r2.addArgument(r0)
            r4 = 0
            goto L_0x003c
        L_0x0039:
            java.lang.String r0 = "-s"
            goto L_0x0025
        L_0x003c:
            java.io.File r0 = r11.mTmpDir     // Catch:{ IOException | InterruptedException -> 0x00bf, all -> 0x00e2 }
            java.io.RandomAccessFile r6 = com.facebook.common.dextricks.Fs.openUnlinkedTemporaryFile(r0)     // Catch:{ IOException | InterruptedException -> 0x00bf, all -> 0x00e2 }
            java.io.FileDescriptor r0 = r6.getFD()     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            int r1 = com.facebook.forker.Fd.fileno(r0)     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            int[] r0 = r2.mStreamDispositions     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            r0[r3] = r1     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.String r1 = "Start executing logcat process: %s"
            java.lang.String r0 = r2.toString()     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.String.format(r1, r0)     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            com.facebook.forker.Process r4 = r2.create()     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.String r1 = "Start waiting for logcat %s process parsing"
            java.lang.String r0 = r11.mTag     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.String.format(r1, r0)     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            r0 = 4
            if (r13 <= 0) goto L_0x0076
            int r9 = r4.waitFor(r13, r0)     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            goto L_0x007a
        L_0x0076:
            int r9 = r4.waitFor()     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
        L_0x007a:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
            if (r9 != r0) goto L_0x0080
            r8 = 1
        L_0x0080:
            java.lang.String r7 = "Finished waiting (%d ms) for logcat %s process parsing . Status %d - %s"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            long r0 = r0 - r2
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.String r2 = r11.mTag     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            if (r8 == 0) goto L_0x009d
            java.lang.String r0 = "Timed out"
        L_0x0095:
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r2, r1, r0}     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.String.format(r7, r0)     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            goto L_0x00a0
        L_0x009d:
            java.lang.String r0 = "Did not timeout"
            goto L_0x0095
        L_0x00a0:
            if (r8 == 0) goto L_0x00b2
            java.lang.String r1 = "Failed to run logcat for %s because we timed out"
            java.lang.String r0 = r11.mTag     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            android.util.Log.w(r5, r0)     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            goto L_0x00d9
        L_0x00b2:
            boolean r10 = r11.readAndParseProcessFile(r12, r6)     // Catch:{ IOException | InterruptedException -> 0x00bb, all -> 0x00b7 }
            goto L_0x00d9
        L_0x00b7:
            r0 = move-exception
            r2 = r4
            r4 = r6
            goto L_0x00e4
        L_0x00bb:
            r3 = move-exception
            r2 = r4
            r4 = r6
            goto L_0x00c1
        L_0x00bf:
            r3 = move-exception
            r2 = r4
        L_0x00c1:
            java.lang.String r1 = "Failed to run logcat for tag %s"
            java.lang.String r0 = r11.mTag     // Catch:{ all -> 0x00e0 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x00e0 }
            android.util.Log.w(r5, r0, r3)     // Catch:{ all -> 0x00e0 }
            com.facebook.common.dextricks.Fs.safeClose((java.io.Closeable) r4)
            if (r2 == 0) goto L_0x00df
            r2.destroy()
            return r10
        L_0x00d9:
            com.facebook.common.dextricks.Fs.safeClose((java.io.Closeable) r6)
            r4.destroy()
        L_0x00df:
            return r10
        L_0x00e0:
            r0 = move-exception
            goto L_0x00e4
        L_0x00e2:
            r0 = move-exception
            r2 = r4
        L_0x00e4:
            com.facebook.common.dextricks.Fs.safeClose((java.io.Closeable) r4)
            if (r2 == 0) goto L_0x00ec
            r2.destroy()
        L_0x00ec:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.LogcatReader.readAndParseProcess(int, int):boolean");
    }
}
