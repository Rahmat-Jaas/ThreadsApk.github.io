package X;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Unit;

/* renamed from: X.8Da  reason: invalid class name */
public final class AnonymousClass8Da extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ K8N A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Da(K8N k8n) {
        super(0);
        this.A00 = k8n;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4096);
            C04220Ms.A06(allocate);
            K8N k8n = this.A00;
            AnonymousClass668 r1 = k8n.A01;
            if (r1 != null) {
                int read = r1.read(allocate.array());
                while (read > 0) {
                    allocate.limit(read);
                    allocate.rewind();
                    k8n.A05.A08(k8n.A06, allocate);
                    k8n.A00++;
                    allocate.clear();
                    AnonymousClass668 r12 = k8n.A01;
                    if (r12 == null) {
                        break;
                    }
                    read = r12.read(allocate.array());
                }
            }
        } catch (IOException unused) {
        }
        return Unit.A00;
    }
}
