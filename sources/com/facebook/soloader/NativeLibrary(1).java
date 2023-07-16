package com.facebook.soloader;

import X.C15020qa;
import android.util.Log;
import java.util.List;

public abstract class NativeLibrary {
    public Boolean A00 = true;
    public List A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile UnsatisfiedLinkError A04 = null;

    public final boolean A01() {
        boolean z;
        synchronized (this.A03) {
            if (!this.A00.booleanValue()) {
                z = this.A02;
            } else {
                try {
                    List<String> list = this.A01;
                    if (list != null) {
                        for (String A0A : list) {
                            C15020qa.A0A(A0A);
                        }
                    }
                    this.A02 = true;
                    z = true;
                    this.A01 = null;
                } catch (UnsatisfiedLinkError e) {
                    Log.e("com.facebook.soloader.NativeLibrary", "Failed to load native lib (initial check): ", e);
                    this.A04 = e;
                    this.A02 = false;
                    z = false;
                    this.A00 = false;
                    return z;
                } catch (Throwable th) {
                    Log.e("com.facebook.soloader.NativeLibrary", "Failed to load native lib (other error): ", th);
                    this.A04 = new UnsatisfiedLinkError("Failed loading libraries");
                    this.A04.initCause(th);
                    this.A02 = false;
                    z = false;
                    this.A00 = false;
                    return z;
                }
                this.A00 = false;
            }
        }
        return z;
    }

    public NativeLibrary(List list) {
        this.A01 = list;
    }

    public final void A00() {
        if (!A01()) {
            throw this.A04;
        }
    }
}
