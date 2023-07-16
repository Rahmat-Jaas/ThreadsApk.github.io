package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Dp  reason: invalid class name and case insensitive filesystem */
public final class C02970Dp implements AnonymousClass0Wh {
    public int A00 = 9000;
    public Set A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public final C05890Wv A05;
    public final String A06;
    public final List A07 = new ArrayList();
    public final ReadWriteLock A08 = new ReentrantReadWriteLock(true);

    public C02970Dp(C05890Wv r3) {
        this.A05 = r3;
        String str = AnonymousClass0KY.A00().A01;
        this.A06 = str == null ? "unknown" : str;
    }
}
