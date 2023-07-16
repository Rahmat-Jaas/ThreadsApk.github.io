package X;

import java.util.Map;

/* renamed from: X.0l5  reason: invalid class name and case insensitive filesystem */
public final class C11960l5 extends AnonymousClass0gG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0g3 A01;
    public final /* synthetic */ StringBuilder A02;

    public final void run() {
        int i = this.A00;
        StringBuilder sb = this.A02;
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
            if (((Thread) next.getKey()).getName().startsWith("IgExecutorV2 #")) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(((Thread) next.getKey()).getName());
                sb2.append("\n");
                for (StackTraceElement obj : (StackTraceElement[]) next.getValue()) {
                    sb2.append(obj.toString());
                    sb2.append("\n");
                }
            }
        }
        String obj2 = sb2.toString();
        AnonymousClass0k2 r1 = AnonymousClass0g5.A00;
        if (r1 != null) {
            r1.A01(i, sb.toString(), obj2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11960l5(AnonymousClass0g3 r2, StringBuilder sb, int i) {
        super(1862274429);
        this.A01 = r2;
        this.A00 = i;
        this.A02 = sb;
    }
}
