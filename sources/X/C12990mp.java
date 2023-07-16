package X;

import java.net.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.0mp  reason: invalid class name and case insensitive filesystem */
public final class C12990mp {
    public Proxy A00;
    public final C16730te A01 = new C16730te(new C14760q6());
    public final ExecutorService A02 = Executors.newFixedThreadPool(2);
    public final SSLSocketFactory A03 = ((SSLSocketFactory) SSLSocketFactory.getDefault());
}
