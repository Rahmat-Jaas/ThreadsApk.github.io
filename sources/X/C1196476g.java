package X;

import android.content.Context;
import android.content.ServiceConnection;
import com.google.ar.core.dependencies.g;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.76g  reason: invalid class name and case insensitive filesystem */
public final class C1196476g {
    public Context A00;
    public g A01;
    public final ServiceConnection A02;
    public final Queue A03;
    public volatile int A04;

    public C1196476g() {
    }

    public C1196476g(byte[] bArr) {
        this.A03 = new ArrayDeque();
        this.A04 = 1;
        this.A02 = new AnonymousClass7Lv(this);
    }
}
