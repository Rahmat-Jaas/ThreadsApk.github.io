package com.facebook.superpack;

import X.C15020qa;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SuperpackArchive implements Iterator, Closeable {
    public static final String TAG = "SuperpackArchive";
    public int mDecompressedFiles = 0;
    public long mPtr;

    public static native void appendAnonNative(long j, long j2);

    public static native void appendNative(long j, long j2);

    public static native void closeNative(long j);

    public static native long createNative();

    public static native long extractNextNative(long j, String[] strArr);

    public static native long getThreadNumOption(int i);

    public static native boolean isEmptyNative(long j);

    public static native long[] nextMemfdNative(long j, String str);

    public static native long nextNative(long j);

    public static native long readNative(InputStream inputStream, String str, long j);

    public static native long readNative(String str, String str2, long j);

    public static native void setPackingOptionsNative(long j, boolean z, boolean z2);

    public static native void setStorageNative(long j, String str, int i);

    public static native void writeNative(long j, OutputStream outputStream);

    public synchronized void close() {
        long j = this.mPtr;
        if (j != 0) {
            closeNative(j);
            this.mPtr = 0;
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean hasNext() {
        boolean isEmptyNative;
        synchronized (this) {
            long j = this.mPtr;
            if (j != 0) {
                isEmptyNative = isEmptyNative(j);
            } else {
                throw new IllegalStateException();
            }
        }
        return !isEmptyNative;
    }

    public synchronized SuperpackFile next() {
        Throwable th;
        long nextNative;
        long j = this.mPtr;
        if (j != 0) {
            nextNative = nextNative(j);
            if (nextNative != 0) {
                this.mDecompressedFiles++;
            } else {
                th = new NoSuchElementException();
            }
        } else {
            th = new IllegalStateException();
        }
        throw th;
        return new SuperpackFile(nextNative, -1);
    }

    static {
        C15020qa.A0A("superpack-jni");
    }

    public void finalize() {
        long j = this.mPtr;
        if (j != 0) {
            closeNative(j);
            this.mPtr = 0;
            throw new IllegalStateException();
        }
    }

    public SuperpackArchive(long j, String[] strArr) {
        if (j != 0) {
            this.mPtr = j;
            return;
        }
        throw new IllegalArgumentException();
    }
}
