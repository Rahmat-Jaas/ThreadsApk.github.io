package X;

import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.802  reason: invalid class name */
public final /* synthetic */ class AnonymousClass802 implements Runnable {
    public final /* synthetic */ StellaIpcDirectMessagingServiceClient A00;

    public /* synthetic */ AnonymousClass802(StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient) {
        this.A00 = stellaIpcDirectMessagingServiceClient;
    }

    public final void run() {
        this.A00.disconnect();
    }
}
