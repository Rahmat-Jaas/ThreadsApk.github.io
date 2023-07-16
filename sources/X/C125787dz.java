package X;

import com.facebook.dcp.model.DcpContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7dz  reason: invalid class name and case insensitive filesystem */
public final class C125787dz implements C145188k1 {
    public final AnonymousClass68S A00;
    public final C121547Gq A01;
    public final String A02;
    public final List A03;

    public final AnonymousClass5Id ALA(DcpContext dcpContext) {
        C121547Gq r6 = this.A01;
        if (r6 != null) {
            C121547Gq.A01(this.A00, new AnonymousClass5KE((String) null, (DefaultConstructorMarker) null, 1), r6);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (C145188k1 r0 : this.A03) {
            AnonymousClass5Id ALA = r0.ALA(dcpContext);
            String id = r0.getId();
            boolean z = ALA.A02;
            if (r6 != null) {
                C121547Gq.A01(this.A00, C86134wK.A0N(AnonymousClass00U.A0L("extracted_", id), String.valueOf(z), 4, 1), r6);
            }
            if (z) {
                A0v.addAll((Collection) ALA.A00);
            }
        }
        if (r6 != null) {
            C121547Gq.A01(this.A00, new AnonymousClass5KF((DefaultConstructorMarker) null, 0, 1), r6);
        }
        return AnonymousClass5Id.A01(A0v, (String) null, true);
    }

    public final String getId() {
        return this.A02;
    }

    public C125787dz(AnonymousClass68S r1, C121547Gq r2, String str, List list) {
        this.A02 = str;
        this.A03 = list;
        this.A00 = r1;
        this.A01 = r2;
    }
}
