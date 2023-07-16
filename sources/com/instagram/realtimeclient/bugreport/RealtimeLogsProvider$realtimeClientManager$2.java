package com.instagram.realtimeclient.bugreport;

import X.AnonymousClass0ZU;
import X.C02220Ah;
import com.instagram.realtimeclient.RealtimeClientManager;

public final class RealtimeLogsProvider$realtimeClientManager$2 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ RealtimeLogsProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealtimeLogsProvider$realtimeClientManager$2(RealtimeLogsProvider realtimeLogsProvider) {
        super(0);
        this.this$0 = realtimeLogsProvider;
    }

    public final RealtimeClientManager invoke() {
        return (RealtimeClientManager) this.this$0.realtimeClientManagerProvider.get();
    }
}
